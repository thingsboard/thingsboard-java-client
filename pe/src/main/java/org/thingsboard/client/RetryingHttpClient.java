/**
 * Copyright © 2026-2026 ThingsBoard, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.client;

import lombok.extern.java.Log;

import java.io.IOException;
import java.net.Authenticator;
import java.net.CookieHandler;
import java.net.ProxySelector;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;

/**
 * An {@link HttpClient} wrapper that automatically retries requests that receive a retriable
 * HTTP status code (429 Too Many Requests by default) using exponential backoff with jitter.
 *
 * <p>The {@code Retry-After} response header is honoured when present: if it contains a
 * non-negative integer, that number of seconds is used as the retry delay (capped to
 * {@code maxDelayMs}).
 *
 * <p>After exhausting all retry attempts the final (still-retriable) response is returned to the
 * caller so that the upstream code (e.g. {@code ThingsboardApi}) can throw an
 * {@link ApiException} with the correct HTTP status code.
 *
 * <p>Obtain an instance via the static factory:
 * <pre>{@code
 * RetryingHttpClient client = RetryingHttpClient.wrap(HttpClient.newHttpClient(), 3, 1000L, 30_000L);
 * }</pre>
 */
@Log
public class RetryingHttpClient extends HttpClient {

    private final HttpClient delegate;
    private final int maxRetries;
    private final long initialDelayMs;
    private final long maxDelayMs;
    private final Random random = new Random();

    private RetryingHttpClient(HttpClient delegate, int maxRetries, long initialDelayMs, long maxDelayMs) {
        this.delegate = delegate;
        this.maxRetries = maxRetries;
        this.initialDelayMs = initialDelayMs;
        this.maxDelayMs = maxDelayMs;
    }

    /**
     * Creates a new {@code RetryingHttpClient} that wraps the given delegate.
     *
     * @param delegate       the underlying {@link HttpClient} to delegate to
     * @param maxRetries     maximum number of retry attempts (not counting the initial request)
     * @param initialDelayMs initial backoff delay in milliseconds
     * @param maxDelayMs     maximum backoff delay in milliseconds
     * @return a new {@code RetryingHttpClient}
     */
    public static RetryingHttpClient wrap(HttpClient delegate, int maxRetries, long initialDelayMs, long maxDelayMs) {
        return new RetryingHttpClient(delegate, maxRetries, initialDelayMs, maxDelayMs);
    }

    /**
     * Returns {@code true} if the given status code should trigger a retry.
     * Override in subclasses to add additional retriable status codes.
     *
     * @param statusCode the HTTP response status code
     * @return {@code true} for retriable status codes (429 by default)
     */
    protected boolean isRetriable(int statusCode) {
        return statusCode == 429;
    }

    @Override
    public <T> HttpResponse<T> send(HttpRequest request, HttpResponse.BodyHandler<T> responseBodyHandler)
            throws IOException, InterruptedException {
        HttpResponse<T> response = delegate.send(request, responseBodyHandler);

        if (!isRetriable(response.statusCode())) {
            return response;
        }

        for (int attempt = 1; attempt <= maxRetries; attempt++) {
            long delayMs = computeDelay(response, attempt);
            log.log(Level.WARNING, "HTTP {0} received, retrying in {1}ms (attempt {2}/{3})",
                    new Object[]{response.statusCode(), delayMs, attempt, maxRetries});
            closeBody(response);
            Thread.sleep(delayMs);

            response = delegate.send(request, responseBodyHandler);
            if (!isRetriable(response.statusCode())) {
                return response;
            }
        }

        // Exhausted retries — return the last response so the caller can throw ApiException
        return response;
    }

    @Override
    public <T> CompletableFuture<HttpResponse<T>> sendAsync(
            HttpRequest request, HttpResponse.BodyHandler<T> responseBodyHandler) {
        return sendAsyncWithRetry(request, responseBodyHandler, 1);
    }

    // Push-promise variant delegates without retry: server-push semantics are incompatible
    // with request-level retry, and this overload is not used by the generated API code.
    @Override
    public <T> CompletableFuture<HttpResponse<T>> sendAsync(
            HttpRequest request,
            HttpResponse.BodyHandler<T> responseBodyHandler,
            HttpResponse.PushPromiseHandler<T> pushPromiseHandler) {
        return delegate.sendAsync(request, responseBodyHandler, pushPromiseHandler);
    }

    private <T> CompletableFuture<HttpResponse<T>> sendAsyncWithRetry(
            HttpRequest request, HttpResponse.BodyHandler<T> responseBodyHandler, int attempt) {
        return delegate.sendAsync(request, responseBodyHandler).thenCompose(response -> {
            if (!isRetriable(response.statusCode()) || attempt > maxRetries) {
                return CompletableFuture.completedFuture(response);
            }
            long delayMs = computeDelay(response, attempt);
            log.log(Level.WARNING, "HTTP {0} received, retrying in {1}ms (attempt {2}/{3})",
                    new Object[]{response.statusCode(), delayMs, attempt, maxRetries});
            closeBody(response);
            Executor delayedExecutor = CompletableFuture.delayedExecutor(
                    delayMs, java.util.concurrent.TimeUnit.MILLISECONDS);
            return CompletableFuture.supplyAsync(() -> null, delayedExecutor)
                    .thenCompose(ignored -> sendAsyncWithRetry(request, responseBodyHandler, attempt + 1));
        });
    }

    /**
     * Closes the response body if it is {@link AutoCloseable} (e.g. {@code InputStream}-backed responses)
     * to free the underlying connection before retrying.
     */
    private static <T> void closeBody(HttpResponse<T> response) {
        if (response.body() instanceof AutoCloseable c) {
            try {
                c.close();
            } catch (Exception ignored) {
            }
        }
    }

    /**
     * Computes the delay in milliseconds before the next retry attempt.
     * Honours the {@code Retry-After} header when present (integer seconds, non-negative).
     * Falls back to exponential backoff with ±20% jitter.
     */
    private <T> long computeDelay(HttpResponse<T> response, int attempt) {
        Optional<String> retryAfter = response.headers().firstValue("Retry-After");
        if (retryAfter.isPresent()) {
            try {
                long seconds = Long.parseLong(retryAfter.get().trim());
                if (seconds >= 0) {
                    return Math.min(seconds * 1000L, maxDelayMs);
                }
            } catch (NumberFormatException ignored) {
                // Not an integer — fall through to exponential backoff
            }
        }
        // Exponential backoff: initialDelayMs * 2^(attempt-1), capped at maxDelayMs
        int shift = Math.min(attempt - 1, 30); // prevent long overflow on large attempt values
        long base = Math.min(initialDelayMs * (1L << shift), maxDelayMs);
        // ±20% jitter, clamped so maxDelayMs remains a hard ceiling
        double jitter = (random.nextDouble() * 0.4) - 0.2; // range [-0.2, 0.2]
        return Math.min(maxDelayMs, Math.max(0, Math.round(base * (1.0 + jitter))));
    }

    // -------------------------------------------------------------------------
    // Delegation of all remaining abstract HttpClient methods
    // -------------------------------------------------------------------------

    @Override
    public Optional<CookieHandler> cookieHandler() {
        return delegate.cookieHandler();
    }

    @Override
    public Optional<Duration> connectTimeout() {
        return delegate.connectTimeout();
    }

    @Override
    public Redirect followRedirects() {
        return delegate.followRedirects();
    }

    @Override
    public Optional<ProxySelector> proxy() {
        return delegate.proxy();
    }

    @Override
    public SSLContext sslContext() {
        return delegate.sslContext();
    }

    @Override
    public SSLParameters sslParameters() {
        return delegate.sslParameters();
    }

    @Override
    public Optional<Authenticator> authenticator() {
        return delegate.authenticator();
    }

    @Override
    public Version version() {
        return delegate.version();
    }

    @Override
    public Optional<Executor> executor() {
        return delegate.executor();
    }

}

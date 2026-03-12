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

import org.junit.jupiter.api.Test;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import java.io.IOException;
import java.io.InputStream;
import java.net.Authenticator;
import java.net.CookieHandler;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit tests for {@link RetryingHttpClient}.
 *
 * <p>These tests are pure unit tests — no running ThingsBoard instance is required.
 * All HTTP interactions are handled by a hand-rolled {@link StubHttpClient} stub
 * that returns pre-programmed sequences of status codes.
 */
class RetryingHttpClientTest {

    // Reusable no-op request to pass into send()
    private static final HttpRequest DUMMY_REQUEST = HttpRequest.newBuilder()
            .uri(URI.create("http://localhost/test"))
            .GET()
            .build();

    // ---------------------------------------------------------------------------
    // Tests
    // ---------------------------------------------------------------------------

    @Test
    void testNoRetryOn200() throws Exception {
        StubHttpClient stub = StubHttpClient.ofStatusCodes(List.of(200));
        RetryingHttpClient client = RetryingHttpClient.wrap(stub, 3, 0L, 0L);

        HttpResponse<InputStream> response = client.send(DUMMY_REQUEST, HttpResponse.BodyHandlers.ofInputStream());

        assertEquals(200, response.statusCode());
        assertEquals(1, stub.callCount(), "send() should have been called exactly once");
    }

    @Test
    void testRetriesOn429ThenSucceeds() throws Exception {
        // 429, 429, 200 — succeeds on the third attempt
        StubHttpClient stub = StubHttpClient.ofStatusCodes(List.of(429, 429, 200));
        RetryingHttpClient client = RetryingHttpClient.wrap(stub, 3, 0L, 0L);

        HttpResponse<InputStream> response = client.send(DUMMY_REQUEST, HttpResponse.BodyHandlers.ofInputStream());

        assertEquals(200, response.statusCode());
        assertEquals(3, stub.callCount(), "send() should have been called exactly 3 times");
    }

    @Test
    void testExhaustsRetries() throws Exception {
        // Always returns 429; maxRetries=2 means 1 original + 2 retries = 3 calls total
        StubHttpClient stub = StubHttpClient.ofStatusCodes(List.of(429, 429, 429, 429));
        RetryingHttpClient client = RetryingHttpClient.wrap(stub, 2, 0L, 0L);

        HttpResponse<InputStream> response = client.send(DUMMY_REQUEST, HttpResponse.BodyHandlers.ofInputStream());

        assertEquals(429, response.statusCode(), "Final response should still be 429 after exhausting retries");
        assertEquals(3, stub.callCount(), "send() should have been called 3 times (1 original + 2 retries)");
    }

    @Test
    void testRespectsRetryAfterHeader() throws Exception {
        // First response: 429 with Retry-After: 0 (instant retry). Second: 200.
        StubHttpClient stub = StubHttpClient.ofResponses(
                List.of(new StubHttpResponse(429, Map.of("Retry-After", List.of("0"))),
                        new StubHttpResponse(200, Map.of())));
        RetryingHttpClient client = RetryingHttpClient.wrap(stub, 3, 0L, 0L);

        HttpResponse<InputStream> response = client.send(DUMMY_REQUEST, HttpResponse.BodyHandlers.ofInputStream());

        assertEquals(200, response.statusCode());
        assertEquals(2, stub.callCount(), "send() should have been called exactly twice");
    }

    @Test
    void testIsRetriableOnlyFor429() {
        RetryingHttpClient client = RetryingHttpClient.wrap(HttpClient.newHttpClient(), 3, 0L, 0L);

        assertFalse(client.isRetriable(200), "200 should not be retriable");
        assertTrue(client.isRetriable(429), "429 should be retriable");
        assertFalse(client.isRetriable(503), "503 should not be retriable");
    }

    // ---------------------------------------------------------------------------
    // Stubs
    // ---------------------------------------------------------------------------

    /**
     * A stub {@link HttpClient} that returns responses from a pre-programmed sequence.
     * Tracks how many times {@link #send} was called.
     */
    private static class StubHttpClient extends HttpClient {

        private final List<StubHttpResponse> responses;
        private final AtomicInteger index = new AtomicInteger(0);

        /** Private constructor; use {@link #ofStatusCodes} or {@link #ofResponses}. */
        private StubHttpClient(List<StubHttpResponse> responses) {
            this.responses = responses;
        }

        /** Factory: status codes only, no special headers. */
        static StubHttpClient ofStatusCodes(List<Integer> statusCodes) {
            return new StubHttpClient(statusCodes.stream()
                    .map(code -> new StubHttpResponse(code, Map.of()))
                    .toList());
        }

        /** Factory: full response objects (use for Retry-After header tests). */
        static StubHttpClient ofResponses(List<StubHttpResponse> responses) {
            return new StubHttpClient(responses);
        }

        int callCount() {
            return index.get();
        }

        @Override
        @SuppressWarnings("unchecked")
        public <T> HttpResponse<T> send(HttpRequest request, HttpResponse.BodyHandler<T> responseBodyHandler)
                throws IOException, InterruptedException {
            int i = index.getAndIncrement();
            if (i >= responses.size()) {
                throw new IllegalStateException("StubHttpClient exhausted responses (called " + (i + 1) + " times)");
            }
            return (HttpResponse<T>) responses.get(i);
        }

        @Override
        public <T> CompletableFuture<HttpResponse<T>> sendAsync(
                HttpRequest request, HttpResponse.BodyHandler<T> responseBodyHandler) {
            try {
                return CompletableFuture.completedFuture(send(request, responseBodyHandler));
            } catch (Exception e) {
                return CompletableFuture.failedFuture(e);
            }
        }

        @Override
        public <T> CompletableFuture<HttpResponse<T>> sendAsync(
                HttpRequest request,
                HttpResponse.BodyHandler<T> responseBodyHandler,
                HttpResponse.PushPromiseHandler<T> pushPromiseHandler) {
            return sendAsync(request, responseBodyHandler);
        }

        // Remaining abstract methods — minimal no-op implementations
        @Override public Optional<CookieHandler> cookieHandler() { return Optional.empty(); }
        @Override public Optional<Duration> connectTimeout() { return Optional.empty(); }
        @Override public Redirect followRedirects() { return Redirect.NORMAL; }
        @Override public Optional<ProxySelector> proxy() { return Optional.empty(); }
        @Override public SSLContext sslContext() { try { return SSLContext.getDefault(); } catch (Exception e) { throw new RuntimeException(e); } }
        @Override public SSLParameters sslParameters() { return new SSLParameters(); }
        @Override public Optional<Authenticator> authenticator() { return Optional.empty(); }
        @Override public Version version() { return Version.HTTP_1_1; }
        @Override public Optional<Executor> executor() { return Optional.empty(); }
    }

    /**
     * A stub {@link HttpResponse} that returns a fixed status code and configurable headers.
     */
    private static class StubHttpResponse implements HttpResponse<InputStream> {

        private final int statusCode;
        private final HttpHeaders headers;

        StubHttpResponse(int statusCode, Map<String, List<String>> headers) {
            this.statusCode = statusCode;
            this.headers = HttpHeaders.of(headers, (k, v) -> true);
        }

        @Override public int statusCode() { return statusCode; }
        @Override public HttpHeaders headers() { return headers; }
        @Override public InputStream body() { return InputStream.nullInputStream(); }
        @Override public HttpRequest request() { return DUMMY_REQUEST; }
        @Override public Optional<HttpResponse<InputStream>> previousResponse() { return Optional.empty(); }
        @Override public Optional<SSLSession> sslSession() { return Optional.empty(); }
        @Override public URI uri() { return DUMMY_REQUEST.uri(); }
        @Override public HttpClient.Version version() { return HttpClient.Version.HTTP_1_1; }
    }

}

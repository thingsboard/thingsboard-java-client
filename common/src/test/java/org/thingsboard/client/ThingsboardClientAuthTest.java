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

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ThingsboardClientAuthTest {

    private HttpServer server;
    private String baseUrl;

    private final AtomicReference<HttpHandler> loginHandler = new AtomicReference<>();
    private final AtomicReference<HttpHandler> refreshHandler = new AtomicReference<>();

    @BeforeEach
    void setUp() throws IOException {
        server = HttpServer.create(new InetSocketAddress(0), 0);
        int port = server.getAddress().getPort();
        baseUrl = "http://localhost:" + port;

        // Default login handler: returns valid tokens with far-future expiry
        loginHandler.set(exchange -> {
            long now = System.currentTimeMillis() / 1000;
            String token = createJwt(now, now + 3600);
            String refreshToken = createJwt(now, now + 86400);
            sendJson(exchange, 200, loginResponseJson(token, refreshToken));
        });

        // Default refresh handler: returns valid tokens with far-future expiry
        refreshHandler.set(exchange -> {
            long now = System.currentTimeMillis() / 1000;
            String token = createJwt(now, now + 3600);
            String refreshToken = createJwt(now, now + 86400);
            sendJson(exchange, 200, loginResponseJson(token, refreshToken));
        });

        server.createContext("/api/auth/login", exchange -> loginHandler.get().handle(exchange));
        server.createContext("/api/auth/token", exchange -> refreshHandler.get().handle(exchange));

        server.setExecutor(Executors.newCachedThreadPool());
        server.start();
    }

    @AfterEach
    void tearDown() {
        if (server != null) {
            server.stop(0);
        }
    }

    // ---- Builder / Construction ----

    @Test
    void buildWithApiKey_setsToken() throws ApiException {
        ThingsboardClient client = ThingsboardClient.builder()
                .url(baseUrl)
                .apiKey("my-api-key")
                .build();

        assertEquals("my-api-key", client.getToken());
        assertNull(client.getRefreshToken());
    }

    @Test
    void buildWithoutUrl_throwsIllegalArgument() {
        assertThrows(IllegalArgumentException.class, () ->
                ThingsboardClient.builder().build());
    }

    @Test
    void buildWithCredentials_logsInAndSetsToken() throws ApiException {
        ThingsboardClient client = ThingsboardClient.builder()
                .url(baseUrl)
                .credentials("user@test.org", "password")
                .build();

        assertNotNull(client.getToken());
        assertNotNull(client.getRefreshToken());
    }

    @Test
    void buildWithoutCredentials_tokenIsNull() throws ApiException {
        ThingsboardClient client = ThingsboardClient.builder()
                .url(baseUrl)
                .build();

        assertNull(client.getToken());
        assertNull(client.getRefreshToken());
    }

    // ---- Login ----

    @Test
    void login_setsTokenAndRefreshToken() throws ApiException {
        ThingsboardClient client = ThingsboardClient.builder()
                .url(baseUrl)
                .build();

        assertNull(client.getToken());
        client.login("user@test.org", "password");

        assertNotNull(client.getToken());
        assertNotNull(client.getRefreshToken());
    }

    @Test
    void login_non200_throwsApiException() throws ApiException {
        loginHandler.set(exchange -> sendJson(exchange, 401, "{\"message\":\"Unauthorized\"}"));

        ThingsboardClient client = ThingsboardClient.builder()
                .url(baseUrl)
                .build();

        ApiException exception = assertThrows(ApiException.class, () ->
                client.login("bad@user.org", "wrong"));
        assertEquals(401, exception.getCode());
    }

    @Test
    void login_storesCredentialsForReLogin() throws ApiException {
        AtomicInteger loginCount = new AtomicInteger(0);
        loginHandler.set(exchange -> {
            int count = loginCount.incrementAndGet();
            long now = System.currentTimeMillis() / 1000;
            String token;
            String refreshToken;
            if (count == 1) {
                // First login: return already-expired tokens so next request triggers re-login
                token = createJwt(now, now - 100);
                refreshToken = createJwt(now, now - 100);
            } else {
                token = createJwt(now, now + 3600);
                refreshToken = createJwt(now, now + 86400);
            }
            sendJson(exchange, 200, loginResponseJson(token, refreshToken));
        });

        ThingsboardClient client = ThingsboardClient.builder()
                .url(baseUrl)
                .credentials("user@test.org", "password")
                .build();

        assertEquals(1, loginCount.get());

        // Trigger interceptor — both tokens expired → re-login using stored credentials
        try {
            client.getUser();
        } catch (ApiException ignored) {
        }

        assertEquals(2, loginCount.get(), "Re-login should use stored credentials");
    }

    // ---- setToken (setExternalToken) ----

    @Test
    void setToken_updatesTokenValue() throws ApiException {
        ThingsboardClient client = ThingsboardClient.builder()
                .url(baseUrl)
                .build();

        long now = System.currentTimeMillis() / 1000;
        String jwt = createJwt(now, now + 3600);
        client.setToken(jwt);

        assertEquals(jwt, client.getToken());
    }

    @Test
    void setToken_parsesExpiry_noRefreshWhenValid() throws ApiException {
        AtomicInteger refreshCount = new AtomicInteger(0);
        refreshHandler.set(exchange -> {
            refreshCount.incrementAndGet();
            long now = System.currentTimeMillis() / 1000;
            String token = createJwt(now, now + 3600);
            String refreshToken = createJwt(now, now + 86400);
            sendJson(exchange, 200, loginResponseJson(token, refreshToken));
        });

        ThingsboardClient client = ThingsboardClient.builder()
                .url(baseUrl)
                .build();

        // Set a token with far-future expiry — should not trigger refresh
        long now = System.currentTimeMillis() / 1000;
        String jwt = createJwt(now, now + 7200);
        client.setToken(jwt);

        try {
            client.getUser();
        } catch (ApiException ignored) {
        }

        assertEquals(0, refreshCount.get(), "No refresh should occur for a valid token");
        assertEquals(jwt, client.getToken(), "Token should remain unchanged");
    }

    @Test
    void setToken_withInvalidJwt_setsTokenAnyway() throws ApiException {
        ThingsboardClient client = ThingsboardClient.builder()
                .url(baseUrl)
                .build();

        // Invalid JWT — parseJwtClaimMs returns -1 for all claims
        client.setToken("not-a-jwt");

        assertEquals("not-a-jwt", client.getToken());
    }

    @Test
    void setToken_clearsRefreshToken() throws ApiException {
        ThingsboardClient client = ThingsboardClient.builder()
                .url(baseUrl)
                .credentials("user@test.org", "password")
                .build();

        assertNotNull(client.getRefreshToken(), "Should have refresh token after login");

        long now = System.currentTimeMillis() / 1000;
        client.setToken(createJwt(now, now + 3600));

        assertNull(client.getRefreshToken(), "setToken should clear refresh token");
    }

    // ---- Token refresh ----

    @Test
    void autoRefresh_whenTokenExpired_refreshTokenValid() throws ApiException {
        long now = System.currentTimeMillis() / 1000;

        // Login returns expired access token but valid refresh token
        loginHandler.set(exchange -> {
            String token = createJwt(now, now - 10); // expired
            String refreshToken = createJwt(now, now + 86400); // valid
            sendJson(exchange, 200, loginResponseJson(token, refreshToken));
        });

        AtomicInteger refreshCount = new AtomicInteger(0);
        refreshHandler.set(exchange -> {
            refreshCount.incrementAndGet();
            long refreshNow = System.currentTimeMillis() / 1000;
            String token = createJwt(refreshNow, refreshNow + 3600);
            String refreshToken = createJwt(refreshNow, refreshNow + 86400);
            sendJson(exchange, 200, loginResponseJson(token, refreshToken));
        });

        ThingsboardClient client = ThingsboardClient.builder()
                .url(baseUrl)
                .credentials("user@test.org", "password")
                .build();

        String expiredToken = client.getToken();

        // Trigger an API call — the interceptor will detect expired token and refresh
        try {
            client.getUser();
        } catch (ApiException ignored) {
            // The actual API call will fail (no mock for /api/auth/user), but refresh should have happened
        }

        assertEquals(1, refreshCount.get(), "Token refresh should have been called");
        // Token should have changed after refresh
        assertNotEquals(expiredToken, client.getToken(), "Token should have been refreshed");
    }

    @Test
    void autoRefresh_whenBothExpired_reLogsIn() throws ApiException {
        AtomicInteger loginCount = new AtomicInteger(0);
        loginHandler.set(exchange -> {
            int count = loginCount.incrementAndGet();
            long loginNow = System.currentTimeMillis() / 1000;
            String token;
            String refreshToken;
            if (count == 1) {
                // First login: both tokens expired
                token = createJwt(loginNow, loginNow - 10);
                refreshToken = createJwt(loginNow, loginNow - 10);
            } else {
                // Re-login: valid tokens
                token = createJwt(loginNow, loginNow + 3600);
                refreshToken = createJwt(loginNow, loginNow + 86400);
            }
            sendJson(exchange, 200, loginResponseJson(token, refreshToken));
        });

        ThingsboardClient client = ThingsboardClient.builder()
                .url(baseUrl)
                .credentials("user@test.org", "password")
                .build();

        assertEquals(1, loginCount.get());

        // Trigger interceptor — both tokens expired → re-login
        try {
            client.getUser();
        } catch (ApiException ignored) {
        }

        assertEquals(2, loginCount.get(), "Re-login should have been triggered");
    }

    @Test
    void autoRefresh_refreshFails_fallsBackToReLogin() throws ApiException {
        AtomicInteger loginCount = new AtomicInteger(0);
        loginHandler.set(exchange -> {
            int count = loginCount.incrementAndGet();
            long loginNow = System.currentTimeMillis() / 1000;
            String token;
            String refreshToken;
            if (count == 1) {
                // First login: expired access token, valid refresh token
                token = createJwt(loginNow, loginNow - 10);
                refreshToken = createJwt(loginNow, loginNow + 86400);
            } else {
                // Re-login: valid tokens
                token = createJwt(loginNow, loginNow + 3600);
                refreshToken = createJwt(loginNow, loginNow + 86400);
            }
            sendJson(exchange, 200, loginResponseJson(token, refreshToken));
        });

        // Refresh endpoint returns 500
        refreshHandler.set(exchange -> sendJson(exchange, 500, "{\"message\":\"Internal Server Error\"}"));

        ThingsboardClient client = ThingsboardClient.builder()
                .url(baseUrl)
                .credentials("user@test.org", "password")
                .build();

        assertEquals(1, loginCount.get());

        // Trigger interceptor — refresh fails, falls back to re-login
        try {
            client.getUser();
        } catch (ApiException ignored) {
        }

        assertEquals(2, loginCount.get(), "Re-login should have been triggered after refresh failure");
    }

    // ---- Error handling ----

    @Test
    void refreshDoesNotDeadlock() throws Exception {
        AtomicInteger refreshCount = new AtomicInteger(0);
        // Login returns expired access token, valid refresh token
        loginHandler.set(exchange -> {
            long loginNow = System.currentTimeMillis() / 1000;
            String token = createJwt(loginNow, loginNow - 10);
            String refreshToken = createJwt(loginNow, loginNow + 86400);
            sendJson(exchange, 200, loginResponseJson(token, refreshToken));
        });

        // Slow refresh handler — simulates latency
        refreshHandler.set(exchange -> {
            refreshCount.incrementAndGet();
            try {
                Thread.sleep(100);
            } catch (InterruptedException ignored) {
            }
            long refreshNow = System.currentTimeMillis() / 1000;
            String token = createJwt(refreshNow, refreshNow + 3600);
            String refreshToken = createJwt(refreshNow, refreshNow + 86400);
            sendJson(exchange, 200, loginResponseJson(token, refreshToken));
        });

        ThingsboardClient client = ThingsboardClient.builder()
                .url(baseUrl)
                .credentials("user@test.org", "password")
                .build();

        int threadCount = 10;
        CountDownLatch startLatch = new CountDownLatch(1);
        CountDownLatch doneLatch = new CountDownLatch(threadCount);
        ExecutorService executor = Executors.newFixedThreadPool(threadCount);

        for (int i = 0; i < threadCount; i++) {
            executor.submit(() -> {
                try {
                    startLatch.await();
                    // Each thread triggers an API call which triggers the interceptor
                    client.getUser();
                } catch (Exception ignored) {
                } finally {
                    doneLatch.countDown();
                }
            });
        }

        startLatch.countDown();
        boolean completed = doneLatch.await(10, TimeUnit.SECONDS);
        executor.shutdown();

        assertTrue(completed, "All threads should complete without deadlock");
        // Only one refresh should have actually executed (others skip because refreshing=true)
        assertTrue(refreshCount.get() <= 2,
                "At most 1-2 refreshes should occur, got " + refreshCount.get());
    }

    // ---- Helpers ----

    private static String createJwt(long iatSeconds, long expSeconds) {
        String header = Base64.getUrlEncoder().withoutPadding()
                .encodeToString("{\"alg\":\"none\"}".getBytes(StandardCharsets.UTF_8));
        String payload = Base64.getUrlEncoder().withoutPadding()
                .encodeToString(("{\"iat\":" + iatSeconds + ",\"exp\":" + expSeconds + "}")
                        .getBytes(StandardCharsets.UTF_8));
        return header + "." + payload + ".signature";
    }

    private static String loginResponseJson(String token, String refreshToken) {
        return "{\"token\":\"" + token + "\",\"refreshToken\":\"" + refreshToken + "\"}";
    }

    private static void sendJson(HttpExchange exchange, int status, String body) throws IOException {
        byte[] bytes = body.getBytes(StandardCharsets.UTF_8);
        exchange.getResponseHeaders().set("Content-Type", "application/json");
        exchange.sendResponseHeaders(status, bytes.length);
        try (OutputStream os = exchange.getResponseBody()) {
            os.write(bytes);
        }
    }

}

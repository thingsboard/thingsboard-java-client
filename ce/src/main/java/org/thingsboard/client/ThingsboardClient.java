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

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.java.Log;
import org.thingsboard.client.api.ThingsboardApi;
import org.thingsboard.client.model.LoginRequest;
import org.thingsboard.client.model.LoginResponse;

import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Base64;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/**
 * High-level ThingsBoard REST API client with automatic authentication management.
 * <p>
 * Extends the generated {@link ThingsboardApi} with:
 * <ul>
 *   <li>Simple credential-based or API key authentication</li>
 *   <li>Automatic token refresh before expiry</li>
 *   <li>Automatic re-login when the refresh token expires</li>
 *   <li>Client-server clock skew compensation</li>
 * </ul>
 *
 * <pre>{@code
 * // JWT authentication (with automatic token refresh and re-login)
 * ThingsboardClient client = ThingsboardClient.builder()
 *         .url("http://localhost:8080")
 *         .credentials("tenant@thingsboard.org", "password")
 *         .build();
 *
 * // API key authentication
 * ThingsboardClient client = ThingsboardClient.builder()
 *         .url("http://localhost:8080")
 *         .apiKey("your-api-key")
 *         .build();
 *
 * // All generated API methods are available directly
 * Device device = client.getDeviceById(deviceId);
 * }</pre>
 */
public class ThingsboardClient extends ThingsboardApi {

    private final AuthManager auth;

    public static Builder builder() {
        return new Builder();
    }

    private ThingsboardClient(AuthManager auth) {
        super(auth.apiClient);
        this.auth = auth;
    }

    public String getToken() {
        return auth.getToken();
    }

    public String getRefreshToken() {
        return auth.getRefreshToken();
    }

    /**
     * Sets a pre-existing JWT token for authentication.
     * Use this when you already have a token (e.g. from user activation).
     * Note: automatic refresh will not work without credentials.
     */
    public void setToken(String token) {
        auth.setExternalToken(token);
    }

    public static class Builder {

        private String url;
        private String username;
        private String password;
        private String apiKey;

        private Builder() {}

        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public Builder credentials(String username, String password) {
            this.username = username;
            this.password = password;
            return this;
        }

        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        public ThingsboardClient build() throws ApiException {
            if (url == null) {
                throw new IllegalArgumentException("url is required");
            }
            if (apiKey != null) {
                return new ThingsboardClient(new AuthManager(url, AuthType.API_KEY, apiKey));
            }
            AuthManager auth = new AuthManager(url, AuthType.JWT, null);
            ThingsboardClient client = new ThingsboardClient(auth);
            if (username != null) {
                client.login(username, password);
            }
            return client;
        }

    }

    /**
     * Authenticates with ThingsBoard using username and password.
     * The JWT token is automatically applied to all subsequent API calls.
     * Credentials are stored for automatic re-login when tokens expire.
     */
    public void login(String username, String password) throws ApiException {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUsername(username);
        loginRequest.setPassword(password);
        LoginResponse response = login(loginRequest);
        auth.onLogin(username, password, response);
    }

    private enum AuthType {JWT, API_KEY}

    /**
     * Handles token storage, automatic refresh, and re-login.
     * <p>
     * Created before {@code super()} and passed to the {@link ApiClient} interceptor,
     * so all mutable auth state lives here rather than on ThingsboardClient fields
     * (which aren't initialized until after {@code super()} returns).
     * <p>
     * Auth operations (refresh, re-login) use a raw {@link HttpClient} to avoid
     * going through the interceptor, which would cause infinite recursion.
     */
    @Log
    private static class AuthManager {

        private static final long AVG_REQUEST_TIMEOUT = TimeUnit.SECONDS.toMillis(30);

        private record TokenInfo(String token, String refreshToken, long tokenExpTs,
                                 long refreshTokenExpTs, long clientServerTimeDiff) {
            static final TokenInfo EMPTY = new TokenInfo(null, null, -1, -1, 0);
        }

        final ApiClient apiClient;
        private final AuthType authType;
        private final HttpClient httpClient;
        private final ObjectMapper objectMapper;
        private final String baseUrl;

        private volatile TokenInfo tokenInfo;
        private volatile String username;
        private volatile String password;
        private volatile boolean refreshing;

        AuthManager(String url, AuthType authType, String apiKey) {
            this.authType = authType;
            this.apiClient = new ApiClient();
            apiClient.updateBaseUri(url);
            this.baseUrl = apiClient.getBaseUri();
            this.httpClient = apiClient.getHttpClient();
            this.objectMapper = apiClient.getObjectMapper();
            apiClient.setRequestInterceptor(this::interceptRequest);

            if (authType == AuthType.API_KEY) {
                this.tokenInfo = new TokenInfo(apiKey, null, -1, -1, 0);
            } else {
                this.tokenInfo = TokenInfo.EMPTY;
            }
        }

        String getToken() {
            return tokenInfo.token();
        }

        String getRefreshToken() {
            return tokenInfo.refreshToken();
        }

        void setExternalToken(String token) {
            long ts = System.currentTimeMillis();
            long tokenExpTs = parseJwtClaimMs(objectMapper, token, "exp");
            long iat = parseJwtClaimMs(objectMapper, token, "iat");
            long clientServerTimeDiff = iat >= 0 ? iat - ts : 0;
            this.tokenInfo = new TokenInfo(token, null, tokenExpTs, -1, clientServerTimeDiff);
        }

        private void interceptRequest(HttpRequest.Builder builder) {
            if (authType == AuthType.JWT) {
                refreshIfNeeded();
            }
            String token = tokenInfo.token();
            if (token != null) {
                String headerValue = switch (authType) {
                    case JWT -> "Bearer " + token;
                    case API_KEY -> "ApiKey " + token;
                };
                builder.header("Authorization", headerValue);
            }
        }

        void onLogin(String username, String password, LoginResponse response) {
            this.username = username;
            this.password = password;
            this.tokenInfo = buildTokenInfo(response.getToken(), response.getRefreshToken());
        }

        private void refreshIfNeeded() {
            TokenInfo info;
            synchronized (this) {
                if (refreshing) return;
                info = this.tokenInfo;
                if (info.token() == null || info.tokenExpTs() < 0) return;

                long estimatedServerTime = System.currentTimeMillis() + info.clientServerTimeDiff() + AVG_REQUEST_TIMEOUT;
                if (estimatedServerTime <= info.tokenExpTs()) return;

                refreshing = true;
            }

            try {
                if (System.currentTimeMillis() + info.clientServerTimeDiff() + AVG_REQUEST_TIMEOUT < info.refreshTokenExpTs()) {
                    doRefreshToken(info);
                } else if (username != null) {
                    doLogin();
                }
            } finally {
                refreshing = false;
            }
        }

        private void doRefreshToken(TokenInfo info) {
            try {
                LoginResponse loginResponse = postForTokens(
                        "/api/auth/token",
                        objectMapper.writeValueAsString(Map.of("refreshToken", info.refreshToken())));
                this.tokenInfo = buildTokenInfo(loginResponse.getToken(), loginResponse.getRefreshToken());
            } catch (Exception e) {
                log.log(Level.WARNING, "Token refresh failed", e);
                if (username != null) {
                    doLogin();
                }
            }
        }

        private void doLogin() {
            try {
                LoginRequest loginRequest = new LoginRequest();
                loginRequest.setUsername(username);
                loginRequest.setPassword(password);
                LoginResponse loginResponse = postForTokens(
                        "/api/auth/login",
                        objectMapper.writeValueAsString(loginRequest));
                this.tokenInfo = buildTokenInfo(loginResponse.getToken(), loginResponse.getRefreshToken());
            } catch (Exception e) {
                log.log(Level.SEVERE, "Re-login failed", e);
            }
        }

        private LoginResponse postForTokens(String path, String body) throws ApiException {
            try {
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(baseUrl + path))
                        .header("Content-Type", "application/json")
                        .POST(HttpRequest.BodyPublishers.ofString(body))
                        .build();
                HttpResponse<InputStream> response = httpClient.send(request, HttpResponse.BodyHandlers.ofInputStream());
                if (response.statusCode() != 200) {
                    throw new ApiException(response.statusCode(), "Auth request to " + path + " failed");
                }
                return objectMapper.readValue(ApiClient.getResponseBody(response), LoginResponse.class);
            } catch (ApiException e) {
                throw e;
            } catch (Exception e) {
                throw new ApiException(e);
            }
        }

        private TokenInfo buildTokenInfo(String token, String refreshToken) {
            long ts = System.currentTimeMillis();
            long tokenExpTs = parseJwtClaimMs(objectMapper, token, "exp");
            long refreshTokenExpTs = parseJwtClaimMs(objectMapper, refreshToken, "exp");
            long iat = parseJwtClaimMs(objectMapper, token, "iat");
            long clientServerTimeDiff = iat >= 0 ? iat - ts : 0;
            return new TokenInfo(token, refreshToken, tokenExpTs, refreshTokenExpTs, clientServerTimeDiff);
        }

        private static long parseJwtClaimMs(ObjectMapper objectMapper, String jwt, String claim) {
            try {
                String payload = jwt.split("\\.")[1];
                JsonNode node = objectMapper.readTree(Base64.getUrlDecoder().decode(payload));
                return node.get(claim).asLong() * 1000;
            } catch (Exception e) {
                return -1;
            }
        }

    }

}

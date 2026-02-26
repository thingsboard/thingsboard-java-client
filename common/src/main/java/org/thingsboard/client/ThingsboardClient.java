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

import org.thingsboard.client.api.ThingsboardApi;
import org.thingsboard.client.model.LoginRequest;
import org.thingsboard.client.model.LoginResponse;

import java.util.concurrent.atomic.AtomicReference;

public class ThingsboardClient extends ThingsboardApi {

    private final AtomicReference<String> tokenHolder;
    private final AtomicReference<String> refreshToken = new AtomicReference<>();

    public ThingsboardClient(String url) {
        this(url, new AtomicReference<>());
    }

    private ThingsboardClient(String url, AtomicReference<String> tokenHolder) {
        super(buildApiClient(url, tokenHolder));
        this.tokenHolder = tokenHolder;
    }

    private static ApiClient buildApiClient(String url, AtomicReference<String> tokenHolder) {
        ApiClient apiClient = new ApiClient();
        apiClient.updateBaseUri(url);
        apiClient.setRequestInterceptor(builder -> {
            String token = tokenHolder.get();
            if (token != null) {
                builder.header("Authorization", "Bearer " + token);
            }
        });
        return apiClient;
    }

    public void login(String username, String password) throws ApiException {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUsername(username);
        loginRequest.setPassword(password);
        LoginResponse response = login(loginRequest);
        tokenHolder.set(response.getToken());
        refreshToken.set(response.getRefreshToken());
    }

}

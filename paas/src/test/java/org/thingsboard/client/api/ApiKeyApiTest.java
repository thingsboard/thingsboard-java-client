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
package org.thingsboard.client.api;

import org.junit.jupiter.api.Test;
import org.thingsboard.client.ApiException;
import org.thingsboard.client.model.ApiKey;
import org.thingsboard.client.model.ApiKeyInfo;
import org.thingsboard.client.model.PageDataApiKeyInfo;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ApiKeyApiTest extends AbstractApiTest {

    @Test
    void testApiKeyLifecycle() throws ApiException {
        String userId = tenantAdmin.getId().getId().toString();

        // Create API key
        ApiKeyInfo request = new ApiKeyInfo();
        request.setDescription("Test API key");
        request.setUserId(tenantAdmin.getId());
        request.setEnabled(true);
        ApiKey created = tbApi.saveApiKey(request);

        assertNotNull(created);
        assertNotNull(created.getId());
        assertNotNull(created.getValue());
        assertFalse(created.getValue().isBlank());
        assertEquals("Test API key", created.getDescription());

        UUID keyId = created.getId().getId();

        // List user API keys - should contain the newly created key
        PageDataApiKeyInfo keysPage = tbApi.getUserApiKeys(userId, 100, 0, null, null, null);
        assertNotNull(keysPage);
        assertNotNull(keysPage.getData());
        assertTrue(keysPage.getData().stream()
                        .anyMatch(k -> k.getId().getId().equals(keyId)),
                "Newly created API key should appear in user's key list");

        // Delete API key
        tbApi.deleteApiKey(keyId);

        // Verify deletion
        PageDataApiKeyInfo keysAfterDelete = tbApi.getUserApiKeys(userId, 100, 0, null, null, null);
        assertTrue(keysAfterDelete.getData().stream()
                        .noneMatch(k -> k.getId().getId().equals(keyId)),
                "Deleted API key should not appear in user's key list");
    }

    @Test
    void testEnableDisableApiKey() throws ApiException {
        ApiKeyInfo request = new ApiKeyInfo();
        request.setDescription("Enable/disable test key");
        request.setUserId(tenantAdmin.getId());
        request.setEnabled(true);
        ApiKey created = tbApi.saveApiKey(request);
        assertNotNull(created);

        UUID keyId = created.getId().getId();

        // Disable the key
        ApiKeyInfo disabled = tbApi.enableApiKey(keyId, false);
        assertNotNull(disabled);
        assertEquals(Boolean.FALSE, disabled.getEnabled());

        // Re-enable the key
        ApiKeyInfo enabled = tbApi.enableApiKey(keyId, true);
        assertNotNull(enabled);
        assertEquals(Boolean.TRUE, enabled.getEnabled());

        // Cleanup
        tbApi.deleteApiKey(keyId);
    }

    @Test
    void testGetUserApiKeys() throws ApiException {
        String userId = tenantAdmin.getId().getId().toString();

        int initialCount = tbApi.getUserApiKeys(userId, 100, 0, null, null, null)
                .getData().size();

        // Create 3 keys
        UUID[] createdIds = new UUID[3];
        for (int i = 0; i < 3; i++) {
            ApiKeyInfo request = new ApiKeyInfo();
            request.setDescription("Paging test key " + i);
            request.setUserId(tenantAdmin.getId());
            createdIds[i] = tbApi.saveApiKey(request).getId().getId();
        }

        // All 3 new keys should appear
        PageDataApiKeyInfo afterCreate = tbApi.getUserApiKeys(userId, 100, 0, null, null, null);
        assertEquals(initialCount + 3, afterCreate.getData().size());
        assertEquals(Long.valueOf(initialCount + 3), afterCreate.getTotalElements());

        // Pagination: request page size 2 from offset 0
        PageDataApiKeyInfo page1 = tbApi.getUserApiKeys(userId, 2, 0, null, null, null);
        assertEquals(2, page1.getData().size());
        assertTrue(page1.getHasNext());

        // Cleanup
        for (UUID id : createdIds) {
            tbApi.deleteApiKey(id);
        }
    }

}

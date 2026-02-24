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
import org.thingsboard.client.model.PageDataSecretInfo;
import org.thingsboard.client.model.Secret;
import org.thingsboard.client.model.SecretInfo;
import org.thingsboard.client.model.SecretType;
import org.thingsboard.client.model.TbSecretDeleteResult;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SecretApiTest extends AbstractApiTest {

    private Secret buildSecret(String name, String value) {
        Secret secret = new Secret();
        secret.setName(name);
        secret.setType(SecretType.TEXT);
        secret.setValue(value);
        secret.setDescription("description for " + name);
        return secret;
    }

    private SecretInfo createSecret(String name) throws ApiException {
        return tbApi.saveSecret(buildSecret(name, "initial-value"));
    }

    // -------------------------------------------------------------------------
    // Lifecycle: saveSecret, getSecretInfoById, getSecretInfoByName,
    //            updateSecretDescription, updateSecretValue, deleteSecret
    // -------------------------------------------------------------------------

    @Test
    void testSecretLifecycle() throws ApiException {
        long ts = System.currentTimeMillis();
        String name = TEST_PREFIX + ts;

        // saveSecret (create)
        SecretInfo saved = createSecret(name);
        assertNotNull(saved);
        assertNotNull(saved.getId());
        assertEquals(name, saved.getName());
        assertEquals(SecretType.TEXT, saved.getType());
        UUID secretId = saved.getId().getId();

        // getSecretInfoById
        SecretInfo byId = tbApi.getSecretInfoById(secretId);
        assertNotNull(byId);
        assertEquals(secretId, byId.getId().getId());
        assertEquals(name, byId.getName());

        // getSecretInfoByName
        SecretInfo byName = tbApi.getSecretInfoByName(name);
        assertNotNull(byName);
        assertEquals(secretId, byName.getId().getId());
        assertEquals(name, byName.getName());

        // updateSecretDescription
        SecretInfo afterDescUpdate = tbApi.updateSecretDescription(secretId, "updated description");
        assertNotNull(afterDescUpdate);
        assertEquals("updated description", afterDescUpdate.getDescription());

        // updateSecretValue
        SecretInfo afterValueUpdate = tbApi.updateSecretValue(secretId, "new-secret-value");
        assertNotNull(afterValueUpdate);
        assertEquals(secretId, afterValueUpdate.getId().getId());

        // deleteSecret
        TbSecretDeleteResult result = tbApi.deleteSecret(secretId);
        assertNotNull(result);

        assertReturns404(() -> tbApi.getSecretInfoById(secretId));
    }

    // -------------------------------------------------------------------------
    // getSecretInfos
    // -------------------------------------------------------------------------

    @Test
    void testGetSecretInfos() throws ApiException {
        long ts = System.currentTimeMillis();

        SecretInfo s1 = createSecret(TEST_PREFIX + ts + "_1");
        SecretInfo s2 = createSecret(TEST_PREFIX + ts + "_2");
        SecretInfo s3 = createSecret(TEST_PREFIX + ts + "_3");
        UUID id1 = s1.getId().getId();
        UUID id2 = s2.getId().getId();
        UUID id3 = s3.getId().getId();

        PageDataSecretInfo page = tbApi.getSecretInfos(100, 0, TEST_PREFIX + ts, null, null);
        assertNotNull(page);
        assertTrue(page.getTotalElements() >= 3);
        assertTrue(page.getData().stream().anyMatch(s -> s.getId().getId().equals(id1)));
        assertTrue(page.getData().stream().anyMatch(s -> s.getId().getId().equals(id2)));
        assertTrue(page.getData().stream().anyMatch(s -> s.getId().getId().equals(id3)));

        tbApi.deleteSecret(id1);
        tbApi.deleteSecret(id2);
        tbApi.deleteSecret(id3);
    }

    // -------------------------------------------------------------------------
    // getSecretNames
    // -------------------------------------------------------------------------

    @Test
    void testGetSecretNames() throws ApiException {
        long ts = System.currentTimeMillis();
        String name = TEST_PREFIX + ts + "_named";

        SecretInfo saved = createSecret(name);
        UUID secretId = saved.getId().getId();

        List<String> names = tbApi.getSecretNames();
        assertNotNull(names);
        assertTrue(names.contains(name));

        tbApi.deleteSecret(secretId);
    }

    // -------------------------------------------------------------------------
    // Not found
    // -------------------------------------------------------------------------

    @Test
    void testGetSecretInfoByIdNotFound() {
        assertReturns404(() -> tbApi.getSecretInfoById(UUID.randomUUID()));
    }

}

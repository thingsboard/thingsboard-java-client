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
import org.thingsboard.client.model.CMAssigneeType;
import org.thingsboard.client.model.CMScope;
import org.thingsboard.client.model.CustomMenu;
import org.thingsboard.client.model.CustomMenuConfig;
import org.thingsboard.client.model.CustomMenuDeleteResult;
import org.thingsboard.client.model.CustomMenuInfo;
import org.thingsboard.client.model.EntityInfo;
import org.thingsboard.client.model.PageDataCustomMenuInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CustomMenuApiTest extends AbstractApiTest {

    private CustomMenuInfo buildCustomMenuInfo(String name) {
        CustomMenuInfo info = new CustomMenuInfo();
        info.setName(name);
        info.setScope(CMScope.TENANT);
        info.setAssigneeType(CMAssigneeType.NO_ASSIGN);
        return info;
    }

    @Test
    void testCustomMenuLifecycle() throws ApiException {
        long ts = System.currentTimeMillis();
        String name = TEST_PREFIX + ts;

        // Create
        CustomMenu created = tbApi.createCustomMenu(buildCustomMenuInfo(name), null, null);
        assertNotNull(created);
        assertNotNull(created.getId());
        assertEquals(name, created.getName());
        assertEquals(CMScope.TENANT, created.getScope());

        UUID menuId = created.getId().getId();

        // Get info by ID
        CustomMenuInfo fetched = tbApi.getCustomMenuInfoById(menuId);
        assertNotNull(fetched);
        assertEquals(menuId, fetched.getId().getId());
        assertEquals(name, fetched.getName());

        // Update name
        String updatedName = name + "_updated";
        tbApi.updateCustomMenuName(menuId, updatedName);
        CustomMenuInfo afterRename = tbApi.getCustomMenuInfoById(menuId);
        assertEquals(updatedName, afterRename.getName());

        // Update config
        CustomMenu afterConfigUpdate = tbApi.updateCustomMenuConfig(menuId, new CustomMenuConfig());
        assertNotNull(afterConfigUpdate);
        assertNotNull(afterConfigUpdate.getConfig());

        // Delete (force=true skips assignee-blocking check)
        CustomMenuDeleteResult deleteResult = tbApi.deleteCustomMenu(menuId, true);
        assertNotNull(deleteResult);
        assertEquals(Boolean.TRUE, deleteResult.getSuccess());

        // Verify gone
        assertReturns404(() -> tbApi.getCustomMenuInfoById(menuId));
    }

    @Test
    void testGetCustomMenuInfos() throws ApiException {
        long ts = System.currentTimeMillis();
        List<UUID> createdIds = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            CustomMenu created = tbApi.createCustomMenu(
                    buildCustomMenuInfo(TEST_PREFIX + ts + "_" + i), null, null);
            createdIds.add(created.getId().getId());
        }

        // List all — at least 5 present
        PageDataCustomMenuInfo allPage = tbApi.getCustomMenuInfos(100, 0, null, null, null, null, null);
        assertNotNull(allPage);
        assertNotNull(allPage.getData());
        assertTrue(allPage.getTotalElements() >= 5);

        // Filter by scope
        PageDataCustomMenuInfo byScope = tbApi.getCustomMenuInfos(100, 0, CMScope.TENANT, null, null, null, null);
        assertTrue(byScope.getTotalElements() >= 5);

        // Filter by text search — should match exactly the 5 created
        PageDataCustomMenuInfo byText = tbApi.getCustomMenuInfos(100, 0, null, null, TEST_PREFIX + ts, null, null);
        assertEquals(5, byText.getData().size());

        // Pagination over the filtered set
        PageDataCustomMenuInfo page1 = tbApi.getCustomMenuInfos(2, 0, null, null, TEST_PREFIX + ts, null, null);
        assertEquals(2, page1.getData().size());
        assertTrue(page1.getHasNext());

        // Cleanup
        for (UUID id : createdIds) {
            tbApi.deleteCustomMenu(id, true);
        }
    }

    @Test
    void testGetAndUpdateCustomMenuConfig() throws ApiException {
        long ts = System.currentTimeMillis();
        CustomMenu created = tbApi.createCustomMenu(
                buildCustomMenuInfo(TEST_PREFIX + ts), null, null);
        UUID menuId = created.getId().getId();

        // Fetch initial config (empty items list)
        CustomMenuConfig initial = tbApi.getCustomMenuConfig(menuId);
        assertNotNull(initial);

        // Update config and re-fetch
        tbApi.updateCustomMenuConfig(menuId, new CustomMenuConfig());
        CustomMenuConfig updated = tbApi.getCustomMenuConfig(menuId);
        assertNotNull(updated);

        tbApi.deleteCustomMenu(menuId, true);
    }

    @Test
    void testGetCustomMenuAssigneeList() throws ApiException {
        long ts = System.currentTimeMillis();
        CustomMenu created = tbApi.createCustomMenu(
                buildCustomMenuInfo(TEST_PREFIX + ts), null, null);
        UUID menuId = created.getId().getId();

        // NO_ASSIGN — assignee list must be empty
        List<EntityInfo> initial = tbApi.getCustomMenuAssigneeList(menuId);
        assertNotNull(initial);
        assertTrue(initial.isEmpty());

        // Switch to ALL — no explicit list required
        tbApi.updateCustomMenuAssigneeList(menuId, CMAssigneeType.ALL, false, null);
        List<EntityInfo> afterAll = tbApi.getCustomMenuAssigneeList(menuId);
        assertNotNull(afterAll);

        tbApi.deleteCustomMenu(menuId, true);
    }

    @Test
    void testGetCustomMenuDoesNotThrow() throws ApiException {
        // Returns void; verifies the endpoint is reachable without error
        tbApi.getCustomMenu(null);
    }

}

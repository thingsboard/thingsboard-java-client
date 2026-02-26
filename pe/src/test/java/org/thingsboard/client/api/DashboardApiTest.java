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
import org.thingsboard.client.model.Dashboard;
import org.thingsboard.client.model.DashboardId;
import org.thingsboard.client.model.DashboardInfo;
import org.thingsboard.client.model.EntityGroup;
import org.thingsboard.client.model.EntityGroupInfo;
import org.thingsboard.client.model.HomeDashboardInfo;
import org.thingsboard.client.model.PageDataDashboardInfo;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class DashboardApiTest extends AbstractApiTest {

    @Test
    void testDashboardLifecycle() throws ApiException {
        long timestamp = System.currentTimeMillis();

        // create 20 dashboards
        for (int i = 0; i < 20; i++) {
            Dashboard dashboard = new Dashboard();
            String dashboardTitle = ((i % 2 == 0) ? TEST_PREFIX : TEST_PREFIX_2) + timestamp + "_" + i;
            dashboard.setTitle(dashboardTitle);

            client.saveDashboard(dashboard, null, null, null);
        }

        // find all, check count
        PageDataDashboardInfo allDashboards = client.getTenantDashboards1(100, 0, null, null, null, null);
        assertNotNull(allDashboards);
        assertNotNull(allDashboards.getData());
        int initialSize = allDashboards.getData().size();
        assertEquals(20, initialSize, "Expected 20 dashboards, but got " + initialSize);

        List<DashboardInfo> createdDashboards = allDashboards.getData();

        // find all with search text, check count
        PageDataDashboardInfo filteredDashboards = client.getTenantDashboards1(100, 0, null, TEST_PREFIX_2, null, null);
        assertEquals(10, filteredDashboards.getData().size(), "Expected exactly 10 dashboards matching prefix");

        // find by id
        DashboardInfo searchDashboard = createdDashboards.get(10);
        DashboardInfo fetchedDashboard = client.getDashboardInfoById(searchDashboard.getId().getId().toString());
        assertEquals(searchDashboard.getTitle(), fetchedDashboard.getTitle());

        // update dashboard
        Dashboard dashboardToUpdate = new Dashboard();
        dashboardToUpdate.setId(fetchedDashboard.getId());
        dashboardToUpdate.setTitle(fetchedDashboard.getTitle() + "_updated");
        dashboardToUpdate.setVersion(fetchedDashboard.getVersion());
        client.saveDashboard(dashboardToUpdate, null, null, null);

        DashboardInfo updatedDashboard = client.getDashboardInfoById(fetchedDashboard.getId().getId().toString());
        assertEquals(fetchedDashboard.getTitle() + "_updated", updatedDashboard.getTitle());
    }

    @Test
    void testGetServerTime() throws ApiException {
        Long serverTime = client.getServerTime();
        assertNotNull(serverTime);
    }

    @Test
    void testGetMaxDatapointsLimit() throws ApiException {
        Long maxDatapointsLimit = client.getMaxDatapointsLimit();
        assertNotNull(maxDatapointsLimit);
    }

    @Test
    void testGetTenantDashboards() throws Exception {
        Dashboard dashboard = new Dashboard();
        dashboard.setTitle(TEST_PREFIX + System.currentTimeMillis());
        client.saveDashboard(dashboard, null, null, null);

        // tenant admin variant
        PageDataDashboardInfo tenantAdminResult = client.getTenantDashboards1(100, 0, null, null, null, null);
        assertNotNull(tenantAdminResult);
        assertEquals(1, tenantAdminResult.getData().size());

        //get user dashboard
        PageDataDashboardInfo userDashboards = client.getUserDashboards(100, 0, null, null, null, null, null, null);
        assertEquals(1, userDashboards.getData().size());

        //get all dashboards
        PageDataDashboardInfo allDashboards = client.getAllDashboards(100, 0, true, null, null, null);
        assertEquals(1, allDashboards.getData().size());

        // system administrator variant (requires tenantId)
        client.login("sysadmin@thingsboard.org", "sysadmin");
        PageDataDashboardInfo sysAdminResult = client.getTenantDashboards(
                savedTenant.getId().getId().toString(), 100, 0, null, null, null);
        assertNotNull(sysAdminResult);
        assertEquals(1, sysAdminResult.getData().size(), "Expected at least one dashboard from sysadmin query");
    }

    @Test
    void testGetCustomerDashboards() throws ApiException {
        String customerId = savedCustomer.getId().getId().toString();

        // no dashboards are shared with the customer in test setup; call must succeed with empty result
        PageDataDashboardInfo result = client.getCustomerDashboards(customerId, 100, 0, true, null, null, null);
        assertNotNull(result);
        assertNotNull(result.getData());
        assertTrue(result.getData().isEmpty(), "Expected no dashboards assigned to the test customer");
    }

    @Test
    void testGetDashboardsByIds() throws ApiException {
        Dashboard dashboard = new Dashboard();
        dashboard.setTitle(TEST_PREFIX + System.currentTimeMillis());
        client.saveDashboard(dashboard, null, null, null);

        // saveDashboard returns void, so fetch the ID via getTenantDashboards1
        PageDataDashboardInfo all = client.getTenantDashboards1(100, 0, null, null, null, null);
        assertFalse(all.getData().isEmpty());
        DashboardInfo first = all.getData().get(0);

        List<DashboardInfo> result = client.getDashboardsByIds(List.of(first.getId().getId().toString()));
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(first.getId().getId(), result.get(0).getId().getId());
    }

    @Test
    void testEntityGroupDashboards() throws ApiException {
        // create a DASHBOARD entity group
        EntityGroup entityGroup = new EntityGroup();
        entityGroup.setType(EntityGroup.TypeEnum.DASHBOARD);
        entityGroup.setName("Test Dashboard Group");
        EntityGroupInfo savedGroup = client.saveEntityGroup(entityGroup);
        assertNotNull(savedGroup.getId());
        String groupId = savedGroup.getId().getId().toString();

        // importGroupDashboards: import a new dashboard into the group
        Dashboard dashboard = new Dashboard();
        dashboard.setTitle(TEST_PREFIX + System.currentTimeMillis());
        dashboard.setConfiguration(OBJECT_MAPPER.createObjectNode());
        client.importGroupDashboards(groupId, List.of(dashboard), false);

        // getDashboardsByEntityGroupId: verify the imported dashboard is present
        PageDataDashboardInfo groupDashboards = client.getDashboardsByEntityGroupId(groupId, 100, 0, null, null, null);
        assertNotNull(groupDashboards);
        assertEquals(1, groupDashboards.getData().size(), "Expected exactly one dashboard in the entity group");

        List<Dashboard> dashboards = client.exportGroupDashboards(groupId, 10, null);
        assertEquals(1, dashboards.size());
        assertEquals(dashboard.getTitle(), dashboards.get(0).getTitle());
    }

    @Test
    void testTenantHomeDashboard() throws ApiException {
        // create a dashboard and resolve its ID via getTenantDashboards1 (saveDashboard returns void)
        Dashboard dashboard = new Dashboard();
        dashboard.setTitle(TEST_PREFIX + System.currentTimeMillis());
        client.saveDashboard(dashboard, null, null, null);

        PageDataDashboardInfo all = client.getTenantDashboards1(100, 0, null, null, null, null);
        DashboardId dashboardId = all.getData().get(0).getId();

        // getTenantHomeDashboardInfo: no home dashboard set for a freshly created tenant
        HomeDashboardInfo initialInfo = client.getTenantHomeDashboardInfo();
        assertNotNull(initialInfo);
        assertNull(initialInfo.getDashboardId(), "No home dashboard should be set for a new tenant");

        // setTenantHomeDashboardInfo
        HomeDashboardInfo homeDashboardInfo = new HomeDashboardInfo();
        homeDashboardInfo.setDashboardId(dashboardId);
        homeDashboardInfo.setHideDashboardToolbar(false);
        client.setTenantHomeDashboardInfo(homeDashboardInfo);

        // getTenantHomeDashboardInfo must now reflect the change
        HomeDashboardInfo tenantInfo = client.getTenantHomeDashboardInfo();
        assertNotNull(tenantInfo.getDashboardId());
        assertEquals(dashboardId.getId(), tenantInfo.getDashboardId().getId());

        // getHomeDashboardInfo: inherits the tenant-level setting for the tenant admin user
        HomeDashboardInfo currentUserInfo = client.getHomeDashboardInfo();
        assertNotNull(currentUserInfo.getDashboardId());
        assertEquals(dashboardId.getId(), currentUserInfo.getDashboardId().getId());
    }

    @Test
    void testCustomerHomeDashboard() throws Exception {
        // switch to customer user authority
        client.login(CUSTOMER_USERNAME, TEST_PASSWORD);

        Dashboard dashboard = new Dashboard();
        dashboard.setTitle(TEST_PREFIX + System.currentTimeMillis());
        dashboard = client.saveDashboard(dashboard, null, null, null);

        // getCustomerHomeDashboardInfo: no home dashboard configured for a new customer
        HomeDashboardInfo initialInfo = client.getCustomerHomeDashboardInfo();
        assertNotNull(initialInfo);
        assertNull(initialInfo.getDashboardId(), "No home dashboard should be set for a new customer");

        HomeDashboardInfo homeDashboardInfo = new HomeDashboardInfo();
        homeDashboardInfo.setDashboardId(dashboard.getId());
        homeDashboardInfo.setHideDashboardToolbar(false);
        client.setCustomerHomeDashboardInfo(homeDashboardInfo);

        HomeDashboardInfo updatedInfo = client.getCustomerHomeDashboardInfo();
        assertNotNull(updatedInfo);
        assertEquals(dashboard.getId(), updatedInfo.getDashboardId());
    }

}

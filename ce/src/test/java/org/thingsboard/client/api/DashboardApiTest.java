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
import org.thingsboard.client.model.DashboardInfo;
import org.thingsboard.client.model.PageDataDashboardInfo;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
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

            client.saveDashboard(dashboard, null);
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
        client.saveDashboard(dashboardToUpdate, null);

        DashboardInfo updatedDashboard = client.getDashboardInfoById(fetchedDashboard.getId().getId().toString());
        assertEquals(fetchedDashboard.getTitle() + "_updated", updatedDashboard.getTitle());

        // assign dashboard to customer and verify
        String customerId = savedCustomer.getId().getId().toString();
        String dashboardId = createdDashboards.get(0).getId().getId().toString();
        client.assignDashboardToCustomer(customerId, dashboardId);

        PageDataDashboardInfo customerDashboards = client.getCustomerDashboards(customerId, 100, 0, null, null, null, null);
        assertEquals(1, customerDashboards.getData().size());
        assertEquals(createdDashboards.get(0).getTitle(), customerDashboards.getData().get(0).getTitle());

        // unassign dashboard from customer
        client.unassignDashboardFromCustomer(customerId, dashboardId);
        PageDataDashboardInfo dashboardsAfterUnassign = client.getCustomerDashboards(customerId, 100, 0, null, null, null, null);
        assertEquals(0, dashboardsAfterUnassign.getData().size());

        // make dashboard public and verify
        client.assignDashboardToPublicCustomer(dashboardId);
        DashboardInfo publicDashboard = client.getDashboardInfoById(dashboardId);
        assertNotNull(publicDashboard.getAssignedCustomers());
        assertTrue(publicDashboard.getAssignedCustomers().size() > 0);

        // remove public access
        client.unassignDashboardFromPublicCustomer(dashboardId);

        // delete dashboard
        UUID dashboardToDeleteId = createdDashboards.get(0).getId().getId();
        client.deleteDashboard(dashboardToDeleteId.toString());

        // verify deletion
        PageDataDashboardInfo dashboardsAfterDelete = client.getTenantDashboards1(100, 0, null, null, null, null);
        assertEquals(initialSize - 1, dashboardsAfterDelete.getData().size());

        assertReturns404(() ->
                client.getDashboardInfoById(dashboardToDeleteId.toString())
        );
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

}

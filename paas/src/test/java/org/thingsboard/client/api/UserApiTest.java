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

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;
import org.thingsboard.client.model.Alarm;
import org.thingsboard.client.model.AlarmSeverity;
import org.thingsboard.client.model.Authority;
import org.thingsboard.client.model.Customer;
import org.thingsboard.client.model.Dashboard;
import org.thingsboard.client.model.Device;
import org.thingsboard.client.model.EntityGroup;
import org.thingsboard.client.model.EntityGroupInfo;
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.EntityType;
import org.thingsboard.client.model.JwtPair;
import org.thingsboard.client.model.MobileSessionInfo;
import org.thingsboard.client.model.PageDataUser;
import org.thingsboard.client.model.PageDataUserEmailInfo;
import org.thingsboard.client.model.PageDataUserInfo;
import org.thingsboard.client.model.User;
import org.thingsboard.client.model.UserActivationLink;
import org.thingsboard.client.model.UserDashboardsInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class UserApiTest extends AbstractApiTest {

    @Test
    void testUserLifecycle() throws Exception {
        long timestamp = System.currentTimeMillis();
        List<User> createdUsers = new ArrayList<>();

        // create 3 tenant admin users
        for (int i = 0; i < 3; i++) {
            User user = new User();
            String email = ((i % 2 == 0) ? TEST_PREFIX : TEST_PREFIX_2) + timestamp + "_" + i + "@test.com";
            user.setEmail(email);
            user.setAuthority(Authority.TENANT_ADMIN);
            user.setTenantId(savedTenant.getId());
            user.setFirstName("First" + i);
            user.setLastName("Last" + i);

            User createdUser = client.saveUser(user, "false", null, null);
            assertNotNull(createdUser);
            assertNotNull(createdUser.getId());
            assertEquals(email, createdUser.getEmail());
            assertEquals(Authority.TENANT_ADMIN, createdUser.getAuthority());

            createdUsers.add(createdUser);
        }

        // find all tenant admins, check count (20 created + 1 from setup)
        PageDataUser allUsers = client.getUserUsers(100, 0, null, null, null);
        assertNotNull(allUsers);
        assertNotNull(allUsers.getData());
        int initialSize = allUsers.getData().size();
        assertEquals(6, initialSize, "Expected 6 users (3 created + 3 from setup), but got " + initialSize);

        // find with search text, check count
        PageDataUser filteredUsers = client.getUserUsers(100, 0, TEST_PREFIX_2, null, null);
        assertEquals(1, filteredUsers.getData().size(), "Expected exactly 1 users matching prefix");

        // find by id
        User searchUser = createdUsers.get(2);
        User fetchedUser = client.getUserById(searchUser.getId().getId().toString());
        assertEquals(searchUser.getEmail(), fetchedUser.getEmail());
        assertEquals(searchUser.getFirstName(), fetchedUser.getFirstName());

        // update user
        fetchedUser.setFirstName("UpdatedFirst");
        fetchedUser.setLastName("UpdatedLast");
        User updatedUser = client.saveUser(fetchedUser, "false", null, null);
        assertEquals("UpdatedFirst", updatedUser.getFirstName());
        assertEquals("UpdatedLast", updatedUser.getLastName());

        // activate user and get token
        activateUser(createdUsers.get(0).getId(), "password123", false);
        JwtPair userToken = client.getUserToken(createdUsers.get(0).getId().getId().toString());
        assertNotNull(userToken);
        assertNotNull(userToken.getToken());

        // disable user credentials
        client.setUserCredentialsEnabled(createdUsers.get(0).getId().getId().toString(), "false");

        // re-enable user credentials
        client.setUserCredentialsEnabled(createdUsers.get(0).getId().getId().toString(), "true");

        // create customer users and verify listing
        Customer customer2 = new Customer();
        customer2.setTitle("User test customer " + timestamp);
        customer2.setEmail("usertest_" + timestamp + "@test.com");
        Customer savedCustomer2 = client.saveCustomer(customer2, null, null, null, null, null);

        List<User> customerUsers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            User customerUser = new User();
            customerUser.setEmail("custuser_" + timestamp + "_" + i + "@test.com");
            customerUser.setAuthority(Authority.CUSTOMER_USER);
            customerUser.setTenantId(savedTenant.getId());
            customerUser.setCustomerId(savedCustomer2.getId());
            customerUser.setFirstName("CustFirst" + i);
            customerUser.setLastName("CustLast" + i);

            User created = client.saveUser(customerUser, "false", null, null);
            assertNotNull(created);
            customerUsers.add(created);
        }

        // list customer users
        PageDataUser customerUserPage = client.getCustomerUsers(
                savedCustomer2.getId().getId().toString(), 100, 0, null, null, null);
        assertEquals(3, customerUserPage.getData().size(), "Expected 5 customer users");

        // delete user
        UUID userToDeleteId = createdUsers.get(0).getId().getId();
        client.deleteUser(userToDeleteId.toString());

        // verify deletion
        PageDataUser usersAfterDelete = client.getUserUsers(100, 0, null, null, null);
        assertEquals(initialSize + 3 - 1, usersAfterDelete.getData().size());

        assertReturns404(() ->
                client.getUserById(userToDeleteId.toString())
        );
    }

    @Test
    void testIsUserTokenAccessEnabled() throws Exception {
        Boolean enabled = client.isUserTokenAccessEnabled();
        assertTrue(enabled);
    }

    @Test
    void testGetActivationLink() throws Exception {
        long ts = System.currentTimeMillis();

        User user = new User();
        user.setAuthority(Authority.TENANT_ADMIN);
        user.setTenantId(savedTenant.getId());
        user.setEmail("activation_" + ts + "@test.com");
        User created = client.saveUser(user, "false", null, null);
        String userId = created.getId().getId().toString();

        // getActivationLink returns the activation URL string
        String link = client.getActivationLink(userId);
        assertTrue(link.startsWith("http://localhost:8080/api/noauth/activate?activateToken="));

        // getActivationLinkInfo returns the link with TTL metadata
        UserActivationLink linkInfo = client.getActivationLinkInfo(userId);
        assertTrue(linkInfo.getValue().startsWith("http://localhost:8080/api/noauth/activate?activateToken="));
        assertNotNull(linkInfo.getValue());
    }

    @Test
    void testGetAllUserInfos() throws Exception {
        // setUp creates: tenantAdmin + savedCustomerUser + savedSubCustomerUser = 3
        PageDataUserInfo allIncludingCustomers = client.getAllUserInfos(100, 0, true, null, null, null);
        assertNotNull(allIncludingCustomers);
        assertEquals(3, allIncludingCustomers.getTotalElements().intValue());

        // without customer users, only tenant admins should be returned
        PageDataUserInfo tenantAdminsOnly = client.getAllUserInfos(100, 0, false, null, null, null);
        assertNotNull(tenantAdminsOnly);
        assertEquals(1, tenantAdminsOnly.getTotalElements().intValue());
    }

    @Test
    void testGetCustomerUserInfos() throws Exception {
        // savedCustomer has one direct user: savedCustomerUser
        PageDataUserInfo result = client.getCustomerUserInfos(
                savedCustomer.getId().getId().toString(), 100, 0, false, null, null, null);
        assertNotNull(result);
        assertEquals(1, result.getTotalElements().intValue());

        // with includeCustomers=true the sub-customer user is also included
        PageDataUserInfo withSubcustomers = client.getCustomerUserInfos(
                savedCustomer.getId().getId().toString(), 100, 0, true, null, null, null);
        assertNotNull(withSubcustomers);
        assertEquals(2, withSubcustomers.getTotalElements().intValue());
    }

    @Test
    void testGetUsersByIdsV2() throws Exception {
        long ts = System.currentTimeMillis();

        User user = new User();
        user.setAuthority(Authority.TENANT_ADMIN);
        user.setTenantId(savedTenant.getId());
        user.setEmail("byids_" + ts + "@test.com");
        User created = client.saveUser(user, "false", null, null);

        List<User> result = client.getUsersByIds(List.of(created.getId().getId().toString()));
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(created.getId().getId(), result.get(0).getId().getId());
    }

    @Test
    void testGetUsersForAssign() throws Exception {
        long ts = System.currentTimeMillis();

        Device device = client.saveDevice(
                new Device().name("alarmDev_" + ts).type("default"),
                null, null, null, null, null, null);

        Alarm alarm = client.saveAlarm(new Alarm()
                .type("TestAlarm")
                .originator(new EntityId().id(device.getId().getId()).entityType(EntityType.DEVICE))
                .severity(AlarmSeverity.WARNING)
                .acknowledged(false)
                .cleared(false));

        PageDataUserEmailInfo result = client.getUsersForAssign(
                alarm.getId().getId().toString(), 100, 0, null, null, null);
        assertNotNull(result);
        assertNotNull(result.getData());
    }

    @Test
    void testGetUsersByEntityGroupId() throws Exception {
        long ts = System.currentTimeMillis();

        EntityGroup group = new EntityGroup();
        group.setType(EntityGroup.TypeEnum.USER);
        group.setName("Test User Group " + ts);
        EntityGroupInfo savedGroup = client.saveEntityGroup(group);

        User user = new User();
        user.setAuthority(Authority.TENANT_ADMIN);
        user.setTenantId(savedTenant.getId());
        user.setEmail("ugtest_" + ts + "@test.com");
        User created = client.saveUser(user, "false", null, null);
        client.addEntitiesToEntityGroup(
                savedGroup.getId().getId().toString(),
                List.of(created.getId().getId().toString()));

        PageDataUser result = client.getUsersByEntityGroupId(
                savedGroup.getId().getId().toString(), 100, 0, null, null, null);
        assertNotNull(result);
        assertEquals(1, result.getData().size());
        assertEquals(created.getId().getId(), result.getData().get(0).getId().getId());
    }

    @Test
    void testUserSettings() throws Exception {
        // saveUserSettings persists general settings and returns the saved map
        JsonNode saved = client.saveUserSettings(
                Map.<String, Object>of("settingKey", "settingValue"));
        assertNotNull(saved);

        // getGeneralUserSettings returns the previously saved general settings
        JsonNode general = client.getGeneralUserSettings();
        assertNotNull(general);
        assertEquals("settingValue", general.get("settingKey").asText());

        // putGeneralUserSettings merges additional keys into general settings
        client.putGeneralUserSettings(Map.<String, Object>of("extraKey", "extraValue"));
        JsonNode updatedGeneral = client.getGeneralUserSettings();
        assertNotNull(updatedGeneral);
        assertEquals("extraValue", updatedGeneral.get("extraKey").asText());

        // putUserSettings + getUserSettings: typed settings
        String settingsType = "GETTING_STARTED";
        client.putUserSettings(settingsType, Map.<String, Object>of("x", "1", "y", "2"));

        JsonNode typed = client.getUserSettings(settingsType);
        assertNotNull(typed);
        assertEquals("1", typed.get("x").asText());
        assertEquals("2", typed.get("y").asText());

        // deleteUserSettings removes a specific key from a typed settings section
        client.deleteUserSettingsByType("x", settingsType);
        JsonNode afterDelete = client.getUserSettings(settingsType);
        assertNotNull(afterDelete);
        assertFalse(afterDelete.has("x"));
        assertTrue(afterDelete.has("y"));
    }

    @Test
    void testDashboardTracking() throws Exception {
        long ts = System.currentTimeMillis();

        Dashboard dashboard = client.saveDashboard(
                new Dashboard().title("Track_" + ts), null, null, null);

        // reportUserDashboardAction "visit" records the visit and returns current state
        UserDashboardsInfo afterVisit = client.reportUserDashboardAction(
                dashboard.getId().getId().toString(), "visit");
        assertNotNull(afterVisit);
        assertNotNull(afterVisit.getLast());
        assertFalse(afterVisit.getLast().isEmpty());

        // getLastVisitedDashboards returns the same recently visited dashboards
        UserDashboardsInfo lastVisited = client.getLastVisitedDashboards();
        assertNotNull(lastVisited);
        assertFalse(lastVisited.getLast().isEmpty());

        // "star" marks the dashboard as starred
        UserDashboardsInfo afterStar = client.reportUserDashboardAction(
                dashboard.getId().getId().toString(), "star");
        assertNotNull(afterStar);
        assertNotNull(afterStar.getStarred());
        assertFalse(afterStar.getStarred().isEmpty());

        // "unstar" removes the dashboard from starred list
        UserDashboardsInfo afterUnstar = client.reportUserDashboardAction(
                dashboard.getId().getId().toString(), "unstar");
        assertNotNull(afterUnstar);
        assertTrue(afterUnstar.getStarred().isEmpty());
    }

    @Test
    void testMobileSession() throws Exception {
        long ts = System.currentTimeMillis();
        String mobileToken = "test-mobile-" + ts;
        MobileSessionInfo session = new MobileSessionInfo().fcmTokenTimestamp(ts);

        // saveMobileSession stores a session keyed by the mobile token header
        client.saveMobileSession(mobileToken, session);

        // getMobileSession retrieves the stored session
        MobileSessionInfo retrieved = client.getMobileSession(mobileToken);
        assertNotNull(retrieved);
        assertEquals(ts, retrieved.getFcmTokenTimestamp());

        // removeMobileSession deletes the session
        client.removeMobileSession(mobileToken);
        MobileSessionInfo mobileSession = client.getMobileSession(mobileToken);
        assertNull(mobileSession);
    }

}

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
import org.thingsboard.client.model.EntityGroup;
import org.thingsboard.client.model.EntityGroupId;
import org.thingsboard.client.model.EntityGroupInfo;
import org.thingsboard.client.model.EntityInfo;
import org.thingsboard.client.model.EntityType;
import org.thingsboard.client.model.GroupPermission;
import org.thingsboard.client.model.GroupPermissionInfo;
import org.thingsboard.client.model.Role;
import org.thingsboard.client.model.RoleId;
import org.thingsboard.client.model.RoleType;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GroupPermissionApiTest extends AbstractApiTest {

    private Role createRole(String name) throws ApiException {
        Role role = new Role();
        role.setName(name);
        role.setType(RoleType.GROUP);
        return tbApi.saveRole(role);
    }

    private EntityGroupInfo createDeviceGroup(String name) throws ApiException {
        EntityGroup group = new EntityGroup();
        group.setName(name);
        group.setType(EntityGroup.TypeEnum.DEVICE);
        return tbApi.saveEntityGroup(group);
    }

    private GroupPermission buildPermission(String userGroupId, String roleId, String entityGroupId) {
        GroupPermission permission = new GroupPermission();
        permission.setUserGroupId(new EntityGroupId().id(UUID.fromString(userGroupId)).entityType(EntityType.ENTITY_GROUP));
        permission.setRoleId(new RoleId().id(UUID.fromString(roleId)).entityType(EntityType.ROLE));
        permission.setEntityGroupId(new EntityGroupId().id(UUID.fromString(entityGroupId)).entityType(EntityType.ENTITY_GROUP));
        permission.setEntityGroupType(EntityType.DEVICE);
        return permission;
    }

    private String customerAdminGroupId() throws ApiException {
        EntityInfo info = tbApi.getEntityGroupEntityInfosByOwnerAndTypeAndPageLink(
                "CUSTOMER", savedCustomer.getId().getId().toString(), "USER",
                "1", "0", "Customer Administrators", null, null).getData().get(0);
        return info.getId().getId().toString();
    }

    // -------------------------------------------------------------------------
    // Lifecycle: saveGroupPermission, getGroupPermissionById,
    //            getGroupPermissionInfoById, deleteGroupPermission
    // -------------------------------------------------------------------------

    @Test
    void testGroupPermissionLifecycle() throws ApiException {
        long ts = System.currentTimeMillis();

        Role role = createRole(TEST_PREFIX + ts + "_role");
        String roleId = role.getId().getId().toString();

        EntityGroupInfo deviceGroup = createDeviceGroup(TEST_PREFIX + ts + "_devices");
        String deviceGroupId = deviceGroup.getId().getId().toString();

        String userGroupId = customerAdminGroupId();

        // saveGroupPermission (create)
        GroupPermission saved = tbApi.saveGroupPermission(buildPermission(userGroupId, roleId, deviceGroupId));
        assertNotNull(saved);
        assertNotNull(saved.getId());
        String permissionId = saved.getId().getId().toString();

        // getGroupPermissionById
        GroupPermission fetched = tbApi.getGroupPermissionById(permissionId);
        assertNotNull(fetched);
        assertEquals(permissionId, fetched.getId().getId().toString());
        assertEquals(userGroupId, fetched.getUserGroupId().getId().toString());
        assertEquals(roleId, fetched.getRoleId().getId().toString());
        assertEquals(deviceGroupId, fetched.getEntityGroupId().getId().toString());

        // getGroupPermissionInfoById — entity-group side (isUserGroup = false)
        GroupPermissionInfo infoEntity = tbApi.getGroupPermissionInfoById(permissionId, false);
        assertNotNull(infoEntity);
        assertEquals(permissionId, infoEntity.getId().getId().toString());
        assertNotNull(infoEntity.getRole());
        assertNotNull(infoEntity.getUserGroupName());

        // getGroupPermissionInfoById — user-group side (isUserGroup = true)
        GroupPermissionInfo infoUser = tbApi.getGroupPermissionInfoById(permissionId, true);
        assertNotNull(infoUser);
        assertEquals(permissionId, infoUser.getId().getId().toString());
        assertNotNull(infoUser.getEntityGroupName());

        // deleteGroupPermission
        tbApi.deleteGroupPermission(permissionId);
        assertReturns404(() -> tbApi.getGroupPermissionById(permissionId));

        tbApi.deleteEntityGroup(deviceGroupId);
        tbApi.deleteRole(roleId);
    }

    // -------------------------------------------------------------------------
    // getUserGroupPermissions, getEntityGroupPermissions,
    // loadUserGroupPermissionInfos
    // -------------------------------------------------------------------------

    @Test
    void testGetPermissionsByGroupIds() throws ApiException {
        long ts = System.currentTimeMillis();

        Role role = createRole(TEST_PREFIX + ts + "_role");
        String roleId = role.getId().getId().toString();

        EntityGroupInfo deviceGroup = createDeviceGroup(TEST_PREFIX + ts + "_devices");
        String deviceGroupId = deviceGroup.getId().getId().toString();

        String userGroupId = customerAdminGroupId();

        GroupPermission saved = tbApi.saveGroupPermission(buildPermission(userGroupId, roleId, deviceGroupId));
        String permissionId = saved.getId().getId().toString();

        // getUserGroupPermissions
        List<GroupPermissionInfo> userGroupPermissions = tbApi.getUserGroupPermissions(userGroupId);
        assertNotNull(userGroupPermissions);
        assertTrue(userGroupPermissions.stream()
                .anyMatch(p -> p.getId().getId().toString().equals(permissionId)));

        // getEntityGroupPermissions
        List<GroupPermissionInfo> entityGroupPermissions = tbApi.getEntityGroupPermissions(deviceGroupId);
        assertNotNull(entityGroupPermissions);
        assertTrue(entityGroupPermissions.stream()
                .anyMatch(p -> p.getId().getId().toString().equals(permissionId)));

        // loadUserGroupPermissionInfos
        List<GroupPermissionInfo> loaded = tbApi.loadUserGroupPermissionInfos(List.of(saved));
        assertNotNull(loaded);
        assertFalse(loaded.isEmpty());
        assertTrue(loaded.stream()
                .anyMatch(p -> p.getId().getId().toString().equals(permissionId)));

        tbApi.deleteGroupPermission(permissionId);
        tbApi.deleteEntityGroup(deviceGroupId);
        tbApi.deleteRole(roleId);
    }

    // -------------------------------------------------------------------------
    // Not found
    // -------------------------------------------------------------------------

    @Test
    void testGetGroupPermissionByIdNotFound() {
        assertReturns404(() -> tbApi.getGroupPermissionById(UUID.randomUUID().toString()));
    }

}

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
import org.thingsboard.client.model.Edge;
import org.thingsboard.client.model.EntityGroup;
import org.thingsboard.client.model.EntityGroupId;
import org.thingsboard.client.model.EntityGroupInfo;
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.EntityInfo;
import org.thingsboard.client.model.EntityType;
import org.thingsboard.client.model.GroupPermissionInfo;
import org.thingsboard.client.model.PageDataContactBasedObject;
import org.thingsboard.client.model.PageDataEntityGroupInfo;
import org.thingsboard.client.model.PageDataEntityInfo;
import org.thingsboard.client.model.PageDataShortEntityView;
import org.thingsboard.client.model.Role;
import org.thingsboard.client.model.RoleType;
import org.thingsboard.client.model.ShareGroupRequest;
import org.thingsboard.client.model.ShortEntityView;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EntityGroupApiTest extends AbstractApiTest {

    private static final String DEVICE_TYPE = "DEVICE";
    private static final String CUSTOMER_TYPE = "CUSTOMER";

    private EntityGroup buildGroup(String name, String type) {
        EntityGroup group = new EntityGroup();
        group.setName(name);
        group.setType(EntityGroup.TypeEnum.valueOf(type));
        return group;
    }

    private String tenantId() {
        return savedTenant.getId().getId().toString();
    }

    private String customerId() {
        return savedCustomer.getId().getId().toString();
    }

    // -------------------------------------------------------------------------
    // Lifecycle
    // -------------------------------------------------------------------------

    @Test
    void testEntityGroupLifecycle() throws ApiException {
        long ts = System.currentTimeMillis();
        String name = TEST_PREFIX + ts;

        // saveEntityGroup (create)
        EntityGroup entityGroup = buildGroup(name, DEVICE_TYPE);
        EntityGroupInfo created = client.saveEntityGroup(entityGroup);
        assertNotNull(created);
        assertNotNull(created.getId());
        assertEquals(name, created.getName());
        String groupId = created.getId().getId().toString();

        // getEntityGroupById
        EntityGroupInfo fetched = client.getEntityGroupById(groupId);
        assertEquals(groupId, fetched.getId().getId().toString());
        assertEquals(name, fetched.getName());

        // getEntityGroupEntityInfoById
        EntityInfo entityInfo = client.getEntityGroupEntityInfoById(groupId);
        assertNotNull(entityInfo);
        assertEquals(groupId, entityInfo.getId().getId().toString());

        // getEntityGroupByOwnerAndNameAndType
        EntityGroupInfo byName = client.getEntityGroupByOwnerAndNameAndType(
                "TENANT", tenantId(), DEVICE_TYPE, name);
        assertEquals(groupId, byName.getId().getId().toString());

        // deleteEntityGroup
        client.deleteEntityGroup(groupId);
        assertReturns404(() -> client.getEntityGroupById(groupId));
    }

    // -------------------------------------------------------------------------
    // List by type (tenant-scoped)
    // -------------------------------------------------------------------------

    @Test
    void testGetEntityGroupsByType() throws ApiException {
        long ts = System.currentTimeMillis();
        List<String> ids = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            ids.add(client.saveEntityGroup(buildGroup(TEST_PREFIX + ts + "_" + i, DEVICE_TYPE))
                    .getId().getId().toString());
        }

        // getAllEntityGroupsByType
        List<EntityGroupInfo> all = client.getAllEntityGroupsByType(DEVICE_TYPE, null);
        assertNotNull(all);
        assertTrue(all.size() >= 3);

        // getEntityGroupsByTypeAndPageLink
        PageDataEntityGroupInfo page = client.getEntityGroupsByTypeAndPageLink(
                DEVICE_TYPE, "100", "0", null, null, null, null);
        assertNotNull(page);
        assertTrue(page.getTotalElements() >= 3);

        // getEntityGroupEntityInfosByTypeAndPageLink
        PageDataEntityInfo infoPage = client.getEntityGroupEntityInfosByTypeAndPageLink(
                DEVICE_TYPE, "100", "0", null, null, null, null);
        assertNotNull(infoPage);
        assertTrue(infoPage.getTotalElements() >= 3);

        for (String id : ids) client.deleteEntityGroup(id);
    }

    // -------------------------------------------------------------------------
    // List by owner
    // -------------------------------------------------------------------------

    @Test
    void testGetEntityGroupsByOwner() throws ApiException {
        long ts = System.currentTimeMillis();
        List<String> ids = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            ids.add(client.saveEntityGroup(buildGroup(TEST_PREFIX + ts + "_" + i, DEVICE_TYPE))
                    .getId().getId().toString());
        }

        // getAllEntityGroupsByOwnerAndType
        List<EntityGroupInfo> all = client.getAllEntityGroupsByOwnerAndType("TENANT", tenantId(), DEVICE_TYPE);
        assertNotNull(all);
        assertTrue(all.size() >= 3);

        // getEntityGroupsByOwnerAndTypeAndPageLink
        PageDataEntityGroupInfo page = client.getEntityGroupsByOwnerAndTypeAndPageLink(
                "TENANT", tenantId(), DEVICE_TYPE, "100", "0", null, null, null);
        assertNotNull(page);
        assertTrue(page.getTotalElements() >= 3);

        // getEntityGroupEntityInfosByOwnerAndTypeAndPageLink
        PageDataEntityInfo infoPage = client.getEntityGroupEntityInfosByOwnerAndTypeAndPageLink(
                "TENANT", tenantId(), DEVICE_TYPE, "100", "0", null, null, null);
        assertNotNull(infoPage);
        assertTrue(infoPage.getTotalElements() >= 3);

        // getEntityGroupAllByOwnerAndType — the auto-created "All" group
        EntityGroupInfo allGroup = client.getEntityGroupAllByOwnerAndType("TENANT", tenantId(), DEVICE_TYPE);
        assertNotNull(allGroup);
        assertTrue(allGroup.getGroupAll(), "Expected the 'All' group to have groupAll=true");

        for (String id : ids) client.deleteEntityGroup(id);
    }

    // -------------------------------------------------------------------------
    // Hierarchy
    // -------------------------------------------------------------------------

    @Test
    void testGetEntityGroupsHierarchy() throws ApiException {
        long ts = System.currentTimeMillis();
        EntityGroupInfo group = client.saveEntityGroup(buildGroup(TEST_PREFIX + ts, DEVICE_TYPE));
        String groupId = group.getId().getId().toString();

        // getEntityGroupsHierarchyByOwnerAndTypeAndPageLink
        PageDataEntityGroupInfo hierarchy = client.getEntityGroupsHierarchyByOwnerAndTypeAndPageLink(
                "TENANT", tenantId(), DEVICE_TYPE, "100", "0", null, null, null);
        assertNotNull(hierarchy);
        assertNotNull(hierarchy.getData());
        assertTrue(hierarchy.getData().stream().anyMatch(g -> g.getId().getId().toString().equals(groupId)));

        // getEntityGroupEntityInfosHierarchyByOwnerAndTypeAndPageLink
        PageDataEntityInfo infoHierarchy = client.getEntityGroupEntityInfosHierarchyByOwnerAndTypeAndPageLink(
                "TENANT", tenantId(), DEVICE_TYPE, "100", "0", null, null, null);
        assertNotNull(infoHierarchy);
        assertNotNull(infoHierarchy.getData());
        assertTrue(infoHierarchy.getData().stream()
                .anyMatch(i -> i.getId().getId().toString().equals(groupId)));

        client.deleteEntityGroup(groupId);
    }

    // -------------------------------------------------------------------------
    // Membership
    // -------------------------------------------------------------------------

    @Test
    void testEntityGroupMembership() throws ApiException {
        long ts = System.currentTimeMillis();

        // Use a CUSTOMER group so we can add savedCustomer as a member
        EntityGroupInfo group = client.saveEntityGroup(buildGroup(TEST_PREFIX + ts, CUSTOMER_TYPE));
        String groupId = group.getId().getId().toString();
        String memberCustomerId = customerId();

        // addEntitiesToEntityGroup
        client.addEntitiesToEntityGroup(groupId, List.of(memberCustomerId));

        // getEntities — paginated list of members
        PageDataShortEntityView members = client.getEntities(groupId, "100", "0", null, null, null);
        assertNotNull(members);
        assertEquals(1, members.getData().size());
        assertEquals(memberCustomerId, members.getData().get(0).getId().getId().toString());

        // getGroupEntity — single member view
        ShortEntityView member = client.getGroupEntity(groupId, memberCustomerId);
        assertNotNull(member);
        assertEquals(memberCustomerId, member.getId().getId().toString());

        // getEntityGroupsForEntity — groups the customer belongs to
        List<EntityGroupId> customerGroups = client.getEntityGroupsForEntity("CUSTOMER", memberCustomerId);
        assertNotNull(customerGroups);
        assertTrue(customerGroups.stream().anyMatch(id -> id.getId().toString().equals(groupId)));

        // removeEntitiesFromEntityGroup
        client.removeEntitiesFromEntityGroup(groupId, List.of(memberCustomerId));
        PageDataShortEntityView afterRemove = client.getEntities(groupId, "100", "0", null, null, null);
        assertEquals(0, afterRemove.getData().size());

        client.deleteEntityGroup(groupId);
    }

    // -------------------------------------------------------------------------
    // Fetch by IDs
    // -------------------------------------------------------------------------

    @Test
    void testGetEntityGroupsByIds() throws ApiException {
        long ts = System.currentTimeMillis();
        EntityGroupInfo g1 = client.saveEntityGroup(buildGroup(TEST_PREFIX + ts + "_a", DEVICE_TYPE));
        EntityGroupInfo g2 = client.saveEntityGroup(buildGroup(TEST_PREFIX + ts + "_b", DEVICE_TYPE));
        String id1 = g1.getId().getId().toString();
        String id2 = g2.getId().getId().toString();

        // getEntityGroupsByIdsV2
        List<EntityGroupInfo> byIds = client.getEntityGroupsByIds(List.of(id1, id2));
        assertNotNull(byIds);
        assertEquals(2, byIds.size());
        assertTrue(byIds.stream().anyMatch(g -> g.getId().getId().toString().equals(id1)));
        assertTrue(byIds.stream().anyMatch(g -> g.getId().getId().toString().equals(id2)));

        // getEntityGroupEntityInfosByIds
        List<EntityInfo> infosByIds = client.getEntityGroupEntityInfosByIds(List.of(id1, id2));
        assertNotNull(infosByIds);
        assertEquals(2, infosByIds.size());

        client.deleteEntityGroup(id1);
        client.deleteEntityGroup(id2);
    }

    // -------------------------------------------------------------------------
    // Public / shared groups
    // -------------------------------------------------------------------------

    @Test
    void testPublicAndSharedGroups() throws ApiException {
        long ts = System.currentTimeMillis();
        EntityGroupInfo group = client.saveEntityGroup(buildGroup(TEST_PREFIX + ts, DEVICE_TYPE));
        String groupId = group.getId().getId().toString();

        // makeEntityGroupPublic — group becomes visible as shared
        client.makeEntityGroupPublic(groupId);

        GroupPermissionInfo entityGroupPermissions = client.getEntityGroupPermissions(groupId).get(0);
        assertTrue(entityGroupPermissions.getPublic());

        // makeEntityGroupPrivate — reverts the public share
        client.makeEntityGroupPrivate(groupId);
        List<EntityGroupInfo> afterPrivate = client.getAllSharedEntityGroups(DEVICE_TYPE);
        assertTrue(afterPrivate.stream().noneMatch(g -> g.getId().getId().toString().equals(groupId)));

        List<GroupPermissionInfo> entityGroupPermissions1 = client.getEntityGroupPermissions(groupId);
        assertTrue(entityGroupPermissions1.isEmpty());

        client.deleteEntityGroup(groupId);
    }

    // -------------------------------------------------------------------------
    // Share with user groups
    // -------------------------------------------------------------------------

    @Test
    void testShareEntityGroup() throws ApiException {
        long ts = System.currentTimeMillis();

        // Create a role for fine-grained sharing
        Role role = new Role();
        role.setName(TEST_PREFIX + ts + "_role");
        role.setType(RoleType.GENERIC);
        Role savedRole = client.saveRole(role);
        String roleId = savedRole.getId().getId().toString();

        // shareEntityGroup — broad share with allUserGroup=true
        EntityGroupInfo broadGroup = client.saveEntityGroup(buildGroup(TEST_PREFIX + ts + "_broad", DEVICE_TYPE));
        String broadGroupId = broadGroup.getId().getId().toString();
        ShareGroupRequest shareRequest = new ShareGroupRequest();
        shareRequest.setAllUserGroup(true);
        shareRequest.setOwnerId(new EntityId().id(savedCustomer.getId().getId()).entityType(EntityType.CUSTOMER));
        client.shareEntityGroup(broadGroupId, shareRequest);

        // shareEntityGroupToChildOwnerUserGroup — share with the customer admin group via role
        EntityGroupInfo specificGroup = client.saveEntityGroup(buildGroup(TEST_PREFIX + ts + "_specific", DEVICE_TYPE));
        String specificGroupId = specificGroup.getId().getId().toString();
        EntityInfo customerAdminGroup = client.getEntityGroupEntityInfosByOwnerAndTypeAndPageLink(
                "CUSTOMER", customerId(), "USER", "1", "0", "Customer Administrators", null, null
        ).getData().get(0);
        String customerAdminGroupId = customerAdminGroup.getId().getId().toString();
        client.shareEntityGroupToChildOwnerUserGroup(specificGroupId, customerAdminGroupId, roleId);

        // Cleanup
        client.deleteEntityGroup(broadGroupId);
        client.deleteEntityGroup(specificGroupId);
        client.deleteRole(roleId);
    }

    // -------------------------------------------------------------------------
    // Owners
    // -------------------------------------------------------------------------

    @Test
    void testOwnerMethods() throws ApiException {
        // getOwners — list of tenants/customers visible to the tenant admin
        PageDataContactBasedObject owners = client.getOwners("100", "0", null, null, null);
        assertNotNull(owners);
        assertNotNull(owners.getData());
        assertFalse(owners.getData().isEmpty());

        // getOwnerInfos — EntityInfo list of owners
        PageDataEntityInfo ownerInfos = client.getOwnerInfos("100", "0", null, null, null);
        assertNotNull(ownerInfos);
        assertNotNull(ownerInfos.getData());
        assertFalse(ownerInfos.getData().isEmpty());

        // getOwnerInfo — tenant
        EntityInfo tenantInfo = client.getOwnerInfo("TENANT", tenantId());
        assertNotNull(tenantInfo);
        assertEquals(tenantId(), tenantInfo.getId().getId().toString());

        // getOwnerInfo — customer
        EntityInfo customerInfo = client.getOwnerInfo("CUSTOMER", customerId());
        assertNotNull(customerInfo);
        assertEquals(customerId(), customerInfo.getId().getId().toString());
    }

    // -------------------------------------------------------------------------
    // Edge assignment
    // -------------------------------------------------------------------------

    @Test
    void testEdgeMethods() throws ApiException {
        long ts = System.currentTimeMillis();

        // Create an edge
        Edge edge = new Edge();
        edge.setName(TEST_PREFIX + ts + "_edge");
        edge.setType("default");
        edge.setSecret("edgeSecret");
        edge.setEdgeLicenseKey("edgeLicenseKey");
        edge.setCloudEndpoint("http://localhost:8080");
        edge.setRoutingKey("routing");
        Edge savedEdge = client.saveEdge(edge, null, null);
        assertNotNull(savedEdge);
        String edgeId = savedEdge.getId().getId().toString();

        // Create a DEVICE entity group
        EntityGroupInfo group = client.saveEntityGroup(buildGroup(TEST_PREFIX + ts, DEVICE_TYPE));
        String groupId = group.getId().getId().toString();

        // assignEntityGroupToEdge
        EntityGroup assigned = client.assignEntityGroupToEdge(edgeId, DEVICE_TYPE, groupId);
        assertNotNull(assigned);
        assertEquals(groupId, assigned.getId().getId().toString());

        // getAllEdgeEntityGroups
        List<EntityGroupInfo> allEdgeGroups = client.getAllEdgeEntityGroups(edgeId, DEVICE_TYPE);
        assertNotNull(allEdgeGroups);
        assertTrue(allEdgeGroups.stream().anyMatch(g -> g.getId().getId().toString().equals(groupId)));

        // getEdgeEntityGroups — paginated
        PageDataEntityGroupInfo edgeGroupsPage = client.getEdgeEntityGroups(
                edgeId, DEVICE_TYPE, "100", "0", null, null, null);
        assertNotNull(edgeGroupsPage);
        assertTrue(edgeGroupsPage.getData().stream().anyMatch(g -> g.getId().getId().toString().equals(groupId)));

        // unassignEntityGroupFromEdge
        EntityGroup unassigned = client.unassignEntityGroupFromEdge(edgeId, DEVICE_TYPE, groupId);
        assertNotNull(unassigned);
        List<EntityGroupInfo> afterUnassign = client.getAllEdgeEntityGroups(edgeId, DEVICE_TYPE);
        assertTrue(afterUnassign.stream().noneMatch(g -> g.getId().getId().toString().equals(groupId)));

        // Cleanup
        client.deleteEntityGroup(groupId);
        client.deleteEdge(edgeId);
    }

}

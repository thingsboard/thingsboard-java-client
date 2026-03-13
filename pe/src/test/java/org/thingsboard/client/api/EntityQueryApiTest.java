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
import org.thingsboard.client.model.AliasEntityId;
import org.thingsboard.client.model.ApiUsageStateFilter;
import org.thingsboard.client.model.Asset;
import org.thingsboard.client.model.AssetSearchQueryFilter;
import org.thingsboard.client.model.AssetTypeFilter;
import org.thingsboard.client.model.Device;
import org.thingsboard.client.model.DeviceSearchQueryFilter;
import org.thingsboard.client.model.DeviceTypeFilter;
import org.thingsboard.client.model.Direction;
import org.thingsboard.client.model.Edge;
import org.thingsboard.client.model.EdgeSearchQueryFilter;
import org.thingsboard.client.model.EdgeTypeFilter;
import org.thingsboard.client.model.EntitiesByGroupNameFilter;
import org.thingsboard.client.model.EntityData;
import org.thingsboard.client.model.EntityDataPageLink;
import org.thingsboard.client.model.EntityDataQuery;
import org.thingsboard.client.model.EntityDataSortOrder;
import org.thingsboard.client.model.EntityGroup;
import org.thingsboard.client.model.EntityGroupFilter;
import org.thingsboard.client.model.EntityGroupInfo;
import org.thingsboard.client.model.EntityGroupListFilter;
import org.thingsboard.client.model.EntityGroupNameFilter;
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.EntityKey;
import org.thingsboard.client.model.EntityKeyType;
import org.thingsboard.client.model.EntityKeyValueType;
import org.thingsboard.client.model.EntityListFilter;
import org.thingsboard.client.model.EntityNameFilter;
import org.thingsboard.client.model.EntityRelation;
import org.thingsboard.client.model.EntitySearchDirection;
import org.thingsboard.client.model.EntityType;
import org.thingsboard.client.model.EntityTypeFilter;
import org.thingsboard.client.model.EntityView;
import org.thingsboard.client.model.EntityViewSearchQueryFilter;
import org.thingsboard.client.model.EntityViewTypeFilter;
import org.thingsboard.client.model.FilterPredicateValueString;
import org.thingsboard.client.model.KeyFilter;
import org.thingsboard.client.model.PageDataEntityData;
import org.thingsboard.client.model.RelationEntityTypeFilter;
import org.thingsboard.client.model.RelationTypeGroup;
import org.thingsboard.client.model.RelationsQueryFilter;
import org.thingsboard.client.model.SingleEntityFilter;
import org.thingsboard.client.model.StringFilterPredicate;
import org.thingsboard.client.model.StringOperation;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EntityQueryApiTest extends AbstractApiTest {

    private static final String QUERY_TEST_PREFIX = "QueryTest_";

    private EntityDataPageLink pageLink(int pageSize) {
        return new EntityDataPageLink()
                .pageSize(pageSize)
                .page(0)
                .sortOrder(new EntityDataSortOrder()
                        .key(new EntityKey().type(EntityKeyType.ENTITY_FIELD).key("name"))
                        .direction(Direction.ASC));
    }

    @Test
    void testFindByDeviceTypeFilter() throws Exception {
        long ts = System.currentTimeMillis();
        String type1 = "temperatureSensor";
        String type2 = "humiditySensor";

        for (int i = 0; i < 3; i++) {
            Device d = new Device();
            d.setName(QUERY_TEST_PREFIX + "temp_" + ts + "_" + i);
            d.setType(type1);
            client.saveDevice(d, null, null, null, null, null, null, null);
        }
        for (int i = 0; i < 2; i++) {
            Device d = new Device();
            d.setName(QUERY_TEST_PREFIX + "hum_" + ts + "_" + i);
            d.setType(type2);
            client.saveDevice(d, null, null, null, null, null, null, null);
        }

        // filter by single device type
        EntityDataQuery singleTypeQuery = new EntityDataQuery()
                .entityFilter(new DeviceTypeFilter()
                        .deviceTypes(List.of(type1)))
                .pageLink(pageLink(10))
                .addEntityFieldsItem(new EntityKey().type(EntityKeyType.ENTITY_FIELD).key("name"));

        PageDataEntityData result = client.findEntityDataByQuery(singleTypeQuery);
        assertNotNull(result);
        assertEquals(3, result.getTotalElements().intValue());
        for (EntityData entity : result.getData()) {
            assertNotNull(entity.getEntityId());
        }

        // filter by multiple device types
        EntityDataQuery multiTypeQuery = new EntityDataQuery()
                .entityFilter(new DeviceTypeFilter()
                        .deviceTypes(List.of(type1, type2)))
                .pageLink(pageLink(10))
                .addEntityFieldsItem(new EntityKey().type(EntityKeyType.ENTITY_FIELD).key("name"));

        PageDataEntityData multiResult = client.findEntityDataByQuery(multiTypeQuery);
        assertNotNull(multiResult);
        assertEquals(5, multiResult.getTotalElements().intValue());

        // filter by device type + name filter
        EntityDataQuery nameFilterQuery = new EntityDataQuery()
                .entityFilter(new DeviceTypeFilter()
                        .deviceTypes(List.of(type1, type2))
                        .deviceNameFilter(QUERY_TEST_PREFIX + "temp_" + ts))
                .pageLink(pageLink(10))
                .addEntityFieldsItem(new EntityKey().type(EntityKeyType.ENTITY_FIELD).key("name"));

        PageDataEntityData nameResult = client.findEntityDataByQuery(nameFilterQuery);
        assertNotNull(nameResult);
        assertEquals(3, nameResult.getTotalElements().intValue());
    }

    @Test
    void testFindByEntityNameFilter() throws Exception {
        long ts = System.currentTimeMillis();
        String prefix = QUERY_TEST_PREFIX + "named_" + ts;

        for (int i = 0; i < 4; i++) {
            Device d = new Device();
            d.setName(prefix + "_" + i);
            d.setType("default");
            client.saveDevice(d, null, null, null, null, null, null);
        }

        EntityDataQuery query = new EntityDataQuery()
                .entityFilter(new EntityNameFilter()
                        .entityType(EntityType.DEVICE)
                        .entityNameFilter(prefix))
                .pageLink(pageLink(10))
                .addEntityFieldsItem(new EntityKey().type(EntityKeyType.ENTITY_FIELD).key("name"));

        PageDataEntityData result = client.findEntityDataByQuery(query);
        assertNotNull(result);
        assertEquals(4, result.getTotalElements().intValue());
        assertFalse(result.getHasNext());
    }

    @Test
    void testFindByEntityListFilter() throws Exception {
        long ts = System.currentTimeMillis();

        Device d1 = client.saveDevice(new Device().name(QUERY_TEST_PREFIX + "list_" + ts + "_1").type("default"), null, null, null, null, null, null);
        Device d2 = client.saveDevice(new Device().name(QUERY_TEST_PREFIX + "list_" + ts + "_2").type("default"), null, null, null, null, null, null);
        client.saveDevice(new Device().name(QUERY_TEST_PREFIX + "list_" + ts + "_3").type("default"), null, null, null, null, null, null);

        EntityDataQuery query = new EntityDataQuery()
                .entityFilter(new EntityListFilter()
                        .entityType(EntityType.DEVICE)
                        .entityList(List.of(
                                d1.getId().getId().toString(),
                                d2.getId().getId().toString())))
                .pageLink(pageLink(10))
                .addEntityFieldsItem(new EntityKey().type(EntityKeyType.ENTITY_FIELD).key("name"));

        PageDataEntityData result = client.findEntityDataByQuery(query);
        assertNotNull(result);
        assertEquals(2, result.getTotalElements().intValue());

        List<String> returnedIds = result.getData().stream()
                .map(e -> e.getEntityId().getId().toString())
                .collect(Collectors.toList());
        assertTrue(returnedIds.contains(d1.getId().getId().toString()));
        assertTrue(returnedIds.contains(d2.getId().getId().toString()));
    }

    @Test
    void testFindBySingleEntityFilter() throws Exception {
        long ts = System.currentTimeMillis();
        Device device = client.saveDevice(new Device().name(QUERY_TEST_PREFIX + "single_" + ts).type("default"), null, null, null, null, null, null);

        EntityDataQuery query = new EntityDataQuery()
                .entityFilter(new SingleEntityFilter()
                        .singleEntity(new AliasEntityId()
                                .id(device.getId().getId())
                                .entityType(EntityType.DEVICE)))
                .pageLink(pageLink(10))
                .addEntityFieldsItem(new EntityKey().type(EntityKeyType.ENTITY_FIELD).key("name"));

        PageDataEntityData result = client.findEntityDataByQuery(query);
        assertNotNull(result);
        assertEquals(1, result.getTotalElements().intValue());
        assertEquals(device.getId().getId().toString(),
                result.getData().get(0).getEntityId().getId().toString());
    }

    @Test
    void testFindByAssetTypeFilter() throws Exception {
        long ts = System.currentTimeMillis();
        String assetType = "building";

        for (int i = 0; i < 3; i++) {
            Asset a = new Asset();
            a.setName(QUERY_TEST_PREFIX + "asset_" + ts + "_" + i);
            a.setType(assetType);
            client.saveAsset(a, null, null, null, null, null);
        }

        EntityDataQuery query = new EntityDataQuery()
                .entityFilter(new AssetTypeFilter()
                        .assetTypes(List.of(assetType)))
                .pageLink(pageLink(10))
                .addEntityFieldsItem(new EntityKey().type(EntityKeyType.ENTITY_FIELD).key("name"));

        PageDataEntityData result = client.findEntityDataByQuery(query);
        assertNotNull(result);
        assertEquals(3, result.getTotalElements().intValue());
    }

    @Test
    void testFindWithKeyFilter() throws Exception {
        long ts = System.currentTimeMillis();
        String matchName = QUERY_TEST_PREFIX + "kf_match_" + ts;
        String noMatchName = QUERY_TEST_PREFIX + "kf_other_" + ts;

        client.saveDevice(new Device().name(matchName).type("default"), null, null, null, null, null, null);
        client.saveDevice(new Device().name(noMatchName).type("default"), null, null, null, null, null, null);

        KeyFilter nameKeyFilter = new KeyFilter()
                .key(new EntityKey().type(EntityKeyType.ENTITY_FIELD).key("name"))
                .valueType(EntityKeyValueType.STRING)
                .predicate(new StringFilterPredicate()
                        .operation(StringOperation.CONTAINS)
                        .value(new FilterPredicateValueString().defaultValue("kf_match"))
                        .ignoreCase(true));

        EntityDataQuery query = new EntityDataQuery()
                .entityFilter(new EntityNameFilter()
                        .entityType(EntityType.DEVICE)
                        .entityNameFilter(QUERY_TEST_PREFIX + "kf_"))
                .addKeyFiltersItem(nameKeyFilter)
                .pageLink(pageLink(10))
                .addEntityFieldsItem(new EntityKey().type(EntityKeyType.ENTITY_FIELD).key("name"));

        PageDataEntityData result = client.findEntityDataByQuery(query);
        assertNotNull(result);
        assertEquals(1, result.getTotalElements().intValue());
    }

    @Test
    void testFindWithPagination() throws Exception {
        long ts = System.currentTimeMillis();

        for (int i = 0; i < 5; i++) {
            Device d = new Device();
            d.setName(QUERY_TEST_PREFIX + "page_" + ts + "_" + i);
            d.setType("default");
            client.saveDevice(d, null, null, null, null, null, null);
        }

        EntityDataPageLink smallPage = new EntityDataPageLink()
                .pageSize(2)
                .page(0)
                .sortOrder(new EntityDataSortOrder()
                        .key(new EntityKey().type(EntityKeyType.ENTITY_FIELD).key("name"))
                        .direction(Direction.ASC));

        EntityDataQuery query = new EntityDataQuery()
                .entityFilter(new EntityNameFilter()
                        .entityType(EntityType.DEVICE)
                        .entityNameFilter(QUERY_TEST_PREFIX + "page_" + ts))
                .pageLink(smallPage)
                .addEntityFieldsItem(new EntityKey().type(EntityKeyType.ENTITY_FIELD).key("name"));

        // first page
        PageDataEntityData page1 = client.findEntityDataByQuery(query);
        assertNotNull(page1);
        assertEquals(5, page1.getTotalElements().intValue());
        assertEquals(3, page1.getTotalPages().intValue());
        assertEquals(2, page1.getData().size());
        assertTrue(page1.getHasNext());

        // last page
        smallPage.setPage(2);
        PageDataEntityData lastPage = client.findEntityDataByQuery(query);
        assertNotNull(lastPage);
        assertEquals(1, lastPage.getData().size());
        assertFalse(lastPage.getHasNext());
    }

    @Test
    void testFindByAssetSearchQueryFilter() throws Exception {
        long ts = System.currentTimeMillis();
        String childType = "floor";

        Asset root = client.saveAsset(new Asset().name(QUERY_TEST_PREFIX + "asqRoot_" + ts).type("building"), null, null, null, null, null);

        for (int i = 0; i < 3; i++) {
            Asset child = client.saveAsset(new Asset().name(QUERY_TEST_PREFIX + "asqChild_" + ts + "_" + i).type(childType), null, null, null, null, null);
            EntityRelation rel = new EntityRelation();
            rel.setFrom(root.getId());
            rel.setTo(child.getId());
            rel.setType("Contains");
            rel.setTypeGroup(RelationTypeGroup.COMMON);
            client.saveRelation(rel);
        }

        EntityDataQuery query = new EntityDataQuery()
                .entityFilter(new AssetSearchQueryFilter()
                        .rootEntity(new AliasEntityId().id(root.getId().getId()).entityType(EntityType.ASSET))
                        .relationType("Contains")
                        .direction(EntitySearchDirection.FROM)
                        .maxLevel(1)
                        .fetchLastLevelOnly(false)
                        .assetTypes(List.of(childType)))
                .pageLink(pageLink(10))
                .addEntityFieldsItem(new EntityKey().type(EntityKeyType.ENTITY_FIELD).key("name"));

        PageDataEntityData result = client.findEntityDataByQuery(query);
        assertNotNull(result);
        assertEquals(3, result.getTotalElements().intValue());
    }

    @Test
    void testFindByDeviceSearchQueryFilter() throws Exception {
        long ts = System.currentTimeMillis();
        String deviceType = "sensor";

        Asset root = client.saveAsset(new Asset().name(QUERY_TEST_PREFIX + "dsqRoot_" + ts).type("hub"), null, null, null, null, null);

        for (int i = 0; i < 2; i++) {
            Device device = client.saveDevice(new Device().name(QUERY_TEST_PREFIX + "dsqDev_" + ts + "_" + i).type(deviceType), null, null, null, null, null, null);
            EntityRelation rel = new EntityRelation();
            rel.setFrom(root.getId());
            rel.setTo(device.getId());
            rel.setType("Contains");
            rel.setTypeGroup(RelationTypeGroup.COMMON);
            client.saveRelation(rel);
        }

        EntityDataQuery query = new EntityDataQuery()
                .entityFilter(new DeviceSearchQueryFilter()
                        .rootEntity(new AliasEntityId().id(root.getId().getId()).entityType(EntityType.ASSET))
                        .relationType("Contains")
                        .direction(EntitySearchDirection.FROM)
                        .maxLevel(1)
                        .fetchLastLevelOnly(false)
                        .deviceTypes(List.of(deviceType)))
                .pageLink(pageLink(10))
                .addEntityFieldsItem(new EntityKey().type(EntityKeyType.ENTITY_FIELD).key("name"));

        PageDataEntityData result = client.findEntityDataByQuery(query);
        assertNotNull(result);
        assertEquals(2, result.getTotalElements().intValue());
    }

    @Test
    void testFindByEdgeTypeFilter() throws Exception {
        long ts = System.currentTimeMillis();

        for (int i = 0; i < 2; i++) {
            client.saveEdge(new Edge()
                    .name(QUERY_TEST_PREFIX + "edgeGw_" + ts + "_" + i)
                    .type("gateway")
                    .routingKey("rk_gw_" + ts + "_" + i)
                    .secret("sec_gw_" + ts + "_" + i)
                    .edgeLicenseKey("licenseKey")
                    .cloudEndpoint("http://localhost:8080"), null, null);
        }
        client.saveEdge(new Edge()
                .name(QUERY_TEST_PREFIX + "edgeCloud_" + ts)
                .type("cloud")
                .routingKey("rk_cloud_" + ts)
                .secret("sec_cloud_" + ts)
                .edgeLicenseKey("licenseKey")
                .cloudEndpoint("http://localhost:8080"), null, null);

        EntityDataQuery query = new EntityDataQuery()
                .entityFilter(new EdgeTypeFilter()
                        .edgeTypes(List.of("gateway")))
                .pageLink(pageLink(10))
                .addEntityFieldsItem(new EntityKey().type(EntityKeyType.ENTITY_FIELD).key("name"));

        PageDataEntityData result = client.findEntityDataByQuery(query);
        assertNotNull(result);
        assertEquals(2, result.getTotalElements().intValue());
    }

    @Test
    void testFindByEdgeSearchQueryFilter() throws Exception {
        long ts = System.currentTimeMillis();

        Asset root = client.saveAsset(new Asset().name(QUERY_TEST_PREFIX + "esqRoot_" + ts).type("building"), null, null, null, null, null);

        for (int i = 0; i < 3; i++) {
            Edge edge = client.saveEdge(new Edge()
                    .name(QUERY_TEST_PREFIX + "esqEdge_" + ts + "_" + i)
                    .type("gateway")
                    .routingKey("rk_esq_" + ts + "_" + i)
                    .secret("sec_esq_" + ts + "_" + i)
                    .edgeLicenseKey("licenseKey")
                    .cloudEndpoint("http://localhost:8080"), null, null);
            EntityRelation rel = new EntityRelation();
            rel.setFrom(root.getId());
            rel.setTo(edge.getId());
            rel.setType("Manages");
            rel.setTypeGroup(RelationTypeGroup.COMMON);
            client.saveRelation(rel);
        }

        EntityDataQuery query = new EntityDataQuery()
                .entityFilter(new EdgeSearchQueryFilter()
                        .rootEntity(new AliasEntityId().id(root.getId().getId()).entityType(EntityType.ASSET))
                        .relationType("Manages")
                        .direction(EntitySearchDirection.FROM)
                        .maxLevel(1)
                        .fetchLastLevelOnly(false)
                        .edgeTypes(List.of("gateway")))
                .pageLink(pageLink(10))
                .addEntityFieldsItem(new EntityKey().type(EntityKeyType.ENTITY_FIELD).key("name"));

        PageDataEntityData result = client.findEntityDataByQuery(query);
        assertNotNull(result);
        assertEquals(3, result.getTotalElements().intValue());
    }

    @Test
    void testFindByEntityViewTypeFilter() throws Exception {
        long ts = System.currentTimeMillis();
        String viewType = "temperatureView";

        Device device = client.saveDevice(new Device().name(QUERY_TEST_PREFIX + "evtDev_" + ts).type("default"), null, null, null, null, null, null);

        for (int i = 0; i < 3; i++) {
            client.saveEntityView(new EntityView()
                            .name(QUERY_TEST_PREFIX + "evt_" + ts + "_" + i)
                            .type(viewType)
                            .entityId(device.getId()),
                    null, null, null, null, null);
        }

        EntityDataQuery query = new EntityDataQuery()
                .entityFilter(new EntityViewTypeFilter()
                        .entityViewTypes(List.of(viewType)))
                .pageLink(pageLink(10))
                .addEntityFieldsItem(new EntityKey().type(EntityKeyType.ENTITY_FIELD).key("name"));

        PageDataEntityData result = client.findEntityDataByQuery(query);
        assertNotNull(result);
        assertEquals(3, result.getTotalElements().intValue());
    }

    @Test
    void testFindByEntityViewSearchQueryFilter() throws Exception {
        long ts = System.currentTimeMillis();
        String viewType = "sensorView";

        Device rootDevice = client.saveDevice(new Device().name(QUERY_TEST_PREFIX + "evsqDev_" + ts).type("default"), null, null, null, null, null, null);

        for (int i = 0; i < 2; i++) {
            EntityView ev = client.saveEntityView(new EntityView()
                            .name(QUERY_TEST_PREFIX + "evsq_" + ts + "_" + i)
                            .type(viewType)
                            .entityId(rootDevice.getId()),
                    null, null, null, null, null);
            EntityRelation rel = new EntityRelation();
            rel.setFrom(rootDevice.getId());
            rel.setTo(ev.getId());
            rel.setType("HasView");
            rel.setTypeGroup(RelationTypeGroup.COMMON);
            client.saveRelation(rel);
        }

        EntityDataQuery query = new EntityDataQuery()
                .entityFilter(new EntityViewSearchQueryFilter()
                        .rootEntity(new AliasEntityId().id(rootDevice.getId().getId()).entityType(EntityType.DEVICE))
                        .relationType("HasView")
                        .direction(EntitySearchDirection.FROM)
                        .maxLevel(1)
                        .fetchLastLevelOnly(false)
                        .entityViewTypes(List.of(viewType)))
                .pageLink(pageLink(10))
                .addEntityFieldsItem(new EntityKey().type(EntityKeyType.ENTITY_FIELD).key("name"));

        PageDataEntityData result = client.findEntityDataByQuery(query);
        assertNotNull(result);
        assertEquals(2, result.getTotalElements().intValue());
    }

    @Test
    void testFindByRelationsQueryFilter() throws Exception {
        long ts = System.currentTimeMillis();

        Asset root = client.saveAsset(new Asset().name(QUERY_TEST_PREFIX + "rqfRoot_" + ts).type("hub"), null, null, null, null, null);

        for (int i = 0; i < 2; i++) {
            Device device = client.saveDevice(new Device().name(QUERY_TEST_PREFIX + "rqfDev_" + ts + "_" + i).type("sensor"), null, null, null, null, null, null);
            EntityRelation rel = new EntityRelation();
            rel.setFrom(root.getId());
            rel.setTo(device.getId());
            rel.setType("Contains");
            rel.setTypeGroup(RelationTypeGroup.COMMON);
            client.saveRelation(rel);
        }

        EntityDataQuery query = new EntityDataQuery()
                .entityFilter(new RelationsQueryFilter()
                        .rootEntity(new AliasEntityId().id(root.getId().getId()).entityType(EntityType.ASSET))
                        .direction(EntitySearchDirection.FROM)
                        .maxLevel(1)
                        .fetchLastLevelOnly(false)
                        .addFiltersItem(new RelationEntityTypeFilter()
                                .relationType("Contains")
                                .entityTypes(List.of(EntityType.DEVICE))))
                .pageLink(pageLink(10))
                .addEntityFieldsItem(new EntityKey().type(EntityKeyType.ENTITY_FIELD).key("name"));

        PageDataEntityData result = client.findEntityDataByQuery(query);
        assertNotNull(result);
        assertEquals(2, result.getTotalElements().intValue());
    }

    @Test
    void testFindByEntityTypeFilter() throws Exception {
        long ts = System.currentTimeMillis();

        for (int i = 0; i < 3; i++) {
            client.saveDevice(new Device().name(QUERY_TEST_PREFIX + "etf_" + ts + "_" + i).type("default"), null, null, null, null, null, null);
        }

        EntityDataQuery query = new EntityDataQuery()
                .entityFilter(new EntityTypeFilter().entityType(EntityType.DEVICE))
                .pageLink(pageLink(10))
                .addEntityFieldsItem(new EntityKey().type(EntityKeyType.ENTITY_FIELD).key("name"));

        PageDataEntityData result = client.findEntityDataByQuery(query);
        assertNotNull(result);
        assertEquals(3, result.getTotalElements().intValue());
    }

    @Test
    void testFindByEntityGroupFilter() throws Exception {
        long ts = System.currentTimeMillis();

        EntityGroup group = new EntityGroup();
        group.setType(EntityGroup.TypeEnum.DEVICE);
        group.setName(QUERY_TEST_PREFIX + "egfGroup_" + ts);
        EntityGroupInfo savedGroup = client.saveEntityGroup(group);
        String groupId = savedGroup.getId().getId().toString();

        Device d1 = client.saveDevice(new Device().name(QUERY_TEST_PREFIX + "egfDev1_" + ts).type("default"), null, null, null, null, null, null);
        Device d2 = client.saveDevice(new Device().name(QUERY_TEST_PREFIX + "egfDev2_" + ts).type("default"), null, null, null, null, null, null);
        client.addEntitiesToEntityGroup(groupId, List.of(d1.getId().getId().toString(), d2.getId().getId().toString()));

        EntityDataQuery query = new EntityDataQuery()
                .entityFilter(new EntityGroupFilter()
                        .groupType(EntityType.DEVICE)
                        .entityGroup(groupId))
                .pageLink(pageLink(10))
                .addEntityFieldsItem(new EntityKey().type(EntityKeyType.ENTITY_FIELD).key("name"));

        PageDataEntityData result = client.findEntityDataByQuery(query);
        assertNotNull(result);
        assertEquals(2, result.getTotalElements().intValue());
    }

    @Test
    void testFindByEntityGroupListFilter() throws Exception {
        long ts = System.currentTimeMillis();

        EntityGroup group1 = new EntityGroup();
        group1.setType(EntityGroup.TypeEnum.DEVICE);
        group1.setName(QUERY_TEST_PREFIX + "eglGroup1_" + ts);
        EntityGroupInfo savedGroup1 = client.saveEntityGroup(group1);

        EntityGroup group2 = new EntityGroup();
        group2.setType(EntityGroup.TypeEnum.DEVICE);
        group2.setName(QUERY_TEST_PREFIX + "eglGroup2_" + ts);
        EntityGroupInfo savedGroup2 = client.saveEntityGroup(group2);

        Device d1 = client.saveDevice(new Device().name(QUERY_TEST_PREFIX + "eglDev1_" + ts).type("default"), null, null, null, null, null, null);
        Device d2 = client.saveDevice(new Device().name(QUERY_TEST_PREFIX + "eglDev2_" + ts).type("default"), null, null, null, null, null, null);
        client.addEntitiesToEntityGroup(savedGroup1.getId().getId().toString(), List.of(d1.getId().getId().toString()));
        client.addEntitiesToEntityGroup(savedGroup2.getId().getId().toString(), List.of(d2.getId().getId().toString()));

        EntityDataQuery query = new EntityDataQuery()
                .entityFilter(new EntityGroupListFilter()
                        .groupType(EntityType.DEVICE)
                        .entityGroupList(List.of(
                                savedGroup1.getId().getId().toString(),
                                savedGroup2.getId().getId().toString())))
                .pageLink(pageLink(10))
                .addEntityFieldsItem(new EntityKey().type(EntityKeyType.ENTITY_FIELD).key("name"));

        PageDataEntityData result = client.findEntityDataByQuery(query);
        assertNotNull(result);
        assertEquals(2, result.getTotalElements().intValue());
    }

    @Test
    void testFindByEntityGroupNameFilter() throws Exception {
        long ts = System.currentTimeMillis();
        String groupName = QUERY_TEST_PREFIX + "egnGroup_" + ts;

        EntityGroup group = new EntityGroup();
        group.setType(EntityGroup.TypeEnum.DEVICE);
        group.setName(groupName);
        client.saveEntityGroup(group);

        EntityDataQuery query = new EntityDataQuery()
                .entityFilter(new EntityGroupNameFilter()
                        .groupType(EntityType.DEVICE)
                        .entityGroupNameFilter(groupName))
                .pageLink(pageLink(10))
                .addEntityFieldsItem(new EntityKey().type(EntityKeyType.ENTITY_FIELD).key("name"));

        PageDataEntityData result = client.findEntityDataByQuery(query);
        assertNotNull(result);
        assertEquals(1, result.getTotalElements().intValue());
    }

    @Test
    void testFindByEntitiesByGroupNameFilter() throws Exception {
        long ts = System.currentTimeMillis();
        String groupName = QUERY_TEST_PREFIX + "ebgnGroup_" + ts;

        EntityGroup group = new EntityGroup();
        group.setType(EntityGroup.TypeEnum.DEVICE);
        group.setName(groupName);
        EntityGroupInfo savedGroup = client.saveEntityGroup(group);

        Device device = client.saveDevice(new Device().name(QUERY_TEST_PREFIX + "ebgn_" + ts).type("default"), null, null, null, null, null, null);
        client.addEntitiesToEntityGroup(savedGroup.getId().getId().toString(), List.of(device.getId().getId().toString()));

        EntityDataQuery query = new EntityDataQuery()
                .entityFilter(new EntitiesByGroupNameFilter()
                        .groupType(EntityType.DEVICE)
                        .entityGroupNameFilter(groupName)
                        .ownerId(savedTenant.getId()))
                .pageLink(pageLink(10))
                .addEntityFieldsItem(new EntityKey().type(EntityKeyType.ENTITY_FIELD).key("name"));

        PageDataEntityData result = client.findEntityDataByQuery(query);
        assertNotNull(result);
        assertEquals(1, result.getTotalElements().intValue());
    }

    @Test
    void testFindByApiUsageStateFilter() throws Exception {
        EntityDataQuery query = new EntityDataQuery()
                .entityFilter(new ApiUsageStateFilter())
                .pageLink(pageLink(10))
                .addEntityFieldsItem(new EntityKey().type(EntityKeyType.ENTITY_FIELD).key("name"));

        PageDataEntityData result = client.findEntityDataByQuery(query);
        assertNotNull(result);
        assertEquals(1, result.getData().size());
    }

}

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
import org.thingsboard.client.model.AttributesEntityView;
import org.thingsboard.client.model.Device;
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.EntitySubtype;
import org.thingsboard.client.model.EntityType;
import org.thingsboard.client.model.EntityView;
import org.thingsboard.client.model.EntityViewInfo;
import org.thingsboard.client.model.PageDataEntityView;
import org.thingsboard.client.model.PageDataEntityViewInfo;
import org.thingsboard.client.model.TelemetryEntityView;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EntityViewApiTest extends AbstractApiTest {

    private static final String EV_PREFIX = "EvTest_";

    @Test
    void testSaveAndGetEntityView() throws Exception {
        long ts = System.currentTimeMillis();
        Device device = createTestDevice(String.valueOf(ts));

        EntityView ev = new EntityView();
        ev.setName(EV_PREFIX + "save_" + ts);
        ev.setType("testType");
        ev.setEntityId(new EntityId()
                .id(device.getId().getId())
                .entityType(EntityType.DEVICE));
        ev.setKeys(new TelemetryEntityView()
                .timeseries(List.of("temperature", "humidity"))
                .attributes(new AttributesEntityView()
                        .cs(List.of("firmware"))
                        .ss(List.of("active"))
                        .sh(List.of())));
        ev.setStartTimeMs(1000L);
        ev.setEndTimeMs(2000L);

        EntityView saved = tbApi.saveEntityView(ev, null, null, null);
        assertNotNull(saved);
        assertNotNull(saved.getId());
        assertEquals(ev.getName(), saved.getName());
        assertEquals("testType", saved.getType());
        assertEquals(device.getId().getId(), saved.getEntityId().getId());
        assertEquals(List.of("temperature", "humidity"), saved.getKeys().getTimeseries());
        assertEquals(1000L, saved.getStartTimeMs());
        assertEquals(2000L, saved.getEndTimeMs());

        // get by id
        String evId = saved.getId().getId().toString();
        EntityView fetched = tbApi.getEntityViewById(evId);
        assertNotNull(fetched);
        assertEquals(saved.getName(), fetched.getName());
        assertEquals(saved.getType(), fetched.getType());
        assertEquals(saved.getEntityId().getId(), fetched.getEntityId().getId());
    }

    @Test
    void testGetEntityViewInfoById() throws Exception {
        long ts = System.currentTimeMillis();
        Device device = createTestDevice(String.valueOf(ts));
        EntityView saved = createEntityView(EV_PREFIX + "info_" + ts, "infoType", device);

        EntityViewInfo info = tbApi.getEntityViewInfoById(saved.getId().getId().toString());
        assertNotNull(info);
        assertEquals(saved.getName(), info.getName());
        assertEquals("infoType", info.getType());
        assertNotNull(info.getEntityId());
    }

    @Test
    void testUpdateEntityView() throws Exception {
        long ts = System.currentTimeMillis();
        Device device = createTestDevice(String.valueOf(ts));
        EntityView saved = createEntityView(EV_PREFIX + "update_" + ts, "default", device);

        saved.setName(EV_PREFIX + "updated_" + ts);
        saved.setKeys(new TelemetryEntityView()
                .timeseries(List.of("temperature", "pressure"))
                .attributes(new AttributesEntityView()
                        .cs(List.of())
                        .ss(List.of())
                        .sh(List.of())));

        EntityView updated = tbApi.saveEntityView(saved, null, null, null);
        assertEquals(EV_PREFIX + "updated_" + ts, updated.getName());
        assertEquals(List.of("temperature", "pressure"), updated.getKeys().getTimeseries());
        assertEquals(saved.getId().getId(), updated.getId().getId());
    }

    @Test
    void testDeleteEntityView() throws Exception {
        long ts = System.currentTimeMillis();
        Device device = createTestDevice(String.valueOf(ts));
        EntityView saved = createEntityView(EV_PREFIX + "delete_" + ts, "default", device);

        String evId = saved.getId().getId().toString();
        tbApi.getEntityViewById(evId);

        tbApi.deleteEntityView(evId);

        assertReturns404(() -> tbApi.getEntityViewById(evId));
    }

    @Test
    void testGetTenantEntityViews() throws Exception {
        long ts = System.currentTimeMillis();
        Device device = createTestDevice(String.valueOf(ts));

        for (int i = 0; i < 3; i++) {
            createEntityView(EV_PREFIX + "tenant_" + ts + "_" + i, "tenantViewType", device);
        }

        PageDataEntityView page = tbApi.getTenantEntityViews(100, 0, null, EV_PREFIX + "tenant_" + ts, null, null);
        assertNotNull(page);
        assertEquals(3, page.getTotalElements().intValue());
        for (EntityView ev : page.getData()) {
            assertTrue(ev.getName().startsWith(EV_PREFIX + "tenant_" + ts));
        }
    }

    @Test
    void testGetTenantEntityViewInfos() throws Exception {
        long ts = System.currentTimeMillis();
        Device device = createTestDevice(String.valueOf(ts));
        createEntityView(EV_PREFIX + "tinfo_" + ts, "default", device);

        PageDataEntityViewInfo page = tbApi.getTenantEntityViewInfos(100, 0, null, EV_PREFIX + "tinfo_" + ts, null, null);
        assertNotNull(page);
        assertEquals(1, page.getTotalElements().intValue());
        assertEquals(EV_PREFIX + "tinfo_" + ts, page.getData().get(0).getName());
    }

    @Test
    void testAssignAndUnassignEntityViewToCustomer() throws Exception {
        long ts = System.currentTimeMillis();
        Device device = createTestDevice(String.valueOf(ts));
        EntityView saved = createEntityView(EV_PREFIX + "assign_" + ts, "default", device);

        String evId = saved.getId().getId().toString();
        String customerId = savedCustomer.getId().getId().toString();

        // assign to customer
        EntityView assigned = tbApi.assignEntityViewToCustomer(customerId, evId);
        assertNotNull(assigned);
        assertEquals(savedCustomer.getId().getId(), assigned.getCustomerId().getId());

        // verify in customer entity views
        PageDataEntityView customerViews = tbApi.getCustomerEntityViews(
                customerId, 100, 0, null, EV_PREFIX + "assign_" + ts, null, null);
        assertEquals(1, customerViews.getTotalElements().intValue());
        assertEquals(saved.getName(), customerViews.getData().get(0).getName());

        // unassign from customer
        EntityView unassigned = tbApi.unassignEntityViewFromCustomer(evId);
        assertNotNull(unassigned);

        PageDataEntityView afterUnassign = tbApi.getCustomerEntityViews(
                customerId, 100, 0, null, EV_PREFIX + "assign_" + ts, null, null);
        assertEquals(0, afterUnassign.getTotalElements().intValue());
    }

    @Test
    void testGetCustomerEntityViewInfos() throws Exception {
        long ts = System.currentTimeMillis();
        Device device = createTestDevice(String.valueOf(ts));
        EntityView saved = createEntityView(EV_PREFIX + "cinfo_" + ts, "default", device);

        String evId = saved.getId().getId().toString();
        String customerId = savedCustomer.getId().getId().toString();

        tbApi.assignEntityViewToCustomer(customerId, evId);

        PageDataEntityViewInfo infos = tbApi.getCustomerEntityViewInfos(
                customerId, 100, 0, null, EV_PREFIX + "cinfo_" + ts, null, null);
        assertNotNull(infos);
        assertEquals(1, infos.getTotalElements().intValue());
        assertEquals(saved.getName(), infos.getData().get(0).getName());
    }

    @Test
    void testGetEntityViewTypes() throws Exception {
        long ts = System.currentTimeMillis();
        Device device = createTestDevice(String.valueOf(ts));
        createEntityView(EV_PREFIX + "types_" + ts, "uniqueEvType_" + ts, device);

        List<EntitySubtype> types = tbApi.getEntityViewTypes();
        assertNotNull(types);
        assertFalse(types.isEmpty());

        List<String> typeNames = types.stream()
                .map(EntitySubtype::getType)
                .collect(Collectors.toList());
        assertTrue(typeNames.contains("uniqueEvType_" + ts));
    }

    @Test
    void testGetEntityViewById_notFound() {
        String nonExistentId = UUID.randomUUID().toString();
        assertReturns404(() -> tbApi.getEntityViewById(nonExistentId));
    }

    @Test
    void testGetTenantEntityViewsPagination() throws Exception {
        long ts = System.currentTimeMillis();
        Device device = createTestDevice(String.valueOf(ts));

        for (int i = 0; i < 5; i++) {
            createEntityView(EV_PREFIX + "paged_" + ts + "_" + i, "default", device);
        }

        PageDataEntityView page1 = tbApi.getTenantEntityViews(2, 0, null, EV_PREFIX + "paged_" + ts, null, null);
        assertNotNull(page1);
        assertEquals(5, page1.getTotalElements().intValue());
        assertEquals(3, page1.getTotalPages().intValue());
        assertEquals(2, page1.getData().size());
        assertTrue(page1.getHasNext());

        PageDataEntityView lastPage = tbApi.getTenantEntityViews(2, 2, null, EV_PREFIX + "paged_" + ts, null, null);
        assertEquals(1, lastPage.getData().size());
        assertFalse(lastPage.getHasNext());
    }

    private Device createTestDevice(String suffix) throws Exception {
        Device device = new Device();
        device.setName(EV_PREFIX + "device_" + suffix);
        device.setType("default");
        return tbApi.saveDevice(device, null, null, null, null, null);
    }

    private EntityView createEntityView(String name, String type, Device device) throws Exception {
        EntityView ev = new EntityView();
        ev.setName(name);
        ev.setType(type);
        ev.setEntityId(new EntityId()
                .id(device.getId().getId())
                .entityType(EntityType.DEVICE));
        ev.setKeys(new TelemetryEntityView()
                .timeseries(List.of("temperature"))
                .attributes(new AttributesEntityView()
                        .cs(List.of())
                        .ss(List.of())
                        .sh(List.of())));
        return tbApi.saveEntityView(ev, null, null, null);
    }

}

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
import org.thingsboard.client.model.Asset;
import org.thingsboard.client.model.BulkImportColumnType;
import org.thingsboard.client.model.BulkImportRequest;
import org.thingsboard.client.model.BulkImportResultDevice;
import org.thingsboard.client.model.ColumnMapping;
import org.thingsboard.client.model.Device;
import org.thingsboard.client.model.DeviceCredentials;
import org.thingsboard.client.model.DeviceCredentialsType;
import org.thingsboard.client.model.EntityGroup;
import org.thingsboard.client.model.EntityGroupInfo;
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.EntityRelation;
import org.thingsboard.client.model.EntityRelationsQuery;
import org.thingsboard.client.model.EntitySearchDirection;
import org.thingsboard.client.model.EntityType;
import org.thingsboard.client.model.Mapping;
import org.thingsboard.client.model.PageDataDevice;
import org.thingsboard.client.model.PageDataDeviceInfo;
import org.thingsboard.client.model.RelationTypeGroup;
import org.thingsboard.client.model.RelationsSearchParameters;
import org.thingsboard.client.model.SaveDeviceWithCredentialsRequest;
import org.thingsboard.client.model.Tenant;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DeviceApiTest extends AbstractApiTest {

    private Device createDevice(String name) throws ApiException {
        Device device = new Device();
        device.setName(name);
        device.setType("default");
        return client.saveDevice(device, null, null, null, null, null, null);
    }

    @Test
    void testDeviceLifecycle() throws Exception {
        long timestamp = System.currentTimeMillis();
        List<Device> createdDevices = new ArrayList<>();

        // create 20 devices
        for (int i = 0; i < 20; i++) {
            Device device = new Device();
            String deviceName = ((i % 2 == 0) ? TEST_PREFIX : TEST_PREFIX_2) + timestamp + "_" + i;
            device.setName(deviceName);
            device.setLabel("Test Device " + i);
            device.setType(((i % 2 == 0) ? "default" : "thermostat"));

            Device createdDevice = client.saveDevice(device, null, null, null, null, null, null);
            assertNotNull(createdDevice);
            assertNotNull(createdDevice.getId());
            assertEquals(deviceName, createdDevice.getName());

            createdDevices.add(createdDevice);
        }

        // find all, check count
        PageDataDevice allDevices = client.getTenantDevices(100, 0, null, null, null, null);

        assertNotNull(allDevices);
        assertNotNull(allDevices.getData());
        int initialSize = allDevices.getData().size();
        assertEquals(20, initialSize, "Expected at least 20 devices, but got " + allDevices.getData().size());

        //find all with search text, check count
        PageDataDevice allDevicesBySearchText = client.getTenantDevices(10, 0, null, TEST_PREFIX_2, null, null);
        assertEquals(10, allDevicesBySearchText.getData().size(), "Expected exactly 10 test devices");

        // find by id
        Device searchDevice = createdDevices.get(10);
        Device device = client.getDeviceById(searchDevice.getId().getId().toString());
        assertEquals(searchDevice.getName(), device.getName());

        // create device with credentials
        Device deviceWithCreds = new Device();
        deviceWithCreds.setName("device-with-creds");

        DeviceCredentials creds = new DeviceCredentials();
        creds.setCredentialsType(DeviceCredentialsType.ACCESS_TOKEN);
        creds.setCredentialsId("TEST_ACCESS_TOKEN");

        SaveDeviceWithCredentialsRequest request = new SaveDeviceWithCredentialsRequest();
        request.setDevice(deviceWithCreds);
        request.setCredentials(creds);

        Device savedDeviceWithCreds = client.saveDeviceWithCredentials(request, null, null, null, null, null);
        assertEquals("device-with-creds", savedDeviceWithCreds.getName());

        // find credentials by device id
        DeviceCredentials fetchedCreds = client.getDeviceCredentialsByDeviceId(savedDeviceWithCreds.getId().getId().toString());
        assertEquals(creds.getCredentialsId(), fetchedCreds.getCredentialsId());

        // delete device
        UUID deviceToDeleteId = createdDevices.get(0).getId().getId();
        client.deleteDevice(deviceToDeleteId.toString());

        // Verify the device is deleted
        PageDataDevice devicesAfterDelete = client.getTenantDevices(100, 0, null, null, null, null);
        assertEquals(initialSize, devicesAfterDelete.getData().size());

        assertReturns404(() ->
                client.getDeviceById(deviceToDeleteId.toString()));
    }

    @Test
    void testGetCustomerDevices() throws ApiException {
        PageDataDevice result = client.getCustomerDevices(
                savedCustomer.getId().getId().toString(), 100, 0, null, null, null, null);
        assertNotNull(result);
        assertNotNull(result.getData());
        assertTrue(result.getData().isEmpty(), "Expected no devices assigned to the test customer");
    }

    @Test
    void testGetUserDevices() throws ApiException {
        createDevice(TEST_PREFIX + System.currentTimeMillis());

        // note: pageSize and page are String for this endpoint
        PageDataDevice result = client.getUserDevices("100", "0", null, null, null, null);
        assertNotNull(result);
        assertEquals(1, result.getData().size());
    }

    @Test
    void testGetAllDeviceInfos() throws ApiException {
        createDevice(TEST_PREFIX + System.currentTimeMillis());

        PageDataDeviceInfo result = client.getAllDeviceInfos(100, 0, true, null, null, null, null, null);
        assertNotNull(result);
        assertEquals(1, result.getData().size());
    }

    @Test
    void testGetCustomerDeviceInfos() throws ApiException, IOException, InterruptedException {
        client.login(CUSTOMER_USERNAME, TEST_PASSWORD);
        createDevice(TEST_PREFIX + System.currentTimeMillis());

        PageDataDeviceInfo result = client.getCustomerDeviceInfos(
                savedCustomer.getId().getId().toString(), 100, 0, true, null, null, null, null, null);
        assertNotNull(result);
        assertEquals(1, result.getData().size());
    }

    @Test
    void testGetDevicesByIds() throws ApiException {
        Device device = createDevice(TEST_PREFIX + System.currentTimeMillis());

        List<Device> result = client.getDevicesByIds(List.of(device.getId().getId().toString()));
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(device.getId().getId(), result.get(0).getId().getId());
    }

    @Test
    void testFindByQuery() throws ApiException {
        // create assets and devices to relate
        Asset building = new Asset();
        building.setName(TEST_PREFIX + "Building");
        building.setType("building");
        building = client.saveAsset(building, null, null, null, null, null);

        Device device = new Device();
        device.setName(TEST_PREFIX + "Sensor");
        device.setType("sensor");
        device = client.saveDevice(device, null, null, null, null, null, null);

        EntityRelation buildingToDevice = new EntityRelation();
        buildingToDevice.setFrom(new EntityId().id(building.getId().getId()).entityType(EntityType.ASSET));
        buildingToDevice.setTo(new EntityId().id(device.getId().getId()).entityType(EntityType.DEVICE));
        buildingToDevice.setType("Contains");
        buildingToDevice.setTypeGroup(RelationTypeGroup.COMMON);
        EntityRelation savedRelation = client.saveRelation(buildingToDevice);

        RelationsSearchParameters params = new RelationsSearchParameters();
        params.setRootId(device.getId().getId());
        params.setRootType(EntityType.DEVICE);
        params.setDirection(EntitySearchDirection.TO);
        params.setMaxLevel(1);

        EntityRelationsQuery query = new EntityRelationsQuery();
        query.setParameters(params);

        // device has no outgoing relations; result is an empty list, not null
        List<EntityRelation> result = client.findEntityRelationsByQuery(query);
        assertEquals(1, result.size());
    }

    @Test
    void testGetDevicesByEntityGroupId() throws ApiException {
        EntityGroup entityGroup = new EntityGroup();
        entityGroup.setType(EntityGroup.TypeEnum.DEVICE);
        entityGroup.setName("Test Device Group");
        EntityGroupInfo savedGroup = client.saveEntityGroup(entityGroup);
        String groupId = savedGroup.getId().getId().toString();

        Device device = createDevice(TEST_PREFIX + System.currentTimeMillis());
        client.addEntitiesToEntityGroup(groupId, List.of(device.getId().getId().toString()));

        // note: pageSize and page are String for this endpoint
        PageDataDevice result = client.getDevicesByEntityGroupId(groupId, "100", "0", null, null, null);
        assertNotNull(result);
        assertEquals(1, result.getData().size(), "Expected exactly one device in the entity group");
        assertEquals(device.getId().getId(), result.getData().get(0).getId().getId());
    }

    @Test
    void testAssignDeviceToTenant() throws Exception {
        // create a second tenant as sysadmin to receive the device
        client.login("sysadmin@thingsboard.org", "sysadmin");
        Tenant secondTenant = new Tenant();
        secondTenant.setTitle("Second Test Tenant");
        Tenant savedSecondTenant = client.saveTenant(secondTenant);

        // switch back to first tenant admin and create the device
        client.login(TENANT_ADMIN_USERNAME, TEST_PASSWORD);
        Device device = createDevice(TEST_PREFIX + System.currentTimeMillis());

        // assign the device to the second tenant
        Device assignedDevice = client.assignDeviceToTenant(
                savedSecondTenant.getId().getId().toString(),
                device.getId().getId().toString());
        assertNotNull(assignedDevice);
        assertEquals(savedSecondTenant.getId().getId(), assignedDevice.getTenantId().getId());

        // device is now in the second tenant; clean up
        client.login("sysadmin@thingsboard.org", "sysadmin");
        client.deleteTenant(savedSecondTenant.getId().getId().toString());
    }

    @Test
    void testCountByDeviceProfileAndEmptyOtaPackage() throws ApiException {
        Device device = createDevice(TEST_PREFIX + System.currentTimeMillis());
        String deviceProfileId = device.getDeviceProfileId().getId().toString();

        Long count = client.countByDeviceProfileAndEmptyOtaPackage("FIRMWARE", deviceProfileId);
        assertEquals(1, count);
    }

    @Test
    void testCountByDeviceGroupAndEmptyOtaPackage() throws ApiException {
        EntityGroup entityGroup = new EntityGroup();
        entityGroup.setType(EntityGroup.TypeEnum.DEVICE);
        entityGroup.setName("OTA Test Group");
        EntityGroupInfo savedGroup = client.saveEntityGroup(entityGroup);
        String groupId = savedGroup.getId().getId().toString();

        Device device = createDevice(TEST_PREFIX + System.currentTimeMillis());
        client.addEntitiesToEntityGroup(groupId, List.of(device.getId().getId().toString()));

        // use a random UUID as the OTA package reference; all devices in the group lack it
        String placeholderOtaPackageId = UUID.randomUUID().toString();
        Long count = client.countByDeviceGroupAndEmptyOtaPackage("FIRMWARE", placeholderOtaPackageId, groupId);
        assertEquals(0, count);
    }

    @Test
    void testProcessDevicesBulkImport() throws ApiException {
        long ts = System.currentTimeMillis();
        String deviceName = TEST_PREFIX + ts + "_bulk";

        // build a minimal CSV with a header row and one device row
        String csv = "name,type\n" + deviceName + ",default";

        ColumnMapping nameCol = new ColumnMapping();
        nameCol.setType(BulkImportColumnType.NAME);

        ColumnMapping typeCol = new ColumnMapping();
        typeCol.setType(BulkImportColumnType.TYPE);

        Mapping mapping = new Mapping();
        mapping.setHeader(true);
        mapping.setDelimiter(",");
        mapping.setUpdate(false);
        mapping.setColumns(List.of(nameCol, typeCol));

        BulkImportRequest request = new BulkImportRequest();
        request.setFile(csv);
        request.setMapping(mapping);

        BulkImportResultDevice result = client.processDevicesBulkImport(request);
        assertNotNull(result);
        assertEquals(1, ((Number) result.getCreated()).intValue(), "Expected one device to be created");
        assertEquals(0, ((Number) result.getErrors()).intValue(), "Expected no import errors");
    }

}

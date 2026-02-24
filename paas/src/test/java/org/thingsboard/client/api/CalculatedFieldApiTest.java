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
import org.thingsboard.client.model.Argument;
import org.thingsboard.client.model.ArgumentType;
import org.thingsboard.client.model.CalculatedField;
import org.thingsboard.client.model.CalculatedFieldType;
import org.thingsboard.client.model.Device;
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.EntityType;
import org.thingsboard.client.model.PageDataCalculatedField;
import org.thingsboard.client.model.ReferencedEntityKey;
import org.thingsboard.client.model.SimpleCalculatedFieldConfiguration;
import org.thingsboard.client.model.TimeSeriesOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class CalculatedFieldApiTest extends AbstractApiTest {

    @Test
    void testCalculatedFieldLifecycle() throws ApiException {
        long timestamp = System.currentTimeMillis();
        List<CalculatedField> createdFields = new ArrayList<>();

        // create devices to attach calculated fields to
        Device device1 = new Device();
        device1.setName("CalcFieldDevice1_" + timestamp);
        device1.setType("default");
        Device createdDevice1 = tbApi.saveDevice(device1, null, null, null, null, null, null);

        Device device2 = new Device();
        device2.setName("CalcFieldDevice2_" + timestamp);
        device2.setType("default");
        Device createdDevice2 = tbApi.saveDevice(device2, null, null, null, null, null, null);

        // create calculated fields on device1
        for (int i = 0; i < 5; i++) {
            CalculatedField cf = new CalculatedField();
            cf.setName(TEST_PREFIX + "CalcField_" + timestamp + "_" + i);
            cf.setType(CalculatedFieldType.SIMPLE);

            EntityId entityId = new EntityId();
            entityId.setEntityType(EntityType.DEVICE);
            entityId.setId(createdDevice1.getId().getId());
            cf.setEntityId(entityId);

            SimpleCalculatedFieldConfiguration config = new SimpleCalculatedFieldConfiguration();

            Argument arg = new Argument();
            ReferencedEntityKey refKey = new ReferencedEntityKey();
            refKey.setKey("temperature");
            refKey.setType(ArgumentType.TS_LATEST);
            arg.setRefEntityKey(refKey);
            config.putArgumentsItem("temp", arg);

            config.setExpression("temp * " + (i + 1));

            TimeSeriesOutput output = new TimeSeriesOutput();
            output.setName("scaledTemp_" + i);
            config.setOutput(output);

            cf.setConfiguration(config);

            CalculatedField created = tbApi.saveCalculatedField(cf);
            assertNotNull(created);
            assertNotNull(created.getId());
            assertEquals(cf.getName(), created.getName());
            assertEquals(CalculatedFieldType.SIMPLE, created.getType());

            createdFields.add(created);
        }

        // create calculated fields on device2
        for (int i = 0; i < 3; i++) {
            CalculatedField cf = new CalculatedField();
            cf.setName(TEST_PREFIX + "CalcField2_" + timestamp + "_" + i);
            cf.setType(CalculatedFieldType.SIMPLE);

            EntityId entityId = new EntityId();
            entityId.setEntityType(EntityType.DEVICE);
            entityId.setId(createdDevice2.getId().getId());
            cf.setEntityId(entityId);

            SimpleCalculatedFieldConfiguration config = new SimpleCalculatedFieldConfiguration();

            Argument arg = new Argument();
            ReferencedEntityKey refKey = new ReferencedEntityKey();
            refKey.setKey("humidity");
            refKey.setType(ArgumentType.TS_LATEST);
            arg.setRefEntityKey(refKey);
            config.putArgumentsItem("hum", arg);

            config.setExpression("hum + " + i);

            TimeSeriesOutput output = new TimeSeriesOutput();
            output.setName("adjustedHumidity_" + i);
            config.setOutput(output);

            cf.setConfiguration(config);

            CalculatedField created = tbApi.saveCalculatedField(cf);
            assertNotNull(created);
            createdFields.add(created);
        }

        // get calculated fields by entity id for device1
        PageDataCalculatedField device1Fields = tbApi.getCalculatedFieldsByEntityIdV2(
                EntityType.DEVICE.toString(), createdDevice1.getId().getId().toString(),
                100, 0, CalculatedFieldType.SIMPLE, null, null, null);
        assertNotNull(device1Fields);
        assertEquals(5, device1Fields.getData().size());

        // get calculated fields by entity id for device2
        PageDataCalculatedField device2Fields = tbApi.getCalculatedFieldsByEntityIdV2(
                EntityType.DEVICE.toString(), createdDevice2.getId().getId().toString(),
                100, 0, CalculatedFieldType.SIMPLE, null, null, null);
        assertEquals(3, device2Fields.getData().size());

        // get by id
        CalculatedField searchField = createdFields.get(2);
        CalculatedField fetchedField = tbApi.getCalculatedFieldById(searchField.getId().getId().toString());
        assertEquals(searchField.getName(), fetchedField.getName());
        assertEquals(searchField.getType(), fetchedField.getType());
        assertNotNull(fetchedField.getConfiguration());
        SimpleCalculatedFieldConfiguration fetchedConfig =
                (SimpleCalculatedFieldConfiguration) fetchedField.getConfiguration();
        assertEquals("temp * 3", fetchedConfig.getExpression());

        // update calculated field
        fetchedField.setName(fetchedField.getName() + "_updated");
        fetchedConfig.setExpression("temp * 100");
        CalculatedField updatedField = tbApi.saveCalculatedField(fetchedField);
        assertEquals(fetchedField.getName(), updatedField.getName());
        SimpleCalculatedFieldConfiguration updatedConfig =
                (SimpleCalculatedFieldConfiguration) updatedField.getConfiguration();
        assertEquals("temp * 100", updatedConfig.getExpression());

        // delete calculated field
        UUID fieldToDeleteId = createdFields.get(0).getId().getId();
        tbApi.deleteCalculatedField(fieldToDeleteId.toString());

        // verify deletion
        assertReturns404(() ->
                tbApi.getCalculatedFieldById(fieldToDeleteId.toString())
        );

        PageDataCalculatedField device1FieldsAfterDelete = tbApi.getCalculatedFieldsByEntityIdV2(
                EntityType.DEVICE.toString(), createdDevice1.getId().getId().toString(),
                100, 0, null, null, null, null);
        assertEquals(4, device1FieldsAfterDelete.getData().size());
    }

}

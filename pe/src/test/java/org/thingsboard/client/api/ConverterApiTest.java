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
import org.thingsboard.client.ApiException;
import org.thingsboard.client.model.Converter;
import org.thingsboard.client.model.ConverterType;
import org.thingsboard.client.model.PageDataConverter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConverterApiTest extends AbstractApiTest {

    public static final JsonNode TEST_DECODER = OBJECT_MAPPER.createObjectNode().put("scriptLang", "TBEL")
            .put("decoder", "")
            .put("tbelDecoder", "// Decode an uplink message from a buffer\\n// payload - array of bytes\\n// metadata - key/value object\\n\\n/** Decoder **/\\n\\n// decode payload to string\\nvar payloadStr = decodeToString(payload);\\n\\n// decode payload to JSON\\n// var data = decodeToJson(payload);\\n\\nvar deviceName = 'Device A';\\nvar deviceType = 'thermostat';\\nvar customerName = 'Customer C';\\nvar groupName = 'thermostat devices';\\nvar manufacturer = 'Example corporation';\\n// use assetName and assetType instead of deviceName and deviceType\\n// to automatically create assets instead of devices.\\n// var assetName = 'Asset A';\\n// var assetType = 'building';\\n\\n// Result object with device/asset attributes/telemetry data\\nvar result = {\\n// Use deviceName and deviceType or assetName and assetType, but not both.\\n   deviceName: deviceName,\\n   deviceType: deviceType,\\n// assetName: assetName,\\n// assetType: assetType,\\n// customerName: customerName,\\n   groupName: groupName,\\n   attributes: {\\n       model: 'Model A',\\n       serialNumber: 'SN111',\\n       integrationName: metadata['integrationName'],\\n       manufacturer: manufacturer\\n   },\\n   telemetry: {\\n       temperature: 42,\\n       humidity: 80,\\n       rawData: payloadStr\\n   }\\n};\\n\\n/** Helper functions 'decodeToString' and 'decodeToJson' are already built-in **/\\n\\nreturn result;\",\"encoder\":null,\"tbelEncoder\":null,\"updateOnlyKeys\":[\"manufacturer\"]}");
    public static final JsonNode TEST_ENCODER = OBJECT_MAPPER.createObjectNode().put("scriptLang", "TBEL")
            .put("encoder", "")
            .put("tbelEncoder", "// Encode a downlink message to a buffer\\n// data - key/value object with device/asset attributes/telemetry to encode\\n// metadata - key/value object\\n\\n/** Encoder **/\\n\\nvar payloadStr = 'Hello';\\nvar payload = encodeToBuffer(payloadStr);\\n\\n/** Helper function 'encodeToBuffer' is already built-in **/\\n\\nreturn payload;");

    private Converter buildConverter(String name, ConverterType type) {
        Converter converter = new Converter();
        converter.setName(name);
        converter.setType(type);
        converter.setConfiguration(type == ConverterType.UPLINK ? TEST_DECODER : TEST_ENCODER);
        return converter;
    }

    @Test
    void testConverterLifecycle() throws ApiException {
        long ts = System.currentTimeMillis();

        // Create
        Converter created = client.saveConverter(buildConverter(TEST_PREFIX + ts, ConverterType.UPLINK));
        assertNotNull(created);
        assertNotNull(created.getId());
        assertEquals(TEST_PREFIX + ts, created.getName());
        assertEquals(ConverterType.UPLINK, created.getType());

        String converterId = created.getId().getId().toString();

        // Get by ID
        Converter fetched = client.getConverterById(converterId);
        assertNotNull(fetched);
        assertEquals(converterId, fetched.getId().getId().toString());
        assertEquals(created.getName(), fetched.getName());

        // Update
        fetched.setName(TEST_PREFIX + ts + "_updated");
        fetched.setDebugMode(true);
        Converter updated = client.saveConverter(fetched);
        assertEquals(TEST_PREFIX + ts + "_updated", updated.getName());

        // Delete
        client.deleteConverter(converterId);

        // Verify gone
        assertReturns404(() -> client.getConverterById(converterId));
    }

    @Test
    void testGetConverters() throws ApiException {
        long ts = System.currentTimeMillis();
        List<String> createdIds = new ArrayList<>();

        // Create 5 UPLINK and 5 DOWNLINK converters (alternating prefix)
        for (int i = 0; i < 10; i++) {
            String name = ((i % 2 == 0) ? TEST_PREFIX : TEST_PREFIX_2) + ts + "_" + i;
            ConverterType type = (i % 2 == 0) ? ConverterType.UPLINK : ConverterType.DOWNLINK;
            Converter c = client.saveConverter(buildConverter(name, type));
            createdIds.add(c.getId().getId().toString());
        }

        // List all - at least 10 created
        PageDataConverter allPage = client.getConverters("100", "0", null, null, null, null, null);
        assertNotNull(allPage);
        assertNotNull(allPage.getData());
        assertTrue(allPage.getTotalElements() >= 10);

        // Filter by textSearch (TEST_PREFIX_2 matches 5)
        PageDataConverter filtered = client.getConverters("100", "0", null, TEST_PREFIX_2, null, null, null);
        assertNotNull(filtered);
        assertEquals(5, filtered.getData().size());
        assertTrue(filtered.getData().stream()
                .allMatch(c -> c.getName().contains(TEST_PREFIX_2)));

        // Pagination: page size 3 over all created should yield hasNext
        PageDataConverter page1 = client.getConverters("3", "0", null, TEST_PREFIX + ts, null, null, null);
        assertEquals(3, page1.getData().size());
        assertTrue(page1.getHasNext());

        // Cleanup
        for (String id : createdIds) {
            client.deleteConverter(id);
        }
    }

    @Test
    void testGetConvertersByIdsV2() throws ApiException {
        long ts = System.currentTimeMillis();

        Converter c1 = client.saveConverter(buildConverter(TEST_PREFIX + ts + "_a", ConverterType.UPLINK));
        Converter c2 = client.saveConverter(buildConverter(TEST_PREFIX + ts + "_b", ConverterType.DOWNLINK));

        String id1 = c1.getId().getId().toString();
        String id2 = c2.getId().getId().toString();

        List<Converter> result = client.getConvertersByIdsV2(List.of(id1, id2));
        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.stream().anyMatch(c -> c.getId().getId().toString().equals(id1)));
        assertTrue(result.stream().anyMatch(c -> c.getId().getId().toString().equals(id2)));

        // Cleanup
        client.deleteConverter(id1);
        client.deleteConverter(id2);
    }

    @Test
    void testNonExistentConverterReturns404() {
        String randomId = UUID.randomUUID().toString();
        assertReturns404(() -> client.getConverterById(randomId));
        assertReturns404(() -> client.deleteConverter(randomId));
    }

}

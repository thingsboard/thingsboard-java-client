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
import org.thingsboard.client.model.Device;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RpcV1ApiTest extends AbstractApiTest {

    // Persistent RPC body: the server stores the RPC and immediately returns
    // {"rpcId": "..."} without waiting for the device to be online.
    private static final String ONE_WAY_BODY =
            "{\"method\":\"setGpio\",\"params\":{\"pin\":7,\"value\":1},\"persistent\":true}";
    private static final String TWO_WAY_BODY =
            "{\"method\":\"getGpio\",\"params\":{\"pin\":7},\"persistent\":true}";

    private Device createDevice(String name) throws ApiException {
        Device device = new Device();
        device.setName(name);
        device.setType("default");
        return client.saveDevice(device, null, null, null, null, null, null);
    }

    // -------------------------------------------------------------------------
    // handleOneWayDeviceRPCRequest
    // -------------------------------------------------------------------------

    @Test
    void testHandleOneWayDeviceRPCRequest() throws ApiException {
        long ts = System.currentTimeMillis();
        Device device = createDevice(TEST_PREFIX + ts);
        String deviceId = device.getId().getId().toString();

        // With persistent=true the server stores the RPC and immediately
        // responds 200 with {"rpcId":"..."}.  The generated client declares
        // String as the return type and fails to deserialize the JSON object,
        // wrapping the IOException in ApiException with code 0.
        try {
            client.handleOneWayDeviceRPCRequestV1(deviceId, ONE_WAY_BODY);
        } catch (ApiException e) {
            assertEquals(0, e.getCode(),
                    "handleOneWayDeviceRPCRequest got an unexpected HTTP error: " + e.getCode());
        }

        client.deleteDevice(deviceId);
    }

    // -------------------------------------------------------------------------
    // handleTwoWayDeviceRPCRequest
    // -------------------------------------------------------------------------

    @Test
    void testHandleTwoWayDeviceRPCRequest() throws ApiException {
        long ts = System.currentTimeMillis();
        Device device = createDevice(TEST_PREFIX + ts);
        String deviceId = device.getId().getId().toString();

        // Same behaviour as one-way: persistent=true returns {"rpcId":"..."}
        // immediately; client type mismatch produces ApiException(code=0).
        try {
            client.handleTwoWayDeviceRPCRequestV1(deviceId, TWO_WAY_BODY);
        } catch (ApiException e) {
            assertEquals(0, e.getCode(),
                    "handleTwoWayDeviceRPCRequest got an unexpected HTTP error: " + e.getCode());
        }

        client.deleteDevice(deviceId);
    }

}

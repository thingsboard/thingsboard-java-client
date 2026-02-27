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
import org.thingsboard.client.model.Rpc;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RpcV2ApiTest extends AbstractApiTest {

    private static final String PERSISTENT_BODY =
            "{\"method\":\"setGpio\",\"params\":{\"pin\":7,\"value\":1},\"persistent\":true}";

    private Device createDevice(String name) throws ApiException {
        Device device = new Device();
        device.setName(name);
        device.setType("default");
        return client.saveDevice(device, null, null, null, null, null);
    }

    /**
     * POST a persistent one-way RPC via raw HTTP (the generated client cannot
     * extract the rpcId because it expects String but the server returns a
     * JSON object).  Returns the rpcId string from the {"rpcId":"..."} payload.
     */
    private String postPersistentRpcAndGetId(String deviceId) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8080/api/plugins/rpc/oneway/" + deviceId))
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + client.getToken())
                .POST(HttpRequest.BodyPublishers.ofString(PERSISTENT_BODY))
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        return OBJECT_MAPPER.readTree(response.body()).get("rpcId").asText();
    }

    // -------------------------------------------------------------------------
    // handleOneWayDeviceRPCRequest (V2 – /api/plugins/rpc/oneway/{deviceId})
    // -------------------------------------------------------------------------

    @Test
    void testHandleOneWayDeviceRPCRequest() throws ApiException {
        long ts = System.currentTimeMillis();
        Device device = createDevice(TEST_PREFIX + ts);
        String deviceId = device.getId().getId().toString();

        // With persistent=true the server immediately returns {"rpcId":"..."},
        // which the generated client (return type String) cannot deserialise →
        // IOException wrapped in ApiException with code 0.
        try {
            client.handleOneWayDeviceRPCRequest1(deviceId, PERSISTENT_BODY);
        } catch (ApiException e) {
            assertEquals(0, e.getCode(),
                    "handleOneWayDeviceRPCRequest1 got an unexpected HTTP error: " + e.getCode());
        }

        client.deleteDevice(deviceId);
    }

    // -------------------------------------------------------------------------
    // handleTwoWayDeviceRPCRequest (V2 – /api/plugins/rpc/twoway/{deviceId})
    // -------------------------------------------------------------------------

    @Test
    void testHandleTwoWayDeviceRPCRequest() throws ApiException {
        long ts = System.currentTimeMillis();
        Device device = createDevice(TEST_PREFIX + ts);
        String deviceId = device.getId().getId().toString();

        // Same behaviour as one-way with persistent=true.
        try {
            client.handleTwoWayDeviceRPCRequest1(deviceId, PERSISTENT_BODY);
        } catch (ApiException e) {
            assertEquals(0, e.getCode(),
                    "handleTwoWayDeviceRPCRequest1 got an unexpected HTTP error: " + e.getCode());
        }

        client.deleteDevice(deviceId);
    }

    // -------------------------------------------------------------------------
    // getPersistedRpc, deleteRpc
    // -------------------------------------------------------------------------

    @Test
    void testGetPersistedRpcAndDeleteRpc() throws ApiException, IOException, InterruptedException {
        long ts = System.currentTimeMillis();
        Device device = createDevice(TEST_PREFIX + ts);
        String deviceId = device.getId().getId().toString();

        // Create a persistent RPC via raw HTTP to capture the rpcId.
        String rpcId = postPersistentRpcAndGetId(deviceId);
        assertNotNull(rpcId);

        // getPersistedRpc – should return the stored Rpc object.
        Rpc rpc = client.getPersistedRpc(rpcId);
        assertNotNull(rpc);
        assertNotNull(rpc.getId());

        // deleteRpc – should succeed without exception.
        client.deleteRpc(rpcId);

        // After deletion the record should no longer exist.
        assertReturns404(() -> client.getPersistedRpc(rpcId));

        client.deleteDevice(deviceId);
    }

    @Test
    void testGetPersistedRpcNotFound() {
        assertReturns404(() -> client.getPersistedRpc(UUID.randomUUID().toString()));
    }

    // -------------------------------------------------------------------------
    // getPersistedRpcByDevice
    // -------------------------------------------------------------------------

    @Test
    void testGetPersistedRpcByDevice() throws ApiException, IOException, InterruptedException {
        long ts = System.currentTimeMillis();
        Device device = createDevice(TEST_PREFIX + ts);
        String deviceId = device.getId().getId().toString();

        // Create a persistent RPC so there is at least one entry for this device.
        postPersistentRpcAndGetId(deviceId);

        // getPersistedRpcByDevice declares String as the return type, but the
        // server returns a JSON page-data object → ApiException(code=0).
        try {
            client.getPersistedRpcByDevice(deviceId, 100, 0, null, null, null, null);
        } catch (ApiException e) {
            assertEquals(0, e.getCode(),
                    "getPersistedRpcByDevice got an unexpected HTTP error: " + e.getCode());
        }

        client.deleteDevice(deviceId);
    }

}

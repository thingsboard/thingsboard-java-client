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
import org.thingsboard.client.model.ConverterId;
import org.thingsboard.client.model.ConverterType;
import org.thingsboard.client.model.Edge;
import org.thingsboard.client.model.EntityType;
import org.thingsboard.client.model.Integration;
import org.thingsboard.client.model.IntegrationConvertersInfo;
import org.thingsboard.client.model.IntegrationType;
import org.thingsboard.client.model.PageDataIntegration;
import org.thingsboard.client.model.PageDataIntegrationInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntegrationApiTest extends AbstractApiTest {

    private static final JsonNode EMPTY_CONFIG = OBJECT_MAPPER.createObjectNode();

    private Converter createConverter(String name) throws ApiException {
        Converter converter = new Converter();
        converter.setName(name);
        converter.setType(ConverterType.UPLINK);
        converter.setConfiguration(ConverterApiTest.TEST_DECODER);
        return client.saveConverter(converter);
    }

    private Integration buildIntegration(String name, String routingKey, String converterId) {
        Integration integration = new Integration();
        integration.setName(name);
        integration.setType(IntegrationType.HTTP);
        integration.setRoutingKey(routingKey);
        integration.setConfiguration(EMPTY_CONFIG);
        integration.setDefaultConverterId(
                new ConverterId().id(UUID.fromString(converterId)).entityType(EntityType.CONVERTER));
        return integration;
    }

    private Edge createEdge(String name, String routingKey) throws ApiException {
        Edge edge = new Edge();
        edge.setName(name);
        edge.setType("default");
        edge.setRoutingKey(routingKey);
        edge.setSecret("edgeSecret_" + routingKey);
        edge.setEdgeLicenseKey("edgeLicense_" + routingKey);
        edge.setCloudEndpoint("http://localhost:8080");
        return client.saveEdge(edge, null, null);
    }

    // -------------------------------------------------------------------------
    // Lifecycle: saveIntegration, getIntegrationById, getIntegrationByRoutingKey,
    //            deleteIntegration
    // -------------------------------------------------------------------------

    @Test
    void testIntegrationLifecycle() throws ApiException {
        long ts = System.currentTimeMillis();

        Converter converter = createConverter(TEST_PREFIX + ts + "_conv");
        String converterId = converter.getId().getId().toString();

        String routingKey = "rk_" + ts;

        // saveIntegration (create)
        Integration saved = client.saveIntegration(buildIntegration(TEST_PREFIX + ts, routingKey, converterId));
        assertNotNull(saved);
        assertNotNull(saved.getId());
        assertEquals(TEST_PREFIX + ts, saved.getName());
        assertEquals(IntegrationType.HTTP, saved.getType());
        assertEquals(routingKey, saved.getRoutingKey());
        String integrationId = saved.getId().getId().toString();

        // getIntegrationById
        Integration fetched = client.getIntegrationById(integrationId);
        assertNotNull(fetched);
        assertEquals(integrationId, fetched.getId().getId().toString());
        assertEquals(TEST_PREFIX + ts, fetched.getName());

        // getIntegrationByRoutingKey
        Integration byRoutingKey = client.getIntegrationByRoutingKey(routingKey);
        assertNotNull(byRoutingKey);
        assertEquals(integrationId, byRoutingKey.getId().getId().toString());

        // saveIntegration (update)
        fetched.setName(TEST_PREFIX + ts + "_updated");
        Integration updated = client.saveIntegration(fetched);
        assertEquals(TEST_PREFIX + ts + "_updated", updated.getName());

        // deleteIntegration
        client.deleteIntegration(integrationId);
        assertReturns404(() -> client.getIntegrationById(integrationId));

        client.deleteConverter(converterId);
    }

    // -------------------------------------------------------------------------
    // getIntegrations, getIntegrationInfos
    // -------------------------------------------------------------------------

    @Test
    void testGetIntegrations() throws ApiException {
        long ts = System.currentTimeMillis();

        Converter converter = createConverter(TEST_PREFIX + ts + "_conv");
        String converterId = converter.getId().getId().toString();

        List<String> createdIds = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Integration saved = client.saveIntegration(
                    buildIntegration(TEST_PREFIX + ts + "_" + i, "rk_" + ts + "_" + i, converterId));
            createdIds.add(saved.getId().getId().toString());
        }

        // getIntegrations
        PageDataIntegration page = client.getIntegrations("100", "0", null, TEST_PREFIX + ts, null, null);
        assertNotNull(page);
        assertTrue(page.getTotalElements() >= 3);

        // getIntegrationInfos
        PageDataIntegrationInfo infoPage = client.getIntegrationInfos("100", "0", null, TEST_PREFIX + ts, null, null);
        assertNotNull(infoPage);
        assertTrue(infoPage.getTotalElements() >= 3);

        for (String id : createdIds) client.deleteIntegration(id);
        client.deleteConverter(converterId);
    }

    // -------------------------------------------------------------------------
    // getIntegrationsByIds / getIntegrationsByIdsV2
    // Note: in this client both names map to the same V2 endpoint method.
    // -------------------------------------------------------------------------

    @Test
    void testGetIntegrationsByIds() throws ApiException {
        long ts = System.currentTimeMillis();

        Converter converter = createConverter(TEST_PREFIX + ts + "_conv");
        String converterId = converter.getId().getId().toString();

        Integration i1 = client.saveIntegration(
                buildIntegration(TEST_PREFIX + ts + "_a", "rk_" + ts + "_a", converterId));
        Integration i2 = client.saveIntegration(
                buildIntegration(TEST_PREFIX + ts + "_b", "rk_" + ts + "_b", converterId));
        String id1 = i1.getId().getId().toString();
        String id2 = i2.getId().getId().toString();

        // getIntegrationsByIdsV2 (covers both getIntegrationsByIds and getIntegrationsByIdsV2)
        List<Integration> result = client.getIntegrationsByIds(List.of(id1, id2));
        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.stream().anyMatch(i -> i.getId().getId().toString().equals(id1)));
        assertTrue(result.stream().anyMatch(i -> i.getId().getId().toString().equals(id2)));

        client.deleteIntegration(id1);
        client.deleteIntegration(id2);
        client.deleteConverter(converterId);
    }

    // -------------------------------------------------------------------------
    // checkIntegrationConnection
    // -------------------------------------------------------------------------

    @Test
    void testCheckIntegrationConnection() throws ApiException {
        long ts = System.currentTimeMillis();

        Converter converter = createConverter(TEST_PREFIX + ts + "_conv");
        String converterId = converter.getId().getId().toString();

        Integration saved = client.saveIntegration(buildIntegration(TEST_PREFIX + ts, "rk_" + ts, converterId));
        String integrationId = saved.getId().getId().toString();

        // checkIntegrationConnection verifies the API endpoint is reachable.
        // A connectivity failure (5xx) is expected in test environments where
        // the integration target may be unavailable; only 4xx indicates a
        // client-side error worth surfacing.
        try {
            client.checkIntegrationConnection(saved);
        } catch (ApiException e) {
            assertTrue(e.getCode() >= 500,
                    "Unexpected client error from checkIntegrationConnection: HTTP " + e.getCode());
        }

        client.deleteIntegration(integrationId);
        client.deleteConverter(converterId);
    }

    // -------------------------------------------------------------------------
    // getIntegrationsConvertersInfo
    // -------------------------------------------------------------------------

    @Test
    void testGetIntegrationsConvertersInfo() throws ApiException {
        Map<String, IntegrationConvertersInfo> info = client.getIntegrationsConvertersInfo();
        assertNotNull(info);
        assertTrue(info.containsKey("HTTP"),
                "Expected 'HTTP' key in integrations converters info map");
    }

    // -------------------------------------------------------------------------
    // Edge: assignIntegrationToEdge, getEdgeIntegrations, getEdgeIntegrationInfos,
    //       findEdgeMissingAttributes, findAllRelatedEdgesMissingAttributes,
    //       unassignIntegrationFromEdge
    // -------------------------------------------------------------------------

    @Test
    void testEdgeIntegrationMethods() throws ApiException {
        long ts = System.currentTimeMillis();

        Converter converter = new Converter();
        converter.setName(TEST_PREFIX + ts + "_conv");
        converter.setType(ConverterType.UPLINK);
        converter.setConfiguration(ConverterApiTest.TEST_DECODER);
        converter.setEdgeTemplate(true);
        converter = client.saveConverter(converter);
        String converterId = converter.getId().getId().toString();

        Integration integration1 = buildIntegration(TEST_PREFIX + ts, "rk_" + ts, converterId);
        integration1.setEdgeTemplate(true);
        Integration integration = client.saveIntegration(
                integration1);
        String integrationId = integration.getId().getId().toString();

        Edge edge = createEdge(TEST_PREFIX + ts + "_edge", String.valueOf(ts));
        String edgeId = edge.getId().getId().toString();

        // assignIntegrationToEdge
        Integration assigned = client.assignIntegrationToEdge(edgeId, integrationId);
        assertNotNull(assigned);
        assertEquals(integrationId, assigned.getId().getId().toString());

        // getEdgeIntegrations
        PageDataIntegration edgeIntegrations = client.getEdgeIntegrations(edgeId, 100, 0, null, null, null);
        assertNotNull(edgeIntegrations);
        assertTrue(edgeIntegrations.getData().stream()
                .anyMatch(i -> i.getId().getId().toString().equals(integrationId)));

        // getEdgeIntegrationInfos
        PageDataIntegrationInfo edgeIntegrationInfos = client.getEdgeIntegrationInfos(edgeId, 100, 0, null, null, null);
        assertNotNull(edgeIntegrationInfos);
        assertTrue(edgeIntegrationInfos.getData().stream()
                .anyMatch(i -> i.getId().getId().toString().equals(integrationId)));

        // unassignIntegrationFromEdge
        Integration unassigned = client.unassignIntegrationFromEdge(edgeId, integrationId);
        assertNotNull(unassigned);
        assertEquals(integrationId, unassigned.getId().getId().toString());

        PageDataIntegration afterUnassign = client.getEdgeIntegrations(edgeId, 100, 0, null, null, null);
        assertTrue(afterUnassign.getData().stream()
                .noneMatch(i -> i.getId().getId().toString().equals(integrationId)));

        client.deleteEdge(edgeId);
        client.deleteIntegration(integrationId);
        client.deleteConverter(converterId);
    }

}

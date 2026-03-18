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
import org.thingsboard.client.model.PageDataEdge;
import org.thingsboard.client.model.PageDataEdgeInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class EdgeApiTest extends AbstractApiTest {

    @Test
    void testEdgeLifecycle() throws ApiException {
        long timestamp = System.currentTimeMillis();
        List<Edge> createdEdges = new ArrayList<>();

        // create 5 edges
        for (int i = 0; i < 5; i++) {
            Edge edge = new Edge();
            edge.setName(TEST_PREFIX + "Edge_" + timestamp + "_" + i);
            edge.setType("gateway");
            edge.setLabel("Test Edge " + i);
            edge.setRoutingKey("routing_key_" + timestamp + "_" + i);
            edge.setSecret("secret_key_" + timestamp + "_" + i);
            edge.setEdgeLicenseKey("license_key_" + timestamp + "_" + i);
            edge.setCloudEndpoint("http://localhost:8080");

            Edge created = client.saveEdge(edge, null, null);
            assertNotNull(created);
            assertNotNull(created.getId());
            assertEquals(edge.getName(), created.getName());
            assertEquals("gateway", created.getType());
            assertNotNull(created.getRoutingKey());
            assertNotNull(created.getSecret());

            createdEdges.add(created);
        }

        // list tenant edges with text search
        PageDataEdge filteredEdges = client.getTenantEdges(100, 0, null,
                TEST_PREFIX + "Edge_" + timestamp, null, null);
        assertNotNull(filteredEdges);
        assertEquals(5, filteredEdges.getData().size());

        // list tenant edges with type filter
        PageDataEdge typedEdges = client.getTenantEdges(100, 0, "gateway",
                TEST_PREFIX + "Edge_" + timestamp, null, null);
        assertEquals(5, typedEdges.getData().size());

        // get tenant edge infos
        PageDataEdgeInfo edgeInfos = client.getAllEdgeInfos(100, 0, true, "gateway",
                TEST_PREFIX + "Edge_" + timestamp, null, null);
        assertEquals(5, edgeInfos.getData().size());

        // get edge by id
        Edge searchEdge = createdEdges.get(2);
        Edge fetchedEdge = client.getEdgeById(searchEdge.getId().getId().toString());
        assertEquals(searchEdge.getName(), fetchedEdge.getName());
        assertEquals(searchEdge.getType(), fetchedEdge.getType());
        assertEquals(searchEdge.getRoutingKey(), fetchedEdge.getRoutingKey());

        // get edge by name
        Edge fetchedByName = client.getTenantEdgeByName(searchEdge.getName());
        assertEquals(searchEdge.getId().getId(), fetchedByName.getId().getId());

        // get edges by list of ids
        List<String> idsToFetch = List.of(
                createdEdges.get(0).getId().getId().toString(),
                createdEdges.get(1).getId().getId().toString()
        );
        List<Edge> edgeList = client.getEdgeList(idsToFetch);
        assertEquals(2, edgeList.size());

        // update edge
        Edge edgeToUpdate = createdEdges.get(3);
        edgeToUpdate.setLabel("Updated Label");
        Edge updatedEdge = client.saveEdge(edgeToUpdate, null, null);
        assertEquals("Updated Label", updatedEdge.getLabel());

        // delete edge
        UUID edgeToDeleteId = createdEdges.get(0).getId().getId();
        client.deleteEdge(edgeToDeleteId.toString());

        // verify deletion
        assertReturns404(() ->
                client.getEdgeById(edgeToDeleteId.toString())
        );

        PageDataEdge edgesAfterDelete = client.getTenantEdges(100, 0, null,
                TEST_PREFIX + "Edge_" + timestamp, null, null);
        assertEquals(4, edgesAfterDelete.getData().size());
    }

}

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
import org.thingsboard.client.model.EdgeInfo;
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

            Edge created = tbApi.saveEdge(edge);
            assertNotNull(created);
            assertNotNull(created.getId());
            assertEquals(edge.getName(), created.getName());
            assertEquals("gateway", created.getType());
            assertNotNull(created.getRoutingKey());
            assertNotNull(created.getSecret());

            createdEdges.add(created);
        }

        // list tenant edges with text search
        PageDataEdge filteredEdges = tbApi.getTenantEdges(100, 0, null,
                TEST_PREFIX + "Edge_" + timestamp, null, null);
        assertNotNull(filteredEdges);
        assertEquals(5, filteredEdges.getData().size());

        // list tenant edges with type filter
        PageDataEdge typedEdges = tbApi.getTenantEdges(100, 0, "gateway",
                TEST_PREFIX + "Edge_" + timestamp, null, null);
        assertEquals(5, typedEdges.getData().size());

        // get tenant edge infos
        PageDataEdgeInfo edgeInfos = tbApi.getTenantEdgeInfos(100, 0, null,
                TEST_PREFIX + "Edge_" + timestamp, null, null);
        assertEquals(5, edgeInfos.getData().size());

        // get edge by id
        Edge searchEdge = createdEdges.get(2);
        Edge fetchedEdge = tbApi.getEdgeById(searchEdge.getId().getId().toString());
        assertEquals(searchEdge.getName(), fetchedEdge.getName());
        assertEquals(searchEdge.getType(), fetchedEdge.getType());
        assertEquals(searchEdge.getRoutingKey(), fetchedEdge.getRoutingKey());

        // get edge by name
        Edge fetchedByName = tbApi.getTenantEdgeByName(searchEdge.getName());
        assertEquals(searchEdge.getId().getId(), fetchedByName.getId().getId());

        // get edges by list of ids
        List<String> idsToFetch = List.of(
                createdEdges.get(0).getId().getId().toString(),
                createdEdges.get(1).getId().getId().toString()
        );
        List<Edge> edgeList = tbApi.getEdgeList(idsToFetch);
        assertEquals(2, edgeList.size());

        // update edge
        Edge edgeToUpdate = createdEdges.get(3);
        edgeToUpdate.setLabel("Updated Label");
        Edge updatedEdge = tbApi.saveEdge(edgeToUpdate);
        assertEquals("Updated Label", updatedEdge.getLabel());

        // assign edge to customer
        String customerId = savedCustomer.getId().getId().toString();
        String edgeId = createdEdges.get(1).getId().getId().toString();
        Edge assignedEdge = tbApi.assignEdgeToCustomer(customerId, edgeId);
        assertNotNull(assignedEdge.getCustomerId());

        // get customer edges
        PageDataEdge customerEdges = tbApi.getCustomerEdges(customerId, 100, 0,
                null, TEST_PREFIX + "Edge_" + timestamp, null, null);
        assertEquals(1, customerEdges.getData().size());

        // get customer edge infos
        PageDataEdgeInfo customerEdgeInfos = tbApi.getCustomerEdgeInfos(customerId, 100, 0,
                null, TEST_PREFIX + "Edge_" + timestamp, null, null);
        assertEquals(1, customerEdgeInfos.getData().size());
        EdgeInfo edgeInfo = customerEdgeInfos.getData().get(0);
        assertNotNull(edgeInfo.getCustomerTitle());

        // unassign edge from customer
        Edge unassignedEdge = tbApi.unassignEdgeFromCustomer(edgeId);
        assertNotNull(unassignedEdge);

        PageDataEdge customerEdgesAfter = tbApi.getCustomerEdges(customerId, 100, 0,
                null, TEST_PREFIX + "Edge_" + timestamp, null, null);
        assertEquals(0, customerEdgesAfter.getData().size());

        // delete edge
        UUID edgeToDeleteId = createdEdges.get(0).getId().getId();
        tbApi.deleteEdge(edgeToDeleteId.toString());

        // verify deletion
        assertReturns404(() ->
                tbApi.getEdgeById(edgeToDeleteId.toString())
        );

        PageDataEdge edgesAfterDelete = tbApi.getTenantEdges(100, 0, null,
                TEST_PREFIX + "Edge_" + timestamp, null, null);
        assertEquals(4, edgesAfterDelete.getData().size());
    }

}

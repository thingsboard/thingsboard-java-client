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
import org.thingsboard.client.model.Customer;
import org.thingsboard.client.model.EntityGroup;
import org.thingsboard.client.model.EntityGroupInfo;
import org.thingsboard.client.model.PageDataCustomer;
import org.thingsboard.client.model.PageDataCustomerInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class CustomerApiTest extends AbstractApiTest {

    @Test
    void testCustomerLifecycle() throws ApiException {
        long timestamp = System.currentTimeMillis();
        List<Customer> createdCustomers = new ArrayList<>();

        // create 20 customers
        for (int i = 0; i < 20; i++) {
            Customer customer = new Customer();
            String customerTitle = ((i % 2 == 0) ? TEST_PREFIX : TEST_PREFIX_2) + timestamp + "_" + i;
            customer.setTitle(customerTitle);
            customer.setEmail("customer_" + timestamp + "_" + i + "@test.com");

            Customer createdCustomer = client.saveCustomer(customer, null, null, null, null, null);
            assertNotNull(createdCustomer);
            assertNotNull(createdCustomer.getId());
            assertEquals(customerTitle, createdCustomer.getTitle());

            createdCustomers.add(createdCustomer);
        }

        // find all, check count (includes savedCustomer from AbstractApiTest setup)
        PageDataCustomer allCustomers = client.getCustomers(100, 0, null, null, null);
        assertNotNull(allCustomers);
        assertNotNull(allCustomers.getData());
        int initialSize = allCustomers.getData().size();
        assertEquals(22, initialSize, "Expected 21 customers (20 created + 2 from setup), but got " + initialSize);

        // find all with search text, check count
        PageDataCustomer filteredCustomers = client.getCustomers(100, 0, TEST_PREFIX_2, null, null);
        assertEquals(10, filteredCustomers.getData().size(), "Expected exactly 10 customers matching prefix");

        // find by id
        Customer searchCustomer = createdCustomers.get(10);
        Customer fetchedCustomer = client.getCustomerById(searchCustomer.getId().getId().toString());
        assertEquals(searchCustomer.getTitle(), fetchedCustomer.getTitle());

        // find by title
        Customer fetchedByTitle = client.getTenantCustomer(searchCustomer.getTitle());
        assertEquals(searchCustomer.getId().getId(), fetchedByTitle.getId().getId());

        // update customer
        fetchedCustomer.setCity("New York");
        fetchedCustomer.setCountry("US");
        Customer updatedCustomer = client.saveCustomer(fetchedCustomer, null, null, null, null, null);
        assertEquals("New York", updatedCustomer.getCity());
        assertEquals("US", updatedCustomer.getCountry());

        PageDataCustomer userCustomers = client.getUserCustomers("100", "0", null, null, null);
        assertEquals(22, userCustomers.getTotalElements(), "Expected 21 customers (20 created + 2 from setup), but got " + initialSize);

        PageDataCustomerInfo allCustomerInfos = client.getAllCustomerInfos(100, 0, true, null, null, null);
        assertEquals(22, allCustomerInfos.getTotalElements(), "Expected 21 customers (20 created + 2 from setup), but got " + initialSize);

        // delete customer
        UUID customerToDeleteId = createdCustomers.get(0).getId().getId();
        client.deleteCustomer(customerToDeleteId.toString());

        // verify deletion
        PageDataCustomer customersAfterDelete = client.getCustomers(100, 0, null, null, null);
        assertEquals(initialSize - 1, customersAfterDelete.getData().size());

        assertReturns404(() ->
                client.getCustomerById(customerToDeleteId.toString())
        );
    }

    @Test
    void testGetCustomerCustomerInfos() throws ApiException {
        String customerId = savedCustomer.getId().getId().toString();

        // Query sub-customer infos of savedCustomer (none created, expect empty page)
        PageDataCustomerInfo result = client.getCustomerCustomerInfos(customerId, 100, 0, true, null, null, null);

        assertNotNull(result);
        assertNotNull(result.getData());
        assertEquals(1, result.getData().size());
    }

    @Test
    void testGetCustomersByIdsV2() throws ApiException {
        String customerId = savedCustomer.getId().getId().toString();

        List<Customer> result = client.getCustomersByIdsV2(List.of(customerId));

        assertNotNull(result);
        assertEquals(1, result.size(), "Expected exactly one customer returned");
        assertEquals(savedCustomer.getId().getId(), result.get(0).getId().getId());
    }

    @Test
    void testGetCustomersByEntityGroupId() throws ApiException {
        // Create a CUSTOMER entity group
        EntityGroup entityGroup = new EntityGroup();
        entityGroup.setType(EntityGroup.TypeEnum.CUSTOMER);
        entityGroup.setName("Test Customer Group");
        EntityGroupInfo savedGroup = client.saveEntityGroup(entityGroup);
        assertNotNull(savedGroup);
        assertNotNull(savedGroup.getId());

        String groupId = savedGroup.getId().getId().toString();
        String customerId = savedCustomer.getId().getId().toString();

        // Add savedCustomer to the group
        client.addEntitiesToEntityGroup(groupId, List.of(customerId));

        // Query customers in the group
        PageDataCustomer result = client.getCustomersByEntityGroupId(groupId, "100", "0", null, null, null);

        assertNotNull(result);
        assertNotNull(result.getData());
        assertEquals(1, result.getData().size(), "Expected exactly one customer in the entity group");
        assertEquals(savedCustomer.getId().getId(), result.getData().get(0).getId().getId());
    }

}

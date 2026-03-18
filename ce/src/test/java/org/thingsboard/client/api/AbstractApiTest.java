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

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.function.Executable;
import org.thingsboard.client.ApiException;
import org.thingsboard.client.ThingsboardClient;
import org.thingsboard.client.model.ActivateUserRequest;
import org.thingsboard.client.model.Authority;
import org.thingsboard.client.model.Customer;
import org.thingsboard.client.model.JwtPair;
import org.thingsboard.client.model.Tenant;
import org.thingsboard.client.model.User;
import org.thingsboard.client.model.UserId;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AbstractApiTest {

    protected static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    protected static final String TEST_PREFIX = "JavaClientTestDevice_";
    protected static final String TEST_PREFIX_2 = "JavaClientTestDevice2_";
    protected static final String CUSTOMER_USERNAME = "javaClientCustomer@thingsboard.org";
    protected static final String TENANT_ADMIN_USERNAME = "javaClientTenant@thingsboard.org";
    protected static final String TEST_PASSWORD = "password123";

    protected static final ObjectMapper MAPPER = new ObjectMapper();

    protected Tenant savedTenant;
    protected User tenantAdmin;
    protected Customer savedCustomer;
    protected User savedCustomerUser;

    protected ThingsboardClient client = ThingsboardClient.builder()
            .url("http://localhost:8080")
            .build();

    @BeforeEach
    void setUp() throws Exception {
        client.login("sysadmin@thingsboard.org", "sysadmin");

        Tenant tenant = new Tenant();
        tenant.setTitle("Java client test tenant");
        savedTenant = client.saveTenant(tenant);

        tenantAdmin = new User();
        tenantAdmin.setAuthority(Authority.TENANT_ADMIN);
        tenantAdmin.setTenantId(savedTenant.getId());
        tenantAdmin.setEmail(TENANT_ADMIN_USERNAME);
        tenantAdmin = client.saveUser(tenantAdmin, "false");
        activateUserAndAuthorize(tenantAdmin);

        Customer customer = new Customer();
        customer.setTitle("Java client test customer");
        customer.setTenantId(savedTenant.getId());
        savedCustomer = client.saveCustomer(customer, null, null, null);

        User customerUser = new User();
        customerUser.setAuthority(Authority.CUSTOMER_USER);
        customerUser.setTenantId(savedTenant.getId());
        customerUser.setCustomerId(savedCustomer.getId());
        customerUser.setEmail(CUSTOMER_USERNAME);
        savedCustomerUser = client.saveUser(customerUser, "false");
        activateUser(savedCustomerUser.getId(), "password123", false);
    }

    @AfterEach
    void tearDown() {
        client.login("sysadmin@thingsboard.org", "sysadmin");
        client.deleteTenant(savedTenant.getId().getId().toString());
    }

    protected void activateUserAndAuthorize(User tenantAdmin) throws ApiException {
        JwtPair jwtPair = activateUser(tenantAdmin.getId(), TEST_PASSWORD, false);
        client.setToken(jwtPair.getToken());
    }

    protected JwtPair activateUser(UserId userId, String password, boolean sendActivationMail) throws ApiException {
        ActivateUserRequest activateRequest = new ActivateUserRequest();
        activateRequest.setActivateToken(getActivateToken(userId));
        activateRequest.setPassword(password);
        return client.activateUser(activateRequest, sendActivationMail);
    }

    protected String getActivateToken(UserId userId) throws ApiException {
        String activateTokenRegex = "/api/noauth/activate?activateToken=";
        String activationLink = client.getActivationLink(userId.getId().toString());
        return activationLink.substring(activationLink.lastIndexOf(activateTokenRegex) + activateTokenRegex.length());
    }

    protected void assertReturns404(Executable operation) {
        ApiException exception = assertThrows(ApiException.class, operation);
        assertEquals(404, exception.getCode(),
                "Expected 404 status code but got " + exception.getCode());
    }

}

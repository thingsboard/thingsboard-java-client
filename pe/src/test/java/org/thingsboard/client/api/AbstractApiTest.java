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
import org.thingsboard.client.ApiClient;
import org.thingsboard.client.ApiException;
import org.thingsboard.client.model.ActivateUserRequest;
import org.thingsboard.client.model.Authority;
import org.thingsboard.client.model.Customer;
import org.thingsboard.client.model.EntityInfo;
import org.thingsboard.client.model.JwtPair;
import org.thingsboard.client.model.LoginRequest;
import org.thingsboard.client.model.LoginResponse;
import org.thingsboard.client.model.Tenant;
import org.thingsboard.client.model.User;
import org.thingsboard.client.model.UserId;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AbstractApiTest {

    protected static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    protected static final String TEST_PREFIX = "JavaClientTestDevice_";
    protected static final String TEST_PREFIX_2 = "JavaClientTestDevice2_";
    protected static final String CUSTOMER_USERNAME = "javaClientCustomer@thingsboard.org";
    protected static final String SUB_CUSTOMER_USERNAME = "javaClientSubCustomer@thingsboard.org";
    protected static final String TENANT_ADMIN_USERNAME = "javaClientTenant@thingsboard.org";
    protected static final String TEST_PASSWORD = "password123";

    protected static final ObjectMapper MAPPER = new ObjectMapper();

    protected Tenant savedTenant;
    protected User tenantAdmin;
    protected Customer savedCustomer;
    protected Customer subCustomer;
    protected User savedCustomerUser;
    protected User savedSubCustomerUser;

    protected final AtomicReference<String> tokenHolder = new AtomicReference<>();
    protected ApiClient apiClient = new ApiClient();

    {
        apiClient.setRequestInterceptor(builder -> {
            String token = tokenHolder.get();
            if (token != null) {
                builder.header("Authorization", "Bearer " + token);
            }
        });
    }

    protected ThingsboardApi tbApi = new ThingsboardApi(apiClient);

    @BeforeEach
    void setUp() throws Exception {
        authorizeAs("sysadmin@thingsboard.org", "sysadmin");

        Tenant tenant = new Tenant();
        tenant.setTitle("Java client test tenant");
        savedTenant = tbApi.saveTenant(tenant);

        tenantAdmin = new User();
        tenantAdmin.setAuthority(Authority.TENANT_ADMIN);
        tenantAdmin.setTenantId(savedTenant.getId());
        tenantAdmin.setEmail(TENANT_ADMIN_USERNAME);
        tenantAdmin = tbApi.saveUser(tenantAdmin, "false", null, null);
        activateUserAndAuthorize(tenantAdmin);

        Customer customer = new Customer();
        customer.setTitle("Java client test customer");
        customer.setTenantId(savedTenant.getId());
        savedCustomer = tbApi.saveCustomer(customer, null, null, null, null, null);

        EntityInfo customerAdminGroup = tbApi.getEntityGroupEntityInfosByOwnerAndTypeAndPageLink("CUSTOMER", savedCustomer.getId().getId().toString(), "USER", "1", "0", "Customer Administrators", null, null).getData().get(0);

        User customerUser = new User();
        customerUser.setAuthority(Authority.CUSTOMER_USER);
        customerUser.setTenantId(savedTenant.getId());
        customerUser.setCustomerId(savedCustomer.getId());
        customerUser.setEmail(CUSTOMER_USERNAME);
        savedCustomerUser = tbApi.saveUser(customerUser, "false", customerAdminGroup.getId().getId().toString(), null);
        activateUser(savedCustomerUser.getId(), "password123", false);

        // subcustomer
        subCustomer = new Customer();
        subCustomer.setTitle("Java client test subCustomer");
        subCustomer.setTenantId(savedTenant.getId());
        subCustomer.setParentCustomerId(savedCustomer.getId());
        subCustomer = tbApi.saveCustomer(subCustomer, null, null, null, null, null);

        EntityInfo subcustomerAdminGroup = tbApi.getEntityGroupEntityInfosByOwnerAndTypeAndPageLink("CUSTOMER", subCustomer.getId().getId().toString(), "USER", "1", "0", "Customer Administrators", null, null).getData().get(0);

        User subcustomerUser = new User();
        subcustomerUser.setAuthority(Authority.CUSTOMER_USER);
        subcustomerUser.setTenantId(savedTenant.getId());
        subcustomerUser.setCustomerId(subCustomer.getId());
        subcustomerUser.setEmail(SUB_CUSTOMER_USERNAME);
        savedSubCustomerUser = tbApi.saveUser(subcustomerUser, "false", subcustomerAdminGroup.getId().getId().toString(), null);
        activateUser(savedSubCustomerUser.getId(), "password123", false);

    }

    @AfterEach
    void tearDown() throws Exception {
        authorizeAs( "sysadmin@thingsboard.org", "sysadmin");
        tbApi.deleteTenant(savedTenant.getId().getId().toString());
    }

    protected void authorizeAs(String userName, String password) throws ApiException {
        LoginRequest loginRequestBody = new LoginRequest();
        loginRequestBody.setUsername(userName);
        loginRequestBody.setPassword(password);

        LoginResponse loginResponse = tbApi.login(loginRequestBody);
        tokenHolder.set(loginResponse.getToken());
    }

    protected void activateUserAndAuthorize(User tenantAdmin) throws ApiException {
        JwtPair jwtPair = activateUser(tenantAdmin.getId(), TEST_PASSWORD, false);
        tokenHolder.set(jwtPair.getToken());
    }

    protected JwtPair activateUser(UserId userId, String password, boolean sendActivationMail) throws ApiException {
        ActivateUserRequest activateRequest = new ActivateUserRequest();
        activateRequest.setActivateToken(getActivateToken(userId));
        activateRequest.setPassword(password);
        return tbApi.activateUser(activateRequest, sendActivationMail);
    }

    protected String getActivateToken(UserId userId) throws ApiException {
        String activateTokenRegex = "/api/noauth/activate?activateToken=";
        String activationLink = tbApi.getActivationLink(userId.getId().toString());
        return activationLink.substring(activationLink.lastIndexOf(activateTokenRegex) + activateTokenRegex.length());
    }

    protected void assertReturns404(Executable operation) {
        ApiException exception = assertThrows(ApiException.class, operation);
        assertEquals(404, exception.getCode(),
                "Expected 404 status code but got " + exception.getCode());
    }

    protected void assertReturns403(Executable operation) {
        ApiException exception = assertThrows(ApiException.class, operation);
        assertEquals(403, exception.getCode(),
                "Expected 403 status code but got " + exception.getCode());
    }

}

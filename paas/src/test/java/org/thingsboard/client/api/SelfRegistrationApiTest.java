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
import org.thingsboard.client.model.Domain;
import org.thingsboard.client.model.DomainId;
import org.thingsboard.client.model.EntityType;
import org.thingsboard.client.model.SelfRegistrationParams;
import org.thingsboard.client.model.SignUpField;
import org.thingsboard.client.model.SignUpFieldId;
import org.thingsboard.client.model.V2CaptchaParams;
import org.thingsboard.client.model.WebSelfRegistrationParams;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

// Note: checkSelfRegistrationPermissions is not present in the generated client
// and is therefore not tested here.
public class SelfRegistrationApiTest extends AbstractApiTest {

    private Domain createDomain(String name) throws ApiException {
        Domain domain = new Domain();
        domain.setName(name);
        return client.saveDomain(domain, null);
    }

    private WebSelfRegistrationParams buildParams(UUID domainId, String title) {
        V2CaptchaParams captcha = new V2CaptchaParams()
                .siteKey("test-site-key")
                .secretKey("test-secret-key");

        SignUpField emailField = new SignUpField()
                .id(SignUpFieldId.EMAIL)
                .label("Email");
        SignUpField passwordField = new SignUpField()
                .id(SignUpFieldId.PASSWORD)
                .label("Password");

        WebSelfRegistrationParams params = new WebSelfRegistrationParams();
        params.setTitle(title);
        params.setCaptcha(captcha);
        params.setSignUpFields(List.of(emailField, passwordField));
        params.setPermissions(List.of());
        params.setDomainId(new DomainId().id(domainId).entityType(EntityType.DOMAIN));
        params.setPrivacyPolicy("Test privacy policy text");
        params.setTermsOfUse("Test terms of use text");
        return params;
    }

    // -------------------------------------------------------------------------
    // Lifecycle: saveWebSelfRegistrationParams, getWebSelfRegistrationParams,
    //            deleteWebSelfRegistrationParams
    // -------------------------------------------------------------------------

    @Test
    void testWebSelfRegistrationParamsLifecycle() throws ApiException {
        long ts = System.currentTimeMillis();
        Domain domain = createDomain("selfreg-" + ts + ".example.com");
        UUID domainId = domain.getId().getId();

        // saveWebSelfRegistrationParams (create)
        WebSelfRegistrationParams saved =
                client.saveWebSelfRegistrationParams(buildParams(domainId, "Test Registration " + ts));
        assertNotNull(saved);
        assertEquals("Test Registration " + ts, saved.getTitle());

        // getWebSelfRegistrationParams
        SelfRegistrationParams fetched = client.getWebSelfRegistrationParams();
        assertNotNull(fetched);
        assertEquals("Test Registration " + ts, fetched.getTitle());

        // saveWebSelfRegistrationParams (update)
        WebSelfRegistrationParams updatedParams = buildParams(domainId, "Updated Registration " + ts);
        WebSelfRegistrationParams updated = client.saveWebSelfRegistrationParams(updatedParams);
        assertNotNull(updated);
        assertEquals("Updated Registration " + ts, updated.getTitle());

        SelfRegistrationParams refetched = client.getWebSelfRegistrationParams();
        assertEquals("Updated Registration " + ts, refetched.getTitle());

        // deleteWebSelfRegistrationParams
        client.deleteWebSelfRegistrationParams();

        client.deleteDomain(domainId);
    }

}

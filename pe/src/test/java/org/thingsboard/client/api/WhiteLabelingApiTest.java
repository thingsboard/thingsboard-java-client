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
import org.thingsboard.client.model.Domain;
import org.thingsboard.client.model.LoginWhiteLabelingParams;
import org.thingsboard.client.model.WhiteLabelingParams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class WhiteLabelingApiTest extends AbstractApiTest {

    @Test
    void testTenantWhiteLabelingLifecycle() throws Exception {
        authorizeAs(TENANT_ADMIN_USERNAME, TEST_PASSWORD);

        // check white labeling permissions for this tenant
        Boolean whiteLabelingAllowed = tbApi.isWhiteLabelingAllowed();
        assertTrue(whiteLabelingAllowed);

        Boolean customerWhiteLabelingAllowed = tbApi.isCustomerWhiteLabelingAllowed();
        assertTrue(customerWhiteLabelingAllowed);

        WhiteLabelingParams currentParams = tbApi.getCurrentWhiteLabelParams(null);
        assertNotNull(currentParams);
        currentParams.setAppTitle("Custom title");

        WhiteLabelingParams saved = tbApi.saveWhiteLabelParams(currentParams, null);
        assertNotNull(saved);
        assertEquals("Custom title", saved.getAppTitle());

        LoginWhiteLabelingParams currentLoginParams = tbApi.getCurrentLoginWhiteLabelParams(null);
        assertNotNull(currentLoginParams);

        Domain domain = new Domain();
        domain.setName("test.com");
        domain = tbApi.saveDomain(domain, null);

        currentLoginParams.setDomainId(domain.getId());
        currentLoginParams.setAppTitle("Custom login title");
        LoginWhiteLabelingParams savedLoginParams = tbApi.saveLoginWhiteLabelParams(currentLoginParams, null);
        assertEquals("Custom login title", savedLoginParams.getAppTitle());
    }

}

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
import org.thingsboard.client.model.SolutionInstallResponse;
import org.thingsboard.client.model.TenantSolutionTemplateDetails;
import org.thingsboard.client.model.TenantSolutionTemplateInfo;
import org.thingsboard.client.model.TenantSolutionTemplateInstructions;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class SolutionApiTest extends AbstractApiTest {

    private static final long DEFAULT_INSTALL_TIMEOUT_MS = 60_000L;
    private static final long POLL_INTERVAL_MS = 1_000L;

    private boolean isInstalled(String templateId) throws ApiException {
        return client.getSolutionTemplateInfos().stream()
                .filter(t -> templateId.equals(t.getId()))
                .findFirst()
                .map(t -> Boolean.TRUE.equals(t.getInstalled()))
                .orElse(false);
    }

    private void waitUntilInstalled(String templateId, long timeoutMs)
            throws ApiException, InterruptedException {
        long deadline = System.currentTimeMillis() + timeoutMs;
        while (!isInstalled(templateId)) {
            if (System.currentTimeMillis() >= deadline) {
                throw new AssertionError(
                        "Solution template '" + templateId + "' was not installed within " + timeoutMs + " ms");
            }
            Thread.sleep(POLL_INTERVAL_MS);
        }
    }

    // -------------------------------------------------------------------------
    // getSolutionTemplateInfos
    // -------------------------------------------------------------------------

    @Test
    void testGetSolutionTemplateInfos() throws ApiException {
        List<TenantSolutionTemplateInfo> infos = client.getSolutionTemplateInfos();
        assertNotNull(infos);
    }

    // -------------------------------------------------------------------------
    // getSolutionTemplateDetails
    // -------------------------------------------------------------------------

    @Test
    void testGetSolutionTemplateDetails() throws ApiException {
        List<TenantSolutionTemplateInfo> infos = client.getSolutionTemplateInfos();
        assumeFalse(infos.isEmpty(), "No solution templates available in this environment");

        String templateId = infos.get(0).getId();

        TenantSolutionTemplateDetails details = client.getSolutionTemplateDetails(templateId);
        assertNotNull(details);
        assertEquals(templateId, details.getId());
    }

    // -------------------------------------------------------------------------
    // installSolutionTemplate, getSolutionTemplateInstructions,
    // uninstallSolutionTemplate
    // -------------------------------------------------------------------------

    @Test
    void testInstallAndUninstallSolutionTemplate() throws ApiException, InterruptedException {
        List<TenantSolutionTemplateInfo> infos = client.getSolutionTemplateInfos();
        assumeFalse(infos.isEmpty(), "No solution templates available in this environment");

        // The test tenant is freshly created, so no template should be installed;
        // skip the test if all happen to be pre-installed.
        TenantSolutionTemplateInfo template = infos.stream()
                .filter(t -> !Boolean.TRUE.equals(t.getInstalled()))
                .findFirst()
                .orElse(null);
        assumeTrue(template != null, "All solution templates are already installed");

        String templateId = template.getId();
        long timeoutMs = template.getInstallTimeoutMs() != null
                ? template.getInstallTimeoutMs()
                : DEFAULT_INSTALL_TIMEOUT_MS;

        // installSolutionTemplate
        SolutionInstallResponse response = client.installSolutionTemplate(templateId);
        assertNotNull(response);

        // Installation is asynchronous – poll until the template reports installed.
        waitUntilInstalled(templateId, timeoutMs);
        assertTrue(isInstalled(templateId),
                "Template should be marked as installed after installSolutionTemplate");

        // getSolutionTemplateInstructions (available after installation)
        TenantSolutionTemplateInstructions instructions =
                client.getSolutionTemplateInstructions(templateId);
        assertNotNull(instructions);

        // uninstallSolutionTemplate
        client.uninstallSolutionTemplate(templateId);

        // Verify the template is no longer installed.
        List<TenantSolutionTemplateInfo> afterUninstall = client.getSolutionTemplateInfos();
        assertFalse(afterUninstall.stream()
                        .filter(t -> templateId.equals(t.getId()))
                        .findFirst()
                        .map(t -> Boolean.TRUE.equals(t.getInstalled()))
                        .orElse(false),
                "Template should not be marked as installed after uninstallSolutionTemplate");
    }

}

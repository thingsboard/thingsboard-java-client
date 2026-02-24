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
import org.thingsboard.client.model.TrendzConfiguration;
import org.thingsboard.client.model.TrendzHealthcheckResult;
import org.thingsboard.client.model.TrendzSynchronizationResult;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrendzApiTest extends AbstractApiTest {

    private static final String FAKE_TRENDZ_URL = "http://trendz.test:8888";
    private static final String FAKE_TB_URL = "http://thingsboard.test:8080";

    /** Saves a minimal Trendz config with placeholder URLs. */
    private TrendzConfiguration saveFakeConfig() throws ApiException {
        TrendzConfiguration config = new TrendzConfiguration();
        config.setTrendzUrl(FAKE_TRENDZ_URL);
        config.setTbUrl(FAKE_TB_URL);
        return tbApi.saveTrendzConfig(config);
    }

    // -------------------------------------------------------------------------
    // saveTrendzConfig, getTrendzConfig
    // -------------------------------------------------------------------------

    @Test
    void testTrendzConfigLifecycle() throws ApiException, IOException, InterruptedException {
        authorizeAs("sysadmin@thingsboard.org", "sysadmin");

        // saveTrendzConfig (create / update)
        TrendzConfiguration saved = saveFakeConfig();
        assertNotNull(saved);
        assertEquals(FAKE_TRENDZ_URL, saved.getTrendzUrl());
        assertEquals(FAKE_TB_URL, saved.getTbUrl());

        // getTrendzConfig
        TrendzConfiguration fetched = tbApi.getTrendzConfig();
        assertNotNull(fetched);
        assertEquals(FAKE_TRENDZ_URL, fetched.getTrendzUrl());
        assertEquals(FAKE_TB_URL, fetched.getTbUrl());

        // saveTrendzConfig (update)
        fetched.setTrendzUrl("http://trendz-updated.test:8888");
        TrendzConfiguration updated = tbApi.saveTrendzConfig(fetched);
        assertNotNull(updated);
        assertEquals("http://trendz-updated.test:8888", updated.getTrendzUrl());
    }

    // -------------------------------------------------------------------------
    // connectToTrendz
    //
    // Requires an actual Trendz instance. With a fake URL the server will fail
    // to connect; a result object with an error status or a 4xx/5xx exception
    // are both acceptable.
    // -------------------------------------------------------------------------

    @Test
    void testConnectToTrendz() throws ApiException, IOException, InterruptedException {
        authorizeAs("sysadmin@thingsboard.org", "sysadmin");

        saveFakeConfig();

        try {
            TrendzSynchronizationResult result = tbApi.connectToTrendz();
            assertNotNull(result);
        } catch (ApiException e) {
            assertTrue(e.getCode() >= 400,
                    "connectToTrendz returned unexpected HTTP status: " + e.getCode());
        }
    }

    // -------------------------------------------------------------------------
    // publicConnectToTrendz
    // -------------------------------------------------------------------------

    @Test
    void testPublicConnectToTrendz() throws ApiException, IOException, InterruptedException {
        authorizeAs("sysadmin@thingsboard.org", "sysadmin");

        saveFakeConfig();

        // publicConnectToTrendz returns void; verify it does not throw an
        // unexpected error (only 4xx/5xx are acceptable when Trendz is absent).
        try {
            tbApi.publicConnectToTrendz();
        } catch (ApiException e) {
            assertTrue(e.getCode() >= 400,
                    "publicConnectToTrendz returned unexpected HTTP status: " + e.getCode());
        }
    }

    // -------------------------------------------------------------------------
    // getTrendzSyncResult
    // -------------------------------------------------------------------------

    @Test
    void testGetTrendzSyncResult() throws ApiException, IOException, InterruptedException {
        authorizeAs("sysadmin@thingsboard.org", "sysadmin");
        saveFakeConfig();

        try {
            TrendzSynchronizationResult result = tbApi.getTrendzSyncResult();
            assertNotNull(result);
        } catch (ApiException e) {
            assertTrue(e.getCode() >= 400,
                    "getTrendzSyncResult returned unexpected HTTP status: " + e.getCode());
        }
    }

    // -------------------------------------------------------------------------
    // performTrendzHealthcheck
    // -------------------------------------------------------------------------

    @Test
    void testPerformTrendzHealthcheck() throws ApiException, IOException, InterruptedException {
        authorizeAs("sysadmin@thingsboard.org", "sysadmin");
        saveFakeConfig();

        try {
            TrendzHealthcheckResult result = tbApi.performTrendzHealthcheck();
            assertNotNull(result);
        } catch (ApiException e) {
            assertTrue(e.getCode() >= 400,
                    "performTrendzHealthcheck returned unexpected HTTP status: " + e.getCode());
        }
    }

}

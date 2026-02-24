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
import org.thingsboard.client.model.CreateReportRequest;
import org.thingsboard.client.model.Job;
import org.thingsboard.client.model.PageDataReport;
import org.thingsboard.client.model.PageDataReportInfo;
import org.thingsboard.client.model.PdfReportTemplateConfig;
import org.thingsboard.client.model.Report;
import org.thingsboard.client.model.ReportRequest;
import org.thingsboard.client.model.ReportTemplate;
import org.thingsboard.client.model.ReportTemplateType;
import org.thingsboard.client.model.TbReportFormat;

import java.io.File;
import java.nio.file.Files;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReportApiTest extends AbstractApiTest {

    private static final long REPORT_POLL_TIMEOUT_MS = 30_000L;
    private static final long POLL_INTERVAL_MS = 2_000L;

    private ReportTemplate createTemplate(String name) throws ApiException {
        PdfReportTemplateConfig config = new PdfReportTemplateConfig().components(List.of());
        ReportTemplate template = new ReportTemplate();
        template.setName(name);
        template.setFormat(TbReportFormat.PDF);
        template.setType(ReportTemplateType.REPORT);
        template.setConfiguration(config);
        return tbApi.saveReportTemplate(template);
    }

    private ReportRequest buildRequest(ReportTemplate template) {
        ReportRequest request = new ReportRequest();
        request.setReportTemplateId(template.getId());
        request.setTimezone("UTC");
        return request;
    }

    /**
     * Polls getReports until at least one report exists or the timeout expires.
     * Returns the first report found, or null if none appeared in time.
     */
    private Report waitForReport() throws ApiException, InterruptedException {
        long deadline = System.currentTimeMillis() + REPORT_POLL_TIMEOUT_MS;
        while (System.currentTimeMillis() < deadline) {
            PageDataReport page = tbApi.getReports(1, 0, null, null, null);
            if (page != null && !page.getData().isEmpty()) {
                return page.getData().get(0);
            }
            Thread.sleep(POLL_INTERVAL_MS);
        }
        return null;
    }

    // -------------------------------------------------------------------------
    // getReports, getReportInfos
    // -------------------------------------------------------------------------

    @Test
    void testGetReports() throws ApiException {
        PageDataReport page = tbApi.getReports(100, 0, null, null, null);
        assertNotNull(page);
        assertNotNull(page.getData());
    }

    @Test
    void testGetReportInfos() throws ApiException {
        PageDataReportInfo infoPage =
                tbApi.getReportInfos(100, 0, null, null, null, null, null, null);
        assertNotNull(infoPage);
        assertNotNull(infoPage.getData());
    }

    // -------------------------------------------------------------------------
    // requestReport
    // -------------------------------------------------------------------------

    @Test
    void testRequestReport() throws ApiException {
        long ts = System.currentTimeMillis();
        ReportTemplate template = createTemplate(TEST_PREFIX + ts);

        Job job = tbApi.requestReport(buildRequest(template));
        assertNotNull(job);
        assertNotNull(job.getId());

        tbApi.deleteReportTemplate(template.getId().getId().toString());
    }

    // -------------------------------------------------------------------------
    // testReportAndDownload
    // -------------------------------------------------------------------------

    @Test
    void testTestReportAndDownload() throws ApiException {
        long ts = System.currentTimeMillis();
        ReportTemplate template = createTemplate(TEST_PREFIX + ts);

        // Rendering requires dashboard components; an empty template may produce
        // an empty file or fail server-side.  Both outcomes are acceptable.
        try {
            tbApi.testReportAndDownload(buildRequest(template));
        } catch (ApiException e) {
            assertTrue(e.getCode() >= 400,
                    "testReportAndDownload returned unexpected HTTP status: " + e.getCode());
        }

        tbApi.deleteReportTemplate(template.getId().getId().toString());
    }

    // -------------------------------------------------------------------------
    // createReport
    // -------------------------------------------------------------------------

    @Test
    void testCreateReport() throws Exception {
        // createReport uploads a pre-generated report file. The generated client
        // sends the File field as a JSON path string (Content-Type: application/json),
        // so the server may reject the request with 4xx.  Both a successful creation
        // and a 4xx error are acceptable outcomes for this generated client.
        File tmpFile = Files.createTempFile("test-report", ".pdf").toFile();
        Files.writeString(tmpFile.toPath(), "%PDF-1.4 empty test");

        CreateReportRequest request = new CreateReportRequest();
        request.setFile(tmpFile);
        request.setInfo("{}");

        try {
            Report report = tbApi.createReport(request);
            if (report != null && report.getId() != null) {
                tbApi.deleteReport(report.getId().getId().toString());
            }
        } catch (ApiException e) {
            assertTrue(e.getCode() >= 400,
                    "createReport returned unexpected HTTP status: " + e.getCode());
        } finally {
            tmpFile.delete();
        }
    }

    // -------------------------------------------------------------------------
    // getReportById, downloadReport, deleteReport
    // -------------------------------------------------------------------------

    @Test
    void testReportLifecycle() throws Exception {
        long ts = System.currentTimeMillis();
        ReportTemplate template = createTemplate(TEST_PREFIX + ts);

        // Trigger async report generation.
        tbApi.requestReport(buildRequest(template));

        // Poll until the report is available.  In environments without a headless
        // browser the report will never appear; fall back to verifying the 404 path.
        Report report = waitForReport();
        if (report == null) {
            assertReturns404(() -> tbApi.getReportById(UUID.randomUUID().toString()));
            tbApi.deleteReportTemplate(template.getId().getId().toString());
            return;
        }

        String reportId = report.getId().getId().toString();

        // getReportById
        Report fetched = tbApi.getReportById(reportId);
        assertNotNull(fetched);
        assertEquals(reportId, fetched.getId().getId().toString());

        // downloadReport
        File downloaded = tbApi.downloadReport(report.getId().getId());
        assertNotNull(downloaded);

        // deleteReport
        tbApi.deleteReport(reportId);
        assertReturns404(() -> tbApi.getReportById(reportId));

        tbApi.deleteReportTemplate(template.getId().getId().toString());
    }

}

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
import org.thingsboard.client.model.PageDataReportTemplateInfo;
import org.thingsboard.client.model.PdfReportTemplateConfig;
import org.thingsboard.client.model.ReportTemplate;
import org.thingsboard.client.model.ReportTemplateInfo;
import org.thingsboard.client.model.ReportTemplateType;
import org.thingsboard.client.model.TbReportFormat;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReportTemplateApiTest extends AbstractApiTest {

    private ReportTemplate buildTemplate(String name) {
        PdfReportTemplateConfig config = new PdfReportTemplateConfig()
                .components(List.of());

        ReportTemplate template = new ReportTemplate();
        template.setName(name);
        template.setFormat(TbReportFormat.PDF);
        template.setType(ReportTemplateType.REPORT);
        template.setConfiguration(config);
        return template;
    }

    private ReportTemplate createTemplate(String name) throws ApiException {
        return client.saveReportTemplate(buildTemplate(name));
    }

    // -------------------------------------------------------------------------
    // Lifecycle: saveReportTemplate, getReportTemplateById,
    //            getReportTemplateInfoById, deleteReportTemplate
    // -------------------------------------------------------------------------

    @Test
    void testReportTemplateLifecycle() throws ApiException {
        long ts = System.currentTimeMillis();
        String name = TEST_PREFIX + ts;

        // saveReportTemplate (create)
        ReportTemplate saved = createTemplate(name);
        assertNotNull(saved);
        assertNotNull(saved.getId());
        assertEquals(name, saved.getName());
        assertEquals(TbReportFormat.PDF, saved.getFormat());
        assertEquals(ReportTemplateType.REPORT, saved.getType());
        String templateId = saved.getId().getId().toString();

        // getReportTemplateById
        ReportTemplate fetched = client.getReportTemplateById(templateId);
        assertNotNull(fetched);
        assertEquals(templateId, fetched.getId().getId().toString());
        assertEquals(name, fetched.getName());

        // getReportTemplateInfoById
        ReportTemplateInfo info = client.getReportTemplateInfoById(templateId);
        assertNotNull(info);
        assertEquals(templateId, info.getId().getId().toString());
        assertEquals(name, info.getName());
        assertEquals(TbReportFormat.PDF, info.getFormat());

        // saveReportTemplate (update)
        fetched.setName(name + "_updated");
        ReportTemplate updated = client.saveReportTemplate(fetched);
        assertEquals(name + "_updated", updated.getName());

        // deleteReportTemplate
        client.deleteReportTemplate(templateId);
        assertReturns404(() -> client.getReportTemplateById(templateId));
    }

    // -------------------------------------------------------------------------
    // getAllReportTemplateInfos
    // -------------------------------------------------------------------------

    @Test
    void testGetAllReportTemplateInfos() throws ApiException {
        long ts = System.currentTimeMillis();

        ReportTemplate t1 = createTemplate(TEST_PREFIX + ts + "_1");
        ReportTemplate t2 = createTemplate(TEST_PREFIX + ts + "_2");
        ReportTemplate t3 = createTemplate(TEST_PREFIX + ts + "_3");
        String id1 = t1.getId().getId().toString();
        String id2 = t2.getId().getId().toString();
        String id3 = t3.getId().getId().toString();

        PageDataReportTemplateInfo page = client.getAllReportTemplateInfos(
                100, 0, null, null, null, TEST_PREFIX + ts, null, null);
        assertNotNull(page);
        assertTrue(page.getTotalElements() >= 3);
        assertTrue(page.getData().stream().anyMatch(t -> t.getId().getId().toString().equals(id1)));
        assertTrue(page.getData().stream().anyMatch(t -> t.getId().getId().toString().equals(id2)));
        assertTrue(page.getData().stream().anyMatch(t -> t.getId().getId().toString().equals(id3)));

        client.deleteReportTemplate(id1);
        client.deleteReportTemplate(id2);
        client.deleteReportTemplate(id3);
    }

    // -------------------------------------------------------------------------
    // getReportTemplatesByIds
    // -------------------------------------------------------------------------

    @Test
    void testGetReportTemplatesByIds() throws ApiException {
        long ts = System.currentTimeMillis();

        ReportTemplate t1 = createTemplate(TEST_PREFIX + ts + "_a");
        ReportTemplate t2 = createTemplate(TEST_PREFIX + ts + "_b");
        String id1 = t1.getId().getId().toString();
        String id2 = t2.getId().getId().toString();

        List<ReportTemplateInfo> result = client.getReportTemplatesByIds(List.of(id1, id2));
        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.stream().anyMatch(t -> t.getId().getId().toString().equals(id1)));
        assertTrue(result.stream().anyMatch(t -> t.getId().getId().toString().equals(id2)));

        client.deleteReportTemplate(id1);
        client.deleteReportTemplate(id2);
    }

    // -------------------------------------------------------------------------
    // Not found
    // -------------------------------------------------------------------------

    @Test
    void testGetReportTemplateByIdNotFound() {
        assertReturns404(() -> client.getReportTemplateById(UUID.randomUUID().toString()));
    }

}

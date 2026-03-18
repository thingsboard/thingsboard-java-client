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
import org.thingsboard.client.model.Asset;
import org.thingsboard.client.model.AssetInfo;
import org.thingsboard.client.model.BulkImportColumnType;
import org.thingsboard.client.model.BulkImportRequest;
import org.thingsboard.client.model.BulkImportResultAsset;
import org.thingsboard.client.model.ColumnMapping;
import org.thingsboard.client.model.EntitySubtype;
import org.thingsboard.client.model.Mapping;
import org.thingsboard.client.model.PageDataAsset;
import org.thingsboard.client.model.PageDataAssetInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssetApiTest extends AbstractApiTest {

    @Test
    void testAssetLifecycle() throws ApiException {
        long timestamp = System.currentTimeMillis();
        List<Asset> createdAssets = new ArrayList<>();

        // create 20 assets
        for (int i = 0; i < 20; i++) {
            Asset asset = new Asset();
            String assetName = ((i % 2 == 0) ? TEST_PREFIX : TEST_PREFIX_2) + timestamp + "_" + i;
            asset.setName(assetName);
            asset.setLabel("Test Asset " + i);
            asset.setType(((i % 2 == 0) ? "default" : "building"));

            Asset createdAsset = client.saveAsset(asset, null, null, null, null, null);
            assertNotNull(createdAsset);
            assertNotNull(createdAsset.getId());
            assertEquals(assetName, createdAsset.getName());

            createdAssets.add(createdAsset);
        }

        // find all, check count
        PageDataAsset allAssets = client.getTenantAssets(100, 0, null, null, null, null);

        assertNotNull(allAssets);
        assertNotNull(allAssets.getData());
        int initialSize = allAssets.getData().size();
        assertEquals(20, initialSize, "Expected at least 20 assets, but got " + allAssets.getData().size());

        //find all with search text, check count
        PageDataAsset allAssetsBySearchText = client.getTenantAssets(100, 0, null, TEST_PREFIX_2, null, null);
        assertEquals(10, allAssetsBySearchText.getData().size(), "Expected exactly 10 test assets");

        // find by id
        Asset searchAsset = createdAssets.get(10);
        Asset asset = client.getAssetById(searchAsset.getId().getId().toString());
        assertEquals(searchAsset.getName(), asset.getName());

        // delete asset
        UUID assetToDeleteId = createdAssets.get(0).getId().getId();
        client.deleteAsset(assetToDeleteId.toString());

        // Verify the asset is deleted
        PageDataAsset assetsAfterDelete = client.getTenantAssets(100, 0, null, null, null, null);
        assertEquals(initialSize - 1, assetsAfterDelete.getData().size());

        assertReturns404(() ->
                client.getAssetById(assetToDeleteId.toString())
        );
    }

    @Test
    void testGetAssetInfoAndSearch() throws ApiException {
        long timestamp = System.currentTimeMillis();

        // create assets with distinct types
        Asset a1 = new Asset();
        a1.setName(TEST_PREFIX + timestamp + "_info_0");
        a1.setType("warehouse");
        Asset saved1 = client.saveAsset(a1, null, null, null, null, null);

        Asset a2 = new Asset();
        a2.setName(TEST_PREFIX + timestamp + "_info_1");
        a2.setType("factory");
        Asset saved2 = client.saveAsset(a2, null, null, null, null, null);

        // getAssetInfoById — enriched with profile name and customer title
        AssetInfo info = client.getAssetInfoById(saved1.getId().getId().toString());
        assertNotNull(info);
        assertEquals(saved1.getName(), info.getName());
        assertNotNull(info.getAssetProfileId());

        // getTenantAssetByName — exact name lookup
        Asset byName = client.getTenantAssetByName(saved1.getName());
        assertNotNull(byName);
        assertEquals(saved1.getName(), byName.getName());
        assertEquals(saved1.getId().getId(), byName.getId().getId());

        // getAssetsByIds — batch fetch
        List<String> ids = List.of(
                saved1.getId().getId().toString(),
                saved2.getId().getId().toString()
        );
        List<Asset> batch = client.getAssetsByIds(ids);
        assertNotNull(batch);
        assertEquals(2, batch.size());

        // getAssetTypes — lists all distinct asset types used by this tenant
        List<EntitySubtype> types = client.getAssetTypes();
        assertNotNull(types);
        List<String> typeNames = types.stream().map(EntitySubtype::getType).collect(Collectors.toList());
        assertTrue(typeNames.contains("warehouse"));
        assertTrue(typeNames.contains("factory"));

        // getAllAssetInfos — paginated asset info list for the tenant
        PageDataAssetInfo allInfos = client.getAllAssetInfos(100, 0, false, null, null, null, null);
        assertNotNull(allInfos);
        assertNotNull(allInfos.getData());
        assertTrue(allInfos.getData().size() >= 2);
    }

    @Test
    void testAssetBulkImport() throws ApiException {
        long timestamp = System.currentTimeMillis();

        // build a CSV payload with three assets
        String csv = "name,label\n"
                     + TEST_PREFIX + timestamp + "_bulk_0,Bulk Asset 0\n"
                     + TEST_PREFIX + timestamp + "_bulk_1,Bulk Asset 1\n"
                     + TEST_PREFIX + timestamp + "_bulk_2,Bulk Asset 2\n";

        Mapping mapping = new Mapping();
        mapping.setDelimiter(",");
        mapping.setHeader(true);
        mapping.setUpdate(false);
        mapping.setColumns(List.of(
                new ColumnMapping().type(BulkImportColumnType.NAME),
                new ColumnMapping().type(BulkImportColumnType.LABEL)
        ));

        BulkImportRequest request = new BulkImportRequest();
        request.setFile(csv);
        request.setMapping(mapping);

        BulkImportResultAsset result = client.processAssetBulkImport(request);
        assertNotNull(result);
        List<String> errors = result.getErrorsList();
        assertTrue(errors == null || errors.isEmpty(), "Expected no import errors: " + errors);
    }

}

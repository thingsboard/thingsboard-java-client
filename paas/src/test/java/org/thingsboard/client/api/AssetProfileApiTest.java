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
import org.thingsboard.client.model.AssetProfile;
import org.thingsboard.client.model.AssetProfileInfo;
import org.thingsboard.client.model.EntityInfo;
import org.thingsboard.client.model.PageDataAssetProfile;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class AssetProfileApiTest extends AbstractApiTest {

    @Test
    void testAssetProfileLifecycle() throws ApiException {
        long timestamp = System.currentTimeMillis();
        List<AssetProfile> createdProfiles = new ArrayList<>();

        // Get initial count (there should be a default profile)
        PageDataAssetProfile initialProfiles = client.getAssetProfiles(100, 0, null, null, null);
        assertNotNull(initialProfiles);
        int initialSize = initialProfiles.getData().size();
        assertTrue(initialSize == 1, "Expected at least 1 default asset profile");

        // Get default asset profile info
        AssetProfileInfo defaultProfileInfo = client.getDefaultAssetProfileInfo();
        assertNotNull(defaultProfileInfo);
        assertEquals(defaultProfileInfo.getName(), "default");

        // Create multiple asset profiles
        for (int i = 0; i < 5; i++) {
            AssetProfile profile = new AssetProfile();
            profile.setName("Test Asset Profile " + timestamp + "_" + i);
            profile.setDescription("Test description " + i);

            AssetProfile created = client.saveAssetProfile(profile);
            assertNotNull(created);
            assertNotNull(created.getId());
            assertEquals(profile.getName(), created.getName());
            assertEquals(profile.getDescription(), created.getDescription());
            assertFalse(created.getDefault());

            createdProfiles.add(created);
        }

        // Find all, check count
        PageDataAssetProfile allProfiles = client.getAssetProfiles(100, 0, null, null, null);
        assertNotNull(allProfiles);
        assertEquals(initialSize + 5, allProfiles.getData().size());

        // Find all with text search
        PageDataAssetProfile filteredProfiles = client.getAssetProfiles(100, 0, "Test Asset Profile " + timestamp, null, null);
        assertEquals(5, filteredProfiles.getData().size());

        // Get by id
        AssetProfile searchProfile = createdProfiles.get(2);
        AssetProfile fetchedProfile = client.getAssetProfileById(searchProfile.getId().getId().toString(), false);
        assertEquals(searchProfile.getName(), fetchedProfile.getName());
        assertEquals(searchProfile.getDescription(), fetchedProfile.getDescription());

        // Update asset profile
        fetchedProfile.setDescription("Updated description");
        AssetProfile updatedProfile = client.saveAssetProfile(fetchedProfile);
        assertEquals("Updated description", updatedProfile.getDescription());
        assertEquals(fetchedProfile.getName(), updatedProfile.getName());

        // Get asset profile info by id
        AssetProfileInfo profileInfo = client.getAssetProfileInfoById(searchProfile.getId().getId().toString());
        assertNotNull(profileInfo);
        assertEquals(searchProfile.getName(), profileInfo.getName());

        // Get asset profile infos (paginated)
        PageDataAssetProfile profileInfos = client.getAssetProfiles(100, 0, null, null, null);
        assertNotNull(profileInfos);
        assertEquals(initialSize + 5, profileInfos.getData().size());

        // Set a profile as default
        AssetProfile profileToSetDefault = createdProfiles.get(1);
        AssetProfile newDefault = client.setDefaultAssetProfile(profileToSetDefault.getId().getId().toString());
        assertNotNull(newDefault);
        assertTrue(newDefault.getDefault());

        // Verify default profile info now points to the new default
        AssetProfileInfo newDefaultInfo = client.getDefaultAssetProfileInfo();
        assertEquals(profileToSetDefault.getName(), newDefaultInfo.getName());

        // Get asset profile names
        List<EntityInfo> profileNames = client.getAssetProfileNames(false);
        assertNotNull(profileNames);
        assertEquals(createdProfiles.size() + 1, profileNames.size());

        // Delete asset profile (cannot delete the default one, so delete a non-default one)
        UUID profileToDeleteId = createdProfiles.get(0).getId().getId();
        client.deleteAssetProfile(profileToDeleteId.toString());

        // Verify the profile is deleted
        assertReturns404(() ->
                client.getAssetProfileById(profileToDeleteId.toString(), false));

        // Verify count after deletion
        PageDataAssetProfile profilesAfterDelete = client.getAssetProfiles(100, 0, null, null, null);
        assertEquals(initialSize + 4, profilesAfterDelete.getData().size());

        // Restore original default profile
        AssetProfile originalDefault = initialProfiles.getData().stream()
                .filter(AssetProfile::getDefault)
                .findFirst()
                .orElseThrow();
        client.setDefaultAssetProfile(originalDefault.getId().getId().toString());
    }

}

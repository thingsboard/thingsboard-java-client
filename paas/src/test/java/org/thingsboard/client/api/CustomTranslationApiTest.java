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

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;
import org.thingsboard.client.ApiException;
import org.thingsboard.client.model.TranslationInfo;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CustomTranslationApiTest extends AbstractApiTest {

    private static final String TEST_LOCALE = "en_US";

    private File createTranslationFile(String jsonContent) throws Exception {
        Path tempFile = Files.createTempFile("translation_", ".json");
        Files.writeString(tempFile, jsonContent);
        tempFile.toFile().deleteOnExit();
        return tempFile.toFile();
    }

    private TranslationInfo findLocaleInfo(String localeCode) throws ApiException {
        List<TranslationInfo> infos = client.getTranslationInfos();
        assertNotNull(infos);
        return infos.stream()
                .filter(t -> localeCode.equals(t.getLocaleCode()))
                .findFirst()
                .orElseThrow(() -> new AssertionError("Locale '" + localeCode + "' not found in translation infos"));
    }

    @Test
    void testUploadAndDeleteCustomTranslation() throws Exception {
        File translationFile = createTranslationFile("{\"testGreeting\":\"Hello\"}");

        // Upload custom translation
        client.uploadCustomTranslation(TEST_LOCALE, translationFile);

        // Verify locale is now marked as customized
        TranslationInfo localeInfo = findLocaleInfo(TEST_LOCALE);
        assertTrue(localeInfo.getCustomized(),
                "Locale should be customized after upload");

        // Delete the whole custom translation for the locale
        client.deleteCustomTranslation(TEST_LOCALE);

        // Verify customized flag is cleared
        assertFalse(findLocaleInfo(TEST_LOCALE).getCustomized(),
                "Locale should no longer be customized after delete");
    }

    @Test
    void testDeleteCustomTranslationKey() throws Exception {
        // Upload a translation with two flat keys
        File translationFile = createTranslationFile(
                "{\"testGreeting\":\"Hello\",\"testFarewell\":\"Goodbye\"}");
        client.uploadCustomTranslation(TEST_LOCALE, translationFile);

        assertTrue(findLocaleInfo(TEST_LOCALE).getCustomized());

        // Delete only one key — the other should keep the locale customized
        client.deleteCustomTranslationKey(TEST_LOCALE, "testGreeting");

        assertTrue(findLocaleInfo(TEST_LOCALE).getCustomized(),
                "Locale should still be customized after deleting just one of two keys");

        // Cleanup
        client.deleteCustomTranslation(TEST_LOCALE);
    }

    @Test
    void testSaveAndGetCustomTranslation() throws ApiException {
        Map<String, Object> translations = Map.of("testGreeting", "Hello", "testFarewell", "Goodbye");

        // Save (create or fully replace) the custom translation
        client.saveCustomTranslation(TEST_LOCALE, translations);

        // Verify the stored content matches what was saved
        JsonNode fetched = client.getCustomTranslation(TEST_LOCALE);
        assertNotNull(fetched);
        assertEquals("Hello", fetched.get("testGreeting").asText());
        assertEquals("Goodbye", fetched.get("testFarewell").asText());

        // Cleanup
        client.deleteCustomTranslation(TEST_LOCALE);
    }

    @Test
    void testPatchCustomTranslation() throws ApiException {
        // Save an initial state with two keys
        client.saveCustomTranslation(TEST_LOCALE, Map.of("testGreeting", "Hello", "testFarewell", "Goodbye"));

        // Patch updates only the supplied keys, leaving others intact
        client.patchCustomTranslation(TEST_LOCALE, Map.of("testGreeting", "Hi"));

        JsonNode patched = client.getCustomTranslation(TEST_LOCALE);
        assertNotNull(patched);
        assertEquals("Hi", patched.get("testGreeting").asText(), "Patched key should be updated");
        assertEquals("Goodbye", patched.get("testFarewell").asText(), "Unpatched key should remain unchanged");

        // Cleanup
        client.deleteCustomTranslation(TEST_LOCALE);
    }

    @Test
    void testGetMergedCustomTranslation() throws ApiException {
        // Save a custom override
        client.saveCustomTranslation(TEST_LOCALE, Map.of("testGreeting", "Hello"));

        // Merged result combines built-in platform keys and custom overrides
        JsonNode merged = client.getMergedCustomTranslation(TEST_LOCALE);
        assertNotNull(merged);
        assertFalse(merged.isEmpty(), "Merged translation should contain at least the built-in keys");
        assertEquals("Hello", merged.get("testGreeting").asText(), "Custom key should appear in merged result");

        // Cleanup
        client.deleteCustomTranslation(TEST_LOCALE);
    }

}

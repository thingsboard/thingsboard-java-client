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
package org.thingsboard.client;

import org.junit.jupiter.api.Test;
import org.thingsboard.client.api.ThingsboardApi;
import org.thingsboard.client.api.ThingsboardApi.GetTimeseriesHistoryArgs;
import org.thingsboard.client.api.ThingsboardApi.GetUserAssetsArgs;
import org.thingsboard.client.model.Alarm;
import org.thingsboard.client.model.AlarmInfo;
import org.thingsboard.client.model.AliasEntityId;
import org.thingsboard.client.model.AliasEntityType;
import org.thingsboard.client.model.EntityType;
import org.thingsboard.client.model.PageDataAsset;
import org.thingsboard.client.model.TsData;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Code written against the 4.4.0 client. It must keep compiling when the client is regenerated
 * from a spec with corrected types (see openapi/client-compat.json); do not update it to a newer API.
 * The API calls go to a closed port, so they only check that the calls compile and reach the HTTP client.
 */
@SuppressWarnings({"deprecation", "removal"})
class ClientCompatibilityTest {

    private final ThingsboardApi api = new ThingsboardApi(new ApiClient()
            .setScheme("http").setHost("127.0.0.1").setPort(1)
            .setConnectTimeout(Duration.ofSeconds(5)));

    @Test
    void pageParametersAcceptStrings() {
        Map<String, String> headers = Map.of();
        GetUserAssetsArgs args = GetUserAssetsArgs.builder().pageSize("10").page("0").textSearch("a").build();

        assertThrows(ApiException.class, () -> {
            PageDataAsset assets = api.getUserAssets(args);
        });
        assertThrows(ApiException.class, () -> {
            PageDataAsset assets = api.getUserAssets("10", "0", null, null, null, null, null);
        });
        assertThrows(ApiException.class, () -> {
            ApiResponse<PageDataAsset> response = api.getUserAssetsWithHttpInfo("10", "0", null, null, null, null, null, headers);
        });
    }

    @Test
    void timeseriesLimitAcceptsString() {
        Map<String, String> headers = Map.of();
        String id = UUID.randomUUID().toString();
        GetTimeseriesHistoryArgs args = GetTimeseriesHistoryArgs.builder()
                .entityType("DEVICE").entityId(id).startTs(0L).endTs(1L).keys("temperature").limit("100").build();

        assertThrows(ApiException.class, () -> {
            Map<String, List<TsData>> data = api.getTimeseriesHistory(args);
        });
        assertThrows(ApiException.class, () -> {
            Map<String, List<TsData>> data = api.getTimeseriesHistory("DEVICE", id, 0L, 1L, "temperature", null, null, null, "100", null, null, null, null);
        });
        assertThrows(ApiException.class, () -> {
            ApiResponse<Map<String, List<TsData>>> response = api.getTimeseriesHistoryWithHttpInfo("DEVICE", id, 0L, 1L, "temperature", null, null, null, "100", null, null, null, null, headers);
        });
    }

    @Test
    void assignAlarmReturnsAlarm() {
        String id = UUID.randomUUID().toString();
        assertThrows(ApiException.class, () -> {
            Alarm alarm = api.assignAlarm(id, id);
        });
        assertThrows(ApiException.class, () -> {
            Alarm alarm = api.unassignAlarm(id);
        });
    }

    @Test
    void alarmInfoFluentSettersReturnAlarmInfo() {
        AlarmInfo info = new AlarmInfo()
                .addPropagateRelationTypesItem("Contains")
                .originatorName("Device A");

        assertEquals("Contains", info.getPropagateRelationTypes().get(0));
        assertEquals("Device A", info.getOriginatorName());
    }

    @Test
    void aliasEntityIdKeepsTypedAccessors() {
        UUID id = UUID.randomUUID();
        AliasEntityId entityId = new AliasEntityId().entityType(EntityType.DEVICE).id(id);
        EntityType entityType = entityId.getEntityType();
        UUID entityUuid = entityId.getId();
        assertSame(EntityType.DEVICE, entityType);
        assertEquals(id, entityUuid);
        assertNull(entityId.getAliasEntityType());

        AliasEntityId alias = new AliasEntityId().aliasEntityType(AliasEntityType.CURRENT_USER);
        AliasEntityType aliasType = alias.getAliasEntityType();
        assertSame(AliasEntityType.CURRENT_USER, aliasType);

        AliasEntityId copy = new AliasEntityId();
        copy.setAliasEntityType(alias.getAliasEntityType());
        copy.setEntityType(alias.getEntityType());
        copy.setId(alias.getId());
        assertEquals(alias, copy);

        assertEquals("entityType", AliasEntityId.JSON_PROPERTY_ENTITY_TYPE);
        assertEquals("aliasEntityType", AliasEntityId.JSON_PROPERTY_ALIAS_ENTITY_TYPE);
        assertEquals("id", AliasEntityId.JSON_PROPERTY_ID);
    }
}

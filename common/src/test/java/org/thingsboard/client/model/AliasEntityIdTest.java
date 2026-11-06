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
package org.thingsboard.client.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.thingsboard.client.JSON;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class AliasEntityIdTest {

    private final ObjectMapper mapper = new JSON().getMapper();

    @Test
    void entityIdIsWrittenWithEntityTypeAndId() throws Exception {
        UUID id = UUID.randomUUID();
        AliasEntityId entityId = new AliasEntityId().entityType(EntityType.DEVICE).id(id);

        assertEquals("{\"entityType\":\"DEVICE\",\"id\":\"" + id + "\"}", mapper.writeValueAsString(entityId));
        assertEquals(EntityType.DEVICE, entityId.getEntityType());
        assertNull(entityId.getAliasEntityType());
    }

    @Test
    void aliasIsWrittenInEntityTypeWithoutId() throws Exception {
        AliasEntityId alias = new AliasEntityId().aliasEntityType(AliasEntityType.CURRENT_USER);

        assertEquals("{\"entityType\":\"CURRENT_USER\"}", mapper.writeValueAsString(alias));
        assertEquals(AliasEntityType.CURRENT_USER, alias.getAliasEntityType());
        assertNull(alias.getEntityType());
    }

    @Test
    void serverJsonIsRead() throws Exception {
        UUID id = UUID.randomUUID();

        AliasEntityId entityId = mapper.readValue("{\"entityType\":\"ASSET\",\"id\":\"" + id + "\"}", AliasEntityId.class);
        assertEquals(EntityType.ASSET, entityId.getEntityType());
        assertEquals(id, entityId.getId());

        AliasEntityId alias = mapper.readValue("{\"entityType\":\"CURRENT_CUSTOMER\",\"id\":\"" + id + "\"}", AliasEntityId.class);
        assertEquals(AliasEntityType.CURRENT_CUSTOMER, alias.getAliasEntityType());
        assertEquals("CURRENT_CUSTOMER", alias.getEntityTypeValue());
        assertEquals(id, alias.getId());

        SingleEntityFilter filter = mapper.readValue(
                "{\"type\":\"singleEntity\",\"singleEntity\":{\"entityType\":\"CURRENT_TENANT\"}}", SingleEntityFilter.class);
        assertEquals(AliasEntityType.CURRENT_TENANT, filter.getSingleEntity().getAliasEntityType());
    }
}

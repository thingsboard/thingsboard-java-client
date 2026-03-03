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

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.junit.jupiter.api.Test;
import org.thingsboard.client.ApiException;
import org.thingsboard.client.model.PageDataScheduledReportInfo;
import org.thingsboard.client.model.PageDataSchedulerEventWithCustomerInfo;
import org.thingsboard.client.model.SchedulerEvent;
import org.thingsboard.client.model.SchedulerEventInfo;
import org.thingsboard.client.model.SchedulerEventWithCustomerInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SchedulerEventApiTest extends AbstractApiTest {

    private static final String EVENT_TYPE = "testEventType";

    // One-time schedule firing far in the future so the server accepts it.
    private static com.fasterxml.jackson.databind.JsonNode buildSchedule() {
        ObjectNode schedule = OBJECT_MAPPER.createObjectNode();
        schedule.put("type", "ONE_TIME");
        schedule.put("startTime", System.currentTimeMillis() + 86_400_000L); // +1 day
        schedule.put("timezone", "UTC");
        return schedule;
    }

    private SchedulerEvent buildEvent(String name) {
        SchedulerEvent event = new SchedulerEvent();
        event.setName(name);
        event.setType(EVENT_TYPE);
        event.setSchedule(buildSchedule());
        event.setConfiguration(OBJECT_MAPPER.createObjectNode());
        return event;
    }

    private SchedulerEvent createEvent(String name) throws ApiException {
        return client.saveSchedulerEvent(buildEvent(name));
    }

    // -------------------------------------------------------------------------
    // Lifecycle: saveSchedulerEvent, getSchedulerEventById,
    //            getSchedulerEventInfoById, enableSchedulerEvent,
    //            deleteSchedulerEvent
    // -------------------------------------------------------------------------

    @Test
    void testSchedulerEventLifecycle() throws ApiException {
        long ts = System.currentTimeMillis();
        String name = TEST_PREFIX + ts;

        // saveSchedulerEvent (create)
        SchedulerEvent saved = createEvent(name);
        assertNotNull(saved);
        assertNotNull(saved.getId());
        assertEquals(name, saved.getName());
        assertEquals(EVENT_TYPE, saved.getType());
        String eventId = saved.getId().getId().toString();

        // getSchedulerEventById
        SchedulerEvent fetched = client.getSchedulerEventById(eventId);
        assertNotNull(fetched);
        assertEquals(eventId, fetched.getId().getId().toString());
        assertEquals(name, fetched.getName());

        // getSchedulerEventInfoById
        SchedulerEventWithCustomerInfo info = client.getSchedulerEventInfoById(eventId);
        assertNotNull(info);
        assertEquals(eventId, info.getId().getId().toString());
        assertEquals(name, info.getName());

        // saveSchedulerEvent (update)
        fetched.setName(name + "_updated");
        SchedulerEvent updated = client.saveSchedulerEvent(fetched);
        assertEquals(name + "_updated", updated.getName());

        // enableSchedulerEvent – toggle to disabled then re-enabled
        SchedulerEvent disabled = client.enableSchedulerEvent(eventId, false);
        assertNotNull(disabled);
        assertEquals(Boolean.FALSE, disabled.getEnabled());

        SchedulerEvent enabled = client.enableSchedulerEvent(eventId, true);
        assertNotNull(enabled);
        assertEquals(Boolean.TRUE, enabled.getEnabled());

        // deleteSchedulerEvent
        client.deleteSchedulerEvent(eventId);
        assertReturns404(() -> client.getSchedulerEventById(eventId));
    }

    // -------------------------------------------------------------------------
    // getAllSchedulerEventsV2 (covers both getAllSchedulerEvents and
    // getAllSchedulerEventsV2 – only the V2 endpoint exists in this client)
    // -------------------------------------------------------------------------

    @Test
    void testGetAllSchedulerEventsV2() throws ApiException {
        long ts = System.currentTimeMillis();

        SchedulerEvent e1 = createEvent(TEST_PREFIX + ts + "_1");
        SchedulerEvent e2 = createEvent(TEST_PREFIX + ts + "_2");
        String id1 = e1.getId().getId().toString();
        String id2 = e2.getId().getId().toString();

        // getAllSchedulerEventsV2 – no type filter
        List<SchedulerEventWithCustomerInfo> all = client.getAllSchedulerEvents(null);
        assertNotNull(all);
        assertTrue(all.stream().anyMatch(e -> e.getId().getId().toString().equals(id1)));
        assertTrue(all.stream().anyMatch(e -> e.getId().getId().toString().equals(id2)));

        // getAllSchedulerEventsV2 – with type filter
        List<SchedulerEventWithCustomerInfo> filtered = client.getAllSchedulerEvents(EVENT_TYPE);
        assertNotNull(filtered);
        assertTrue(filtered.stream().anyMatch(e -> e.getId().getId().toString().equals(id1)));

        client.deleteSchedulerEvent(id1);
        client.deleteSchedulerEvent(id2);
    }

    // -------------------------------------------------------------------------
    // getSchedulerEvents
    // -------------------------------------------------------------------------

    @Test
    void testGetSchedulerEvents() throws ApiException {
        long ts = System.currentTimeMillis();

        List<String> createdIds = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            SchedulerEvent e = createEvent(TEST_PREFIX + ts + "_" + i);
            createdIds.add(e.getId().getId().toString());
        }

        // getSchedulerEvents – paged list
        PageDataSchedulerEventWithCustomerInfo page =
                client.getSchedulerEvents(100, 0, null, null, null, EVENT_TYPE, null);
        assertNotNull(page);
        assertTrue(page.getTotalElements() >= 3);
        for (String id : createdIds) {
            assertTrue(page.getData().stream()
                    .anyMatch(e -> e.getId().getId().toString().equals(id)));
        }

        for (String id : createdIds) client.deleteSchedulerEvent(id);
    }

    // -------------------------------------------------------------------------
    // getSchedulerEventsByRange
    // -------------------------------------------------------------------------

    @Test
    void testGetSchedulerEventsByRange() throws ApiException {
        long ts = System.currentTimeMillis();

        SchedulerEvent event = createEvent(TEST_PREFIX + ts);
        String eventId = event.getId().getId().toString();

        // Use a wide time window to include the event regardless of its schedule.
        List<SchedulerEventWithCustomerInfo> range =
                client.getSchedulerEventsByRange(0L, ts + 2 * 86_400_000L, EVENT_TYPE, null, null);
        assertNotNull(range);
        assertTrue(range.stream().anyMatch(e -> e.getId().getId().toString().equals(eventId)));

        client.deleteSchedulerEvent(eventId);
    }

    // -------------------------------------------------------------------------
    // getScheduledReportEvents
    // -------------------------------------------------------------------------

    @Test
    void testGetScheduledReportEvents() throws ApiException {
        // Just verify the endpoint is reachable and returns a valid page object.
        PageDataScheduledReportInfo page =
                client.getScheduledReportEvents("100", "0", null, null, null, null, null, null);
        assertNotNull(page);
        assertNotNull(page.getData());
    }

    // -------------------------------------------------------------------------
    // getSchedulerEventsByIdsV2 (covers both getSchedulerEventsByIds and
    // getSchedulerEventsByIdsV2 – only the V2 endpoint exists in this client)
    // -------------------------------------------------------------------------

    @Test
    void testGetSchedulerEventsByIdsV2() throws ApiException {
        long ts = System.currentTimeMillis();

        SchedulerEvent e1 = createEvent(TEST_PREFIX + ts + "_a");
        SchedulerEvent e2 = createEvent(TEST_PREFIX + ts + "_b");
        String id1 = e1.getId().getId().toString();
        String id2 = e2.getId().getId().toString();

        List<SchedulerEventInfo> result = client.getSchedulerEventsByIds(List.of(id1, id2));
        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.stream().anyMatch(e -> e.getId().getId().toString().equals(id1)));
        assertTrue(result.stream().anyMatch(e -> e.getId().getId().toString().equals(id2)));

        client.deleteSchedulerEvent(id1);
        client.deleteSchedulerEvent(id2);
    }

    // -------------------------------------------------------------------------
    // Not found
    // -------------------------------------------------------------------------

    @Test
    void testGetSchedulerEventByIdNotFound() {
        assertReturns404(() -> client.getSchedulerEventById(UUID.randomUUID().toString()));
    }

}

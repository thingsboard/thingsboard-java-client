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
import org.thingsboard.client.model.NotificationDeliveryMethod;
import org.thingsboard.client.model.NotificationRequest;
import org.thingsboard.client.model.NotificationRequestInfo;
import org.thingsboard.client.model.NotificationSettings;
import org.thingsboard.client.model.NotificationTarget;
import org.thingsboard.client.model.NotificationTemplate;
import org.thingsboard.client.model.NotificationTemplateConfig;
import org.thingsboard.client.model.NotificationType;
import org.thingsboard.client.model.PageDataNotification;
import org.thingsboard.client.model.PageDataNotificationRequestInfo;
import org.thingsboard.client.model.PageDataNotificationTarget;
import org.thingsboard.client.model.PageDataNotificationTemplate;
import org.thingsboard.client.model.PlatformUsersNotificationTargetConfig;
import org.thingsboard.client.model.TenantAdministratorsFilter;
import org.thingsboard.client.model.WebDeliveryMethodNotificationTemplate;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NotificationApiTest extends AbstractApiTest {

    @Test
    void testNotificationLifecycle() throws Exception {
        long timestamp = System.currentTimeMillis();

        // === 1. Notification Target CRUD ===

        // Create target
        TenantAdministratorsFilter usersFilter = new TenantAdministratorsFilter();
        PlatformUsersNotificationTargetConfig targetConfig =
                new PlatformUsersNotificationTargetConfig().usersFilter(usersFilter);
        NotificationTarget target =
                new NotificationTarget()
                        .name("Test Target " + timestamp)
                        ._configuration(targetConfig);

        NotificationTarget savedTarget = tbApi.saveNotificationTarget(target);
        assertNotNull(savedTarget);
        assertNotNull(savedTarget.getId());
        assertEquals("Test Target " + timestamp, savedTarget.getName());

        // Get target by ID
        NotificationTarget fetchedTarget =
                tbApi.getNotificationTargetById(savedTarget.getId().getId());
        assertEquals(savedTarget.getName(), fetchedTarget.getName());

        // List targets
        PageDataNotificationTarget targetsPage =
                tbApi.getNotificationTargets(100, 0, null, null, null);
        assertNotNull(targetsPage);
        assertNotNull(targetsPage.getData());
        assertTrue(
                targetsPage.getData().stream()
                        .anyMatch(t -> t.getName().equals(savedTarget.getName())));

        // Update target
        savedTarget.setName("Updated Target " + timestamp);
        NotificationTarget updatedTarget = tbApi.saveNotificationTarget(savedTarget);
        assertEquals("Updated Target " + timestamp, updatedTarget.getName());

        // === 2. Notification Template CRUD ===

        // Create template
        WebDeliveryMethodNotificationTemplate webTemplate =
                new WebDeliveryMethodNotificationTemplate()
                        .subject("Test Subject")
                        .body("Test notification body")
                        .enabled(true);
        NotificationTemplateConfig templateConfig =
                new NotificationTemplateConfig()
                        .putDeliveryMethodsTemplatesItem("WEB", webTemplate);
        NotificationTemplate template =
                new NotificationTemplate()
                        .name("Test Template " + timestamp)
                        .notificationType(NotificationType.GENERAL)
                        ._configuration(templateConfig);

        NotificationTemplate savedTemplate = tbApi.saveNotificationTemplate(template);
        assertNotNull(savedTemplate);
        assertNotNull(savedTemplate.getId());
        assertEquals("Test Template " + timestamp, savedTemplate.getName());

        // Get template by ID
        NotificationTemplate fetchedTemplate =
                tbApi.getNotificationTemplateById(savedTemplate.getId().getId());
        assertEquals(savedTemplate.getName(), fetchedTemplate.getName());
        assertEquals(NotificationType.GENERAL, fetchedTemplate.getNotificationType());

        // List templates
        PageDataNotificationTemplate templatesPage =
                tbApi.getNotificationTemplates(100, 0, null, null, null, null);
        assertNotNull(templatesPage);
        assertTrue(
                templatesPage.getData().stream()
                        .anyMatch(t -> t.getName().equals(savedTemplate.getName())));

        // Update template
        savedTemplate.setName("Updated Template " + timestamp);
        NotificationTemplate updatedTemplate = tbApi.saveNotificationTemplate(savedTemplate);
        assertEquals("Updated Template " + timestamp, updatedTemplate.getName());

        // === 3. Send notification & read notifications ===

        // Send notification request
        NotificationRequest request =
                new NotificationRequest()
                        .targets(List.of(savedTarget.getId().getId()))
                        .templateId(savedTemplate.getId());
        NotificationRequest sentRequest = tbApi.createNotificationRequest(request);
        assertNotNull(sentRequest);
        assertNotNull(sentRequest.getId());

        // Get request by ID
        NotificationRequestInfo fetchedRequest =
                tbApi.getNotificationRequestById(sentRequest.getId().getId());
        assertNotNull(fetchedRequest);

        // List requests
        PageDataNotificationRequestInfo requestsPage =
                tbApi.getNotificationRequests(100, 0, null, null, null);
        assertNotNull(requestsPage);
        assertFalse(requestsPage.getData().isEmpty());

        // Get notifications for current user
        PageDataNotification notificationsPage =
                tbApi.getNotifications(100, 0, null, null, null, null, null);
        assertNotNull(notificationsPage);
        assertFalse(notificationsPage.getData().isEmpty());

        // Get unread count
        Integer unreadCount = tbApi.getUnreadNotificationsCount("WEB");
        assertNotNull(unreadCount);
        assertTrue(unreadCount > 0, "Expected at least one unread notification");

        // Mark single notification as read
        tbApi.markNotificationAsRead(
                notificationsPage.getData().get(0).getId().getId());

        // Mark all as read
        tbApi.markAllNotificationsAsRead(null);
        Integer unreadAfterMarkAll = tbApi.getUnreadNotificationsCount(null);
        assertEquals(0, unreadAfterMarkAll, "Expected no unread notifications after marking all as read");

        // === 4. Notification Settings ===

        NotificationSettings settings = tbApi.getNotificationSettings();
        assertNotNull(settings);

        List<NotificationDeliveryMethod> deliveryMethods = tbApi.getAvailableDeliveryMethods();
        assertNotNull(deliveryMethods);
        assertTrue(deliveryMethods.contains(NotificationDeliveryMethod.WEB));

        // === 5. Cleanup ===

        // Delete notification request
        tbApi.deleteNotificationRequest(sentRequest.getId().getId());
        assertReturns404(() -> tbApi.getNotificationRequestById(sentRequest.getId().getId()));

        // Delete template
        tbApi.deleteNotificationTemplateById(savedTemplate.getId().getId());
        assertReturns404(() -> tbApi.getNotificationTemplateById(savedTemplate.getId().getId()));

        // Delete target
        tbApi.deleteNotificationTargetById(savedTarget.getId().getId());
        assertReturns404(() -> tbApi.getNotificationTargetById(savedTarget.getId().getId()));
    }

}

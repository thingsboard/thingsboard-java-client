# NotificationControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
NotificationRequest createNotificationRequest(CreateNotificationRequestArgs args) // Create notification request (createNotificationRequest)
void deleteNotification(DeleteNotificationArgs args) // Delete notification (deleteNotification)
void deleteNotificationRequest(DeleteNotificationRequestArgs args) // Delete notification request (deleteNotificationRequest)
List<NotificationDeliveryMethod> getAvailableDeliveryMethods() // Get available delivery methods (getAvailableDeliveryMethods)
NotificationRequestInfo getNotificationRequestById(GetNotificationRequestByIdArgs args) // Get notification request by id (getNotificationRequestById)
NotificationRequestPreview getNotificationRequestPreview(GetNotificationRequestPreviewArgs args) // Get notification request preview (getNotificationRequestPreview)
PageDataNotificationRequestInfo getNotificationRequests(GetNotificationRequestsArgs args) // Get notification requests (getNotificationRequests)
NotificationSettings getNotificationSettings() // Get notification settings (getNotificationSettings)
PageDataNotification getNotifications(GetNotificationsArgs args) // Get notifications (getNotifications)
Integer getUnreadNotificationsCount(GetUnreadNotificationsCountArgs args) // Get unread notifications count (getUnreadNotificationsCount)
UserNotificationSettings getUserNotificationSettings() // getUserNotificationSettings
void markAllNotificationsAsRead(MarkAllNotificationsAsReadArgs args) // Mark all notifications as read (markAllNotificationsAsRead)
void markNotificationAsRead(MarkNotificationAsReadArgs args) // Mark notification as read (markNotificationAsRead)
NotificationSettings saveNotificationSettings(SaveNotificationSettingsArgs args) // Save notification settings (saveNotificationSettings)
UserNotificationSettings saveUserNotificationSettings(SaveUserNotificationSettingsArgs args) // saveUserNotificationSettings
void sendAddonAccessError(SendAddonAccessErrorArgs args) // Send add-on access error notification to System/Tenant administrators (sendAddonAccessError)
void sendEntitiesLimitIncreaseRequest(SendEntitiesLimitIncreaseRequestArgs args) // Send entity limit increase request notification to System/Tenant administrators (sendEntitiesLimitIncreaseRequest)
```


## createNotificationRequest

**POST** `/api/notification/request`

Create notification request (createNotificationRequest)

Processes notification request. Mandatory request properties are `targets` (list of targets ids to send notification to), and either `templateId` (existing notification template id) or `template` (to send notification without saving the template). Optionally, you can set `sendingDelayInSec` inside the `additionalConfig` field to schedule the notification.  For each enabled delivery method in the notification template, there must be a target in the `targets` list that supports this delivery method: if you chose `WEB`, `EMAIL` or `SMS` - there must be at least one target in `targets` of `PLATFORM_USERS` type. For `SLACK` delivery method - you need to chose at least one `SLACK` notification target.  Notification request object with `PROCESSING` status will be returned immediately, and the notification sending itself is done asynchronously. After all notifications are sent, the `status` of the request becomes `SENT`. Use `getNotificationRequestById` to see the notification request processing status and some sending stats.   Here is an example of notification request to one target using saved template: ```json {   \"templateId\": {     \"entityType\": \"NOTIFICATION_TEMPLATE\",     \"id\": \"6dbc3670-e4dd-11ed-9401-dbcc5dff78be\"   },   \"targets\": [     \"320e3ed0-d785-11ed-a06c-21dd57dd88ca\"   ],   \"additionalConfig\": {     \"sendingDelayInSec\": 0   } } ```  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
NotificationRequest createNotificationRequest(CreateNotificationRequestArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
CreateNotificationRequestArgs.builder()
        .notificationRequest(NotificationRequest)
        .build()
```

### `CreateNotificationRequestArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `notificationRequest` | `NotificationRequest` | **yes** |  | |

### Return type

`NotificationRequest`


## deleteNotification

**DELETE** `/api/notification/{id}`

Delete notification (deleteNotification)

Deletes notification by its id.  Available for any authorized user. 

```java
void deleteNotification(DeleteNotificationArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteNotificationArgs.builder()
        .id(UUID)
        .build()
```

### `DeleteNotificationArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `UUID` | **yes** |  | |

### Return type

null (empty response body)


## deleteNotificationRequest

**DELETE** `/api/notification/request/{id}`

Delete notification request (deleteNotificationRequest)

Deletes notification request by its id.  If the request has status `SENT` - all sent notifications for this request will be deleted. If it is `SCHEDULED`, the request will be cancelled.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
void deleteNotificationRequest(DeleteNotificationRequestArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteNotificationRequestArgs.builder()
        .id(UUID)
        .build()
```

### `DeleteNotificationRequestArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `UUID` | **yes** |  | |

### Return type

null (empty response body)


## getAvailableDeliveryMethods

**GET** `/api/notification/deliveryMethods`

Get available delivery methods (getAvailableDeliveryMethods)

Returns the list of delivery methods that are properly configured and are allowed to be used for sending notifications.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
List<NotificationDeliveryMethod> getAvailableDeliveryMethods()
```

### Return type

`List<NotificationDeliveryMethod>`


## getNotificationRequestById

**GET** `/api/notification/request/{id}`

Get notification request by id (getNotificationRequestById)

Fetches notification request info by request id.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
NotificationRequestInfo getNotificationRequestById(GetNotificationRequestByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetNotificationRequestByIdArgs.builder()
        .id(UUID)
        .build()
```

### `GetNotificationRequestByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `UUID` | **yes** |  | |

### Return type

`NotificationRequestInfo`


## getNotificationRequestPreview

**POST** `/api/notification/request/preview`

Get notification request preview (getNotificationRequestPreview)

Returns preview for notification request.  `processedTemplates` shows how the notifications for each delivery method will look like for the first recipient of the corresponding notification target.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
NotificationRequestPreview getNotificationRequestPreview(GetNotificationRequestPreviewArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetNotificationRequestPreviewArgs.builder()
        .notificationRequest(NotificationRequest)
        .build()
```

### `GetNotificationRequestPreviewArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `notificationRequest` | `NotificationRequest` | **yes** |  | |
| `recipientsPreviewSize` | `Integer` | no | Amount of the recipients to show in preview | default: `20` |

### Return type

`NotificationRequestPreview`


## getNotificationRequests

**GET** `/api/notification/requests`

Get notification requests (getNotificationRequests)

Returns the page of notification requests submitted by users of this tenant or sysadmins.  You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
PageDataNotificationRequestInfo getNotificationRequests(GetNotificationRequestsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetNotificationRequestsArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetNotificationRequestsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | Case-insensitive 'substring' filed based on the used template name | |
| `sortProperty` | `String` | no | Property of entity to sort by | |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | |

### Return type

`PageDataNotificationRequestInfo`


## getNotificationSettings

**GET** `/api/notification/settings`

Get notification settings (getNotificationSettings)

Retrieves notification settings for this tenant or sysadmin.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
NotificationSettings getNotificationSettings()
```

### Return type

`NotificationSettings`


## getNotifications

**GET** `/api/notifications`

Get notifications (getNotifications)

Returns the page of notifications for current user.  You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for any authorized user.   **WebSocket API**:  There are 2 types of subscriptions: one for unread notifications count, another for unread notifications themselves.  The URI for opening WS session for notifications: `/api/ws/plugins/notifications`.  Subscription command for unread notifications count: ``` {   \"unreadCountSubCmd\": {     \"cmdId\": 1234   } } ``` To subscribe for latest unread notifications: ``` {   \"unreadSubCmd\": {     \"cmdId\": 1234,     \"limit\": 10   } } ``` To unsubscribe from any subscription: ``` {   \"unsubCmd\": {     \"cmdId\": 1234   } } ``` To mark certain notifications as read, use following command: ``` {   \"markAsReadCmd\": {     \"cmdId\": 1234,     \"notifications\": [       \"6f860330-7fc2-11ed-b855-7dd3b7d2faa9\",       \"5b6dfee0-8d0d-11ed-b61f-35a57b03dade\"     ]   } }  ``` To mark all notifications as read: ``` {   \"markAllAsReadCmd\": {     \"cmdId\": 1234   } } ```   Update structure for unread **notifications count subscription**: ``` {   \"cmdId\": 1234,   \"totalUnreadCount\": 55 } ``` For **notifications subscription**: - full update of latest unread notifications: ``` {   \"cmdId\": 1234,   \"notifications\": [     {       \"id\": {         \"entityType\": \"NOTIFICATION\",         \"id\": \"6f860330-7fc2-11ed-b855-7dd3b7d2faa9\"       },       ...     }   ],   \"totalUnreadCount\": 1 } ``` - when new notification arrives or shown notification is updated: ``` {   \"cmdId\": 1234,   \"update\": {     \"id\": {       \"entityType\": \"NOTIFICATION\",       \"id\": \"6f860330-7fc2-11ed-b855-7dd3b7d2faa9\"     },     # updated notification info, text, subject etc.     ...   },   \"totalUnreadCount\": 2 } ``` - when unread notifications count changes: ``` {   \"cmdId\": 1234,   \"totalUnreadCount\": 5 } ```

```java
PageDataNotification getNotifications(GetNotificationsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetNotificationsArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetNotificationsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | Case-insensitive 'substring' filter based on notification subject or text | |
| `sortProperty` | `String` | no | Property of entity to sort by | |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | |
| `unreadOnly` | `Boolean` | no | To search for unread notifications only | default: `false` |
| `deliveryMethod` | `String` | no | Delivery method | enum: `WEB`, `MOBILE_APP` |

### Return type

`PageDataNotification`


## getUnreadNotificationsCount

**GET** `/api/notifications/unread/count`

Get unread notifications count (getUnreadNotificationsCount)

Returns unread notifications count for chosen delivery method.  Available for any authorized user. 

```java
Integer getUnreadNotificationsCount(GetUnreadNotificationsCountArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetUnreadNotificationsCountArgs.builder()
        .build()
```

### `GetUnreadNotificationsCountArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `deliveryMethod` | `String` | no | Delivery method | enum: `WEB`, `MOBILE_APP` |

### Return type

`Integer`


## getUserNotificationSettings

**GET** `/api/notification/settings/user`

getUserNotificationSettings

```java
UserNotificationSettings getUserNotificationSettings()
```

### Return type

`UserNotificationSettings`


## markAllNotificationsAsRead

**PUT** `/api/notifications/read`

Mark all notifications as read (markAllNotificationsAsRead)

Marks all unread notifications as read.  Available for any authorized user. 

```java
void markAllNotificationsAsRead(MarkAllNotificationsAsReadArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
MarkAllNotificationsAsReadArgs.builder()
        .build()
```

### `MarkAllNotificationsAsReadArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `deliveryMethod` | `String` | no | Delivery method | enum: `WEB`, `MOBILE_APP` |

### Return type

null (empty response body)


## markNotificationAsRead

**PUT** `/api/notification/{id}/read`

Mark notification as read (markNotificationAsRead)

Marks notification as read by its id.  Available for any authorized user. 

```java
void markNotificationAsRead(MarkNotificationAsReadArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
MarkNotificationAsReadArgs.builder()
        .id(UUID)
        .build()
```

### `MarkNotificationAsReadArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `UUID` | **yes** |  | |

### Return type

null (empty response body)


## saveNotificationSettings

**POST** `/api/notification/settings`

Save notification settings (saveNotificationSettings)

Saves notification settings for this tenant or sysadmin. `deliveryMethodsConfigs` of the settings must be specified.  Here is an example of the notification settings with Slack configuration: ```json {   \"deliveryMethodsConfigs\": {     \"SLACK\": {       \"method\": \"SLACK\",       \"botToken\": \"xoxb-....\"     }   } } ```  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
NotificationSettings saveNotificationSettings(SaveNotificationSettingsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveNotificationSettingsArgs.builder()
        .notificationSettings(NotificationSettings)
        .build()
```

### `SaveNotificationSettingsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `notificationSettings` | `NotificationSettings` | **yes** |  | |

### Return type

`NotificationSettings`


## saveUserNotificationSettings

**POST** `/api/notification/settings/user`

saveUserNotificationSettings

```java
UserNotificationSettings saveUserNotificationSettings(SaveUserNotificationSettingsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveUserNotificationSettingsArgs.builder()
        .userNotificationSettings(UserNotificationSettings)
        .build()
```

### `SaveUserNotificationSettingsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `userNotificationSettings` | `UserNotificationSettings` | **yes** |  | |

### Return type

`UserNotificationSettings`


## sendAddonAccessError

**POST** `/api/notification/sendAddonAccessError/{addonType}`

Send add-on access error notification to System/Tenant administrators (sendAddonAccessError)

Send add-on access error notification by Tenant Administrator or Customer User to System/Tenant administrators.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
void sendAddonAccessError(SendAddonAccessErrorArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SendAddonAccessErrorArgs.builder()
        .addonType(String)
        .build()
```

### `SendAddonAccessErrorArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `addonType` | `String` | **yes** | Addon type | enum: `EDGE`, `TRENDZ`, `WHITE_LABELING` |

### Return type

null (empty response body)


## sendEntitiesLimitIncreaseRequest

**POST** `/api/notification/entitiesLimitIncreaseRequest/{entityType}`

Send entity limit increase request notification to System/Tenant administrators (sendEntitiesLimitIncreaseRequest)

Send entity limit increase request notification by Tenant Administrator or Customer User to System/Tenant administrators.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
void sendEntitiesLimitIncreaseRequest(SendEntitiesLimitIncreaseRequestArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SendEntitiesLimitIncreaseRequestArgs.builder()
        .entityType(String)
        .build()
```

### `SendEntitiesLimitIncreaseRequestArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityType` | `String` | **yes** | Entity type | enum: `DEVICE`, `ASSET`, `CUSTOMER`, `USER`, `DASHBOARD`, `RULE_CHAIN`, `EDGE`, `INTEGRATION`, `CONVERTER`, `SCHEDULER_EVENT` |

### Return type

null (empty response body)


# NotificationControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNotificationRequest**](#createNotificationRequest) | **POST** /api/notification/request | Create notification request (createNotificationRequest) |
| [**deleteNotification**](#deleteNotification) | **DELETE** /api/notification/{id} | Delete notification (deleteNotification) |
| [**deleteNotificationRequest**](#deleteNotificationRequest) | **DELETE** /api/notification/request/{id} | Delete notification request (deleteNotificationRequest) |
| [**getAvailableDeliveryMethods**](#getAvailableDeliveryMethods) | **GET** /api/notification/deliveryMethods | Get available delivery methods (getAvailableDeliveryMethods) |
| [**getNotificationRequestById**](#getNotificationRequestById) | **GET** /api/notification/request/{id} | Get notification request by id (getNotificationRequestById) |
| [**getNotificationRequestPreview**](#getNotificationRequestPreview) | **POST** /api/notification/request/preview | Get notification request preview (getNotificationRequestPreview) |
| [**getNotificationRequests**](#getNotificationRequests) | **GET** /api/notification/requests | Get notification requests (getNotificationRequests) |
| [**getNotificationSettings**](#getNotificationSettings) | **GET** /api/notification/settings | Get notification settings (getNotificationSettings) |
| [**getNotifications**](#getNotifications) | **GET** /api/notifications | Get notifications (getNotifications) |
| [**getUnreadNotificationsCount**](#getUnreadNotificationsCount) | **GET** /api/notifications/unread/count | Get unread notifications count (getUnreadNotificationsCount) |
| [**getUserNotificationSettings**](#getUserNotificationSettings) | **GET** /api/notification/settings/user | getUserNotificationSettings |
| [**markAllNotificationsAsRead**](#markAllNotificationsAsRead) | **PUT** /api/notifications/read | Mark all notifications as read (markAllNotificationsAsRead) |
| [**markNotificationAsRead**](#markNotificationAsRead) | **PUT** /api/notification/{id}/read | Mark notification as read (markNotificationAsRead) |
| [**saveNotificationSettings**](#saveNotificationSettings) | **POST** /api/notification/settings | Save notification settings (saveNotificationSettings) |
| [**saveUserNotificationSettings**](#saveUserNotificationSettings) | **POST** /api/notification/settings/user | saveUserNotificationSettings |
| [**sendAddonAccessError**](#sendAddonAccessError) | **POST** /api/notification/sendAddonAccessError/{addonType} | Send add-on access error notification to System/Tenant administrators (sendAddonAccessError) |
| [**sendAddonAccessRequest**](#sendAddonAccessRequest) | **POST** /api/notification/sendAddonAccessRequest/{addonType} | Send add-on access request notification to System/Tenant administrators (sendAddonAccessRequest) |
| [**sendEntitiesLimitIncreaseRequest**](#sendEntitiesLimitIncreaseRequest) | **POST** /api/notification/entitiesLimitIncreaseRequest/{entityType} | Send entity limit increase request notification to System/Tenant administrators (sendEntitiesLimitIncreaseRequest) |
| [**sendPlanUpgradeRequest**](#sendPlanUpgradeRequest) | **POST** /api/notification/sendPlanUpgradeRequest/{planName} | Send plan upgrade request notification to Tenant administrators (sendPlanUpgradeRequest) |



## createNotificationRequest

> NotificationRequest createNotificationRequest(notificationRequest)

Create notification request (createNotificationRequest)

Processes notification request. Mandatory request properties are `targets` (list of targets ids to send notification to), and either `templateId` (existing notification template id) or `template` (to send notification without saving the template). Optionally, you can set `sendingDelayInSec` inside the `additionalConfig` field to schedule the notification.  For each enabled delivery method in the notification template, there must be a target in the `targets` list that supports this delivery method: if you chose `WEB`, `EMAIL` or `SMS` - there must be at least one target in `targets` of `PLATFORM_USERS` type. For `SLACK` delivery method - you need to chose at least one `SLACK` notification target.  Notification request object with `PROCESSING` status will be returned immediately, and the notification sending itself is done asynchronously. After all notifications are sent, the `status` of the request becomes `SENT`. Use `getNotificationRequestById` to see the notification request processing status and some sending stats.   Here is an example of notification request to one target using saved template: ```json {   \"templateId\": {     \"entityType\": \"NOTIFICATION_TEMPLATE\",     \"id\": \"6dbc3670-e4dd-11ed-9401-dbcc5dff78be\"   },   \"targets\": [     \"320e3ed0-d785-11ed-a06c-21dd57dd88ca\"   ],   \"additionalConfig\": {     \"sendingDelayInSec\": 0   } } ```  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **notificationRequest** | **NotificationRequest** |  | |

### Return type

**NotificationRequest**


## deleteNotification

> deleteNotification(id)

Delete notification (deleteNotification)

Deletes notification by its id.  Available for any authorized user. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |

### Return type

null (empty response body)


## deleteNotificationRequest

> deleteNotificationRequest(id)

Delete notification request (deleteNotificationRequest)

Deletes notification request by its id.  If the request has status `SENT` - all sent notifications for this request will be deleted. If it is `SCHEDULED`, the request will be cancelled.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |

### Return type

null (empty response body)


## getAvailableDeliveryMethods

> List<NotificationDeliveryMethod> getAvailableDeliveryMethods()

Get available delivery methods (getAvailableDeliveryMethods)

Returns the list of delivery methods that are properly configured and are allowed to be used for sending notifications.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

### Return type

**List<NotificationDeliveryMethod>**


## getNotificationRequestById

> NotificationRequestInfo getNotificationRequestById(id)

Get notification request by id (getNotificationRequestById)

Fetches notification request info by request id.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |

### Return type

**NotificationRequestInfo**


## getNotificationRequestPreview

> NotificationRequestPreview getNotificationRequestPreview(notificationRequest, recipientsPreviewSize)

Get notification request preview (getNotificationRequestPreview)

Returns preview for notification request.  `processedTemplates` shows how the notifications for each delivery method will look like for the first recipient of the corresponding notification target.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **notificationRequest** | **NotificationRequest** |  | |
| **recipientsPreviewSize** | **Integer** | Amount of the recipients to show in preview | [optional] [default to 20] |

### Return type

**NotificationRequestPreview**


## getNotificationRequests

> PageDataNotificationRequestInfo getNotificationRequests(pageSize, page, textSearch, sortProperty, sortOrder)

Get notification requests (getNotificationRequests)

Returns the page of notification requests submitted by users of this tenant or sysadmins.  You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | Case-insensitive 'substring' filed based on the used template name | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] |

### Return type

**PageDataNotificationRequestInfo**


## getNotificationSettings

> NotificationSettings getNotificationSettings()

Get notification settings (getNotificationSettings)

Retrieves notification settings for this tenant or sysadmin.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

### Return type

**NotificationSettings**


## getNotifications

> PageDataNotification getNotifications(pageSize, page, textSearch, sortProperty, sortOrder, unreadOnly, deliveryMethod)

Get notifications (getNotifications)

Returns the page of notifications for current user.  You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for any authorized user.   **WebSocket API**:  There are 2 types of subscriptions: one for unread notifications count, another for unread notifications themselves.  The URI for opening WS session for notifications: `/api/ws/plugins/notifications`.  Subscription command for unread notifications count: ``` {   \"unreadCountSubCmd\": {     \"cmdId\": 1234   } } ``` To subscribe for latest unread notifications: ``` {   \"unreadSubCmd\": {     \"cmdId\": 1234,     \"limit\": 10   } } ``` To unsubscribe from any subscription: ``` {   \"unsubCmd\": {     \"cmdId\": 1234   } } ``` To mark certain notifications as read, use following command: ``` {   \"markAsReadCmd\": {     \"cmdId\": 1234,     \"notifications\": [       \"6f860330-7fc2-11ed-b855-7dd3b7d2faa9\",       \"5b6dfee0-8d0d-11ed-b61f-35a57b03dade\"     ]   } }  ``` To mark all notifications as read: ``` {   \"markAllAsReadCmd\": {     \"cmdId\": 1234   } } ```   Update structure for unread **notifications count subscription**: ``` {   \"cmdId\": 1234,   \"totalUnreadCount\": 55 } ``` For **notifications subscription**: - full update of latest unread notifications: ``` {   \"cmdId\": 1234,   \"notifications\": [     {       \"id\": {         \"entityType\": \"NOTIFICATION\",         \"id\": \"6f860330-7fc2-11ed-b855-7dd3b7d2faa9\"       },       ...     }   ],   \"totalUnreadCount\": 1 } ``` - when new notification arrives or shown notification is updated: ``` {   \"cmdId\": 1234,   \"update\": {     \"id\": {       \"entityType\": \"NOTIFICATION\",       \"id\": \"6f860330-7fc2-11ed-b855-7dd3b7d2faa9\"     },     # updated notification info, text, subject etc.     ...   },   \"totalUnreadCount\": 2 } ``` - when unread notifications count changes: ``` {   \"cmdId\": 1234,   \"totalUnreadCount\": 5 } ```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | Case-insensitive 'substring' filter based on notification subject or text | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] |
| **unreadOnly** | **Boolean** | To search for unread notifications only | [optional] [default to false] |
| **deliveryMethod** | **String** | Delivery method | [optional] [enum: WEB, MOBILE_APP] |

### Return type

**PageDataNotification**


## getUnreadNotificationsCount

> Integer getUnreadNotificationsCount(deliveryMethod)

Get unread notifications count (getUnreadNotificationsCount)

Returns unread notifications count for chosen delivery method.  Available for any authorized user. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deliveryMethod** | **String** | Delivery method | [optional] [enum: WEB, MOBILE_APP] |

### Return type

**Integer**


## getUserNotificationSettings

> UserNotificationSettings getUserNotificationSettings()

getUserNotificationSettings

### Return type

**UserNotificationSettings**


## markAllNotificationsAsRead

> markAllNotificationsAsRead(deliveryMethod)

Mark all notifications as read (markAllNotificationsAsRead)

Marks all unread notifications as read.  Available for any authorized user. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deliveryMethod** | **String** | Delivery method | [optional] [enum: WEB, MOBILE_APP] |

### Return type

null (empty response body)


## markNotificationAsRead

> markNotificationAsRead(id)

Mark notification as read (markNotificationAsRead)

Marks notification as read by its id.  Available for any authorized user. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |

### Return type

null (empty response body)


## saveNotificationSettings

> NotificationSettings saveNotificationSettings(notificationSettings)

Save notification settings (saveNotificationSettings)

Saves notification settings for this tenant or sysadmin. `deliveryMethodsConfigs` of the settings must be specified.  Here is an example of the notification settings with Slack configuration: ```json {   \"deliveryMethodsConfigs\": {     \"SLACK\": {       \"method\": \"SLACK\",       \"botToken\": \"xoxb-....\"     }   } } ```  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **notificationSettings** | **NotificationSettings** |  | |

### Return type

**NotificationSettings**


## saveUserNotificationSettings

> UserNotificationSettings saveUserNotificationSettings(userNotificationSettings)

saveUserNotificationSettings


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userNotificationSettings** | **UserNotificationSettings** |  | |

### Return type

**UserNotificationSettings**


## sendAddonAccessError

> sendAddonAccessError(addonType)

Send add-on access error notification to System/Tenant administrators (sendAddonAccessError)

Send add-on access error notification by Tenant Administrator or Customer User to System/Tenant administrators.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **addonType** | **String** | Addon type | [enum: EDGE, TRENDZ, WHITE_LABELING] |

### Return type

null (empty response body)


## sendAddonAccessRequest

> sendAddonAccessRequest(addonType)

Send add-on access request notification to System/Tenant administrators (sendAddonAccessRequest)

Send add-on access request notification by Tenant Administrator or Customer User to System/Tenant administrators.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **addonType** | **String** | Addon type | [enum: EDGE, TRENDZ, WHITE_LABELING] |

### Return type

null (empty response body)


## sendEntitiesLimitIncreaseRequest

> sendEntitiesLimitIncreaseRequest(entityType)

Send entity limit increase request notification to System/Tenant administrators (sendEntitiesLimitIncreaseRequest)

Send entity limit increase request notification by Tenant Administrator or Customer User to System/Tenant administrators.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | Entity type | [enum: DEVICE, ASSET, CUSTOMER, USER, DASHBOARD, RULE_CHAIN, EDGE, INTEGRATION, CONVERTER, SCHEDULER_EVENT] |

### Return type

null (empty response body)


## sendPlanUpgradeRequest

> sendPlanUpgradeRequest(planName)

Send plan upgrade request notification to Tenant administrators (sendPlanUpgradeRequest)

Send plan upgrade access request notification by Tenant user to Tenant administrators.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **planName** | **String** | Plan name | |

### Return type

null (empty response body)


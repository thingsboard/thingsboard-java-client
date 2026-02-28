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

Processes notification request. Mandatory request properties are &#x60;targets&#x60; (list of targets ids to send notification to), and either &#x60;templateId&#x60; (existing notification template id) or &#x60;template&#x60; (to send notification without saving the template). Optionally, you can set &#x60;sendingDelayInSec&#x60; inside the &#x60;additionalConfig&#x60; field to schedule the notification.  For each enabled delivery method in the notification template, there must be a target in the &#x60;targets&#x60; list that supports this delivery method: if you chose &#x60;WEB&#x60;, &#x60;EMAIL&#x60; or &#x60;SMS&#x60; - there must be at least one target in &#x60;targets&#x60; of &#x60;PLATFORM_USERS&#x60; type. For &#x60;SLACK&#x60; delivery method - you need to chose at least one &#x60;SLACK&#x60; notification target.  Notification request object with &#x60;PROCESSING&#x60; status will be returned immediately, and the notification sending itself is done asynchronously. After all notifications are sent, the &#x60;status&#x60; of the request becomes &#x60;SENT&#x60;. Use &#x60;getNotificationRequestById&#x60; to see the notification request processing status and some sending stats.   Here is an example of notification request to one target using saved template: &#x60;&#x60;&#x60;json {   \&quot;templateId\&quot;: {     \&quot;entityType\&quot;: \&quot;NOTIFICATION_TEMPLATE\&quot;,     \&quot;id\&quot;: \&quot;6dbc3670-e4dd-11ed-9401-dbcc5dff78be\&quot;   },   \&quot;targets\&quot;: [     \&quot;320e3ed0-d785-11ed-a06c-21dd57dd88ca\&quot;   ],   \&quot;additionalConfig\&quot;: {     \&quot;sendingDelayInSec\&quot;: 0   } } &#x60;&#x60;&#x60;  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **notificationRequest** | **NotificationRequest** |  | |


## deleteNotification

> deleteNotification(id)

Delete notification (deleteNotification)

Deletes notification by its id.  Available for any authorized user. 

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |


## deleteNotificationRequest

> deleteNotificationRequest(id)

Delete notification request (deleteNotificationRequest)

Deletes notification request by its id.  If the request has status &#x60;SENT&#x60; - all sent notifications for this request will be deleted. If it is &#x60;SCHEDULED&#x60;, the request will be cancelled.  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |


## getAvailableDeliveryMethods

> List&lt;NotificationDeliveryMethod&gt; getAvailableDeliveryMethods()

Get available delivery methods (getAvailableDeliveryMethods)

Returns the list of delivery methods that are properly configured and are allowed to be used for sending notifications.  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

## getNotificationRequestById

> NotificationRequestInfo getNotificationRequestById(id)

Get notification request by id (getNotificationRequestById)

Fetches notification request info by request id.  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |


## getNotificationRequestPreview

> NotificationRequestPreview getNotificationRequestPreview(notificationRequest, recipientsPreviewSize)

Get notification request preview (getNotificationRequestPreview)

Returns preview for notification request.  &#x60;processedTemplates&#x60; shows how the notifications for each delivery method will look like for the first recipient of the corresponding notification target.  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **notificationRequest** | **NotificationRequest** |  | |
| **recipientsPreviewSize** | **Integer** | Amount of the recipients to show in preview | [optional] [default to 20] |


## getNotificationRequests

> PageDataNotificationRequestInfo getNotificationRequests(pageSize, page, textSearch, sortProperty, sortOrder)

Get notification requests (getNotificationRequests)

Returns the page of notification requests submitted by users of this tenant or sysadmins.  You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | Case-insensitive &#39;substring&#39; filed based on the used template name | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] |


## getNotificationSettings

> NotificationSettings getNotificationSettings()

Get notification settings (getNotificationSettings)

Retrieves notification settings for this tenant or sysadmin.  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

## getNotifications

> PageDataNotification getNotifications(pageSize, page, textSearch, sortProperty, sortOrder, unreadOnly, deliveryMethod)

Get notifications (getNotifications)

Returns the page of notifications for current user.  You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for any authorized user.   **WebSocket API**:  There are 2 types of subscriptions: one for unread notifications count, another for unread notifications themselves.  The URI for opening WS session for notifications: &#x60;/api/ws/plugins/notifications&#x60;.  Subscription command for unread notifications count: &#x60;&#x60;&#x60; {   \&quot;unreadCountSubCmd\&quot;: {     \&quot;cmdId\&quot;: 1234   } } &#x60;&#x60;&#x60; To subscribe for latest unread notifications: &#x60;&#x60;&#x60; {   \&quot;unreadSubCmd\&quot;: {     \&quot;cmdId\&quot;: 1234,     \&quot;limit\&quot;: 10   } } &#x60;&#x60;&#x60; To unsubscribe from any subscription: &#x60;&#x60;&#x60; {   \&quot;unsubCmd\&quot;: {     \&quot;cmdId\&quot;: 1234   } } &#x60;&#x60;&#x60; To mark certain notifications as read, use following command: &#x60;&#x60;&#x60; {   \&quot;markAsReadCmd\&quot;: {     \&quot;cmdId\&quot;: 1234,     \&quot;notifications\&quot;: [       \&quot;6f860330-7fc2-11ed-b855-7dd3b7d2faa9\&quot;,       \&quot;5b6dfee0-8d0d-11ed-b61f-35a57b03dade\&quot;     ]   } }  &#x60;&#x60;&#x60; To mark all notifications as read: &#x60;&#x60;&#x60; {   \&quot;markAllAsReadCmd\&quot;: {     \&quot;cmdId\&quot;: 1234   } } &#x60;&#x60;&#x60;   Update structure for unread **notifications count subscription**: &#x60;&#x60;&#x60; {   \&quot;cmdId\&quot;: 1234,   \&quot;totalUnreadCount\&quot;: 55 } &#x60;&#x60;&#x60; For **notifications subscription**: - full update of latest unread notifications: &#x60;&#x60;&#x60; {   \&quot;cmdId\&quot;: 1234,   \&quot;notifications\&quot;: [     {       \&quot;id\&quot;: {         \&quot;entityType\&quot;: \&quot;NOTIFICATION\&quot;,         \&quot;id\&quot;: \&quot;6f860330-7fc2-11ed-b855-7dd3b7d2faa9\&quot;       },       ...     }   ],   \&quot;totalUnreadCount\&quot;: 1 } &#x60;&#x60;&#x60; - when new notification arrives or shown notification is updated: &#x60;&#x60;&#x60; {   \&quot;cmdId\&quot;: 1234,   \&quot;update\&quot;: {     \&quot;id\&quot;: {       \&quot;entityType\&quot;: \&quot;NOTIFICATION\&quot;,       \&quot;id\&quot;: \&quot;6f860330-7fc2-11ed-b855-7dd3b7d2faa9\&quot;     },     # updated notification info, text, subject etc.     ...   },   \&quot;totalUnreadCount\&quot;: 2 } &#x60;&#x60;&#x60; - when unread notifications count changes: &#x60;&#x60;&#x60; {   \&quot;cmdId\&quot;: 1234,   \&quot;totalUnreadCount\&quot;: 5 } &#x60;&#x60;&#x60;

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | Case-insensitive &#39;substring&#39; filter based on notification subject or text | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] |
| **unreadOnly** | **Boolean** | To search for unread notifications only | [optional] [default to false] |
| **deliveryMethod** | **String** | Delivery method | [optional] [enum: WEB, MOBILE_APP] |


## getUnreadNotificationsCount

> Integer getUnreadNotificationsCount(deliveryMethod)

Get unread notifications count (getUnreadNotificationsCount)

Returns unread notifications count for chosen delivery method.  Available for any authorized user. 

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deliveryMethod** | **String** | Delivery method | [optional] [enum: WEB, MOBILE_APP] |


## getUserNotificationSettings

> UserNotificationSettings getUserNotificationSettings()

getUserNotificationSettings

## markAllNotificationsAsRead

> markAllNotificationsAsRead(deliveryMethod)

Mark all notifications as read (markAllNotificationsAsRead)

Marks all unread notifications as read.  Available for any authorized user. 

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deliveryMethod** | **String** | Delivery method | [optional] [enum: WEB, MOBILE_APP] |


## markNotificationAsRead

> markNotificationAsRead(id)

Mark notification as read (markNotificationAsRead)

Marks notification as read by its id.  Available for any authorized user. 

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |


## saveNotificationSettings

> NotificationSettings saveNotificationSettings(notificationSettings)

Save notification settings (saveNotificationSettings)

Saves notification settings for this tenant or sysadmin. &#x60;deliveryMethodsConfigs&#x60; of the settings must be specified.  Here is an example of the notification settings with Slack configuration: &#x60;&#x60;&#x60;json {   \&quot;deliveryMethodsConfigs\&quot;: {     \&quot;SLACK\&quot;: {       \&quot;method\&quot;: \&quot;SLACK\&quot;,       \&quot;botToken\&quot;: \&quot;xoxb-....\&quot;     }   } } &#x60;&#x60;&#x60;  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **notificationSettings** | **NotificationSettings** |  | |


## saveUserNotificationSettings

> UserNotificationSettings saveUserNotificationSettings(userNotificationSettings)

saveUserNotificationSettings

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userNotificationSettings** | **UserNotificationSettings** |  | |


## sendAddonAccessError

> sendAddonAccessError(addonType)

Send add-on access error notification to System/Tenant administrators (sendAddonAccessError)

Send add-on access error notification by Tenant Administrator or Customer User to System/Tenant administrators.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **addonType** | **String** | Addon type | [enum: EDGE, TRENDZ, WHITE_LABELING] |


## sendAddonAccessRequest

> sendAddonAccessRequest(addonType)

Send add-on access request notification to System/Tenant administrators (sendAddonAccessRequest)

Send add-on access request notification by Tenant Administrator or Customer User to System/Tenant administrators.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **addonType** | **String** | Addon type | [enum: EDGE, TRENDZ, WHITE_LABELING] |


## sendEntitiesLimitIncreaseRequest

> sendEntitiesLimitIncreaseRequest(entityType)

Send entity limit increase request notification to System/Tenant administrators (sendEntitiesLimitIncreaseRequest)

Send entity limit increase request notification by Tenant Administrator or Customer User to System/Tenant administrators.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | Entity type | [enum: DEVICE, ASSET, CUSTOMER, USER, DASHBOARD, RULE_CHAIN, EDGE, INTEGRATION, CONVERTER, SCHEDULER_EVENT] |


## sendPlanUpgradeRequest

> sendPlanUpgradeRequest(planName)

Send plan upgrade request notification to Tenant administrators (sendPlanUpgradeRequest)

Send plan upgrade access request notification by Tenant user to Tenant administrators.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **planName** | **String** | Plan name | |


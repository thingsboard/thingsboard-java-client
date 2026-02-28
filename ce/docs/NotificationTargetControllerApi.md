# NotificationTargetControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteNotificationTargetById**](#deleteNotificationTargetById) | **DELETE** /api/notification/target/{id} | Delete notification target by id (deleteNotificationTargetById) |
| [**getNotificationTargetById**](#getNotificationTargetById) | **GET** /api/notification/target/{id} | Get notification target by id (getNotificationTargetById) |
| [**getNotificationTargets**](#getNotificationTargets) | **GET** /api/notification/targets | Get notification targets (getNotificationTargets) |
| [**getNotificationTargetsByIdsV2**](#getNotificationTargetsByIdsV2) | **GET** /api/notification/targets/list | Get notification targets by ids (getNotificationTargetsByIdsV2) |
| [**getNotificationTargetsBySupportedNotificationTypeV2**](#getNotificationTargetsBySupportedNotificationTypeV2) | **GET** /api/notification/targets/notificationType/{notificationType} | Get notification targets by supported notification type (getNotificationTargetsBySupportedNotificationTypeV2) |
| [**getRecipientsForNotificationTargetConfig**](#getRecipientsForNotificationTargetConfig) | **POST** /api/notification/target/recipients | Get recipients for notification target config (getRecipientsForNotificationTargetConfig) |
| [**saveNotificationTarget**](#saveNotificationTarget) | **POST** /api/notification/target | Save notification target (saveNotificationTarget) |



## deleteNotificationTargetById

> deleteNotificationTargetById(id)

Delete notification target by id (deleteNotificationTargetById)

Deletes notification target by its id.  This target cannot be referenced by existing scheduled notification requests or any notification rules.  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |


## getNotificationTargetById

> NotificationTarget getNotificationTargetById(id)

Get notification target by id (getNotificationTargetById)

Fetches notification target by id.  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |


## getNotificationTargets

> PageDataNotificationTarget getNotificationTargets(pageSize, page, textSearch, sortProperty, sortOrder)

Get notification targets (getNotificationTargets)

Returns the page of notification targets owned by sysadmin or tenant.  You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | Case-insensitive &#39;substring&#39; filed based on the target&#39;s name | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] |


## getNotificationTargetsByIdsV2

> List&lt;NotificationTarget&gt; getNotificationTargetsByIdsV2(ids)

Get notification targets by ids (getNotificationTargetsByIdsV2)

Returns the list of notification targets found by provided ids.  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ids** | **List&lt;String&gt;** | Comma-separated list of uuids representing targets ids | |


## getNotificationTargetsBySupportedNotificationTypeV2

> PageDataNotificationTarget getNotificationTargetsBySupportedNotificationTypeV2(notificationType, pageSize, page, textSearch, sortProperty, sortOrder)

Get notification targets by supported notification type (getNotificationTargetsBySupportedNotificationTypeV2)

Returns the page of notification targets filtered by notification type that they can be used for.  You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **notificationType** | **NotificationType** |  | [enum: GENERAL, ALARM, DEVICE_ACTIVITY, ENTITY_ACTION, ALARM_COMMENT, RULE_ENGINE_COMPONENT_LIFECYCLE_EVENT, ALARM_ASSIGNMENT, NEW_PLATFORM_VERSION, ENTITIES_LIMIT, ENTITIES_LIMIT_INCREASE_REQUEST, API_USAGE_LIMIT, RULE_NODE, RATE_LIMITS, EDGE_CONNECTION, EDGE_COMMUNICATION_FAILURE, TASK_PROCESSING_FAILURE, RESOURCES_SHORTAGE] |
| **pageSize** | **Integer** |  | |
| **page** | **Integer** |  | |
| **textSearch** | **String** |  | [optional] |
| **sortProperty** | **String** |  | [optional] |
| **sortOrder** | **String** |  | [optional] |


## getRecipientsForNotificationTargetConfig

> PageDataUser getRecipientsForNotificationTargetConfig(pageSize, page, notificationTarget)

Get recipients for notification target config (getRecipientsForNotificationTargetConfig)

Returns the page of recipients for such notification target configuration.  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **notificationTarget** | **NotificationTarget** |  | |


## saveNotificationTarget

> NotificationTarget saveNotificationTarget(notificationTarget)

Save notification target (saveNotificationTarget)

Creates or updates notification target.  Available &#x60;configuration&#x60; types are &#x60;PLATFORM_USERS&#x60; and &#x60;SLACK&#x60;. For &#x60;PLATFORM_USERS&#x60; the &#x60;usersFilter&#x60; must be specified. For tenant, there are following users filter types available: &#x60;USER_LIST&#x60;, &#x60;CUSTOMER_USERS&#x60;, &#x60;TENANT_ADMINISTRATORS&#x60;, &#x60;ALL_USERS&#x60;, &#x60;ORIGINATOR_ENTITY_OWNER_USERS&#x60;, &#x60;AFFECTED_USER&#x60;. For sysadmin: &#x60;TENANT_ADMINISTRATORS&#x60;, &#x60;AFFECTED_TENANT_ADMINISTRATORS&#x60;, &#x60;SYSTEM_ADMINISTRATORS&#x60;, &#x60;ALL_USERS&#x60;.  Here is an example of tenant-level notification target to send notification to customer&#39;s users: &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;Users of Customer A\&quot;,   \&quot;configuration\&quot;: {     \&quot;type\&quot;: \&quot;PLATFORM_USERS\&quot;,     \&quot;usersFilter\&quot;: {       \&quot;type\&quot;: \&quot;CUSTOMER_USERS\&quot;,       \&quot;customerId\&quot;: \&quot;32499a20-d785-11ed-a06c-21dd57dd88ca\&quot;     },     \&quot;description\&quot;: \&quot;Users of Customer A\&quot;   } } &#x60;&#x60;&#x60;  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **notificationTarget** | **NotificationTarget** |  | |


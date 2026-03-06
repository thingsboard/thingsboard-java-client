# NotificationTargetControllerApi

`ThingsboardClient` methods:

```
void deleteNotificationTargetById(@Nonnull UUID id) // Delete notification target by id (deleteNotificationTargetById)
NotificationTarget getNotificationTargetById(@Nonnull UUID id) // Get notification target by id (getNotificationTargetById)
PageDataNotificationTarget getNotificationTargets(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get notification targets (getNotificationTargets)
List<NotificationTarget> getNotificationTargetsByIds(@Nonnull List<String> ids) // Get notification targets by ids (getNotificationTargetsByIds)
PageDataNotificationTarget getNotificationTargetsBySupportedNotificationType(@Nonnull NotificationType notificationType, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get notification targets by supported notification type (getNotificationTargetsBySupportedNotificationType)
PageDataUser getRecipientsForNotificationTargetConfig(@Nonnull Integer pageSize, @Nonnull Integer page, @Nonnull NotificationTarget notificationTarget) // Get recipients for notification target config (getRecipientsForNotificationTargetConfig)
NotificationTarget saveNotificationTarget(@Nonnull NotificationTarget notificationTarget) // Save notification target (saveNotificationTarget)
```


## deleteNotificationTargetById

```
void deleteNotificationTargetById(@Nonnull UUID id)
```

**DELETE** `/api/notification/target/{id}`

Delete notification target by id (deleteNotificationTargetById)

Deletes notification target by its id.  This target cannot be referenced by existing scheduled notification requests or any notification rules.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |

### Return type

null (empty response body)


## getNotificationTargetById

```
NotificationTarget getNotificationTargetById(@Nonnull UUID id)
```

**GET** `/api/notification/target/{id}`

Get notification target by id (getNotificationTargetById)

Fetches notification target by id.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |

### Return type

**NotificationTarget**


## getNotificationTargets

```
PageDataNotificationTarget getNotificationTargets(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/notification/targets`

Get notification targets (getNotificationTargets)

Returns the page of notification targets owned by sysadmin or tenant.  You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | Case-insensitive 'substring' filed based on the target's name | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] |

### Return type

**PageDataNotificationTarget**


## getNotificationTargetsByIds

```
List<NotificationTarget> getNotificationTargetsByIds(@Nonnull List<String> ids)
```

**GET** `/api/notification/targets/list`

Get notification targets by ids (getNotificationTargetsByIds)

Returns the list of notification targets found by provided ids.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ids** | **List<String>** | Comma-separated list of uuids representing targets ids | |

### Return type

**List<NotificationTarget>**


## getNotificationTargetsBySupportedNotificationType

```
PageDataNotificationTarget getNotificationTargetsBySupportedNotificationType(@Nonnull NotificationType notificationType, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/notification/targets/notificationType/{notificationType}`

Get notification targets by supported notification type (getNotificationTargetsBySupportedNotificationType)

Returns the page of notification targets filtered by notification type that they can be used for.  You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **notificationType** | **NotificationType** | Notification type to filter targets by | [enum: GENERAL, ALARM, DEVICE_ACTIVITY, ENTITY_ACTION, ALARM_COMMENT, RULE_ENGINE_COMPONENT_LIFECYCLE_EVENT, ALARM_ASSIGNMENT, NEW_PLATFORM_VERSION, ENTITIES_LIMIT, ENTITIES_LIMIT_INCREASE_REQUEST, ADDON_ACCESS_REQUEST, ADDON_ACCESS_ERROR, PLAN_UPGRADE_REQUEST, API_USAGE_LIMIT, RULE_NODE, INTEGRATION_LIFECYCLE_EVENT, RATE_LIMITS, EDGE_CONNECTION, EDGE_COMMUNICATION_FAILURE, TASK_PROCESSING_FAILURE, RESOURCES_SHORTAGE, USER_ACTIVATED, USER_REGISTERED, REPORT_GENERATED] |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | Case-insensitive 'substring' filed based on the target's name | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] |

### Return type

**PageDataNotificationTarget**


## getRecipientsForNotificationTargetConfig

```
PageDataUser getRecipientsForNotificationTargetConfig(@Nonnull Integer pageSize, @Nonnull Integer page, @Nonnull NotificationTarget notificationTarget)
```

**POST** `/api/notification/target/recipients`

Get recipients for notification target config (getRecipientsForNotificationTargetConfig)

Returns the page of recipients for such notification target configuration.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **notificationTarget** | **NotificationTarget** |  | |

### Return type

**PageDataUser**


## saveNotificationTarget

```
NotificationTarget saveNotificationTarget(@Nonnull NotificationTarget notificationTarget)
```

**POST** `/api/notification/target`

Save notification target (saveNotificationTarget)

Creates or updates notification target.  Available `configuration` types are `PLATFORM_USERS` and `SLACK`. For `PLATFORM_USERS` the `usersFilter` must be specified. For tenant, there are following users filter types available: `USER_LIST`, `CUSTOMER_USERS`, `USER_GROUP_LIST`, `TENANT_ADMINISTRATORS`, `USER_ROLE`, `ALL_USERS`, `ORIGINATOR_ENTITY_OWNER_USERS`, `AFFECTED_USER`. For sysadmin: `TENANT_ADMINISTRATORS`, `AFFECTED_TENANT_ADMINISTRATORS`, `SYSTEM_ADMINISTRATORS`, `ALL_USERS`.  Here is an example of tenant-level notification target to send notification to customer's users: ```json {   \"name\": \"Users of Customer A\",   \"configuration\": {     \"type\": \"PLATFORM_USERS\",     \"usersFilter\": {       \"type\": \"CUSTOMER_USERS\",       \"customerId\": \"32499a20-d785-11ed-a06c-21dd57dd88ca\"     },     \"description\": \"Users of Customer A\"   } } ```  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **notificationTarget** | **NotificationTarget** |  | |

### Return type

**NotificationTarget**


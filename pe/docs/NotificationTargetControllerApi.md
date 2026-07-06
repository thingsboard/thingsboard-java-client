# NotificationTargetControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void deleteNotificationTargetById(DeleteNotificationTargetByIdArgs args) // Delete notification target by id (deleteNotificationTargetById)
NotificationTarget getNotificationTargetById(GetNotificationTargetByIdArgs args) // Get notification target by id (getNotificationTargetById)
PageDataNotificationTarget getNotificationTargets(GetNotificationTargetsArgs args) // Get notification targets (getNotificationTargets)
List<NotificationTarget> getNotificationTargetsByIds(GetNotificationTargetsByIdsArgs args) // Get notification targets by ids (getNotificationTargetsByIds)
PageDataNotificationTarget getNotificationTargetsBySupportedNotificationType(GetNotificationTargetsBySupportedNotificationTypeArgs args) // Get notification targets by supported notification type (getNotificationTargetsBySupportedNotificationType)
PageDataUser getRecipientsForNotificationTargetConfig(GetRecipientsForNotificationTargetConfigArgs args) // Get recipients for notification target config (getRecipientsForNotificationTargetConfig)
NotificationTarget saveNotificationTarget(SaveNotificationTargetArgs args) // Save notification target (saveNotificationTarget)
```


## deleteNotificationTargetById

**DELETE** `/api/notification/target/{id}`

Delete notification target by id (deleteNotificationTargetById)

Deletes notification target by its id.  This target cannot be referenced by existing scheduled notification requests or any notification rules.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
void deleteNotificationTargetById(DeleteNotificationTargetByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteNotificationTargetByIdArgs.builder()
        .id(UUID)
        .build()
```

### `DeleteNotificationTargetByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `UUID` | **yes** |  | |

### Return type

null (empty response body)


## getNotificationTargetById

**GET** `/api/notification/target/{id}`

Get notification target by id (getNotificationTargetById)

Fetches notification target by id.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
NotificationTarget getNotificationTargetById(GetNotificationTargetByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetNotificationTargetByIdArgs.builder()
        .id(UUID)
        .build()
```

### `GetNotificationTargetByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `UUID` | **yes** |  | |

### Return type

`NotificationTarget`


## getNotificationTargets

**GET** `/api/notification/targets`

Get notification targets (getNotificationTargets)

Returns the page of notification targets owned by sysadmin or tenant.  You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
PageDataNotificationTarget getNotificationTargets(GetNotificationTargetsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetNotificationTargetsArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetNotificationTargetsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | Case-insensitive 'substring' filed based on the target's name | |
| `sortProperty` | `String` | no | Property of entity to sort by | |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | |

### Return type

`PageDataNotificationTarget`


## getNotificationTargetsByIds

**GET** `/api/notification/targets/list`

Get notification targets by ids (getNotificationTargetsByIds)

Returns the list of notification targets found by provided ids.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
List<NotificationTarget> getNotificationTargetsByIds(GetNotificationTargetsByIdsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetNotificationTargetsByIdsArgs.builder()
        .ids(List<String>)
        .build()
```

### `GetNotificationTargetsByIdsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `ids` | `List<String>` | **yes** | Comma-separated list of uuids representing targets ids | |

### Return type

`List<NotificationTarget>`


## getNotificationTargetsBySupportedNotificationType

**GET** `/api/notification/targets/notificationType/{notificationType}`

Get notification targets by supported notification type (getNotificationTargetsBySupportedNotificationType)

Returns the page of notification targets filtered by notification type that they can be used for.  You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
PageDataNotificationTarget getNotificationTargetsBySupportedNotificationType(GetNotificationTargetsBySupportedNotificationTypeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetNotificationTargetsBySupportedNotificationTypeArgs.builder()
        .notificationType(NotificationType)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetNotificationTargetsBySupportedNotificationTypeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `notificationType` | `NotificationType` | **yes** | Notification type to filter targets by | enum: `GENERAL`, `ALARM`, `DEVICE_ACTIVITY`, `ENTITY_ACTION`, `ALARM_COMMENT`, `RULE_ENGINE_COMPONENT_LIFECYCLE_EVENT`, `ALARM_ASSIGNMENT`, `NEW_PLATFORM_VERSION`, `ENTITIES_LIMIT`, `ENTITIES_LIMIT_INCREASE_REQUEST`, `ADDON_ACCESS_ERROR`, `API_USAGE_LIMIT`, `RULE_NODE`, `INTEGRATION_LIFECYCLE_EVENT`, `RATE_LIMITS`, `EDGE_CONNECTION`, `EDGE_COMMUNICATION_FAILURE`, `TASK_PROCESSING_FAILURE`, `RESOURCES_SHORTAGE`, `USER_ACTIVATED`, `USER_REGISTERED`, `REPORT_GENERATED` |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | Case-insensitive 'substring' filed based on the target's name | |
| `sortProperty` | `String` | no | Property of entity to sort by | |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | |

### Return type

`PageDataNotificationTarget`


## getRecipientsForNotificationTargetConfig

**POST** `/api/notification/target/recipients`

Get recipients for notification target config (getRecipientsForNotificationTargetConfig)

Returns the page of recipients for such notification target configuration.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
PageDataUser getRecipientsForNotificationTargetConfig(GetRecipientsForNotificationTargetConfigArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetRecipientsForNotificationTargetConfigArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .notificationTarget(NotificationTarget)
        .build()
```

### `GetRecipientsForNotificationTargetConfigArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `notificationTarget` | `NotificationTarget` | **yes** |  | |

### Return type

`PageDataUser`


## saveNotificationTarget

**POST** `/api/notification/target`

Save notification target (saveNotificationTarget)

Creates or updates notification target.  Available `configuration` types are `PLATFORM_USERS` and `SLACK`. For `PLATFORM_USERS` the `usersFilter` must be specified. For tenant, there are following users filter types available: `USER_LIST`, `CUSTOMER_USERS`, `USER_GROUP_LIST`, `TENANT_ADMINISTRATORS`, `USER_ROLE`, `ALL_USERS`, `ORIGINATOR_ENTITY_OWNER_USERS`, `AFFECTED_USER`. For sysadmin: `TENANT_ADMINISTRATORS`, `AFFECTED_TENANT_ADMINISTRATORS`, `SYSTEM_ADMINISTRATORS`, `ALL_USERS`.  Here is an example of tenant-level notification target to send notification to customer's users: ```json {   \"name\": \"Users of Customer A\",   \"configuration\": {     \"type\": \"PLATFORM_USERS\",     \"usersFilter\": {       \"type\": \"CUSTOMER_USERS\",       \"customerId\": \"32499a20-d785-11ed-a06c-21dd57dd88ca\"     },     \"description\": \"Users of Customer A\"   } } ```  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
NotificationTarget saveNotificationTarget(SaveNotificationTargetArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveNotificationTargetArgs.builder()
        .notificationTarget(NotificationTarget)
        .build()
```

### `SaveNotificationTargetArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `notificationTarget` | `NotificationTarget` | **yes** |  | |

### Return type

`NotificationTarget`


# NotificationRuleControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void deleteNotificationRule(DeleteNotificationRuleArgs args) // Delete notification rule (deleteNotificationRule)
NotificationRuleInfo getNotificationRuleById(GetNotificationRuleByIdArgs args) // Get notification rule by id (getNotificationRuleById)
PageDataNotificationRuleInfo getNotificationRules(GetNotificationRulesArgs args) // Get notification rules (getNotificationRules)
NotificationRule saveNotificationRule(SaveNotificationRuleArgs args) // Save notification rule (saveNotificationRule)
```


## deleteNotificationRule

**DELETE** `/api/notification/rule/{id}`

Delete notification rule (deleteNotificationRule)

Deletes notification rule by id. Cancels all related scheduled notification requests (e.g. due to escalation table)  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
void deleteNotificationRule(DeleteNotificationRuleArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteNotificationRuleArgs.builder()
        .id(UUID)
        .build()
```

### `DeleteNotificationRuleArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `UUID` | **yes** |  | |

### Return type

null (empty response body)


## getNotificationRuleById

**GET** `/api/notification/rule/{id}`

Get notification rule by id (getNotificationRuleById)

Fetches notification rule info by rule's id. In addition to regular notification rule fields, there are `templateName` and `deliveryMethods` in the response.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
NotificationRuleInfo getNotificationRuleById(GetNotificationRuleByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetNotificationRuleByIdArgs.builder()
        .id(UUID)
        .build()
```

### `GetNotificationRuleByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `UUID` | **yes** |  | |

### Return type

`NotificationRuleInfo`


## getNotificationRules

**GET** `/api/notification/rules`

Get notification rules (getNotificationRules)

Returns the page of notification rules.  You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
PageDataNotificationRuleInfo getNotificationRules(GetNotificationRulesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetNotificationRulesArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetNotificationRulesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | Case-insensitive 'substring' filter based on rule's name | |
| `sortProperty` | `String` | no | Property of entity to sort by | |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | |

### Return type

`PageDataNotificationRuleInfo`


## saveNotificationRule

**POST** `/api/notification/rule`

Save notification rule (saveNotificationRule)

Creates or updates notification rule.   Mandatory properties are `name`, `templateId` (of a template with `notificationType` matching to rule's `triggerType`), `triggerType`, `triggerConfig` and `recipientConfig`. Additionally, you may specify rule `description` inside of `additionalConfig`.  Trigger type of the rule cannot be changed. Available trigger types for tenant: `ENTITY_ACTION`, `ALARM`, `ALARM_COMMENT`, `ALARM_ASSIGNMENT`, `DEVICE_ACTIVITY`, `RULE_ENGINE_COMPONENT_LIFECYCLE_EVENT`. For sysadmin, there are following trigger types available: `ENTITIES_LIMIT`, `API_USAGE_LIMIT`, `NEW_PLATFORM_VERSION`.  Here is an example of notification rule to send notification when a device, asset or customer is created or deleted: ```json {   \"name\": \"Entity action\",   \"templateId\": {     \"entityType\": \"NOTIFICATION_TEMPLATE\",     \"id\": \"32117320-d785-11ed-a06c-21dd57dd88ca\"   },   \"triggerType\": \"ENTITY_ACTION\",   \"triggerConfig\": {     \"entityTypes\": [       \"CUSTOMER\",       \"DEVICE\",       \"ASSET\"     ],     \"created\": true,     \"updated\": false,     \"deleted\": true,     \"triggerType\": \"ENTITY_ACTION\"   },   \"recipientsConfig\": {     \"targets\": [       \"320f2930-d785-11ed-a06c-21dd57dd88ca\"     ],     \"triggerType\": \"ENTITY_ACTION\"   },   \"additionalConfig\": {     \"description\": \"Send notification to tenant admins or customer users when a device, asset or customer is created\"   },   \"templateName\": \"Entity action notification\",   \"deliveryMethods\": [     \"WEB\"   ] } ```  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
NotificationRule saveNotificationRule(SaveNotificationRuleArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveNotificationRuleArgs.builder()
        .notificationRule(NotificationRule)
        .build()
```

### `SaveNotificationRuleArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `notificationRule` | `NotificationRule` | **yes** |  | |

### Return type

`NotificationRule`


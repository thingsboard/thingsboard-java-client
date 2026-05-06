# AlarmRuleControllerApi

`ThingsboardClient` methods:

```
void deleteAlarmRule(@Nonnull String alarmRuleId) // Delete Alarm Rule (deleteAlarmRule)
AlarmRuleDefinition getAlarmRuleById(@Nonnull String alarmRuleId) // Get Alarm Rule (getAlarmRuleById)
PageDataString getAlarmRuleNames(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortOrder) // Get alarm rule names (getAlarmRuleNames)
PageDataAlarmRuleDefinitionInfo getAlarmRules(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable EntityType entityType, @Nullable Set<UUID> entities, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get alarm rules (getAlarmRules)
PageDataAlarmRuleDefinition getAlarmRulesByEntityId(@Nonnull String entityType, @Nonnull String entityId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get Alarm Rules by Entity Id (getAlarmRulesByEntityId)
com.fasterxml.jackson.databind.JsonNode getLatestAlarmRuleDebugEvent(@Nonnull String alarmRuleId) // Get latest alarm rule debug event (getLatestAlarmRuleDebugEvent)
AlarmRuleDefinition saveAlarmRule(@Nonnull AlarmRuleDefinition alarmRuleDefinition) // Create Or Update Alarm Rule (saveAlarmRule)
com.fasterxml.jackson.databind.JsonNode testAlarmRuleScript(@Nonnull Object body) // Test alarm rule TBEL expression (testAlarmRuleScript)
```


## deleteAlarmRule

```
void deleteAlarmRule(@Nonnull String alarmRuleId)
```

**DELETE** `/api/alarm/rule/{alarmRuleId}`

Delete Alarm Rule (deleteAlarmRule)

Deletes the alarm rule. Referencing non-existing Alarm Rule Id will cause an error.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alarmRuleId** | **String** |  | |

### Return type

null (empty response body)


## getAlarmRuleById

```
AlarmRuleDefinition getAlarmRuleById(@Nonnull String alarmRuleId)
```

**GET** `/api/alarm/rule/{alarmRuleId}`

Get Alarm Rule (getAlarmRuleById)

Fetch the Alarm Rule object based on the provided Alarm Rule Id.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alarmRuleId** | **String** |  | |

### Return type

**AlarmRuleDefinition**


## getAlarmRuleNames

```
PageDataString getAlarmRuleNames(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortOrder)
```

**GET** `/api/alarm/rules/names`

Get alarm rule names (getAlarmRuleNames)

Fetch the list of alarm rule names.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the calculated field name. | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataString**


## getAlarmRules

```
PageDataAlarmRuleDefinitionInfo getAlarmRules(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable EntityType entityType, @Nullable Set<UUID> entities, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/alarm/rules`

Get alarm rules (getAlarmRules)

Fetch tenant alarm rules based on the filter.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **entityType** | **EntityType** | Entity type filter. If not specified, alarm rules for all supported entity types will be returned. | [optional] [enum: TENANT, CUSTOMER, USER, DASHBOARD, ASSET, DEVICE, ALARM, ENTITY_GROUP, CONVERTER, INTEGRATION, RULE_CHAIN, RULE_NODE, SCHEDULER_EVENT, BLOB_ENTITY, REPORT_TEMPLATE, REPORT, ENTITY_VIEW, WIDGETS_BUNDLE, WIDGET_TYPE, ROLE, GROUP_PERMISSION, TENANT_PROFILE, DEVICE_PROFILE, ASSET_PROFILE, API_USAGE_STATE, TB_RESOURCE, OTA_PACKAGE, EDGE, RPC, QUEUE, NOTIFICATION_TARGET, NOTIFICATION_TEMPLATE, NOTIFICATION_REQUEST, NOTIFICATION, NOTIFICATION_RULE, QUEUE_STATS, OAUTH2_CLIENT, DOMAIN, MOBILE_APP, MOBILE_APP_BUNDLE, CALCULATED_FIELD, JOB, SECRET, ADMIN_SETTINGS, AI_MODEL, API_KEY, BILLING_CUSTOMER, SUBSCRIPTION_PLAN, SUBSCRIPTION, COUPON, PRODUCT, SUBSCRIPTION_ADDON] |
| **entities** | **Set<UUID>** | Entities filter. If not specified, alarm rules for entity type filter will be returned. | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the calculated field name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataAlarmRuleDefinitionInfo**


## getAlarmRulesByEntityId

```
PageDataAlarmRuleDefinition getAlarmRulesByEntityId(@Nonnull String entityType, @Nonnull String entityId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/alarm/rules/{entityType}/{entityId}`

Get Alarm Rules by Entity Id (getAlarmRulesByEntityId)

Fetch the Alarm Rules based on the provided Entity Id.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **entityId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the calculated field name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataAlarmRuleDefinition**


## getLatestAlarmRuleDebugEvent

```
com.fasterxml.jackson.databind.JsonNode getLatestAlarmRuleDebugEvent(@Nonnull String alarmRuleId)
```

**GET** `/api/alarm/rule/{alarmRuleId}/debug`

Get latest alarm rule debug event (getLatestAlarmRuleDebugEvent)

Gets latest alarm rule debug event for specified alarm rule id. Referencing non-existing alarm rule id will cause an error.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alarmRuleId** | **String** |  | |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## saveAlarmRule

```
AlarmRuleDefinition saveAlarmRule(@Nonnull AlarmRuleDefinition alarmRuleDefinition)
```

**POST** `/api/alarm/rule`

Create Or Update Alarm Rule (saveAlarmRule)

Creates or Updates the Alarm Rule. When creating alarm rule, platform generates Alarm Rule Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Alarm Rule Id will be present in the response. Specify existing Alarm Rule Id to update the alarm rule. Referencing non-existing Alarm Rule Id will cause 'Not Found' error. Remove 'id', 'tenantId' from the request body example (below) to create new Alarm Rule entity.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alarmRuleDefinition** | **AlarmRuleDefinition** | A JSON value representing the alarm rule. | |

### Return type

**AlarmRuleDefinition**


## testAlarmRuleScript

```
com.fasterxml.jackson.databind.JsonNode testAlarmRuleScript(@Nonnull Object body)
```

**POST** `/api/alarm/rule/testScript`

Test alarm rule TBEL expression (testAlarmRuleScript)

Execute the alarm rule TBEL condition expression and return the result. Alarm rule expressions must return a boolean value. The format of request:   ```json {   \"expression\": \"return temperature > 50;\",   \"arguments\": {     \"temperature\": { \"type\": \"SINGLE_VALUE\", \"ts\": 1739776478057, \"value\": 55 }   } } ```   Expected result JSON contains \"output\" and \"error\".  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object** | Test alarm rule TBEL condition expression. The expression must return a boolean value. | |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


# AlarmRuleControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void deleteAlarmRule(DeleteAlarmRuleArgs args) // Delete Alarm Rule (deleteAlarmRule)
AlarmRuleDefinition getAlarmRuleById(GetAlarmRuleByIdArgs args) // Get Alarm Rule (getAlarmRuleById)
PageDataString getAlarmRuleNames(GetAlarmRuleNamesArgs args) // Get alarm rule names (getAlarmRuleNames)
PageDataAlarmRuleDefinitionInfo getAlarmRules(GetAlarmRulesArgs args) // Get alarm rules (getAlarmRules)
PageDataAlarmRuleDefinition getAlarmRulesByEntityId(GetAlarmRulesByEntityIdArgs args) // Get Alarm Rules by Entity Id (getAlarmRulesByEntityId)
com.fasterxml.jackson.databind.JsonNode getLatestAlarmRuleDebugEvent(GetLatestAlarmRuleDebugEventArgs args) // Get latest alarm rule debug event (getLatestAlarmRuleDebugEvent)
AlarmRuleDefinition saveAlarmRule(SaveAlarmRuleArgs args) // Create Or Update Alarm Rule (saveAlarmRule)
com.fasterxml.jackson.databind.JsonNode testAlarmRuleScript(TestAlarmRuleScriptArgs args) // Test alarm rule TBEL expression (testAlarmRuleScript)
```


## deleteAlarmRule

**DELETE** `/api/alarm/rule/{alarmRuleId}`

Delete Alarm Rule (deleteAlarmRule)

Deletes the alarm rule. Referencing non-existing Alarm Rule Id will cause an error.  Available for users with 'TENANT_ADMIN' authority.

```java
void deleteAlarmRule(DeleteAlarmRuleArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteAlarmRuleArgs.builder()
        .alarmRuleId(String)
        .build()
```

### `DeleteAlarmRuleArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `alarmRuleId` | `String` | **yes** |  | |

### Return type

null (empty response body)


## getAlarmRuleById

**GET** `/api/alarm/rule/{alarmRuleId}`

Get Alarm Rule (getAlarmRuleById)

Fetch the Alarm Rule object based on the provided Alarm Rule Id.  Available for users with 'TENANT_ADMIN' authority.

```java
AlarmRuleDefinition getAlarmRuleById(GetAlarmRuleByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAlarmRuleByIdArgs.builder()
        .alarmRuleId(String)
        .build()
```

### `GetAlarmRuleByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `alarmRuleId` | `String` | **yes** |  | |

### Return type

`AlarmRuleDefinition`


## getAlarmRuleNames

**GET** `/api/alarm/rules/names`

Get alarm rule names (getAlarmRuleNames)

Fetch the list of alarm rule names.  Available for users with 'TENANT_ADMIN' authority.

```java
PageDataString getAlarmRuleNames(GetAlarmRuleNamesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAlarmRuleNamesArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetAlarmRuleNamesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the calculated field name. | |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataString`


## getAlarmRules

**GET** `/api/alarm/rules`

Get alarm rules (getAlarmRules)

Fetch tenant alarm rules based on the filter.  Available for users with 'TENANT_ADMIN' authority.

```java
PageDataAlarmRuleDefinitionInfo getAlarmRules(GetAlarmRulesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAlarmRulesArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetAlarmRulesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `entityType` | `EntityType` | no | Entity type filter. If not specified, alarm rules for all supported entity types will be returned. | enum: `TENANT`, `CUSTOMER`, `USER`, `DASHBOARD`, `ASSET`, `DEVICE`, `ALARM`, `ENTITY_GROUP`, `CONVERTER`, `INTEGRATION`, `RULE_CHAIN`, `RULE_NODE`, `SCHEDULER_EVENT`, `BLOB_ENTITY`, `REPORT_TEMPLATE`, `REPORT`, `ENTITY_VIEW`, `WIDGETS_BUNDLE`, `WIDGET_TYPE`, `ROLE`, `GROUP_PERMISSION`, `TENANT_PROFILE`, `DEVICE_PROFILE`, `ASSET_PROFILE`, `API_USAGE_STATE`, `TB_RESOURCE`, `OTA_PACKAGE`, `EDGE`, `RPC`, `QUEUE`, `NOTIFICATION_TARGET`, `NOTIFICATION_TEMPLATE`, `NOTIFICATION_REQUEST`, `NOTIFICATION`, `NOTIFICATION_RULE`, `QUEUE_STATS`, `OAUTH2_CLIENT`, `DOMAIN`, `MOBILE_APP`, `MOBILE_APP_BUNDLE`, `CALCULATED_FIELD`, `JOB`, `SECRET`, `ADMIN_SETTINGS`, `AI_MODEL`, `API_KEY` |
| `entities` | `Set<UUID>` | no | Entities filter. If not specified, alarm rules for entity type filter will be returned. | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the calculated field name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataAlarmRuleDefinitionInfo`


## getAlarmRulesByEntityId

**GET** `/api/alarm/rules/{entityType}/{entityId}`

Get Alarm Rules by Entity Id (getAlarmRulesByEntityId)

Fetch the Alarm Rules based on the provided Entity Id.  Available for users with 'TENANT_ADMIN' authority.

```java
PageDataAlarmRuleDefinition getAlarmRulesByEntityId(GetAlarmRulesByEntityIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAlarmRulesByEntityIdArgs.builder()
        .entityType(String)
        .entityId(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetAlarmRulesByEntityIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `entityId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the calculated field name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataAlarmRuleDefinition`


## getLatestAlarmRuleDebugEvent

**GET** `/api/alarm/rule/{alarmRuleId}/debug`

Get latest alarm rule debug event (getLatestAlarmRuleDebugEvent)

Gets latest alarm rule debug event for specified alarm rule id. Referencing non-existing alarm rule id will cause an error.   Available for users with 'TENANT_ADMIN' authority.

```java
com.fasterxml.jackson.databind.JsonNode getLatestAlarmRuleDebugEvent(GetLatestAlarmRuleDebugEventArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetLatestAlarmRuleDebugEventArgs.builder()
        .alarmRuleId(String)
        .build()
```

### `GetLatestAlarmRuleDebugEventArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `alarmRuleId` | `String` | **yes** |  | |

### Return type

`com.fasterxml.jackson.databind.JsonNode`


## saveAlarmRule

**POST** `/api/alarm/rule`

Create Or Update Alarm Rule (saveAlarmRule)

Creates or Updates the Alarm Rule. When creating alarm rule, platform generates Alarm Rule Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Alarm Rule Id will be present in the response. Specify existing Alarm Rule Id to update the alarm rule. Referencing non-existing Alarm Rule Id will cause 'Not Found' error. Remove 'id', 'tenantId' from the request body example (below) to create new Alarm Rule entity.   Available for users with 'TENANT_ADMIN' authority.

```java
AlarmRuleDefinition saveAlarmRule(SaveAlarmRuleArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveAlarmRuleArgs.builder()
        .alarmRuleDefinition(AlarmRuleDefinition)
        .build()
```

### `SaveAlarmRuleArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `alarmRuleDefinition` | `AlarmRuleDefinition` | **yes** | A JSON value representing the alarm rule. | |

### Return type

`AlarmRuleDefinition`


## testAlarmRuleScript

**POST** `/api/alarm/rule/testScript`

Test alarm rule TBEL expression (testAlarmRuleScript)

Execute the alarm rule TBEL condition expression and return the result. Alarm rule expressions must return a boolean value. The format of request:   ```json {   \"expression\": \"return temperature > 50;\",   \"arguments\": {     \"temperature\": { \"type\": \"SINGLE_VALUE\", \"ts\": 1739776478057, \"value\": 55 }   } } ```   Expected result JSON contains \"output\" and \"error\".  Available for users with 'TENANT_ADMIN' authority.

```java
com.fasterxml.jackson.databind.JsonNode testAlarmRuleScript(TestAlarmRuleScriptArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
TestAlarmRuleScriptArgs.builder()
        .body(Object)
        .build()
```

### `TestAlarmRuleScriptArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `body` | `Object` | **yes** | Test alarm rule TBEL condition expression. The expression must return a boolean value. | |

### Return type

`com.fasterxml.jackson.databind.JsonNode`


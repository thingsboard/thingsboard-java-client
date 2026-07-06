# CalculatedFieldControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void deleteCalculatedField(DeleteCalculatedFieldArgs args) // Delete Calculated Field (deleteCalculatedField)
CalculatedField getCalculatedFieldById(GetCalculatedFieldByIdArgs args) // Get Calculated Field (getCalculatedFieldById)
PageDataString getCalculatedFieldNames(GetCalculatedFieldNamesArgs args) // Get calculated field names (getCalculatedFieldNames)
PageDataCalculatedFieldInfo getCalculatedFields(GetCalculatedFieldsArgs args) // Get calculated fields (getCalculatedFields)
PageDataCalculatedField getCalculatedFieldsByEntityId(GetCalculatedFieldsByEntityIdArgs args) // Get Calculated Fields by Entity Id (getCalculatedFieldsByEntityId)
Job getLastCalculatedFieldReprocessingJob(GetLastCalculatedFieldReprocessingJobArgs args) // getLastCalculatedFieldReprocessingJob
com.fasterxml.jackson.databind.JsonNode getLatestCalculatedFieldDebugEvent(GetLatestCalculatedFieldDebugEventArgs args) // Get latest calculated field debug event (getLatestCalculatedFieldDebugEvent)
Job reprocessCalculatedField(ReprocessCalculatedFieldArgs args) // Reprocess Calculated Field (reprocessCalculatedField)
void reprocessCalculatedFieldAndWait(ReprocessCalculatedFieldAndWaitArgs args) // Reprocess Calculated Field and wait for completion (reprocessCalculatedFieldAndWait)
CalculatedField saveCalculatedField(SaveCalculatedFieldArgs args) // Create Or Update Calculated Field (saveCalculatedField)
com.fasterxml.jackson.databind.JsonNode testCalculatedFieldScript(TestCalculatedFieldScriptArgs args) // Test Script expression
CfReprocessingValidationResult validateCalculatedFieldReprocessing(ValidateCalculatedFieldReprocessingArgs args) // Validate reprocessing capability of a calculated field (validateCalculatedFieldReprocessing)
```


## deleteCalculatedField

**DELETE** `/api/calculatedField/{calculatedFieldId}`

Delete Calculated Field (deleteCalculatedField)

Deletes the calculated field. Referencing non-existing Calculated Field Id will cause an error.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
void deleteCalculatedField(DeleteCalculatedFieldArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteCalculatedFieldArgs.builder()
        .calculatedFieldId(String)
        .build()
```

### `DeleteCalculatedFieldArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `calculatedFieldId` | `String` | **yes** |  | |

### Return type

null (empty response body)


## getCalculatedFieldById

**GET** `/api/calculatedField/{calculatedFieldId}`

Get Calculated Field (getCalculatedFieldById)

Fetch the Calculated Field object based on the provided Calculated Field Id.

```java
CalculatedField getCalculatedFieldById(GetCalculatedFieldByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetCalculatedFieldByIdArgs.builder()
        .calculatedFieldId(String)
        .build()
```

### `GetCalculatedFieldByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `calculatedFieldId` | `String` | **yes** |  | |

### Return type

`CalculatedField`


## getCalculatedFieldNames

**GET** `/api/calculatedFields/names`

Get calculated field names (getCalculatedFieldNames)

Fetch the list of calculated field names for specified type.

```java
PageDataString getCalculatedFieldNames(GetCalculatedFieldNamesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetCalculatedFieldNamesArgs.builder()
        .type(CalculatedFieldType)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetCalculatedFieldNamesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `type` | `CalculatedFieldType` | **yes** | Calculated field type filter. | enum: `SIMPLE`, `SCRIPT`, `GEOFENCING`, `ALARM`, `PROPAGATION`, `RELATED_ENTITIES_AGGREGATION`, `ENTITY_AGGREGATION` |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the calculated field name. | |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataString`


## getCalculatedFields

**GET** `/api/calculatedFields`

Get calculated fields (getCalculatedFields)

Fetch tenant calculated fields based on the filter.

```java
PageDataCalculatedFieldInfo getCalculatedFields(GetCalculatedFieldsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetCalculatedFieldsArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetCalculatedFieldsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `types` | `Set<CalculatedFieldType>` | no | Calculated field types filter. | |
| `entityType` | `EntityType` | no | Entity type filter. If not specified, calculated fields for all supported entity types will be returned. | enum: `TENANT`, `CUSTOMER`, `USER`, `DASHBOARD`, `ASSET`, `DEVICE`, `ALARM`, `ENTITY_GROUP`, `CONVERTER`, `INTEGRATION`, `RULE_CHAIN`, `RULE_NODE`, `SCHEDULER_EVENT`, `BLOB_ENTITY`, `REPORT_TEMPLATE`, `REPORT`, `ENTITY_VIEW`, `WIDGETS_BUNDLE`, `WIDGET_TYPE`, `ROLE`, `GROUP_PERMISSION`, `TENANT_PROFILE`, `DEVICE_PROFILE`, `ASSET_PROFILE`, `API_USAGE_STATE`, `TB_RESOURCE`, `OTA_PACKAGE`, `EDGE`, `RPC`, `QUEUE`, `NOTIFICATION_TARGET`, `NOTIFICATION_TEMPLATE`, `NOTIFICATION_REQUEST`, `NOTIFICATION`, `NOTIFICATION_RULE`, `QUEUE_STATS`, `OAUTH2_CLIENT`, `DOMAIN`, `MOBILE_APP`, `MOBILE_APP_BUNDLE`, `CALCULATED_FIELD`, `JOB`, `SECRET`, `ADMIN_SETTINGS`, `AI_MODEL`, `API_KEY` |
| `entities` | `Set<UUID>` | no | Entities filter. If not specified, calculated fields for entity type filter will be returned. | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the calculated field name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |
| `name` | `List<String>` | no | Repeatable name query parameter | |

### Return type

`PageDataCalculatedFieldInfo`


## getCalculatedFieldsByEntityId

**GET** `/api/calculatedField/{entityType}/{entityId}`

Get Calculated Fields by Entity Id (getCalculatedFieldsByEntityId)

Fetch the Calculated Fields based on the provided Entity Id.

```java
PageDataCalculatedField getCalculatedFieldsByEntityId(GetCalculatedFieldsByEntityIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetCalculatedFieldsByEntityIdArgs.builder()
        .entityType(String)
        .entityId(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetCalculatedFieldsByEntityIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `entityId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `type` | `CalculatedFieldType` | no | Calculated field type. If not specified, all types will be returned. | enum: `SIMPLE`, `SCRIPT`, `GEOFENCING`, `ALARM`, `PROPAGATION`, `RELATED_ENTITIES_AGGREGATION`, `ENTITY_AGGREGATION` |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the calculated field name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataCalculatedField`


## getLastCalculatedFieldReprocessingJob

**GET** `/api/calculatedField/{calculatedFieldId}/reprocess/job`

getLastCalculatedFieldReprocessingJob

```java
Job getLastCalculatedFieldReprocessingJob(GetLastCalculatedFieldReprocessingJobArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetLastCalculatedFieldReprocessingJobArgs.builder()
        .calculatedFieldId(UUID)
        .build()
```

### `GetLastCalculatedFieldReprocessingJobArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `calculatedFieldId` | `UUID` | **yes** |  | |

### Return type

`Job`


## getLatestCalculatedFieldDebugEvent

**GET** `/api/calculatedField/{calculatedFieldId}/debug`

Get latest calculated field debug event (getLatestCalculatedFieldDebugEvent)

Gets latest calculated field debug event for specified calculated field id. Referencing non-existing calculated field id will cause an error.   Available for users with 'TENANT_ADMIN' authority.

```java
com.fasterxml.jackson.databind.JsonNode getLatestCalculatedFieldDebugEvent(GetLatestCalculatedFieldDebugEventArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetLatestCalculatedFieldDebugEventArgs.builder()
        .calculatedFieldId(String)
        .build()
```

### `GetLatestCalculatedFieldDebugEventArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `calculatedFieldId` | `String` | **yes** |  | |

### Return type

`com.fasterxml.jackson.databind.JsonNode`


## reprocessCalculatedField

**GET** `/api/calculatedField/{calculatedFieldId}/reprocess`

Reprocess Calculated Field (reprocessCalculatedField)

Reprocesses the calculated field.  Available for users with 'TENANT_ADMIN' authority.

```java
Job reprocessCalculatedField(ReprocessCalculatedFieldArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ReprocessCalculatedFieldArgs.builder()
        .calculatedFieldId(String)
        .startTs(Long)
        .endTs(Long)
        .build()
```

### `ReprocessCalculatedFieldArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `calculatedFieldId` | `String` | **yes** |  | |
| `startTs` | `Long` | **yes** |  | |
| `endTs` | `Long` | **yes** |  | |

### Return type

`Job`


## reprocessCalculatedFieldAndWait

**GET** `/api/calculatedField/{calculatedFieldId}/reprocessAndWait`

Reprocess Calculated Field and wait for completion (reprocessCalculatedFieldAndWait)

Reprocesses the calculated field and waits until the job completes or fails.  Available for users with 'TENANT_ADMIN' authority.

```java
void reprocessCalculatedFieldAndWait(ReprocessCalculatedFieldAndWaitArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ReprocessCalculatedFieldAndWaitArgs.builder()
        .calculatedFieldId(String)
        .startTs(Long)
        .endTs(Long)
        .build()
```

### `ReprocessCalculatedFieldAndWaitArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `calculatedFieldId` | `String` | **yes** |  | |
| `startTs` | `Long` | **yes** |  | |
| `endTs` | `Long` | **yes** |  | |

### Return type

null (empty response body)


## saveCalculatedField

**POST** `/api/calculatedField`

Create Or Update Calculated Field (saveCalculatedField)

Creates or Updates the Calculated Field. When creating calculated field, platform generates Calculated Field Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Calculated Field Id will be present in the response. Specify existing Calculated Field Id to update the calculated field. Referencing non-existing Calculated Field Id will cause 'Not Found' error. Remove 'id', 'tenantId' from the request body example (below) to create new Calculated Field entity.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
CalculatedField saveCalculatedField(SaveCalculatedFieldArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveCalculatedFieldArgs.builder()
        .calculatedField(CalculatedField)
        .build()
```

### `SaveCalculatedFieldArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `calculatedField` | `CalculatedField` | **yes** | A JSON value representing the calculated field. | |

### Return type

`CalculatedField`


## testCalculatedFieldScript

**POST** `/api/calculatedField/testScript`

Test Script expression

Execute the Script expression and return the result. The format of request:   ```json {   \"expression\": \"var temp = 0; foreach(element: temperature.values) {temp += element.value;} var avgTemperature = temp / temperature.values.size(); var adjustedTemperature = avgTemperature + 0.1 * humidity.value; return {\\\"adjustedTemperature\\\": adjustedTemperature};\",   \"arguments\": {     \"temperature\": {       \"type\": \"TS_ROLLING\",       \"timeWindow\": {         \"startTs\": 1739775630002,         \"endTs\": 65432211,         \"limit\": 5       },       \"values\": [         { \"ts\": 1739775639851, \"value\": 23 },         { \"ts\": 1739775664561, \"value\": 43 },         { \"ts\": 1739775713079, \"value\": 15 },         { \"ts\": 1739775999522, \"value\": 34 },         { \"ts\": 1739776228452, \"value\": 22 }       ]     },     \"humidity\": { \"type\": \"SINGLE_VALUE\", \"ts\": 1739776478057, \"value\": 23 }   } } ```   Expected result JSON contains \"output\" and \"error\".  Available for users with 'TENANT_ADMIN' authority.

```java
com.fasterxml.jackson.databind.JsonNode testCalculatedFieldScript(TestCalculatedFieldScriptArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
TestCalculatedFieldScriptArgs.builder()
        .body(Object)
        .build()
```

### `TestCalculatedFieldScriptArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `body` | `Object` | **yes** | Test calculated field TBEL expression. | |

### Return type

`com.fasterxml.jackson.databind.JsonNode`


## validateCalculatedFieldReprocessing

**GET** `/api/calculatedField/{calculatedFieldId}/reprocess/validate`

Validate reprocessing capability of a calculated field (validateCalculatedFieldReprocessing)

Checks whether the specified calculated field can be reprocessed. Returns a validation result indicating if reprocessing is allowed and, if not, provides a reason.   Available for users with 'TENANT_ADMIN' authority.

```java
CfReprocessingValidationResult validateCalculatedFieldReprocessing(ValidateCalculatedFieldReprocessingArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ValidateCalculatedFieldReprocessingArgs.builder()
        .calculatedFieldId(String)
        .build()
```

### `ValidateCalculatedFieldReprocessingArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `calculatedFieldId` | `String` | **yes** |  | |

### Return type

`CfReprocessingValidationResult`


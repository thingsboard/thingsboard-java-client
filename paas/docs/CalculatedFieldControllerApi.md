# CalculatedFieldControllerApi

`ThingsboardClient` methods:

```
void deleteCalculatedField(@Nonnull String calculatedFieldId) // Delete Calculated Field (deleteCalculatedField)
CalculatedField getCalculatedFieldById(@Nonnull String calculatedFieldId) // Get Calculated Field (getCalculatedFieldById)
PageDataString getCalculatedFieldNames(@Nonnull CalculatedFieldType type, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortOrder) // Get calculated field names (getCalculatedFieldNames)
PageDataCalculatedFieldInfo getCalculatedFields(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable Set<CalculatedFieldType> types, @Nullable EntityType entityType, @Nullable Set<UUID> entities, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder, @Nullable List<String> name) // Get calculated fields (getCalculatedFields)
PageDataCalculatedField getCalculatedFieldsByEntityId(@Nonnull String entityType, @Nonnull String entityId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable CalculatedFieldType type, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get Calculated Fields by Entity Id (getCalculatedFieldsByEntityId)
Job getLastCalculatedFieldReprocessingJob(@Nonnull UUID calculatedFieldId) // getLastCalculatedFieldReprocessingJob
com.fasterxml.jackson.databind.JsonNode getLatestCalculatedFieldDebugEvent(@Nonnull String calculatedFieldId) // Get latest calculated field debug event (getLatestCalculatedFieldDebugEvent)
Job reprocessCalculatedField(@Nonnull String calculatedFieldId, @Nonnull Long startTs, @Nonnull Long endTs) // Reprocess Calculated Field (reprocessCalculatedField)
void reprocessCalculatedFieldAndWait(@Nonnull String calculatedFieldId, @Nonnull Long startTs, @Nonnull Long endTs) // Reprocess Calculated Field and wait for completion (reprocessCalculatedFieldAndWait)
CalculatedField saveCalculatedField(@Nonnull CalculatedField calculatedField) // Create Or Update Calculated Field (saveCalculatedField)
com.fasterxml.jackson.databind.JsonNode testCalculatedFieldScript(@Nonnull Object body) // Test Script expression
CfReprocessingValidationResult validateCalculatedFieldReprocessing(@Nonnull String calculatedFieldId) // Validate reprocessing capability of a calculated field (validateCalculatedFieldReprocessing)
```


## deleteCalculatedField

```
void deleteCalculatedField(@Nonnull String calculatedFieldId)
```

**DELETE** `/api/calculatedField/{calculatedFieldId}`

Delete Calculated Field (deleteCalculatedField)

Deletes the calculated field. Referencing non-existing Calculated Field Id will cause an error.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **calculatedFieldId** | **String** |  | |

### Return type

null (empty response body)


## getCalculatedFieldById

```
CalculatedField getCalculatedFieldById(@Nonnull String calculatedFieldId)
```

**GET** `/api/calculatedField/{calculatedFieldId}`

Get Calculated Field (getCalculatedFieldById)

Fetch the Calculated Field object based on the provided Calculated Field Id.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **calculatedFieldId** | **String** |  | |

### Return type

**CalculatedField**


## getCalculatedFieldNames

```
PageDataString getCalculatedFieldNames(@Nonnull CalculatedFieldType type, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortOrder)
```

**GET** `/api/calculatedFields/names`

Get calculated field names (getCalculatedFieldNames)

Fetch the list of calculated field names for specified type.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **CalculatedFieldType** | Calculated field type filter. | [enum: SIMPLE, SCRIPT, GEOFENCING, ALARM, PROPAGATION, RELATED_ENTITIES_AGGREGATION, ENTITY_AGGREGATION] |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the calculated field name. | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataString**


## getCalculatedFields

```
PageDataCalculatedFieldInfo getCalculatedFields(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable Set<CalculatedFieldType> types, @Nullable EntityType entityType, @Nullable Set<UUID> entities, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder, @Nullable List<String> name)
```

**GET** `/api/calculatedFields`

Get calculated fields (getCalculatedFields)

Fetch tenant calculated fields based on the filter.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **types** | **Set<CalculatedFieldType>** | Calculated field types filter. | [optional] |
| **entityType** | **EntityType** | Entity type filter. If not specified, calculated fields for all supported entity types will be returned. | [optional] [enum: TENANT, CUSTOMER, USER, DASHBOARD, ASSET, DEVICE, ALARM, ENTITY_GROUP, CONVERTER, INTEGRATION, RULE_CHAIN, RULE_NODE, SCHEDULER_EVENT, BLOB_ENTITY, REPORT_TEMPLATE, REPORT, ENTITY_VIEW, WIDGETS_BUNDLE, WIDGET_TYPE, ROLE, GROUP_PERMISSION, TENANT_PROFILE, DEVICE_PROFILE, ASSET_PROFILE, API_USAGE_STATE, TB_RESOURCE, OTA_PACKAGE, EDGE, RPC, QUEUE, NOTIFICATION_TARGET, NOTIFICATION_TEMPLATE, NOTIFICATION_REQUEST, NOTIFICATION, NOTIFICATION_RULE, QUEUE_STATS, OAUTH2_CLIENT, DOMAIN, MOBILE_APP, MOBILE_APP_BUNDLE, CALCULATED_FIELD, JOB, SECRET, ADMIN_SETTINGS, AI_MODEL, API_KEY, BILLING_CUSTOMER, SUBSCRIPTION_PLAN, SUBSCRIPTION, COUPON, PRODUCT, SUBSCRIPTION_ADDON] |
| **entities** | **Set<UUID>** | Entities filter. If not specified, calculated fields for entity type filter will be returned. | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the calculated field name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **name** | **List<String>** | Repeatable name query parameter | [optional] |

### Return type

**PageDataCalculatedFieldInfo**


## getCalculatedFieldsByEntityId

```
PageDataCalculatedField getCalculatedFieldsByEntityId(@Nonnull String entityType, @Nonnull String entityId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable CalculatedFieldType type, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/calculatedField/{entityType}/{entityId}`

Get Calculated Fields by Entity Id (getCalculatedFieldsByEntityId)

Fetch the Calculated Fields based on the provided Entity Id.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **entityId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **type** | **CalculatedFieldType** | Calculated field type. If not specified, all types will be returned. | [optional] [enum: SIMPLE, SCRIPT, GEOFENCING, ALARM, PROPAGATION, RELATED_ENTITIES_AGGREGATION, ENTITY_AGGREGATION] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the calculated field name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataCalculatedField**


## getLastCalculatedFieldReprocessingJob

```
Job getLastCalculatedFieldReprocessingJob(@Nonnull UUID calculatedFieldId)
```

**GET** `/api/calculatedField/{calculatedFieldId}/reprocess/job`

getLastCalculatedFieldReprocessingJob


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **calculatedFieldId** | **UUID** |  | |

### Return type

**Job**


## getLatestCalculatedFieldDebugEvent

```
com.fasterxml.jackson.databind.JsonNode getLatestCalculatedFieldDebugEvent(@Nonnull String calculatedFieldId)
```

**GET** `/api/calculatedField/{calculatedFieldId}/debug`

Get latest calculated field debug event (getLatestCalculatedFieldDebugEvent)

Gets latest calculated field debug event for specified calculated field id. Referencing non-existing calculated field id will cause an error.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **calculatedFieldId** | **String** |  | |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## reprocessCalculatedField

```
Job reprocessCalculatedField(@Nonnull String calculatedFieldId, @Nonnull Long startTs, @Nonnull Long endTs)
```

**GET** `/api/calculatedField/{calculatedFieldId}/reprocess`

Reprocess Calculated Field (reprocessCalculatedField)

Reprocesses the calculated field.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **calculatedFieldId** | **String** |  | |
| **startTs** | **Long** |  | |
| **endTs** | **Long** |  | |

### Return type

**Job**


## reprocessCalculatedFieldAndWait

```
void reprocessCalculatedFieldAndWait(@Nonnull String calculatedFieldId, @Nonnull Long startTs, @Nonnull Long endTs)
```

**GET** `/api/calculatedField/{calculatedFieldId}/reprocessAndWait`

Reprocess Calculated Field and wait for completion (reprocessCalculatedFieldAndWait)

Reprocesses the calculated field and waits until the job completes or fails.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **calculatedFieldId** | **String** |  | |
| **startTs** | **Long** |  | |
| **endTs** | **Long** |  | |

### Return type

null (empty response body)


## saveCalculatedField

```
CalculatedField saveCalculatedField(@Nonnull CalculatedField calculatedField)
```

**POST** `/api/calculatedField`

Create Or Update Calculated Field (saveCalculatedField)

Creates or Updates the Calculated Field. When creating calculated field, platform generates Calculated Field Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Calculated Field Id will be present in the response. Specify existing Calculated Field Id to update the calculated field. Referencing non-existing Calculated Field Id will cause 'Not Found' error. Remove 'id', 'tenantId' from the request body example (below) to create new Calculated Field entity.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **calculatedField** | **CalculatedField** | A JSON value representing the calculated field. | |

### Return type

**CalculatedField**


## testCalculatedFieldScript

```
com.fasterxml.jackson.databind.JsonNode testCalculatedFieldScript(@Nonnull Object body)
```

**POST** `/api/calculatedField/testScript`

Test Script expression

Execute the Script expression and return the result. The format of request:   ```json {   \"expression\": \"var temp = 0; foreach(element: temperature.values) {temp += element.value;} var avgTemperature = temp / temperature.values.size(); var adjustedTemperature = avgTemperature + 0.1 * humidity.value; return {\\\"adjustedTemperature\\\": adjustedTemperature};\",   \"arguments\": {     \"temperature\": {       \"type\": \"TS_ROLLING\",       \"timeWindow\": {         \"startTs\": 1739775630002,         \"endTs\": 65432211,         \"limit\": 5       },       \"values\": [         { \"ts\": 1739775639851, \"value\": 23 },         { \"ts\": 1739775664561, \"value\": 43 },         { \"ts\": 1739775713079, \"value\": 15 },         { \"ts\": 1739775999522, \"value\": 34 },         { \"ts\": 1739776228452, \"value\": 22 }       ]     },     \"humidity\": { \"type\": \"SINGLE_VALUE\", \"ts\": 1739776478057, \"value\": 23 }   } } ```   Expected result JSON contains \"output\" and \"error\".  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object** | Test calculated field TBEL expression. | |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## validateCalculatedFieldReprocessing

```
CfReprocessingValidationResult validateCalculatedFieldReprocessing(@Nonnull String calculatedFieldId)
```

**GET** `/api/calculatedField/{calculatedFieldId}/reprocess/validate`

Validate reprocessing capability of a calculated field (validateCalculatedFieldReprocessing)

Checks whether the specified calculated field can be reprocessed. Returns a validation result indicating if reprocessing is allowed and, if not, provides a reason.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **calculatedFieldId** | **String** |  | |

### Return type

**CfReprocessingValidationResult**


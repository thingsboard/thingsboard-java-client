# CalculatedFieldControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteCalculatedField**](#deleteCalculatedField) | **DELETE** /api/calculatedField/{calculatedFieldId} | Delete Calculated Field (deleteCalculatedField) |
| [**getCalculatedFieldById**](#getCalculatedFieldById) | **GET** /api/calculatedField/{calculatedFieldId} | Get Calculated Field (getCalculatedFieldById) |
| [**getCalculatedFieldNames**](#getCalculatedFieldNames) | **GET** /api/calculatedFields/names | Get calculated field names (getCalculatedFieldNames) |
| [**getCalculatedFields**](#getCalculatedFields) | **GET** /api/calculatedFields | Get calculated fields (getCalculatedFields) |
| [**getCalculatedFieldsByEntityIdV2**](#getCalculatedFieldsByEntityIdV2) | **GET** /api/calculatedField/{entityType}/{entityId} | Get Calculated Fields by Entity Id (getCalculatedFieldsByEntityIdV2) |
| [**getLastCalculatedFieldReprocessingJob**](#getLastCalculatedFieldReprocessingJob) | **GET** /api/calculatedField/{calculatedFieldId}/reprocess/job | getLastCalculatedFieldReprocessingJob |
| [**getLatestCalculatedFieldDebugEvent**](#getLatestCalculatedFieldDebugEvent) | **GET** /api/calculatedField/{calculatedFieldId}/debug | Get latest calculated field debug event (getLatestCalculatedFieldDebugEvent) |
| [**reprocessCalculatedField**](#reprocessCalculatedField) | **GET** /api/calculatedField/{calculatedFieldId}/reprocess | Reprocess Calculated Field (reprocessCalculatedField) |
| [**reprocessCalculatedFieldAndWait**](#reprocessCalculatedFieldAndWait) | **GET** /api/calculatedField/{calculatedFieldId}/reprocessAndWait | Reprocess Calculated Field and wait for completion (reprocessCalculatedFieldAndWait) |
| [**saveCalculatedField**](#saveCalculatedField) | **POST** /api/calculatedField | Create Or Update Calculated Field (saveCalculatedField) |
| [**testScript1**](#testScript1) | **POST** /api/calculatedField/testScript | Test Script expression |
| [**validateCalculatedFieldReprocessing**](#validateCalculatedFieldReprocessing) | **GET** /api/calculatedField/{calculatedFieldId}/reprocess/validate | Validate reprocessing capability of a calculated field (validateCalculatedFieldReprocessing) |



## deleteCalculatedField

> deleteCalculatedField(calculatedFieldId)

Delete Calculated Field (deleteCalculatedField)

Deletes the calculated field. Referencing non-existing Calculated Field Id will cause an error.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **calculatedFieldId** | **String** |  | |

### Return type

null (empty response body)


## getCalculatedFieldById

> CalculatedField getCalculatedFieldById(calculatedFieldId)

Get Calculated Field (getCalculatedFieldById)

Fetch the Calculated Field object based on the provided Calculated Field Id.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **calculatedFieldId** | **String** |  | |

### Return type

**CalculatedField**


## getCalculatedFieldNames

> PageDataString getCalculatedFieldNames(type, pageSize, page, textSearch, sortOrder)

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

> PageDataCalculatedFieldInfo getCalculatedFields(pageSize, page, types, entityType, entities, textSearch, sortProperty, sortOrder, name)

Get calculated fields (getCalculatedFields)

Fetch tenant calculated fields based on the filter.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **types** | **Set<CalculatedFieldType>** | Calculated field types filter. | [optional] |
| **entityType** | **EntityType** | Entity type filter. If not specified, calculated fields for all supported entity types will be returned. | [optional] [enum: TENANT, CUSTOMER, USER, DASHBOARD, ASSET, DEVICE, ALARM, ENTITY_GROUP, CONVERTER, INTEGRATION, RULE_CHAIN, RULE_NODE, SCHEDULER_EVENT, BLOB_ENTITY, REPORT_TEMPLATE, REPORT, ENTITY_VIEW, WIDGETS_BUNDLE, WIDGET_TYPE, ROLE, GROUP_PERMISSION, TENANT_PROFILE, DEVICE_PROFILE, ASSET_PROFILE, API_USAGE_STATE, TB_RESOURCE, OTA_PACKAGE, EDGE, RPC, QUEUE, NOTIFICATION_TARGET, NOTIFICATION_TEMPLATE, NOTIFICATION_REQUEST, NOTIFICATION, NOTIFICATION_RULE, QUEUE_STATS, OAUTH2_CLIENT, DOMAIN, MOBILE_APP, MOBILE_APP_BUNDLE, CALCULATED_FIELD, JOB, SECRET, ADMIN_SETTINGS, AI_MODEL, API_KEY] |
| **entities** | **Set<UUID>** | Entities filter. If not specified, calculated fields for entity type filter will be returned. | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the calculated field name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **name** | **List<String>** | Repeatable name query parameter | [optional] |

### Return type

**PageDataCalculatedFieldInfo**


## getCalculatedFieldsByEntityIdV2

> PageDataCalculatedField getCalculatedFieldsByEntityIdV2(entityType, entityId, pageSize, page, type, textSearch, sortProperty, sortOrder)

Get Calculated Fields by Entity Id (getCalculatedFieldsByEntityIdV2)

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

> Job getLastCalculatedFieldReprocessingJob(calculatedFieldId)

getLastCalculatedFieldReprocessingJob


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **calculatedFieldId** | **UUID** |  | |

### Return type

**Job**


## getLatestCalculatedFieldDebugEvent

> com.fasterxml.jackson.databind.JsonNode getLatestCalculatedFieldDebugEvent(calculatedFieldId)

Get latest calculated field debug event (getLatestCalculatedFieldDebugEvent)

Gets latest calculated field debug event for specified calculated field id. Referencing non-existing calculated field id will cause an error.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **calculatedFieldId** | **String** |  | |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## reprocessCalculatedField

> Job reprocessCalculatedField(calculatedFieldId, startTs, endTs)

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

> reprocessCalculatedFieldAndWait(calculatedFieldId, startTs, endTs)

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

> CalculatedField saveCalculatedField(calculatedField)

Create Or Update Calculated Field (saveCalculatedField)

Creates or Updates the Calculated Field. When creating calculated field, platform generates Calculated Field Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Calculated Field Id will be present in the response. Specify existing Calculated Field Id to update the calculated field. Referencing non-existing Calculated Field Id will cause 'Not Found' error. Remove 'id', 'tenantId' from the request body example (below) to create new Calculated Field entity.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **calculatedField** | **CalculatedField** | A JSON value representing the calculated field. | |

### Return type

**CalculatedField**


## testScript1

> com.fasterxml.jackson.databind.JsonNode testScript1(body)

Test Script expression

Execute the Script expression and return the result. The format of request:   ```json {   \"expression\": \"var temp = 0; foreach(element: temperature.values) {temp += element.value;} var avgTemperature = temp / temperature.values.size(); var adjustedTemperature = avgTemperature + 0.1 * humidity.value; return {\\\"adjustedTemperature\\\": adjustedTemperature};\",   \"arguments\": {     \"temperature\": {       \"type\": \"TS_ROLLING\",       \"timeWindow\": {         \"startTs\": 1739775630002,         \"endTs\": 65432211,         \"limit\": 5       },       \"values\": [         { \"ts\": 1739775639851, \"value\": 23 },         { \"ts\": 1739775664561, \"value\": 43 },         { \"ts\": 1739775713079, \"value\": 15 },         { \"ts\": 1739775999522, \"value\": 34 },         { \"ts\": 1739776228452, \"value\": 22 }       ]     },     \"humidity\": { \"type\": \"SINGLE_VALUE\", \"ts\": 1739776478057, \"value\": 23 }   } } ```   Expected result JSON contains \"output\" and \"error\".  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object** | Test calculated field TBEL expression. | |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## validateCalculatedFieldReprocessing

> CfReprocessingValidationResult validateCalculatedFieldReprocessing(calculatedFieldId)

Validate reprocessing capability of a calculated field (validateCalculatedFieldReprocessing)

Checks whether the specified calculated field can be reprocessed. Returns a validation result indicating if reprocessing is allowed and, if not, provides a reason.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **calculatedFieldId** | **String** |  | |

### Return type

**CfReprocessingValidationResult**


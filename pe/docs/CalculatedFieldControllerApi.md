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

Deletes the calculated field. Referencing non-existing Calculated Field Id will cause an error.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **calculatedFieldId** | **String** |  | |


## getCalculatedFieldById

> CalculatedField getCalculatedFieldById(calculatedFieldId)

Get Calculated Field (getCalculatedFieldById)

Fetch the Calculated Field object based on the provided Calculated Field Id.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **calculatedFieldId** | **String** |  | |


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
| **textSearch** | **String** | The case insensitive &#39;substring&#39; filter based on the calculated field name. | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |


## getCalculatedFields

> PageDataCalculatedFieldInfo getCalculatedFields(pageSize, page, types, entityType, entities, textSearch, sortProperty, sortOrder, name)

Get calculated fields (getCalculatedFields)

Fetch tenant calculated fields based on the filter.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **types** | **Set&lt;CalculatedFieldType&gt;** | Calculated field types filter. | [optional] |
| **entityType** | **EntityType** | Entity type filter. If not specified, calculated fields for all supported entity types will be returned. | [optional] [enum: TENANT, CUSTOMER, USER, DASHBOARD, ASSET, DEVICE, ALARM, ENTITY_GROUP, CONVERTER, INTEGRATION, RULE_CHAIN, RULE_NODE, SCHEDULER_EVENT, BLOB_ENTITY, REPORT_TEMPLATE, REPORT, ENTITY_VIEW, WIDGETS_BUNDLE, WIDGET_TYPE, ROLE, GROUP_PERMISSION, TENANT_PROFILE, DEVICE_PROFILE, ASSET_PROFILE, API_USAGE_STATE, TB_RESOURCE, OTA_PACKAGE, EDGE, RPC, QUEUE, NOTIFICATION_TARGET, NOTIFICATION_TEMPLATE, NOTIFICATION_REQUEST, NOTIFICATION, NOTIFICATION_RULE, QUEUE_STATS, OAUTH2_CLIENT, DOMAIN, MOBILE_APP, MOBILE_APP_BUNDLE, CALCULATED_FIELD, JOB, SECRET, ADMIN_SETTINGS, AI_MODEL, API_KEY] |
| **entities** | **Set&lt;UUID&gt;** | Entities filter. If not specified, calculated fields for entity type filter will be returned. | [optional] |
| **textSearch** | **String** | The case insensitive &#39;substring&#39; filter based on the calculated field name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **name** | **List&lt;String&gt;** | Repeatable name query parameter | [optional] |


## getCalculatedFieldsByEntityIdV2

> PageDataCalculatedField getCalculatedFieldsByEntityIdV2(entityType, entityId, pageSize, page, type, textSearch, sortProperty, sortOrder)

Get Calculated Fields by Entity Id (getCalculatedFieldsByEntityIdV2)

Fetch the Calculated Fields based on the provided Entity Id.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **entityId** | **String** | A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **type** | **CalculatedFieldType** | Calculated field type. If not specified, all types will be returned. | [optional] [enum: SIMPLE, SCRIPT, GEOFENCING, ALARM, PROPAGATION, RELATED_ENTITIES_AGGREGATION, ENTITY_AGGREGATION] |
| **textSearch** | **String** | The case insensitive &#39;substring&#39; filter based on the calculated field name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |


## getLastCalculatedFieldReprocessingJob

> Job getLastCalculatedFieldReprocessingJob(calculatedFieldId)

getLastCalculatedFieldReprocessingJob

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **calculatedFieldId** | **UUID** |  | |


## getLatestCalculatedFieldDebugEvent

> com.fasterxml.jackson.databind.JsonNode getLatestCalculatedFieldDebugEvent(calculatedFieldId)

Get latest calculated field debug event (getLatestCalculatedFieldDebugEvent)

Gets latest calculated field debug event for specified calculated field id. Referencing non-existing calculated field id will cause an error.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **calculatedFieldId** | **String** |  | |


## reprocessCalculatedField

> Job reprocessCalculatedField(calculatedFieldId, startTs, endTs)

Reprocess Calculated Field (reprocessCalculatedField)

Reprocesses the calculated field.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **calculatedFieldId** | **String** |  | |
| **startTs** | **Long** |  | |
| **endTs** | **Long** |  | |


## reprocessCalculatedFieldAndWait

> reprocessCalculatedFieldAndWait(calculatedFieldId, startTs, endTs)

Reprocess Calculated Field and wait for completion (reprocessCalculatedFieldAndWait)

Reprocesses the calculated field and waits until the job completes or fails.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **calculatedFieldId** | **String** |  | |
| **startTs** | **Long** |  | |
| **endTs** | **Long** |  | |


## saveCalculatedField

> CalculatedField saveCalculatedField(calculatedField)

Create Or Update Calculated Field (saveCalculatedField)

Creates or Updates the Calculated Field. When creating calculated field, platform generates Calculated Field Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Calculated Field Id will be present in the response. Specify existing Calculated Field Id to update the calculated field. Referencing non-existing Calculated Field Id will cause &#39;Not Found&#39; error. Remove &#39;id&#39;, &#39;tenantId&#39; from the request body example (below) to create new Calculated Field entity.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **calculatedField** | **CalculatedField** | A JSON value representing the calculated field. | |


## testScript1

> com.fasterxml.jackson.databind.JsonNode testScript1(body)

Test Script expression

Execute the Script expression and return the result. The format of request:   &#x60;&#x60;&#x60;json {   \&quot;expression\&quot;: \&quot;var temp &#x3D; 0; foreach(element: temperature.values) {temp +&#x3D; element.value;} var avgTemperature &#x3D; temp / temperature.values.size(); var adjustedTemperature &#x3D; avgTemperature + 0.1 * humidity.value; return {\\\&quot;adjustedTemperature\\\&quot;: adjustedTemperature};\&quot;,   \&quot;arguments\&quot;: {     \&quot;temperature\&quot;: {       \&quot;type\&quot;: \&quot;TS_ROLLING\&quot;,       \&quot;timeWindow\&quot;: {         \&quot;startTs\&quot;: 1739775630002,         \&quot;endTs\&quot;: 65432211,         \&quot;limit\&quot;: 5       },       \&quot;values\&quot;: [         { \&quot;ts\&quot;: 1739775639851, \&quot;value\&quot;: 23 },         { \&quot;ts\&quot;: 1739775664561, \&quot;value\&quot;: 43 },         { \&quot;ts\&quot;: 1739775713079, \&quot;value\&quot;: 15 },         { \&quot;ts\&quot;: 1739775999522, \&quot;value\&quot;: 34 },         { \&quot;ts\&quot;: 1739776228452, \&quot;value\&quot;: 22 }       ]     },     \&quot;humidity\&quot;: { \&quot;type\&quot;: \&quot;SINGLE_VALUE\&quot;, \&quot;ts\&quot;: 1739776478057, \&quot;value\&quot;: 23 }   } } &#x60;&#x60;&#x60;   Expected result JSON contains \&quot;output\&quot; and \&quot;error\&quot;.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object** | Test calculated field TBEL expression. | |


## validateCalculatedFieldReprocessing

> CfReprocessingValidationResult validateCalculatedFieldReprocessing(calculatedFieldId)

Validate reprocessing capability of a calculated field (validateCalculatedFieldReprocessing)

Checks whether the specified calculated field can be reprocessed. Returns a validation result indicating if reprocessing is allowed and, if not, provides a reason.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **calculatedFieldId** | **String** |  | |


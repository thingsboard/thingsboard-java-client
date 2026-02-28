# CalculatedFieldControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteCalculatedField**](CalculatedFieldControllerApi.md#deleteCalculatedField) | **DELETE** /api/calculatedField/{calculatedFieldId} | Delete Calculated Field (deleteCalculatedField) |
| [**getCalculatedFieldById**](CalculatedFieldControllerApi.md#getCalculatedFieldById) | **GET** /api/calculatedField/{calculatedFieldId} | Get Calculated Field (getCalculatedFieldById) |
| [**getCalculatedFieldNames**](CalculatedFieldControllerApi.md#getCalculatedFieldNames) | **GET** /api/calculatedFields/names | Get calculated field names (getCalculatedFieldNames) |
| [**getCalculatedFields**](CalculatedFieldControllerApi.md#getCalculatedFields) | **GET** /api/calculatedFields | Get calculated fields (getCalculatedFields) |
| [**getCalculatedFieldsByEntityIdV2**](CalculatedFieldControllerApi.md#getCalculatedFieldsByEntityIdV2) | **GET** /api/calculatedField/{entityType}/{entityId} | Get Calculated Fields by Entity Id (getCalculatedFieldsByEntityIdV2) |
| [**getLatestCalculatedFieldDebugEvent**](CalculatedFieldControllerApi.md#getLatestCalculatedFieldDebugEvent) | **GET** /api/calculatedField/{calculatedFieldId}/debug | Get latest calculated field debug event (getLatestCalculatedFieldDebugEvent) |
| [**saveCalculatedField**](CalculatedFieldControllerApi.md#saveCalculatedField) | **POST** /api/calculatedField | Create Or Update Calculated Field (saveCalculatedField) |
| [**testScript1**](CalculatedFieldControllerApi.md#testScript1) | **POST** /api/calculatedField/testScript | Test Script expression |



## deleteCalculatedField

> deleteCalculatedField(calculatedFieldId)

Delete Calculated Field (deleteCalculatedField)

Deletes the calculated field. Referencing non-existing Calculated Field Id will cause an error.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **calculatedFieldId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getCalculatedFieldById

> CalculatedField getCalculatedFieldById(calculatedFieldId)

Get Calculated Field (getCalculatedFieldById)

Fetch the Calculated Field object based on the provided Calculated Field Id.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **calculatedFieldId** | **String**|  | |

### Return type

[**CalculatedField**](CalculatedField.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getCalculatedFieldNames

> PageDataString getCalculatedFieldNames(type, pageSize, page, textSearch, sortOrder)

Get calculated field names (getCalculatedFieldNames)

Fetch the list of calculated field names for specified type.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | [**CalculatedFieldType**](.md)| Calculated field type filter. | [enum: SIMPLE, SCRIPT, GEOFENCING, ALARM, PROPAGATION, RELATED_ENTITIES_AGGREGATION, ENTITY_AGGREGATION] |
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the calculated field name. | [optional] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataString**](PageDataString.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getCalculatedFields

> PageDataCalculatedFieldInfo getCalculatedFields(pageSize, page, types, entityType, entities, textSearch, sortProperty, sortOrder, name)

Get calculated fields (getCalculatedFields)

Fetch tenant calculated fields based on the filter.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **types** | [**Set&lt;CalculatedFieldType&gt;**](CalculatedFieldType.md)| Calculated field types filter. | [optional] |
| **entityType** | [**EntityType**](.md)| Entity type filter. If not specified, calculated fields for all supported entity types will be returned. | [optional] [enum: TENANT, CUSTOMER, USER, DASHBOARD, ASSET, DEVICE, ALARM, RULE_CHAIN, RULE_NODE, ENTITY_VIEW, WIDGETS_BUNDLE, WIDGET_TYPE, TENANT_PROFILE, DEVICE_PROFILE, ASSET_PROFILE, API_USAGE_STATE, TB_RESOURCE, OTA_PACKAGE, EDGE, RPC, QUEUE, NOTIFICATION_TARGET, NOTIFICATION_TEMPLATE, NOTIFICATION_REQUEST, NOTIFICATION, NOTIFICATION_RULE, QUEUE_STATS, OAUTH2_CLIENT, DOMAIN, MOBILE_APP, MOBILE_APP_BUNDLE, CALCULATED_FIELD, JOB, ADMIN_SETTINGS, AI_MODEL, API_KEY] |
| **entities** | [**Set&lt;UUID&gt;**](UUID.md)| Entities filter. If not specified, calculated fields for entity type filter will be returned. | [optional] |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the calculated field name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, name] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **name** | [**List&lt;String&gt;**](String.md)| Repeatable name query parameter | [optional] |

### Return type

[**PageDataCalculatedFieldInfo**](PageDataCalculatedFieldInfo.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getCalculatedFieldsByEntityIdV2

> PageDataCalculatedField getCalculatedFieldsByEntityIdV2(entityType, entityId, pageSize, page, type, textSearch, sortProperty, sortOrder)

Get Calculated Fields by Entity Id (getCalculatedFieldsByEntityIdV2)

Fetch the Calculated Fields based on the provided Entity Id.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String**| A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **entityId** | **String**| A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **type** | [**CalculatedFieldType**](.md)| Calculated field type. If not specified, all types will be returned. | [optional] [enum: SIMPLE, SCRIPT, GEOFENCING, ALARM, PROPAGATION, RELATED_ENTITIES_AGGREGATION, ENTITY_AGGREGATION] |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the calculated field name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, name] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataCalculatedField**](PageDataCalculatedField.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getLatestCalculatedFieldDebugEvent

> com.fasterxml.jackson.databind.JsonNode getLatestCalculatedFieldDebugEvent(calculatedFieldId)

Get latest calculated field debug event (getLatestCalculatedFieldDebugEvent)

Gets latest calculated field debug event for specified calculated field id. Referencing non-existing calculated field id will cause an error.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **calculatedFieldId** | **String**|  | |

### Return type

[**com.fasterxml.jackson.databind.JsonNode**](com.fasterxml.jackson.databind.JsonNode.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## saveCalculatedField

> CalculatedField saveCalculatedField(calculatedField)

Create Or Update Calculated Field (saveCalculatedField)

Creates or Updates the Calculated Field. When creating calculated field, platform generates Calculated Field Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Calculated Field Id will be present in the response. Specify existing Calculated Field Id to update the calculated field. Referencing non-existing Calculated Field Id will cause &#39;Not Found&#39; error. Remove &#39;id&#39;, &#39;tenantId&#39; from the request body example (below) to create new Calculated Field entity.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **calculatedField** | [**CalculatedField**](CalculatedField.md)| A JSON value representing the calculated field. | |

### Return type

[**CalculatedField**](CalculatedField.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## testScript1

> com.fasterxml.jackson.databind.JsonNode testScript1(body)

Test Script expression

Execute the Script expression and return the result. The format of request:   &#x60;&#x60;&#x60;json {   \&quot;expression\&quot;: \&quot;var temp &#x3D; 0; foreach(element: temperature.values) {temp +&#x3D; element.value;} var avgTemperature &#x3D; temp / temperature.values.size(); var adjustedTemperature &#x3D; avgTemperature + 0.1 * humidity.value; return {\\\&quot;adjustedTemperature\\\&quot;: adjustedTemperature};\&quot;,   \&quot;arguments\&quot;: {     \&quot;temperature\&quot;: {       \&quot;type\&quot;: \&quot;TS_ROLLING\&quot;,       \&quot;timeWindow\&quot;: {         \&quot;startTs\&quot;: 1739775630002,         \&quot;endTs\&quot;: 65432211,         \&quot;limit\&quot;: 5       },       \&quot;values\&quot;: [         { \&quot;ts\&quot;: 1739775639851, \&quot;value\&quot;: 23 },         { \&quot;ts\&quot;: 1739775664561, \&quot;value\&quot;: 43 },         { \&quot;ts\&quot;: 1739775713079, \&quot;value\&quot;: 15 },         { \&quot;ts\&quot;: 1739775999522, \&quot;value\&quot;: 34 },         { \&quot;ts\&quot;: 1739776228452, \&quot;value\&quot;: 22 }       ]     },     \&quot;humidity\&quot;: { \&quot;type\&quot;: \&quot;SINGLE_VALUE\&quot;, \&quot;ts\&quot;: 1739776478057, \&quot;value\&quot;: 23 }   } } &#x60;&#x60;&#x60;   Expected result JSON contains \&quot;output\&quot; and \&quot;error\&quot;.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object**| Test calculated field TBEL expression. | |

### Return type

[**com.fasterxml.jackson.databind.JsonNode**](com.fasterxml.jackson.databind.JsonNode.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


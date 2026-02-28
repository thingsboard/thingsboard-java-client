# WidgetTypeControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteWidgetType**](WidgetTypeControllerApi.md#deleteWidgetType) | **DELETE** /api/widgetType/{widgetTypeId} | Delete widget type (deleteWidgetType) |
| [**getBundleWidgetTypeFqns**](WidgetTypeControllerApi.md#getBundleWidgetTypeFqns) | **GET** /api/widgetTypeFqns | Get all Widget type fqns for specified Bundle (getBundleWidgetTypeFqns) |
| [**getBundleWidgetTypesDetails**](WidgetTypeControllerApi.md#getBundleWidgetTypesDetails) | **GET** /api/widgetTypesDetails | Get all Widget types details for specified Bundle (getBundleWidgetTypesDetails) |
| [**getBundleWidgetTypesInfos**](WidgetTypeControllerApi.md#getBundleWidgetTypesInfos) | **GET** /api/widgetTypesInfos | Get Widget Type Info objects (getBundleWidgetTypesInfos) |
| [**getBundleWidgetTypesV2**](WidgetTypeControllerApi.md#getBundleWidgetTypesV2) | **GET** /api/widgetsBundles/{widgetsBundleId}/widgetTypes | Get all Widget types for specified Bundle (getBundleWidgetTypes) |
| [**getWidgetType**](WidgetTypeControllerApi.md#getWidgetType) | **GET** /api/widgetType | Get Widget Type (getWidgetType) |
| [**getWidgetTypeById**](WidgetTypeControllerApi.md#getWidgetTypeById) | **GET** /api/widgetType/{widgetTypeId} | Get Widget Type Details (getWidgetTypeById) |
| [**getWidgetTypeInfoById**](WidgetTypeControllerApi.md#getWidgetTypeInfoById) | **GET** /api/widgetTypeInfo/{widgetTypeId} | Get Widget Type Info (getWidgetTypeInfoById) |
| [**getWidgetTypes**](WidgetTypeControllerApi.md#getWidgetTypes) | **GET** /api/widgetTypes | Get Widget Types (getWidgetTypes) |
| [**saveWidgetType**](WidgetTypeControllerApi.md#saveWidgetType) | **POST** /api/widgetType | Create Or Update Widget Type (saveWidgetType) |



## deleteWidgetType

> deleteWidgetType(widgetTypeId)

Delete widget type (deleteWidgetType)

Deletes the  Widget Type. Referencing non-existing Widget Type Id will cause an error.  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **widgetTypeId** | **String**| A string value representing the widget type id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

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


## getBundleWidgetTypeFqns

> List&lt;String&gt; getBundleWidgetTypeFqns(widgetsBundleId)

Get all Widget type fqns for specified Bundle (getBundleWidgetTypeFqns)

Returns an array of Widget Type fqns that belong to specified Widget Bundle.  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **widgetsBundleId** | **String**| Widget Bundle Id | |

### Return type

**List&lt;String&gt;**

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


## getBundleWidgetTypesDetails

> List&lt;WidgetTypeDetails&gt; getBundleWidgetTypesDetails(widgetsBundleId, includeResources)

Get all Widget types details for specified Bundle (getBundleWidgetTypesDetails)

Returns an array of Widget Type Details objects that belong to specified Widget Bundle.Widget Type Details extend Widget Type and add image and description properties. Those properties are useful to edit the Widget Type but they are not required for Dashboard rendering.    Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **widgetsBundleId** | **String**| Widget Bundle Id | |
| **includeResources** | **Boolean**| Export used resources and replace resource links with resource metadata | [optional] |

### Return type

[**List&lt;WidgetTypeDetails&gt;**](WidgetTypeDetails.md)

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


## getBundleWidgetTypesInfos

> PageDataWidgetTypeInfo getBundleWidgetTypesInfos(widgetsBundleId, pageSize, page, textSearch, sortProperty, sortOrder, fullSearch, deprecatedFilter, widgetTypeList)

Get Widget Type Info objects (getBundleWidgetTypesInfos)

Get the Widget Type Info objects based on the provided parameters. Widget Type Info is a lightweight object that represents Widget Type but does not contain the heavyweight widget descriptor JSON  Available for any authorized user. 

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **widgetsBundleId** | **String**| Widget Bundle Id | |
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the widget type name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, name, deprecated, tenantId] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **fullSearch** | **Boolean**| Optional boolean parameter indicating whether search widgets by description not only by name | [optional] |
| **deprecatedFilter** | **String**| Optional string parameter indicating whether to include deprecated widgets | [optional] [enum: ALL, ACTUAL, DEPRECATED] |
| **widgetTypeList** | [**List&lt;String&gt;**](String.md)| A list of string values separated by comma &#39;,&#39; representing one of the widget type value | [optional] [enum: timeseries, latest, control, alarm, static] |

### Return type

[**PageDataWidgetTypeInfo**](PageDataWidgetTypeInfo.md)

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


## getBundleWidgetTypesV2

> List&lt;WidgetType&gt; getBundleWidgetTypesV2(widgetsBundleId)

Get all Widget types for specified Bundle (getBundleWidgetTypes)

Returns an array of Widget Type objects that belong to specified Widget Bundle.Widget Type represents the template for widget creation. Widget Type and Widget are similar to class and object in OOP theory.   Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **widgetsBundleId** | **String**| Widget Bundle Id | |

### Return type

[**List&lt;WidgetType&gt;**](WidgetType.md)

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


## getWidgetType

> WidgetType getWidgetType(fqn)

Get Widget Type (getWidgetType)

Get the Widget Type by FQN. Widget Type represents the template for widget creation. Widget Type and Widget are similar to class and object in OOP theory.  Available for any authorized user. 

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fqn** | **String**| Widget Type fqn | |

### Return type

[**WidgetType**](WidgetType.md)

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


## getWidgetTypeById

> WidgetTypeDetails getWidgetTypeById(widgetTypeId, includeResources)

Get Widget Type Details (getWidgetTypeById)

Get the Widget Type Details based on the provided Widget Type Id. Widget Type Details extend Widget Type and add image and description properties. Those properties are useful to edit the Widget Type but they are not required for Dashboard rendering.   Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **widgetTypeId** | **String**| A string value representing the widget type id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **includeResources** | **Boolean**| Export used resources and replace resource links with resource metadata | [optional] |

### Return type

[**WidgetTypeDetails**](WidgetTypeDetails.md)

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


## getWidgetTypeInfoById

> WidgetTypeInfo getWidgetTypeInfoById(widgetTypeId)

Get Widget Type Info (getWidgetTypeInfoById)

Get the Widget Type Info based on the provided Widget Type Id. Widget Type Details extend Widget Type and add image and description properties. Those properties are useful to edit the Widget Type but they are not required for Dashboard rendering.   Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **widgetTypeId** | **String**| A string value representing the widget type id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**WidgetTypeInfo**](WidgetTypeInfo.md)

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


## getWidgetTypes

> PageDataWidgetTypeInfo getWidgetTypes(pageSize, page, textSearch, sortProperty, sortOrder, tenantOnly, fullSearch, deprecatedFilter, widgetTypeList, scadaFirst)

Get Widget Types (getWidgetTypes)

Returns a page of Widget Type objects available for current user. Widget Type represents the template for widget creation. Widget Type and Widget are similar to class and object in OOP theory. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for any authorized user. 

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the widget type name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, name, deprecated, tenantId] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **tenantOnly** | **Boolean**| Optional boolean parameter indicating whether only tenant widget types should be returned | [optional] |
| **fullSearch** | **Boolean**| Optional boolean parameter indicating whether search widgets by description not only by name | [optional] |
| **deprecatedFilter** | **String**| Optional string parameter indicating whether to include deprecated widgets | [optional] [enum: ALL, ACTUAL, DEPRECATED] |
| **widgetTypeList** | [**List&lt;String&gt;**](String.md)| A list of string values separated by comma &#39;,&#39; representing one of the widget type value | [optional] [enum: timeseries, latest, control, alarm, static] |
| **scadaFirst** | **Boolean**| Optional boolean parameter indicating whether to fetch SCADA symbol widgets first | [optional] |

### Return type

[**PageDataWidgetTypeInfo**](PageDataWidgetTypeInfo.md)

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


## saveWidgetType

> WidgetTypeDetails saveWidgetType(widgetTypeDetails, updateExistingByFqn)

Create Or Update Widget Type (saveWidgetType)

Create or update the Widget Type. Widget Type represents the template for widget creation. Widget Type and Widget are similar to class and object in OOP theory. When creating the Widget Type, platform generates Widget Type Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Widget Type Id will be present in the response. Specify existing Widget Type id to update the Widget Type. Referencing non-existing Widget Type Id will cause &#39;Not Found&#39; error.  Widget Type fqn is unique in the scope of System or Tenant. Special Tenant Id &#39;13814000-1dd2-11b2-8080-808080808080&#39; is automatically used if the create request is sent by user with &#39;SYS_ADMIN&#39; authority.Remove &#39;id&#39;, &#39;tenantId&#39; rom the request body example (below) to create new Widget Type entity.  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **widgetTypeDetails** | [**WidgetTypeDetails**](WidgetTypeDetails.md)|  | |
| **updateExistingByFqn** | **Boolean**| Optional boolean parameter indicating whether to update existing widget type by FQN if present instead of creating new one | [optional] |

### Return type

[**WidgetTypeDetails**](WidgetTypeDetails.md)

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


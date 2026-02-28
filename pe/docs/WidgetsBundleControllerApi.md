# WidgetsBundleControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteWidgetsBundle**](WidgetsBundleControllerApi.md#deleteWidgetsBundle) | **DELETE** /api/widgetsBundle/{widgetsBundleId} | Delete widgets bundle (deleteWidgetsBundle) |
| [**getWidgetsBundleById**](WidgetsBundleControllerApi.md#getWidgetsBundleById) | **GET** /api/widgetsBundle/{widgetsBundleId} | Get Widget Bundle (getWidgetsBundleById) |
| [**getWidgetsBundles**](WidgetsBundleControllerApi.md#getWidgetsBundles) | **GET** /api/widgetsBundles | Get Widget Bundles (getWidgetsBundles) |
| [**getWidgetsBundlesList**](WidgetsBundleControllerApi.md#getWidgetsBundlesList) | **GET** /api/widgetsBundles/list | Get Widgets Bundles By Ids (getWidgetsBundlesList) |
| [**getWidgetsBundlesV2**](WidgetsBundleControllerApi.md#getWidgetsBundlesV2) | **GET** /api/widgetsBundles/all | Get all Widget Bundles (getWidgetsBundlesV2) |
| [**saveWidgetsBundle**](WidgetsBundleControllerApi.md#saveWidgetsBundle) | **POST** /api/widgetsBundle | Create Or Update Widget Bundle (saveWidgetsBundle) |
| [**updateWidgetsBundleWidgetFqns**](WidgetsBundleControllerApi.md#updateWidgetsBundleWidgetFqns) | **POST** /api/widgetsBundle/{widgetsBundleId}/widgetTypeFqns | Update widgets bundle widgets list from widget type FQNs list (updateWidgetsBundleWidgetFqns) |
| [**updateWidgetsBundleWidgetTypes**](WidgetsBundleControllerApi.md#updateWidgetsBundleWidgetTypes) | **POST** /api/widgetsBundle/{widgetsBundleId}/widgetTypes | Update widgets bundle widgets types list (updateWidgetsBundleWidgetTypes) |



## deleteWidgetsBundle

> deleteWidgetsBundle(widgetsBundleId)

Delete widgets bundle (deleteWidgetsBundle)

Deletes the widget bundle. Referencing non-existing Widget Bundle Id will cause an error.  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **widgetsBundleId** | **String**| A string value representing the widget bundle id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

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


## getWidgetsBundleById

> WidgetsBundle getWidgetsBundleById(widgetsBundleId, inlineImages)

Get Widget Bundle (getWidgetsBundleById)

Get the Widget Bundle based on the provided Widget Bundle Id. Widget Bundle represents a group(bundle) of widgets. Widgets are grouped into bundle by type or use case.   Available for any authorized user. 

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **widgetsBundleId** | **String**| A string value representing the widget bundle id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **inlineImages** | **Boolean**| Inline images as a data URL (Base64) | [optional] |

### Return type

[**WidgetsBundle**](WidgetsBundle.md)

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


## getWidgetsBundles

> PageDataWidgetsBundle getWidgetsBundles(pageSize, page, textSearch, sortProperty, sortOrder, tenantOnly, fullSearch, scadaFirst)

Get Widget Bundles (getWidgetsBundles)

Returns a page of Widget Bundle objects available for current user. Widget Bundle represents a group(bundle) of widgets. Widgets are grouped into bundle by type or use case.  You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for any authorized user. 

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the widget bundle title. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, title, tenantId] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **tenantOnly** | **Boolean**| Optional boolean parameter to include only tenant-level bundles without system | [optional] |
| **fullSearch** | **Boolean**| Optional boolean parameter indicating extended search of widget bundles by description and by name / description of related widget types | [optional] |
| **scadaFirst** | **Boolean**| Optional boolean parameter indicating whether to fetch widgets bundles with SCADA symbols first. Works only when fullSearch parameter is enabled | [optional] |

### Return type

[**PageDataWidgetsBundle**](PageDataWidgetsBundle.md)

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


## getWidgetsBundlesList

> List&lt;WidgetsBundle&gt; getWidgetsBundlesList(widgetsBundleIds)

Get Widgets Bundles By Ids (getWidgetsBundlesList)

Requested widgets bundles must be system level or owned by tenant of the user which is performing the request.    Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **widgetsBundleIds** | [**List&lt;String&gt;**](String.md)| A list of widgets bundle ids, separated by comma &#39;,&#39; | |

### Return type

[**List&lt;WidgetsBundle&gt;**](WidgetsBundle.md)

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


## getWidgetsBundlesV2

> List&lt;WidgetsBundle&gt; getWidgetsBundlesV2()

Get all Widget Bundles (getWidgetsBundlesV2)

Returns an array of Widget Bundle objects that are available for current user.Widget Bundle represents a group(bundle) of widgets. Widgets are grouped into bundle by type or use case.    Available for any authorized user. 

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;WidgetsBundle&gt;**](WidgetsBundle.md)

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


## saveWidgetsBundle

> WidgetsBundle saveWidgetsBundle(widgetsBundle)

Create Or Update Widget Bundle (saveWidgetsBundle)

Create or update the Widget Bundle. Widget Bundle represents a group(bundle) of widgets. Widgets are grouped into bundle by type or use case.  When creating the bundle, platform generates Widget Bundle Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Widget Bundle Id will be present in the response. Specify existing Widget Bundle id to update the Widget Bundle. Referencing non-existing Widget Bundle Id will cause &#39;Not Found&#39; error.  Widget Bundle alias is unique in the scope of tenant. Special Tenant Id &#39;13814000-1dd2-11b2-8080-808080808080&#39; is automatically used if the create bundle request is sent by user with &#39;SYS_ADMIN&#39; authority.Remove &#39;id&#39;, &#39;tenantId&#39; from the request body example (below) to create new Widgets Bundle entity.  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **widgetsBundle** | [**WidgetsBundle**](WidgetsBundle.md)|  | |

### Return type

[**WidgetsBundle**](WidgetsBundle.md)

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


## updateWidgetsBundleWidgetFqns

> updateWidgetsBundleWidgetFqns(widgetsBundleId, requestBody)

Update widgets bundle widgets list from widget type FQNs list (updateWidgetsBundleWidgetFqns)

Updates widgets bundle widgets list from widget type FQNs list.  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **widgetsBundleId** | **String**| A string value representing the widget bundle id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **requestBody** | [**List&lt;String&gt;**](String.md)|  | |

### Return type

null (empty response body)

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


## updateWidgetsBundleWidgetTypes

> updateWidgetsBundleWidgetTypes(widgetsBundleId, requestBody)

Update widgets bundle widgets types list (updateWidgetsBundleWidgetTypes)

Updates widgets bundle widgets list.  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **widgetsBundleId** | **String**| A string value representing the widget bundle id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **requestBody** | [**List&lt;String&gt;**](String.md)|  | |

### Return type

null (empty response body)

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


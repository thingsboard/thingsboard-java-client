# TrendzApiControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTrendzSummary**](TrendzApiControllerApi.md#getTrendzSummary) | **GET** /api/trendz/summary | Get Trendz Summary (getTrendzSummary) |
| [**getTrendzUsage**](TrendzApiControllerApi.md#getTrendzUsage) | **GET** /api/trendz/usage | Get Trendz Usage (getTrendzUsage) |
| [**getTrendzViewById**](TrendzApiControllerApi.md#getTrendzViewById) | **GET** /api/trendz/view/{viewId} | Get Trendz View by Id (getTrendzViewById) |
| [**getTrendzViews**](TrendzApiControllerApi.md#getTrendzViews) | **GET** /api/trendz/view/all | Get Trendz Views (getTrendzViews) |



## getTrendzSummary

> TrendzSummary getTrendzSummary()

Get Trendz Summary (getTrendzSummary)

Fetch the Trendz summary object. Can only be used if Trendz is already synchronized and integration is enabled.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

This endpoint does not need any parameter.

### Return type

[**TrendzSummary**](TrendzSummary.md)

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


## getTrendzUsage

> TrendzUsage getTrendzUsage()

Get Trendz Usage (getTrendzUsage)

Fetch the Trendz usage object. Can only be used if Trendz is already synchronized and integration is enabled.   Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters

This endpoint does not need any parameter.

### Return type

[**TrendzUsage**](TrendzUsage.md)

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


## getTrendzViewById

> TrendzViewConfig getTrendzViewById(viewId)

Get Trendz View by Id (getTrendzViewById)

Fetch the Trendz View object based on the provided Trendz View Id. Can only be used if Trendz is already synchronized and integration is enabled.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **viewId** | **String**| A string value representing the Trendz view id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**TrendzViewConfig**](TrendzViewConfig.md)

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


## getTrendzViews

> PageDataTrendzViewConfigLite getTrendzViews(pageSize, page, textSearch, sortProperty, sortOrder)

Get Trendz Views (getTrendzViews)

Returns a page of Trendz views that are available for the current user. Can only be used if Trendz is already synchronized and integration is enabled. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the Trendz view name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: name, createdAt, updatedAt, favorite] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataTrendzViewConfigLite**](PageDataTrendzViewConfigLite.md)

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


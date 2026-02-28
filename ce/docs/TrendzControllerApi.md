# TrendzControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTrendzSettings**](TrendzControllerApi.md#getTrendzSettings) | **GET** /api/trendz/settings | Get Trendz Settings (getTrendzSettings) |
| [**saveTrendzSettings**](TrendzControllerApi.md#saveTrendzSettings) | **POST** /api/trendz/settings | Save Trendz settings (saveTrendzSettings) |



## getTrendzSettings

> TrendzSettings getTrendzSettings()

Get Trendz Settings (getTrendzSettings)

Retrieves Trendz settings for this tenant.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

This endpoint does not need any parameter.

### Return type

[**TrendzSettings**](TrendzSettings.md)

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


## saveTrendzSettings

> TrendzSettings saveTrendzSettings(trendzSettings)

Save Trendz settings (saveTrendzSettings)

Saves Trendz settings for this tenant.   Here is an example of the Trendz settings: &#x60;&#x60;&#x60;json {   \&quot;enabled\&quot;: true,   \&quot;baseUrl\&quot;: \&quot;https://some.domain.com:18888/also_necessary_prefix\&quot; } &#x60;&#x60;&#x60;  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **trendzSettings** | [**TrendzSettings**](TrendzSettings.md)|  | |

### Return type

[**TrendzSettings**](TrendzSettings.md)

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


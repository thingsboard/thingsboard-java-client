# UsageInfoControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTenantUsageInfo**](UsageInfoControllerApi.md#getTenantUsageInfo) | **GET** /api/usage | getTenantUsageInfo |



## getTenantUsageInfo

> UsageInfo getTenantUsageInfo()

getTenantUsageInfo

### Parameters

This endpoint does not need any parameter.

### Return type

[**UsageInfo**](UsageInfo.md)

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


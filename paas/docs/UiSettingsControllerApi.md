# UiSettingsControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getHelpBaseUrl**](UiSettingsControllerApi.md#getHelpBaseUrl) | **GET** /api/uiSettings/helpBaseUrl | Get UI help base url (getHelpBaseUrl) |



## getHelpBaseUrl

> String getHelpBaseUrl()

Get UI help base url (getHelpBaseUrl)

Get UI help base url used to fetch help assets. The actual value of the base url is configurable in the system configuration file.

### Parameters

This endpoint does not need any parameter.

### Return type

**String**

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


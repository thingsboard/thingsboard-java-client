# CloudEndpointControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**hasDomainReadPermission**](CloudEndpointControllerApi.md#hasDomainReadPermission) | **GET** /api/cloudEndpoint/permission/domain/read | hasDomainReadPermission |
| [**hasDomainWritePermission**](CloudEndpointControllerApi.md#hasDomainWritePermission) | **GET** /api/cloudEndpoint/permission/domain/write | hasDomainWritePermission |
| [**tenantHasWhiteLabelRead**](CloudEndpointControllerApi.md#tenantHasWhiteLabelRead) | **GET** /api/cloudEndpoint/tenant/permission/whiteLabel/read | tenantHasWhiteLabelRead |
| [**tenantHasWhiteLabelWrite**](CloudEndpointControllerApi.md#tenantHasWhiteLabelWrite) | **GET** /api/cloudEndpoint/tenant/permission/whiteLabel/write | tenantHasWhiteLabelWrite |
| [**tenantWhiteLabelingAllowed1**](CloudEndpointControllerApi.md#tenantWhiteLabelingAllowed1) | **GET** /api/cloudEndpoint/tenant/permission/whiteLabelingAllowed | tenantWhiteLabelingAllowed |



## hasDomainReadPermission

> Boolean hasDomainReadPermission()

hasDomainReadPermission

### Parameters

This endpoint does not need any parameter.

### Return type

**Boolean**

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


## hasDomainWritePermission

> Boolean hasDomainWritePermission()

hasDomainWritePermission

### Parameters

This endpoint does not need any parameter.

### Return type

**Boolean**

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


## tenantHasWhiteLabelRead

> Boolean tenantHasWhiteLabelRead()

tenantHasWhiteLabelRead

### Parameters

This endpoint does not need any parameter.

### Return type

**Boolean**

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


## tenantHasWhiteLabelWrite

> Boolean tenantHasWhiteLabelWrite()

tenantHasWhiteLabelWrite

### Parameters

This endpoint does not need any parameter.

### Return type

**Boolean**

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


## tenantWhiteLabelingAllowed1

> tenantWhiteLabelingAllowed1()

tenantWhiteLabelingAllowed

### Parameters

This endpoint does not need any parameter.

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


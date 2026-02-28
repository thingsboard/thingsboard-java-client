# TrendzControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**connectToTrendz**](TrendzControllerApi.md#connectToTrendz) | **POST** /api/trendz/connect | Connect to Trendz (connectToTrendz) |
| [**getTrendzConfig**](TrendzControllerApi.md#getTrendzConfig) | **GET** /api/trendz/config | Get Trendz configuration (getTrendzConfig) |
| [**getTrendzSyncResult**](TrendzControllerApi.md#getTrendzSyncResult) | **GET** /api/trendz/sync | Get Trendz synchronization result (getTrendzSyncResult) |
| [**performTrendzHealthcheck**](TrendzControllerApi.md#performTrendzHealthcheck) | **GET** /api/trendz/healthcheck | Perform Trendz healthcheck (performTrendzHealthcheck) |
| [**publicConnectToTrendz**](TrendzControllerApi.md#publicConnectToTrendz) | **POST** /api/trendz/public/connect | Public connect to Trendz (publicConnectToTrendz) |
| [**saveTrendzConfig**](TrendzControllerApi.md#saveTrendzConfig) | **POST** /api/trendz/config | Save Trendz configuration (saveTrendzConfig) |



## connectToTrendz

> TrendzSynchronizationResult connectToTrendz()

Connect to Trendz (connectToTrendz)

Initiates synchronization with Trendz (Connect button action). Uses Trendz configuration from settings or falls back to environment variables. Generates API key, saves configuration, checks Trendz version, and performs initial sync.   Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters

This endpoint does not need any parameter.

### Return type

[**TrendzSynchronizationResult**](TrendzSynchronizationResult.md)

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


## getTrendzConfig

> TrendzConfiguration getTrendzConfig()

Get Trendz configuration (getTrendzConfig)

Retrieves Trendz configuration (URLs). Returns trendzUrl and tbUrl.  Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters

This endpoint does not need any parameter.

### Return type

[**TrendzConfiguration**](TrendzConfiguration.md)

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


## getTrendzSyncResult

> TrendzSynchronizationResult getTrendzSyncResult()

Get Trendz synchronization result (getTrendzSyncResult)

Retrieves Trendz synchronization result and status. Returns trendzVersion, updatedTs, resultType, and status.  Available for any authorized user. 

### Parameters

This endpoint does not need any parameter.

### Return type

[**TrendzSynchronizationResult**](TrendzSynchronizationResult.md)

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


## performTrendzHealthcheck

> TrendzHealthcheckResult performTrendzHealthcheck()

Perform Trendz healthcheck (performTrendzHealthcheck)

Performs healthcheck for Trendz integration. Returns version, type, status, and message. Can only be performed if Trendz is already synchronized and integration is enabled.  Available for any authorized user. 

### Parameters

This endpoint does not need any parameter.

### Return type

[**TrendzHealthcheckResult**](TrendzHealthcheckResult.md)

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


## publicConnectToTrendz

> publicConnectToTrendz()

Public connect to Trendz (publicConnectToTrendz)

Initiates synchronization with Trendz if Trendz is not synced yet. Uses Trendz configuration from settings or falls back to environment variables. Generates API key, saves configuration, checks Trendz version, and performs initial sync.

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


## saveTrendzConfig

> TrendzConfiguration saveTrendzConfig(trendzConfiguration)

Save Trendz configuration (saveTrendzConfig)

Saves Trendz configuration (URLs only, without triggering synchronization). Request body example: &#x60;&#x60;&#x60;json {   \&quot;trendzUrl\&quot;: \&quot;https://trendz.domain.com\&quot;,   \&quot;tbUrl\&quot;: \&quot;https://thingsboard.domain.com\&quot; } &#x60;&#x60;&#x60;  Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **trendzConfiguration** | [**TrendzConfiguration**](TrendzConfiguration.md)|  | |

### Return type

[**TrendzConfiguration**](TrendzConfiguration.md)

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


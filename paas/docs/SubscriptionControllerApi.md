# SubscriptionControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMergedTenantProfileConfiguration**](SubscriptionControllerApi.md#getMergedTenantProfileConfiguration) | **GET** /api/tenant/subscription/mergedProfileConfig | getMergedTenantProfileConfiguration |
| [**getTenantProfileConfigurationById**](SubscriptionControllerApi.md#getTenantProfileConfigurationById) | **GET** /api/tenantProfile/{tenantProfileId}/profileConfig | getTenantProfileConfigurationById |
| [**getTenantSubscription**](SubscriptionControllerApi.md#getTenantSubscription) | **GET** /api/tenant/subscription | getTenantSubscription |
| [**getTenantSubscriptionUsage**](SubscriptionControllerApi.md#getTenantSubscriptionUsage) | **GET** /api/tenant/subscription/usage | getTenantSubscriptionUsage |
| [**trendzUsed**](SubscriptionControllerApi.md#trendzUsed) | **GET** /api/tenant/subscription/trendzUsed | trendzUsed |



## getMergedTenantProfileConfiguration

> DefaultTenantProfileConfiguration getMergedTenantProfileConfiguration()

getMergedTenantProfileConfiguration

### Parameters

This endpoint does not need any parameter.

### Return type

[**DefaultTenantProfileConfiguration**](DefaultTenantProfileConfiguration.md)

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


## getTenantProfileConfigurationById

> DefaultTenantProfileConfiguration getTenantProfileConfigurationById(tenantProfileId)

getTenantProfileConfigurationById

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantProfileId** | **String**|  | |

### Return type

[**DefaultTenantProfileConfiguration**](DefaultTenantProfileConfiguration.md)

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


## getTenantSubscription

> SubscriptionDetails getTenantSubscription()

getTenantSubscription

### Parameters

This endpoint does not need any parameter.

### Return type

[**SubscriptionDetails**](SubscriptionDetails.md)

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


## getTenantSubscriptionUsage

> SubscriptionUsage getTenantSubscriptionUsage()

getTenantSubscriptionUsage

### Parameters

This endpoint does not need any parameter.

### Return type

[**SubscriptionUsage**](SubscriptionUsage.md)

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


## trendzUsed

> Boolean trendzUsed()

trendzUsed

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


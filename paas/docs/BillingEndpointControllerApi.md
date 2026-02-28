# BillingEndpointControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkTenantCanUpdatePlan**](BillingEndpointControllerApi.md#checkTenantCanUpdatePlan) | **POST** /api/billingEndpoint/tenantCanUpdatePlan | checkTenantCanUpdatePlan |
| [**notifyTenantPlanChanged**](BillingEndpointControllerApi.md#notifyTenantPlanChanged) | **POST** /api/billingEndpoint/tenantPlanChanged | notifyTenantPlanChanged |
| [**notifyTenantStateChanged**](BillingEndpointControllerApi.md#notifyTenantStateChanged) | **POST** /api/billingEndpoint/tenantStateChanged | notifyTenantStateChanged |
| [**notifyTenantSubscriptionCreated**](BillingEndpointControllerApi.md#notifyTenantSubscriptionCreated) | **POST** /api/billingEndpoint/tenantSubscriptionCreated | notifyTenantSubscriptionCreated |
| [**sendAccountActivatedEmail**](BillingEndpointControllerApi.md#sendAccountActivatedEmail) | **POST** /api/billingEndpoint/sendAccountActivated | sendAccountActivatedEmail |
| [**sendActivationEmail1**](BillingEndpointControllerApi.md#sendActivationEmail1) | **POST** /api/billingEndpoint/sendActivation | sendActivationEmail |
| [**sendPasswordWasResetEmail**](BillingEndpointControllerApi.md#sendPasswordWasResetEmail) | **POST** /api/billingEndpoint/sendPasswordWasReset | sendPasswordWasResetEmail |
| [**sendResetPasswordEmail**](BillingEndpointControllerApi.md#sendResetPasswordEmail) | **POST** /api/billingEndpoint/sendResetPassword | sendResetPasswordEmail |
| [**tenantHasBillingRead**](BillingEndpointControllerApi.md#tenantHasBillingRead) | **GET** /api/billingEndpoint/tenant/permission/billing/read | tenantHasBillingRead |
| [**tenantHasBillingWrite**](BillingEndpointControllerApi.md#tenantHasBillingWrite) | **GET** /api/billingEndpoint/tenant/permission/billing/write | tenantHasBillingWrite |
| [**tenantHasHiddenPlansAccess**](BillingEndpointControllerApi.md#tenantHasHiddenPlansAccess) | **GET** /api/billingEndpoint/tenant/permission/billing/hiddenPlans | tenantHasHiddenPlansAccess |



## checkTenantCanUpdatePlan

> checkTenantCanUpdatePlan(body)

checkTenantCanUpdatePlan

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object**|  | |

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


## notifyTenantPlanChanged

> notifyTenantPlanChanged(body)

notifyTenantPlanChanged

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object**|  | |

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


## notifyTenantStateChanged

> notifyTenantStateChanged(body)

notifyTenantStateChanged

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object**|  | |

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


## notifyTenantSubscriptionCreated

> notifyTenantSubscriptionCreated(body)

notifyTenantSubscriptionCreated

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object**|  | |

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


## sendAccountActivatedEmail

> sendAccountActivatedEmail(body)

sendAccountActivatedEmail

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object**|  | |

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


## sendActivationEmail1

> sendActivationEmail1(body)

sendActivationEmail

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object**|  | |

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


## sendPasswordWasResetEmail

> sendPasswordWasResetEmail(body)

sendPasswordWasResetEmail

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object**|  | |

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


## sendResetPasswordEmail

> sendResetPasswordEmail(body)

sendResetPasswordEmail

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object**|  | |

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


## tenantHasBillingRead

> Boolean tenantHasBillingRead()

tenantHasBillingRead

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


## tenantHasBillingWrite

> Boolean tenantHasBillingWrite()

tenantHasBillingWrite

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


## tenantHasHiddenPlansAccess

> Boolean tenantHasHiddenPlansAccess()

tenantHasHiddenPlansAccess

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


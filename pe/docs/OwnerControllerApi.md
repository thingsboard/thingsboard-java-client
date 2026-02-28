# OwnerControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**changeOwnerToCustomer**](OwnerControllerApi.md#changeOwnerToCustomer) | **POST** /api/owner/CUSTOMER/{ownerId}/{entityType}/{entityId} | Change owner to customer (changeOwnerToCustomer) |
| [**changeOwnerToTenant**](OwnerControllerApi.md#changeOwnerToTenant) | **POST** /api/owner/TENANT/{ownerId}/{entityType}/{entityId} | Change owner to tenant (changeOwnerToTenant) |



## changeOwnerToCustomer

> changeOwnerToCustomer(ownerId, entityType, entityId, requestBody)

Change owner to customer (changeOwnerToCustomer)

Tenant/Customer changes Owner to Customer or sub-Customer. Sub-Customer can&#x60;t perform this operation!   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ownerId** | **String**| A string value representing the customer id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **entityType** | **String**| A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **entityId** | **String**| A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **requestBody** | [**List&lt;String&gt;**](String.md)|  | [optional] |

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


## changeOwnerToTenant

> changeOwnerToTenant(ownerId, entityType, entityId, requestBody)

Change owner to tenant (changeOwnerToTenant)

Tenant changes Owner from Customer or sub-Customer to Tenant.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ownerId** | **String**| A string value representing the tenant id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **entityType** | **String**| A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **entityId** | **String**| A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **requestBody** | [**List&lt;String&gt;**](String.md)|  | [optional] |

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


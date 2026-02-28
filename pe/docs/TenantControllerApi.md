# TenantControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteTenant**](TenantControllerApi.md#deleteTenant) | **DELETE** /api/tenant/{tenantId} | Delete Tenant (deleteTenant) |
| [**getTenantById**](TenantControllerApi.md#getTenantById) | **GET** /api/tenant/{tenantId} | Get Tenant (getTenantById) |
| [**getTenantInfoById**](TenantControllerApi.md#getTenantInfoById) | **GET** /api/tenant/info/{tenantId} | Get Tenant Info (getTenantInfoById) |
| [**getTenantInfos**](TenantControllerApi.md#getTenantInfos) | **GET** /api/tenantInfos | Get Tenants Info (getTenants) |
| [**getTenants**](TenantControllerApi.md#getTenants) | **GET** /api/tenants | Get Tenants (getTenants) |
| [**getTenantsByIdsV2**](TenantControllerApi.md#getTenantsByIdsV2) | **GET** /api/tenants/list | Get Tenants By Ids (getTenantsByIdsV2) |
| [**saveTenant**](TenantControllerApi.md#saveTenant) | **POST** /api/tenant | Create Or update Tenant (saveTenant) |



## deleteTenant

> deleteTenant(tenantId)

Delete Tenant (deleteTenant)

Deletes the tenant, it&#39;s customers, rule chains, devices and all other related entities. Referencing non-existing tenant Id will cause an error.  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **String**| A string value representing the tenant id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

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


## getTenantById

> Tenant getTenantById(tenantId)

Get Tenant (getTenantById)

Fetch the Tenant object based on the provided Tenant Id.   Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **String**| A string value representing the tenant id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**Tenant**](Tenant.md)

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


## getTenantInfoById

> TenantInfo getTenantInfoById(tenantId)

Get Tenant Info (getTenantInfoById)

Fetch the Tenant Info object based on the provided Tenant Id. The Tenant Info object extends regular Tenant object and includes Tenant Profile name.   Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **String**| A string value representing the tenant id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**TenantInfo**](TenantInfo.md)

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


## getTenantInfos

> PageDataTenantInfo getTenantInfos(pageSize, page, textSearch, sortProperty, sortOrder)

Get Tenants Info (getTenants)

Returns a page of tenant info objects registered in the platform. The Tenant Info object extends regular Tenant object and includes Tenant Profile name. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the tenant name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, tenantProfileName, title, email, country, state, city, address, address2, zip, phone, email] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataTenantInfo**](PageDataTenantInfo.md)

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


## getTenants

> PageDataTenant getTenants(pageSize, page, textSearch, sortProperty, sortOrder)

Get Tenants (getTenants)

Returns a page of tenants registered in the platform. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the tenant name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, title, email, country, state, city, address, address2, zip, phone, email] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataTenant**](PageDataTenant.md)

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


## getTenantsByIdsV2

> List&lt;Tenant&gt; getTenantsByIdsV2(tenantIds)

Get Tenants By Ids (getTenantsByIdsV2)

Fetch Tenant objects based on the provided ids.   Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantIds** | [**List&lt;String&gt;**](String.md)| A list of tenant ids, separated by comma &#39;,&#39; | |

### Return type

[**List&lt;Tenant&gt;**](Tenant.md)

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


## saveTenant

> Tenant saveTenant(tenant)

Create Or update Tenant (saveTenant)

Create or update the Tenant. When creating tenant, platform generates Tenant Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). Default Rule Chain and Device profile are also generated for the new tenants automatically. The newly created Tenant Id will be present in the response. Specify existing Tenant Id id to update the Tenant. Referencing non-existing Tenant Id will cause &#39;Not Found&#39; error.Remove &#39;id&#39;, &#39;tenantId&#39; from the request body example (below) to create new Tenant entity.  Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenant** | [**Tenant**](Tenant.md)|  | |

### Return type

[**Tenant**](Tenant.md)

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


# TenantControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteTenant**](#deleteTenant) | **DELETE** /api/tenant/{tenantId} | Delete Tenant (deleteTenant) |
| [**getTenantById**](#getTenantById) | **GET** /api/tenant/{tenantId} | Get Tenant (getTenantById) |
| [**getTenantInfoById**](#getTenantInfoById) | **GET** /api/tenant/info/{tenantId} | Get Tenant Info (getTenantInfoById) |
| [**getTenantInfos**](#getTenantInfos) | **GET** /api/tenantInfos | Get Tenants Info (getTenants) |
| [**getTenants**](#getTenants) | **GET** /api/tenants | Get Tenants (getTenants) |
| [**getTenantsByIds**](#getTenantsByIds) | **GET** /api/tenants/list | Get Tenants list (getTenantsByIds) |
| [**saveTenant**](#saveTenant) | **POST** /api/tenant | Create Or update Tenant (saveTenant) |



## deleteTenant

> deleteTenant(tenantId)

Delete Tenant (deleteTenant)

Deletes the tenant, it's customers, rule chains, devices and all other related entities. Referencing non-existing tenant Id will cause an error.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **String** | A string value representing the tenant id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## getTenantById

> Tenant getTenantById(tenantId)

Get Tenant (getTenantById)

Fetch the Tenant object based on the provided Tenant Id.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **String** | A string value representing the tenant id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**Tenant**


## getTenantInfoById

> TenantInfo getTenantInfoById(tenantId)

Get Tenant Info (getTenantInfoById)

Fetch the Tenant Info object based on the provided Tenant Id. The Tenant Info object extends regular Tenant object and includes Tenant Profile name.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **String** | A string value representing the tenant id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**TenantInfo**


## getTenantInfos

> PageDataTenantInfo getTenantInfos(pageSize, page, textSearch, sortProperty, sortOrder)

Get Tenants Info (getTenants)

Returns a page of tenant info objects registered in the platform. The Tenant Info object extends regular Tenant object and includes Tenant Profile name. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'SYS_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the tenant name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, tenantProfileName, title, email, country, state, city, address, address2, zip, phone, email] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataTenantInfo**


## getTenants

> PageDataTenant getTenants(pageSize, page, textSearch, sortProperty, sortOrder)

Get Tenants (getTenants)

Returns a page of tenants registered in the platform. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'SYS_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the tenant name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, title, email, country, state, city, address, address2, zip, phone, email] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataTenant**


## getTenantsByIds

> List<Tenant> getTenantsByIds(tenantIds)

Get Tenants list (getTenantsByIds)


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantIds** | **List<String>** | A list of tenant ids, separated by comma ',' | |

### Return type

**List<Tenant>**


## saveTenant

> Tenant saveTenant(tenant)

Create Or update Tenant (saveTenant)

Create or update the Tenant. When creating tenant, platform generates Tenant Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). Default Rule Chain and Device profile are also generated for the new tenants automatically. The newly created Tenant Id will be present in the response. Specify existing Tenant Id id to update the Tenant. Referencing non-existing Tenant Id will cause 'Not Found' error.Remove 'id', 'tenantId' from the request body example (below) to create new Tenant entity.  Available for users with 'SYS_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenant** | **Tenant** |  | |

### Return type

**Tenant**


# TenantControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void deleteTenant(DeleteTenantArgs args) // Delete Tenant (deleteTenant)
Tenant getTenantById(GetTenantByIdArgs args) // Get Tenant (getTenantById)
TenantInfo getTenantInfoById(GetTenantInfoByIdArgs args) // Get Tenant Info (getTenantInfoById)
PageDataTenantInfo getTenantInfos(GetTenantInfosArgs args) // Get Tenants Info (getTenants)
PageDataTenant getTenants(GetTenantsArgs args) // Get Tenants (getTenants)
List<Tenant> getTenantsByIds(GetTenantsByIdsArgs args) // Get Tenants By Ids (getTenantsByIds)
Tenant saveTenant(SaveTenantArgs args) // Create Or update Tenant (saveTenant)
```


## deleteTenant

**DELETE** `/api/tenant/{tenantId}`

Delete Tenant (deleteTenant)

Deletes the tenant, it's customers, rule chains, devices and all other related entities. Referencing non-existing tenant Id will cause an error.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
void deleteTenant(DeleteTenantArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteTenantArgs.builder()
        .tenantId(String)
        .build()
```

### `DeleteTenantArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `tenantId` | `String` | **yes** | A string value representing the tenant id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## getTenantById

**GET** `/api/tenant/{tenantId}`

Get Tenant (getTenantById)

Fetch the Tenant object based on the provided Tenant Id.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
Tenant getTenantById(GetTenantByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetTenantByIdArgs.builder()
        .tenantId(String)
        .build()
```

### `GetTenantByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `tenantId` | `String` | **yes** | A string value representing the tenant id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Tenant`


## getTenantInfoById

**GET** `/api/tenant/info/{tenantId}`

Get Tenant Info (getTenantInfoById)

Fetch the Tenant Info object based on the provided Tenant Id. The Tenant Info object extends regular Tenant object and includes Tenant Profile name.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
TenantInfo getTenantInfoById(GetTenantInfoByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetTenantInfoByIdArgs.builder()
        .tenantId(String)
        .build()
```

### `GetTenantInfoByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `tenantId` | `String` | **yes** | A string value representing the tenant id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`TenantInfo`


## getTenantInfos

**GET** `/api/tenantInfos`

Get Tenants Info (getTenants)

Returns a page of tenant info objects registered in the platform. The Tenant Info object extends regular Tenant object and includes Tenant Profile name. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'SYS_ADMIN' authority.

```java
PageDataTenantInfo getTenantInfos(GetTenantInfosArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetTenantInfosArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetTenantInfosArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the tenant name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `tenantProfileName`, `title`, `email`, `country`, `state`, `city`, `address`, `address2`, `zip`, `phone`, `email` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataTenantInfo`


## getTenants

**GET** `/api/tenants`

Get Tenants (getTenants)

Returns a page of tenants registered in the platform. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'SYS_ADMIN' authority.

```java
PageDataTenant getTenants(GetTenantsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetTenantsArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetTenantsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the tenant name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `title`, `email`, `country`, `state`, `city`, `address`, `address2`, `zip`, `phone`, `email` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataTenant`


## getTenantsByIds

**GET** `/api/tenants/list`

Get Tenants By Ids (getTenantsByIds)

Fetch Tenant objects based on the provided ids.   Available for users with 'SYS_ADMIN' authority.

```java
List<Tenant> getTenantsByIds(GetTenantsByIdsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetTenantsByIdsArgs.builder()
        .tenantIds(List<String>)
        .build()
```

### `GetTenantsByIdsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `tenantIds` | `List<String>` | **yes** | A list of tenant ids, separated by comma ',' | |

### Return type

`List<Tenant>`


## saveTenant

**POST** `/api/tenant`

Create Or update Tenant (saveTenant)

Create or update the Tenant. When creating tenant, platform generates Tenant Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). Default Rule Chain and Device profile are also generated for the new tenants automatically. The newly created Tenant Id will be present in the response. Specify existing Tenant Id id to update the Tenant. Referencing non-existing Tenant Id will cause 'Not Found' error.Remove 'id', 'tenantId' from the request body example (below) to create new Tenant entity.  Available for users with 'SYS_ADMIN' authority.

```java
Tenant saveTenant(SaveTenantArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveTenantArgs.builder()
        .tenant(Tenant)
        .build()
```

### `SaveTenantArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `tenant` | `Tenant` | **yes** |  | |

### Return type

`Tenant`


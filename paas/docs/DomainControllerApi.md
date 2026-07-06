# DomainControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void deleteDomain(DeleteDomainArgs args) // Delete Domain by ID (deleteDomain)
CloudDomainInfo getCloudDomainInfoById(GetCloudDomainInfoByIdArgs args) // Get Domain info by Id (getCloudDomainInfoById)
DomainInfo getDomainInfoById(GetDomainInfoByIdArgs args) // Get Domain info by Id (getDomainInfoById)
PageDataDomainInfo getDomainInfos(GetDomainInfosArgs args) // Get Domain infos (getDomainInfos)
Domain saveDomain(SaveDomainArgs args) // Save or Update Domain (saveDomain)
void updateDomainOauth2Clients(UpdateDomainOauth2ClientsArgs args) // Update oauth2 clients (updateDomainOauth2Clients)
```


## deleteDomain

**DELETE** `/api/domain/{id}`

Delete Domain by ID (deleteDomain)

Deletes Domain by ID. Referencing non-existing domain Id will cause an error.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
void deleteDomain(DeleteDomainArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteDomainArgs.builder()
        .id(UUID)
        .build()
```

### `DeleteDomainArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `UUID` | **yes** |  | |

### Return type

null (empty response body)


## getCloudDomainInfoById

**GET** `/api/domain/cloud/info/{id}`

Get Domain info by Id (getCloudDomainInfoById)

  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
CloudDomainInfo getCloudDomainInfoById(GetCloudDomainInfoByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetCloudDomainInfoByIdArgs.builder()
        .id(UUID)
        .build()
```

### `GetCloudDomainInfoByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `UUID` | **yes** |  | |

### Return type

`CloudDomainInfo`


## getDomainInfoById

**GET** `/api/domain/info/{id}`

Get Domain info by Id (getDomainInfoById)

  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
DomainInfo getDomainInfoById(GetDomainInfoByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetDomainInfoByIdArgs.builder()
        .id(UUID)
        .build()
```

### `GetDomainInfoByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `UUID` | **yes** |  | |

### Return type

`DomainInfo`


## getDomainInfos

**GET** `/api/domain/infos`

Get Domain infos (getDomainInfos)

  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
PageDataDomainInfo getDomainInfos(GetDomainInfosArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetDomainInfosArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetDomainInfosArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | Case-insensitive 'substring' filter based on domain's name | |
| `sortProperty` | `String` | no | Property of entity to sort by | |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | |

### Return type

`PageDataDomainInfo`


## saveDomain

**POST** `/api/domain`

Save or Update Domain (saveDomain)

Create or update the Domain. When creating domain, platform generates Domain Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Domain Id will be present in the response. Specify existing Domain Id to update the domain. Referencing non-existing Domain Id will cause 'Not Found' error.  Domain name is unique for entire platform setup.    Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
Domain saveDomain(SaveDomainArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveDomainArgs.builder()
        .domain(Domain)
        .build()
```

### `SaveDomainArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `domain` | `Domain` | **yes** |  | |
| `oauth2ClientIds` | `List<String>` | no | A list of oauth2 client registration ids, separated by comma ',' | |

### Return type

`Domain`


## updateDomainOauth2Clients

**PUT** `/api/domain/{id}/oauth2Clients`

Update oauth2 clients (updateDomainOauth2Clients)

Update oauth2 clients for the specified domain.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
void updateDomainOauth2Clients(UpdateDomainOauth2ClientsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UpdateDomainOauth2ClientsArgs.builder()
        .id(UUID)
        .UUID(List<UUID>)
        .build()
```

### `UpdateDomainOauth2ClientsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `UUID` | **yes** |  | |
| `UUID` | `List<UUID>` | **yes** |  | |

### Return type

null (empty response body)


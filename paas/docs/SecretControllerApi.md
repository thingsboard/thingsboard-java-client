# SecretControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
TbSecretDeleteResult deleteSecret(DeleteSecretArgs args) // Delete secret by ID (deleteSecret)
SecretInfo getSecretInfoById(GetSecretInfoByIdArgs args) // Get Secret info by Id (getSecretInfoById)
SecretInfo getSecretInfoByName(GetSecretInfoByNameArgs args) // Get Secret info by name (getSecretInfoByName)
PageDataSecretInfo getSecretInfos(GetSecretInfosArgs args) // Get Tenant Secret infos (getSecretInfos)
List<String> getSecretNames() // Get Tenant Secret names (getSecretNames)
SecretInfo saveSecret(SaveSecretArgs args) // Save or Update Secret (saveSecret)
SecretInfo updateSecretDescription(UpdateSecretDescriptionArgs args) // Update Secret Description
SecretInfo updateSecretValue(UpdateSecretValueArgs args) // Update Secret value
```


## deleteSecret

**DELETE** `/api/secret/{id}`

Delete secret by ID (deleteSecret)

Deletes the secret. Referencing non-existing Secret Id will cause an error.  Available for users with 'TENANT_ADMIN' authority.

```java
TbSecretDeleteResult deleteSecret(DeleteSecretArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteSecretArgs.builder()
        .id(UUID)
        .build()
```

### `DeleteSecretArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `UUID` | **yes** |  | |

### Return type

`TbSecretDeleteResult`


## getSecretInfoById

**GET** `/api/secret/{id}/info`

Get Secret info by Id (getSecretInfoById)

  Available for users with 'TENANT_ADMIN' authority.

```java
SecretInfo getSecretInfoById(GetSecretInfoByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetSecretInfoByIdArgs.builder()
        .id(UUID)
        .build()
```

### `GetSecretInfoByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `UUID` | **yes** |  | |

### Return type

`SecretInfo`


## getSecretInfoByName

**GET** `/api/secret`

Get Secret info by name (getSecretInfoByName)

  Available for users with 'TENANT_ADMIN' authority.

```java
SecretInfo getSecretInfoByName(GetSecretInfoByNameArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetSecretInfoByNameArgs.builder()
        .name(String)
        .build()
```

### `GetSecretInfoByNameArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `name` | `String` | **yes** |  | |

### Return type

`SecretInfo`


## getSecretInfos

**GET** `/api/secrets`

Get Tenant Secret infos (getSecretInfos)

Returns a page of secret infos owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.

```java
PageDataSecretInfo getSecretInfos(GetSecretInfosArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetSecretInfosArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetSecretInfosArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the secret name and description. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `name` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataSecretInfo`


## getSecretNames

**GET** `/api/secret/names`

Get Tenant Secret names (getSecretNames)

Returns a page of secret names owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.

```java
List<String> getSecretNames()
```

### Return type

`List<String>`


## saveSecret

**POST** `/api/secret`

Save or Update Secret (saveSecret)

Create or update the Secret. When creating secret, platform generates Secret Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Secret Id will be present in the response. Specify existing Secret Id to update the secret. Secret name is not updatable, only value could be changed. Referencing non-existing Secret Id will cause 'Not Found' error.  Secret name is unique in the scope of tenant.

```java
SecretInfo saveSecret(SaveSecretArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveSecretArgs.builder()
        .secret(Secret)
        .build()
```

### `SaveSecretArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `secret` | `Secret` | **yes** |  | |

### Return type

`SecretInfo`


## updateSecretDescription

**PUT** `/api/secret/{id}/description`

Update Secret Description

Updates the description of the existing Secret by secretId. Only the description can be updated. Referencing a non-existing Secret Id will cause a 'Not Found' error.

```java
SecretInfo updateSecretDescription(UpdateSecretDescriptionArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UpdateSecretDescriptionArgs.builder()
        .id(UUID)
        .build()
```

### `UpdateSecretDescriptionArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `UUID` | **yes** | Unique identifier of the Secret to update | |
| `body` | `String` | no |  | |

### Return type

`SecretInfo`


## updateSecretValue

**PUT** `/api/secret/{id}/value`

Update Secret value

Updates the value of the existing Secret by secretId. Referencing a non-existing Secret Id will cause a 'Not Found' error.

```java
SecretInfo updateSecretValue(UpdateSecretValueArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UpdateSecretValueArgs.builder()
        .id(UUID)
        .body(String)
        .build()
```

### `UpdateSecretValueArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `UUID` | **yes** | Unique identifier of the Secret to update | |
| `body` | `String` | **yes** |  | |

### Return type

`SecretInfo`


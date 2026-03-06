# SecretControllerApi

`ThingsboardClient` methods:

```
TbSecretDeleteResult deleteSecret(@Nonnull UUID id) // Delete secret by ID (deleteSecret)
SecretInfo getSecretInfoById(@Nonnull UUID id) // Get Secret info by Id (getSecretInfoById)
SecretInfo getSecretInfoByName(@Nonnull String name) // Get Secret info by name (getSecretInfoByName)
PageDataSecretInfo getSecretInfos(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get Tenant Secret infos (getSecretInfos)
List<String> getSecretNames() // Get Tenant Secret names (getSecretNames)
SecretInfo saveSecret(@Nonnull Secret secret) // Save or Update Secret (saveSecret)
SecretInfo updateSecretDescription(@Nonnull UUID id, @Nullable String body) // Update Secret Description
SecretInfo updateSecretValue(@Nonnull UUID id, @Nonnull String body) // Update Secret value
```


## deleteSecret

```
TbSecretDeleteResult deleteSecret(@Nonnull UUID id)
```

**DELETE** `/api/secret/{id}`

Delete secret by ID (deleteSecret)

Deletes the secret. Referencing non-existing Secret Id will cause an error.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |

### Return type

**TbSecretDeleteResult**


## getSecretInfoById

```
SecretInfo getSecretInfoById(@Nonnull UUID id)
```

**GET** `/api/secret/{id}/info`

Get Secret info by Id (getSecretInfoById)

  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |

### Return type

**SecretInfo**


## getSecretInfoByName

```
SecretInfo getSecretInfoByName(@Nonnull String name)
```

**GET** `/api/secret`

Get Secret info by name (getSecretInfoByName)

  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String** |  | |

### Return type

**SecretInfo**


## getSecretInfos

```
PageDataSecretInfo getSecretInfos(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/secrets`

Get Tenant Secret infos (getSecretInfos)

Returns a page of secret infos owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the secret name and description. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: name] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataSecretInfo**


## getSecretNames

```
List<String> getSecretNames()
```

**GET** `/api/secret/names`

Get Tenant Secret names (getSecretNames)

Returns a page of secret names owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.

### Return type

**List<String>**


## saveSecret

```
SecretInfo saveSecret(@Nonnull Secret secret)
```

**POST** `/api/secret`

Save or Update Secret (saveSecret)

Create or update the Secret. When creating secret, platform generates Secret Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Secret Id will be present in the response. Specify existing Secret Id to update the secret. Secret name is not updatable, only value could be changed. Referencing non-existing Secret Id will cause 'Not Found' error.  Secret name is unique in the scope of tenant.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **secret** | **Secret** |  | |

### Return type

**SecretInfo**


## updateSecretDescription

```
SecretInfo updateSecretDescription(@Nonnull UUID id, @Nullable String body)
```

**PUT** `/api/secret/{id}/description`

Update Secret Description

Updates the description of the existing Secret by secretId. Only the description can be updated. Referencing a non-existing Secret Id will cause a 'Not Found' error.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** | Unique identifier of the Secret to update | |
| **body** | **String** |  | [optional] |

### Return type

**SecretInfo**


## updateSecretValue

```
SecretInfo updateSecretValue(@Nonnull UUID id, @Nonnull String body)
```

**PUT** `/api/secret/{id}/value`

Update Secret value

Updates the value of the existing Secret by secretId. Referencing a non-existing Secret Id will cause a 'Not Found' error.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** | Unique identifier of the Secret to update | |
| **body** | **String** |  | |

### Return type

**SecretInfo**


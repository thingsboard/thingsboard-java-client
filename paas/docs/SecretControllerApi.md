# SecretControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteSecret**](#deleteSecret) | **DELETE** /api/secret/{id} | Delete secret by ID (deleteSecret) |
| [**getSecretInfoById**](#getSecretInfoById) | **GET** /api/secret/{id}/info | Get Secret info by Id (getSecretInfoById) |
| [**getSecretInfoByName**](#getSecretInfoByName) | **GET** /api/secret | Get Secret info by name (getSecretInfoByName) |
| [**getSecretInfos**](#getSecretInfos) | **GET** /api/secrets | Get Tenant Secret infos (getSecretInfos) |
| [**getSecretNames**](#getSecretNames) | **GET** /api/secret/names | Get Tenant Secret names (getSecretNames) |
| [**saveSecret**](#saveSecret) | **POST** /api/secret | Save or Update Secret (saveSecret) |
| [**updateSecretDescription**](#updateSecretDescription) | **PUT** /api/secret/{id}/description | Update Secret Description |
| [**updateSecretValue**](#updateSecretValue) | **PUT** /api/secret/{id}/value | Update Secret value |



## deleteSecret

> TbSecretDeleteResult deleteSecret(id)

Delete secret by ID (deleteSecret)

Deletes the secret. Referencing non-existing Secret Id will cause an error.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |


## getSecretInfoById

> SecretInfo getSecretInfoById(id)

Get Secret info by Id (getSecretInfoById)

  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |


## getSecretInfoByName

> SecretInfo getSecretInfoByName(name)

Get Secret info by name (getSecretInfoByName)

  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String** |  | |


## getSecretInfos

> PageDataSecretInfo getSecretInfos(pageSize, page, textSearch, sortProperty, sortOrder)

Get Tenant Secret infos (getSecretInfos)

Returns a page of secret infos owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive &#39;substring&#39; filter based on the secret name and description. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: name] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |


## getSecretNames

> List&lt;String&gt; getSecretNames()

Get Tenant Secret names (getSecretNames)

Returns a page of secret names owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; authority.

## saveSecret

> SecretInfo saveSecret(secret)

Save or Update Secret (saveSecret)

Create or update the Secret. When creating secret, platform generates Secret Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Secret Id will be present in the response. Specify existing Secret Id to update the secret. Secret name is not updatable, only value could be changed. Referencing non-existing Secret Id will cause &#39;Not Found&#39; error.  Secret name is unique in the scope of tenant.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **secret** | **Secret** |  | |


## updateSecretDescription

> SecretInfo updateSecretDescription(id, body)

Update Secret Description

Updates the description of the existing Secret by secretId. Only the description can be updated. Referencing a non-existing Secret Id will cause a &#39;Not Found&#39; error.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** | Unique identifier of the Secret to update | |
| **body** | **String** |  | [optional] |


## updateSecretValue

> SecretInfo updateSecretValue(id, body)

Update Secret value

Updates the value of the existing Secret by secretId. Referencing a non-existing Secret Id will cause a &#39;Not Found&#39; error.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** | Unique identifier of the Secret to update | |
| **body** | **String** |  | |


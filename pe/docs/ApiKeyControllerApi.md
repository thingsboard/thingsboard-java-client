# ApiKeyControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteApiKey**](#deleteApiKey) | **DELETE** /api/apiKey/{id} | Delete API key by ID (deleteApiKey) |
| [**enableApiKey**](#enableApiKey) | **PUT** /api/apiKey/{id}/enabled/{enabledValue} | Enable or disable API key (enableApiKey) |
| [**getUserApiKeys**](#getUserApiKeys) | **GET** /api/apiKeys/{userId} | Get User Api Keys (getUserApiKeys) |
| [**saveApiKey**](#saveApiKey) | **POST** /api/apiKey | Save API key for user (saveApiKey) |
| [**updateApiKeyDescription**](#updateApiKeyDescription) | **PUT** /api/apiKey/{id}/description | Update API key Description |



## deleteApiKey

> deleteApiKey(id)

Delete API key by ID (deleteApiKey)

Deletes the API key. Referencing non-existing ApiKey Id will cause an error.  Available for any authorized user. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |

### Return type

null (empty response body)


## enableApiKey

> ApiKeyInfo enableApiKey(id, enabledValue)

Enable or disable API key (enableApiKey)

Updates api key with enabled = true/false.   Available for any authorized user. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** | Unique identifier of the API key to enable/disable | |
| **enabledValue** | **Boolean** | Enabled or disabled api key | |

### Return type

**ApiKeyInfo**


## getUserApiKeys

> PageDataApiKeyInfo getUserApiKeys(userId, pageSize, page, textSearch, sortProperty, sortOrder)

Get User Api Keys (getUserApiKeys)

Returns a page of api keys owned by user. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for any authorized user. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String** | A string value representing the user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the description. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, expirationTime, description, enabled] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataApiKeyInfo**


## saveApiKey

> ApiKey saveApiKey(apiKeyInfo)

Save API key for user (saveApiKey)

Creates an API key for the given user and returns the token ONCE as 'ApiKey <value>'.  Available for any authorized user. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKeyInfo** | **ApiKeyInfo** |  | |

### Return type

**ApiKey**


## updateApiKeyDescription

> ApiKeyInfo updateApiKeyDescription(id, body)

Update API key Description

Updates the description of the existing API key by apiKeyId. Only the description can be updated. Referencing a non-existing ApiKey Id will cause a 'Not Found' error.  Available for any authorized user. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** | A string value representing the api key id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **body** | **String** |  | [optional] |

### Return type

**ApiKeyInfo**


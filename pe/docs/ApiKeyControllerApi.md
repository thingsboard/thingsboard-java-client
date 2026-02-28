# ApiKeyControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteApiKey**](ApiKeyControllerApi.md#deleteApiKey) | **DELETE** /api/apiKey/{id} | Delete API key by ID (deleteApiKey) |
| [**enableApiKey**](ApiKeyControllerApi.md#enableApiKey) | **PUT** /api/apiKey/{id}/enabled/{enabledValue} | Enable or disable API key (enableApiKey) |
| [**getUserApiKeys**](ApiKeyControllerApi.md#getUserApiKeys) | **GET** /api/apiKeys/{userId} | Get User Api Keys (getUserApiKeys) |
| [**saveApiKey**](ApiKeyControllerApi.md#saveApiKey) | **POST** /api/apiKey | Save API key for user (saveApiKey) |
| [**updateApiKeyDescription**](ApiKeyControllerApi.md#updateApiKeyDescription) | **PUT** /api/apiKey/{id}/description | Update API key Description |



## deleteApiKey

> deleteApiKey(id)

Delete API key by ID (deleteApiKey)

Deletes the API key. Referencing non-existing ApiKey Id will cause an error.  Available for any authorized user. 

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

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


## enableApiKey

> ApiKeyInfo enableApiKey(id, enabledValue)

Enable or disable API key (enableApiKey)

Updates api key with enabled &#x3D; true/false.   Available for any authorized user. 

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| Unique identifier of the API key to enable/disable | |
| **enabledValue** | **Boolean**| Enabled or disabled api key | |

### Return type

[**ApiKeyInfo**](ApiKeyInfo.md)

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


## getUserApiKeys

> PageDataApiKeyInfo getUserApiKeys(userId, pageSize, page, textSearch, sortProperty, sortOrder)

Get User Api Keys (getUserApiKeys)

Returns a page of api keys owned by user. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for any authorized user. 

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**| A string value representing the user id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the description. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, expirationTime, description, enabled] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataApiKeyInfo**](PageDataApiKeyInfo.md)

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


## saveApiKey

> ApiKey saveApiKey(apiKeyInfo)

Save API key for user (saveApiKey)

Creates an API key for the given user and returns the token ONCE as &#39;ApiKey &lt;value&gt;&#39;.  Available for any authorized user. 

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKeyInfo** | [**ApiKeyInfo**](ApiKeyInfo.md)|  | |

### Return type

[**ApiKey**](ApiKey.md)

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


## updateApiKeyDescription

> ApiKeyInfo updateApiKeyDescription(id, body)

Update API key Description

Updates the description of the existing API key by apiKeyId. Only the description can be updated. Referencing a non-existing ApiKey Id will cause a &#39;Not Found&#39; error.  Available for any authorized user. 

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| A string value representing the api key id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **body** | **String**|  | [optional] |

### Return type

[**ApiKeyInfo**](ApiKeyInfo.md)

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


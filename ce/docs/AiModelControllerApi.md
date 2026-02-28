# AiModelControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteAiModelById**](AiModelControllerApi.md#deleteAiModelById) | **DELETE** /api/ai/model/{modelUuid} | Delete AI model by ID (deleteAiModelById) |
| [**getAiModelById**](AiModelControllerApi.md#getAiModelById) | **GET** /api/ai/model/{modelUuid} | Get AI model by ID (getAiModelById) |
| [**getAiModels**](AiModelControllerApi.md#getAiModels) | **GET** /api/ai/model | Get AI models (getAiModels) |
| [**saveAiModel**](AiModelControllerApi.md#saveAiModel) | **POST** /api/ai/model | Create or update AI model (saveAiModel) |
| [**sendChatRequest**](AiModelControllerApi.md#sendChatRequest) | **POST** /api/ai/model/chat | Send request to AI chat model (sendChatRequest) |



## deleteAiModelById

> Boolean deleteAiModelById(modelUuid)

Delete AI model by ID (deleteAiModelById)

Deletes the AI model record by its &#x60;id&#x60;. If a record with the specified &#x60;id&#x60; exists, the record is deleted and the endpoint returns &#x60;true&#x60;. If no such record exists, the endpoint returns &#x60;false&#x60;.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelUuid** | **UUID**| ID of the AI model record | |

### Return type

**Boolean**

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


## getAiModelById

> AiModel getAiModelById(modelUuid)

Get AI model by ID (getAiModelById)

Fetches an AI model record by its &#x60;id&#x60;.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelUuid** | **UUID**| ID of the AI model record | |

### Return type

[**AiModel**](AiModel.md)

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


## getAiModels

> PageDataAiModel getAiModels(pageSize, page, textSearch, sortProperty, sortOrder)

Get AI models (getAiModels)

Returns a page of AI models. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the AI model name, provider and model ID. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, name, provider, modelId] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataAiModel**](PageDataAiModel.md)

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


## saveAiModel

> AiModel saveAiModel(aiModel)

Create or update AI model (saveAiModel)

Creates or updates an AI model record.  • **Create:** Omit the &#x60;id&#x60; to create a new record. The platform assigns a UUID to the new record and returns it in the &#x60;id&#x60; field of the response.  • **Update:** Include an existing &#x60;id&#x60; to modify that record. If no matching record exists, the API responds with **404 Not Found**.  Tenant ID for the AI model will be taken from the authenticated user making the request, regardless of any value provided in the request body.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiModel** | [**AiModel**](AiModel.md)|  | |

### Return type

[**AiModel**](AiModel.md)

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


## sendChatRequest

> TbChatResponse sendChatRequest(tbChatRequest)

Send request to AI chat model (sendChatRequest)

Submits a single prompt - made up of an optional system message and a required user message - to the specified AI chat model and returns either the generated answer or an error envelope.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tbChatRequest** | [**TbChatRequest**](TbChatRequest.md)|  | |

### Return type

[**TbChatResponse**](TbChatResponse.md)

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


# AiModelControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteAiModelById**](#deleteAiModelById) | **DELETE** /api/ai/model/{modelUuid} | Delete AI model by ID (deleteAiModelById) |
| [**getAiModelById**](#getAiModelById) | **GET** /api/ai/model/{modelUuid} | Get AI model by ID (getAiModelById) |
| [**getAiModels**](#getAiModels) | **GET** /api/ai/model | Get AI models (getAiModels) |
| [**saveAiModel**](#saveAiModel) | **POST** /api/ai/model | Create or update AI model (saveAiModel) |
| [**sendChatRequest**](#sendChatRequest) | **POST** /api/ai/model/chat | Send request to AI chat model (sendChatRequest) |



## deleteAiModelById

> Boolean deleteAiModelById(modelUuid)

Delete AI model by ID (deleteAiModelById)

Deletes the AI model record by its `id`. If a record with the specified `id` exists, the record is deleted and the endpoint returns `true`. If no such record exists, the endpoint returns `false`.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelUuid** | **UUID** | ID of the AI model record | |

### Return type

**Boolean**


## getAiModelById

> AiModel getAiModelById(modelUuid)

Get AI model by ID (getAiModelById)

Fetches an AI model record by its `id`.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelUuid** | **UUID** | ID of the AI model record | |

### Return type

**AiModel**


## getAiModels

> PageDataAiModel getAiModels(pageSize, page, textSearch, sortProperty, sortOrder)

Get AI models (getAiModels)

Returns a page of AI models. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the AI model name, provider and model ID. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, provider, modelId] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataAiModel**


## saveAiModel

> AiModel saveAiModel(aiModel)

Create or update AI model (saveAiModel)

Creates or updates an AI model record.  • **Create:** Omit the `id` to create a new record. The platform assigns a UUID to the new record and returns it in the `id` field of the response.  • **Update:** Include an existing `id` to modify that record. If no matching record exists, the API responds with **404 Not Found**.  Tenant ID for the AI model will be taken from the authenticated user making the request, regardless of any value provided in the request body.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiModel** | **AiModel** |  | |

### Return type

**AiModel**


## sendChatRequest

> TbChatResponse sendChatRequest(tbChatRequest)

Send request to AI chat model (sendChatRequest)

Submits a single prompt - made up of an optional system message and a required user message - to the specified AI chat model and returns either the generated answer or an error envelope.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tbChatRequest** | **TbChatRequest** |  | |

### Return type

**TbChatResponse**


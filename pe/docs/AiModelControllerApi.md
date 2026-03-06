# AiModelControllerApi

`ThingsboardClient` methods:

```
Boolean deleteAiModelById(@Nonnull UUID modelUuid) // Delete AI model by ID (deleteAiModelById)
AiModel getAiModelById(@Nonnull UUID modelUuid) // Get AI model by ID (getAiModelById)
PageDataAiModel getAiModels(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get AI models (getAiModels)
AiModel saveAiModel(@Nonnull AiModel aiModel) // Create or update AI model (saveAiModel)
TbChatResponse sendChatRequest(@Nonnull TbChatRequest tbChatRequest) // Send request to AI chat model (sendChatRequest)
```


## deleteAiModelById

```
Boolean deleteAiModelById(@Nonnull UUID modelUuid)
```

**DELETE** `/api/ai/model/{modelUuid}`

Delete AI model by ID (deleteAiModelById)

Deletes the AI model record by its `id`. If a record with the specified `id` exists, the record is deleted and the endpoint returns `true`. If no such record exists, the endpoint returns `false`.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelUuid** | **UUID** | ID of the AI model record | |

### Return type

**Boolean**


## getAiModelById

```
AiModel getAiModelById(@Nonnull UUID modelUuid)
```

**GET** `/api/ai/model/{modelUuid}`

Get AI model by ID (getAiModelById)

Fetches an AI model record by its `id`.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelUuid** | **UUID** | ID of the AI model record | |

### Return type

**AiModel**


## getAiModels

```
PageDataAiModel getAiModels(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/ai/model`

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

```
AiModel saveAiModel(@Nonnull AiModel aiModel)
```

**POST** `/api/ai/model`

Create or update AI model (saveAiModel)

Creates or updates an AI model record.  • **Create:** Omit the `id` to create a new record. The platform assigns a UUID to the new record and returns it in the `id` field of the response.  • **Update:** Include an existing `id` to modify that record. If no matching record exists, the API responds with **404 Not Found**.  Tenant ID for the AI model will be taken from the authenticated user making the request, regardless of any value provided in the request body.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiModel** | **AiModel** |  | |

### Return type

**AiModel**


## sendChatRequest

```
TbChatResponse sendChatRequest(@Nonnull TbChatRequest tbChatRequest)
```

**POST** `/api/ai/model/chat`

Send request to AI chat model (sendChatRequest)

Submits a single prompt - made up of an optional system message and a required user message - to the specified AI chat model and returns either the generated answer or an error envelope.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tbChatRequest** | **TbChatRequest** |  | |

### Return type

**TbChatResponse**


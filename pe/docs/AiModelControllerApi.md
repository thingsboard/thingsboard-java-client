# AiModelControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
Boolean deleteAiModelById(DeleteAiModelByIdArgs args) // Delete AI model by ID (deleteAiModelById)
AiModel getAiModelById(GetAiModelByIdArgs args) // Get AI model by ID (getAiModelById)
PageDataAiModel getAiModels(GetAiModelsArgs args) // Get AI models (getAiModels)
AiModel saveAiModel(SaveAiModelArgs args) // Create or update AI model (saveAiModel)
TbChatResponse sendChatRequest(SendChatRequestArgs args) // Send request to AI chat model (sendChatRequest)
```


## deleteAiModelById

**DELETE** `/api/ai/model/{modelUuid}`

Delete AI model by ID (deleteAiModelById)

Deletes the AI model record by its `id`. If a record with the specified `id` exists, the record is deleted and the endpoint returns `true`. If no such record exists, the endpoint returns `false`.  Available for users with 'TENANT_ADMIN' authority.

```java
Boolean deleteAiModelById(DeleteAiModelByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteAiModelByIdArgs.builder()
        .modelUuid(UUID)
        .build()
```

### `DeleteAiModelByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `modelUuid` | `UUID` | **yes** | ID of the AI model record | |

### Return type

`Boolean`


## getAiModelById

**GET** `/api/ai/model/{modelUuid}`

Get AI model by ID (getAiModelById)

Fetches an AI model record by its `id`.  Available for users with 'TENANT_ADMIN' authority.

```java
AiModel getAiModelById(GetAiModelByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAiModelByIdArgs.builder()
        .modelUuid(UUID)
        .build()
```

### `GetAiModelByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `modelUuid` | `UUID` | **yes** | ID of the AI model record | |

### Return type

`AiModel`


## getAiModels

**GET** `/api/ai/model`

Get AI models (getAiModels)

Returns a page of AI models. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.

```java
PageDataAiModel getAiModels(GetAiModelsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAiModelsArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetAiModelsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the AI model name, provider and model ID. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `provider`, `modelId` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataAiModel`


## saveAiModel

**POST** `/api/ai/model`

Create or update AI model (saveAiModel)

Creates or updates an AI model record.  • **Create:** Omit the `id` to create a new record. The platform assigns a UUID to the new record and returns it in the `id` field of the response.  • **Update:** Include an existing `id` to modify that record. If no matching record exists, the API responds with **404 Not Found**.  Tenant ID for the AI model will be taken from the authenticated user making the request, regardless of any value provided in the request body.  Available for users with 'TENANT_ADMIN' authority.

```java
AiModel saveAiModel(SaveAiModelArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveAiModelArgs.builder()
        .aiModel(AiModel)
        .build()
```

### `SaveAiModelArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `aiModel` | `AiModel` | **yes** |  | |

### Return type

`AiModel`


## sendChatRequest

**POST** `/api/ai/model/chat`

Send request to AI chat model (sendChatRequest)

Submits a single prompt - made up of an optional system message and a required user message - to the specified AI chat model and returns either the generated answer or an error envelope.  Available for users with 'TENANT_ADMIN' authority.

```java
TbChatResponse sendChatRequest(SendChatRequestArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SendChatRequestArgs.builder()
        .tbChatRequest(TbChatRequest)
        .build()
```

### `SendChatRequestArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `tbChatRequest` | `TbChatRequest` | **yes** |  | |

### Return type

`TbChatResponse`


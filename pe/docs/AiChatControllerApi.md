# AiChatControllerApi

`ThingsboardClient` methods:

```
com.fasterxml.jackson.databind.JsonNode createChat(@Nonnull Object body) // createChat
void deleteChat(@Nonnull UUID chatId) // deleteChat
com.fasterxml.jackson.databind.JsonNode getChatMessages(@Nonnull UUID chatId) // getChatMessages
com.fasterxml.jackson.databind.JsonNode listChats(@Nonnull ChatType chatType) // listChats
List<Object> sendChatMessage(@Nonnull UUID chatId, @Nonnull String xAuthorization, @Nonnull String body) // sendChatMessage
void updateChat(@Nonnull UUID chatId, @Nonnull Object body) // updateChat
```


## createChat

```
com.fasterxml.jackson.databind.JsonNode createChat(@Nonnull Object body)
```

**POST** `/api/ai/chats`

createChat


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object** |  | |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## deleteChat

```
void deleteChat(@Nonnull UUID chatId)
```

**DELETE** `/api/ai/chats/{chatId}`

deleteChat


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **chatId** | **UUID** |  | |

### Return type

null (empty response body)


## getChatMessages

```
com.fasterxml.jackson.databind.JsonNode getChatMessages(@Nonnull UUID chatId)
```

**GET** `/api/ai/chats/{chatId}/messages`

getChatMessages


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **chatId** | **UUID** |  | |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## listChats

```
com.fasterxml.jackson.databind.JsonNode listChats(@Nonnull ChatType chatType)
```

**GET** `/api/ai/chats/{chatType}`

listChats


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **chatType** | **ChatType** |  | [enum: GENERIC, SOLUTION_BUILDER] |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## sendChatMessage

```
List<Object> sendChatMessage(@Nonnull UUID chatId, @Nonnull String xAuthorization, @Nonnull String body)
```

**POST** `/api/ai/chats/{chatId}/messages`

sendChatMessage


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **chatId** | **UUID** |  | |
| **xAuthorization** | **String** |  | |
| **body** | **String** |  | |

### Return type

**List<Object>**


## updateChat

```
void updateChat(@Nonnull UUID chatId, @Nonnull Object body)
```

**PATCH** `/api/ai/chats/{chatId}`

updateChat


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **chatId** | **UUID** |  | |
| **body** | **Object** |  | |

### Return type

null (empty response body)


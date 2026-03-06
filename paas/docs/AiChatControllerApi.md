# AiChatControllerApi

`ThingsboardClient` methods:

```
com.fasterxml.jackson.databind.JsonNode createChat(@Nonnull Object body) // createChat
void deleteChat(@Nonnull UUID chatId) // deleteChat
byte[] exportChat(@Nonnull UUID chatId, @Nullable Boolean includeAuditLogs) // exportChat
com.fasterxml.jackson.databind.JsonNode getChatMessages(@Nonnull UUID chatId) // getChatMessages
com.fasterxml.jackson.databind.JsonNode listChats() // listChats
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


## exportChat

```
byte[] exportChat(@Nonnull UUID chatId, @Nullable Boolean includeAuditLogs)
```

**GET** `/api/ai/chats/{chatId}/export`

exportChat


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **chatId** | **UUID** |  | |
| **includeAuditLogs** | **Boolean** |  | [optional] [default to false] |

### Return type

**byte[]**


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
com.fasterxml.jackson.databind.JsonNode listChats()
```

**GET** `/api/ai/chats`

listChats

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


# AiChatControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
com.fasterxml.jackson.databind.JsonNode createChat(CreateChatArgs args) // createChat
void deleteChat(DeleteChatArgs args) // deleteChat
com.fasterxml.jackson.databind.JsonNode getChatMessages(GetChatMessagesArgs args) // getChatMessages
com.fasterxml.jackson.databind.JsonNode listChats(ListChatsArgs args) // listChats
List<Object> sendChatMessage(SendChatMessageArgs args) // sendChatMessage
void updateChat(UpdateChatArgs args) // updateChat
```


## createChat

**POST** `/api/ai/chats`

createChat

```java
com.fasterxml.jackson.databind.JsonNode createChat(CreateChatArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
CreateChatArgs.builder()
        .body(Object)
        .build()
```

### `CreateChatArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `body` | `Object` | **yes** |  | |

### Return type

`com.fasterxml.jackson.databind.JsonNode`


## deleteChat

**DELETE** `/api/ai/chats/{chatId}`

deleteChat

```java
void deleteChat(DeleteChatArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteChatArgs.builder()
        .chatId(UUID)
        .build()
```

### `DeleteChatArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `chatId` | `UUID` | **yes** |  | |

### Return type

null (empty response body)


## getChatMessages

**GET** `/api/ai/chats/{chatId}/messages`

getChatMessages

```java
com.fasterxml.jackson.databind.JsonNode getChatMessages(GetChatMessagesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetChatMessagesArgs.builder()
        .chatId(UUID)
        .build()
```

### `GetChatMessagesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `chatId` | `UUID` | **yes** |  | |

### Return type

`com.fasterxml.jackson.databind.JsonNode`


## listChats

**GET** `/api/ai/chats/{chatType}`

listChats

```java
com.fasterxml.jackson.databind.JsonNode listChats(ListChatsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ListChatsArgs.builder()
        .chatType(ChatType)
        .build()
```

### `ListChatsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `chatType` | `ChatType` | **yes** |  | enum: `GENERIC`, `SOLUTION_BUILDER` |

### Return type

`com.fasterxml.jackson.databind.JsonNode`


## sendChatMessage

**POST** `/api/ai/chats/{chatId}/messages`

sendChatMessage

```java
List<Object> sendChatMessage(SendChatMessageArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SendChatMessageArgs.builder()
        .chatId(UUID)
        .xAuthorization(String)
        .body(String)
        .build()
```

### `SendChatMessageArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `chatId` | `UUID` | **yes** |  | |
| `xAuthorization` | `String` | **yes** |  | |
| `body` | `String` | **yes** |  | |
| `acceptLanguage` | `String` | no |  | |

### Return type

`List<Object>`


## updateChat

**PATCH** `/api/ai/chats/{chatId}`

updateChat

```java
void updateChat(UpdateChatArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UpdateChatArgs.builder()
        .chatId(UUID)
        .body(Object)
        .build()
```

### `UpdateChatArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `chatId` | `UUID` | **yes** |  | |
| `body` | `Object` | **yes** |  | |

### Return type

null (empty response body)


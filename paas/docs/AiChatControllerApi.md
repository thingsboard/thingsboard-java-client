# AiChatControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createChat**](#createChat) | **POST** /api/ai/chats | createChat |
| [**deleteChat**](#deleteChat) | **DELETE** /api/ai/chats/{chatId} | deleteChat |
| [**exportChat**](#exportChat) | **GET** /api/ai/chats/{chatId}/export | exportChat |
| [**getChatMessages**](#getChatMessages) | **GET** /api/ai/chats/{chatId}/messages | getChatMessages |
| [**listChats**](#listChats) | **GET** /api/ai/chats | listChats |
| [**sendChatMessage**](#sendChatMessage) | **POST** /api/ai/chats/{chatId}/messages | sendChatMessage |
| [**updateChat**](#updateChat) | **PATCH** /api/ai/chats/{chatId} | updateChat |



## createChat

> com.fasterxml.jackson.databind.JsonNode createChat(body)

createChat


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object** |  | |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## deleteChat

> deleteChat(chatId)

deleteChat


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **chatId** | **UUID** |  | |

### Return type

null (empty response body)


## exportChat

> byte[] exportChat(chatId, includeAuditLogs)

exportChat


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **chatId** | **UUID** |  | |
| **includeAuditLogs** | **Boolean** |  | [optional] [default to false] |

### Return type

**byte[]**


## getChatMessages

> com.fasterxml.jackson.databind.JsonNode getChatMessages(chatId)

getChatMessages


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **chatId** | **UUID** |  | |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## listChats

> com.fasterxml.jackson.databind.JsonNode listChats()

listChats

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## sendChatMessage

> List<Object> sendChatMessage(chatId, xAuthorization, body)

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

> updateChat(chatId, body)

updateChat


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **chatId** | **UUID** |  | |
| **body** | **Object** |  | |

### Return type

null (empty response body)


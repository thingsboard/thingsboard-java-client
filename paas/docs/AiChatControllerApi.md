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


## deleteChat

> deleteChat(chatId)

deleteChat

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **chatId** | **UUID** |  | |


## exportChat

> byte[] exportChat(chatId, includeAuditLogs)

exportChat

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **chatId** | **UUID** |  | |
| **includeAuditLogs** | **Boolean** |  | [optional] [default to false] |


## getChatMessages

> com.fasterxml.jackson.databind.JsonNode getChatMessages(chatId)

getChatMessages

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **chatId** | **UUID** |  | |


## listChats

> com.fasterxml.jackson.databind.JsonNode listChats()

listChats

## sendChatMessage

> List&lt;Object&gt; sendChatMessage(chatId, xAuthorization, body)

sendChatMessage

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **chatId** | **UUID** |  | |
| **xAuthorization** | **String** |  | |
| **body** | **String** |  | |


## updateChat

> updateChat(chatId, body)

updateChat

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **chatId** | **UUID** |  | |
| **body** | **Object** |  | |


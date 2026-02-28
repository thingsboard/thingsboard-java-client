# AiAuditLogControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAuditLogs1**](#getAuditLogs1) | **GET** /api/ai/audit-logs | getAuditLogs |



## getAuditLogs1

> com.fasterxml.jackson.databind.JsonNode getAuditLogs1(sourceId, status)

getAuditLogs

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceId** | **UUID** |  | [optional] |
| **status** | **AuditLogStatusFilter** |  | [optional] [default to ALL] [enum: SUCCESS, FAILURE, ALL] |


# AiAuditLogControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAiAuditLogs**](#getAiAuditLogs) | **GET** /api/ai/audit-logs | getAiAuditLogs |



## getAiAuditLogs

> com.fasterxml.jackson.databind.JsonNode getAiAuditLogs(sourceId, status)

getAiAuditLogs


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceId** | **UUID** |  | [optional] |
| **status** | **AuditLogStatusFilter** |  | [optional] [default to ALL] [enum: SUCCESS, FAILURE, ALL] |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


# AiAuditLogControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAuditLogs1**](AiAuditLogControllerApi.md#getAuditLogs1) | **GET** /api/ai/audit-logs | getAuditLogs |



## getAuditLogs1

> com.fasterxml.jackson.databind.JsonNode getAuditLogs1(sourceId, status)

getAuditLogs

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceId** | **UUID**|  | [optional] |
| **status** | [**AuditLogStatusFilter**](.md)|  | [optional] [default to ALL] [enum: SUCCESS, FAILURE, ALL] |

### Return type

[**com.fasterxml.jackson.databind.JsonNode**](com.fasterxml.jackson.databind.JsonNode.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


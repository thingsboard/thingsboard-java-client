# AiToolControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**resolveToolApproval**](AiToolControllerApi.md#resolveToolApproval) | **POST** /api/ai/tools/resolve-approval | resolveToolApproval |



## resolveToolApproval

> com.fasterxml.jackson.databind.JsonNode resolveToolApproval(body)

resolveToolApproval

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object**|  | |

### Return type

[**com.fasterxml.jackson.databind.JsonNode**](com.fasterxml.jackson.databind.JsonNode.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: application/json
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


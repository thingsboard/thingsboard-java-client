# MailConfigTemplateControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getClientRegistrationTemplates1**](MailConfigTemplateControllerApi.md#getClientRegistrationTemplates1) | **GET** /api/mail/config/template | Get the list of all OAuth2 client registration templates (getClientRegistrationTemplates)  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority. |



## getClientRegistrationTemplates1

> com.fasterxml.jackson.databind.JsonNode getClientRegistrationTemplates1()

Get the list of all OAuth2 client registration templates (getClientRegistrationTemplates)  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

Mail configuration template is set of default smtp settings for mail server that specific provider supports

### Parameters

This endpoint does not need any parameter.

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


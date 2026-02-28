# OAuth2ConfigTemplateControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteClientRegistrationTemplate**](OAuth2ConfigTemplateControllerApi.md#deleteClientRegistrationTemplate) | **DELETE** /api/oauth2/config/template/{clientRegistrationTemplateId} | Delete OAuth2 client registration template by id (deleteClientRegistrationTemplate)  Available for users with &#39;SYS_ADMIN&#39; authority. |
| [**getClientRegistrationTemplates**](OAuth2ConfigTemplateControllerApi.md#getClientRegistrationTemplates) | **GET** /api/oauth2/config/template | Get the list of all OAuth2 client registration templates (getClientRegistrationTemplates)  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority. |
| [**saveClientRegistrationTemplate**](OAuth2ConfigTemplateControllerApi.md#saveClientRegistrationTemplate) | **POST** /api/oauth2/config/template | Create or update OAuth2 client registration template (saveClientRegistrationTemplate)  Available for users with &#39;SYS_ADMIN&#39; authority. |



## deleteClientRegistrationTemplate

> deleteClientRegistrationTemplate(clientRegistrationTemplateId)

Delete OAuth2 client registration template by id (deleteClientRegistrationTemplate)  Available for users with &#39;SYS_ADMIN&#39; authority.

Client registration template is OAuth2 provider configuration template with default settings for registering new OAuth2 clients

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientRegistrationTemplateId** | **String**| String representation of client registration template id to delete | |

### Return type

null (empty response body)

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


## getClientRegistrationTemplates

> List&lt;OAuth2ClientRegistrationTemplate&gt; getClientRegistrationTemplates()

Get the list of all OAuth2 client registration templates (getClientRegistrationTemplates)  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

Client registration template is OAuth2 provider configuration template with default settings for registering new OAuth2 clients

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;OAuth2ClientRegistrationTemplate&gt;**](OAuth2ClientRegistrationTemplate.md)

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


## saveClientRegistrationTemplate

> OAuth2ClientRegistrationTemplate saveClientRegistrationTemplate(oauth2ClientRegistrationTemplate)

Create or update OAuth2 client registration template (saveClientRegistrationTemplate)  Available for users with &#39;SYS_ADMIN&#39; authority.

Client registration template is OAuth2 provider configuration template with default settings for registering new OAuth2 clients

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **oauth2ClientRegistrationTemplate** | [**OAuth2ClientRegistrationTemplate**](OAuth2ClientRegistrationTemplate.md)|  | |

### Return type

[**OAuth2ClientRegistrationTemplate**](OAuth2ClientRegistrationTemplate.md)

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


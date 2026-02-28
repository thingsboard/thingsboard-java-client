# OAuth2ConfigTemplateControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteClientRegistrationTemplate**](#deleteClientRegistrationTemplate) | **DELETE** /api/oauth2/config/template/{clientRegistrationTemplateId} | Delete OAuth2 client registration template by id (deleteClientRegistrationTemplate)  Available for users with 'SYS_ADMIN' authority. |
| [**getClientRegistrationTemplates**](#getClientRegistrationTemplates) | **GET** /api/oauth2/config/template | Get the list of all OAuth2 client registration templates (getClientRegistrationTemplates)  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority. |
| [**saveClientRegistrationTemplate**](#saveClientRegistrationTemplate) | **POST** /api/oauth2/config/template | Create or update OAuth2 client registration template (saveClientRegistrationTemplate)  Available for users with 'SYS_ADMIN' authority. |



## deleteClientRegistrationTemplate

> deleteClientRegistrationTemplate(clientRegistrationTemplateId)

Delete OAuth2 client registration template by id (deleteClientRegistrationTemplate)  Available for users with 'SYS_ADMIN' authority.

Client registration template is OAuth2 provider configuration template with default settings for registering new OAuth2 clients


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientRegistrationTemplateId** | **String** | String representation of client registration template id to delete | |

### Return type

null (empty response body)


## getClientRegistrationTemplates

> List<OAuth2ClientRegistrationTemplate> getClientRegistrationTemplates()

Get the list of all OAuth2 client registration templates (getClientRegistrationTemplates)  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

Client registration template is OAuth2 provider configuration template with default settings for registering new OAuth2 clients

### Return type

**List<OAuth2ClientRegistrationTemplate>**


## saveClientRegistrationTemplate

> OAuth2ClientRegistrationTemplate saveClientRegistrationTemplate(oauth2ClientRegistrationTemplate)

Create or update OAuth2 client registration template (saveClientRegistrationTemplate)  Available for users with 'SYS_ADMIN' authority.

Client registration template is OAuth2 provider configuration template with default settings for registering new OAuth2 clients


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **oauth2ClientRegistrationTemplate** | **OAuth2ClientRegistrationTemplate** |  | |

### Return type

**OAuth2ClientRegistrationTemplate**


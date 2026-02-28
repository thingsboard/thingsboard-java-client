# OAuth2ConfigTemplateControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteClientRegistrationTemplate**](#deleteClientRegistrationTemplate) | **DELETE** /api/oauth2/config/template/{clientRegistrationTemplateId} | Delete OAuth2 client registration template by id (deleteClientRegistrationTemplate)  Available for users with &#39;SYS_ADMIN&#39; authority. |
| [**getClientRegistrationTemplates**](#getClientRegistrationTemplates) | **GET** /api/oauth2/config/template | Get the list of all OAuth2 client registration templates (getClientRegistrationTemplates)  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority. |
| [**saveClientRegistrationTemplate**](#saveClientRegistrationTemplate) | **POST** /api/oauth2/config/template | Create or update OAuth2 client registration template (saveClientRegistrationTemplate)  Available for users with &#39;SYS_ADMIN&#39; authority. |



## deleteClientRegistrationTemplate

> deleteClientRegistrationTemplate(clientRegistrationTemplateId)

Delete OAuth2 client registration template by id (deleteClientRegistrationTemplate)  Available for users with &#39;SYS_ADMIN&#39; authority.

Client registration template is OAuth2 provider configuration template with default settings for registering new OAuth2 clients

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientRegistrationTemplateId** | **String** | String representation of client registration template id to delete | |


## getClientRegistrationTemplates

> List&lt;OAuth2ClientRegistrationTemplate&gt; getClientRegistrationTemplates()

Get the list of all OAuth2 client registration templates (getClientRegistrationTemplates)  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

Client registration template is OAuth2 provider configuration template with default settings for registering new OAuth2 clients

## saveClientRegistrationTemplate

> OAuth2ClientRegistrationTemplate saveClientRegistrationTemplate(oauth2ClientRegistrationTemplate)

Create or update OAuth2 client registration template (saveClientRegistrationTemplate)  Available for users with &#39;SYS_ADMIN&#39; authority.

Client registration template is OAuth2 provider configuration template with default settings for registering new OAuth2 clients

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **oauth2ClientRegistrationTemplate** | **OAuth2ClientRegistrationTemplate** |  | |


# OAuth2ConfigTemplateControllerApi

`ThingsboardClient` methods:

```
void deleteClientRegistrationTemplate(@Nonnull String clientRegistrationTemplateId) // Delete OAuth2 client registration template by id (deleteClientRegistrationTemplate)  Available for users with 'SYS_ADMIN' authority.
List<OAuth2ClientRegistrationTemplate> getOAuth2ClientRegistrationTemplates() // Get the list of all OAuth2 client registration templates (getOAuth2ClientRegistrationTemplates)  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.
OAuth2ClientRegistrationTemplate saveClientRegistrationTemplate(@Nonnull OAuth2ClientRegistrationTemplate oauth2ClientRegistrationTemplate) // Create or update OAuth2 client registration template (saveClientRegistrationTemplate)  Available for users with 'SYS_ADMIN' authority.
```


## deleteClientRegistrationTemplate

```
void deleteClientRegistrationTemplate(@Nonnull String clientRegistrationTemplateId)
```

**DELETE** `/api/oauth2/config/template/{clientRegistrationTemplateId}`

Delete OAuth2 client registration template by id (deleteClientRegistrationTemplate)  Available for users with 'SYS_ADMIN' authority.

Client registration template is OAuth2 provider configuration template with default settings for registering new OAuth2 clients


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientRegistrationTemplateId** | **String** | String representation of client registration template id to delete | |

### Return type

null (empty response body)


## getOAuth2ClientRegistrationTemplates

```
List<OAuth2ClientRegistrationTemplate> getOAuth2ClientRegistrationTemplates()
```

**GET** `/api/oauth2/config/template`

Get the list of all OAuth2 client registration templates (getOAuth2ClientRegistrationTemplates)  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

Client registration template is OAuth2 provider configuration template with default settings for registering new OAuth2 clients

### Return type

**List<OAuth2ClientRegistrationTemplate>**


## saveClientRegistrationTemplate

```
OAuth2ClientRegistrationTemplate saveClientRegistrationTemplate(@Nonnull OAuth2ClientRegistrationTemplate oauth2ClientRegistrationTemplate)
```

**POST** `/api/oauth2/config/template`

Create or update OAuth2 client registration template (saveClientRegistrationTemplate)  Available for users with 'SYS_ADMIN' authority.

Client registration template is OAuth2 provider configuration template with default settings for registering new OAuth2 clients


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **oauth2ClientRegistrationTemplate** | **OAuth2ClientRegistrationTemplate** |  | |

### Return type

**OAuth2ClientRegistrationTemplate**


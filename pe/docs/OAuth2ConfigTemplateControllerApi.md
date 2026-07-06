# OAuth2ConfigTemplateControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void deleteClientRegistrationTemplate(DeleteClientRegistrationTemplateArgs args) // Delete OAuth2 client registration template by id (deleteClientRegistrationTemplate)  Available for users with 'SYS_ADMIN' authority.
List<OAuth2ClientRegistrationTemplate> getOAuth2ClientRegistrationTemplates() // Get the list of all OAuth2 client registration templates (getOAuth2ClientRegistrationTemplates)  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.
OAuth2ClientRegistrationTemplate saveClientRegistrationTemplate(SaveClientRegistrationTemplateArgs args) // Create or update OAuth2 client registration template (saveClientRegistrationTemplate)  Available for users with 'SYS_ADMIN' authority.
```


## deleteClientRegistrationTemplate

**DELETE** `/api/oauth2/config/template/{clientRegistrationTemplateId}`

Delete OAuth2 client registration template by id (deleteClientRegistrationTemplate)  Available for users with 'SYS_ADMIN' authority.

Client registration template is OAuth2 provider configuration template with default settings for registering new OAuth2 clients

```java
void deleteClientRegistrationTemplate(DeleteClientRegistrationTemplateArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteClientRegistrationTemplateArgs.builder()
        .clientRegistrationTemplateId(String)
        .build()
```

### `DeleteClientRegistrationTemplateArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `clientRegistrationTemplateId` | `String` | **yes** | String representation of client registration template id to delete | |

### Return type

null (empty response body)


## getOAuth2ClientRegistrationTemplates

**GET** `/api/oauth2/config/template`

Get the list of all OAuth2 client registration templates (getOAuth2ClientRegistrationTemplates)  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

Client registration template is OAuth2 provider configuration template with default settings for registering new OAuth2 clients

```java
List<OAuth2ClientRegistrationTemplate> getOAuth2ClientRegistrationTemplates()
```

### Return type

`List<OAuth2ClientRegistrationTemplate>`


## saveClientRegistrationTemplate

**POST** `/api/oauth2/config/template`

Create or update OAuth2 client registration template (saveClientRegistrationTemplate)  Available for users with 'SYS_ADMIN' authority.

Client registration template is OAuth2 provider configuration template with default settings for registering new OAuth2 clients

```java
OAuth2ClientRegistrationTemplate saveClientRegistrationTemplate(SaveClientRegistrationTemplateArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveClientRegistrationTemplateArgs.builder()
        .oauth2ClientRegistrationTemplate(OAuth2ClientRegistrationTemplate)
        .build()
```

### `SaveClientRegistrationTemplateArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `oauth2ClientRegistrationTemplate` | `OAuth2ClientRegistrationTemplate` | **yes** |  | |

### Return type

`OAuth2ClientRegistrationTemplate`


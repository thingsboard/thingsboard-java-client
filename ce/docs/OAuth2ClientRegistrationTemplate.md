
# OAuth2ClientRegistrationTemplate

`org.thingsboard.client.model.OAuth2ClientRegistrationTemplate`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **OAuth2ClientRegistrationTemplateId** |  | [optional] |
| **createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| **providerId** | **String** | OAuth2 provider identifier (e.g. its name) | |
| **mapperConfig** | **OAuth2MapperConfig** | Default config for mapping OAuth2 log in response to platform entities | [optional] |
| **authorizationUri** | **String** | Default authorization URI of the OAuth2 provider | [optional] |
| **accessTokenUri** | **String** | Default access token URI of the OAuth2 provider | [optional] |
| **scope** | **List\<String\>** | Default OAuth scopes that will be requested from OAuth2 platform | [optional] |
| **userInfoUri** | **String** | Default user info URI of the OAuth2 provider | [optional] |
| **userNameAttributeName** | **String** | Default name of the username attribute in OAuth2 provider log in response | [optional] |
| **jwkSetUri** | **String** | Default JSON Web Key URI of the OAuth2 provider | [optional] |
| **clientAuthenticationMethod** | **String** | Default client authentication method to use: 'BASIC' or 'POST' | [optional] |
| **comment** | **String** | Comment for OAuth2 provider | [optional] |
| **loginButtonIcon** | **String** | Default log in button icon for OAuth2 provider | [optional] |
| **loginButtonLabel** | **String** | Default OAuth2 provider label | [optional] |
| **helpLink** | **String** | Help link for OAuth2 provider | [optional] |
| **additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** |  | [optional] |
| **name** | **String** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


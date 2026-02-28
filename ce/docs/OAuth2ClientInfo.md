
# OAuth2ClientInfo

`org.thingsboard.client.model.OAuth2ClientInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **OAuth2ClientId** |  | [optional] |
| **createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| **title** | **String** | Oauth2 client registration title (e.g. My google) | [optional] |
| **providerName** | **String** | Oauth2 client provider name (e.g. Google) | [optional] |
| **platforms** | **List\<PlatformType\>** | List of platforms for which usage of the OAuth2 client is allowed (empty for all allowed) | [optional] |
| **name** | **String** |  | [optional] [readonly] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


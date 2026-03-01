
# ApiKey

`org.thingsboard.client.model.ApiKey`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **ApiKeyId** | JSON object with the API Key Id. Specify this field to update the API Key. Referencing non-existing API Key Id will cause error. Omit this field to create new API Key. | [optional] |
| **createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| **tenantId** | **TenantId** | JSON object with Tenant Id. Tenant Id of the API key cannot be changed. | [optional] [readonly] |
| **userId** | **UserId** | JSON object with User Id. User Id of the API key cannot be changed. | [optional] |
| **expirationTime** | **Long** | Expiration time of the API key. | [optional] |
| **description** | **String** | API Key description. | |
| **enabled** | **Boolean** | Enabled/disabled API key. | [optional] |
| **value** | **String** | API key value | |
| **expired** | **Boolean** | Indicates if the API key is expired based on current time. Returns false if expirationTime is 0 (no expiry). | [optional] [readonly] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


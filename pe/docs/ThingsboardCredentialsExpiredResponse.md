
# ThingsboardCredentialsExpiredResponse

`org.thingsboard.client.model.ThingsboardCredentialsExpiredResponse`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **status** | **Integer** | HTTP Response Status Code | [optional] [readonly] |
| **message** | **String** | Error message | [optional] [readonly] |
| **errorCode** | **ThingsboardErrorCode** |  | [optional] |
| **timestamp** | **Long** | Timestamp | [optional] [readonly] |
| **resetToken** | **String** | Password reset token | [optional] [readonly] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


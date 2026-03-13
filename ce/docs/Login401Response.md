
# Login401Response

`org.thingsboard.client.model.Login401Response`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **errorCode** | **ThingsboardErrorCode** |  | [optional] |
| **message** | **String** | Error message | [optional] [readonly] |
| **status** | **Integer** | HTTP Response Status Code | [optional] [readonly] |
| **timestamp** | **Long** | Timestamp | [optional] [readonly] |
| **resetToken** | **String** | Password reset token | [optional] [readonly] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


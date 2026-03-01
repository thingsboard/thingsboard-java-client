
# TestSmsRequest

`org.thingsboard.client.model.TestSmsRequest`

A JSON value representing the Test SMS request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **providerConfiguration** | **SmsProviderConfiguration** | The SMS provider configuration | [optional] |
| **numberTo** | **String** | The phone number or other identifier to specify as a recipient of the SMS. | [optional] |
| **message** | **String** | The test message | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


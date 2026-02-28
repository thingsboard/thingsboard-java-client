
# AdminSettings

`org.thingsboard.client.model.AdminSettings`

A JSON value representing the Mail Settings.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **AdminSettingsId** | The Id of the Administration Settings, auto-generated, UUID | [optional] |
| **createdTime** | **Long** | Timestamp of the settings creation, in milliseconds | [optional] [readonly] |
| **tenantId** | **TenantId** | JSON object with Tenant Id. | [optional] [readonly] |
| **key** | **String** | The Administration Settings key, (e.g. 'general' or 'mail') | [optional] |
| **jsonValue** | **com.fasterxml.jackson.databind.JsonNode** | JSON representation of the Administration Settings value | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


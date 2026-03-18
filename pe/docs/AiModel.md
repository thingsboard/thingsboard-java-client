
# AiModel

`org.thingsboard.client.model.AiModel`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **AiModelId** |  | [optional] |
| **createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| **tenantId** | **TenantId** | JSON object representing the ID of the tenant associated with this AI model | [readonly] |
| **version** | **Long** | Version of the AI model record; increments automatically whenever the record is changed | [readonly] |
| **name** | **String** | Display name for this AI model configuration; not the technical model identifier | |
| **_configuration** | **AiModelConfig** | Configuration of the AI model | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


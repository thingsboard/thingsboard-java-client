
# CalculatedField

`org.thingsboard.client.model.CalculatedField`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **CalculatedFieldId** | JSON object with the Calculated Field Id. Referencing non-existing Calculated Field Id will cause error. | [optional] |
| **createdTime** | **Long** | Timestamp of the calculated field creation, in milliseconds | [optional] [readonly] |
| **tenantId** | **TenantId** |  | [optional] |
| **entityId** | **EntityId** |  | [optional] |
| **type** | **CalculatedFieldType** |  | [optional] |
| **name** | **String** | User defined name of the calculated field. | [optional] |
| **debugSettings** | **DebugSettings** | Debug settings object. | [optional] |
| **configurationVersion** | **Integer** | Version of calculated field configuration. | [optional] |
| **_configuration** | **CalculatedFieldConfiguration** |  | |
| **version** | **Long** |  | [optional] |
| **additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional parameters of the calculated field | [optional] |
| **debugMode** | **Boolean** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


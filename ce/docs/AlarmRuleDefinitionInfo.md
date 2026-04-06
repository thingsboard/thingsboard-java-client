
# AlarmRuleDefinitionInfo

`org.thingsboard.client.model.AlarmRuleDefinitionInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **CalculatedFieldId** | JSON object with the Alarm Rule Id. Referencing non-existing Alarm Rule Id will cause error. | [optional] |
| **createdTime** | **Long** | Timestamp of the alarm rule creation, in milliseconds | [optional] [readonly] |
| **tenantId** | **TenantId** |  | [optional] |
| **entityId** | **EntityId** |  | [optional] |
| **name** | **String** | User defined name of the alarm rule. | [optional] |
| **debugSettings** | **DebugSettings** | Debug settings object. | [optional] |
| **configurationVersion** | **Integer** | Version of alarm rule configuration. | [optional] |
| **_configuration** | **AlarmCalculatedFieldConfiguration** |  | |
| **version** | **Long** |  | [optional] |
| **additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional parameters of the alarm rule. May include: 'description' (string). | [optional] |
| **entityName** | **String** |  | [optional] |
| **debugMode** | **Boolean** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


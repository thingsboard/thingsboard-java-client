
# Converter

`org.thingsboard.client.model.Converter`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **ConverterId** | JSON object with the Converter Id. Specify this field to update the Converter. Referencing non-existing Converter Id will cause error. Omit this field to create new Converter. | [optional] |
| **createdTime** | **Long** | Timestamp of the converter creation, in milliseconds | [optional] [readonly] |
| **tenantId** | **TenantId** | JSON object with Tenant Id | [optional] [readonly] |
| **name** | **String** | Unique Converter Name in scope of Tenant | |
| **type** | **ConverterType** | The type of the converter to process incoming or outgoing messages | |
| **integrationType** | **IntegrationType** | The type of the integration to which the converter is dedicated | [optional] |
| **debugMode** | **Boolean** | Enable/disable debug.  | [optional] |
| **debugSettings** | **DebugSettings** | Debug settings object. | [optional] |
| **_configuration** | **com.fasterxml.jackson.databind.JsonNode** | JSON object representing converter configuration. It should contain one of two possible fields: 'decoder' or 'encoder'. The former is used when the converter has UPLINK type, the latter is used - when DOWNLINK type. It can contain both 'decoder' and 'encoder' fields, when the correct one is specified for the appropriate converter type, another one can be set to 'null' | [optional] |
| **additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional parameters of the converter | [optional] |
| **edgeTemplate** | **Boolean** | Boolean flag that specifies that is regular or edge template converter | [optional] |
| **converterVersion** | **Integer** |  | [optional] |
| **version** | **Long** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


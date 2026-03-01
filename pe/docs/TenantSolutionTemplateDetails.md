
# TenantSolutionTemplateDetails

`org.thingsboard.client.model.TenantSolutionTemplateDetails`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **String** | ID of the solution template | [optional] |
| **title** | **String** | Template Title | [optional] |
| **level** | **SolutionTemplateLevel** | Level of the subscription that is required to unlock the template | [optional] |
| **installTimeoutMs** | **Long** | Timeout for the installation UI to wait while template is installing | [optional] |
| **tenantTelemetryKeys** | **List\<String\>** | What keys to delete during template uninstall | [optional] |
| **tenantAttributeKeys** | **List\<String\>** | What attributes to delete during template uninstall | [optional] |
| **imageUrls** | **List\<String\>** |  | [optional] |
| **highlights** | **String** |  | [optional] |
| **description** | **String** |  | [optional] |
| **installed** | **Boolean** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


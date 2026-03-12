
# ReportTemplateConfig

`org.thingsboard.client.model.ReportTemplateConfig`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **namePattern** | **String** |  | [optional] |
| **timeDataPattern** | **String** |  | [optional] |
| **format** | **TbReportFormat** | Report format | |
| **entityAliases** | **List\<EntityAlias\>** |  | [optional] |
| **filters** | **List\<Filter\>** |  | [optional] |
| **components** | **List\<ReportComponent\>** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


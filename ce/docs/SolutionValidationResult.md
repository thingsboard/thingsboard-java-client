
# SolutionValidationResult

`org.thingsboard.client.model.SolutionValidationResult`

Result of a solution validation (dry-run). Checks structural validity and dependency references without modifying any data.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **valid** | **Boolean** | 'true' if the solution can be imported without errors. 'false' if there are structural issues (empty entities, unsupported types, malformed data). | [optional] |
| **entitySummary** | **Map\<String, Integer\>** | Number of entities per type found in the solution file. | [optional] |
| **conflicts** | **List\<String\>** | List of blocking issues that would prevent import (e.g. unsupported entity types, missing or malformed entity data). | [optional] |
| **warnings** | **List\<String\>** | List of non-blocking warnings (e.g. missing dependency references). | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


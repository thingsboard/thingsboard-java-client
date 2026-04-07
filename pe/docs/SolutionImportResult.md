
# SolutionImportResult

`org.thingsboard.client.model.SolutionImportResult`

Result of a solution import operation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **success** | **Boolean** | 'true' if all entities were imported successfully. | [optional] |
| **created** | **Map\<String, Integer\>** | Number of newly created entities per entity type. Entity types with zero created entities are omitted. | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


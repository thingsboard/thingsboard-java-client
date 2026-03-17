
# EntityExportData

`org.thingsboard.client.model.EntityExportData`

Base export container for ThingsBoard entities

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **entity** | **ExportableEntity** |  | [optional] |
| **relations** | **List\<EntityRelation\>** |  | [optional] |
| **attributes** | **Map\<String, List<AttributeExportData>\>** | Map of attributes where key is the scope of attributes and value is the list of attributes for that scope | [optional] |
| **calculatedFields** | **List\<CalculatedField\>** |  | [optional] |
| **entityType** | **EntityType** |  | |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


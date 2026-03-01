
# EntityTypeVersionCreateConfig

`org.thingsboard.client.model.EntityTypeVersionCreateConfig`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **saveRelations** | **Boolean** |  | [optional] |
| **saveAttributes** | **Boolean** |  | [optional] |
| **saveCredentials** | **Boolean** |  | [optional] |
| **saveCalculatedFields** | **Boolean** |  | [optional] |
| **syncStrategy** | **SyncStrategy** |  | [optional] |
| **entityIds** | **List\<UUID\>** |  | [optional] |
| **allEntities** | **Boolean** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


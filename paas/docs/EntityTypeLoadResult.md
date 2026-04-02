
# EntityTypeLoadResult

`org.thingsboard.client.model.EntityTypeLoadResult`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **entityType** | **EntityType** |  | [optional] |
| **created** | **Integer** |  | [optional] |
| **updated** | **Integer** |  | [optional] |
| **deleted** | **Integer** |  | [optional] |
| **groupsCreated** | **Integer** |  | [optional] |
| **groupsUpdated** | **Integer** |  | [optional] |
| **groupsDeleted** | **Integer** |  | [optional] |



## Referenced Types

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (52 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


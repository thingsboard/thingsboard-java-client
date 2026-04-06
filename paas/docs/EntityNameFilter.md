
# EntityNameFilter

`org.thingsboard.client.model.EntityNameFilter`

**Extends:** **EntityFilter**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **entityType** | **EntityType** |  | [optional] |
| **entityNameFilter** | **String** |  | [optional] |



## Referenced Types

#### EntityFilter
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (52 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions



# EntityGroupFilter

`org.thingsboard.client.model.EntityGroupFilter`

**Extends:** **EntityFilter**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **groupType** | **EntityType** |  | [optional] |
| **entityGroup** | **String** |  | [optional] |
| **groupStateEntity** | **Boolean** |  | [optional] |
| **defaultStateGroupType** | **EntityType** |  | [optional] |
| **defaultStateEntityGroup** | **String** |  | [optional] |



## Referenced Types

#### EntityFilter
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (46 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


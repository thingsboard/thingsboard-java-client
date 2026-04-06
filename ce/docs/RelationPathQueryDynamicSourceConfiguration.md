
# RelationPathQueryDynamicSourceConfiguration

`org.thingsboard.client.model.RelationPathQueryDynamicSourceConfiguration`

**Extends:** **CfArgumentDynamicSourceConfiguration**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **levels** | **List\<RelationPathLevel\>** |  | [optional] |



## Referenced Types

#### CfArgumentDynamicSourceConfiguration
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### RelationPathLevel
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| direction | EntitySearchDirection |  |  |
| relationType | String |  |  |

#### EntitySearchDirection (enum)
`FROM` | `TO`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


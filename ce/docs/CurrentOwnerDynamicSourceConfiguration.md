
# CurrentOwnerDynamicSourceConfiguration

`org.thingsboard.client.model.CurrentOwnerDynamicSourceConfiguration`

**Extends:** **CfArgumentDynamicSourceConfiguration**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|



## Referenced Types

#### CfArgumentDynamicSourceConfiguration
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### RelationPathQueryDynamicSourceConfiguration  *(extends CfArgumentDynamicSourceConfiguration, type=`RELATION_PATH_QUERY`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| levels | List<RelationPathLevel> |  | [optional] |

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



# EntityDataPageLink

`org.thingsboard.client.model.EntityDataPageLink`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **pageSize** | **Integer** |  | [optional] |
| **page** | **Integer** |  | [optional] |
| **textSearch** | **String** |  | [optional] |
| **sortOrder** | **EntityDataSortOrder** |  | [optional] |
| **dynamic** | **Boolean** |  | [optional] |



## Referenced Types

#### EntityDataSortOrder
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| key | EntityKey |  | [optional] |
| direction | Direction |  | [optional] |

#### EntityKey
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | EntityKeyType |  | [optional] |
| key | String |  | [optional] |

#### Direction (enum)
`ASC` | `DESC`

#### EntityKeyType (enum)
`ATTRIBUTE` | `CLIENT_ATTRIBUTE` | `SHARED_ATTRIBUTE` | `SERVER_ATTRIBUTE` | `TIME_SERIES` | `ENTITY_FIELD` | `ALARM_FIELD`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


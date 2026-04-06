
# VersionCreationResult

`org.thingsboard.client.model.VersionCreationResult`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **version** | **EntityVersion** |  | [optional] |
| **added** | **Integer** |  | [optional] |
| **modified** | **Integer** |  | [optional] |
| **removed** | **Integer** |  | [optional] |
| **error** | **String** |  | [optional] |
| **done** | **Boolean** |  | [optional] |



## Referenced Types

#### EntityVersion
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| timestamp | Long |  | [optional] |
| id | String |  | [optional] |
| name | String |  | [optional] |
| author | String |  | [optional] |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


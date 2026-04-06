
# PageDataEntityVersion

`org.thingsboard.client.model.PageDataEntityVersion`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **data** | **List\<EntityVersion\>** | Array of the entities | [optional] |
| **totalPages** | **Integer** | Total number of available pages. Calculated based on the 'pageSize' request parameter and total number of entities that match search criteria | [optional] [readonly] |
| **totalElements** | **Long** | Total number of elements in all available pages | [optional] [readonly] |
| **hasNext** | **Boolean** | 'false' value indicates the end of the result set | [optional] [readonly] |



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



# PageDataContactBasedObject

`org.thingsboard.client.model.PageDataContactBasedObject`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **data** | **List\<ContactBasedObject\>** | Array of the entities | [optional] |
| **hasNext** | **Boolean** | 'false' value indicates the end of the result set | [optional] [readonly] |
| **totalElements** | **Long** | Total number of elements in all available pages | [optional] [readonly] |
| **totalPages** | **Integer** | Total number of available pages. Calculated based on the 'pageSize' request parameter and total number of entities that match search criteria | [optional] [readonly] |



## Referenced Types

#### ContactBasedObject
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | Object |  | [optional] |
| createdTime | Long | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| additionalInfo | com.fasterxml.jackson.databind.JsonNode |  | [optional] |
| country | String |  | [optional] |
| state | String |  | [optional] |
| city | String |  | [optional] |
| address | String |  | [optional] |
| address2 | String |  | [optional] |
| zip | String |  | [optional] |
| phone | String |  | [optional] |
| email | String |  | [optional] |
| name | String |  | [optional] |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


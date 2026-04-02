
# FilterPredicateValueDouble

`org.thingsboard.client.model.FilterPredicateValueDouble`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **defaultValue** | **Double** |  | [optional] |
| **userValue** | **Double** |  | [optional] |
| **dynamicValue** | **DynamicValueDouble** |  | [optional] |



## Referenced Types

#### DynamicValueDouble
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| resolvedValue | Double |  | [optional] |
| sourceType | DynamicValueSourceType |  | [optional] |
| sourceAttribute | String |  | [optional] |
| inherit | Boolean |  | [optional] |

#### DynamicValueSourceType (enum)
`CURRENT_TENANT` | `CURRENT_CUSTOMER` | `CURRENT_USER` | `CURRENT_DEVICE`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


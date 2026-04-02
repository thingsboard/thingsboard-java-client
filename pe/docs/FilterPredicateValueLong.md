
# FilterPredicateValueLong

`org.thingsboard.client.model.FilterPredicateValueLong`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **defaultValue** | **Long** |  | [optional] |
| **userValue** | **Long** |  | [optional] |
| **dynamicValue** | **DynamicValueLong** |  | [optional] |



## Referenced Types

#### DynamicValueLong
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| resolvedValue | Long |  | [optional] |
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


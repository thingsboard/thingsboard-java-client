
# StringFilterPredicate

`org.thingsboard.client.model.StringFilterPredicate`

**Extends:** **KeyFilterPredicate**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **operation** | **StringOperation** |  | [optional] |
| **value** | **FilterPredicateValueString** | The value associated with the filter predicate | [optional] |
| **ignoreCase** | **Boolean** |  | [optional] |



## Referenced Types

#### KeyFilterPredicate
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### StringOperation (enum)
`EQUAL` | `NOT_EQUAL` | `STARTS_WITH` | `ENDS_WITH` | `CONTAINS` | `NOT_CONTAINS` | `IN` | `NOT_IN`

#### FilterPredicateValueString
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| defaultValue | String |  | [optional] |
| userValue | String |  | [optional] |
| dynamicValue | DynamicValueString |  | [optional] |

#### DynamicValueString
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| resolvedValue | String |  | [optional] |
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


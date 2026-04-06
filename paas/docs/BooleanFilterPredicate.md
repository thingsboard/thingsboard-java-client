
# BooleanFilterPredicate

`org.thingsboard.client.model.BooleanFilterPredicate`

**Extends:** **KeyFilterPredicate**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **operation** | **BooleanOperation** |  | [optional] |
| **value** | **FilterPredicateValueBoolean** | The value associated with the filter predicate | [optional] |



## Referenced Types

#### KeyFilterPredicate
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### BooleanOperation (enum)
`EQUAL` | `NOT_EQUAL`

#### FilterPredicateValueBoolean
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| defaultValue | Boolean |  | [optional] |
| userValue | Boolean |  | [optional] |
| dynamicValue | DynamicValueBoolean |  | [optional] |

#### DynamicValueBoolean
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| resolvedValue | Boolean |  | [optional] |
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


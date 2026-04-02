
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

#### BooleanFilterPredicate  *(extends KeyFilterPredicate, type=`BOOLEAN`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| operation | BooleanOperation |  | [optional] |
| value | FilterPredicateValueBoolean | The value associated with the filter predicate | [optional] |

#### ComplexFilterPredicate  *(extends KeyFilterPredicate, type=`COMPLEX`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| operation | ComplexOperation |  | [optional] |
| predicates | List<KeyFilterPredicate> |  | [optional] |

#### NumericFilterPredicate  *(extends KeyFilterPredicate, type=`NUMERIC`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| operation | NumericOperation |  | [optional] |
| value | FilterPredicateValueDouble | The value associated with the filter predicate | [optional] |

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

#### NumericOperation (enum)
`EQUAL` | `NOT_EQUAL` | `GREATER` | `LESS` | `GREATER_OR_EQUAL` | `LESS_OR_EQUAL`

#### FilterPredicateValueDouble
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| defaultValue | Double |  | [optional] |
| userValue | Double |  | [optional] |
| dynamicValue | DynamicValueDouble |  | [optional] |

#### BooleanOperation (enum)
`EQUAL` | `NOT_EQUAL`

#### FilterPredicateValueBoolean
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| defaultValue | Boolean |  | [optional] |
| userValue | Boolean |  | [optional] |
| dynamicValue | DynamicValueBoolean |  | [optional] |

#### ComplexOperation (enum)
`AND` | `OR`

#### DynamicValueSourceType (enum)
`CURRENT_TENANT` | `CURRENT_CUSTOMER` | `CURRENT_USER` | `CURRENT_DEVICE`

#### DynamicValueDouble
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| resolvedValue | Double |  | [optional] |
| sourceType | DynamicValueSourceType |  | [optional] |
| sourceAttribute | String |  | [optional] |
| inherit | Boolean |  | [optional] |

#### DynamicValueBoolean
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| resolvedValue | Boolean |  | [optional] |
| sourceType | DynamicValueSourceType |  | [optional] |
| sourceAttribute | String |  | [optional] |
| inherit | Boolean |  | [optional] |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


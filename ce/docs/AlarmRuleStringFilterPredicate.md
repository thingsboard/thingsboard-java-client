
# AlarmRuleStringFilterPredicate

`org.thingsboard.client.model.AlarmRuleStringFilterPredicate`

**Extends:** **AlarmRuleKeyFilterPredicate**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **ignoreCase** | **Boolean** |  | [optional] |
| **operation** | **StringOperation** |  | |
| **value** | **AlarmConditionValueString** |  | |



## Referenced Types

#### AlarmRuleKeyFilterPredicate
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### AlarmRuleBooleanFilterPredicate  *(extends AlarmRuleKeyFilterPredicate, type=`BOOLEAN`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| operation | BooleanOperation |  |  |
| value | AlarmConditionValueBoolean |  |  |

#### AlarmRuleComplexFilterPredicate  *(extends AlarmRuleKeyFilterPredicate, type=`COMPLEX`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| operation | ComplexOperation |  | [optional] |
| predicates | List<AlarmRuleKeyFilterPredicate> |  | [optional] |

#### AlarmRuleNoDataFilterPredicate  *(extends AlarmRuleKeyFilterPredicate, type=`NO_DATA`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| duration | AlarmConditionValueLong |  |  |
| unit | TimeUnit |  |  |

#### AlarmRuleNumericFilterPredicate  *(extends AlarmRuleKeyFilterPredicate, type=`NUMERIC`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| operation | NumericOperation |  |  |
| value | AlarmConditionValueDouble |  |  |

#### StringOperation (enum)
`EQUAL` | `NOT_EQUAL` | `STARTS_WITH` | `ENDS_WITH` | `CONTAINS` | `NOT_CONTAINS` | `IN` | `NOT_IN`

#### AlarmConditionValueString
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| staticValue | String |  | [optional] |
| dynamicValueArgument | String |  | [optional] |

#### NumericOperation (enum)
`EQUAL` | `NOT_EQUAL` | `GREATER` | `LESS` | `GREATER_OR_EQUAL` | `LESS_OR_EQUAL`

#### AlarmConditionValueDouble
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| staticValue | Double |  | [optional] |
| dynamicValueArgument | String |  | [optional] |

#### BooleanOperation (enum)
`EQUAL` | `NOT_EQUAL`

#### AlarmConditionValueBoolean
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| staticValue | Boolean |  | [optional] |
| dynamicValueArgument | String |  | [optional] |

#### AlarmConditionValueLong
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| staticValue | Long |  | [optional] |
| dynamicValueArgument | String |  | [optional] |

#### TimeUnit (enum)
`NANOSECONDS` | `MICROSECONDS` | `MILLISECONDS` | `SECONDS` | `MINUTES` | `HOURS` | `DAYS`

#### ComplexOperation (enum)
`AND` | `OR`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


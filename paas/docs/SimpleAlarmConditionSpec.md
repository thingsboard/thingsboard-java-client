
# SimpleAlarmConditionSpec

`org.thingsboard.client.model.SimpleAlarmConditionSpec`

**Extends:** **AlarmConditionSpec**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|



## Referenced Types

#### AlarmConditionSpec
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### DurationAlarmConditionSpec  *(extends AlarmConditionSpec, type=`DURATION`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| unit | TimeUnit | Duration time unit | [optional] |
| predicate | FilterPredicateValueLong | Duration predicate | [optional] |

#### RepeatingAlarmConditionSpec  *(extends AlarmConditionSpec, type=`REPEATING`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| predicate | FilterPredicateValueInteger | Repeating predicate | [optional] |

#### TimeUnit (enum)
`NANOSECONDS` | `MICROSECONDS` | `MILLISECONDS` | `SECONDS` | `MINUTES` | `HOURS` | `DAYS`

#### FilterPredicateValueLong
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| defaultValue | Long |  | [optional] |
| userValue | Long |  | [optional] |
| dynamicValue | DynamicValueLong |  | [optional] |

#### FilterPredicateValueInteger
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| defaultValue | Integer |  | [optional] |
| userValue | Integer |  | [optional] |
| dynamicValue | DynamicValueInteger |  | [optional] |

#### DynamicValueLong
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| resolvedValue | Long |  | [optional] |
| sourceType | DynamicValueSourceType |  | [optional] |
| sourceAttribute | String |  | [optional] |
| inherit | Boolean |  | [optional] |

#### DynamicValueInteger
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| resolvedValue | Integer |  | [optional] |
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


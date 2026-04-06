
# AlarmRuleNoDataFilterPredicate

`org.thingsboard.client.model.AlarmRuleNoDataFilterPredicate`

**Extends:** **AlarmRuleKeyFilterPredicate**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **duration** | **AlarmConditionValueLong** |  | |
| **unit** | **TimeUnit** |  | |



## Referenced Types

#### AlarmRuleKeyFilterPredicate
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### AlarmConditionValueLong
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| staticValue | Long |  | [optional] |
| dynamicValueArgument | String |  | [optional] |

#### TimeUnit (enum)
`NANOSECONDS` | `MICROSECONDS` | `MILLISECONDS` | `SECONDS` | `MINUTES` | `HOURS` | `DAYS`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions



# AlarmRuleBooleanFilterPredicate

`org.thingsboard.client.model.AlarmRuleBooleanFilterPredicate`

**Extends:** **AlarmRuleKeyFilterPredicate**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **operation** | **BooleanOperation** |  | |
| **value** | **AlarmConditionValueBoolean** |  | |



## Referenced Types

#### AlarmRuleKeyFilterPredicate
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### BooleanOperation (enum)
`EQUAL` | `NOT_EQUAL`

#### AlarmConditionValueBoolean
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| staticValue | Boolean |  | [optional] |
| dynamicValueArgument | String |  | [optional] |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


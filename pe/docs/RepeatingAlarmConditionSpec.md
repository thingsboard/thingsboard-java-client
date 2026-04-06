
# RepeatingAlarmConditionSpec

`org.thingsboard.client.model.RepeatingAlarmConditionSpec`

**Extends:** **AlarmConditionSpec**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **predicate** | **FilterPredicateValueInteger** | Repeating predicate | [optional] |



## Referenced Types

#### AlarmConditionSpec
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### FilterPredicateValueInteger
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| defaultValue | Integer |  | [optional] |
| userValue | Integer |  | [optional] |
| dynamicValue | DynamicValueInteger |  | [optional] |

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


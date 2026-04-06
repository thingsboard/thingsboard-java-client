
# AlarmRuleSpecificTimeSchedule

`org.thingsboard.client.model.AlarmRuleSpecificTimeSchedule`

**Extends:** **AlarmRuleSchedule**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **daysOfWeek** | **Set\<Integer\>** |  | [optional] |
| **endsOn** | **Long** |  | [optional] |
| **startsOn** | **Long** |  | [optional] |
| **timezone** | **String** |  | [optional] |



## Referenced Types

#### AlarmRuleSchedule
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### AlarmRuleAnyTimeSchedule  *(extends AlarmRuleSchedule, type=`ANY_TIME`)*
*See AlarmRuleSchedule for properties.*

#### AlarmRuleCustomTimeSchedule  *(extends AlarmRuleSchedule, type=`CUSTOM`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| items | List<AlarmRuleCustomTimeScheduleItem> |  | [optional] |
| timezone | String |  | [optional] |

#### AlarmRuleCustomTimeScheduleItem
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| dayOfWeek | Integer |  | [optional] |
| enabled | Boolean |  | [optional] |
| endsOn | Long |  | [optional] |
| startsOn | Long |  | [optional] |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


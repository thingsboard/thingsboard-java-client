
# AlarmRuleAnyTimeSchedule

`org.thingsboard.client.model.AlarmRuleAnyTimeSchedule`

**Extends:** **AlarmRuleSchedule**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|



## Referenced Types

#### AlarmRuleSchedule
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### AlarmRuleCustomTimeSchedule  *(extends AlarmRuleSchedule, type=`CUSTOM`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| items | List<AlarmRuleCustomTimeScheduleItem> |  | [optional] |
| timezone | String |  | [optional] |

#### AlarmRuleSpecificTimeSchedule  *(extends AlarmRuleSchedule, type=`SPECIFIC_TIME`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| daysOfWeek | Set<Integer> |  | [optional] |
| endsOn | Long |  | [optional] |
| startsOn | Long |  | [optional] |
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


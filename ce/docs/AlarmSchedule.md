
# AlarmSchedule

`org.thingsboard.client.model.AlarmSchedule`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **type** | **String** |  | |



## Subtypes

#### AnyTimeSchedule  *(type=`ANY_TIME`)*
*(no additional properties)*

#### CustomTimeSchedule  *(type=`CUSTOM`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| timezone | String |  | [optional] |
| items | List<CustomTimeScheduleItem> |  | [optional] |

#### SpecificTimeSchedule  *(type=`SPECIFIC_TIME`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| timezone | String |  | [optional] |
| daysOfWeek | Set<Integer> |  | [optional] |
| startsOn | Long |  | [optional] |
| endsOn | Long |  | [optional] |

## Referenced Types

#### CustomTimeScheduleItem
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| enabled | Boolean |  | [optional] |
| dayOfWeek | Integer |  | [optional] |
| startsOn | Long |  | [optional] |
| endsOn | Long |  | [optional] |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


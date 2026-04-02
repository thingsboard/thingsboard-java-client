
# AlarmSchedule

`org.thingsboard.client.model.AlarmSchedule`

Configuration for alarm schedule

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **dynamicValue** | **DynamicValueString** |  | [optional] |
| **type** | **AlarmScheduleType** |  | [optional] |



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
| daysOfWeek | Set<Integer> |  | [optional] |
| endsOn | Long |  | [optional] |
| startsOn | Long |  | [optional] |
| timezone | String |  | [optional] |

## Referenced Types

#### DynamicValueString
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| resolvedValue | String |  | [optional] |
| sourceType | DynamicValueSourceType |  | [optional] |
| sourceAttribute | String |  | [optional] |
| inherit | Boolean |  | [optional] |

#### AlarmScheduleType (enum)
`ANY_TIME` | `SPECIFIC_TIME` | `CUSTOM`

#### CustomTimeScheduleItem
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| dayOfWeek | Integer |  | [optional] |
| enabled | Boolean |  | [optional] |
| endsOn | Long |  | [optional] |
| startsOn | Long |  | [optional] |

#### DynamicValueSourceType (enum)
`CURRENT_TENANT` | `CURRENT_CUSTOMER` | `CURRENT_USER` | `CURRENT_DEVICE`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


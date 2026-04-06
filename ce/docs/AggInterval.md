
# AggInterval

`org.thingsboard.client.model.AggInterval`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **type** | **String** |  | |



## Subtypes

#### CustomInterval  *(type=`CUSTOM`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| tz | String |  |  |
| offsetSec | Long |  | [optional] |
| durationSec | Long |  |  |

#### DayInterval  *(type=`DAY`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| tz | String |  |  |
| offsetSec | Long |  | [optional] |

#### HourInterval  *(type=`HOUR`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| tz | String |  |  |
| offsetSec | Long |  | [optional] |

#### MonthInterval  *(type=`MONTH`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| tz | String |  |  |
| offsetSec | Long |  | [optional] |

#### QuarterInterval  *(type=`QUARTER`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| tz | String |  |  |
| offsetSec | Long |  | [optional] |

#### WeekInterval  *(type=`WEEK`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| tz | String |  |  |
| offsetSec | Long |  | [optional] |

#### WeekSunSatInterval  *(type=`WEEK_SUN_SAT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| tz | String |  |  |
| offsetSec | Long |  | [optional] |

#### YearInterval  *(type=`YEAR`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| tz | String |  |  |
| offsetSec | Long |  | [optional] |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


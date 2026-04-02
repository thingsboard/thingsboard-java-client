
# TimeWindowConfiguration

`org.thingsboard.client.model.TimeWindowConfiguration`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **history** | **History** |  | [optional] |
| **aggregation** | **AggregationConfiguration** |  | [optional] |
| **timezone** | **String** |  | [optional] |



## Referenced Types

#### History
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| historyType | Integer |  | [optional] |
| interval | Interval |  | [optional] |
| timewindowMs | Long |  | [optional] |
| fixedTimewindow | FixedTimeWindow |  | [optional] |
| quickInterval | QuickTimeInterval |  | [optional] |

#### AggregationConfiguration
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | Aggregation |  | [optional] |
| limit | Integer |  | [optional] |

#### Interval
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| interval | Long |  | [optional] |
| intervalType | IntervalType |  | [optional] |

#### FixedTimeWindow
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| startTimeMs | Long |  | [optional] |
| endTimeMs | Long |  | [optional] |

#### QuickTimeInterval (enum)
`YESTERDAY` | `DAY_BEFORE_YESTERDAY` | `THIS_DAY_LAST_WEEK` | `PREVIOUS_WEEK` | `PREVIOUS_WEEK_ISO` | `PREVIOUS_MONTH` | `PREVIOUS_QUARTER` | `PREVIOUS_HALF_YEAR` | `PREVIOUS_YEAR` | `CURRENT_HOUR` | … (24 values total)

#### Aggregation (enum)
`MIN` | `MAX` | `AVG` | `SUM` | `COUNT` | `NONE`

#### IntervalType (enum)
`MILLISECONDS` | `WEEK` | `WEEK_ISO` | `MONTH` | `QUARTER`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


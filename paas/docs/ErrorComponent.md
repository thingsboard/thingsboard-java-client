
# ErrorComponent

`org.thingsboard.client.model.ErrorComponent`

**Extends:** **ReportComponent**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **errorMessage** | **String** |  | [optional] |
| **exception** | **ErrorComponentAllOfException** |  | [optional] |



## Referenced Types

#### ReportComponent
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| subType | ReportComponentSubType |  |  |
| type | ReportComponentType |  |  |

#### ErrorComponentAllOfException
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| cause | ErrorComponentAllOfExceptionCause |  | [optional] |
| stackTrace | List<ErrorComponentAllOfExceptionCauseStackTrace> |  | [optional] |
| message | String |  | [optional] |
| suppressed | List<ErrorComponentAllOfExceptionCause> |  | [optional] |
| localizedMessage | String |  | [optional] |

#### ReportComponentSubType (enum)
`DOUGHNUT_CHART` | `HORIZONTAL_DOUGHNUT_CHART` | `POINT_CHART` | `BAR_CHART` | `PIE_CHART` | `LINE_CHART` | `LATEST_BAR_CHART` | `RANGE_CHART` | `BAR_CHART_WITH_LABELS` | `STATE_CHART` | … (11 values total)

#### ReportComponentType (enum)
`HEADING` | `RICH_TEXT` | `ENTITY_TABLE` | `TIME_SERIES_TABLE` | `ALARM_TABLE` | `TIME_SERIES_CHART` | `LATEST_CHART` | `DASHBOARD` | `IMAGE` | `SUB_REPORT` | … (14 values total)

#### ErrorComponentAllOfExceptionCause
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| stackTrace | List<ErrorComponentAllOfExceptionCauseStackTrace> |  | [optional] |
| message | String |  | [optional] |
| localizedMessage | String |  | [optional] |

#### ErrorComponentAllOfExceptionCauseStackTrace
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| classLoaderName | String |  | [optional] |
| moduleName | String |  | [optional] |
| moduleVersion | String |  | [optional] |
| methodName | String |  | [optional] |
| fileName | String |  | [optional] |
| lineNumber | Integer |  | [optional] |
| nativeMethod | Boolean |  | [optional] |
| className | String |  | [optional] |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


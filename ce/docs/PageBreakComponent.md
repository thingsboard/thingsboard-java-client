
# PageBreakComponent

`org.thingsboard.client.model.PageBreakComponent`

**Extends:** **ReportComponent**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|



## Referenced Types

#### ReportComponent
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| subType | ReportComponentSubType |  |  |
| type | ReportComponentType |  |  |

#### ReportComponentSubType (enum)
`DOUGHNUT_CHART` | `HORIZONTAL_DOUGHNUT_CHART` | `POINT_CHART` | `BAR_CHART` | `PIE_CHART` | `LINE_CHART` | `LATEST_BAR_CHART` | `RANGE_CHART` | `BAR_CHART_WITH_LABELS` | `STATE_CHART` | … (11 values total)

#### ReportComponentType (enum)
`HEADING` | `RICH_TEXT` | `ENTITY_TABLE` | `TIME_SERIES_TABLE` | `ALARM_TABLE` | `TIME_SERIES_CHART` | `LATEST_CHART` | `DASHBOARD` | `IMAGE` | `SUB_REPORT` | … (14 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


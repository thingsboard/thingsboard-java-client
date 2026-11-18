
# TimeSeriesChartNoAggregationBarWidthSettings

`org.thingsboard.client.model.TimeSeriesChartNoAggregationBarWidthSettings`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **strategy** | **TimeSeriesChartNoAggregationBarWidthStrategy** |  | [optional] |
| **groupWidth** | **TimeSeriesChartBarWidth** |  | [optional] |
| **barWidth** | **TimeSeriesChartBarWidth** |  | [optional] |



## Referenced Types

#### TimeSeriesChartNoAggregationBarWidthStrategy (enum)
`GROUP` | `SEPARATE`

#### TimeSeriesChartBarWidth
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| relative | Boolean |  | [optional] |
| relativeWidth | Double |  | [optional] |
| absoluteWidth | Double |  | [optional] |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


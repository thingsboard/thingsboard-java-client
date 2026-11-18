
# TimeSeriesChartThreshold

`org.thingsboard.client.model.TimeSeriesChartThreshold`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **type** | **ValueSourceType** |  | [optional] |
| **value** | **Double** |  | [optional] |
| **latestKeyType** | **String** |  | [optional] |
| **latestKey** | **String** |  | [optional] |
| **entityKeyType** | **String** |  | [optional] |
| **entityAlias** | **String** |  | [optional] |
| **entityKey** | **String** |  | [optional] |
| **yAxisId** | **String** |  | [optional] |
| **units** | **String** |  | [optional] |
| **decimals** | **Integer** |  | [optional] |
| **lineColor** | **String** |  | [optional] |
| **lineType** | **ChartLineType** |  | [optional] |
| **lineWidth** | **Float** |  | [optional] |
| **startSymbol** | **ChartShape** |  | [optional] |
| **startSymbolSize** | **Float** |  | [optional] |
| **endSymbol** | **ChartShape** |  | [optional] |
| **endSymbolSize** | **Float** |  | [optional] |
| **showLabel** | **Boolean** |  | [optional] |
| **labelPosition** | **ThresholdLabelPosition** |  | [optional] |
| **labelFont** | **Font** |  | [optional] |
| **labelColor** | **String** |  | [optional] |
| **enableLabelBackground** | **Boolean** |  | [optional] |
| **labelBackground** | **String** |  | [optional] |
| **yaxisId** | **String** |  | [optional] |



## Referenced Types

#### ValueSourceType (enum)
`CONSTANT` | `LATEST_KEY` | `ENTITY`

#### ChartLineType (enum)
`SOLID` | `DASHED` | `DOTTED`

#### ChartShape (enum)
`EMPTY_CIRCLE` | `CIRCLE` | `RECT` | `ROUND_RECT` | `TRIANGLE` | `DIAMOND` | `PIN` | `ARROW` | `NONE`

#### ThresholdLabelPosition (enum)
`START` | `MIDDLE` | `END` | `INSIDE_START` | `INSIDE_START_TOP` | `INSIDE_START_BOTTOM` | `INSIDE_MIDDLE` | `INSIDE_MIDDLE_TOP` | `INSIDE_MIDDLE_BOTTOM` | `INSIDE_END` | … (12 values total)

#### Font
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| size | Float |  | [optional] |
| weight | FontWeight |  | [optional] |
| style | FontStyle |  | [optional] |
| family | String |  | [optional] |

#### FontWeight (enum)
`NORMAL` | `BOLD` | `_500`

#### FontStyle (enum)
`NORMAL` | `ITALIC`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions



# DefaultDataKeySettings

`org.thingsboard.client.model.DefaultDataKeySettings`

**Extends:** **DataKeySettings**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|



## Referenced Types

#### DataKeySettings
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | DataKeySettingsType | Data key settings type |  |

#### ColumnSettings  *(type=`COLUMN`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| columnWidth | String |  | [optional] |
| header | CellSettings |  | [optional] |
| cell | CellSettings |  | [optional] |
| type | DataKeySettingsType | Data key settings type |  |

#### TimeSeriesChartKeySettings  *(extends DataKeySettings, type=`TIME_SERIES_CHART`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| yAxisId | String |  | [optional] |
| showInLegend | Boolean |  | [optional] |
| seriesType | TimeSeriesChartSeriesType |  | [optional] |
| lineSettings | LineSeriesSettings |  | [optional] |
| barSettings | BarSeriesSettings |  | [optional] |
| comparisonSettings | DataKeyComparisonSettings |  | [optional] |
| yaxisId | String |  | [optional] |

#### DataKeySettingsType (enum)
`COLUMN` | `TIME_SERIES_CHART` | `DEFAULT`

#### CellSettings
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| font | Font |  | [optional] |
| color | String |  | [optional] |
| backgroundColor | String |  | [optional] |
| textAlignment | TextAlignment |  | [optional] |
| verticalAlignment | VerticalAlignment |  | [optional] |

#### TimeSeriesChartSeriesType (enum)
`LINE` | `BAR`

#### LineSeriesSettings
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| showLine | Boolean |  | [optional] |
| step | Boolean |  | [optional] |
| stepType | LineSeriesStepType |  | [optional] |
| smooth | Boolean |  | [optional] |
| lineType | ChartLineType |  | [optional] |
| lineWidth | Float |  | [optional] |
| showPoints | Boolean |  | [optional] |
| showPointLabel | Boolean |  | [optional] |
| pointLabelPosition | ChartLabelPosition |  | [optional] |
| pointLabelFont | Font |  | [optional] |
| pointLabelColor | String |  | [optional] |
| enablePointLabelBackground | Boolean |  | [optional] |
| pointLabelBackground | String |  | [optional] |
| pointShape | ChartShape |  | [optional] |
| pointSize | Float |  | [optional] |
| fillAreaSettings | ChartFillSettings |  | [optional] |

#### BarSeriesSettings
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| showBorder | Boolean |  | [optional] |
| borderWidth | Float |  | [optional] |
| borderRadius | Float |  | [optional] |
| barWidth | Double |  | [optional] |
| showLabel | Boolean |  | [optional] |
| labelPosition | ChartLabelPosition |  | [optional] |
| labelFont | Font |  | [optional] |
| labelColor | String |  | [optional] |
| enableLabelBackground | Boolean |  | [optional] |
| labelBackground | String |  | [optional] |
| backgroundSettings | ChartFillSettings |  | [optional] |

#### DataKeyComparisonSettings
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| showValuesForComparison | Boolean |  | [optional] |
| comparisonValuesLabel | String |  | [optional] |
| color | String |  | [optional] |

#### Font
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| size | Float |  | [optional] |
| weight | FontWeight |  | [optional] |
| style | FontStyle |  | [optional] |
| family | String |  | [optional] |

#### TextAlignment (enum)
`CENTER` | `RIGHT` | `LEFT` | `JUSTIFY`

#### VerticalAlignment (enum)
`BOTTOM` | `TOP` | `MIDDLE`

#### LineSeriesStepType (enum)
`START` | `MIDDLE` | `END`

#### ChartLineType (enum)
`SOLID` | `DASHED` | `DOTTED`

#### ChartLabelPosition (enum)
`TOP` | `BOTTOM`

#### ChartShape (enum)
`EMPTY_CIRCLE` | `CIRCLE` | `RECT` | `ROUND_RECT` | `TRIANGLE` | `DIAMOND` | `PIN` | `ARROW` | `NONE`

#### ChartFillSettings
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | ChartFillType |  | [optional] |
| opacity | Float |  | [optional] |
| gradient | ChartFillSettingsGradient |  | [optional] |

#### FontWeight (enum)
`NORMAL` | `BOLD` | `_500`

#### FontStyle (enum)
`NORMAL` | `ITALIC`

#### ChartFillType (enum)
`NONE` | `OPACITY` | `GRADIENT`

#### ChartFillSettingsGradient
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| start | Float |  | [optional] |
| end | Float |  | [optional] |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


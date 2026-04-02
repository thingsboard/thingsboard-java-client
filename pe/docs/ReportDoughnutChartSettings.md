
# ReportDoughnutChartSettings

`org.thingsboard.client.model.ReportDoughnutChartSettings`

**Extends:** **ReportLatestChartSettings**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **layout** | **DoughnutLayout** |  | [optional] |
| **clockwise** | **Boolean** |  | [optional] |
| **totalValueFont** | **Font** |  | [optional] |
| **totalValueColor** | **String** |  | [optional] |



## Referenced Types

#### ReportLatestChartSettings
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| showTitle | Boolean |  | [optional] |
| title | String |  | [optional] |
| titleFont | Font |  | [optional] |
| titleColor | String |  | [optional] |
| titleAlignment | TextAlignment |  | [optional] |
| units | String |  | [optional] |
| decimals | Integer |  | [optional] |
| autoScale | Boolean |  | [optional] |
| sortSeries | Boolean |  | [optional] |
| showTotal | Boolean |  | [optional] |
| showLegend | Boolean |  | [optional] |
| legendPosition | LegendPosition |  | [optional] |
| legendLabelFont | Font |  | [optional] |
| legendLabelColor | String |  | [optional] |
| legendValueFont | Font |  | [optional] |
| legendValueColor | String |  | [optional] |
| legendShowTotal | Boolean |  | [optional] |

#### ReportBarChartSettings  *(extends ReportLatestChartSettings, subType=`latestBarChart`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| axisMin | Double |  | [optional] |
| axisMax | Double |  | [optional] |
| axisTickLabelFont | Font |  | [optional] |
| axisTickLabelColor | String |  | [optional] |
| barSettings | BarSeriesSettings |  | [optional] |

#### ReportPieChartSettings  *(extends ReportLatestChartSettings, subType=`pieChart`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| showLabel | Boolean |  | [optional] |
| labelPosition | PieChartLabelPosition |  | [optional] |
| labelFont | Font |  | [optional] |
| labelColor | String |  | [optional] |
| borderWidth | Float |  | [optional] |
| borderColor | String |  | [optional] |
| radius | Double |  | [optional] |
| clockwise | Boolean |  | [optional] |

#### DoughnutLayout (enum)
`DEFAULT` | `WITH_TOTAL`

#### Font
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| size | Float |  | [optional] |
| weight | FontWeight |  | [optional] |
| style | FontStyle |  | [optional] |
| family | String |  | [optional] |

#### TextAlignment (enum)
`CENTER` | `RIGHT` | `LEFT` | `JUSTIFY`

#### LegendPosition (enum)
`TOP` | `BOTTOM` | `LEFT` | `RIGHT`

#### FontWeight (enum)
`NORMAL` | `BOLD` | `_500`

#### FontStyle (enum)
`NORMAL` | `ITALIC`

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

#### PieChartLabelPosition (enum)
`INSIDE` | `OUTSIDE`

#### ChartLabelPosition (enum)
`TOP` | `BOTTOM`

#### ChartFillSettings
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | ChartFillType |  | [optional] |
| opacity | Float |  | [optional] |
| gradient | ChartFillSettingsGradient |  | [optional] |

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


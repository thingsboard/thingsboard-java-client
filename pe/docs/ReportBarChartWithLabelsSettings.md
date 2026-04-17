
# ReportBarChartWithLabelsSettings

`org.thingsboard.client.model.ReportBarChartWithLabelsSettings`

**Extends:** **ReportTimeSeriesChartSettings**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **showBarLabel** | **Boolean** |  | [optional] |
| **barLabelFont** | **Font** |  | [optional] |
| **barLabelColor** | **String** |  | [optional] |
| **showBarValue** | **Boolean** |  | [optional] |
| **barValueFont** | **Font** |  | [optional] |
| **barValueColor** | **String** |  | [optional] |
| **showBarBorder** | **Boolean** |  | [optional] |
| **barBorderWidth** | **Float** |  | [optional] |
| **barBorderRadius** | **Float** |  | [optional] |
| **barBackgroundSettings** | **ChartFillSettings** |  | [optional] |
| **barUnits** | **String** |  | [optional] |
| **barDecimals** | **Integer** |  | [optional] |



## Referenced Types

#### ReportTimeSeriesChartSettings
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| showTitle | Boolean |  | [optional] |
| title | String |  | [optional] |
| titleFont | Font |  | [optional] |
| titleColor | String |  | [optional] |
| titleAlignment | TextAlignment |  | [optional] |
| thresholds | List<TimeSeriesChartThreshold> |  | [optional] |
| stack | Boolean |  | [optional] |
| grid | TimeSeriesChartGridSettings |  | [optional] |
| yAxes | Map<String, TimeSeriesChartYAxisSettings> |  | [optional] |
| xAxis | TimeSeriesChartXAxisSettings |  | [optional] |
| barWidthSettings | TimeSeriesChartBarWidthSettings |  | [optional] |
| noAggregationBarWidthSettings | TimeSeriesChartNoAggregationBarWidthSettings |  | [optional] |
| states | List<TimeSeriesChartStateSettings> |  | [optional] |
| comparisonEnabled | Boolean |  | [optional] |
| timeForComparison | ComparisonDuration |  | [optional] |
| comparisonCustomIntervalValue | Long |  | [optional] |
| comparisonXAxis | TimeSeriesChartXAxisSettings |  | [optional] |
| showLegend | Boolean |  | [optional] |
| legendColumnTitleFont | Font |  | [optional] |
| legendColumnTitleColor | String |  | [optional] |
| legendLabelFont | Font |  | [optional] |
| legendLabelColor | String |  | [optional] |
| legendValueFont | Font |  | [optional] |
| legendValueColor | String |  | [optional] |
| legendConfig | LegendConfig |  | [optional] |
| xaxis | TimeSeriesChartXAxisSettings |  | [optional] |
| yaxes | Map<String, TimeSeriesChartYAxisSettings> |  | [optional] |

#### Font
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| size | Float |  | [optional] |
| weight | FontWeight |  | [optional] |
| style | FontStyle |  | [optional] |
| family | String |  | [optional] |

#### ChartFillSettings
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | ChartFillType |  | [optional] |
| opacity | Float |  | [optional] |
| gradient | ChartFillSettingsGradient |  | [optional] |

#### TextAlignment (enum)
`CENTER` | `RIGHT` | `LEFT` | `JUSTIFY`

#### TimeSeriesChartThreshold
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | ValueSourceType |  | [optional] |
| value | Double |  | [optional] |
| latestKeyType | String |  | [optional] |
| latestKey | String |  | [optional] |
| entityKeyType | String |  | [optional] |
| entityAlias | String |  | [optional] |
| entityKey | String |  | [optional] |
| yAxisId | String |  | [optional] |
| units | String |  | [optional] |
| decimals | Integer |  | [optional] |
| lineColor | String |  | [optional] |
| lineType | ChartLineType |  | [optional] |
| lineWidth | Float |  | [optional] |
| startSymbol | ChartShape |  | [optional] |
| startSymbolSize | Float |  | [optional] |
| endSymbol | ChartShape |  | [optional] |
| endSymbolSize | Float |  | [optional] |
| showLabel | Boolean |  | [optional] |
| labelPosition | ThresholdLabelPosition |  | [optional] |
| labelFont | Font |  | [optional] |
| labelColor | String |  | [optional] |
| enableLabelBackground | Boolean |  | [optional] |
| labelBackground | String |  | [optional] |
| yaxisId | String |  | [optional] |

#### TimeSeriesChartGridSettings
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| show | Boolean |  | [optional] |
| backgroundColor | String |  | [optional] |
| borderWidth | Float |  | [optional] |
| borderColor | String |  | [optional] |

#### TimeSeriesChartYAxisSettings
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| show | Boolean |  | [optional] |
| label | String |  | [optional] |
| labelFont | Font |  | [optional] |
| labelColor | String |  | [optional] |
| position | AxisPosition |  | [optional] |
| showTickLabels | Boolean |  | [optional] |
| tickLabelFont | Font |  | [optional] |
| tickLabelColor | String |  | [optional] |
| showTicks | Boolean |  | [optional] |
| ticksColor | String |  | [optional] |
| showLine | Boolean |  | [optional] |
| lineColor | String |  | [optional] |
| showSplitLines | Boolean |  | [optional] |
| splitLinesColor | String |  | [optional] |
| id | String |  | [optional] |
| order | Integer |  | [optional] |
| units | String |  | [optional] |
| decimals | Integer |  | [optional] |
| interval | Double |  | [optional] |
| splitNumber | Integer |  | [optional] |
| min | Double |  | [optional] |
| max | Double |  | [optional] |

#### TimeSeriesChartXAxisSettings
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| show | Boolean |  | [optional] |
| label | String |  | [optional] |
| labelFont | Font |  | [optional] |
| labelColor | String |  | [optional] |
| position | AxisPosition |  | [optional] |
| showTickLabels | Boolean |  | [optional] |
| tickLabelFont | Font |  | [optional] |
| tickLabelColor | String |  | [optional] |
| showTicks | Boolean |  | [optional] |
| ticksColor | String |  | [optional] |
| showLine | Boolean |  | [optional] |
| lineColor | String |  | [optional] |
| showSplitLines | Boolean |  | [optional] |
| splitLinesColor | String |  | [optional] |
| ticksFormat | Map<String, String> |  | [optional] |

#### TimeSeriesChartBarWidthSettings
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| barGap | Double |  | [optional] |
| intervalGap | Double |  | [optional] |

#### TimeSeriesChartNoAggregationBarWidthSettings
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| strategy | TimeSeriesChartNoAggregationBarWidthStrategy |  | [optional] |
| groupWidth | TimeSeriesChartBarWidth |  | [optional] |
| barWidth | TimeSeriesChartBarWidth |  | [optional] |

#### TimeSeriesChartStateSettings
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| label | String |  | [optional] |
| value | Double |  | [optional] |
| sourceType | TimeSeriesChartStateSourceType |  | [optional] |
| sourceValue | com.fasterxml.jackson.databind.JsonNode |  | [optional] |
| sourceRangeFrom | Double |  | [optional] |
| sourceRangeTo | Double |  | [optional] |

#### ComparisonDuration (enum)
`PREVIOUS_INTERVAL` | `DAYS` | `WEEKS` | `MONTHS` | `YEARS` | `CUSTOM_INTERVAL`

#### LegendConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| position | LegendPosition |  | [optional] |
| sortDataKeys | Boolean |  | [optional] |
| showMin | Boolean |  | [optional] |
| showMax | Boolean |  | [optional] |
| showAvg | Boolean |  | [optional] |
| showTotal | Boolean |  | [optional] |
| showLatest | Boolean |  | [optional] |

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

#### ValueSourceType (enum)
`CONSTANT` | `LATEST_KEY` | `ENTITY`

#### ChartLineType (enum)
`SOLID` | `DASHED` | `DOTTED`

#### ChartShape (enum)
`EMPTY_CIRCLE` | `CIRCLE` | `RECT` | `ROUND_RECT` | `TRIANGLE` | `DIAMOND` | `PIN` | `ARROW` | `NONE`

#### ThresholdLabelPosition (enum)
`START` | `MIDDLE` | `END` | `INSIDE_START` | `INSIDE_START_TOP` | `INSIDE_START_BOTTOM` | `INSIDE_MIDDLE` | `INSIDE_MIDDLE_TOP` | `INSIDE_MIDDLE_BOTTOM` | `INSIDE_END` | … (12 values total)

#### AxisPosition (enum)
`LEFT` | `RIGHT` | `TOP` | `BOTTOM`

#### TimeSeriesChartNoAggregationBarWidthStrategy (enum)
`GROUP` | `SEPARATE`

#### TimeSeriesChartBarWidth
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| relative | Boolean |  | [optional] |
| relativeWidth | Double |  | [optional] |
| absoluteWidth | Double |  | [optional] |

#### TimeSeriesChartStateSourceType (enum)
`CONSTANT` | `RANGE`

#### LegendPosition (enum)
`TOP` | `BOTTOM` | `LEFT` | `RIGHT`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


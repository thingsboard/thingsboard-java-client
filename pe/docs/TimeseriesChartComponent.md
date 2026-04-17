
# TimeseriesChartComponent

`org.thingsboard.client.model.TimeseriesChartComponent`

**Extends:** **ReportComponent**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **dataSources** | **List\<DataSource\>** |  | [optional] |
| **margins** | **Insets** |  | [optional] |
| **paddings** | **Insets** |  | [optional] |
| **background** | **String** |  | [optional] |
| **borderWidth** | **Integer** |  | [optional] |
| **borderRadius** | **Integer** |  | [optional] |
| **borderColor** | **String** |  | [optional] |
| **widthType** | **ImageWidthType** |  | [optional] |
| **customWidth** | **Integer** |  | [optional] |
| **alignment** | **ImageAlignment** |  | [optional] |
| **height** | **Integer** |  | [optional] |
| **timewindow** | **TimeWindowConfiguration** |  | [optional] |
| **timeSeriesChartSettings** | **ReportTimeSeriesChartSettings** |  | [optional] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### ReportComponent
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| subType | ReportComponentSubType |  |  |
| type | ReportComponentType |  |  |

#### DataSource
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | DataSourceType |  | [optional] |
| deviceId | String |  | [optional] |
| entityAliasId | String |  | [optional] |
| filterId | String |  | [optional] |
| dataKeys | List<DataKey> |  | [optional] |
| latestDataKeys | List<DataKey> |  | [optional] |
| alarmFilterConfig | AlarmFilterConfig |  | [optional] |

#### Insets
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| left | Integer |  | [optional] |
| right | Integer |  | [optional] |
| top | Integer |  | [optional] |
| bottom | Integer |  | [optional] |

#### ImageWidthType (enum)
`FIT_WIDTH` | `ORIGINAL` | `CUSTOM`

#### ImageAlignment (enum)
`LEFT` | `CENTER` | `RIGHT`

#### TimeWindowConfiguration
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| history | History |  | [optional] |
| aggregation | AggregationConfiguration |  | [optional] |
| timezone | String |  | [optional] |

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

#### ReportComponentSubType (enum)
`DOUGHNUT_CHART` | `HORIZONTAL_DOUGHNUT_CHART` | `POINT_CHART` | `BAR_CHART` | `PIE_CHART` | `LINE_CHART` | `LATEST_BAR_CHART` | `RANGE_CHART` | `BAR_CHART_WITH_LABELS` | `STATE_CHART` | … (11 values total)

#### ReportComponentType (enum)
`HEADING` | `RICH_TEXT` | `ENTITY_TABLE` | `TIME_SERIES_TABLE` | `ALARM_TABLE` | `TIME_SERIES_CHART` | `LATEST_CHART` | `DASHBOARD` | `IMAGE` | `SUB_REPORT` | … (14 values total)

#### DataSourceType (enum)
`DEVICE` | `ENTITY` | `ENTITY_COUNT` | `ALARM_COUNT`

#### DataKey
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| name | String |  | [optional] |
| type | String |  | [optional] |
| label | String |  | [optional] |
| color | String |  | [optional] |
| decimals | Integer |  | [optional] |
| units | String |  | [optional] |
| aggregationType | Aggregation |  | [optional] |
| timewindow | TimeWindowConfiguration |  | [optional] |
| usePostProcessing | Boolean |  | [optional] |
| postFuncBody | String |  | [optional] |
| settings | DataKeySettings |  | [optional] |

#### AlarmFilterConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| typeList | List<String> |  | [optional] |
| statusList | List<AlarmSearchStatus> |  | [optional] |
| severityList | List<AlarmSeverity> |  | [optional] |
| assigneeId | UserId |  | [optional] |
| searchPropagatedAlarms | Boolean |  | [optional] |

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

#### Font
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| size | Float |  | [optional] |
| weight | FontWeight |  | [optional] |
| style | FontStyle |  | [optional] |
| family | String |  | [optional] |

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

#### Aggregation (enum)
`MIN` | `MAX` | `AVG` | `SUM` | `COUNT` | `NONE`

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

#### DefaultDataKeySettings  *(extends DataKeySettings, type=`DEFAULT`)*
*See DataKeySettings for properties.*

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

#### AlarmSearchStatus (enum)
`ANY` | `ACTIVE` | `CLEARED` | `ACK` | `UNACK`

#### AlarmSeverity (enum)
`CRITICAL` | `MAJOR` | `MINOR` | `WARNING` | `INDETERMINATE`

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

#### FontWeight (enum)
`NORMAL` | `BOLD` | `_500`

#### FontStyle (enum)
`NORMAL` | `ITALIC`

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

#### DataKeySettingsType (enum)
`COLUMN` | `TIME_SERIES_CHART` | `DEFAULT`

#### IntervalType (enum)
`MILLISECONDS` | `WEEK` | `WEEK_ISO` | `MONTH` | `QUARTER`

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

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (46 values total)

#### VerticalAlignment (enum)
`BOTTOM` | `TOP` | `MIDDLE`

#### LineSeriesStepType (enum)
`START` | `MIDDLE` | `END`

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


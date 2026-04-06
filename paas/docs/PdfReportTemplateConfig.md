
# PdfReportTemplateConfig

`org.thingsboard.client.model.PdfReportTemplateConfig`

**Extends:** **ReportTemplateConfig**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **footer** | **HeaderFooter** |  | [optional] |
| **header** | **HeaderFooter** |  | [optional] |
| **pageBackground** | **String** |  | [optional] |
| **pageMargins** | **Insets** |  | [optional] |
| **pageOrientation** | **PageOrientation** |  | [optional] |
| **pageSize** | **PageSize** |  | [optional] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BillingCustomerId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CouponId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `ProductId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `SubscriptionAddonId`, `SubscriptionId`, `SubscriptionPlanId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### ReportTemplateConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| namePattern | String |  | [optional] |
| timeDataPattern | String |  | [optional] |
| format | TbReportFormat | Report format |  |
| entityAliases | List<EntityAlias> |  | [optional] |
| filters | List<Filter> |  | [optional] |
| components | List<ReportComponent> |  | [optional] |

#### HeaderFooter
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| enabled | Boolean |  | [optional] |
| components | List<ReportComponent> |  |  |
| firstPage | Object |  | [optional] |

#### Insets
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| left | Integer |  | [optional] |
| right | Integer |  | [optional] |
| top | Integer |  | [optional] |
| bottom | Integer |  | [optional] |

#### PageOrientation (enum)
`PORTRAIT` | `LANDSCAPE`

#### PageSize (enum)
`A4` | `LETTER` | `LEGAL` | `A5` | `A3` | `TABLOID`

#### TbReportFormat (enum)
`PDF` | `CSV`

#### EntityAlias
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | String |  | [optional] |
| alias | String |  | [optional] |
| filter | EntityFilter |  | [optional] |

#### Filter
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | String |  | [optional] |
| filter | String |  | [optional] |
| keyFilters | List<KeyFilter> |  | [optional] |

#### ReportComponent
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| subType | ReportComponentSubType |  |  |
| type | ReportComponentType |  |  |

#### AlarmTableComponent  *(extends ReportComponent, type=`ALARM_TABLE`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| margins | Insets |  | [optional] |
| paddings | Insets |  | [optional] |
| background | String |  | [optional] |
| borderWidth | Integer |  | [optional] |
| borderRadius | Integer |  | [optional] |
| borderColor | String |  | [optional] |
| showTableHeading | Boolean |  | [optional] |
| tableHeading | Heading |  | [optional] |
| tableSortOrder | TableSortOrder |  | [optional] |
| alarmSource | DataSource |  | [optional] |
| timewindow | TimeWindowConfiguration |  | [optional] |

#### DashboardComponent  *(extends ReportComponent, type=`DASHBOARD`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| dataSources | List<DataSource> |  | [optional] |
| margins | Insets |  | [optional] |
| paddings | Insets |  | [optional] |
| background | String |  | [optional] |
| borderWidth | Integer |  | [optional] |
| borderRadius | Integer |  | [optional] |
| borderColor | String |  | [optional] |
| widthType | ImageWidthType |  | [optional] |
| customWidth | Integer |  | [optional] |
| alignment | ImageAlignment |  | [optional] |
| config | DashboardReportConfig | Dashboard report configuration. |  |

#### DividerComponent  *(extends ReportComponent, type=`DIVIDER`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| margins | Insets |  | [optional] |
| paddings | Insets |  | [optional] |
| background | String |  | [optional] |
| borderWidth | Integer |  | [optional] |
| borderRadius | Integer |  | [optional] |
| borderColor | String |  | [optional] |
| length | BorderLength |  | [optional] |
| borderType | BorderType |  | [optional] |
| widthPx | Integer |  | [optional] |
| color | String |  | [optional] |

#### EntityTableComponent  *(extends ReportComponent, type=`ENTITY_TABLE`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| dataSources | List<DataSource> |  | [optional] |
| margins | Insets |  | [optional] |
| paddings | Insets |  | [optional] |
| background | String |  | [optional] |
| borderWidth | Integer |  | [optional] |
| borderRadius | Integer |  | [optional] |
| borderColor | String |  | [optional] |
| showTableHeading | Boolean |  | [optional] |
| tableHeading | Heading |  | [optional] |
| tableSortOrder | TableSortOrder |  | [optional] |

#### ErrorComponent  *(extends ReportComponent, type=`ERROR`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| errorMessage | String |  | [optional] |
| exception | ErrorComponentAllOfException |  | [optional] |

#### HeadingComponent  *(extends ReportComponent, type=`HEADING`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| dataSources | List<DataSource> |  | [optional] |
| margins | Insets |  | [optional] |
| paddings | Insets |  | [optional] |
| background | String |  | [optional] |
| borderWidth | Integer |  | [optional] |
| borderRadius | Integer |  | [optional] |
| borderColor | String |  | [optional] |
| value | String |  | [optional] |
| font | Font |  | [optional] |
| color | String |  | [optional] |
| textAlignment | TextAlignment |  | [optional] |
| verticalAlignment | VerticalAlignment |  | [optional] |
| height | Integer |  | [optional] |

#### ImageComponent  *(extends ReportComponent, type=`IMAGE`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| dataSources | List<DataSource> |  | [optional] |
| margins | Insets |  | [optional] |
| paddings | Insets |  | [optional] |
| background | String |  | [optional] |
| borderWidth | Integer |  | [optional] |
| borderRadius | Integer |  | [optional] |
| borderColor | String |  | [optional] |
| widthType | ImageWidthType |  | [optional] |
| customWidth | Integer |  | [optional] |
| alignment | ImageAlignment |  | [optional] |
| sourceType | ImageSourceType |  | [optional] |
| imageUrl | String |  | [optional] |

#### LatestChartComponent  *(extends ReportComponent, type=`LATEST_CHART`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| dataSources | List<DataSource> |  | [optional] |
| margins | Insets |  | [optional] |
| paddings | Insets |  | [optional] |
| background | String |  | [optional] |
| borderWidth | Integer |  | [optional] |
| borderRadius | Integer |  | [optional] |
| borderColor | String |  | [optional] |
| widthType | ImageWidthType |  | [optional] |
| customWidth | Integer |  | [optional] |
| alignment | ImageAlignment |  | [optional] |
| height | Integer |  | [optional] |
| latestChartSettings | ReportLatestChartSettings |  | [optional] |

#### PageBreakComponent  *(extends ReportComponent, type=`PAGE_BREAK`)*
*See ReportComponent for properties.*

#### RichTextComponent  *(extends ReportComponent, type=`RICH_TEXT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| dataSources | List<DataSource> |  | [optional] |
| margins | Insets |  | [optional] |
| paddings | Insets |  | [optional] |
| background | String |  | [optional] |
| borderWidth | Integer |  | [optional] |
| borderRadius | Integer |  | [optional] |
| borderColor | String |  | [optional] |
| value | String |  | [optional] |

#### SplitViewComponent  *(extends ReportComponent, type=`SPLIT_VIEW`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| margins | Insets |  | [optional] |
| paddings | Insets |  | [optional] |
| background | String |  | [optional] |
| borderWidth | Integer |  | [optional] |
| borderRadius | Integer |  | [optional] |
| borderColor | String |  | [optional] |
| leftView | ReportComponent |  | [optional] |
| rightView | ReportComponent |  | [optional] |
| splitPosition | Float |  | [optional] |
| splitGap | Integer |  | [optional] |
| leftVerticalAlignment | VerticalAlignment |  | [optional] |
| rightVerticalAlignment | VerticalAlignment |  | [optional] |

#### SubReportComponent  *(extends ReportComponent, type=`SUB_REPORT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| dataSources | List<DataSource> |  | [optional] |
| templateId | ReportTemplateId |  | [optional] |
| avoidPageBreakInside | Boolean |  | [optional] |

#### TimeseriesChartComponent  *(extends ReportComponent, type=`TIME_SERIES_CHART`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| dataSources | List<DataSource> |  | [optional] |
| margins | Insets |  | [optional] |
| paddings | Insets |  | [optional] |
| background | String |  | [optional] |
| borderWidth | Integer |  | [optional] |
| borderRadius | Integer |  | [optional] |
| borderColor | String |  | [optional] |
| widthType | ImageWidthType |  | [optional] |
| customWidth | Integer |  | [optional] |
| alignment | ImageAlignment |  | [optional] |
| height | Integer |  | [optional] |
| timewindow | TimeWindowConfiguration |  | [optional] |
| timeSeriesChartSettings | ReportTimeSeriesChartSettings |  | [optional] |

#### TimeseriesTableComponent  *(extends ReportComponent, type=`TIME_SERIES_TABLE`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| dataSources | List<DataSource> |  | [optional] |
| margins | Insets |  | [optional] |
| paddings | Insets |  | [optional] |
| background | String |  | [optional] |
| borderWidth | Integer |  | [optional] |
| borderRadius | Integer |  | [optional] |
| borderColor | String |  | [optional] |
| showTableHeading | Boolean |  | [optional] |
| tableHeading | Heading |  | [optional] |
| tableSortOrder | TableSortOrder |  | [optional] |
| timewindow | TimeWindowConfiguration |  | [optional] |
| showTimestamp | Boolean |  | [optional] |
| timestampLabel | String |  | [optional] |
| timestampPattern | String |  | [optional] |
| timestampColumnSettings | ColumnSettings |  | [optional] |

#### EntityFilter
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### ApiUsageStateFilter  *(extends EntityFilter, type=`apiUsageState`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| customerId | CustomerId |  | [optional] |

#### AssetSearchQueryFilter  *(extends EntityFilter, type=`assetSearchQuery`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| rootEntity | AliasEntityId |  | [optional] |
| relationType | String |  | [optional] |
| direction | EntitySearchDirection |  | [optional] |
| maxLevel | Integer |  | [optional] |
| fetchLastLevelOnly | Boolean |  | [optional] |
| rootStateEntity | Boolean |  | [optional] |
| defaultStateEntity | AliasEntityId |  | [optional] |
| assetTypes | List<String> |  | [optional] |

#### AssetTypeFilter  *(extends EntityFilter, type=`assetType`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| assetTypes | List<String> |  | [optional] |
| assetNameFilter | String |  | [optional] |
| assetType | String |  | [optional] |

#### DeviceSearchQueryFilter  *(extends EntityFilter, type=`deviceSearchQuery`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| rootEntity | AliasEntityId |  | [optional] |
| relationType | String |  | [optional] |
| direction | EntitySearchDirection |  | [optional] |
| maxLevel | Integer |  | [optional] |
| fetchLastLevelOnly | Boolean |  | [optional] |
| rootStateEntity | Boolean |  | [optional] |
| defaultStateEntity | AliasEntityId |  | [optional] |
| deviceTypes | List<String> |  | [optional] |

#### DeviceTypeFilter  *(extends EntityFilter, type=`deviceType`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| deviceTypes | List<String> |  | [optional] |
| deviceNameFilter | String |  | [optional] |
| deviceType | String |  | [optional] |

#### EdgeSearchQueryFilter  *(extends EntityFilter, type=`edgeSearchQuery`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| rootEntity | AliasEntityId |  | [optional] |
| relationType | String |  | [optional] |
| direction | EntitySearchDirection |  | [optional] |
| maxLevel | Integer |  | [optional] |
| fetchLastLevelOnly | Boolean |  | [optional] |
| rootStateEntity | Boolean |  | [optional] |
| defaultStateEntity | AliasEntityId |  | [optional] |
| edgeTypes | List<String> |  | [optional] |

#### EdgeTypeFilter  *(extends EntityFilter, type=`edgeType`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| edgeTypes | List<String> |  | [optional] |
| edgeNameFilter | String |  | [optional] |
| edgeType | String |  | [optional] |

#### EntitiesByGroupNameFilter  *(extends EntityFilter, type=`entitiesByGroupName`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| groupType | EntityType |  | [optional] |
| ownerId | EntityId |  | [optional] |
| entityGroupNameFilter | String |  | [optional] |
| groupStateEntity | Boolean |  | [optional] |
| stateEntityParamName | String |  | [optional] |

#### EntityGroupFilter  *(extends EntityFilter, type=`entityGroup`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| groupType | EntityType |  | [optional] |
| entityGroup | String |  | [optional] |
| groupStateEntity | Boolean |  | [optional] |
| defaultStateGroupType | EntityType |  | [optional] |
| defaultStateEntityGroup | String |  | [optional] |

#### EntityGroupListFilter  *(extends EntityFilter, type=`entityGroupList`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| groupType | EntityType |  | [optional] |
| entityGroupList | List<String> |  | [optional] |

#### EntityGroupNameFilter  *(extends EntityFilter, type=`entityGroupName`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| groupType | EntityType |  | [optional] |
| entityGroupNameFilter | String |  | [optional] |

#### EntityListFilter  *(extends EntityFilter, type=`entityList`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| entityType | EntityType |  | [optional] |
| entityList | List<String> |  | [optional] |

#### EntityNameFilter  *(extends EntityFilter, type=`entityName`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| entityType | EntityType |  | [optional] |
| entityNameFilter | String |  | [optional] |

#### EntityTypeFilter  *(extends EntityFilter, type=`entityType`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| entityType | EntityType |  | [optional] |

#### EntityViewSearchQueryFilter  *(extends EntityFilter, type=`entityViewSearchQuery`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| rootEntity | AliasEntityId |  | [optional] |
| relationType | String |  | [optional] |
| direction | EntitySearchDirection |  | [optional] |
| maxLevel | Integer |  | [optional] |
| fetchLastLevelOnly | Boolean |  | [optional] |
| rootStateEntity | Boolean |  | [optional] |
| defaultStateEntity | AliasEntityId |  | [optional] |
| entityViewTypes | List<String> |  | [optional] |

#### EntityViewTypeFilter  *(extends EntityFilter, type=`entityViewType`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| entityViewTypes | List<String> |  | [optional] |
| entityViewNameFilter | String |  | [optional] |
| entityViewType | String |  | [optional] |

#### RelationsQueryFilter  *(extends EntityFilter, type=`relationsQuery`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| rootEntity | AliasEntityId |  | [optional] |
| multiRoot | Boolean |  | [optional] |
| multiRootEntitiesType | EntityType |  | [optional] |
| multiRootEntityIds | Set<String> |  | [optional] |
| direction | EntitySearchDirection |  | [optional] |
| filters | List<RelationEntityTypeFilter> |  | [optional] |
| maxLevel | Integer |  | [optional] |
| fetchLastLevelOnly | Boolean |  | [optional] |
| negate | Boolean |  | [optional] |
| rootStateEntity | Boolean |  | [optional] |
| defaultStateEntity | AliasEntityId |  | [optional] |

#### SchedulerEventFilter  *(extends EntityFilter, type=`schedulerEvent`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| originator | AliasEntityId |  | [optional] |
| eventType | String |  | [optional] |
| originatorStateEntity | Boolean |  | [optional] |
| defaultStateEntity | AliasEntityId |  | [optional] |

#### SingleEntityFilter  *(extends EntityFilter, type=`singleEntity`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| singleEntity | AliasEntityId |  | [optional] |

#### StateEntityFilter  *(extends EntityFilter, type=`stateEntity`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| defaultStateEntity | AliasEntityId |  | [optional] |

#### StateEntityOwnerFilter  *(extends EntityFilter, type=`stateEntityOwner`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| singleEntity | AliasEntityId |  | [optional] |
| defaultStateEntity | AliasEntityId |  | [optional] |

#### KeyFilter
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| key | EntityKey |  | [optional] |
| valueType | EntityKeyValueType |  | [optional] |
| predicate | KeyFilterPredicate |  | [optional] |

#### ReportComponentSubType (enum)
`DOUGHNUT_CHART` | `HORIZONTAL_DOUGHNUT_CHART` | `POINT_CHART` | `BAR_CHART` | `PIE_CHART` | `LINE_CHART` | `LATEST_BAR_CHART` | `RANGE_CHART` | `BAR_CHART_WITH_LABELS` | `STATE_CHART` | … (11 values total)

#### ReportComponentType (enum)
`HEADING` | `RICH_TEXT` | `ENTITY_TABLE` | `TIME_SERIES_TABLE` | `ALARM_TABLE` | `TIME_SERIES_CHART` | `LATEST_CHART` | `DASHBOARD` | `IMAGE` | `SUB_REPORT` | … (14 values total)

#### EntityKey
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | EntityKeyType |  | [optional] |
| key | String |  | [optional] |

#### EntityKeyValueType (enum)
`STRING` | `NUMERIC` | `BOOLEAN` | `DATE_TIME`

#### KeyFilterPredicate
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### BooleanFilterPredicate  *(extends KeyFilterPredicate, type=`BOOLEAN`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| operation | BooleanOperation |  | [optional] |
| value | FilterPredicateValueBoolean | The value associated with the filter predicate | [optional] |

#### ComplexFilterPredicate  *(extends KeyFilterPredicate, type=`COMPLEX`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| operation | ComplexOperation |  | [optional] |
| predicates | List<KeyFilterPredicate> |  | [optional] |

#### NumericFilterPredicate  *(extends KeyFilterPredicate, type=`NUMERIC`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| operation | NumericOperation |  | [optional] |
| value | FilterPredicateValueDouble | The value associated with the filter predicate | [optional] |

#### StringFilterPredicate  *(extends KeyFilterPredicate, type=`STRING`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| operation | StringOperation |  | [optional] |
| value | FilterPredicateValueString | The value associated with the filter predicate | [optional] |
| ignoreCase | Boolean |  | [optional] |

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

#### Heading
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| text | String |  | [optional] |
| font | Font |  | [optional] |
| color | String |  | [optional] |
| textAlignment | TextAlignment |  | [optional] |
| verticalAlignment | VerticalAlignment |  | [optional] |
| height | Integer |  | [optional] |

#### TableSortOrder
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| column | String |  | [optional] |
| direction | Direction |  | [optional] |

#### TimeWindowConfiguration
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| history | History |  | [optional] |
| aggregation | AggregationConfiguration |  | [optional] |
| timezone | String |  | [optional] |

#### ImageWidthType (enum)
`FIT_WIDTH` | `ORIGINAL` | `CUSTOM`

#### ImageAlignment (enum)
`LEFT` | `CENTER` | `RIGHT`

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

#### ReportBarChartWithLabelsSettings  *(extends ReportTimeSeriesChartSettings, subType=`barChartWithLabels`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| showBarLabel | Boolean |  | [optional] |
| barLabelFont | Font |  | [optional] |
| barLabelColor | String |  | [optional] |
| showBarValue | Boolean |  | [optional] |
| barValueFont | Font |  | [optional] |
| barValueColor | String |  | [optional] |
| showBarBorder | Boolean |  | [optional] |
| barBorderWidth | Float |  | [optional] |
| barBorderRadius | Float |  | [optional] |
| barBackgroundSettings | ChartFillSettings |  | [optional] |
| barUnits | String |  | [optional] |
| barDecimals | Integer |  | [optional] |

#### ReportRangeChartSettings  *(extends ReportTimeSeriesChartSettings, subType=`rangeChart`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| rangeColors | List<ColorRange> |  | [optional] |
| outOfRangeColor | String |  | [optional] |
| showRangeThresholds | Boolean |  | [optional] |
| rangeThreshold | TimeSeriesChartThreshold |  | [optional] |
| fillArea | Boolean |  | [optional] |
| fillAreaOpacity | Float |  | [optional] |
| lineSettings | LineSeriesSettings |  | [optional] |
| rangeUnits | String |  | [optional] |
| rangeDecimals | Integer |  | [optional] |

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

#### ReportDoughnutChartSettings  *(extends ReportLatestChartSettings, subType=`horizontalDoughnutChart`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| layout | DoughnutLayout |  | [optional] |
| clockwise | Boolean |  | [optional] |
| totalValueFont | Font |  | [optional] |
| totalValueColor | String |  | [optional] |

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

#### DashboardReportConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| baseUrl | String | Base URL of ThingsBoard UI that should be accessible by Web Report Server. |  |
| dashboardId | String | A string value representing the dashboard id. |  |
| state | String | Target dashboard state for dashboard report generation. | [optional] |
| timezone | String | Timezone in which target dashboard will be presented in dashboard report. |  |
| useDashboardTimewindow | Boolean | If set, timewindow configured in the target dashboard will be used during dashboard report generation. | [optional] |
| timewindow | com.fasterxml.jackson.databind.JsonNode | Specific dashboard timewindow that will be used during dashboard report generation. | [optional] |
| namePattern | String | If set, timewindow configured in the target dashboard will be used during dashboard report generation. |  |
| type | String | Dashboard report file type, can be PDF | PNG |
| useCurrentUserCredentials | Boolean | If set, credentials of user created this dashboard report configuration will be used to open dashboard UI during dashboard report generation. | [optional] |
| userId | String | A string value representing the user id. |  |

#### ImageSourceType (enum)
`IMAGE` | `ENTITY_KEY`

#### ErrorComponentAllOfException
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| cause | ErrorComponentAllOfExceptionCause |  | [optional] |
| stackTrace | List<ErrorComponentAllOfExceptionCauseStackTrace> |  | [optional] |
| message | String |  | [optional] |
| suppressed | List<ErrorComponentAllOfExceptionCause> |  | [optional] |
| localizedMessage | String |  | [optional] |

#### BorderLength (enum)
`LONG` | `SHORT`

#### BorderType (enum)
`SOLID` | `DASHED` | `DOTTED`

#### AliasEntityId
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| aliasEntityType | AliasEntityType |  | [optional] |
| entityType | EntityType |  |  |
| id | UUID | ID of the entity, time-based UUID v1 |  |

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (52 values total)

#### EntitySearchDirection (enum)
`FROM` | `TO`

#### RelationEntityTypeFilter
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| relationType | String | Type of the relation between root entity and other entity (e.g. 'Contains' or 'Manages'). | [optional] |
| entityTypes | List<EntityType> | Array of entity types to filter the related entities (e.g. 'DEVICE', 'ASSET'). | [optional] |
| negate | Boolean | Negate relation type between root entity and other entity. | [optional] |

#### EntityKeyType (enum)
`ATTRIBUTE` | `CLIENT_ATTRIBUTE` | `SHARED_ATTRIBUTE` | `SERVER_ATTRIBUTE` | `TIME_SERIES` | `ENTITY_FIELD` | `ALARM_FIELD`

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

#### FontWeight (enum)
`NORMAL` | `BOLD` | `_500`

#### FontStyle (enum)
`NORMAL` | `ITALIC`

#### Direction (enum)
`ASC` | `DESC`

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

#### CellSettings
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| font | Font |  | [optional] |
| color | String |  | [optional] |
| backgroundColor | String |  | [optional] |
| textAlignment | TextAlignment |  | [optional] |
| verticalAlignment | VerticalAlignment |  | [optional] |

#### DataKeySettingsType (enum)
`COLUMN` | `TIME_SERIES_CHART` | `DEFAULT`

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

#### LegendPosition (enum)
`TOP` | `BOTTOM` | `LEFT` | `RIGHT`

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
| className | String |  | [optional] |
| nativeMethod | Boolean |  | [optional] |

#### AliasEntityType (enum)
`CURRENT_CUSTOMER` | `CURRENT_TENANT` | `CURRENT_USER` | `CURRENT_USER_OWNER`

#### StringOperation (enum)
`EQUAL` | `NOT_EQUAL` | `STARTS_WITH` | `ENDS_WITH` | `CONTAINS` | `NOT_CONTAINS` | `IN` | `NOT_IN`

#### FilterPredicateValueString
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| defaultValue | String |  | [optional] |
| userValue | String |  | [optional] |
| dynamicValue | DynamicValueString |  | [optional] |

#### NumericOperation (enum)
`EQUAL` | `NOT_EQUAL` | `GREATER` | `LESS` | `GREATER_OR_EQUAL` | `LESS_OR_EQUAL`

#### FilterPredicateValueDouble
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| defaultValue | Double |  | [optional] |
| userValue | Double |  | [optional] |
| dynamicValue | DynamicValueDouble |  | [optional] |

#### BooleanOperation (enum)
`EQUAL` | `NOT_EQUAL`

#### FilterPredicateValueBoolean
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| defaultValue | Boolean |  | [optional] |
| userValue | Boolean |  | [optional] |
| dynamicValue | DynamicValueBoolean |  | [optional] |

#### ComplexOperation (enum)
`AND` | `OR`

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

#### ChartFillSettings
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | ChartFillType |  | [optional] |
| opacity | Float |  | [optional] |
| gradient | ChartFillSettingsGradient |  | [optional] |

#### ColorRange
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| from | Double |  | [optional] |
| to | Double |  | [optional] |
| color | String |  | [optional] |

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

#### PieChartLabelPosition (enum)
`INSIDE` | `OUTSIDE`

#### DoughnutLayout (enum)
`DEFAULT` | `WITH_TOTAL`

#### DynamicValueString
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| resolvedValue | String |  | [optional] |
| sourceType | DynamicValueSourceType |  | [optional] |
| sourceAttribute | String |  | [optional] |
| inherit | Boolean |  | [optional] |

#### DynamicValueDouble
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| resolvedValue | Double |  | [optional] |
| sourceType | DynamicValueSourceType |  | [optional] |
| sourceAttribute | String |  | [optional] |
| inherit | Boolean |  | [optional] |

#### DynamicValueBoolean
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| resolvedValue | Boolean |  | [optional] |
| sourceType | DynamicValueSourceType |  | [optional] |
| sourceAttribute | String |  | [optional] |
| inherit | Boolean |  | [optional] |

#### IntervalType (enum)
`MILLISECONDS` | `WEEK` | `WEEK_ISO` | `MONTH` | `QUARTER`

#### ChartFillType (enum)
`NONE` | `OPACITY` | `GRADIENT`

#### ChartFillSettingsGradient
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| start | Float |  | [optional] |
| end | Float |  | [optional] |

#### LineSeriesStepType (enum)
`START` | `MIDDLE` | `END`

#### ChartLabelPosition (enum)
`TOP` | `BOTTOM`

#### DynamicValueSourceType (enum)
`CURRENT_TENANT` | `CURRENT_CUSTOMER` | `CURRENT_USER` | `CURRENT_DEVICE`

#### TimeSeriesChartSeriesType (enum)
`LINE` | `BAR`

#### DataKeyComparisonSettings
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| showValuesForComparison | Boolean |  | [optional] |
| comparisonValuesLabel | String |  | [optional] |
| color | String |  | [optional] |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


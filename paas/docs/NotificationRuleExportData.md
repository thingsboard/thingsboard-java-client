
# NotificationRuleExportData

`org.thingsboard.client.model.NotificationRuleExportData`

**Extends:** **EntityExportData**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BillingCustomerId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CouponId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `ProductId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `SubscriptionAddonId`, `SubscriptionId`, `SubscriptionPlanId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### EntityExportData
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| entity | ExportableEntity |  | [optional] |
| relations | List<EntityRelation> |  | [optional] |
| attributes | Map<String, List<AttributeExportData>> | Map of attributes where key is the scope of attributes and value is the list of attributes for that scope | [optional] |
| calculatedFields | List<CalculatedField> |  | [optional] |
| entityType | EntityType |  |  |

#### ExportableEntity
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | EntityId |  | [optional] |
| name | String |  | [optional] |

#### EntityRelation
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| from | EntityId | JSON object with [from] Entity Id. |  |
| to | EntityId | JSON object with [to] Entity Id. |  |
| type | String | String value of relation type. |  |
| typeGroup | RelationTypeGroup | Represents the type group of the relation. |  |
| version | Long |  | [optional] |
| additionalInfo | com.fasterxml.jackson.databind.JsonNode | Additional parameters of the relation. | [optional] |

#### AttributeExportData
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| key | String |  | [optional] |
| lastUpdateTs | Long |  | [optional] |
| booleanValue | Boolean |  | [optional] |
| strValue | String |  | [optional] |
| longValue | Long |  | [optional] |
| doubleValue | Double |  | [optional] |
| jsonValue | String |  | [optional] |

#### CalculatedField
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | CalculatedFieldId | JSON object with the Calculated Field Id. Referencing non-existing Calculated Field Id will cause error. | [optional] |
| createdTime | Long | Timestamp of the calculated field creation, in milliseconds | [optional] [readonly] |
| tenantId | TenantId |  | [optional] |
| entityId | EntityId |  | [optional] |
| type | CalculatedFieldType |  | [optional] |
| name | String | User defined name of the calculated field. | [optional] |
| debugSettings | DebugSettings | Debug settings object. | [optional] |
| configurationVersion | Integer | Version of calculated field configuration. | [optional] |
| _configuration | CalculatedFieldConfiguration |  |  |
| version | Long |  | [optional] |
| additionalInfo | com.fasterxml.jackson.databind.JsonNode | Additional parameters of the calculated field | [optional] |
| debugMode | Boolean |  | [optional] |

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (52 values total)

#### RelationTypeGroup (enum)
`COMMON` | `DASHBOARD` | `FROM_ENTITY_GROUP` | `RULE_CHAIN` | `RULE_NODE` | `EDGE` | `EDGE_AUTO_ASSIGN_RULE_CHAIN`

#### CalculatedFieldType (enum)
`SIMPLE` | `SCRIPT` | `GEOFENCING` | `ALARM` | `PROPAGATION` | `RELATED_ENTITIES_AGGREGATION` | `ENTITY_AGGREGATION`

#### DebugSettings
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| failuresEnabled | Boolean | Debug failures. | [optional] |
| allEnabled | Boolean | Debug All. Used as a trigger for updating debugAllUntil. | [optional] |
| allEnabledUntil | Long | Timestamp of the end time for the processing debug events. | [optional] |

#### CalculatedFieldConfiguration
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |
| output | Output |  | [optional] |
| aiGenerated | Boolean |  | [optional] |

#### AlarmCalculatedFieldConfiguration  *(extends CalculatedFieldConfiguration, type=`ALARM`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| arguments | Map<String, Argument> |  |  |
| clearRule | AlarmRuleDefinition |  | [optional] |
| createRules | Map<String, AlarmRuleDefinition> |  |  |
| propagate | Boolean |  | [optional] |
| propagateRelationTypes | List<String> |  | [optional] |
| propagateToOwner | Boolean |  | [optional] |
| propagateToOwnerHierarchy | Boolean |  | [optional] |
| propagateToTenant | Boolean |  | [optional] |

#### EntityAggregationCalculatedFieldConfiguration  *(extends CalculatedFieldConfiguration, type=`ENTITY_AGGREGATION`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| arguments | Map<String, Argument> |  |  |
| interval | AggInterval |  |  |
| metrics | Map<String, AggMetric> |  |  |
| produceIntermediateResult | Boolean |  | [optional] |
| watermark | Watermark |  | [optional] |

#### GeofencingCalculatedFieldConfiguration  *(extends CalculatedFieldConfiguration, type=`GEOFENCING`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| entityCoordinates | EntityCoordinates |  |  |
| scheduledUpdateEnabled | Boolean |  | [optional] |
| scheduledUpdateInterval | Integer |  | [optional] |
| zoneGroups | Map<String, ZoneGroupConfiguration> |  |  |

#### PropagationCalculatedFieldConfiguration  *(extends CalculatedFieldConfiguration, type=`PROPAGATION`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| applyExpressionToResolvedArguments | Boolean |  | [optional] |
| arguments | Map<String, Argument> |  |  |
| expression | String |  | [optional] |
| relation | RelationPathLevel |  |  |

#### RelatedEntitiesAggregationCalculatedFieldConfiguration  *(extends CalculatedFieldConfiguration, type=`RELATED_ENTITIES_AGGREGATION`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| arguments | Map<String, Argument> |  |  |
| deduplicationIntervalInSec | Long |  | [optional] |
| metrics | Map<String, AggMetric> |  |  |
| relation | RelationPathLevel |  |  |
| scheduledUpdateEnabled | Boolean |  | [optional] |
| scheduledUpdateInterval | Integer |  | [optional] |
| useLatestTs | Boolean |  | [optional] |

#### ScriptCalculatedFieldConfiguration  *(extends CalculatedFieldConfiguration, type=`SCRIPT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| arguments | Map<String, Argument> |  |  |
| expression | String |  | [optional] |

#### SimpleCalculatedFieldConfiguration  *(extends CalculatedFieldConfiguration, type=`SIMPLE`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| arguments | Map<String, Argument> |  |  |
| expression | String |  | [optional] |
| useLatestTs | Boolean |  | [optional] |

#### Output
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| name | String |  | [optional] |
| scope | AttributeScope |  | [optional] |
| decimalsByDefault | Integer |  | [optional] |
| strategy | Object |  | [optional] |
| type | String |  |  |

#### AttributesOutput  *(extends Output, type=`ATTRIBUTES`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| strategy | AttributesOutputStrategy |  | [optional] |

#### TimeSeriesOutput  *(extends Output, type=`TIME_SERIES`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| strategy | TimeSeriesOutputStrategy |  | [optional] |

#### AttributeScope (enum)
`CLIENT_SCOPE` | `SERVER_SCOPE` | `SHARED_SCOPE`

#### Argument
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| refEntityId | EntityId |  | [optional] |
| refDynamicSourceConfiguration | CfArgumentDynamicSourceConfiguration |  | [optional] |
| refEntityKey | ReferencedEntityKey |  | [optional] |
| defaultValue | String |  | [optional] |
| limit | Integer |  | [optional] |
| timeWindow | Long |  | [optional] |

#### EntityCoordinates
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| latitudeKeyName | String |  |  |
| longitudeKeyName | String |  |  |

#### ZoneGroupConfiguration
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| refEntityId | EntityId |  | [optional] |
| refDynamicSourceConfiguration | CfArgumentDynamicSourceConfiguration |  | [optional] |
| perimeterKeyName | String |  |  |
| reportStrategy | GeofencingReportStrategy |  |  |
| createRelationsWithMatchedZones | Boolean |  | [optional] |
| relationType | String |  | [optional] |
| direction | EntitySearchDirection |  | [optional] |

#### AlarmRuleDefinition
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| alarmDetails | String |  | [optional] |
| condition | AlarmRuleCondition |  |  |
| dashboardId | DashboardId |  | [optional] |

#### RelationPathLevel
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| direction | EntitySearchDirection |  |  |
| relationType | String |  |  |

#### AggMetric
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| function | AggFunction |  | [optional] |
| filter | String |  | [optional] |
| input | AggInput |  | [optional] |
| defaultValue | Double |  | [optional] |

#### AggInterval
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### CustomInterval  *(extends AggInterval, type=`CUSTOM`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| tz | String |  |  |
| offsetSec | Long |  | [optional] |
| durationSec | Long |  |  |

#### DayInterval  *(extends AggInterval, type=`DAY`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| tz | String |  |  |
| offsetSec | Long |  | [optional] |

#### HourInterval  *(extends AggInterval, type=`HOUR`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| tz | String |  |  |
| offsetSec | Long |  | [optional] |

#### MonthInterval  *(extends AggInterval, type=`MONTH`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| tz | String |  |  |
| offsetSec | Long |  | [optional] |

#### QuarterInterval  *(extends AggInterval, type=`QUARTER`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| tz | String |  |  |
| offsetSec | Long |  | [optional] |

#### WeekInterval  *(extends AggInterval, type=`WEEK`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| tz | String |  |  |
| offsetSec | Long |  | [optional] |

#### WeekSunSatInterval  *(extends AggInterval, type=`WEEK_SUN_SAT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| tz | String |  |  |
| offsetSec | Long |  | [optional] |

#### YearInterval  *(extends AggInterval, type=`YEAR`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| tz | String |  |  |
| offsetSec | Long |  | [optional] |

#### Watermark
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| duration | Long |  | [optional] |

#### TimeSeriesOutputStrategy
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### TimeSeriesImmediateOutputStrategy  *(extends TimeSeriesOutputStrategy, type=`IMMEDIATE`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| ttl | Long |  | [optional] |
| saveTimeSeries | Boolean |  | [optional] |
| saveLatest | Boolean |  | [optional] |
| sendWsUpdate | Boolean |  | [optional] |
| processCfs | Boolean |  | [optional] |

#### TimeSeriesRuleChainOutputStrategy  *(extends TimeSeriesOutputStrategy, type=`RULE_CHAIN`)*
*See TimeSeriesOutputStrategy for properties.*

#### AttributesOutputStrategy
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### AttributesImmediateOutputStrategy  *(extends AttributesOutputStrategy, type=`IMMEDIATE`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| sendAttributesUpdatedNotification | Boolean |  | [optional] |
| updateAttributesOnlyOnValueChange | Boolean |  | [optional] |
| saveAttribute | Boolean |  | [optional] |
| sendWsUpdate | Boolean |  | [optional] |
| processCfs | Boolean |  | [optional] |

#### AttributesRuleChainOutputStrategy  *(extends AttributesOutputStrategy, type=`RULE_CHAIN`)*
*See AttributesOutputStrategy for properties.*

#### CfArgumentDynamicSourceConfiguration
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### CurrentOwnerDynamicSourceConfiguration  *(extends CfArgumentDynamicSourceConfiguration, type=`CURRENT_OWNER`)*
*See CfArgumentDynamicSourceConfiguration for properties.*

#### RelationPathQueryDynamicSourceConfiguration  *(extends CfArgumentDynamicSourceConfiguration, type=`RELATION_PATH_QUERY`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| levels | List<RelationPathLevel> |  | [optional] |

#### ReferencedEntityKey
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| key | String |  | [optional] |
| type | ArgumentType |  | [optional] |
| scope | AttributeScope |  | [optional] |

#### GeofencingReportStrategy (enum)
`REPORT_TRANSITION_EVENTS_ONLY` | `REPORT_PRESENCE_STATUS_ONLY` | `REPORT_TRANSITION_EVENTS_AND_PRESENCE_STATUS`

#### EntitySearchDirection (enum)
`FROM` | `TO`

#### AlarmRuleCondition
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| expression | AlarmConditionExpression |  |  |
| schedule | AlarmConditionValueAlarmRuleSchedule |  | [optional] |
| type | String |  |  |

#### AlarmRuleDurationCondition  *(extends AlarmRuleCondition, type=`DURATION`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| unit | TimeUnit |  |  |
| value | AlarmConditionValueLong |  |  |

#### AlarmRuleRepeatingCondition  *(extends AlarmRuleCondition, type=`REPEATING`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| count | AlarmConditionValueInteger |  |  |

#### AlarmRuleSimpleCondition  *(extends AlarmRuleCondition, type=`SIMPLE`)*
*See AlarmRuleCondition for properties.*

#### AggFunction (enum)
`MIN` | `MAX` | `SUM` | `AVG` | `COUNT` | `COUNT_UNIQUE`

#### AggInput
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### AggFunctionInput  *(extends AggInput, type=`function`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| function | String |  | [optional] |

#### AggKeyInput  *(extends AggInput, type=`key`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| key | String |  | [optional] |

#### ArgumentType (enum)
`TS_LATEST` | `ATTRIBUTE` | `TS_ROLLING`

#### AlarmConditionExpression
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### SimpleAlarmConditionExpression  *(extends AlarmConditionExpression, type=`SIMPLE`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| filters | List<AlarmRuleConditionFilter> |  |  |
| operation | ComplexOperation |  | [optional] |

#### TbelAlarmConditionExpression  *(extends AlarmConditionExpression, type=`TBEL`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| expression | String |  |  |

#### AlarmConditionValueAlarmRuleSchedule
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| dynamicValueArgument | String |  | [optional] |
| staticValue | AlarmRuleSchedule |  | [optional] |

#### AlarmRuleSchedule
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### AlarmRuleAnyTimeSchedule  *(extends AlarmRuleSchedule, type=`ANY_TIME`)*
*See AlarmRuleSchedule for properties.*

#### AlarmRuleCustomTimeSchedule  *(extends AlarmRuleSchedule, type=`CUSTOM`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| items | List<AlarmRuleCustomTimeScheduleItem> |  | [optional] |
| timezone | String |  | [optional] |

#### AlarmRuleSpecificTimeSchedule  *(extends AlarmRuleSchedule, type=`SPECIFIC_TIME`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| daysOfWeek | Set<Integer> |  | [optional] |
| endsOn | Long |  | [optional] |
| startsOn | Long |  | [optional] |
| timezone | String |  | [optional] |

#### TimeUnit (enum)
`NANOSECONDS` | `MICROSECONDS` | `MILLISECONDS` | `SECONDS` | `MINUTES` | `HOURS` | `DAYS`

#### AlarmConditionValueLong
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| staticValue | Long |  | [optional] |
| dynamicValueArgument | String |  | [optional] |

#### AlarmConditionValueInteger
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| staticValue | Integer |  | [optional] |
| dynamicValueArgument | String |  | [optional] |

#### AlarmRuleConditionFilter
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| argument | String |  |  |
| operation | ComplexOperation |  | [optional] |
| predicates | List<AlarmRuleKeyFilterPredicate> |  |  |
| valueType | EntityKeyValueType |  |  |

#### ComplexOperation (enum)
`AND` | `OR`

#### AlarmRuleKeyFilterPredicate
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### AlarmRuleBooleanFilterPredicate  *(extends AlarmRuleKeyFilterPredicate, type=`BOOLEAN`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| operation | BooleanOperation |  |  |
| value | AlarmConditionValueBoolean |  |  |

#### AlarmRuleComplexFilterPredicate  *(extends AlarmRuleKeyFilterPredicate, type=`COMPLEX`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| operation | ComplexOperation |  | [optional] |
| predicates | List<AlarmRuleKeyFilterPredicate> |  | [optional] |

#### AlarmRuleNoDataFilterPredicate  *(extends AlarmRuleKeyFilterPredicate, type=`NO_DATA`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| duration | AlarmConditionValueLong |  |  |
| unit | TimeUnit |  |  |

#### AlarmRuleNumericFilterPredicate  *(extends AlarmRuleKeyFilterPredicate, type=`NUMERIC`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| operation | NumericOperation |  |  |
| value | AlarmConditionValueDouble |  |  |

#### AlarmRuleStringFilterPredicate  *(extends AlarmRuleKeyFilterPredicate, type=`STRING`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| ignoreCase | Boolean |  | [optional] |
| operation | StringOperation |  |  |
| value | AlarmConditionValueString |  |  |

#### EntityKeyValueType (enum)
`STRING` | `NUMERIC` | `BOOLEAN` | `DATE_TIME`

#### AlarmRuleCustomTimeScheduleItem
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| dayOfWeek | Integer |  | [optional] |
| enabled | Boolean |  | [optional] |
| endsOn | Long |  | [optional] |
| startsOn | Long |  | [optional] |

#### StringOperation (enum)
`EQUAL` | `NOT_EQUAL` | `STARTS_WITH` | `ENDS_WITH` | `CONTAINS` | `NOT_CONTAINS` | `IN` | `NOT_IN`

#### AlarmConditionValueString
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| staticValue | String |  | [optional] |
| dynamicValueArgument | String |  | [optional] |

#### NumericOperation (enum)
`EQUAL` | `NOT_EQUAL` | `GREATER` | `LESS` | `GREATER_OR_EQUAL` | `LESS_OR_EQUAL`

#### AlarmConditionValueDouble
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| staticValue | Double |  | [optional] |
| dynamicValueArgument | String |  | [optional] |

#### BooleanOperation (enum)
`EQUAL` | `NOT_EQUAL`

#### AlarmConditionValueBoolean
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| staticValue | Boolean |  | [optional] |
| dynamicValueArgument | String |  | [optional] |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


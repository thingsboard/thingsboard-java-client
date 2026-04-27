
# EntityExportData

`org.thingsboard.client.model.EntityExportData`

Base export container for ThingsBoard entities

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **entity** | **ExportableEntity** |  | [optional] |
| **relations** | **List\<EntityRelation\>** |  | [optional] |
| **attributes** | **Map\<String, List<AttributeExportData>\>** | Map of attributes where key is the scope of attributes and value is the list of attributes for that scope | [optional] |
| **calculatedFields** | **List\<CalculatedField\>** |  | [optional] |
| **entityType** | **EntityType** |  | |



## Subtypes

#### AiModelExportData  *(entityType=`AI_MODEL`)*
*(no additional properties)*

#### AssetExportData  *(entityType=`ASSET`)*
*(no additional properties)*

#### AssetProfileExportData  *(entityType=`ASSET_PROFILE`)*
*(no additional properties)*

#### ConverterExportData  *(entityType=`CONVERTER`)*
*(no additional properties)*

#### CustomerExportData  *(entityType=`CUSTOMER`)*
*(no additional properties)*

#### DashboardExportData  *(entityType=`DASHBOARD`)*
*(no additional properties)*

#### DeviceExportData  *(entityType=`DEVICE`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| credentials | DeviceCredentials |  | [optional] |

#### DeviceProfileExportData  *(entityType=`DEVICE_PROFILE`)*
*(no additional properties)*

#### EntityGroupExportData  *(entityType=`ENTITY_GROUP`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| permissions | List<GroupPermission> |  | [optional] |
| groupOtaPackages | List<DeviceGroupOtaPackage> |  | [optional] |
| groupEntities | Boolean |  | [optional] |

#### EntityViewExportData  *(entityType=`ENTITY_VIEW`)*
*(no additional properties)*

#### IntegrationExportData  *(entityType=`INTEGRATION`)*
*(no additional properties)*

#### NotificationRuleExportData  *(entityType=`NOTIFICATION_RULE`)*
*(no additional properties)*

#### NotificationTargetExportData  *(entityType=`NOTIFICATION_TARGET`)*
*(no additional properties)*

#### NotificationTemplateExportData  *(entityType=`NOTIFICATION_TEMPLATE`)*
*(no additional properties)*

#### OtaPackageExportData  *(entityType=`OTA_PACKAGE`)*
*(no additional properties)*

#### ReportTemplateExportData  *(entityType=`REPORT_TEMPLATE`)*
*(no additional properties)*

#### RoleExportData  *(entityType=`ROLE`)*
*(no additional properties)*

#### RuleChainExportData  *(entityType=`RULE_CHAIN`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| metaData | RuleChainMetaData |  | [optional] |

#### SchedulerEventExportData  *(entityType=`SCHEDULER_EVENT`)*
*(no additional properties)*

#### TbResourceExportData  *(entityType=`TB_RESOURCE`)*
*(no additional properties)*

#### WidgetsBundleExportData  *(entityType=`WIDGETS_BUNDLE`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| widgets | List<com.fasterxml.jackson.databind.JsonNode> |  | [optional] |
| fqns | List<String> |  | [optional] |

#### WidgetTypeExportData  *(entityType=`WIDGET_TYPE`)*
*(no additional properties)*

## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### ExportableEntity
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| createdTime | Long |  | [optional] |
| id | EntityId |  | [optional] |
| name | String |  | [optional] |
| tenantId | TenantId |  | [optional] |

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
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (46 values total)

#### DeviceCredentials
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | DeviceCredentialsId | The Id is automatically generated during device creation. Use 'getDeviceCredentialsByDeviceId' to obtain the id based on device id. Use 'updateDeviceCredentials' to update device credentials. | [readonly] |
| createdTime | Long | Timestamp of the device credentials creation, in milliseconds | [optional] |
| deviceId | DeviceId | JSON object with the device Id. |  |
| credentialsType | DeviceCredentialsType | Type of the credentials | [optional] |
| credentialsId | String | Unique Credentials Id per platform instance. Used to lookup credentials from the database. By default, new access token for your device. Depends on the type of the credentials. |  |
| credentialsValue | String | Value of the credentials. Null in case of ACCESS_TOKEN credentials type. Base64 value in case of X509_CERTIFICATE. Complex object in case of MQTT_BASIC and LWM2M_CREDENTIALS | [optional] |
| version | Long |  | [optional] |

#### GroupPermission
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | GroupPermissionId | JSON object with the Group Permission Id. Specify this field to update the Group Permission. Referencing non-existing Group Permission Id will cause error. Omit this field to create new Group Permission. | [optional] |
| createdTime | Long | Timestamp of the group permission creation, in milliseconds | [optional] [readonly] |
| tenantId | TenantId | JSON object with the Tenant Id. | [optional] [readonly] |
| userGroupId | EntityGroupId | JSON object with the User Group Id. Represents the user group that will have permissions to perform operations against the corresponding entity group. |  |
| roleId | RoleId | JSON object with the Role Id. Represents the set of permissions. The role type (GENERIC or GROUP) determines whether 'entityGroupId' is required. |  |
| entityGroupId | EntityGroupId | JSON object with the Entity Group Id. Required when using a GROUP role — specifies the entity group to which the permissions apply. Must be null or omitted when using a GENERIC role. | [optional] |
| entityGroupType | EntityType | Type of the entities in the group: DEVICE, ASSET, CUSTOMER, etc. Auto-populated from the referenced entity group. Null for generic permissions. | [optional] [readonly] |
| isPublic | Boolean |  | [optional] |
| name | String | Name of the Group Permissions. Auto-generated | [optional] [readonly] |
| _public | Boolean |  | [optional] |

#### DeviceGroupOtaPackage
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | UUID |  | [optional] |
| groupId | EntityGroupId |  | [optional] |
| otaPackageType | OtaPackageType |  | [optional] |
| otaPackageId | OtaPackageId |  | [optional] |
| otaPackageUpdateTime | Long |  | [optional] |

#### RuleChainMetaData
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| ruleChainId | RuleChainId | JSON object with Rule Chain Id. | [readonly] |
| version | Long | Version of the Rule Chain | [optional] |
| firstNodeIndex | Integer | Index of the first rule node in the 'nodes' list |  |
| nodes | List<RuleNode> | List of rule node JSON objects |  |
| connections | List<NodeConnectionInfo> | List of JSON objects that represent connections between rule nodes |  |
| ruleChainConnections | List<RuleChainConnectionInfo> | List of JSON objects that represent connections between rule nodes and other rule chains. |  |
| notes | List<RuleChainNote> | List of sticky notes placed on the rule chain canvas | [optional] |

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
| output | Output |  | [optional] |
| type | String |  |  |

#### AlarmCalculatedFieldConfiguration  *(extends CalculatedFieldConfiguration, type=`ALARM`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| arguments | Map<String, Argument> |  |  |
| createRules | Map<String, AlarmRule> |  |  |
| clearRule | AlarmRule |  | [optional] |
| propagate | Boolean |  | [optional] |
| propagateToOwner | Boolean |  | [optional] |
| propagateToOwnerHierarchy | Boolean |  | [optional] |
| propagateToTenant | Boolean |  | [optional] |
| propagateRelationTypes | List<String> |  | [optional] |

#### EntityAggregationCalculatedFieldConfiguration  *(extends CalculatedFieldConfiguration, type=`ENTITY_AGGREGATION`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| arguments | Map<String, Argument> |  |  |
| metrics | Map<String, AggMetric> |  |  |
| interval | AggInterval |  |  |
| watermark | Watermark |  | [optional] |
| produceIntermediateResult | Boolean |  | [optional] |

#### GeofencingCalculatedFieldConfiguration  *(extends CalculatedFieldConfiguration, type=`GEOFENCING`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| entityCoordinates | EntityCoordinates |  |  |
| zoneGroups | Map<String, ZoneGroupConfiguration> |  |  |
| scheduledUpdateEnabled | Boolean |  | [optional] |
| scheduledUpdateInterval | Integer |  | [optional] |

#### PropagationCalculatedFieldConfiguration  *(extends CalculatedFieldConfiguration, type=`PROPAGATION`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| arguments | Map<String, Argument> |  |  |
| expression | String |  | [optional] |
| relation | RelationPathLevel |  |  |
| applyExpressionToResolvedArguments | Boolean |  | [optional] |

#### RelatedEntitiesAggregationCalculatedFieldConfiguration  *(extends CalculatedFieldConfiguration, type=`RELATED_ENTITIES_AGGREGATION`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| relation | RelationPathLevel |  |  |
| arguments | Map<String, Argument> |  |  |
| deduplicationIntervalInSec | Long |  | [optional] |
| metrics | Map<String, AggMetric> |  |  |
| useLatestTs | Boolean |  | [optional] |
| scheduledUpdateInterval | Integer |  | [optional] |
| scheduledUpdateEnabled | Boolean |  | [optional] |

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

#### DeviceCredentialsId
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | UUID | string |  |

#### DeviceCredentialsType (enum)
`ACCESS_TOKEN` | `X509_CERTIFICATE` | `MQTT_BASIC` | `LWM2_M_CREDENTIALS`

#### OtaPackageType (enum)
`FIRMWARE` | `SOFTWARE`

#### RuleNode
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | RuleNodeId | JSON object with the Rule Node Id. Specify this field to update the Rule Node. Referencing non-existing Rule Node Id will cause error. Omit this field to create new rule node. | [optional] |
| createdTime | Long | Timestamp of the rule node creation, in milliseconds | [optional] [readonly] |
| additionalInfo | com.fasterxml.jackson.databind.JsonNode | Additional parameters of the rule node. May include: 'layoutX' (number, X coordinate for visualization), 'layoutY' (number, Y coordinate for visualization), 'description' (string). | [optional] |
| ruleChainId | RuleChainId | JSON object with the Rule Chain Id. | [optional] [readonly] |
| type | String | Full Java Class Name of the rule node implementation. | [optional] |
| name | String | User defined name of the rule node. Used on UI and for logging. | [optional] |
| debugSettings | DebugSettings | Debug settings object. | [optional] |
| singletonMode | Boolean | Enable/disable singleton mode. | [optional] |
| queueName | String | Queue name. | [optional] |
| configurationVersion | Integer | Version of rule node configuration. | [optional] |
| _configuration | com.fasterxml.jackson.databind.JsonNode | JSON with the rule node configuration. Structure depends on the rule node implementation. | [optional] |
| externalId | RuleNodeId |  | [optional] |
| debugMode | Boolean |  | [optional] |

#### NodeConnectionInfo
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| fromIndex | Integer | Index of rule node in the 'nodes' array of the RuleChainMetaData. Indicates the 'from' part of the connection. |  |
| toIndex | Integer | Index of rule node in the 'nodes' array of the RuleChainMetaData. Indicates the 'to' part of the connection. |  |
| type | String | Type of the relation. Typically indicated the result of processing by the 'from' rule node. For example, 'Success' or 'Failure' |  |

#### RuleChainConnectionInfo
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| fromIndex | Integer | Index of rule node in the 'nodes' array of the RuleChainMetaData. Indicates the 'from' part of the connection. |  |
| targetRuleChainId | RuleChainId | JSON object with the Rule Chain Id. |  |
| additionalInfo | com.fasterxml.jackson.databind.JsonNode | JSON object with the additional information about the connection. |  |
| type | String | Type of the relation. Typically indicated the result of processing by the 'from' rule node. For example, 'Success' or 'Failure' |  |

#### RuleChainNote
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | String | Unique identifier of the note on the canvas | [optional] |
| x | Integer | Horizontal position of the note on the canvas, in pixels | [optional] |
| y | Integer | Vertical position of the note on the canvas, in pixels | [optional] |
| width | Integer | Width of the note, in pixels | [optional] |
| height | Integer | Height of the note, in pixels | [optional] |
| content | String | Markdown or HTML content of the note | [optional] |
| backgroundColor | String | Background color of the note in CSS hex format, e.g. '#FFF9C4' | [optional] |
| borderColor | String | Border color of the note in CSS hex format, e.g. '#E6C800' | [optional] |
| borderWidth | Integer | Border width of the note in pixels | [optional] |
| applyDefaultMarkdownStyle | Boolean | Whether to apply the default markdown stylesheet to the note content | [optional] |
| markdownCss | String | Custom CSS styles applied to the note content | [optional] |

#### Output
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| decimalsByDefault | Integer |  | [optional] |
| name | String |  | [optional] |
| scope | AttributeScope |  | [optional] |
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

#### AlarmRule
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| condition | AlarmCondition |  |  |
| alarmDetails | String |  | [optional] |
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

#### AlarmCondition
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| expression | AlarmConditionExpression |  |  |
| schedule | AlarmConditionValueAlarmSchedule |  | [optional] |
| type | String |  |  |

#### DurationAlarmCondition  *(extends AlarmCondition, type=`DURATION`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| unit | TimeUnit |  |  |
| value | AlarmConditionValueLong |  |  |

#### RepeatingAlarmCondition  *(extends AlarmCondition, type=`REPEATING`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| count | AlarmConditionValueInteger |  |  |

#### SimpleAlarmCondition  *(extends AlarmCondition, type=`SIMPLE`)*
*See AlarmCondition for properties.*

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
| filters | List<AlarmConditionFilter> |  |  |
| operation | AlarmRuleComplexOperation |  | [optional] |

#### TbelAlarmConditionExpression  *(extends AlarmConditionExpression, type=`TBEL`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| expression | String |  |  |

#### AlarmConditionValueAlarmSchedule
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| staticValue | AlarmSchedule |  | [optional] |
| dynamicValueArgument | String |  | [optional] |

#### AlarmSchedule
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### AnyTimeSchedule  *(extends AlarmSchedule, type=`ANY_TIME`)*
*See AlarmSchedule for properties.*

#### CustomTimeSchedule  *(extends AlarmSchedule, type=`CUSTOM`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| timezone | String |  | [optional] |
| items | List<CustomTimeScheduleItem> |  | [optional] |

#### SpecificTimeSchedule  *(extends AlarmSchedule, type=`SPECIFIC_TIME`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| timezone | String |  | [optional] |
| daysOfWeek | Set<Integer> |  | [optional] |
| startsOn | Long |  | [optional] |
| endsOn | Long |  | [optional] |

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

#### AlarmConditionFilter
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| argument | String |  |  |
| valueType | EntityKeyValueType |  |  |
| operation | AlarmRuleComplexOperation |  | [optional] |
| predicates | List<AlarmRuleKeyFilterPredicate> |  |  |

#### AlarmRuleComplexOperation (enum)
`AND` | `OR`

#### EntityKeyValueType (enum)
`STRING` | `NUMERIC` | `BOOLEAN` | `DATE_TIME`

#### AlarmRuleKeyFilterPredicate
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### AlarmRuleBooleanFilterPredicate  *(extends AlarmRuleKeyFilterPredicate, type=`BOOLEAN`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| operation | AlarmRuleBooleanOperation |  |  |
| value | AlarmConditionValueBoolean |  |  |

#### AlarmRuleComplexFilterPredicate  *(extends AlarmRuleKeyFilterPredicate, type=`COMPLEX`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| operation | AlarmRuleComplexOperation |  | [optional] |
| predicates | List<AlarmRuleKeyFilterPredicate> |  | [optional] |

#### NoDataFilterPredicate  *(extends AlarmRuleKeyFilterPredicate, type=`NO_DATA`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| unit | TimeUnit |  |  |
| duration | AlarmConditionValueLong |  |  |

#### AlarmRuleNumericFilterPredicate  *(extends AlarmRuleKeyFilterPredicate, type=`NUMERIC`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| operation | AlarmRuleNumericOperation |  |  |
| value | AlarmConditionValueDouble |  |  |

#### AlarmRuleStringFilterPredicate  *(extends AlarmRuleKeyFilterPredicate, type=`STRING`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| operation | AlarmRuleStringOperation |  |  |
| value | AlarmConditionValueString |  |  |
| ignoreCase | Boolean |  | [optional] |

#### CustomTimeScheduleItem
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| enabled | Boolean |  | [optional] |
| dayOfWeek | Integer |  | [optional] |
| startsOn | Long |  | [optional] |
| endsOn | Long |  | [optional] |

#### AlarmRuleStringOperation (enum)
`EQUAL` | `NOT_EQUAL` | `STARTS_WITH` | `ENDS_WITH` | `CONTAINS` | `NOT_CONTAINS` | `IN` | `NOT_IN`

#### AlarmConditionValueString
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| staticValue | String |  | [optional] |
| dynamicValueArgument | String |  | [optional] |

#### AlarmRuleNumericOperation (enum)
`EQUAL` | `NOT_EQUAL` | `GREATER` | `LESS` | `GREATER_OR_EQUAL` | `LESS_OR_EQUAL`

#### AlarmConditionValueDouble
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| staticValue | Double |  | [optional] |
| dynamicValueArgument | String |  | [optional] |

#### AlarmRuleBooleanOperation (enum)
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


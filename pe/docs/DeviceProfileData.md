
# DeviceProfileData

`org.thingsboard.client.model.DeviceProfileData`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **_configuration** | **DeviceProfileConfiguration** | JSON object of device profile configuration | [optional] |
| **transportConfiguration** | **DeviceProfileTransportConfiguration** | JSON object of device profile transport configuration | [optional] |
| **provisionConfiguration** | **DeviceProfileProvisionConfiguration** | JSON object of provisioning strategy type per device profile | [optional] |
| **alarms** | **List\<DeviceProfileAlarm\>** |  | [optional] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### DeviceProfileConfiguration
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### DefaultDeviceProfileConfiguration  *(extends DeviceProfileConfiguration, type=`DEFAULT`)*
*See DeviceProfileConfiguration for properties.*

#### DeviceProfileTransportConfiguration
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### CoapDeviceProfileTransportConfiguration  *(extends DeviceProfileTransportConfiguration, type=`COAP`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| coapDeviceTypeConfiguration | CoapDeviceTypeConfiguration |  | [optional] |
| clientSettings | PowerSavingConfiguration |  | [optional] |

#### DefaultDeviceProfileTransportConfiguration  *(extends DeviceProfileTransportConfiguration, type=`DEFAULT`)*
*See DeviceProfileTransportConfiguration for properties.*

#### Lwm2mDeviceProfileTransportConfiguration  *(extends DeviceProfileTransportConfiguration, type=`LWM2M`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| observeAttr | TelemetryMappingConfiguration | Configuration for mapping LwM2M resources to telemetry and attributes | [optional] |
| bootstrapServerUpdateEnable | Boolean | Flag indicating whether LwM2M bootstrap server update is enabled | [optional] |
| bootstrap | List<LwM2MBootstrapServerCredential> |  | [optional] |
| clientLwM2mSettings | OtherConfiguration | Other LwM2M client settings | [optional] |

#### MqttDeviceProfileTransportConfiguration  *(extends DeviceProfileTransportConfiguration, type=`MQTT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| deviceTelemetryTopic | String |  | [optional] |
| deviceAttributesTopic | String |  | [optional] |
| deviceAttributesSubscribeTopic | String |  | [optional] |
| transportPayloadTypeConfiguration | TransportPayloadTypeConfiguration |  | [optional] |
| sparkplug | Boolean |  | [optional] |
| sparkplugAttributesMetricNames | Set<String> |  | [optional] |
| sendAckOnValidationException | Boolean |  | [optional] |

#### SnmpDeviceProfileTransportConfiguration  *(extends DeviceProfileTransportConfiguration, type=`SNMP`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| timeoutMs | Integer |  | [optional] |
| retries | Integer |  | [optional] |
| communicationConfigs | List<SnmpCommunicationConfig> |  | [optional] |

#### DeviceProfileProvisionConfiguration
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| provisionDeviceSecret | String | Provision device secret | [optional] |
| type | String |  |  |

#### AllowCreateNewDevicesDeviceProfileProvisionConfiguration  *(extends DeviceProfileProvisionConfiguration, type=`ALLOW_CREATE_NEW_DEVICES`)*
*See DeviceProfileProvisionConfiguration for properties.*

#### CheckPreProvisionedDevicesDeviceProfileProvisionConfiguration  *(extends DeviceProfileProvisionConfiguration, type=`CHECK_PRE_PROVISIONED_DEVICES`)*
*See DeviceProfileProvisionConfiguration for properties.*

#### DisabledDeviceProfileProvisionConfiguration  *(extends DeviceProfileProvisionConfiguration, type=`DISABLED`)*
*See DeviceProfileProvisionConfiguration for properties.*

#### X509CertificateChainProvisionConfiguration  *(extends DeviceProfileProvisionConfiguration, type=`X509_CERTIFICATE_CHAIN`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| certificateRegExPattern | String |  | [optional] |
| allowCreateNewDevicesByX509Certificate | Boolean |  | [optional] |

#### DeviceProfileAlarm
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | String | String value representing the alarm rule id | [optional] |
| alarmType | String | String value representing type of the alarm | [optional] |
| createRules | Map<String, AlarmRule> | Complex JSON object representing create alarm rules. The unique create alarm rule can be created for each alarm severity type. There can be 5 create alarm rules configured per a single alarm type. See method implementation notes and AlarmRule model for more details | [optional] |
| clearRule | AlarmRule | JSON object representing clear alarm rule | [optional] |
| propagate | Boolean | Propagation flag to specify if alarm should be propagated to parent entities of alarm originator | [optional] |
| propagateToOwner | Boolean | Propagation flag to specify if alarm should be propagated to the owner (tenant or customer) of alarm originator | [optional] |
| propagateToOwnerHierarchy | Boolean | Propagation flag to specify if alarm should be propagated to the owner (tenant or customer) and all parent owners in the customer hierarchy | [optional] |
| propagateToTenant | Boolean | Propagation flag to specify if alarm should be propagated to the tenant entity | [optional] |
| propagateRelationTypes | List<String> | JSON array of relation types that should be used for propagation. By default, 'propagateRelationTypes' array is empty which means that the alarm will be propagated based on any relation type to parent entities. This parameter should be used only in case when 'propagate' parameter is set to true, otherwise, 'propagateRelationTypes' array will be ignored. | [optional] |

#### AlarmRule
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| condition | AlarmCondition | JSON object representing the alarm rule condition | [optional] |
| alarmDetails | String | String value representing the additional details for an alarm rule | [optional] |
| dashboardId | DashboardId | JSON object with the dashboard Id representing the reference to alarm details dashboard used by mobile application | [optional] |
| schedule | AlarmSchedule | JSON object representing time interval during which the rule is active | [optional] |

#### TransportPayloadTypeConfiguration
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| transportPayloadType | String |  |  |

#### JsonTransportPayloadConfiguration  *(extends TransportPayloadTypeConfiguration, transportPayloadType=`JSON`)*
*See TransportPayloadTypeConfiguration for properties.*

#### ProtoTransportPayloadConfiguration  *(extends TransportPayloadTypeConfiguration, transportPayloadType=`PROTOBUF`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| deviceTelemetryProtoSchema | String |  | [optional] |
| deviceAttributesProtoSchema | String |  | [optional] |
| deviceRpcRequestProtoSchema | String |  | [optional] |
| deviceRpcResponseProtoSchema | String |  | [optional] |
| enableCompatibilityWithJsonPayloadFormat | Boolean |  | [optional] |
| useJsonPayloadFormatForDefaultDownlinkTopics | Boolean |  | [optional] |

#### TelemetryMappingConfiguration
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| keyName | Map<String, String> | Map of LwM2M resource paths to telemetry key names | [optional] |
| observe | Set<String> | Set of resources to observe | [optional] |
| attribute | Set<String> | Set of attribute keys | [optional] |
| telemetry | Set<String> | Set of telemetry keys | [optional] |
| attributeLwm2m | Map<String, ObjectAttributes> | Map of resource paths to specific LwM2M object attributes | [optional] |
| initAttrTelAsObsStrategy | Boolean |  | [optional] |
| observeStrategy | TelemetryObserveStrategy | Observation strategy for telemetry | [optional] |

#### LwM2MBootstrapServerCredential
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| securityMode | String |  |  |

#### OtherConfiguration
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| powerMode | PowerMode |  | [optional] |
| psmActivityTimer | Long |  | [optional] |
| edrxCycle | Long |  | [optional] |
| pagingTransmissionWindow | Long |  | [optional] |
| useObject19ForOtaInfo | Boolean |  | [optional] |
| fwUpdateStrategy | Integer |  | [optional] |
| swUpdateStrategy | Integer |  | [optional] |
| clientOnlyObserveAfterConnect | Integer |  | [optional] |
| fwUpdateResource | String |  | [optional] |
| swUpdateResource | String |  | [optional] |
| defaultObjectIDVer | String |  | [optional] |

#### CoapDeviceTypeConfiguration
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| coapDeviceType | String |  |  |

#### DefaultCoapDeviceTypeConfiguration  *(extends CoapDeviceTypeConfiguration, coapDeviceType=`DEFAULT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| transportPayloadTypeConfiguration | TransportPayloadTypeConfiguration |  | [optional] |

#### EfentoCoapDeviceTypeConfiguration  *(extends CoapDeviceTypeConfiguration, coapDeviceType=`EFENTO`)*
*See CoapDeviceTypeConfiguration for properties.*

#### PowerSavingConfiguration
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| powerMode | PowerMode |  | [optional] |
| psmActivityTimer | Long |  | [optional] |
| edrxCycle | Long |  | [optional] |
| pagingTransmissionWindow | Long |  | [optional] |

#### SnmpCommunicationConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| spec | SnmpCommunicationSpec | Specification of the SNMP communication |  |

#### ClientAttributesQueryingSnmpCommunicationConfig  *(extends SnmpCommunicationConfig, spec=`CLIENT_ATTRIBUTES_QUERYING`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| mappings | List<SnmpMapping> |  | [optional] |
| queryingFrequencyMs | Long |  | [optional] |

#### SharedAttributesSettingSnmpCommunicationConfig  *(extends SnmpCommunicationConfig, spec=`SHARED_ATTRIBUTES_SETTING`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| mappings | List<SnmpMapping> |  | [optional] |

#### TelemetryQueryingSnmpCommunicationConfig  *(extends SnmpCommunicationConfig, spec=`TELEMETRY_QUERYING`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| mappings | List<SnmpMapping> |  | [optional] |
| queryingFrequencyMs | Long |  | [optional] |

#### ToDeviceRpcRequestSnmpCommunicationConfig  *(extends SnmpCommunicationConfig, spec=`TO_DEVICE_RPC_REQUEST`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| mappings | List<SnmpMapping> |  | [optional] |

#### ToServerRpcRequestSnmpCommunicationConfig  *(extends SnmpCommunicationConfig, spec=`TO_SERVER_RPC_REQUEST`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| mappings | List<SnmpMapping> |  | [optional] |

#### AlarmCondition
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| condition | List<AlarmConditionFilter> |  | [optional] |
| spec | AlarmConditionSpec | JSON object representing alarm condition type | [optional] |

#### AlarmSchedule
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| dynamicValue | DynamicValueString |  | [optional] |
| type | AlarmScheduleType |  | [optional] |

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
| daysOfWeek | Set<Integer> |  | [optional] |
| endsOn | Long |  | [optional] |
| startsOn | Long |  | [optional] |
| timezone | String |  | [optional] |

#### ObjectAttributes
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| dim | Long |  | [optional] |
| ssid | Long |  | [optional] |
| uri | String |  | [optional] |
| ver | Object |  | [optional] |
| lwm2m | LwM2mVersion |  | [optional] |
| pmin | Long |  | [optional] |
| pmax | Long |  | [optional] |
| gt | Double |  | [optional] |
| lt | Double |  | [optional] |
| st | Double |  | [optional] |
| epmin | Long |  | [optional] |
| epmax | Long |  | [optional] |

#### TelemetryObserveStrategy (enum)
`SINGLE_0_ONE_RESOURCE_EQUALS_ONE_SINGLE_OBSERVE_REQUEST` | `COMPOSITE_ALL_1_ALL_RESOURCES_IN_ONE_COMPOSITE_OBSERVE_REQUEST` | `COMPOSITE_BY_OBJECT_2_GROUPED_COMPOSITE_OBSERVE_REQUESTS_BY_OBJECT`

#### PowerMode (enum)
`PSM` | `DRX` | `E_DRX`

#### SnmpCommunicationSpec (enum)
`TELEMETRY_QUERYING` | `CLIENT_ATTRIBUTES_QUERYING` | `SHARED_ATTRIBUTES_SETTING` | `TO_DEVICE_RPC_REQUEST` | `TO_SERVER_RPC_REQUEST`

#### AlarmConditionFilter
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| valueType | EntityKeyValueType | String representation of the type of the value | [optional] |
| key | AlarmConditionFilterKey | JSON object for specifying alarm condition by specific key | [optional] |
| predicate | KeyFilterPredicate | JSON object representing filter condition | [optional] |
| value | Object |  | [optional] |

#### AlarmConditionSpec
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### DurationAlarmConditionSpec  *(extends AlarmConditionSpec, type=`DURATION`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| unit | TimeUnit | Duration time unit | [optional] |
| predicate | FilterPredicateValueLong | Duration predicate | [optional] |

#### RepeatingAlarmConditionSpec  *(extends AlarmConditionSpec, type=`REPEATING`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| predicate | FilterPredicateValueInteger | Repeating predicate | [optional] |

#### SimpleAlarmConditionSpec  *(extends AlarmConditionSpec, type=`SIMPLE`)*
*See AlarmConditionSpec for properties.*

#### DynamicValueString
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| resolvedValue | String |  | [optional] |
| sourceType | DynamicValueSourceType |  | [optional] |
| sourceAttribute | String |  | [optional] |
| inherit | Boolean |  | [optional] |

#### AlarmScheduleType (enum)
`ANY_TIME` | `SPECIFIC_TIME` | `CUSTOM`

#### LwM2mVersion
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| supported | Boolean |  | [optional] |

#### SnmpMapping
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| oid | String |  | [optional] |
| key | String |  | [optional] |
| dataType | DataType |  | [optional] |

#### EntityKeyValueType (enum)
`STRING` | `NUMERIC` | `BOOLEAN` | `DATE_TIME`

#### AlarmConditionFilterKey
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | AlarmConditionKeyType | The key type | [optional] |
| key | String | String value representing the key | [optional] |

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

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (46 values total)

#### DynamicValueSourceType (enum)
`CURRENT_TENANT` | `CURRENT_CUSTOMER` | `CURRENT_USER` | `CURRENT_DEVICE`

#### CustomTimeScheduleItem
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| dayOfWeek | Integer |  | [optional] |
| enabled | Boolean |  | [optional] |
| endsOn | Long |  | [optional] |
| startsOn | Long |  | [optional] |

#### DataType (enum)
`BOOLEAN` | `LONG` | `DOUBLE` | `STRING` | `JSON`

#### AlarmConditionKeyType (enum)
`ATTRIBUTE` | `TIME_SERIES` | `ENTITY_FIELD` | `CONSTANT`

#### TimeUnit (enum)
`NANOSECONDS` | `MICROSECONDS` | `MILLISECONDS` | `SECONDS` | `MINUTES` | `HOURS` | `DAYS`

#### FilterPredicateValueLong
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| defaultValue | Long |  | [optional] |
| userValue | Long |  | [optional] |
| dynamicValue | DynamicValueLong |  | [optional] |

#### FilterPredicateValueInteger
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| defaultValue | Integer |  | [optional] |
| userValue | Integer |  | [optional] |
| dynamicValue | DynamicValueInteger |  | [optional] |

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

#### DynamicValueLong
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| resolvedValue | Long |  | [optional] |
| sourceType | DynamicValueSourceType |  | [optional] |
| sourceAttribute | String |  | [optional] |
| inherit | Boolean |  | [optional] |

#### DynamicValueInteger
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| resolvedValue | Integer |  | [optional] |
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

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


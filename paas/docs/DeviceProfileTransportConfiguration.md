
# DeviceProfileTransportConfiguration

`org.thingsboard.client.model.DeviceProfileTransportConfiguration`

Configuration for device profile transport

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **type** | **String** |  | |



## Subtypes

#### CoapDeviceProfileTransportConfiguration  *(type=`COAP`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| coapDeviceTypeConfiguration | CoapDeviceTypeConfiguration |  | [optional] |
| clientSettings | PowerSavingConfiguration |  | [optional] |

#### DefaultDeviceProfileTransportConfiguration  *(type=`DEFAULT`)*
*(no additional properties)*

#### Lwm2mDeviceProfileTransportConfiguration  *(type=`LWM2M`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| observeAttr | TelemetryMappingConfiguration | Configuration for mapping LwM2M resources to telemetry and attributes | [optional] |
| bootstrapServerUpdateEnable | Boolean | Flag indicating whether LwM2M bootstrap server update is enabled | [optional] |
| bootstrap | List<LwM2MBootstrapServerCredential> |  | [optional] |
| clientLwM2mSettings | OtherConfiguration | Other LwM2M client settings | [optional] |

#### MqttDeviceProfileTransportConfiguration  *(type=`MQTT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| deviceTelemetryTopic | String |  | [optional] |
| deviceAttributesTopic | String |  | [optional] |
| deviceAttributesSubscribeTopic | String |  | [optional] |
| transportPayloadTypeConfiguration | TransportPayloadTypeConfiguration |  | [optional] |
| sparkplug | Boolean |  | [optional] |
| sparkplugAttributesMetricNames | Set<String> |  | [optional] |
| sendAckOnValidationException | Boolean |  | [optional] |

#### SnmpDeviceProfileTransportConfiguration  *(type=`SNMP`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| timeoutMs | Integer |  | [optional] |
| retries | Integer |  | [optional] |
| communicationConfigs | List<SnmpCommunicationConfig> |  | [optional] |

## Referenced Types

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

#### PowerMode (enum)
`PSM` | `DRX` | `E_DRX`

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

#### SnmpCommunicationSpec (enum)
`TELEMETRY_QUERYING` | `CLIENT_ATTRIBUTES_QUERYING` | `SHARED_ATTRIBUTES_SETTING` | `TO_DEVICE_RPC_REQUEST` | `TO_SERVER_RPC_REQUEST`

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

#### DataType (enum)
`BOOLEAN` | `LONG` | `DOUBLE` | `STRING` | `JSON`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions



# MqttDeviceProfileTransportConfiguration

`org.thingsboard.client.model.MqttDeviceProfileTransportConfiguration`

**Extends:** **DeviceProfileTransportConfiguration**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **deviceTelemetryTopic** | **String** |  | [optional] |
| **deviceAttributesTopic** | **String** |  | [optional] |
| **deviceAttributesSubscribeTopic** | **String** |  | [optional] |
| **transportPayloadTypeConfiguration** | **TransportPayloadTypeConfiguration** |  | [optional] |
| **sparkplug** | **Boolean** |  | [optional] |
| **sparkplugAttributesMetricNames** | **Set\<String\>** |  | [optional] |
| **sendAckOnValidationException** | **Boolean** |  | [optional] |



## Referenced Types

#### DeviceProfileTransportConfiguration
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

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

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


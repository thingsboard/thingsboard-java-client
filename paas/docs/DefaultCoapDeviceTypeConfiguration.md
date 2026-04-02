
# DefaultCoapDeviceTypeConfiguration

`org.thingsboard.client.model.DefaultCoapDeviceTypeConfiguration`

**Extends:** **CoapDeviceTypeConfiguration**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **transportPayloadTypeConfiguration** | **TransportPayloadTypeConfiguration** |  | [optional] |



## Referenced Types

#### CoapDeviceTypeConfiguration
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| coapDeviceType | String |  |  |

#### EfentoCoapDeviceTypeConfiguration  *(extends CoapDeviceTypeConfiguration, coapDeviceType=`EFENTO`)*
*See CoapDeviceTypeConfiguration for properties.*

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


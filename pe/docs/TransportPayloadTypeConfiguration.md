
# TransportPayloadTypeConfiguration

`org.thingsboard.client.model.TransportPayloadTypeConfiguration`

Configuration for transport payload type

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **transportPayloadType** | **String** |  | |



## Subtypes

#### JsonTransportPayloadConfiguration  *(transportPayloadType=`JSON`)*
*(no additional properties)*

#### ProtoTransportPayloadConfiguration  *(transportPayloadType=`PROTOBUF`)*
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


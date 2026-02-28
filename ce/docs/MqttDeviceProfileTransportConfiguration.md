
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



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


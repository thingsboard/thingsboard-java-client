
# Lwm2mDeviceProfileTransportConfiguration

`org.thingsboard.client.model.Lwm2mDeviceProfileTransportConfiguration`

**Extends:** **DeviceProfileTransportConfiguration**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **observeAttr** | **TelemetryMappingConfiguration** | Configuration for mapping LwM2M resources to telemetry and attributes | [optional] |
| **bootstrapServerUpdateEnable** | **Boolean** | Flag indicating whether LwM2M bootstrap server update is enabled | [optional] |
| **bootstrap** | **List\<LwM2MBootstrapServerCredential\>** |  | [optional] |
| **clientLwM2mSettings** | **OtherConfiguration** | Other LwM2M client settings | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


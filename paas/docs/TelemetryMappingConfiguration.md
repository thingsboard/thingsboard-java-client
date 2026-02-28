
# TelemetryMappingConfiguration

`org.thingsboard.client.model.TelemetryMappingConfiguration`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **keyName** | **Map\<String, String\>** | Map of LwM2M resource paths to telemetry key names | [optional] |
| **observe** | **Set\<String\>** | Set of resources to observe | [optional] |
| **attribute** | **Set\<String\>** | Set of attribute keys | [optional] |
| **telemetry** | **Set\<String\>** | Set of telemetry keys | [optional] |
| **attributeLwm2m** | **Map\<String, ObjectAttributes\>** | Map of resource paths to specific LwM2M object attributes | [optional] |
| **initAttrTelAsObsStrategy** | **Boolean** |  | [optional] |
| **observeStrategy** | **TelemetryObserveStrategy** | Observation strategy for telemetry | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


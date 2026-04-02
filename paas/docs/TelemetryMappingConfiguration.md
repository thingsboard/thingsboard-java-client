
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



## Referenced Types

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

#### LwM2mVersion
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| supported | Boolean |  | [optional] |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


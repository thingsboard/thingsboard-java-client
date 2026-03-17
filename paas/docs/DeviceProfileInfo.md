
# DeviceProfileInfo

`org.thingsboard.client.model.DeviceProfileInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **EntityId** | JSON object with the entity Id.  | [optional] |
| **name** | **String** | Entity Name | [optional] |
| **image** | **String** | Either URL or Base64 data of the icon. Used in the mobile application to visualize set of device profiles in the grid view.  | [optional] |
| **defaultDashboardId** | **DashboardId** | Reference to the dashboard. Used in the mobile application to open the default dashboard when user navigates to device details. | [optional] |
| **type** | **DeviceProfileType** | Type of the profile. Always 'DEFAULT' for now. Reserved for future use. | [optional] |
| **transportType** | **DeviceTransportType** | Type of the transport used to connect the device. Default transport supports HTTP, CoAP and MQTT. | [optional] |
| **tenantId** | **TenantId** | Tenant id. | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions




# DeviceProfileInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**EntityId**](EntityId.md) | JSON object with the entity Id.  |  [optional] |
|**tenantId** | [**TenantId**](TenantId.md) | Tenant id. |  [optional] |
|**name** | **String** | Entity Name |  [optional] |
|**image** | **String** | Either URL or Base64 data of the icon. Used in the mobile application to visualize set of device profiles in the grid view.  |  [optional] |
|**defaultDashboardId** | [**DashboardId**](DashboardId.md) | Reference to the dashboard. Used in the mobile application to open the default dashboard when user navigates to device details. |  [optional] |
|**type** | **DeviceProfileType** | Type of the profile. Always &#39;DEFAULT&#39; for now. Reserved for future use. |  [optional] |
|**transportType** | **DeviceTransportType** | Type of the transport used to connect the device. Default transport supports HTTP, CoAP and MQTT. |  [optional] |




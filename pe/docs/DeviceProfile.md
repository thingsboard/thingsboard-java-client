

# DeviceProfile

A JSON value representing the device profile.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**DeviceProfileId**](DeviceProfileId.md) | JSON object with the device profile Id. Specify this field to update the device profile. Referencing non-existing device profile Id will cause error. Omit this field to create new device profile. |  [optional] |
|**createdTime** | **Long** | Timestamp of the profile creation, in milliseconds |  [optional] [readonly] |
|**tenantId** | [**TenantId**](TenantId.md) | JSON object with Tenant Id that owns the profile. |  [optional] [readonly] |
|**name** | **String** | Unique Device Profile Name in scope of Tenant. |  [optional] |
|**description** | **String** | Device Profile description.  |  [optional] |
|**image** | **String** | Either URL or Base64 data of the icon. Used in the mobile application to visualize set of device profiles in the grid view.  |  [optional] |
|**type** | **DeviceProfileType** | Type of the profile. Always &#39;DEFAULT&#39; for now. Reserved for future use. |  [optional] |
|**transportType** | **DeviceTransportType** | Type of the transport used to connect the device. Default transport supports HTTP, CoAP and MQTT. |  [optional] |
|**provisionType** | **DeviceProfileProvisionType** | Provisioning strategy. |  [optional] |
|**defaultRuleChainId** | [**RuleChainId**](RuleChainId.md) | Reference to the rule chain. If present, the specified rule chain will be used to process all messages related to device, including telemetry, attribute updates, etc. Otherwise, the root rule chain will be used to process those messages. |  [optional] |
|**defaultDashboardId** | [**DashboardId**](DashboardId.md) | Reference to the dashboard. Used in the mobile application to open the default dashboard when user navigates to device details. |  [optional] |
|**defaultQueueName** | **String** | Rule engine queue name. If present, the specified queue will be used to store all unprocessed messages related to device, including telemetry, attribute updates, etc. Otherwise, the &#39;Main&#39; queue will be used to store those messages. |  [optional] |
|**provisionDeviceKey** | **String** | Unique provisioning key used by &#39;Device Provisioning&#39; feature. |  [optional] |
|**firmwareId** | [**OtaPackageId**](OtaPackageId.md) | Reference to the firmware OTA package. If present, the specified package will be used as default device firmware.  |  [optional] |
|**softwareId** | [**OtaPackageId**](OtaPackageId.md) | Reference to the software OTA package. If present, the specified package will be used as default device software.  |  [optional] |
|**defaultEdgeRuleChainId** | [**RuleChainId**](RuleChainId.md) | Reference to the edge rule chain. If present, the specified edge rule chain will be used on the edge to process all messages related to device, including telemetry, attribute updates, etc. Otherwise, the edge root rule chain will be used to process those messages. |  [optional] |
|**version** | **Long** |  |  [optional] |
|**_default** | **Boolean** | Used to mark the default profile. Default profile is used when the device profile is not specified during device creation. |  [optional] |
|**profileData** | [**DeviceProfileData**](DeviceProfileData.md) | Complex JSON object that includes addition device profile configuration (transport, alarm rules, etc). |  [optional] |




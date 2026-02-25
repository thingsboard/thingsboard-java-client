

# DeviceInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**DeviceId**](DeviceId.md) | JSON object with the Device Id. Specify this field to update the Device. Referencing non-existing Device Id will cause error. Omit this field to create new Device. |  [optional] |
|**createdTime** | **Long** | Timestamp of the device creation, in milliseconds |  [optional] [readonly] |
|**tenantId** | [**TenantId**](TenantId.md) | JSON object with Tenant Id. Use &#39;assignDeviceToTenant&#39; to change the Tenant Id. |  [optional] [readonly] |
|**customerId** | [**CustomerId**](CustomerId.md) | JSON object with Customer Id. Use &#39;assignDeviceToCustomer&#39; to change the Customer Id. |  [optional] [readonly] |
|**name** | **String** | Unique Device Name in scope of Tenant |  [optional] |
|**type** | **String** | Device Profile Name |  [optional] |
|**label** | **String** | Label that may be used in widgets |  [optional] |
|**deviceProfileId** | [**DeviceProfileId**](DeviceProfileId.md) | JSON object with Device Profile Id. |  |
|**firmwareId** | [**OtaPackageId**](OtaPackageId.md) | JSON object with Ota Package Id. |  [optional] |
|**softwareId** | [**OtaPackageId**](OtaPackageId.md) | JSON object with Ota Package Id. |  [optional] |
|**version** | **Long** |  |  [optional] |
|**ownerName** | **String** | Owner name |  [optional] [readonly] |
|**groups** | [**List&lt;EntityInfo&gt;**](EntityInfo.md) | Groups |  [optional] |
|**active** | **Boolean** | Device active flag. |  [optional] [readonly] |
|**deviceData** | [**DeviceData**](DeviceData.md) | JSON object with content specific to type of transport in the device profile. |  [optional] |
|**ownerId** | [**EntityId**](EntityId.md) | JSON object with Customer or Tenant Id |  [optional] [readonly] |
|**additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional parameters of the device |  [optional] |




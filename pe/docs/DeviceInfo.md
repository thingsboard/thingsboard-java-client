
# DeviceInfo

`org.thingsboard.client.model.DeviceInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **DeviceId** | JSON object with the Device Id. Specify this field to update the Device. Referencing non-existing Device Id will cause error. Omit this field to create new Device. | [optional] |
| **createdTime** | **Long** | Timestamp of the device creation, in milliseconds | [optional] [readonly] |
| **tenantId** | **TenantId** | JSON object with Tenant Id. Use 'assignDeviceToTenant' to change the Tenant Id. | [optional] [readonly] |
| **customerId** | **CustomerId** | JSON object with Customer Id. Use 'assignDeviceToCustomer' to change the Customer Id. | [optional] [readonly] |
| **name** | **String** | Unique Device Name in scope of Tenant | [optional] |
| **type** | **String** | Device Profile Name | [optional] |
| **label** | **String** | Label that may be used in widgets | [optional] |
| **deviceProfileId** | **DeviceProfileId** | JSON object with Device Profile Id. | |
| **firmwareId** | **OtaPackageId** | JSON object with Ota Package Id. | [optional] |
| **softwareId** | **OtaPackageId** | JSON object with Ota Package Id. | [optional] |
| **version** | **Long** |  | [optional] |
| **ownerName** | **String** | Owner name | [optional] [readonly] |
| **groups** | **List\<EntityInfo\>** | Groups | [optional] |
| **active** | **Boolean** | Device active flag. | [optional] [readonly] |
| **ownerId** | **EntityId** | JSON object with Customer or Tenant Id | [optional] |
| **additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional parameters of the device. May include: 'gateway' (boolean, whether the device is a gateway), 'description' (string), 'lastConnectedGateway' (string, UUID of the last gateway that connected this device). | [optional] |
| **deviceData** | **DeviceData** | JSON object with content specific to type of transport in the device profile. | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


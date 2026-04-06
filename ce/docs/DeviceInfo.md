
# DeviceInfo

`org.thingsboard.client.model.DeviceInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **DeviceId** | JSON object with the Device Id. Specify this field to update the Device. Referencing non-existing Device Id will cause error. Omit this field to create new Device. | [optional] |
| **createdTime** | **Long** | Timestamp of the device creation, in milliseconds | [optional] [readonly] |
| **tenantId** | **TenantId** | JSON object with Tenant Id. Use 'assignDeviceToTenant' to change the Tenant Id. | [optional] [readonly] |
| **customerId** | **CustomerId** | JSON object with Customer Id. Use 'assignDeviceToCustomer' to change the Customer Id. | [optional] [readonly] |
| **name** | **String** | Unique Device Name in scope of Tenant | |
| **type** | **String** | Device Profile Name | [optional] |
| **label** | **String** | Label that may be used in widgets | [optional] |
| **deviceProfileId** | **DeviceProfileId** | JSON object with Device Profile Id. If not provided, the type will be used to determine the profile. If neither deviceProfileId nor type is specified, the default device profile will be used. | [optional] |
| **firmwareId** | **OtaPackageId** | JSON object with Ota Package Id. | [optional] |
| **softwareId** | **OtaPackageId** | JSON object with Ota Package Id. | [optional] |
| **version** | **Long** |  | [optional] |
| **customerTitle** | **String** | Title of the Customer that owns the device. | [optional] [readonly] |
| **customerIsPublic** | **Boolean** | Indicates special 'Public' Customer that is auto-generated to use the devices on public dashboards. | [optional] [readonly] |
| **deviceProfileName** | **String** | Name of the corresponding Device Profile. | [optional] [readonly] |
| **active** | **Boolean** | Device active flag. | [optional] [readonly] |
| **additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional parameters of the device. May include: 'gateway' (boolean, whether the device is a gateway), 'description' (string), 'lastConnectedGateway' (string, UUID of the last gateway that connected this device). | [optional] |
| **deviceData** | **DeviceData** | JSON object with content specific to type of transport in the device profile. | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


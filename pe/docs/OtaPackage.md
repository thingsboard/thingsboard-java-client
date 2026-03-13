
# OtaPackage

`org.thingsboard.client.model.OtaPackage`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **OtaPackageId** | JSON object with the ota package Id. Specify existing ota package Id to update the ota package. Referencing non-existing ota package id will cause error. Omit this field to create new ota package. | [optional] |
| **createdTime** | **Long** | Timestamp of the ota package creation, in milliseconds | [optional] [readonly] |
| **additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | OTA Package description. | [optional] |
| **tenantId** | **TenantId** | JSON object with Tenant Id. Tenant Id of the ota package can't be changed. | [optional] [readonly] |
| **deviceProfileId** | **DeviceProfileId** | JSON object with Device Profile Id. Device Profile Id of the ota package can't be changed. | [optional] |
| **type** | **OtaPackageType** | OTA Package type. | [optional] |
| **title** | **String** | OTA Package title. | [optional] |
| **version** | **String** | OTA Package version. | [optional] |
| **tag** | **String** | OTA Package tag. | [optional] [readonly] |
| **url** | **String** | OTA Package url. | [optional] |
| **hasData** | **Boolean** | Indicates OTA Package 'has data'. Field is returned from DB ('true' if data exists or url is set).  If OTA Package 'has data' is 'false' we can not assign the OTA Package to the Device or Device Profile. | [optional] [readonly] |
| **fileName** | **String** | OTA Package file name. | [optional] [readonly] |
| **contentType** | **String** | OTA Package content type. | [optional] [readonly] |
| **checksumAlgorithm** | **ChecksumAlgorithm** | OTA Package checksum algorithm. | [optional] [readonly] |
| **checksum** | **String** | OTA Package checksum. | [optional] [readonly] |
| **dataSize** | **Long** | OTA Package data size. | [optional] [readonly] |
| **data** | **byte[]** |  | [optional] |
| **name** | **String** |  | [optional] [readonly] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


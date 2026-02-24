

# SaveOtaPackageInfoRequest

A JSON value representing the OTA Package.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**OtaPackageId**](OtaPackageId.md) | JSON object with the ota package Id. Specify existing ota package Id to update the ota package. Referencing non-existing ota package id will cause error. Omit this field to create new ota package. |  [optional] |
|**createdTime** | **Long** | Timestamp of the ota package creation, in milliseconds |  [optional] [readonly] |
|**tenantId** | [**TenantId**](TenantId.md) | JSON object with Tenant Id. Tenant Id of the ota package can&#39;t be changed. |  [optional] |
|**deviceProfileId** | [**DeviceProfileId**](DeviceProfileId.md) | JSON object with Device Profile Id. Device Profile Id of the ota package can&#39;t be changed. |  [optional] |
|**type** | **OtaPackageType** | OTA Package type. |  [optional] |
|**title** | **String** | OTA Package title. |  [optional] |
|**version** | **String** | OTA Package version. |  [optional] |
|**tag** | **String** | OTA Package tag. |  [optional] [readonly] |
|**url** | **String** | OTA Package url. |  [optional] |
|**hasData** | **Boolean** | Indicates OTA Package &#39;has data&#39;. Field is returned from DB (&#39;true&#39; if data exists or url is set).  If OTA Package &#39;has data&#39; is &#39;false&#39; we can not assign the OTA Package to the Device or Device Profile. |  [optional] [readonly] |
|**fileName** | **String** | OTA Package file name. |  [optional] |
|**contentType** | **String** | OTA Package content type. |  [optional] |
|**checksumAlgorithm** | **ChecksumAlgorithm** | OTA Package checksum algorithm. |  [optional] |
|**checksum** | **String** | OTA Package checksum. |  [optional] |
|**dataSize** | **Long** | OTA Package data size. |  [optional] [readonly] |
|**usesUrl** | **Boolean** | Indicates OTA Package uses url. Should be &#39;true&#39; if uses url or &#39;false&#39; if will be used data. |  [optional] [readonly] |
|**name** | **String** |  |  [optional] [readonly] |
|**additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | OTA Package description. |  [optional] |




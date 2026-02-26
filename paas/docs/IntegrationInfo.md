

# IntegrationInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**IntegrationId**](IntegrationId.md) | JSON object with the Integration Id. Specify this field to update the Integration. Referencing non-existing Integration Id will cause error. Omit this field to create new Integration. |  [optional] |
|**createdTime** | **Long** | Timestamp of the integration creation, in milliseconds |  [optional] [readonly] |
|**tenantId** | [**TenantId**](TenantId.md) | JSON object with Tenant Id |  [optional] [readonly] |
|**name** | **String** | Integration Name |  |
|**type** | **IntegrationType** | The type of the integration |  |
|**debugMode** | **Boolean** | Enable/disable debug.  |  [optional] |
|**debugSettings** | [**DebugSettings**](DebugSettings.md) | Debug settings object. |  [optional] |
|**enabled** | **Boolean** | Boolean flag to enable/disable the integration |  [optional] |
|**allowCreateDevicesOrAssets** | **Boolean** | Boolean flag to allow/disallow the integration to create devices or assets that send message and do not exist in the system yet |  [optional] |
|**version** | **Long** |  |  [optional] |
|**status** | **Object** |  |  [optional] |
|**stats** | **Object** |  |  [optional] |
|**remote** | **Boolean** | Boolean flag to enable/disable the integration to be executed remotely. Remote integration is launched in a separate microservice. Local integration is executed by the platform core |  [optional] |
|**edgeTemplate** | **Boolean** | Boolean flag that specifies that is regular or edge template integration |  [optional] |




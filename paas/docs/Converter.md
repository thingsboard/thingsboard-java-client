

# Converter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**ConverterId**](ConverterId.md) | JSON object with the Converter Id. Specify this field to update the Converter. Referencing non-existing Converter Id will cause error. Omit this field to create new Converter. |  [optional] |
|**createdTime** | **Long** | Timestamp of the converter creation, in milliseconds |  [optional] [readonly] |
|**tenantId** | [**TenantId**](TenantId.md) | JSON object with Tenant Id |  [optional] [readonly] |
|**name** | **String** | Unique Converter Name in scope of Tenant |  |
|**type** | **ConverterType** | The type of the converter to process incoming or outgoing messages |  |
|**integrationType** | **IntegrationType** | The type of the integration to which the converter is dedicated |  [optional] |
|**debugMode** | **Boolean** | Enable/disable debug.  |  [optional] |
|**debugSettings** | [**DebugSettings**](DebugSettings.md) | Debug settings object. |  [optional] |
|**_configuration** | **com.fasterxml.jackson.databind.JsonNode** | JSON object representing converter configuration. It should contain one of two possible fields: &#39;decoder&#39; or &#39;encoder&#39;. The former is used when the converter has UPLINK type, the latter is used - when DOWNLINK type. It can contain both &#39;decoder&#39; and &#39;encoder&#39; fields, when the correct one is specified for the appropriate converter type, another one can be set to &#39;null&#39; |  [optional] |
|**additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional parameters of the converter |  [optional] |
|**edgeTemplate** | **Boolean** | Boolean flag that specifies that is regular or edge template converter |  [optional] |
|**converterVersion** | **Integer** |  |  [optional] |
|**version** | **Long** |  |  [optional] |




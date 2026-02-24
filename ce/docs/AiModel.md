

# AiModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tenantId** | [**TenantId**](TenantId.md) | JSON object representing the ID of the tenant associated with this AI model |  [readonly] |
|**version** | **Long** | Version of the AI model record; increments automatically whenever the record is changed |  [readonly] |
|**name** | **String** | Display name for this AI model configuration; not the technical model identifier |  |
|**_configuration** | [**AiModelConfig**](AiModelConfig.md) | Configuration of the AI model |  [optional] |
|**id** | [**AiModelId**](AiModelId.md) |  |  [optional] |
|**createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch |  [optional] [readonly] |




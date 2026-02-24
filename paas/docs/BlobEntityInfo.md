

# BlobEntityInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**BlobEntityId**](BlobEntityId.md) | JSON object with the blob entity Id. Referencing non-existing blob entity Id will cause error |  [optional] |
|**createdTime** | **Long** | Timestamp of the blob entity creation, in milliseconds |  [optional] [readonly] |
|**tenantId** | [**TenantId**](TenantId.md) | JSON object with Tenant Id |  [optional] [readonly] |
|**customerId** | [**CustomerId**](CustomerId.md) | JSON object with Customer Id |  [optional] [readonly] |
|**name** | **String** | blob entity name |  [optional] [readonly] |
|**type** | **String** | blob entity type |  [optional] [readonly] |
|**contentType** | [**ContentTypeEnum**](#ContentTypeEnum) | blob content type |  [optional] [readonly] |
|**ownerId** | [**EntityId**](EntityId.md) | JSON object with Customer or Tenant Id |  [optional] [readonly] |
|**additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional parameters of the blob entity |  [optional] |



## Enum: ContentTypeEnum

| Name | Value |
|---- | -----|
| APPLICATION_PDF | &quot;application/pdf&quot; |
| IMAGE_JPEG | &quot;image/jpeg&quot; |
| IMAGE_PNG | &quot;image/png&quot; |




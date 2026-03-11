
# BlobEntityWithCustomerInfo

`org.thingsboard.client.model.BlobEntityWithCustomerInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **BlobEntityId** | JSON object with the blob entity Id. Referencing non-existing blob entity Id will cause error | [optional] |
| **createdTime** | **Long** | Timestamp of the blob entity creation, in milliseconds | [optional] [readonly] |
| **tenantId** | **TenantId** | JSON object with Tenant Id | [optional] [readonly] |
| **customerId** | **CustomerId** | JSON object with Customer Id | [optional] [readonly] |
| **name** | **String** | blob entity name | [optional] [readonly] |
| **type** | **String** | blob entity type | [optional] [readonly] |
| **contentType** | **ContentTypeEnum** | blob content type | [optional] [readonly] |
| **customerTitle** | **String** | Title of the customer | [optional] |
| **customerIsPublic** | **Boolean** | Parameter that specifies if customer is public | [optional] [readonly] |
| **ownerId** | **EntityId** | JSON object with Customer or Tenant Id | [optional] |
| **additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional parameters of the blob entity | [optional] |


### Enum: ContentTypeEnum

| Name | Value |
|---- | -----|
| APPLICATION_PDF | "application/pdf" |
| IMAGE_JPEG | "image/jpeg" |
| IMAGE_PNG | "image/png" |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


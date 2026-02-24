

# UserInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**UserId**](UserId.md) | JSON object with the User Id. Specify this field to update the device. Referencing non-existing User Id will cause error. Omit this field to create new customer. |  [optional] |
|**createdTime** | **Long** | Timestamp of the user creation, in milliseconds |  [optional] [readonly] |
|**tenantId** | [**TenantId**](TenantId.md) | JSON object with the Tenant Id. |  [optional] |
|**customerId** | [**CustomerId**](CustomerId.md) | JSON object with the Customer Id. |  [optional] |
|**email** | **String** | Email of the user |  |
|**authority** | **Authority** | Authority |  |
|**firstName** | **String** | First name of the user |  [optional] |
|**lastName** | **String** | Last name of the user |  [optional] |
|**phone** | **String** | Phone number of the user |  [optional] |
|**customMenuId** | [**CustomMenuId**](CustomMenuId.md) |  |  [optional] |
|**version** | **Long** |  |  [optional] |
|**ownerName** | **String** | Owner name |  [optional] [readonly] |
|**groups** | [**List&lt;EntityInfo&gt;**](EntityInfo.md) | Groups |  [optional] |
|**name** | **String** | Duplicates the email of the user, readonly |  [optional] [readonly] |
|**ownerId** | [**EntityId**](EntityId.md) | JSON object with Customer or Tenant Id |  [optional] [readonly] |
|**additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional parameters of the user |  [optional] |




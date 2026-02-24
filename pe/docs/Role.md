

# Role

A JSON value representing the role.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tenantId** | [**TenantId**](TenantId.md) | JSON object with Tenant Id. |  [readonly] |
|**customerId** | [**CustomerId**](CustomerId.md) | JSON object with Customer Id.  |  [optional] [readonly] |
|**name** | **String** | Role Name |  |
|**type** | **RoleType** | Type of the role: generic or group |  |
|**permissions** | **com.fasterxml.jackson.databind.JsonNode** |  |  [optional] |
|**version** | **Long** |  |  [optional] |
|**id** | [**RoleId**](RoleId.md) | JSON object with the Role Id. Specify this field to update the Role. Referencing non-existing Role Id will cause error. Omit this field to create new Role. |  [optional] |
|**createdTime** | **Long** | Timestamp of the role creation, in milliseconds |  [optional] [readonly] |
|**ownerId** | [**EntityId**](EntityId.md) | JSON object with Customer or Tenant Id |  [optional] [readonly] |
|**additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional parameters of the role |  [optional] |




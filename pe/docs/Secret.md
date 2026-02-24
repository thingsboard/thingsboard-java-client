

# Secret

A JSON value representing the Secret.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**SecretId**](SecretId.md) | JSON object with the Secret Id. Specify this field to update the Secret. Referencing non-existing Secret Id will cause error. Omit this field to create new Secret. |  [optional] |
|**createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch |  [optional] [readonly] |
|**tenantId** | [**TenantId**](TenantId.md) | JSON object with Tenant Id. Tenant Id of the secret cannot be changed. |  [optional] [readonly] |
|**name** | **String** | Secret name |  |
|**type** | **SecretType** | Secret type. |  |
|**description** | **String** | Secret description. |  [optional] |
|**value** | **String** |  |  [optional] |
|**encryptedValue** | **String** |  |  [optional] |




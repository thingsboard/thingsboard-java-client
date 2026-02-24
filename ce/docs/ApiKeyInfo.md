

# ApiKeyInfo

A JSON value representing the Api Key token.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**ApiKeyId**](ApiKeyId.md) | JSON object with the API Key Id. Specify this field to update the API Key. Referencing non-existing API Key Id will cause error. Omit this field to create new API Key. |  [optional] |
|**createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch |  [optional] [readonly] |
|**tenantId** | [**TenantId**](TenantId.md) | JSON object with Tenant Id. Tenant Id of the API key cannot be changed. |  [optional] [readonly] |
|**userId** | [**UserId**](UserId.md) | JSON object with User Id. User Id of the API key cannot be changed. |  [optional] |
|**expirationTime** | **Long** | Expiration time of the API key. |  [optional] |
|**description** | **String** | API Key description. |  |
|**enabled** | **Boolean** | Enabled/disabled API key. |  [optional] |
|**expired** | **Boolean** | Indicates if the API key is expired based on current time. Returns false if expirationTime is 0 (no expiry). |  [optional] [readonly] |




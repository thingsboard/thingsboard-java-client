

# Rpc


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**RpcId**](RpcId.md) | JSON object with the rpc Id. Referencing non-existing rpc Id will cause error. |  [optional] |
|**createdTime** | **Long** | Timestamp of the rpc creation, in milliseconds |  [optional] [readonly] |
|**tenantId** | [**TenantId**](TenantId.md) | JSON object with Tenant Id. |  [optional] [readonly] |
|**deviceId** | [**DeviceId**](DeviceId.md) | JSON object with Device Id. |  [optional] [readonly] |
|**expirationTime** | **Long** | Expiration time of the request. |  [optional] [readonly] |
|**request** | **com.fasterxml.jackson.databind.JsonNode** | The request body that will be used to send message to device. |  [optional] [readonly] |
|**response** | **com.fasterxml.jackson.databind.JsonNode** | The response from the device. |  [optional] [readonly] |
|**status** | **RpcStatus** | The current status of the RPC call. |  [optional] [readonly] |
|**additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional info used in the rule engine to process the updates to the RPC state. |  [optional] [readonly] |




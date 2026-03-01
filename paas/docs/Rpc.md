
# Rpc

`org.thingsboard.client.model.Rpc`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **RpcId** | JSON object with the rpc Id. Referencing non-existing rpc Id will cause error. | [optional] |
| **createdTime** | **Long** | Timestamp of the rpc creation, in milliseconds | [optional] [readonly] |
| **tenantId** | **TenantId** | JSON object with Tenant Id. | [optional] [readonly] |
| **deviceId** | **DeviceId** | JSON object with Device Id. | [optional] [readonly] |
| **expirationTime** | **Long** | Expiration time of the request. | [optional] [readonly] |
| **request** | **com.fasterxml.jackson.databind.JsonNode** | The request body that will be used to send message to device. | [optional] [readonly] |
| **response** | **com.fasterxml.jackson.databind.JsonNode** | The response from the device. | [optional] [readonly] |
| **status** | **RpcStatus** | The current status of the RPC call. | [optional] [readonly] |
| **additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional info used in the rule engine to process the updates to the RPC state. | [optional] [readonly] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


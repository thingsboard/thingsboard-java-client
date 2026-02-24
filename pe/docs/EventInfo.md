

# EventInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**EventId**](EventId.md) |  |  [optional] |
|**createdTime** | **Long** | Timestamp of the event creation, in milliseconds |  [optional] [readonly] |
|**tenantId** | [**TenantId**](TenantId.md) | JSON object with Tenant Id. |  [optional] [readonly] |
|**type** | **String** | Event type |  [optional] |
|**uid** | **String** | string |  [optional] |
|**entityId** | [**EntityId**](EntityId.md) | JSON object with Entity Id for which event is created. |  [optional] [readonly] |
|**body** | **com.fasterxml.jackson.databind.JsonNode** |  |  [optional] |




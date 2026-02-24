

# Queue

A JSON value representing the queue.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**QueueId**](QueueId.md) |  |  [optional] |
|**createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch |  [optional] [readonly] |
|**tenantId** | [**TenantId**](TenantId.md) |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**topic** | **String** |  |  [optional] |
|**pollInterval** | **Integer** |  |  [optional] |
|**partitions** | **Integer** |  |  [optional] |
|**consumerPerPartition** | **Boolean** |  |  [optional] |
|**packProcessingTimeout** | **Long** |  |  [optional] |
|**submitStrategy** | [**SubmitStrategy**](SubmitStrategy.md) |  |  [optional] |
|**processingStrategy** | [**ProcessingStrategy**](ProcessingStrategy.md) |  |  [optional] |
|**additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** |  |  [optional] |




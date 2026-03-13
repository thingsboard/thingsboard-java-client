
# Queue

`org.thingsboard.client.model.Queue`

A JSON value representing the queue.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **QueueId** |  | [optional] |
| **createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| **additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** |  | [optional] |
| **tenantId** | **TenantId** |  | [optional] |
| **name** | **String** |  | [optional] |
| **topic** | **String** |  | [optional] |
| **pollInterval** | **Integer** |  | [optional] |
| **partitions** | **Integer** |  | [optional] |
| **consumerPerPartition** | **Boolean** |  | [optional] |
| **packProcessingTimeout** | **Long** |  | [optional] |
| **submitStrategy** | **SubmitStrategy** |  | [optional] |
| **processingStrategy** | **ProcessingStrategy** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


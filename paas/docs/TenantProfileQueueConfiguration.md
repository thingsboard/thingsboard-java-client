
# TenantProfileQueueConfiguration

`org.thingsboard.client.model.TenantProfileQueueConfiguration`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **name** | **String** |  | [optional] |
| **topic** | **String** |  | [optional] |
| **pollInterval** | **Integer** |  | [optional] |
| **partitions** | **Integer** |  | [optional] |
| **consumerPerPartition** | **Boolean** |  | [optional] |
| **packProcessingTimeout** | **Long** |  | [optional] |
| **submitStrategy** | **SubmitStrategy** |  | [optional] |
| **processingStrategy** | **ProcessingStrategy** |  | [optional] |
| **additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


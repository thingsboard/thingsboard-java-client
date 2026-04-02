
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



## Referenced Types

#### SubmitStrategy
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | SubmitStrategyType |  | [optional] |
| batchSize | Integer |  | [optional] |

#### ProcessingStrategy
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | ProcessingStrategyType |  | [optional] |
| retries | Integer |  | [optional] |
| failurePercentage | Double |  | [optional] |
| pauseBetweenRetries | Long |  | [optional] |
| maxPauseBetweenRetries | Long |  | [optional] |

#### SubmitStrategyType (enum)
`BURST` | `BATCH` | `SEQUENTIAL_BY_ORIGINATOR` | `SEQUENTIAL_BY_TENANT` | `SEQUENTIAL`

#### ProcessingStrategyType (enum)
`SKIP_ALL_FAILURES` | `SKIP_ALL_FAILURES_AND_TIMED_OUT` | `RETRY_ALL` | `RETRY_FAILED` | `RETRY_TIMED_OUT` | `RETRY_FAILED_AND_TIMED_OUT`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


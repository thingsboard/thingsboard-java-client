
# ProcessingStrategy

`org.thingsboard.client.model.ProcessingStrategy`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **type** | **ProcessingStrategyType** |  | [optional] |
| **retries** | **Integer** |  | [optional] |
| **failurePercentage** | **Double** |  | [optional] |
| **pauseBetweenRetries** | **Long** |  | [optional] |
| **maxPauseBetweenRetries** | **Long** |  | [optional] |



## Referenced Types

#### ProcessingStrategyType (enum)
`SKIP_ALL_FAILURES` | `SKIP_ALL_FAILURES_AND_TIMED_OUT` | `RETRY_ALL` | `RETRY_FAILED` | `RETRY_TIMED_OUT` | `RETRY_FAILED_AND_TIMED_OUT`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions



# DummyJobConfiguration

`org.thingsboard.client.model.DummyJobConfiguration`

Dummy job configuration

**Extends:** **JobConfiguration**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **taskProcessingTimeMs** | **Long** |  | [optional] |
| **successfulTasksCount** | **Integer** |  | [optional] |
| **failedTasksCount** | **Integer** |  | [optional] |
| **permanentlyFailedTasksCount** | **Integer** |  | [optional] |
| **errors** | **List\<String\>** |  | [optional] |
| **retries** | **Integer** |  | [optional] |
| **taskProcessingTimeoutMs** | **Long** |  | [optional] |
| **generalError** | **String** |  | [optional] |
| **submittedTasksBeforeGeneralError** | **Integer** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


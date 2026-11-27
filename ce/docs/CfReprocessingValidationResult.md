
# CfReprocessingValidationResult

`org.thingsboard.client.model.CfReprocessingValidationResult`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **isValid** | **Boolean** |  | [optional] |
| **message** | **String** |  | [optional] |
| **lastJobStatus** | **JobStatus** |  | [optional] |



## Referenced Types

#### JobStatus (enum)
`QUEUED` | `PENDING` | `RUNNING` | `COMPLETED` | `FAILED` | `CANCELLED`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


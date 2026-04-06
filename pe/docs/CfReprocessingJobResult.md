
# CfReprocessingJobResult

`org.thingsboard.client.model.CfReprocessingJobResult`

**Extends:** **JobResult**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|



## Referenced Types

#### JobResult
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| successfulCount | Integer | Count of successfully completed tasks | [optional] |
| failedCount | Integer | Count of failed tasks | [optional] |
| discardedCount | Integer | Count of discarded tasks | [optional] |
| totalCount | Integer | Total number of tasks, set when all tasks are submitted | [optional] |
| results | List<TaskResult> |  | [optional] |
| generalError | String | General error message if the job failed | [optional] |
| startTs | Long | Timestamp of the job start, in milliseconds | [optional] |
| finishTs | Long | Timestamp of the job finish, in milliseconds | [optional] |
| cancellationTs | Long | Timestamp of the job cancellation, in milliseconds | [optional] |
| jobType | String |  |  |

#### TaskResult
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| key | String |  | [optional] |
| success | Boolean |  | [optional] |
| discarded | Boolean |  | [optional] |
| finishTs | Long |  | [optional] |
| jobType | String |  |  |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions



# RunJobStepState

`org.thingsboard.client.model.RunJobStepState`

**Extends:** **AgentAppStepState**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **image** | **StepFieldString** |  | [optional] |
| **entrypoint** | **StepFieldListString** |  | [optional] |
| **cmd** | **StepFieldListString** |  | [optional] |
| **env** | **StepFieldListString** |  | [optional] |
| **binds** | **StepFieldListString** |  | [optional] |
| **networks** | **StepFieldListString** |  | [optional] |
| **pullImages** | **StepFieldBoolean** |  | [optional] |
| **retries** | **StepFieldInteger** |  | [optional] |
| **networkFromServiceImageRegexPattern** | **StepFieldString** |  | [optional] |



## Referenced Types

#### AgentAppStepState
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | AgentAppStepType |  | [optional] |

#### StepFieldString
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| value | String |  | [optional] |
| userChoice | Boolean |  | [optional] |

#### StepFieldListString
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| userChoice | Boolean |  | [optional] |
| value | List<String> |  | [optional] |

#### StepFieldBoolean
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| value | Boolean |  | [optional] |
| userChoice | Boolean |  | [optional] |

#### StepFieldInteger
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| value | Integer |  | [optional] |
| userChoice | Boolean |  | [optional] |

#### AgentAppStepType (enum)
`COMPOSE_TEMPLATE` | `COMPOSE` | `COMPOSE_START` | `COMPOSE_DOWN` | `ROLLBACK` | `BACKUP_VOLUME` | `BACKUP_VOLUME_REMOVE` | `COMPOSE_RESTART` | `RUN_JOB` | `AGENT_PREPARE` | … (11 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


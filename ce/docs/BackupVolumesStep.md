
# BackupVolumesStep

`org.thingsboard.client.model.BackupVolumesStep`

**Extends:** **AgentAppStep**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **state** | **BackupVolumesStepState** |  | [optional] |



## Referenced Types

#### AgentAppStep
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | UUID |  | [optional] |
| nextId | UUID |  | [optional] |
| title | String |  | [optional] |
| templateOnly | Boolean |  | [optional] |
| condition | String |  | [optional] |
| stateful | Boolean |  | [optional] |
| type | AgentAppStepType |  | [optional] |

#### BackupVolumesStepState  *(extends AgentAppStepState)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| backupVolumes | StepFieldListString |  | [optional] |

#### AgentAppStepType (enum)
`COMPOSE_TEMPLATE` | `COMPOSE` | `COMPOSE_START` | `COMPOSE_DOWN` | `ROLLBACK` | `BACKUP_VOLUME` | `BACKUP_VOLUME_REMOVE` | `COMPOSE_RESTART` | `RUN_JOB` | `AGENT_PREPARE` | … (11 values total)

#### AgentAppStepState
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | AgentAppStepType |  | [optional] |

#### StepFieldListString
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| userChoice | Boolean |  | [optional] |
| value | List<String> |  | [optional] |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


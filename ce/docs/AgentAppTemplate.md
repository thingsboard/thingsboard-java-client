
# AgentAppTemplate

`org.thingsboard.client.model.AgentAppTemplate`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **tenantId** | **TenantId** | JSON object with Tenant Id. | [optional] [readonly] |
| **appType** | **AgentApplicationType** | Application type | |
| **configType** | **AgentAppConfigType** | Config type (e.g. 'DOCKER_COMPOSE'); the compose body lives in the template's compose-template step, not here | [optional] |
| **currentVersion** | **String** | Current template version | |
| **nextVersion** | **String** | Next template version | [optional] |
| **startSteps** | **List\<AgentAppTemplateStartStepsInner\>** | Start steps | [optional] |
| **upgradeSteps** | **List\<AgentAppTemplateStartStepsInner\>** | Upgrade steps | [optional] |
| **deleteSteps** | **List\<AgentAppTemplateStartStepsInner\>** | Delete steps | [optional] |
| **rollbackSteps** | **List\<AgentAppTemplateStartStepsInner\>** | Rollback steps | [optional] |
| **restartSteps** | **List\<AgentAppTemplateStartStepsInner\>** | Restart steps | [optional] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AgentAppEventId`, `AgentAppProfileId`, `AgentAppUnitId`, `AgentApplicationId`, `AgentBulkActionId`, `AgentId`, `AgentProfileId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### AgentApplicationType (enum)
`GENERIC` | `EDGE` | `GATEWAY`

#### AgentAppConfigType (enum)
`DOCKER_COMPOSE`

#### AgentAppTemplateStartStepsInner
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | UUID |  | [optional] |
| nextId | UUID |  | [optional] |
| title | String |  | [optional] |
| templateOnly | Boolean |  | [optional] |
| condition | String |  | [optional] |
| stateful | Boolean |  | [optional] |
| type | AgentAppStepType |  | [optional] |
| state | RunJobStepState |  | [optional] |
| composeTemplates | Map<String, com.fasterxml.jackson.databind.JsonNode> |  | [optional] |

#### AgentAppStepType (enum)
`COMPOSE_TEMPLATE` | `COMPOSE` | `COMPOSE_START` | `COMPOSE_DOWN` | `ROLLBACK` | `BACKUP_VOLUME` | `BACKUP_VOLUME_REMOVE` | `COMPOSE_RESTART` | `RUN_JOB` | `AGENT_PREPARE` | … (11 values total)

#### RunJobStepState  *(extends AgentAppStepState)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| image | StepFieldString |  | [optional] |
| entrypoint | StepFieldListString |  | [optional] |
| cmd | StepFieldListString |  | [optional] |
| env | StepFieldListString |  | [optional] |
| binds | StepFieldListString |  | [optional] |
| networks | StepFieldListString |  | [optional] |
| pullImages | StepFieldBoolean |  | [optional] |
| retries | StepFieldInteger |  | [optional] |
| networkFromServiceImageRegexPattern | StepFieldString |  | [optional] |

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (53 values total)

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

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


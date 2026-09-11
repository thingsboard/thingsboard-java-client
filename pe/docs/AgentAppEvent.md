
# AgentAppEvent

`org.thingsboard.client.model.AgentAppEvent`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **AgentAppEventId** | JSON object with the Agent App Event Id. | [optional] |
| **createdTime** | **Long** | Timestamp of the event creation, in milliseconds | [optional] [readonly] |
| **tenantId** | **TenantId** |  | [optional] |
| **applicationId** | **AgentApplicationId** |  | [optional] |
| **agentId** | **AgentId** |  | [optional] |
| **applicationName** | **String** |  | [optional] |
| **actionType** | **AgentAppEventActionType** |  | [optional] |
| **startStatus** | **ProcessingStartStatus** |  | [optional] |
| **processingStatus** | **AgentProcessingStatus** |  | [optional] |
| **currentStepId** | **UUID** |  | [optional] |
| **currentActivity** | **String** |  | [optional] |
| **errorMessage** | **String** |  | [optional] |
| **updatedTime** | **Long** |  | [optional] |
| **stepStates** | **Map\<String, AgentAppEventStepStatesValue\>** |  | [optional] |
| **bulkActionId** | **UUID** |  | [optional] |
| **resolvedArguments** | **Map\<String, String\>** |  | [optional] |
| **winnerContainerId** | **String** |  | [optional] |
| **finalizeDeadlineTs** | **Long** |  | [optional] |
| **contextMetadata** | **Map\<String, String\>** |  | [optional] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AgentAppEventId`, `AgentAppProfileId`, `AgentAppUnitId`, `AgentApplicationId`, `AgentBulkActionId`, `AgentId`, `AgentProfileId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### AgentAppEventActionType (enum)
`INSTALL` | `UPDATE` | `DELETE` | `RESTART` | `ROLLBACK` | `UPGRADE` | `AGENT_UPGRADE`

#### ProcessingStartStatus (enum)
`DELIVERY_FAIL` | `PENDING` | `DELIVERED`

#### AgentProcessingStatus (enum)
`PENDING` | `QUEUED` | `PROCESSING` | `FINISHED` | `ERROR` | `START_FAILED`

#### AgentAppEventStepStatesValue
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | AgentAppStepType |  | [optional] |
| backupVolumes | StepFieldListString |  | [optional] |
| serviceImageRegexPatterns | StepFieldListString |  | [optional] |
| removeVolumes | StepFieldBoolean |  | [optional] |
| pullImages | StepFieldBoolean |  | [optional] |
| failedEventId | StepFieldAgentAppEventId |  | [optional] |
| image | StepFieldString |  | [optional] |
| entrypoint | StepFieldListString |  | [optional] |
| cmd | StepFieldListString |  | [optional] |
| env | StepFieldListString |  | [optional] |
| binds | StepFieldListString |  | [optional] |
| networks | StepFieldListString |  | [optional] |
| retries | StepFieldInteger |  | [optional] |
| networkFromServiceImageRegexPattern | StepFieldString |  | [optional] |

#### AgentAppStepType (enum)
`COMPOSE_TEMPLATE` | `COMPOSE` | `COMPOSE_START` | `COMPOSE_DOWN` | `ROLLBACK` | `BACKUP_VOLUME` | `BACKUP_VOLUME_REMOVE` | `COMPOSE_RESTART` | `RUN_JOB` | `AGENT_PREPARE` | … (11 values total)

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

#### StepFieldAgentAppEventId
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| value | AgentAppEventId |  | [optional] |
| userChoice | Boolean |  | [optional] |

#### StepFieldString
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| value | String |  | [optional] |
| userChoice | Boolean |  | [optional] |

#### StepFieldInteger
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| value | Integer |  | [optional] |
| userChoice | Boolean |  | [optional] |

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (53 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


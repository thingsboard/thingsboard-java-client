
# PageDataJob

`org.thingsboard.client.model.PageDataJob`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **data** | **List\<Job\>** | Array of the entities | [optional] |
| **totalPages** | **Integer** | Total number of available pages. Calculated based on the 'pageSize' request parameter and total number of entities that match search criteria | [optional] [readonly] |
| **totalElements** | **Long** | Total number of elements in all available pages | [optional] [readonly] |
| **hasNext** | **Boolean** | 'false' value indicates the end of the result set | [optional] [readonly] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `CalculatedFieldId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityViewId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### Job
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | JobId |  | [optional] |
| createdTime | Long | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| tenantId | TenantId |  |  |
| type | JobType |  |  |
| key | String |  |  |
| entityId | EntityId |  |  |
| entityName | String |  | [optional] |
| status | JobStatus |  |  |
| _configuration | JobConfiguration |  |  |
| result | JobResult |  |  |

#### JobType (enum)
`DUMMY`

#### JobStatus (enum)
`QUEUED` | `PENDING` | `RUNNING` | `COMPLETED` | `FAILED` | `CANCELLED`

#### JobConfiguration
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| tasksKey | String |  |  |
| toReprocess | List<TaskResult> |  | [optional] |
| type | String |  |  |

#### DummyJobConfiguration  *(extends JobConfiguration, type=`DUMMY`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| taskProcessingTimeMs | Long |  | [optional] |
| successfulTasksCount | Integer |  | [optional] |
| failedTasksCount | Integer |  | [optional] |
| permanentlyFailedTasksCount | Integer |  | [optional] |
| errors | List<String> |  | [optional] |
| retries | Integer |  | [optional] |
| taskProcessingTimeoutMs | Long |  | [optional] |
| generalError | String |  | [optional] |
| submittedTasksBeforeGeneralError | Integer |  | [optional] |

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

#### DummyJobResult  *(extends JobResult, jobType=`DUMMY`)*
*See JobResult for properties.*

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `RULE_CHAIN` | `RULE_NODE` | `ENTITY_VIEW` | … (36 values total)

#### TaskResult
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| key | String |  | [optional] |
| success | Boolean |  | [optional] |
| discarded | Boolean |  | [optional] |
| finishTs | Long |  | [optional] |
| error | String |  | [optional] |
| jobType | String |  |  |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions



# DummyJobResult

`org.thingsboard.client.model.DummyJobResult`

**Extends:** **JobResult**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

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

#### CfReprocessingJobResult  *(extends JobResult, jobType=`CF_REPROCESSING`)*
*See JobResult for properties.*

#### ReportJobResult  *(extends JobResult, jobType=`REPORT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| report | Report |  | [optional] |

#### TaskResult
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| key | String |  | [optional] |
| success | Boolean |  | [optional] |
| discarded | Boolean |  | [optional] |
| finishTs | Long |  | [optional] |
| jobType | String |  |  |

#### Report
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | ReportId |  | [optional] |
| createdTime | Long | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| tenantId | TenantId |  |  |
| customerId | CustomerId |  | [optional] |
| templateId | ReportTemplateId |  |  |
| format | TbReportFormat |  |  |
| name | String |  |  |
| userId | UserId |  |  |
| ownerId | EntityId | JSON object with Customer or Tenant Id | [optional] [readonly] |

#### TbReportFormat (enum)
`PDF` | `CSV`

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (46 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


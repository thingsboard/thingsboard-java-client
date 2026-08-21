
# CfReprocessingJobConfiguration

`org.thingsboard.client.model.CfReprocessingJobConfiguration`

**Extends:** **JobConfiguration**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **calculatedFieldId** | **CalculatedFieldId** |  | |
| **calculatedFieldName** | **String** |  | [optional] |
| **startTs** | **Long** |  | [optional] |
| **endTs** | **Long** |  | [optional] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### JobConfiguration
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| tasksKey | String |  |  |
| toReprocess | List<TaskResult> |  | [optional] |
| type | String |  |  |

#### TaskResult
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| key | String |  | [optional] |
| success | Boolean |  | [optional] |
| discarded | Boolean |  | [optional] |
| finishTs | Long |  | [optional] |
| error | String |  | [optional] |
| jobType | String |  |  |

#### CfReprocessingTaskResult  *(extends TaskResult, jobType=`CF_REPROCESSING`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| failure | CfReprocessingTaskFailure |  | [optional] |

#### DummyTaskResult  *(extends TaskResult, jobType=`DUMMY`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| failure | DummyTaskFailure |  | [optional] |

#### ReportTaskResult  *(extends TaskResult, jobType=`REPORT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| report | Report |  | [optional] |

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (46 values total)

#### CfReprocessingTaskFailure
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| error | String |  | [optional] |
| entityInfo | EntityInfo |  | [optional] |

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
| publicKey | String |  | [optional] |
| ownerId | EntityId | JSON object with Customer or Tenant Id | [optional] [readonly] |
| _public | Boolean |  | [optional] |

#### DummyTaskFailure
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| error | String |  | [optional] |
| number | Integer |  | [optional] |
| failAlways | Boolean |  | [optional] |

#### EntityInfo
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | EntityId | JSON object with the entity Id. | [optional] |
| name | String | Entity Name | [optional] |

#### TbReportFormat (enum)
`PDF` | `CSV`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


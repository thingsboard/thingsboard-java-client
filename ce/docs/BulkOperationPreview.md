
# BulkOperationPreview

`org.thingsboard.client.model.BulkOperationPreview`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **total** | **Integer** | Total number of apps targeted by the bulk operation | [optional] |
| **eligible** | **Integer** | Number of apps that would be submitted (total minus skipped) | [optional] |
| **skippedCountsByReason** | **Map\<String, Integer\>** | Skip count per reason for the targeted apps | [optional] |
| **skippedSample** | **List\<SkippedApp\>** | Sample of skipped apps, capped per reason. Use the run history to inspect the full list. | [optional] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AgentAppEventId`, `AgentAppProfileId`, `AgentAppUnitId`, `AgentApplicationId`, `AgentBulkActionId`, `AgentId`, `AgentProfileId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### SkippedApp
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| agentId | AgentId | Agent Id owning the application | [optional] |
| agentName | String | Agent name | [optional] |
| applicationId | AgentApplicationId | Application Id | [optional] |
| applicationName | String | Application name | [optional] |
| reason | SkipReason | Reason for skipping | [optional] |
| msg | String | Optional message in case of a failure | [optional] |

#### SkipReason (enum)
`VERSION_MISMATCH` | `ACTIVE_EVENT` | `RATE_LIMIT_EXCEEDED` | `ERROR`

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (53 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


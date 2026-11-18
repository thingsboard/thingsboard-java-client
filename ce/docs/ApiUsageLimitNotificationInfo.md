
# ApiUsageLimitNotificationInfo

`org.thingsboard.client.model.ApiUsageLimitNotificationInfo`

**Extends:** **NotificationInfo**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **feature** | **ApiFeature** |  | [optional] |
| **recordKey** | **ApiUsageRecordKey** |  | [optional] |
| **status** | **ApiUsageStateValue** |  | [optional] |
| **limit** | **String** |  | [optional] |
| **currentValue** | **String** |  | [optional] |
| **tenantId** | **TenantId** |  | [optional] |
| **tenantName** | **String** |  | [optional] |
| **affectedCustomerId** | **CustomerId** |  | [optional] |
| **affectedTenantId** | **TenantId** |  | [optional] |
| **affectedUserId** | **UserId** |  | [optional] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AgentAppEventId`, `AgentAppProfileId`, `AgentAppUnitId`, `AgentApplicationId`, `AgentBulkActionId`, `AgentId`, `AgentProfileId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### NotificationInfo
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| dashboardId | DashboardId |  | [optional] |
| stateEntityId | EntityId |  | [optional] |
| type | String |  |  |

#### ApiFeature (enum)
`TRANSPORT` | `DB` | `RE` | `JS` | `TBEL` | `EMAIL` | `SMS` | `ALARM` | `REPORT` | `AI`

#### ApiUsageRecordKey (enum)
`TRANSPORT_MSG_COUNT` | `TRANSPORT_DP_COUNT` | `STORAGE_DP_COUNT` | `RE_EXEC_COUNT` | `JS_EXEC_COUNT` | `TBEL_EXEC_COUNT` | `EMAIL_EXEC_COUNT` | `SMS_EXEC_COUNT` | `CREATED_ALARMS_COUNT` | `ACTIVE_DEVICES` | … (13 values total)

#### ApiUsageStateValue (enum)
`ENABLED` | `WARNING` | `DISABLED`

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (53 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


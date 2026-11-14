
# TaskProcessingFailureNotificationInfo

`org.thingsboard.client.model.TaskProcessingFailureNotificationInfo`

**Extends:** **NotificationInfo**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **tenantId** | **TenantId** |  | [optional] |
| **entityId** | **EntityId** |  | [optional] |
| **taskType** | **HousekeeperTaskType** |  | [optional] |
| **taskDescription** | **String** |  | [optional] |
| **error** | **String** |  | [optional] |
| **attempt** | **Integer** |  | [optional] |
| **affectedCustomerId** | **CustomerId** |  | [optional] |
| **affectedTenantId** | **TenantId** |  | [optional] |
| **affectedUserId** | **UserId** |  | [optional] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AgentAppEventId`, `AgentAppProfileId`, `AgentAppUnitId`, `AgentApplicationId`, `AgentBulkActionId`, `AgentId`, `AgentProfileId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BillingCustomerId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CouponId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `ProductId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `SubscriptionAddonId`, `SubscriptionId`, `SubscriptionPlanId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### NotificationInfo
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| dashboardId | DashboardId |  | [optional] |
| stateEntityId | EntityId |  | [optional] |
| type | String |  |  |

#### HousekeeperTaskType (enum)
`DELETE_ATTRIBUTES` | `DELETE_TELEMETRY` | `DELETE_LATEST_TS` | `DELETE_TS_HISTORY` | `DELETE_EVENTS` | `DELETE_ALARMS` | `DELETE_ALARM_COMMENTS` | `UNASSIGN_ALARMS` | `DELETE_TENANT_ENTITIES` | `DELETE_ENTITIES` | … (15 values total)

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (59 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


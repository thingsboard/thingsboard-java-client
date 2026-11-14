
# AlarmCommentNotificationInfo

`org.thingsboard.client.model.AlarmCommentNotificationInfo`

**Extends:** **NotificationInfo**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **comment** | **String** |  | [optional] |
| **action** | **String** |  | [optional] |
| **userEmail** | **String** |  | [optional] |
| **userFirstName** | **String** |  | [optional] |
| **userLastName** | **String** |  | [optional] |
| **alarmType** | **String** |  | [optional] |
| **alarmId** | **UUID** |  | [optional] |
| **alarmOriginator** | **EntityId** |  | [optional] |
| **alarmOriginatorName** | **String** |  | [optional] |
| **alarmOriginatorLabel** | **String** |  | [optional] |
| **alarmSeverity** | **AlarmSeverity** |  | [optional] |
| **alarmStatus** | **AlarmStatus** |  | [optional] |
| **alarmCustomerId** | **CustomerId** |  | [optional] |
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

#### AlarmSeverity (enum)
`CRITICAL` | `MAJOR` | `MINOR` | `WARNING` | `INDETERMINATE`

#### AlarmStatus (enum)
`ACTIVE_UNACK` | `ACTIVE_ACK` | `CLEARED_UNACK` | `CLEARED_ACK`

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (59 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


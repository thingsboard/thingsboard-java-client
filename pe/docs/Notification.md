
# Notification

`org.thingsboard.client.model.Notification`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **NotificationId** |  | [optional] |
| **createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| **requestId** | **NotificationRequestId** |  | [optional] |
| **recipientId** | **UserId** |  | [optional] |
| **type** | **NotificationType** |  | [optional] |
| **deliveryMethod** | **NotificationDeliveryMethod** |  | [optional] |
| **subject** | **String** |  | [optional] |
| **text** | **String** |  | [optional] |
| **additionalConfig** | **com.fasterxml.jackson.databind.JsonNode** |  | [optional] |
| **info** | **NotificationInfo** |  | [optional] |
| **status** | **NotificationStatus** |  | [optional] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### NotificationType (enum)
`GENERAL` | `ALARM` | `DEVICE_ACTIVITY` | `ENTITY_ACTION` | `ALARM_COMMENT` | `RULE_ENGINE_COMPONENT_LIFECYCLE_EVENT` | `ALARM_ASSIGNMENT` | `NEW_PLATFORM_VERSION` | `ENTITIES_LIMIT` | `ENTITIES_LIMIT_INCREASE_REQUEST` | … (22 values total)

#### NotificationDeliveryMethod (enum)
`WEB` | `EMAIL` | `SMS` | `SLACK` | `MICROSOFT_TEAMS` | `MOBILE_APP`

#### NotificationInfo
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| dashboardId | DashboardId |  | [optional] |
| stateEntityId | EntityId |  | [optional] |
| type | String |  |  |

#### NotificationStatus (enum)
`SENT` | `READ`

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (46 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


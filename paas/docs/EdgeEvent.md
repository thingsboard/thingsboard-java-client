
# EdgeEvent

`org.thingsboard.client.model.EdgeEvent`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **EdgeEventId** |  | [optional] |
| **createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| **seqId** | **Long** |  | [optional] |
| **tenantId** | **TenantId** |  | [optional] |
| **edgeId** | **EdgeId** |  | [optional] |
| **action** | **EdgeEventActionType** |  | [optional] |
| **entityId** | **UUID** |  | [optional] |
| **uid** | **String** |  | [optional] |
| **type** | **EdgeEventType** |  | [optional] |
| **body** | **com.fasterxml.jackson.databind.JsonNode** |  | [optional] |
| **entityGroupId** | **UUID** |  | [optional] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BillingCustomerId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CouponId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `ProductId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `SubscriptionAddonId`, `SubscriptionId`, `SubscriptionPlanId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### EdgeEventId
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | UUID | string |  |

#### EdgeEventActionType (enum)
`ADDED` | `UPDATED` | `DELETED` | `POST_ATTRIBUTES` | `ATTRIBUTES_UPDATED` | `ATTRIBUTES_DELETED` | `TIMESERIES_UPDATED` | `CREDENTIALS_UPDATED` | `RELATION_ADD_OR_UPDATE` | `RELATION_DELETED` | … (26 values total)

#### EdgeEventType (enum)
`DASHBOARD` | `ASSET` | `DEVICE` | `DEVICE_PROFILE` | `ASSET_PROFILE` | `ENTITY_VIEW` | `ALARM` | `ALARM_COMMENT` | `RULE_CHAIN` | `RULE_CHAIN_METADATA` | … (45 values total)

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (52 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


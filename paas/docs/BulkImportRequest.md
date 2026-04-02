
# BulkImportRequest

`org.thingsboard.client.model.BulkImportRequest`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **_file** | **String** |  | [optional] |
| **mapping** | **Mapping** |  | [optional] |
| **customerId** | **CustomerId** |  | [optional] |
| **entityGroupId** | **String** |  | [optional] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BillingCustomerId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CouponId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `ProductId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `SubscriptionAddonId`, `SubscriptionId`, `SubscriptionPlanId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### Mapping
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| columns | List<ColumnMapping> |  | [optional] |
| delimiter | String |  | [optional] |
| update | Boolean |  | [optional] |
| header | Boolean |  | [optional] |

#### ColumnMapping
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | BulkImportColumnType |  | [optional] |
| key | String |  | [optional] |

#### BulkImportColumnType (enum)
`NAME` | `TYPE` | `LABEL` | `SHARED_ATTRIBUTE` | `SERVER_ATTRIBUTE` | `TIMESERIES` | `ACCESS_TOKEN` | `X509` | `MQTT_CLIENT_ID` | `MQTT_USER_NAME` | … (32 values total)

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (52 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


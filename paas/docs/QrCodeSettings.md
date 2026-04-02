
# QrCodeSettings

`org.thingsboard.client.model.QrCodeSettings`

A JSON value representing the mobile apps configuration

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **QrCodeSettingsId** |  | [optional] |
| **createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| **tenantId** | **TenantId** | JSON object with Tenant Id. | [optional] [readonly] |
| **useSystemSettings** | **Boolean** | Use settings from system level | [optional] |
| **useDefaultApp** | **Boolean** | Type of application: true means use default Thingsboard app | [optional] |
| **mobileAppBundleId** | **MobileAppBundleId** | Mobile app bundle. | [optional] |
| **qrCodeConfig** | **QRCodeConfig** | QR code config configuration. | |
| **androidEnabled** | **Boolean** | Indicates if google play link is available | [optional] |
| **iosEnabled** | **Boolean** | Indicates if apple store link is available | [optional] |
| **googlePlayLink** | **String** |  | [optional] [readonly] |
| **appStoreLink** | **String** |  | [optional] [readonly] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BillingCustomerId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CouponId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `ProductId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `SubscriptionAddonId`, `SubscriptionId`, `SubscriptionPlanId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### QrCodeSettingsId
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | UUID | string |  |

#### QRCodeConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| showOnHomePage | Boolean |  | [optional] |
| badgeEnabled | Boolean |  | [optional] |
| qrCodeLabelEnabled | Boolean |  | [optional] |
| badgePosition | BadgePosition |  | [optional] |
| qrCodeLabel | String |  | [optional] |

#### BadgePosition (enum)
`RIGHT` | `LEFT`

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (52 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


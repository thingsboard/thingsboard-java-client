
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

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `CalculatedFieldId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityViewId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

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
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `RULE_CHAIN` | `RULE_NODE` | `ENTITY_VIEW` | … (36 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


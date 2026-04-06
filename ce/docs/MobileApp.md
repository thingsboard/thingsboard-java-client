
# MobileApp

`org.thingsboard.client.model.MobileApp`

A JSON value representing the Mobile Application.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **MobileAppId** |  | [optional] |
| **createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| **tenantId** | **TenantId** | JSON object with Tenant Id | [optional] |
| **pkgName** | **String** | Application package name. Cannot be empty | |
| **title** | **String** | Application title | [optional] |
| **appSecret** | **String** | Application secret. The length must be at least 16 characters | |
| **platformType** | **PlatformType** | Application platform type: ANDROID or IOS | |
| **status** | **MobileAppStatus** | Application status: PUBLISHED, DEPRECATED, SUSPENDED, DRAFT | |
| **versionInfo** | **MobileAppVersionInfo** | Application version info | [optional] |
| **storeInfo** | **StoreInfo** | Application store information | [optional] |
| **name** | **String** | Mobile app package name | [optional] [readonly] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `CalculatedFieldId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityViewId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### PlatformType (enum)
`WEB` | `ANDROID` | `IOS`

#### MobileAppStatus (enum)
`DRAFT` | `PUBLISHED` | `DEPRECATED` | `SUSPENDED`

#### MobileAppVersionInfo
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| minVersion | String | Minimum supported version | [optional] |
| minVersionReleaseNotes | String | Release notes of minimum supported version | [optional] |
| latestVersion | String | Latest supported version | [optional] |
| latestVersionReleaseNotes | String | Release notes of latest supported version | [optional] |

#### StoreInfo
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| appId | String |  | [optional] |
| sha256CertFingerprints | String |  | [optional] |
| storeLink | String |  | [optional] |

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `RULE_CHAIN` | `RULE_NODE` | `ENTITY_VIEW` | … (36 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


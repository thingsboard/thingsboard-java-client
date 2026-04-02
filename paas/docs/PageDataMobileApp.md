
# PageDataMobileApp

`org.thingsboard.client.model.PageDataMobileApp`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **data** | **List\<MobileApp\>** | Array of the entities | [optional] |
| **totalPages** | **Integer** | Total number of available pages. Calculated based on the 'pageSize' request parameter and total number of entities that match search criteria | [optional] [readonly] |
| **totalElements** | **Long** | Total number of elements in all available pages | [optional] [readonly] |
| **hasNext** | **Boolean** | 'false' value indicates the end of the result set | [optional] [readonly] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BillingCustomerId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CouponId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `ProductId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `SubscriptionAddonId`, `SubscriptionId`, `SubscriptionPlanId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### MobileApp
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | MobileAppId |  | [optional] |
| createdTime | Long | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| tenantId | TenantId | JSON object with Tenant Id | [optional] |
| pkgName | String | Application package name. Cannot be empty |  |
| title | String | Application title | [optional] |
| appSecret | String | Application secret. The length must be at least 16 characters |  |
| platformType | PlatformType | Application platform type: ANDROID or IOS |  |
| status | MobileAppStatus | Application status: PUBLISHED, DEPRECATED, SUSPENDED, DRAFT |  |
| versionInfo | MobileAppVersionInfo | Application version info | [optional] |
| storeInfo | StoreInfo | Application store information | [optional] |
| name | String | Mobile app package name | [optional] [readonly] |

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
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (52 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


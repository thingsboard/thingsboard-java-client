
# LoginWhiteLabelingParams

`org.thingsboard.client.model.LoginWhiteLabelingParams`

A JSON value representing the login white labeling configuration

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **logoImageUrl** | **String** | Logo image URL | [optional] |
| **logoImageHeight** | **Integer** | The height of a logo container. Logo image will be automatically scaled. | [optional] |
| **appTitle** | **String** | White-labeled name of the platform | [optional] |
| **favicon** | **Favicon** | JSON object that contains website icon url and type | [optional] |
| **paletteSettings** | **PaletteSettings** | Complex JSON that describes structure of the Angular Material Palette. See [theming](https://material.angular.io/guide/theming) for more details | [optional] |
| **helpLinkBaseUrl** | **String** | Base URL for help link | [optional] |
| **uiHelpBaseUrl** | **String** | Base URL for the repository with the UI help components (markdown) | [optional] |
| **enableHelpLinks** | **Boolean** | Enable or Disable help links | [optional] |
| **whiteLabelingEnabled** | **Boolean** | Enable white-labeling | [optional] [readonly] |
| **showNameVersion** | **Boolean** | Show platform name and version on UI and login screen | [optional] |
| **platformName** | **String** | White-labeled platform name | [optional] |
| **platformVersion** | **String** | White-labeled platform version | [optional] |
| **customCss** | **String** | Custom CSS content | [optional] |
| **hideConnectivityDialog** | **Boolean** | Hide device connectivity dialog | [optional] |
| **overrideTrendzName** | **Boolean** | Override Trendz Add-on name | [optional] |
| **hideChatBot** | **Boolean** | Hide chat bot | [optional] |
| **pageBackgroundColor** | **String** | Login page background color | [optional] |
| **darkForeground** | **Boolean** | Enable/Disable dark foreground | [optional] |
| **domainId** | **DomainId** | Domain id | [optional] |
| **baseUrl** | **String** | Base URL for the activation link, etc | [optional] |
| **prohibitDifferentUrl** | **Boolean** | Prohibit use of other URLs. It is recommended to enable this setting | [optional] |
| **adminSettingsId** | **String** | Id of the settings object that store this parameters | [optional] |
| **showNameBottom** | **Boolean** | Show platform name and version on login page | [optional] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BillingCustomerId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CouponId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `ProductId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `SubscriptionAddonId`, `SubscriptionId`, `SubscriptionPlanId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### Favicon
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| url | String |  | [optional] |

#### PaletteSettings
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| primaryPalette | Palette | Primary palette JSON |  |
| accentPalette | Palette | Accent palette JSON |  |

#### Palette
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String | Name of the pre-defined palette, or 'custom' |  |
| _extends | String | Pre-defined palette name that the custom palette extends | [optional] |
| colors | Map<String, String> | Mapping of hue identifier number to the rgb(a) color code | [optional] |

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (52 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


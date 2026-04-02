
# UserMobileInfo

`org.thingsboard.client.model.UserMobileInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **user** | **User** |  | [optional] |
| **storeInfo** | **StoreInfo** |  | [optional] |
| **versionInfo** | **MobileAppVersionInfo** |  | [optional] |
| **homeDashboardInfo** | **HomeDashboardInfo** |  | [optional] |
| **pages** | **com.fasterxml.jackson.databind.JsonNode** |  | [optional] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BillingCustomerId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CouponId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `ProductId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `SubscriptionAddonId`, `SubscriptionId`, `SubscriptionPlanId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### User
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | UserId | JSON object with the User Id. Specify this field to update the device. Referencing non-existing User Id will cause error. Omit this field to create new customer. | [optional] |
| createdTime | Long | Timestamp of the user creation, in milliseconds | [optional] [readonly] |
| additionalInfo | com.fasterxml.jackson.databind.JsonNode | Additional parameters of the user. May include: 'defaultDashboardId' (string, UUID of the default dashboard), 'defaultDashboardFullscreen' (boolean), 'homeDashboardId' (string, UUID of the home dashboard), 'homeDashboardHideToolbar' (boolean), 'lang' (string, user locale, e.g. 'en_US'), 'authProviderName' (string, name of the authentication provider). | [optional] |
| tenantId | TenantId | JSON object with the Tenant Id. | [optional] |
| customerId | CustomerId | JSON object with the Customer Id. | [optional] |
| email | String | Email of the user |  |
| authority | Authority | Authority |  |
| firstName | String | First name of the user | [optional] |
| lastName | String | Last name of the user | [optional] |
| phone | String | Phone number of the user | [optional] |
| customMenuId | CustomMenuId |  | [optional] |
| version | Long |  | [optional] |
| name | String | Duplicates the email of the user, readonly | [optional] [readonly] |
| ownerId | EntityId | JSON object with Customer or Tenant Id | [optional] [readonly] |

#### StoreInfo
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| appId | String |  | [optional] |
| sha256CertFingerprints | String |  | [optional] |
| storeLink | String |  | [optional] |

#### MobileAppVersionInfo
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| minVersion | String | Minimum supported version | [optional] |
| minVersionReleaseNotes | String | Release notes of minimum supported version | [optional] |
| latestVersion | String | Latest supported version | [optional] |
| latestVersionReleaseNotes | String | Release notes of latest supported version | [optional] |

#### HomeDashboardInfo
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| dashboardId | DashboardId | JSON object with the dashboard Id. | [optional] |
| hideDashboardToolbar | Boolean | Hide dashboard toolbar flag. Useful for rendering dashboards on mobile. | [optional] |

#### Authority (enum)
`SYS_ADMIN` | `TENANT_ADMIN` | `CUSTOMER_USER` | `BILLING_ADMIN` | `BILLING_SERVICE` | `REFRESH_TOKEN` | `PRE_VERIFICATION_TOKEN` | `MFA_CONFIGURATION_TOKEN`

#### CustomMenuId
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | UUID | string |  |

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (52 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions



# PageDataMobileAppBundleInfo

`org.thingsboard.client.model.PageDataMobileAppBundleInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **data** | **List\<MobileAppBundleInfo\>** | Array of the entities | [optional] |
| **totalPages** | **Integer** | Total number of available pages. Calculated based on the 'pageSize' request parameter and total number of entities that match search criteria | [optional] [readonly] |
| **totalElements** | **Long** | Total number of elements in all available pages | [optional] [readonly] |
| **hasNext** | **Boolean** | 'false' value indicates the end of the result set | [optional] [readonly] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `CalculatedFieldId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityViewId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### MobileAppBundleInfo
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | MobileAppBundleId |  | [optional] |
| createdTime | Long | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| tenantId | TenantId | JSON object with Tenant Id | [optional] |
| title | String | Application bundle title. Cannot be empty |  |
| description | String | Application bundle description. | [optional] |
| androidAppId | MobileAppId | Android application id | [optional] |
| iosAppId | MobileAppId | IOS application id | [optional] |
| layoutConfig | MobileLayoutConfig | Application layout configuration | [optional] |
| oauth2Enabled | Boolean | Whether OAuth2 settings are enabled or not | [optional] |
| androidPkgName | String | Android package name | [optional] |
| iosPkgName | String | IOS package name | [optional] |
| oauth2ClientInfos | List<OAuth2ClientInfo> | List of available oauth2 clients | [optional] |
| qrCodeEnabled | Boolean | Indicates if qr code is available for bundle | [optional] |
| name | String | Mobile app bundle title | [optional] [readonly] |

#### MobileLayoutConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| pages | List<MobilePage> |  | [optional] |

#### OAuth2ClientInfo
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | OAuth2ClientId |  | [optional] |
| createdTime | Long | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| title | String | Oauth2 client registration title (e.g. My google) | [optional] |
| providerName | String | Oauth2 client provider name (e.g. Google) | [optional] |
| platforms | List<PlatformType> | List of platforms for which usage of the OAuth2 client is allowed (empty for all allowed) | [optional] |
| name | String |  | [optional] [readonly] |

#### MobilePage
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | MobilePageType |  |  |
| visible | Boolean |  | [optional] |

#### CustomMobilePage  *(extends MobilePage, type=`CUSTOM`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| label | String | Page label | [optional] |
| icon | String | URL of the page icon | [optional] |
| path | String | Path to custom page | [optional] |

#### DashboardPage  *(extends MobilePage, type=`DASHBOARD`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| label | String | Page label | [optional] |
| icon | String | URL of the page icon | [optional] |
| dashboardId | String | Dashboard id | [optional] |

#### DefaultMobilePage  *(extends MobilePage, type=`DEFAULT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| label | String | Page label | [optional] |
| icon | String | URL of the page icon | [optional] |
| id | DefaultPageId | Identifier for default page | [optional] |

#### WebViewPage  *(extends MobilePage, type=`WEB_VIEW`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| label | String | Page label | [optional] |
| icon | String | URL of the page icon | [optional] |
| url | String | Url | [optional] |

#### PlatformType (enum)
`WEB` | `ANDROID` | `IOS`

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `RULE_CHAIN` | `RULE_NODE` | `ENTITY_VIEW` | … (36 values total)

#### MobilePageType (enum)
`DEFAULT` | `DASHBOARD` | `WEB_VIEW` | `CUSTOM`

#### DefaultPageId (enum)
`HOME` | `ALARMS` | `DEVICES` | `CUSTOMERS` | `ASSETS` | `AUDIT_LOGS` | `NOTIFICATIONS` | `DEVICE_LIST` | `DASHBOARDS`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


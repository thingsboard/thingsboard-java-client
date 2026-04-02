
# PageDataNotificationRequestInfo

`org.thingsboard.client.model.PageDataNotificationRequestInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **data** | **List\<NotificationRequestInfo\>** | Array of the entities | [optional] |
| **totalPages** | **Integer** | Total number of available pages. Calculated based on the 'pageSize' request parameter and total number of entities that match search criteria | [optional] [readonly] |
| **totalElements** | **Long** | Total number of elements in all available pages | [optional] [readonly] |
| **hasNext** | **Boolean** | 'false' value indicates the end of the result set | [optional] [readonly] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### NotificationRequestInfo
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | NotificationRequestId |  | [optional] |
| createdTime | Long | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| tenantId | TenantId |  | [optional] |
| targets | List<UUID> |  |  |
| templateId | NotificationTemplateId |  | [optional] |
| template | NotificationTemplate |  | [optional] |
| info | NotificationInfo |  | [optional] |
| additionalConfig | NotificationRequestConfig |  | [optional] |
| originatorEntityId | EntityId |  | [optional] |
| ruleId | NotificationRuleId |  | [optional] |
| status | NotificationRequestStatus |  | [optional] |
| stats | NotificationRequestStats |  | [optional] |
| templateName | String |  | [optional] |
| deliveryMethods | List<NotificationDeliveryMethod> |  | [optional] |

#### NotificationTemplate
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | NotificationTemplateId |  | [optional] |
| createdTime | Long | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| tenantId | TenantId |  | [optional] |
| name | String |  |  |
| notificationType | NotificationType |  |  |
| _configuration | NotificationTemplateConfig |  |  |

#### NotificationInfo
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| dashboardId | DashboardId |  | [optional] |
| stateEntityId | EntityId |  | [optional] |
| type | String |  |  |

#### NotificationRequestConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| sendingDelayInSec | Integer |  | [optional] |
| reports | List<ReportId> |  | [optional] |

#### NotificationRequestStatus (enum)
`PROCESSING` | `SENT` | `SCHEDULED`

#### NotificationRequestStats
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| sent | Map<String, Integer> |  | [optional] |
| errors | Map<String, Map<String, String>> |  | [optional] |
| totalErrors | Integer |  | [optional] |
| error | String |  | [optional] |
| totalSent | Integer |  | [optional] |

#### NotificationDeliveryMethod (enum)
`WEB` | `EMAIL` | `SMS` | `SLACK` | `MICROSOFT_TEAMS` | `MOBILE_APP`

#### NotificationType (enum)
`GENERAL` | `ALARM` | `DEVICE_ACTIVITY` | `ENTITY_ACTION` | `ALARM_COMMENT` | `RULE_ENGINE_COMPONENT_LIFECYCLE_EVENT` | `ALARM_ASSIGNMENT` | `NEW_PLATFORM_VERSION` | `ENTITIES_LIMIT` | `ENTITIES_LIMIT_INCREASE_REQUEST` | … (22 values total)

#### NotificationTemplateConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| deliveryMethodsTemplates | Map<String, DeliveryMethodNotificationTemplate> |  |  |
| attachReport | Boolean |  | [optional] |
| reportTemplateId | ReportTemplateId |  | [optional] |
| userId | UserId |  | [optional] |
| timezone | String |  | [optional] |

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (46 values total)

#### DeliveryMethodNotificationTemplate
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| enabled | Boolean |  | [optional] |
| body | String |  |  |
| method | String |  |  |

#### EmailDeliveryMethodNotificationTemplate  *(extends DeliveryMethodNotificationTemplate, method=`EMAIL`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| subject | String |  |  |

#### MicrosoftTeamsDeliveryMethodNotificationTemplate  *(extends DeliveryMethodNotificationTemplate, method=`MICROSOFT_TEAMS`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| subject | String |  | [optional] |
| themeColor | String |  | [optional] |
| button | Button |  | [optional] |

#### MobileAppDeliveryMethodNotificationTemplate  *(extends DeliveryMethodNotificationTemplate, method=`MOBILE_APP`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| subject | String | Subject line for the mobile notification |  |
| additionalConfig | com.fasterxml.jackson.databind.JsonNode | Additional JSON configuration for web buttons/actions | [optional] |

#### SlackDeliveryMethodNotificationTemplate  *(extends DeliveryMethodNotificationTemplate, method=`SLACK`)*
*See DeliveryMethodNotificationTemplate for properties.*

#### SmsDeliveryMethodNotificationTemplate  *(extends DeliveryMethodNotificationTemplate, method=`SMS`)*
*See DeliveryMethodNotificationTemplate for properties.*

#### WebDeliveryMethodNotificationTemplate  *(extends DeliveryMethodNotificationTemplate, method=`WEB`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| subject | String | Subject line for the web notification |  |
| additionalConfig | com.fasterxml.jackson.databind.JsonNode | Additional JSON configuration for web buttons/actions | [optional] |

#### Button
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| enabled | Boolean |  | [optional] |
| text | String |  | [optional] |
| linkType | LinkType |  | [optional] |
| link | String |  | [optional] |
| dashboardId | UUID |  | [optional] |
| dashboardState | String |  | [optional] |
| setEntityIdInState | Boolean |  | [optional] |

#### LinkType (enum)
`LINK` | `DASHBOARD`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


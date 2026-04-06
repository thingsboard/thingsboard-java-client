
# NotificationTemplate

`org.thingsboard.client.model.NotificationTemplate`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **NotificationTemplateId** |  | [optional] |
| **createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| **tenantId** | **TenantId** |  | [optional] |
| **name** | **String** |  | |
| **notificationType** | **NotificationType** |  | |
| **_configuration** | **NotificationTemplateConfig** |  | |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `CalculatedFieldId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityViewId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### NotificationType (enum)
`GENERAL` | `ALARM` | `DEVICE_ACTIVITY` | `ENTITY_ACTION` | `ALARM_COMMENT` | `RULE_ENGINE_COMPONENT_LIFECYCLE_EVENT` | `ALARM_ASSIGNMENT` | `NEW_PLATFORM_VERSION` | `ENTITIES_LIMIT` | `ENTITIES_LIMIT_INCREASE_REQUEST` | … (17 values total)

#### NotificationTemplateConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| deliveryMethodsTemplates | Map<String, DeliveryMethodNotificationTemplate> |  |  |

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

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `RULE_CHAIN` | `RULE_NODE` | `ENTITY_VIEW` | … (36 values total)

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


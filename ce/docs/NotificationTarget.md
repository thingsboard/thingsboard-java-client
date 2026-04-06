
# NotificationTarget

`org.thingsboard.client.model.NotificationTarget`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **NotificationTargetId** |  | [optional] |
| **createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| **tenantId** | **TenantId** |  | [optional] |
| **name** | **String** |  | |
| **_configuration** | **NotificationTargetConfig** |  | |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `CalculatedFieldId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityViewId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### NotificationTargetConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| description | String |  | [optional] |
| type | String |  |  |

#### MicrosoftTeamsNotificationTargetConfig  *(extends NotificationTargetConfig, type=`MICROSOFT_TEAMS`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| webhookUrl | String |  |  |
| channelName | String |  |  |
| useOldApi | Boolean |  | [optional] |
| email | String |  | [optional] |
| firstName | String |  | [optional] |
| id | Object |  | [optional] |
| lastName | String |  | [optional] |
| title | String |  | [optional] |

#### PlatformUsersNotificationTargetConfig  *(extends NotificationTargetConfig, type=`PLATFORM_USERS`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| usersFilter | UsersFilter |  |  |

#### SlackNotificationTargetConfig  *(extends NotificationTargetConfig, type=`SLACK`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| conversationType | SlackConversationType |  | [optional] |
| conversation | SlackConversation |  |  |

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `RULE_CHAIN` | `RULE_NODE` | `ENTITY_VIEW` | … (36 values total)

#### UsersFilter
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### AffectedTenantAdministratorsFilter  *(extends UsersFilter, type=`AFFECTED_TENANT_ADMINISTRATORS`)*
*See UsersFilter for properties.*

#### AffectedUserFilter  *(extends UsersFilter, type=`AFFECTED_USER`)*
*See UsersFilter for properties.*

#### AllUsersFilter  *(extends UsersFilter, type=`ALL_USERS`)*
*See UsersFilter for properties.*

#### CustomerUsersFilter  *(extends UsersFilter, type=`CUSTOMER_USERS`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| customerId | UUID |  |  |

#### OriginatorEntityOwnerUsersFilter  *(extends UsersFilter, type=`ORIGINATOR_ENTITY_OWNER_USERS`)*
*See UsersFilter for properties.*

#### SystemAdministratorsFilter  *(extends UsersFilter, type=`SYSTEM_ADMINISTRATORS`)*
*See UsersFilter for properties.*

#### TenantAdministratorsFilter  *(extends UsersFilter, type=`TENANT_ADMINISTRATORS`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| tenantsIds | Set<UUID> |  | [optional] |
| tenantProfilesIds | Set<UUID> |  | [optional] |

#### UserListFilter  *(extends UsersFilter, type=`USER_LIST`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| usersIds | List<UUID> |  |  |

#### SlackConversationType (enum)
`DIRECT` | `PUBLIC_CHANNEL` | `PRIVATE_CHANNEL`

#### SlackConversation
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | SlackConversationType |  |  |
| id | String |  |  |
| name | String |  |  |
| wholeName | String |  | [optional] |
| email | String |  | [optional] |
| title | String |  | [optional] |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


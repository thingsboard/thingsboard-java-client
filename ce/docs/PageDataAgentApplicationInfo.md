
# PageDataAgentApplicationInfo

`org.thingsboard.client.model.PageDataAgentApplicationInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **data** | **List\<AgentApplicationInfo\>** | Array of the entities | [optional] |
| **totalPages** | **Integer** | Total number of available pages. Calculated based on the 'pageSize' request parameter and total number of entities that match search criteria | [optional] [readonly] |
| **totalElements** | **Long** | Total number of elements in all available pages | [optional] [readonly] |
| **hasNext** | **Boolean** | 'false' value indicates the end of the result set | [optional] [readonly] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AgentAppEventId`, `AgentAppProfileId`, `AgentAppUnitId`, `AgentApplicationId`, `AgentBulkActionId`, `AgentId`, `AgentProfileId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### AgentApplicationInfo
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | AgentApplicationId | JSON object with the Agent Application Id. | [optional] |
| createdTime | Long | Timestamp of the agent application creation, in milliseconds | [optional] [readonly] |
| tenantId | TenantId | JSON object with Tenant Id. | [optional] [readonly] |
| agentId | AgentId | Agent this application belongs to |  |
| name | String | Application name (not unique across tenant) | [optional] |
| templateVersion | String | Template version this application is based on |  |
| desiredTemplateVersion | String |  | [optional] |
| appType | AgentApplicationType | Application type |  |
| config | DockerComposeConfig |  | [optional] |
| version | Long |  | [optional] |
| projectName | String |  | [optional] |
| pendingDeletion | Boolean |  | [optional] |
| origin | AgentApplicationOrigin | Origin of the application (INSTALLED or DISCOVERED) | [optional] |
| applicationProfileId | AgentAppProfileId | Application Profile Id. When set, config is read-only and inherited from the profile. | [optional] |
| profileConfigVersion | Long |  | [optional] |
| currentVersion | String | Current version of the template this application is based on. | [optional] [readonly] |
| nextVersion | String | Next version available for upgrade. | [optional] [readonly] |
| profileConfigOutdated | Boolean | True if the app's config is outdated relative to its profile. | [optional] [readonly] |
| profileName | String | Name of the application profile this app is based on. | [optional] [readonly] |
| profileTemplateVersion | String | Template version of the application profile this app is based on. | [optional] [readonly] |
| agentName | String | Name of the owning agent. | [optional] [readonly] |
| relatedEntityId | EntityId | Related entity id (Edge or Gateway device) currently assigned to this application. | [optional] [readonly] |

#### AgentApplicationType (enum)
`GENERIC` | `EDGE` | `GATEWAY`

#### DockerComposeConfig  *(extends AgentAppConfig)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| compose | com.fasterxml.jackson.databind.JsonNode |  | [optional] |
| composeType | String |  | [optional] |

#### AgentApplicationOrigin (enum)
`INSTALLED` | `DISCOVERED` | `AUTO_PROVISIONED`

#### AgentAppConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| arguments | List<AgentAppArgument> |  | [optional] |
| edgeRoutingKey | String |  | [optional] |
| type | AgentAppConfigType |  | [optional] |

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (53 values total)

#### AgentAppArgument
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| name | String | Argument name, referenced in the compose as ${tb.<name>}. | [optional] |
| sourceType | AgentAppArgumentSource | Source entity the value is resolved from. | [optional] |
| sourceEntityId | EntityId | Concrete source entity id. Required when sourceType references a specific entity (DEVICE, ASSET, CUSTOMER, EDGE); ignored for the context-derived sources. | [optional] |
| valueType | AgentAppArgumentValueType | Whether the value is read from an attribute or the latest telemetry. | [optional] |
| scope | AttributeScope | Attribute scope. Applicable only when valueType is ATTRIBUTE. Defaults to SERVER_SCOPE. | [optional] |
| key | String | Attribute or latest telemetry key to read. | [optional] |
| defaultValue | String | Optional fallback value used when the source has no value for the key. | [optional] |
| format | AgentAppArgumentFormat | How the resolved value is injected into the compose: STRING (quoted) or JSON (raw, for arrays/objects/numbers when the placeholder is the whole value). Defaults to STRING. | [optional] |

#### AgentAppConfigType (enum)
`DOCKER_COMPOSE`

#### AgentAppArgumentSource (enum)
`AGENT` | `OWNER` | `RELATED_ENTITY` | `TENANT` | `DEVICE` | `ASSET` | `CUSTOMER` | `EDGE`

#### AgentAppArgumentValueType (enum)
`ATTRIBUTE` | `LATEST_TELEMETRY`

#### AttributeScope (enum)
`CLIENT_SCOPE` | `SERVER_SCOPE` | `SHARED_SCOPE`

#### AgentAppArgumentFormat (enum)
`STRING` | `JSON`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


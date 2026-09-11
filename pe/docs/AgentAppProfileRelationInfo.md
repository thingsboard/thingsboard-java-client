
# AgentAppProfileRelationInfo

`org.thingsboard.client.model.AgentAppProfileRelationInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **AgentAppProfileId** | JSON object with the Agent Application Profile Id. | [optional] |
| **createdTime** | **Long** | Timestamp of the profile creation, in milliseconds | [optional] [readonly] |
| **tenantId** | **TenantId** | JSON object with Tenant Id. | [optional] [readonly] |
| **name** | **String** | Unique profile name within tenant | |
| **description** | **String** | Profile description | [optional] |
| **appType** | **AgentApplicationType** | Application type: EDGE, GATEWAY, or GENERIC | |
| **templateVersion** | **String** | Template version this profile is based on | |
| **config** | **DockerComposeConfig** |  | [optional] |
| **version** | **Long** |  | [optional] |
| **templateCurrentVersion** | **String** | Current version of the template this profile points to. | [optional] [readonly] |
| **agentProfileId** | **AgentProfileId** | JSON object with the Agent Profile Id this app profile is assigned to. | [optional] [readonly] |
| **assignedApplicationsCount** | **Long** | Number of AgentApplications using this app profile within the agent profile. | [optional] [readonly] |
| **additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional info of the assignment relation between the agent profile and this app profile. | [optional] [readonly] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AgentAppEventId`, `AgentAppProfileId`, `AgentAppUnitId`, `AgentApplicationId`, `AgentBulkActionId`, `AgentId`, `AgentProfileId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### AgentApplicationType (enum)
`GENERIC` | `EDGE` | `GATEWAY`

#### DockerComposeConfig  *(extends AgentAppConfig)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| compose | com.fasterxml.jackson.databind.JsonNode |  | [optional] |
| composeType | String |  | [optional] |

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


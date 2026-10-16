
# AgentAppEventRequest

`org.thingsboard.client.model.AgentAppEventRequest`

Request payload for creating an agent application event (install, update, upgrade, restart, delete, etc.).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **actionType** | **AgentAppEventActionType** | Action to perform against the agent application. | [optional] |
| **application** | **AgentApplication** | Agent application payload supplied by the caller. Used to carry name/config changes for UPDATE and the target state for INSTALL/UPGRADE. | [optional] |
| **stepInputs** | **Map\<String, AgentAppEventStepStatesValue\>** | Per-step input overrides keyed by step id (e.g. pullImages flag, backup volume selection). | [optional] |
| **relatedEntityId** | **EntityId** | INSTALL-action optional related entity (Edge or Gateway Device) to link to the application in the same operation. When set, the application is created and the relation is assigned atomically. Ignored for non-INSTALL actions. | [optional] |
| **bulkActionId** | **UUID** | Optional bulk-action correlation id. When the same value is used across multiple application events, duplicates are deduplicated server-side. | [optional] |
| **skipProfileRefetch** | **Boolean** | UPDATE-action flag for profile-managed apps. When true, the compose is not re-resolved from the (possibly upgraded) profile — only the credentials carried by `application.config` are applied. Ignored for non-UPDATE actions and for non-profile-managed apps. | [optional] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AgentAppEventId`, `AgentAppProfileId`, `AgentAppUnitId`, `AgentApplicationId`, `AgentBulkActionId`, `AgentId`, `AgentProfileId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### AgentAppEventActionType (enum)
`INSTALL` | `UPDATE` | `DELETE` | `RESTART` | `ROLLBACK` | `UPGRADE` | `AGENT_UPGRADE`

#### AgentApplication
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

#### AgentAppEventStepStatesValue
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | AgentAppStepType |  | [optional] |
| backupVolumes | StepFieldListString |  | [optional] |
| serviceImageRegexPatterns | StepFieldListString |  | [optional] |
| removeVolumes | StepFieldBoolean |  | [optional] |
| pullImages | StepFieldBoolean |  | [optional] |
| failedEventId | StepFieldAgentAppEventId |  | [optional] |
| image | StepFieldString |  | [optional] |
| entrypoint | StepFieldListString |  | [optional] |
| cmd | StepFieldListString |  | [optional] |
| env | StepFieldListString |  | [optional] |
| binds | StepFieldListString |  | [optional] |
| networks | StepFieldListString |  | [optional] |
| retries | StepFieldInteger |  | [optional] |
| networkFromServiceImageRegexPattern | StepFieldString |  | [optional] |

#### AgentApplicationType (enum)
`GENERIC` | `EDGE` | `GATEWAY`

#### DockerComposeConfig  *(extends AgentAppConfig)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| compose | com.fasterxml.jackson.databind.JsonNode |  | [optional] |
| composeType | String |  | [optional] |

#### AgentApplicationOrigin (enum)
`INSTALLED` | `DISCOVERED` | `AUTO_PROVISIONED`

#### AgentAppStepType (enum)
`COMPOSE_TEMPLATE` | `COMPOSE` | `COMPOSE_START` | `COMPOSE_DOWN` | `ROLLBACK` | `BACKUP_VOLUME` | `BACKUP_VOLUME_REMOVE` | `COMPOSE_RESTART` | `RUN_JOB` | `AGENT_PREPARE` | … (11 values total)

#### StepFieldListString
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| userChoice | Boolean |  | [optional] |
| value | List<String> |  | [optional] |

#### StepFieldBoolean
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| value | Boolean |  | [optional] |
| userChoice | Boolean |  | [optional] |

#### StepFieldAgentAppEventId
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| value | AgentAppEventId |  | [optional] |
| userChoice | Boolean |  | [optional] |

#### StepFieldString
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| value | String |  | [optional] |
| userChoice | Boolean |  | [optional] |

#### StepFieldInteger
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| value | Integer |  | [optional] |
| userChoice | Boolean |  | [optional] |

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (53 values total)

#### AgentAppConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| arguments | List<AgentAppArgument> |  | [optional] |
| edgeRoutingKey | String |  | [optional] |
| type | AgentAppConfigType |  | [optional] |

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


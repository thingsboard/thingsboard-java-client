
# RuleChainData

`org.thingsboard.client.model.RuleChainData`

A JSON value representing the rule chains.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **ruleChains** | **List\<RuleChain\>** | List of the Rule Chain objects. | |
| **metadata** | **List\<RuleChainMetaData\>** | List of the Rule Chain metadata objects. | |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### RuleChain
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | RuleChainId | JSON object with the Rule Chain Id. Specify this field to update the Rule Chain. Referencing non-existing Rule Chain Id will cause error. Omit this field to create new rule chain. | [optional] |
| createdTime | Long | Timestamp of the rule chain creation, in milliseconds | [optional] [readonly] |
| additionalInfo | com.fasterxml.jackson.databind.JsonNode |  | [optional] |
| tenantId | TenantId | JSON object with Tenant Id. | [readonly] |
| name | String | Rule Chain name |  |
| type | RuleChainType | Rule Chain type. 'EDGE' rule chains are processing messages on the edge devices only. | [optional] |
| firstRuleNodeId | RuleNodeId | JSON object with Rule Chain Id. Pointer to the first rule node that should receive all messages pushed to this rule chain. | [optional] |
| root | Boolean | Indicates root rule chain. The root rule chain process messages from all devices and entities by default. User may configure default rule chain per device profile. | [optional] |
| debugMode | Boolean | Reserved for future usage. | [optional] |
| _configuration | com.fasterxml.jackson.databind.JsonNode |  | [optional] |
| version | Long |  | [optional] |

#### RuleChainMetaData
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| ruleChainId | RuleChainId | JSON object with Rule Chain Id. | [readonly] |
| version | Long | Version of the Rule Chain | [optional] |
| firstNodeIndex | Integer | Index of the first rule node in the 'nodes' list |  |
| nodes | List<RuleNode> | List of rule node JSON objects |  |
| connections | List<NodeConnectionInfo> | List of JSON objects that represent connections between rule nodes |  |
| ruleChainConnections | List<RuleChainConnectionInfo> | List of JSON objects that represent connections between rule nodes and other rule chains. |  |

#### RuleChainType (enum)
`CORE` | `EDGE`

#### RuleNode
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | RuleNodeId | JSON object with the Rule Node Id. Specify this field to update the Rule Node. Referencing non-existing Rule Node Id will cause error. Omit this field to create new rule node. | [optional] |
| createdTime | Long | Timestamp of the rule node creation, in milliseconds | [optional] [readonly] |
| additionalInfo | com.fasterxml.jackson.databind.JsonNode | Additional parameters of the rule node. May include: 'layoutX' (number, X coordinate for visualization), 'layoutY' (number, Y coordinate for visualization), 'description' (string). | [optional] |
| ruleChainId | RuleChainId | JSON object with the Rule Chain Id. | [optional] [readonly] |
| type | String | Full Java Class Name of the rule node implementation. | [optional] |
| name | String | User defined name of the rule node. Used on UI and for logging. | [optional] |
| debugSettings | DebugSettings | Debug settings object. | [optional] |
| singletonMode | Boolean | Enable/disable singleton mode. | [optional] |
| queueName | String | Queue name. | [optional] |
| configurationVersion | Integer | Version of rule node configuration. | [optional] |
| _configuration | com.fasterxml.jackson.databind.JsonNode | JSON with the rule node configuration. Structure depends on the rule node implementation. | [optional] |
| externalId | RuleNodeId |  | [optional] |
| debugMode | Boolean |  | [optional] |

#### NodeConnectionInfo
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| fromIndex | Integer | Index of rule node in the 'nodes' array of the RuleChainMetaData. Indicates the 'from' part of the connection. |  |
| toIndex | Integer | Index of rule node in the 'nodes' array of the RuleChainMetaData. Indicates the 'to' part of the connection. |  |
| type | String | Type of the relation. Typically indicated the result of processing by the 'from' rule node. For example, 'Success' or 'Failure' |  |

#### RuleChainConnectionInfo
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| fromIndex | Integer | Index of rule node in the 'nodes' array of the RuleChainMetaData. Indicates the 'from' part of the connection. |  |
| targetRuleChainId | RuleChainId | JSON object with the Rule Chain Id. |  |
| additionalInfo | com.fasterxml.jackson.databind.JsonNode | JSON object with the additional information about the connection. |  |
| type | String | Type of the relation. Typically indicated the result of processing by the 'from' rule node. For example, 'Success' or 'Failure' |  |

#### DebugSettings
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| failuresEnabled | Boolean | Debug failures. | [optional] |
| allEnabled | Boolean | Debug All. Used as a trigger for updating debugAllUntil. | [optional] |
| allEnabledUntil | Long | Timestamp of the end time for the processing debug events. | [optional] |

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (46 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


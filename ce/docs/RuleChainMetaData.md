
# RuleChainMetaData

`org.thingsboard.client.model.RuleChainMetaData`

A JSON value representing the rule chain metadata.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **ruleChainId** | **RuleChainId** | JSON object with Rule Chain Id. | [readonly] |
| **version** | **Long** | Version of the Rule Chain | [optional] |
| **firstNodeIndex** | **Integer** | Index of the first rule node in the 'nodes' list | |
| **nodes** | **List\<RuleNode\>** | List of rule node JSON objects | |
| **connections** | **List\<NodeConnectionInfo\>** | List of JSON objects that represent connections between rule nodes | |
| **ruleChainConnections** | **List\<RuleChainConnectionInfo\>** | List of JSON objects that represent connections between rule nodes and other rule chains. | |
| **notes** | **List\<RuleChainNote\>** | List of sticky notes placed on the rule chain canvas | [optional] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `CalculatedFieldId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityViewId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### RuleNode
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | RuleNodeId | JSON object with the Rule Node Id. Specify this field to update the Rule Node. Referencing non-existing Rule Node Id will cause error. Omit this field to create new rule node. | [optional] |
| createdTime | Long | Timestamp of the rule node creation, in milliseconds | [optional] [readonly] |
| ruleChainId | RuleChainId | JSON object with the Rule Chain Id. | [optional] [readonly] |
| type | String | Full Java Class Name of the rule node implementation. | [optional] |
| name | String | User defined name of the rule node. Used on UI and for logging. | [optional] |
| debugSettings | DebugSettings | Debug settings object. | [optional] |
| singletonMode | Boolean | Enable/disable singleton mode. | [optional] |
| queueName | String | Queue name. | [optional] |
| configurationVersion | Integer | Version of rule node configuration. | [optional] |
| _configuration | com.fasterxml.jackson.databind.JsonNode | JSON with the rule node configuration. Structure depends on the rule node implementation. | [optional] |
| externalId | RuleNodeId |  | [optional] |
| additionalInfo | com.fasterxml.jackson.databind.JsonNode | Additional parameters of the rule node. May include: 'layoutX' (number, X coordinate for visualization), 'layoutY' (number, Y coordinate for visualization), 'description' (string). | [optional] |
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

#### RuleChainNote
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | String | Unique identifier of the note on the canvas | [optional] |
| x | Integer | Horizontal position of the note on the canvas, in pixels | [optional] |
| y | Integer | Vertical position of the note on the canvas, in pixels | [optional] |
| width | Integer | Width of the note, in pixels | [optional] |
| height | Integer | Height of the note, in pixels | [optional] |
| content | String | Markdown or HTML content of the note | [optional] |
| backgroundColor | String | Background color of the note in CSS hex format, e.g. '#FFF9C4' | [optional] |
| borderColor | String | Border color of the note in CSS hex format, e.g. '#E6C800' | [optional] |
| borderWidth | Integer | Border width of the note in pixels | [optional] |
| applyDefaultMarkdownStyle | Boolean | Whether to apply the default markdown stylesheet to the note content | [optional] |
| markdownCss | String | Custom CSS styles applied to the note content | [optional] |

#### DebugSettings
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| failuresEnabled | Boolean | Debug failures. | [optional] |
| allEnabled | Boolean | Debug All. Used as a trigger for updating debugAllUntil. | [optional] |
| allEnabledUntil | Long | Timestamp of the end time for the processing debug events. | [optional] |

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `RULE_CHAIN` | `RULE_NODE` | `ENTITY_VIEW` | … (36 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


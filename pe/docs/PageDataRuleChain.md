
# PageDataRuleChain

`org.thingsboard.client.model.PageDataRuleChain`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **data** | **List\<RuleChain\>** | Array of the entities | [optional] |
| **totalPages** | **Integer** | Total number of available pages. Calculated based on the 'pageSize' request parameter and total number of entities that match search criteria | [optional] [readonly] |
| **totalElements** | **Long** | Total number of elements in all available pages | [optional] [readonly] |
| **hasNext** | **Boolean** | 'false' value indicates the end of the result set | [optional] [readonly] |



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

#### RuleChainType (enum)
`CORE` | `EDGE`

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (46 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


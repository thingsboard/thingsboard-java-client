
# PageDataWidgetsBundle

`org.thingsboard.client.model.PageDataWidgetsBundle`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **data** | **List\<WidgetsBundle\>** | Array of the entities | [optional] |
| **totalPages** | **Integer** | Total number of available pages. Calculated based on the 'pageSize' request parameter and total number of entities that match search criteria | [optional] [readonly] |
| **totalElements** | **Long** | Total number of elements in all available pages | [optional] [readonly] |
| **hasNext** | **Boolean** | 'false' value indicates the end of the result set | [optional] [readonly] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `CalculatedFieldId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityViewId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### WidgetsBundle
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | WidgetsBundleId | JSON object with the Widget Bundle Id. Specify this field to update the Widget Bundle. Referencing non-existing Widget Bundle Id will cause error. Omit this field to create new Widget Bundle. | [optional] |
| createdTime | Long | Timestamp of the Widget Bundle creation, in milliseconds | [optional] [readonly] |
| tenantId | TenantId | JSON object with Tenant Id. | [optional] [readonly] |
| alias | String | Unique alias that is used in widget types as a reference widget bundle | [optional] [readonly] |
| title | String | Title used in search and UI | [optional] [readonly] |
| image | String | Relative or external image URL. Replaced with image data URL (Base64) in case of relative URL and 'inlineImages' option enabled. | [optional] [readonly] |
| scada | Boolean | Whether widgets bundle contains SCADA symbol widget types. | [optional] [readonly] |
| description | String | Description | [optional] [readonly] |
| order | Integer | Order | [optional] [readonly] |
| version | Long |  | [optional] |
| name | String | Same as title of the Widget Bundle. Read-only field. Update the 'title' to change the 'name' of the Widget Bundle. | [optional] [readonly] |

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `RULE_CHAIN` | `RULE_NODE` | `ENTITY_VIEW` | … (36 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions



# PageDataWidgetTypeInfo

`org.thingsboard.client.model.PageDataWidgetTypeInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **data** | **List\<WidgetTypeInfo\>** | Array of the entities | [optional] |
| **totalPages** | **Integer** | Total number of available pages. Calculated based on the 'pageSize' request parameter and total number of entities that match search criteria | [optional] [readonly] |
| **totalElements** | **Long** | Total number of elements in all available pages | [optional] [readonly] |
| **hasNext** | **Boolean** | 'false' value indicates the end of the result set | [optional] [readonly] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `CalculatedFieldId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityViewId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### WidgetTypeInfo
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | WidgetTypeId | JSON object with the Widget Type Id. Specify this field to update the Widget Type. Referencing non-existing Widget Type Id will cause error. Omit this field to create new Widget Type. | [optional] |
| createdTime | Long | Timestamp of the Widget Type creation, in milliseconds | [optional] [readonly] |
| tenantId | TenantId | JSON object with Tenant Id. | [optional] [readonly] |
| fqn | String | Unique FQN that is used in dashboards as a reference widget type | [optional] [readonly] |
| name | String | Widget name used in search and UI | [optional] [readonly] |
| deprecated | Boolean | Whether widget type is deprecated. | [optional] |
| scada | Boolean | Whether widget type is SCADA symbol. | [optional] |
| version | Long |  | [optional] |
| image | String | Base64 encoded widget thumbnail | [optional] [readonly] |
| description | String | Description of the widget type | [optional] [readonly] |
| tags | List<String> | Tags of the widget type | [optional] |
| widgetType | String | Type of the widget (timeseries, latest, control, alarm or static) | [optional] [readonly] |
| bundles | List<WidgetBundleInfo> | Bundles | [optional] |

#### WidgetBundleInfo
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | EntityId | JSON object with the entity Id. | [optional] |
| name | String | Entity Name | [optional] |

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `RULE_CHAIN` | `RULE_NODE` | `ENTITY_VIEW` | … (36 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


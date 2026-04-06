
# HomeDashboard

`org.thingsboard.client.model.HomeDashboard`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **DashboardId** | JSON object with the dashboard Id. Specify existing dashboard Id to update the dashboard. Referencing non-existing dashboard id will cause error. Omit this field to create new dashboard. | [optional] |
| **createdTime** | **Long** | Timestamp of the dashboard creation, in milliseconds | [optional] [readonly] |
| **tenantId** | **TenantId** | JSON object with Tenant Id. Tenant Id of the dashboard can't be changed. | [optional] [readonly] |
| **title** | **String** | Title of the dashboard. | |
| **name** | **String** | Same as title of the dashboard. Read-only field. Update the 'title' to change the 'name' of the dashboard. | [optional] [readonly] |
| **image** | **String** | Thumbnail picture for rendering of the dashboards in a grid view on mobile devices. | [optional] [readonly] |
| **mobileHide** | **Boolean** | Hide dashboard from mobile devices. Useful if the dashboard is not designed for small screens. | [optional] [readonly] |
| **mobileOrder** | **Integer** | Order on mobile devices. Useful to adjust sorting of the dashboards for mobile applications | [optional] [readonly] |
| **assignedCustomers** | **Set\<ShortCustomerInfo\>** | List of assigned customers with their info. | [optional] |
| **_configuration** | **com.fasterxml.jackson.databind.JsonNode** | JSON object with main configuration of the dashboard: layouts, widgets, aliases, etc. The JSON structure of the dashboard configuration is quite complex. The easiest way to learn it is to export existing dashboard to JSON. | [optional] |
| **resources** | **List\<ResourceExportData\>** |  | [optional] |
| **version** | **Long** |  | [optional] |
| **hideDashboardToolbar** | **Boolean** | Hide dashboard toolbar flag. Useful for rendering dashboards on mobile. | [optional] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `CalculatedFieldId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityViewId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### ShortCustomerInfo
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| customerId | CustomerId | JSON object with the customer Id. | [optional] |
| title | String | Title of the customer. | [optional] |
| _public | Boolean | Indicates special 'Public' customer used to embed dashboards on public websites. | [optional] |

#### ResourceExportData
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| link | String |  | [optional] |
| title | String |  | [optional] |
| type | ResourceType |  | [optional] |
| subType | ResourceSubType |  | [optional] |
| resourceKey | String |  | [optional] |
| fileName | String |  | [optional] |
| publicResourceKey | String |  | [optional] |
| mediaType | String |  | [optional] |
| data | String |  | [optional] |
| isPublic | Boolean |  | [optional] |
| _public | Boolean |  | [optional] |

#### ResourceType (enum)
`LWM2_M_MODEL` | `JKS` | `PKCS_12` | `JS_MODULE` | `IMAGE` | `DASHBOARD` | `GENERAL`

#### ResourceSubType (enum)
`IMAGE` | `SCADA_SYMBOL` | `EXTENSION` | `MODULE`

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `RULE_CHAIN` | `RULE_NODE` | `ENTITY_VIEW` | … (36 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


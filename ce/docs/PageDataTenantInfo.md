
# PageDataTenantInfo

`org.thingsboard.client.model.PageDataTenantInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **data** | **List\<TenantInfo\>** | Array of the entities | [optional] |
| **totalPages** | **Integer** | Total number of available pages. Calculated based on the 'pageSize' request parameter and total number of entities that match search criteria | [optional] [readonly] |
| **totalElements** | **Long** | Total number of elements in all available pages | [optional] [readonly] |
| **hasNext** | **Boolean** | 'false' value indicates the end of the result set | [optional] [readonly] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `CalculatedFieldId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityViewId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### TenantInfo
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | TenantId | JSON object with the tenant Id. Specify this field to update the tenant. Referencing non-existing tenant Id will cause error. Omit this field to create new tenant. | [optional] |
| createdTime | Long | Timestamp of the tenant creation, in milliseconds | [optional] [readonly] |
| country | String | Country | [optional] |
| state | String | State | [optional] |
| city | String | City | [optional] |
| address | String | Address Line 1 | [optional] |
| address2 | String | Address Line 2 | [optional] |
| zip | String | Zip code | [optional] |
| phone | String | Phone number | [optional] |
| email | String | Email | [optional] |
| title | String | Title of the tenant |  |
| region | String | Geo region of the tenant | [optional] |
| tenantProfileId | TenantProfileId | JSON object with Tenant Profile Id | [optional] |
| version | Long |  | [optional] |
| tenantProfileName | String | Tenant Profile name | [optional] |
| additionalInfo | com.fasterxml.jackson.databind.JsonNode | Additional parameters of the tenant. May include: 'description' (string), 'homeDashboardId' (string, UUID of the home dashboard), 'homeDashboardHideToolbar' (boolean, whether to hide the dashboard toolbar). | [optional] |
| name | String | Name of the tenant. Read-only, duplicated from title for backward compatibility | [optional] [readonly] |

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `RULE_CHAIN` | `RULE_NODE` | `ENTITY_VIEW` | … (36 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


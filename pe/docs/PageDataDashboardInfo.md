
# PageDataDashboardInfo

`org.thingsboard.client.model.PageDataDashboardInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **data** | **List\<DashboardInfo\>** | Array of the entities | [optional] |
| **totalPages** | **Integer** | Total number of available pages. Calculated based on the 'pageSize' request parameter and total number of entities that match search criteria | [optional] [readonly] |
| **totalElements** | **Long** | Total number of elements in all available pages | [optional] [readonly] |
| **hasNext** | **Boolean** | 'false' value indicates the end of the result set | [optional] [readonly] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### DashboardInfo
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | DashboardId | JSON object with the dashboard Id. Specify existing dashboard Id to update the dashboard. Referencing non-existing dashboard id will cause error. Omit this field to create new dashboard. | [optional] |
| createdTime | Long | Timestamp of the dashboard creation, in milliseconds | [optional] [readonly] |
| tenantId | TenantId | JSON object with Tenant Id. Tenant Id of the dashboard can't be changed. | [optional] [readonly] |
| customerId | CustomerId | JSON object with Customer Id. | [optional] |
| ownerId | EntityId | JSON object with Customer or Tenant Id | [optional] [readonly] |
| title | String | Title of the dashboard. | [optional] |
| name | String | Same as title of the dashboard. Read-only field. Update the 'title' to change the 'name' of the dashboard. | [optional] [readonly] |
| image | String | Thumbnail picture for rendering of the dashboards in a grid view on mobile devices. | [optional] [readonly] |
| assignedCustomers | Set<ShortCustomerInfo> | List of assigned customers with their info. | [optional] |
| mobileHide | Boolean | Hide dashboard from mobile devices. Useful if the dashboard is not designed for small screens. | [optional] [readonly] |
| mobileOrder | Integer | Order on mobile devices. Useful to adjust sorting of the dashboards for mobile applications | [optional] [readonly] |
| _configuration | com.fasterxml.jackson.databind.JsonNode |  | [optional] |
| resources | List<ResourceExportData> |  | [optional] |
| version | Long |  | [optional] |
| groups | List<EntityInfo> | Groups | [optional] |
| ownerName | String | Owner name | [optional] [readonly] |

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

#### EntityInfo
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | EntityId | JSON object with the entity Id. | [optional] |
| name | String | Entity Name | [optional] |

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (46 values total)

#### ResourceType (enum)
`LWM2_M_MODEL` | `JKS` | `PKCS_12` | `JS_MODULE` | `IMAGE` | `DASHBOARD` | `GENERAL`

#### ResourceSubType (enum)
`IMAGE` | `SCADA_SYMBOL` | `EXTENSION` | `MODULE`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


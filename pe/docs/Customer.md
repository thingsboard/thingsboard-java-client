
# Customer

`org.thingsboard.client.model.Customer`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **CustomerId** | JSON object with the customer Id. Specify this field to update the customer. Referencing non-existing customer Id will cause error. Omit this field to create new customer. | [optional] |
| **createdTime** | **Long** | Timestamp of the customer creation, in milliseconds | [optional] [readonly] |
| **additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional parameters of the customer. May include: 'description' (string), 'homeDashboardId' (string, UUID of the home dashboard), 'homeDashboardHideToolbar' (boolean, whether to hide the dashboard toolbar), 'isPublic' (boolean, whether this is a public customer). | [optional] |
| **country** | **String** | Country | [optional] |
| **state** | **String** | State | [optional] |
| **city** | **String** | City | [optional] |
| **address** | **String** | Address Line 1 | [optional] |
| **address2** | **String** | Address Line 2 | [optional] |
| **zip** | **String** | Zip code | [optional] |
| **phone** | **String** | Phone number | [optional] |
| **email** | **String** | Email | |
| **title** | **String** | Title of the customer | |
| **tenantId** | **TenantId** | JSON object with Tenant Id | [optional] |
| **parentCustomerId** | **CustomerId** | JSON object with parent Customer Id | [optional] |
| **version** | **Long** |  | [optional] |
| **customMenuId** | **CustomMenuId** |  | [optional] |
| **customerId** | **CustomerId** | JSON object with parent Customer Id | [optional] [readonly] |
| **name** | **String** | Name of the customer. Read-only, duplicated from title for backward compatibility | [optional] [readonly] |
| **ownerId** | **EntityId** | JSON object with Customer or Tenant Id | [optional] [readonly] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### CustomMenuId
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | UUID | string |  |

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (46 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


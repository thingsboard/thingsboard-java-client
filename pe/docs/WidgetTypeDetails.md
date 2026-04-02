
# WidgetTypeDetails

`org.thingsboard.client.model.WidgetTypeDetails`

A JSON value representing the Widget Type Details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **WidgetTypeId** | JSON object with the Widget Type Id. Specify this field to update the Widget Type. Referencing non-existing Widget Type Id will cause error. Omit this field to create new Widget Type. | [optional] |
| **createdTime** | **Long** | Timestamp of the Widget Type creation, in milliseconds | [optional] [readonly] |
| **tenantId** | **TenantId** | JSON object with Tenant Id. | [optional] [readonly] |
| **fqn** | **String** | Unique FQN that is used in dashboards as a reference widget type | [optional] [readonly] |
| **name** | **String** | Widget name used in search and UI | [optional] [readonly] |
| **deprecated** | **Boolean** | Whether widget type is deprecated. | [optional] |
| **scada** | **Boolean** | Whether widget type is SCADA symbol. | [optional] |
| **version** | **Long** |  | [optional] |
| **descriptor** | **com.fasterxml.jackson.databind.JsonNode** | Complex JSON object that describes the widget type | [optional] [readonly] |
| **image** | **String** | Relative or external image URL. Replaced with image data URL (Base64) in case of relative URL and 'inlineImages' option enabled. | [optional] |
| **description** | **String** | Description of the widget | [optional] |
| **tags** | **List\<String\>** | Tags of the widget type | [optional] |
| **resources** | **List\<ResourceExportData\>** |  | [optional] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

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
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (46 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions



# TbResourceInfo

`org.thingsboard.client.model.TbResourceInfo`

A JSON value representing the Resource Info.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **TbResourceId** | JSON object with the Resource Id. Specify this field to update the Resource. Referencing non-existing Resource Id will cause error. Omit this field to create new Resource. | [optional] |
| **createdTime** | **Long** | Timestamp of the resource creation, in milliseconds | [optional] [readonly] |
| **tenantId** | **TenantId** | JSON object with Tenant Id. Tenant Id of the resource can't be changed. | [optional] [readonly] |
| **customerId** | **CustomerId** | JSON object with Customer Id. Customer Id of the resource can't be changed. | [optional] [readonly] |
| **title** | **String** | Resource title. | [optional] |
| **resourceType** | **ResourceType** | Resource type. | [optional] |
| **resourceSubType** | **ResourceSubType** | Resource sub type. | [optional] |
| **resourceKey** | **String** | Resource key. | [optional] |
| **publicResourceKey** | **String** | Public resource key. | [optional] |
| **etag** | **String** | Resource etag. | [optional] [readonly] |
| **fileName** | **String** | Resource file name. | [optional] |
| **descriptor** | **com.fasterxml.jackson.databind.JsonNode** | Resource descriptor. | [optional] |
| **link** | **String** |  | [optional] [readonly] |
| **name** | **String** |  | [optional] [readonly] |
| **_public** | **Boolean** |  | [optional] |
| **publicLink** | **String** |  | [optional] [readonly] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

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


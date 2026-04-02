
# BlobEntityInfo

`org.thingsboard.client.model.BlobEntityInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **BlobEntityId** | JSON object with the blob entity Id. Referencing non-existing blob entity Id will cause error | [optional] |
| **createdTime** | **Long** | Timestamp of the blob entity creation, in milliseconds | [optional] [readonly] |
| **additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional parameters of the blob entity | [optional] |
| **tenantId** | **TenantId** | JSON object with Tenant Id | [optional] [readonly] |
| **customerId** | **CustomerId** | JSON object with Customer Id | [optional] [readonly] |
| **name** | **String** | blob entity name | [optional] [readonly] |
| **type** | **String** | blob entity type | [optional] [readonly] |
| **contentType** | **ContentTypeEnum** | blob content type | [optional] [readonly] |
| **ownerId** | **EntityId** | JSON object with Customer or Tenant Id | [optional] [readonly] |


### Enum: ContentTypeEnum

| Name | Value |
|---- | -----|
| APPLICATION_PDF | "application/pdf" |
| IMAGE_JPEG | "image/jpeg" |
| IMAGE_PNG | "image/png" |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (46 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


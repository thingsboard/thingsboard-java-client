
# SchedulerEventWithCustomerInfo

`org.thingsboard.client.model.SchedulerEventWithCustomerInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **SchedulerEventId** | JSON object with the scheduler event Id. Specify this field to update the scheduler event. Referencing non-existing scheduler event Id will cause error. Omit this field to create new scheduler event | [optional] |
| **createdTime** | **Long** | Timestamp of the scheduler event creation, in milliseconds | [optional] [readonly] |
| **additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional parameters of the scheduler event | [optional] |
| **tenantId** | **TenantId** | JSON object with Tenant Id | [optional] [readonly] |
| **customerId** | **CustomerId** | JSON object with Customer Id | [optional] [readonly] |
| **originatorId** | **EntityId** | JSON object with Originator Id | [optional] [readonly] |
| **name** | **String** | scheduler event name | [optional] |
| **type** | **String** | scheduler event type | [optional] |
| **schedule** | **com.fasterxml.jackson.databind.JsonNode** | a JSON value with schedule time configuration | [optional] |
| **enabled** | **Boolean** | Enable/disable scheduler | [optional] |
| **version** | **Long** |  | [optional] |
| **customerTitle** | **String** | Title of the customer | [optional] |
| **customerIsPublic** | **Boolean** | Parameter that specifies if customer is public | [optional] [readonly] |
| **timestamps** | **List\<Long\>** |  | [optional] |
| **ownerId** | **EntityId** | JSON object with Customer or Tenant Id | [optional] [readonly] |



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


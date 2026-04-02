
# EntityView

`org.thingsboard.client.model.EntityView`

A JSON object representing the entity view.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **EntityViewId** | JSON object with the Entity View Id. Specify this field to update the Entity View. Referencing non-existing Entity View Id will cause error. Omit this field to create new Entity View. | [optional] |
| **createdTime** | **Long** | Timestamp of the Entity View creation, in milliseconds | [optional] [readonly] |
| **additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional parameters of the entity view. May include: 'description' (string). | [optional] |
| **entityId** | **EntityId** | JSON object with the referenced Entity Id (Device or Asset). | |
| **tenantId** | **TenantId** | JSON object with Tenant Id. | [optional] [readonly] |
| **customerId** | **CustomerId** | JSON object with Customer Id. Use 'assignEntityViewToCustomer' to change the Customer Id. | [optional] [readonly] |
| **name** | **String** | Entity View name | |
| **type** | **String** | Device Profile Name | |
| **keys** | **TelemetryEntityView** | Set of telemetry and attribute keys to expose via Entity View. | [optional] |
| **startTimeMs** | **Long** | Represents the start time of the interval that is used to limit access to target device telemetry. Customer will not be able to see entity telemetry that is outside the specified interval; | [optional] |
| **endTimeMs** | **Long** | Represents the end time of the interval that is used to limit access to target device telemetry. Customer will not be able to see entity telemetry that is outside the specified interval; | [optional] |
| **version** | **Long** |  | [optional] |
| **ownerId** | **EntityId** | JSON object with Customer or Tenant Id | [optional] [readonly] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BillingCustomerId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CouponId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `ProductId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `SubscriptionAddonId`, `SubscriptionId`, `SubscriptionPlanId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### TelemetryEntityView
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| timeseries | List<String> | List of time-series data keys to expose |  |
| attributes | AttributesEntityView | JSON object with attributes to expose |  |

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (52 values total)

#### AttributesEntityView
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| cs | List<String> | List of client-side attribute keys to expose |  |
| ss | List<String> | List of server-side attribute keys to expose |  |
| sh | List<String> | List of shared attribute keys to expose |  |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


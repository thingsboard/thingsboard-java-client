
# Integration

`org.thingsboard.client.model.Integration`

A JSON value representing the integration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **IntegrationId** | JSON object with the Integration Id. Specify this field to update the Integration. Referencing non-existing Integration Id will cause error. Omit this field to create new Integration. | [optional] |
| **createdTime** | **Long** | Timestamp of the integration creation, in milliseconds | [optional] [readonly] |
| **tenantId** | **TenantId** | JSON object with Tenant Id | [optional] [readonly] |
| **name** | **String** | Integration Name | |
| **type** | **IntegrationType** | The type of the integration | |
| **debugMode** | **Boolean** | Enable/disable debug.  | [optional] |
| **debugSettings** | **DebugSettings** | Debug settings object. | [optional] |
| **enabled** | **Boolean** | Boolean flag to enable/disable the integration | [optional] |
| **remote** | **Boolean** | Boolean flag to enable/disable the integration to be executed remotely. Remote integration is launched in a separate microservice. Local integration is executed by the platform core | [optional] |
| **allowCreateDevicesOrAssets** | **Boolean** | Boolean flag to allow/disallow the integration to create devices or assets that send message and do not exist in the system yet | [optional] |
| **edgeTemplate** | **Boolean** | Boolean flag that specifies that is regular or edge template integration | [optional] |
| **version** | **Long** |  | [optional] |
| **defaultConverterId** | **ConverterId** | JSON object with the Uplink Converter Id | |
| **downlinkConverterId** | **ConverterId** | JSON object with the Downlink Converter Id | [optional] |
| **routingKey** | **String** | String value used by HTTP based integrations for the base URL construction and by the remote integrations. Remote integration uses this value along with the 'secret' for kind of security and validation to be able to connect to the platform using Grpc | |
| **secret** | **String** | String value used by the remote integrations. Remote integration uses this value along with the 'routingKey' for kind of security and validation to be able to connect to the platform using Grpc | [optional] |
| **_configuration** | **com.fasterxml.jackson.databind.JsonNode** | JSON object representing integration configuration. Each integration type has specific configuration with the connectivity parameters (like 'host' and 'port' for MQTT type or 'baseUrl' for HTTP based type, etc.) and other important parameters dependent on the integration type | |
| **additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional parameters of the integration | [optional] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BillingCustomerId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CouponId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `ProductId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `SubscriptionAddonId`, `SubscriptionId`, `SubscriptionPlanId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### IntegrationType (enum)
`OCEANCONNECT` | `SIGFOX` | `THINGPARK` | `TPE` | `CHIRPSTACK` | `PARTICLE` | `TMOBILE_IOT_CDP` | `HTTP` | `MQTT` | `PUB_SUB` | … (29 values total)

#### DebugSettings
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| failuresEnabled | Boolean | Debug failures. | [optional] |
| allEnabled | Boolean | Debug All. Used as a trigger for updating debugAllUntil. | [optional] |
| allEnabledUntil | Long | Timestamp of the end time for the processing debug events. | [optional] |

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (52 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


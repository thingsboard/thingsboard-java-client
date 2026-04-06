
# AssetInfo

`org.thingsboard.client.model.AssetInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **AssetId** | JSON object with the asset Id. Specify this field to update the asset. Referencing non-existing asset Id will cause error. Omit this field to create new asset. | [optional] |
| **createdTime** | **Long** | Timestamp of the asset creation, in milliseconds | [optional] [readonly] |
| **tenantId** | **TenantId** | JSON object with Tenant Id. | [optional] [readonly] |
| **customerId** | **CustomerId** | JSON object with Customer Id. Use 'assignAssetToCustomer' to change the Customer Id. | [optional] [readonly] |
| **name** | **String** | Unique Asset Name in scope of Tenant | |
| **type** | **String** | Asset type | [optional] |
| **label** | **String** | Label that may be used in widgets | [optional] |
| **assetProfileId** | **AssetProfileId** | JSON object with Asset Profile Id. | [optional] |
| **version** | **Long** |  | [optional] |
| **customerTitle** | **String** | Title of the Customer that owns the asset. | [optional] [readonly] |
| **customerIsPublic** | **Boolean** | Indicates special 'Public' Customer that is auto-generated to use the assets on public dashboards. | [optional] [readonly] |
| **assetProfileName** | **String** | Name of the corresponding Asset Profile. | [optional] [readonly] |
| **additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional parameters of the asset. May include: 'description' (string). | [optional] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `CalculatedFieldId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityViewId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `RULE_CHAIN` | `RULE_NODE` | `ENTITY_VIEW` | … (36 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


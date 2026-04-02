
# SaveOtaPackageInfoRequest

`org.thingsboard.client.model.SaveOtaPackageInfoRequest`

A JSON value representing the OTA Package.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **OtaPackageId** | JSON object with the ota package Id. Specify existing ota package Id to update the ota package. Referencing non-existing ota package id will cause error. Omit this field to create new ota package. | [optional] |
| **createdTime** | **Long** | Timestamp of the ota package creation, in milliseconds | [optional] [readonly] |
| **additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | OTA Package description. | [optional] |
| **tenantId** | **TenantId** | JSON object with Tenant Id. Tenant Id of the ota package can't be changed. | [optional] [readonly] |
| **deviceProfileId** | **DeviceProfileId** | JSON object with Device Profile Id. Device Profile Id of the ota package can't be changed. | [optional] |
| **type** | **OtaPackageType** | OTA Package type. | [optional] |
| **title** | **String** | OTA Package title. | [optional] |
| **version** | **String** | OTA Package version. | [optional] |
| **tag** | **String** | OTA Package tag. | [optional] [readonly] |
| **url** | **String** | OTA Package url. | [optional] |
| **hasData** | **Boolean** | Indicates OTA Package 'has data'. Field is returned from DB ('true' if data exists or url is set).  If OTA Package 'has data' is 'false' we can not assign the OTA Package to the Device or Device Profile. | [optional] [readonly] |
| **fileName** | **String** | OTA Package file name. | [optional] [readonly] |
| **contentType** | **String** | OTA Package content type. | [optional] [readonly] |
| **checksumAlgorithm** | **ChecksumAlgorithm** | OTA Package checksum algorithm. | [optional] [readonly] |
| **checksum** | **String** | OTA Package checksum. | [optional] [readonly] |
| **dataSize** | **Long** | OTA Package data size. | [optional] [readonly] |
| **usesUrl** | **Boolean** | Indicates OTA Package uses url. Should be 'true' if uses url or 'false' if will be used data. | [optional] [readonly] |
| **name** | **String** |  | [optional] [readonly] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### OtaPackageType (enum)
`FIRMWARE` | `SOFTWARE`

#### ChecksumAlgorithm (enum)
`MD5` | `SHA256` | `SHA384` | `SHA512` | `CRC32` | `MURMUR3_32` | `MURMUR3_128`

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (46 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


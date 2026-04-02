
# VersionCreateRequest

`org.thingsboard.client.model.VersionCreateRequest`

Request for creating a version

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **versionName** | **String** |  | [optional] |
| **branch** | **String** |  | [optional] |
| **type** | **VersionCreateRequestType** | Type of the version to create | |



## Subtypes

#### ComplexVersionCreateRequest  *(type=`COMPLEX`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| syncStrategy | SyncStrategy |  | [optional] |
| entityTypes | Map<String, EntityTypeVersionCreateConfig> |  | [optional] |

#### SingleEntityVersionCreateRequest  *(type=`SINGLE_ENTITY`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| entityId | EntityId |  | [optional] |
| config | VersionCreateConfig |  | [optional] |

## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### VersionCreateRequestType (enum)
`SINGLE_ENTITY` | `COMPLEX`

#### SyncStrategy (enum)
`MERGE` | `OVERWRITE`

#### EntityTypeVersionCreateConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| saveRelations | Boolean |  | [optional] |
| saveAttributes | Boolean |  | [optional] |
| saveCredentials | Boolean |  | [optional] |
| saveCalculatedFields | Boolean |  | [optional] |
| savePermissions | Boolean |  | [optional] |
| saveGroupEntities | Boolean |  | [optional] |
| syncStrategy | SyncStrategy |  | [optional] |
| entityIds | List<UUID> |  | [optional] |
| allEntities | Boolean |  | [optional] |

#### VersionCreateConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| saveRelations | Boolean |  | [optional] |
| saveAttributes | Boolean |  | [optional] |
| saveCredentials | Boolean |  | [optional] |
| saveCalculatedFields | Boolean |  | [optional] |
| savePermissions | Boolean |  | [optional] |
| saveGroupEntities | Boolean |  | [optional] |

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (46 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


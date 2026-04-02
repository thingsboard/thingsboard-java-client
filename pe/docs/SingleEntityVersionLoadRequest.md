
# SingleEntityVersionLoadRequest

`org.thingsboard.client.model.SingleEntityVersionLoadRequest`

**Extends:** **VersionLoadRequest**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **internalEntityId** | **EntityId** |  | [optional] |
| **externalEntityId** | **EntityId** |  | [optional] |
| **config** | **VersionLoadConfig** |  | [optional] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### VersionLoadRequest
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| versionId | String |  | [optional] |
| type | VersionLoadRequestType | Type of the version to load |  |

#### EntityTypeVersionLoadRequest  *(extends VersionLoadRequest, type=`ENTITY_TYPE`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| entityTypes | Map<String, EntityTypeVersionLoadConfig> |  | [optional] |
| rollbackOnError | Boolean |  | [optional] |

#### VersionLoadConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| loadRelations | Boolean |  | [optional] |
| loadAttributes | Boolean |  | [optional] |
| loadCredentials | Boolean |  | [optional] |
| loadCalculatedFields | Boolean |  | [optional] |
| loadPermissions | Boolean |  | [optional] |
| loadGroupEntities | Boolean |  | [optional] |
| autoGenerateIntegrationKey | Boolean |  | [optional] |

#### VersionLoadRequestType (enum)
`SINGLE_ENTITY` | `ENTITY_TYPE`

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (46 values total)

#### EntityTypeVersionLoadConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| loadRelations | Boolean |  | [optional] |
| loadAttributes | Boolean |  | [optional] |
| loadCredentials | Boolean |  | [optional] |
| loadCalculatedFields | Boolean |  | [optional] |
| loadPermissions | Boolean |  | [optional] |
| loadGroupEntities | Boolean |  | [optional] |
| autoGenerateIntegrationKey | Boolean |  | [optional] |
| removeOtherEntities | Boolean |  | [optional] |
| findExistingEntityByName | Boolean |  | [optional] |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


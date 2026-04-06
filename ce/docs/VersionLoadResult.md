
# VersionLoadResult

`org.thingsboard.client.model.VersionLoadResult`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **result** | **List\<EntityTypeLoadResult\>** |  | [optional] |
| **error** | **EntityLoadError** |  | [optional] |
| **done** | **Boolean** |  | [optional] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `CalculatedFieldId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityViewId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### EntityTypeLoadResult
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| entityType | EntityType |  | [optional] |
| created | Integer |  | [optional] |
| updated | Integer |  | [optional] |
| deleted | Integer |  | [optional] |

#### EntityLoadError
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  | [optional] |
| source | EntityId |  | [optional] |
| target | EntityId |  | [optional] |
| message | String |  | [optional] |

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `RULE_CHAIN` | `RULE_NODE` | `ENTITY_VIEW` | … (36 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


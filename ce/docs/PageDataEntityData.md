
# PageDataEntityData

`org.thingsboard.client.model.PageDataEntityData`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **data** | **List\<EntityData\>** | Array of the entities | [optional] |
| **totalPages** | **Integer** | Total number of available pages. Calculated based on the 'pageSize' request parameter and total number of entities that match search criteria | [optional] [readonly] |
| **totalElements** | **Long** | Total number of elements in all available pages | [optional] [readonly] |
| **hasNext** | **Boolean** | 'false' value indicates the end of the result set | [optional] [readonly] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `CalculatedFieldId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityViewId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### EntityData
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| entityId | EntityId |  | [optional] |
| latest | Map<String, Map<String, TsValue>> |  | [optional] |
| timeseries | Map<String, List<TsValue>> |  | [optional] |
| aggLatest | Map<String, ComparisonTsValue> |  | [optional] |

#### TsValue
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| ts | Long |  | [optional] |
| value | String |  | [optional] |
| count | Long |  | [optional] |

#### ComparisonTsValue
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| current | TsValue |  | [optional] |
| previous | TsValue |  | [optional] |

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `RULE_CHAIN` | `RULE_NODE` | `ENTITY_VIEW` | … (36 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


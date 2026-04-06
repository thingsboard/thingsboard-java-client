
# PageDataEdgeEvent

`org.thingsboard.client.model.PageDataEdgeEvent`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **data** | **List\<EdgeEvent\>** | Array of the entities | [optional] |
| **totalPages** | **Integer** | Total number of available pages. Calculated based on the 'pageSize' request parameter and total number of entities that match search criteria | [optional] [readonly] |
| **totalElements** | **Long** | Total number of elements in all available pages | [optional] [readonly] |
| **hasNext** | **Boolean** | 'false' value indicates the end of the result set | [optional] [readonly] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `CalculatedFieldId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityViewId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### EdgeEvent
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | EdgeEventId |  | [optional] |
| createdTime | Long | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| seqId | Long |  | [optional] |
| tenantId | TenantId |  | [optional] |
| edgeId | EdgeId |  | [optional] |
| action | EdgeEventActionType |  | [optional] |
| entityId | UUID |  | [optional] |
| uid | String |  | [optional] |
| type | EdgeEventType |  | [optional] |
| body | com.fasterxml.jackson.databind.JsonNode |  | [optional] |

#### EdgeEventId
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | UUID | string |  |

#### EdgeEventActionType (enum)
`ADDED` | `UPDATED` | `DELETED` | `POST_ATTRIBUTES` | `ATTRIBUTES_UPDATED` | `ATTRIBUTES_DELETED` | `TIMESERIES_UPDATED` | `CREDENTIALS_UPDATED` | `ASSIGNED_TO_CUSTOMER` | `UNASSIGNED_FROM_CUSTOMER` | … (25 values total)

#### EdgeEventType (enum)
`DASHBOARD` | `ASSET` | `DEVICE` | `DEVICE_PROFILE` | `ASSET_PROFILE` | `ENTITY_VIEW` | `ALARM` | `ALARM_COMMENT` | `RULE_CHAIN` | `RULE_CHAIN_METADATA` | … (30 values total)

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `RULE_CHAIN` | `RULE_NODE` | `ENTITY_VIEW` | … (36 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


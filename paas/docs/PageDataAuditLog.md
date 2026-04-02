
# PageDataAuditLog

`org.thingsboard.client.model.PageDataAuditLog`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **data** | **List\<AuditLog\>** | Array of the entities | [optional] |
| **totalPages** | **Integer** | Total number of available pages. Calculated based on the 'pageSize' request parameter and total number of entities that match search criteria | [optional] [readonly] |
| **totalElements** | **Long** | Total number of elements in all available pages | [optional] [readonly] |
| **hasNext** | **Boolean** | 'false' value indicates the end of the result set | [optional] [readonly] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BillingCustomerId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CouponId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `ProductId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `SubscriptionAddonId`, `SubscriptionId`, `SubscriptionPlanId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### AuditLog
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | AuditLogId | JSON object with the auditLog Id | [optional] |
| createdTime | Long | Timestamp of the auditLog creation, in milliseconds | [optional] [readonly] |
| tenantId | TenantId | JSON object with Tenant Id | [optional] [readonly] |
| customerId | CustomerId | JSON object with Customer Id | [optional] [readonly] |
| entityId | EntityId | JSON object with Entity id | [optional] [readonly] |
| entityName | String | Name of the logged entity | [optional] [readonly] |
| userId | UserId | JSON object with User id. | [optional] [readonly] |
| userName | String | Unique user name(email) of the user that performed some action on logged entity | [optional] [readonly] |
| actionType | ActionType | String represented Action type | [optional] [readonly] |
| actionData | com.fasterxml.jackson.databind.JsonNode | JsonNode represented action data | [optional] [readonly] |
| actionStatus | ActionStatus | String represented Action status | [optional] [readonly] |
| actionFailureDetails | String | Failure action details info. An empty string in case of action status type 'SUCCESS', otherwise includes stack trace of the caused exception. | [optional] [readonly] |

#### AuditLogId
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | UUID | string |  |

#### ActionType (enum)
`ADDED` | `DELETED` | `UPDATED` | `ATTRIBUTES_UPDATED` | `ATTRIBUTES_DELETED` | `TIMESERIES_UPDATED` | `TIMESERIES_DELETED` | `RPC_CALL` | `CREDENTIALS_UPDATED` | `ASSIGNED_TO_CUSTOMER` | … (47 values total)

#### ActionStatus (enum)
`SUCCESS` | `FAILURE`

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (52 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


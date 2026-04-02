
# PageDataAlarmData

`org.thingsboard.client.model.PageDataAlarmData`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **data** | **List\<AlarmData\>** | Array of the entities | [optional] |
| **totalPages** | **Integer** | Total number of available pages. Calculated based on the 'pageSize' request parameter and total number of entities that match search criteria | [optional] [readonly] |
| **totalElements** | **Long** | Total number of elements in all available pages | [optional] [readonly] |
| **hasNext** | **Boolean** | 'false' value indicates the end of the result set | [optional] [readonly] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BillingCustomerId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CouponId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `ProductId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `SubscriptionAddonId`, `SubscriptionId`, `SubscriptionPlanId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### AlarmData
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | AlarmId | JSON object with the alarm Id. Specify this field to update the alarm. Referencing non-existing alarm Id will cause error. Omit this field to create new alarm. | [optional] |
| createdTime | Long | Timestamp of the alarm creation, in milliseconds | [optional] [readonly] |
| tenantId | TenantId | JSON object with Tenant Id | [optional] [readonly] |
| customerId | CustomerId | JSON object with Customer Id | [optional] [readonly] |
| type | String | representing type of the Alarm |  |
| originator | EntityId | JSON object with alarm originator id |  |
| severity | AlarmSeverity | Alarm severity |  |
| acknowledged | Boolean | Acknowledged |  |
| cleared | Boolean | Cleared |  |
| assigneeId | UserId | Alarm assignee user id | [optional] |
| startTs | Long | Timestamp of the alarm start time, in milliseconds | [optional] |
| endTs | Long | Timestamp of the alarm end time(last time update), in milliseconds | [optional] |
| ackTs | Long | Timestamp of the alarm acknowledgement, in milliseconds | [optional] |
| clearTs | Long | Timestamp of the alarm clearing, in milliseconds | [optional] |
| assignTs | Long | Timestamp of the alarm assignment, in milliseconds | [optional] |
| details | com.fasterxml.jackson.databind.JsonNode | JSON object with alarm details | [optional] |
| propagate | Boolean | Propagation flag to specify if alarm should be propagated to parent entities of alarm originator | [optional] |
| propagateToOwner | Boolean | Propagation flag to specify if alarm should be propagated to the owner (tenant or customer) of alarm originator | [optional] |
| propagateToOwnerHierarchy | Boolean | Propagation flag to specify if alarm should be propagated to the owner (tenant or customer) and all parent owners in the customer hierarchy | [optional] |
| propagateToTenant | Boolean | Propagation flag to specify if alarm should be propagated to the tenant entity | [optional] |
| propagateRelationTypes | List<String> | JSON array of relation types that should be used for propagation. By default, 'propagateRelationTypes' array is empty which means that the alarm will be propagated based on any relation type to parent entities. This parameter should be used only in case when 'propagate' parameter is set to true, otherwise, 'propagateRelationTypes' array will be ignored. | [optional] |
| originatorName | String | Alarm originator name | [optional] |
| originatorLabel | String | Alarm originator label | [optional] |
| originatorDisplayName | String | Originator display name | [optional] |
| assignee | AlarmAssignee | Alarm assignee | [optional] |
| entityId | EntityId |  | [optional] |
| latest | Map<String, Map<String, TsValue>> |  | [optional] |
| name | String | representing type of the Alarm | [readonly] |
| status | AlarmStatus | status of the Alarm | [readonly] |

#### AlarmSeverity (enum)
`CRITICAL` | `MAJOR` | `MINOR` | `WARNING` | `INDETERMINATE`

#### AlarmAssignee
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | UserId |  | [optional] |
| firstName | String |  | [optional] |
| lastName | String |  | [optional] |
| email | String |  | [optional] |

#### TsValue
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| ts | Long |  | [optional] |
| value | String |  | [optional] |
| count | Long |  | [optional] |

#### AlarmStatus (enum)
`ACTIVE_UNACK` | `ACTIVE_ACK` | `CLEARED_UNACK` | `CLEARED_ACK`

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (52 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


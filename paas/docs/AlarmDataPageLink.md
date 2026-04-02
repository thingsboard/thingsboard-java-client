
# AlarmDataPageLink

`org.thingsboard.client.model.AlarmDataPageLink`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **pageSize** | **Integer** |  | [optional] |
| **page** | **Integer** |  | [optional] |
| **textSearch** | **String** |  | [optional] |
| **sortOrder** | **EntityDataSortOrder** |  | [optional] |
| **dynamic** | **Boolean** |  | [optional] |
| **startTs** | **Long** |  | [optional] |
| **endTs** | **Long** |  | [optional] |
| **timeWindow** | **Long** |  | [optional] |
| **typeList** | **List\<String\>** |  | [optional] |
| **statusList** | **List\<AlarmSearchStatus\>** |  | [optional] |
| **severityList** | **List\<AlarmSeverity\>** |  | [optional] |
| **searchPropagatedAlarms** | **Boolean** |  | [optional] |
| **assigneeId** | **UserId** |  | [optional] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BillingCustomerId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CouponId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `ProductId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `SubscriptionAddonId`, `SubscriptionId`, `SubscriptionPlanId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### EntityDataSortOrder
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| key | EntityKey |  | [optional] |
| direction | Direction |  | [optional] |

#### AlarmSearchStatus (enum)
`ANY` | `ACTIVE` | `CLEARED` | `ACK` | `UNACK`

#### AlarmSeverity (enum)
`CRITICAL` | `MAJOR` | `MINOR` | `WARNING` | `INDETERMINATE`

#### EntityKey
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | EntityKeyType |  | [optional] |
| key | String |  | [optional] |

#### Direction (enum)
`ASC` | `DESC`

#### EntityKeyType (enum)
`ATTRIBUTE` | `CLIENT_ATTRIBUTE` | `SHARED_ATTRIBUTE` | `SERVER_ATTRIBUTE` | `TIME_SERIES` | `ENTITY_FIELD` | `ALARM_FIELD`

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (52 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


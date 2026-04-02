
# MergedUserPermissions

`org.thingsboard.client.model.MergedUserPermissions`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **genericPermissions** | **Map\<String, Set<Operation>\>** | Map of permissions defined using generic roles ('Customer Administrator', etc) | [optional] |
| **groupPermissions** | **Map\<String, MergedGroupPermissionInfo\>** | Map of permissions defined using group roles ('Read' or 'Write' access to specific entity group, etc) | [optional] |
| **readGroupPermissions** | **Map\<String, MergedGroupTypePermissionInfo\>** | Map of read permissions per entity type. Used on the UI to enable/disable certain components. | [optional] |
| **readEntityPermissions** | **Map\<String, MergedGroupTypePermissionInfo\>** | Map of read permissions per resource. Used on the UI to enable/disable certain components. | [optional] |
| **readAttrPermissions** | **Map\<String, MergedGroupTypePermissionInfo\>** | Map of read entity attributes permissions per resource. Used on the UI to enable/disable certain tabs. | [optional] |
| **readTsPermissions** | **Map\<String, MergedGroupTypePermissionInfo\>** | Map of read entity time-series permissions per resource. Used on the UI to enable/disable certain tabs. | [optional] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BillingCustomerId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CouponId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `ProductId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `SubscriptionAddonId`, `SubscriptionId`, `SubscriptionPlanId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### Operation (enum)
`ALL` | `CREATE` | `READ` | `WRITE` | `DELETE` | `RPC_CALL` | `READ_CREDENTIALS` | `WRITE_CREDENTIALS` | `READ_ATTRIBUTES` | `WRITE_ATTRIBUTES` | … (21 values total)

#### MergedGroupPermissionInfo
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| entityType | EntityType |  | [optional] |
| operations | Set<Operation> |  | [optional] |

#### MergedGroupTypePermissionInfo
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| entityGroupIds | List<EntityGroupId> | List of Entity Groups in case of group roles are assigned to the user (user group) | [optional] |
| hasGenericRead | Boolean | Indicates if generic permission assigned to the user group. | [optional] |

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (52 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


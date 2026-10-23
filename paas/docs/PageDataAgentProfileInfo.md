
# PageDataAgentProfileInfo

`org.thingsboard.client.model.PageDataAgentProfileInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **data** | **List\<AgentProfileInfo\>** | Array of the entities | [optional] |
| **totalPages** | **Integer** | Total number of available pages. Calculated based on the 'pageSize' request parameter and total number of entities that match search criteria | [optional] [readonly] |
| **totalElements** | **Long** | Total number of elements in all available pages | [optional] [readonly] |
| **hasNext** | **Boolean** | 'false' value indicates the end of the result set | [optional] [readonly] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AgentAppEventId`, `AgentAppProfileId`, `AgentAppUnitId`, `AgentApplicationId`, `AgentBulkActionId`, `AgentId`, `AgentProfileId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BillingCustomerId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CouponId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `ProductId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `SubscriptionAddonId`, `SubscriptionId`, `SubscriptionPlanId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### AgentProfileInfo
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | AgentProfileId | JSON object with the Agent Profile Id. | [optional] |
| createdTime | Long | Timestamp of the profile creation, in milliseconds | [optional] [readonly] |
| tenantId | TenantId | JSON object with Tenant Id. | [optional] [readonly] |
| name | String | Unique profile name within tenant |  |
| description | String | Profile description | [optional] |
| provisionKey | String | Provision key for future auto-provisioning | [optional] |
| provisionSecret | String | Provision secret for future auto-provisioning | [optional] |
| provisionType | AgentProvisionType | Provisioning strategy. DISABLED by default. | [optional] |
| version | Long |  | [optional] |
| _default | Boolean | Used to mark the default profile that will be assigned to agents when no profile is specified. | [optional] |

#### AgentProvisionType (enum)
`DISABLED` | `NO_AUTO_INSTALL` | `AUTO_INSTALL_PER_APP_TYPE` | `AUTO_INSTALL_PER_APP_PROFILE`

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (59 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


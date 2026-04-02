
# ShareGroupRequest

`org.thingsboard.client.model.ShareGroupRequest`

The Share Group Request JSON

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **ownerId** | **EntityId** | In case 'allUserGroup' is set to true, this property specifies the owner of the user group 'All'. Either Tenant or Customer Id. | [optional] |
| **allUserGroup** | **Boolean** | Indicate that the group should be shared with user group 'All' that belongs to Tenant or Customer (see 'ownerId' property description). | |
| **userGroupId** | **EntityGroupId** | In case 'allUserGroup' is set to false, this property specifies the specific user group that the entity group should be shared with. | [optional] |
| **readElseWrite** | **Boolean** | Used if 'roleIds' property is not present. if the value is 'true', creates role with read-only permissions. If the value is 'false', creates role with write permissions. | [optional] |
| **roleIds** | **List\<RoleId\>** | List of group role Ids that should be used to share the entity group with the user group. If not set, the platform will create new role (see 'readElseWrite' property description) | [optional] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (46 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


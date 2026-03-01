
# GroupPermissionInfo

`org.thingsboard.client.model.GroupPermissionInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **GroupPermissionId** | JSON object with the Group Permission Id. Specify this field to update the Group Permission. Referencing non-existing Group Permission Id will cause error. Omit this field to create new Group Permission. | [optional] |
| **createdTime** | **Long** | Timestamp of the group permission creation, in milliseconds | [optional] [readonly] |
| **tenantId** | **TenantId** | JSON object with the Tenant Id. | [optional] [readonly] |
| **userGroupId** | **EntityGroupId** | JSON object with the User Group Id. Represent user group that will have permissions to perform operations against corresponding Entity Group. | [optional] |
| **roleId** | **RoleId** | JSON object with the Role Id. Represent set of permissions. | [optional] |
| **entityGroupId** | **EntityGroupId** | JSON object with the Entity Group Id. Represent entity (device, asset, etc.) group. | [optional] |
| **entityGroupType** | **EntityType** | Type of the entities in the group: DEVICE, ASSET, CUSTOMER, etc. | [optional] |
| **role** | **Role** | Represent set of permissions. | [optional] |
| **entityGroupName** | **String** | Entity Group Name. | [optional] |
| **entityGroupOwnerId** | **EntityId** | Entity Group Owner Id (Tenant or Customer). | [optional] |
| **entityGroupOwnerName** | **String** | Name of the entity group owner (Tenant or Customer title). | [optional] |
| **userGroupName** | **String** | User Group Name. | [optional] |
| **userGroupOwnerId** | **EntityId** | User Group Owner Id (Tenant or Customer). | [optional] |
| **userGroupOwnerName** | **String** | Name of the user group owner (Tenant or Customer title). | [optional] |
| **readOnly** | **Boolean** |  | [optional] |
| **name** | **String** | Name of the Group Permissions. Auto-generated | [optional] [readonly] |
| **_public** | **Boolean** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


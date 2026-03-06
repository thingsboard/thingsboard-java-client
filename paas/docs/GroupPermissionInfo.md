
# GroupPermissionInfo

`org.thingsboard.client.model.GroupPermissionInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **GroupPermissionId** | JSON object with the Group Permission Id. Specify this field to update the Group Permission. Referencing non-existing Group Permission Id will cause error. Omit this field to create new Group Permission. | [optional] |
| **createdTime** | **Long** | Timestamp of the group permission creation, in milliseconds | [optional] [readonly] |
| **tenantId** | **TenantId** | JSON object with the Tenant Id. | [optional] [readonly] |
| **userGroupId** | **EntityGroupId** | JSON object with the User Group Id. Represents the user group that will have permissions to perform operations against the corresponding entity group. | |
| **roleId** | **RoleId** | JSON object with the Role Id. Represents the set of permissions. The role type (GENERIC or GROUP) determines whether 'entityGroupId' is required. | |
| **entityGroupId** | **EntityGroupId** | JSON object with the Entity Group Id. Required when using a GROUP role — specifies the entity group to which the permissions apply. Must be null or omitted when using a GENERIC role. | [optional] |
| **entityGroupType** | **EntityType** | Type of the entities in the group: DEVICE, ASSET, CUSTOMER, etc. Auto-populated from the referenced entity group. Null for generic permissions. | [optional] [readonly] |
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




# GroupPermission

A JSON value representing the group permission.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tenantId** | [**TenantId**](TenantId.md) | JSON object with the Tenant Id. |  [optional] [readonly] |
|**userGroupId** | [**EntityGroupId**](EntityGroupId.md) | JSON object with the User Group Id. Represent user group that will have permissions to perform operations against corresponding Entity Group. |  [optional] |
|**roleId** | [**RoleId**](RoleId.md) | JSON object with the Role Id. Represent set of permissions. |  [optional] |
|**entityGroupId** | [**EntityGroupId**](EntityGroupId.md) | JSON object with the Entity Group Id. Represent entity (device, asset, etc.) group. |  [optional] |
|**entityGroupType** | **EntityType** | Type of the entities in the group: DEVICE, ASSET, CUSTOMER, etc. |  [optional] |
|**isPublic** | **Boolean** |  |  [optional] |
|**id** | [**GroupPermissionId**](GroupPermissionId.md) | JSON object with the Group Permission Id. Specify this field to update the Group Permission. Referencing non-existing Group Permission Id will cause error. Omit this field to create new Group Permission. |  [optional] |
|**createdTime** | **Long** | Timestamp of the group permission creation, in milliseconds |  [optional] [readonly] |
|**name** | **String** | Name of the Group Permissions. Auto-generated |  [optional] [readonly] |
|**_public** | **Boolean** |  |  [optional] |




# UserPermissionsControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllowedPermissions**](#getAllowedPermissions) | **GET** /api/permissions/allowedPermissions | Get Permissions (getAllowedPermissions) |
| [**hasEntityPermission**](#hasEntityPermission) | **GET** /api/permission/{entityType}/{entityId}/{operation} | Check permission for specified entity (hasEntityPermission) |



## getAllowedPermissions

> AllowedPermissionsInfo getAllowedPermissions()

Get Permissions (getAllowedPermissions)

Returns a complex object that describes:   * all possible (both granted and not granted) permissions for the authority of the user (Tenant or Customer);  * all granted permissions for the user;   The result impacts UI behavior and hides certain UI elements if user has no permissions to invoke the related operations. Nevertheless, all API calls check the permissions each time they are executed on the server side.You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.    Security check is performed to verify that the user has 'READ' permission for the entity (entities).

### Return type

**AllowedPermissionsInfo**


## hasEntityPermission

> Boolean hasEntityPermission(entityType, entityId, operation)

Check permission for specified entity (hasEntityPermission)

Returns true if the user has permission to perform the operation, and false otherwise. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **entityId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **operation** | **String** | A string value representing permission operation. For example, 'READ', 'WRITE', 'DELETE', 'CREATE', 'ALL' | [enum: ALL, CREATE, READ, WRITE, DELETE, RPC_CALL, READ_CREDENTIALS, WRITE_CREDENTIALS, READ_ATTRIBUTES, WRITE_ATTRIBUTES, READ_TELEMETRY, WRITE_TELEMETRY, ADD_TO_GROUP, REMOVE_FROM_GROUP, CHANGE_OWNER, IMPERSONATE, CLAIM_DEVICES, SHARE_GROUP, ASSIGN_TO_TENANT, READ_CALCULATED_FIELD, WRITE_CALCULATED_FIELD] |

### Return type

**Boolean**


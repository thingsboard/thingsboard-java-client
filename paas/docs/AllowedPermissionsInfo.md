

# AllowedPermissionsInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operationsByResource** | **Map&lt;String, Set&lt;Operation&gt;&gt;** | Static map (vocabulary) of allowed operations by resource type |  [optional] |
|**allowedForGroupRoleOperations** | **Set&lt;Operation&gt;** | Static set (vocabulary) of allowed operations for group roles |  [optional] |
|**allowedForGroupOwnerOnlyOperations** | **Set&lt;Operation&gt;** | Static set (vocabulary) of allowed operations for group owner |  [optional] |
|**allowedForGroupOwnerOnlyGroupOperations** | **Set&lt;Operation&gt;** | Static set (vocabulary) of allowed group operations for group owner |  [optional] |
|**allowedResources** | **Set&lt;Resource&gt;** | Static set (vocabulary) of all possibly allowed resources. Static and depends only on the authority of the user |  [optional] |
|**userPermissions** | [**MergedUserPermissions**](MergedUserPermissions.md) | JSON object with merged permission for all generic and group roles assigned to all user groups the user belongs to |  [optional] |
|**userOwnerId** | [**EntityId**](EntityId.md) | Owner Id of the user (Tenant or Customer) |  [optional] |




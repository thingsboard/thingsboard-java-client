
# AllowedPermissionsInfo

`org.thingsboard.client.model.AllowedPermissionsInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **operationsByResource** | **Map\<String, Set<Operation>\>** | Static map (vocabulary) of allowed operations by resource type | [optional] |
| **allowedForGroupRoleOperations** | **Set\<Operation\>** | Static set (vocabulary) of allowed operations for group roles | [optional] |
| **allowedForGroupOwnerOnlyOperations** | **Set\<Operation\>** | Static set (vocabulary) of allowed operations for group owner | [optional] |
| **allowedForGroupOwnerOnlyGroupOperations** | **Set\<Operation\>** | Static set (vocabulary) of allowed group operations for group owner | [optional] |
| **allowedResources** | **Set\<Resource\>** | Static set (vocabulary) of all possibly allowed resources. Static and depends only on the authority of the user | [optional] |
| **userPermissions** | **MergedUserPermissions** | JSON object with merged permission for all generic and group roles assigned to all user groups the user belongs to | [optional] |
| **userOwnerId** | **EntityId** | Owner Id of the user (Tenant or Customer) | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


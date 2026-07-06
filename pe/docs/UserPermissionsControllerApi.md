# UserPermissionsControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
AllowedPermissionsInfo getAllowedPermissions() // Get Permissions (getAllowedPermissions)
Boolean hasEntityPermission(HasEntityPermissionArgs args) // Check permission for specified entity (hasEntityPermission)
```


## getAllowedPermissions

**GET** `/api/permissions/allowedPermissions`

Get Permissions (getAllowedPermissions)

Returns a complex object that describes:   * all possible (both granted and not granted) permissions for the authority of the user (Tenant or Customer);  * all granted permissions for the user;   The result impacts UI behavior and hides certain UI elements if user has no permissions to invoke the related operations. Nevertheless, all API calls check the permissions each time they are executed on the server side.You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.    Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
AllowedPermissionsInfo getAllowedPermissions()
```

### Return type

`AllowedPermissionsInfo`


## hasEntityPermission

**GET** `/api/permission/{entityType}/{entityId}/{operation}`

Check permission for specified entity (hasEntityPermission)

Returns true if the user has permission to perform the operation, and false otherwise. 

```java
Boolean hasEntityPermission(HasEntityPermissionArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
HasEntityPermissionArgs.builder()
        .entityType(String)
        .entityId(String)
        .operation(String)
        .build()
```

### `HasEntityPermissionArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `entityId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `operation` | `String` | **yes** | A string value representing permission operation. For example, 'READ', 'WRITE', 'DELETE', 'CREATE', 'ALL' | enum: `ALL`, `CREATE`, `READ`, `WRITE`, `DELETE`, `RPC_CALL`, `READ_CREDENTIALS`, `WRITE_CREDENTIALS`, `READ_ATTRIBUTES`, `WRITE_ATTRIBUTES`, `READ_TELEMETRY`, `WRITE_TELEMETRY`, `ADD_TO_GROUP`, `REMOVE_FROM_GROUP`, `CHANGE_OWNER`, `IMPERSONATE`, `CLAIM_DEVICES`, `SHARE_GROUP`, `ASSIGN_TO_TENANT`, `READ_CALCULATED_FIELD`, `WRITE_CALCULATED_FIELD` |

### Return type

`Boolean`


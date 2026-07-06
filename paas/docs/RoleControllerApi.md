# RoleControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void deleteRole(DeleteRoleArgs args) // Delete role (deleteRole)
Role getRoleById(GetRoleByIdArgs args) // Get Role by Id (getRoleById)
PageDataRole getRoles(GetRolesArgs args) // Get Roles (getRoles)
List<Role> getRolesByIds(GetRolesByIdsArgs args) // Get Roles By Ids (getRolesByIds)
Role saveRole(SaveRoleArgs args) // Create Or Update Role (saveRole)
```


## deleteRole

**DELETE** `/api/role/{roleId}`

Delete role (deleteRole)

Deletes the role. Referencing non-existing role Id will cause an error.   Security check is performed to verify that the user has 'DELETE' permission for the entity (entities).

```java
void deleteRole(DeleteRoleArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteRoleArgs.builder()
        .roleId(String)
        .build()
```

### `DeleteRoleArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `roleId` | `String` | **yes** | A string value representing the role id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## getRoleById

**GET** `/api/role/{roleId}`

Get Role by Id (getRoleById)

Fetch the Role object based on the provided Role Id. Role Contains a set of permissions. Role has two types. Generic Role may be assigned to the user group and will provide permissions for all entities of a certain type. Group Role may be assigned to both user and entity group and will provides permissions only for the entities that belong to specified entity group. The assignment of the Role to the User Group is done using [Group Permission Controller](/swagger-ui.html#/group-permission-controller). Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
Role getRoleById(GetRoleByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetRoleByIdArgs.builder()
        .roleId(String)
        .build()
```

### `GetRoleByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `roleId` | `String` | **yes** | A string value representing the role id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Role`


## getRoles

**GET** `/api/roles`

Get Roles (getRoles)

Returns a page of roles that are available for the current user. Role Contains a set of permissions. Role has two types. Generic Role may be assigned to the user group and will provide permissions for all entities of a certain type. Group Role may be assigned to both user and entity group and will provides permissions only for the entities that belong to specified entity group. The assignment of the Role to the User Group is done using [Group Permission Controller](/swagger-ui.html#/group-permission-controller).You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
PageDataRole getRoles(GetRolesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetRolesArgs.builder()
        .pageSize(String)
        .page(String)
        .build()
```

### `GetRolesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `String` | **yes** | Maximum amount of entities in a one page | |
| `page` | `String` | **yes** | Sequence number of page starting from 0 | |
| `type` | `String` | no | Type of the role | enum: `GENERIC`, `GROUP` |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the role name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `type`, `description` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataRole`


## getRolesByIds

**GET** `/api/roles/list`

Get Roles By Ids (getRolesByIds)

Returns the list of rows based on their ids.    Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
List<Role> getRolesByIds(GetRolesByIdsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetRolesByIdsArgs.builder()
        .roleIds(List<String>)
        .build()
```

### `GetRolesByIdsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `roleIds` | `List<String>` | **yes** | A list of role ids, separated by comma ',' | |

### Return type

`List<Role>`


## saveRole

**POST** `/api/role`

Create Or Update Role (saveRole)

Creates or Updates the Role. When creating Role, platform generates Role Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Role id will be present in the response. Specify existing Role id to update the permission. Referencing non-existing Group Permission Id will cause 'Not Found' error.  Role Contains a set of permissions. Role has two types. Generic Role may be assigned to the user group and will provide permissions for all entities of a certain type. Group Role may be assigned to both user and entity group and will provides permissions only for the entities that belong to specified entity group. The assignment of the Role to the User Group is done using [Group Permission Controller](/swagger-ui.html#/group-permission-controller).  Example of Generic Role with read-only permissions for any resource and all permissions for the 'DEVICE' and 'PROFILE' resources is listed below:   ```json {   \"name\": \"Read-Only User\",   \"type\": \"GENERIC\",   \"permissions\": {     \"ALL\": [       \"READ\",       \"RPC_CALL\",       \"READ_CREDENTIALS\",       \"READ_ATTRIBUTES\",       \"READ_TELEMETRY\"     ],     \"DEVICE\": [       \"ALL\"     ]     \"PROFILE\": [       \"ALL\"     ]   },   \"additionalInfo\": {     \"description\": \"Read-only permissions for everything, Write permissions for devices and own profile.\"   } } ```  Example of Group Role with read-only permissions. Note that the group role has no association with the resources. The type of the resource is taken from the entity group that this role is assigned to:   ```json {   \"name\": \"Entity Group Read-only User\",   \"type\": \"GROUP\",   \"permissions\": [     \"READ\",     \"RPC_CALL\",     \"READ_CREDENTIALS\",     \"READ_ATTRIBUTES\",     \"READ_TELEMETRY\"   ],   \"additionalInfo\": {     \"description\": \"Read-only permissions.\"   } } ```   Security check is performed to verify that the user has 'WRITE' permission for the entity (entities).

```java
Role saveRole(SaveRoleArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveRoleArgs.builder()
        .role(Role)
        .build()
```

### `SaveRoleArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `role` | `Role` | **yes** |  | |

### Return type

`Role`


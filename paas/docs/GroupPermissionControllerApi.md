# GroupPermissionControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void deleteGroupPermission(DeleteGroupPermissionArgs args) // Delete group permission (deleteGroupPermission)
List<GroupPermissionInfo> getEntityGroupPermissions(GetEntityGroupPermissionsArgs args) // Get group permissions by Entity Group Id (getEntityGroupPermissions)
GroupPermission getGroupPermissionById(GetGroupPermissionByIdArgs args) // Get Group Permission (getGroupPermissionById)
GroupPermissionInfo getGroupPermissionInfoById(GetGroupPermissionInfoByIdArgs args) // Get Group Permission Info (getGroupPermissionInfoById)
List<GroupPermissionInfo> getUserGroupPermissions(GetUserGroupPermissionsArgs args) // Get group permissions by User Group Id (getUserGroupPermissions)
List<GroupPermissionInfo> loadUserGroupPermissionInfos(LoadUserGroupPermissionInfosArgs args) // Load User Group Permissions (loadUserGroupPermissionInfos)
GroupPermission saveGroupPermission(SaveGroupPermissionArgs args) // Create Or Update Group Permission (saveGroupPermission)
```


## deleteGroupPermission

**DELETE** `/api/groupPermission/{groupPermissionId}`

Delete group permission (deleteGroupPermission)

Deletes the group permission. Referencing non-existing group permission Id will cause an error.   Security check is performed to verify that the user has 'DELETE' permission for the entity (entities).

```java
void deleteGroupPermission(DeleteGroupPermissionArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteGroupPermissionArgs.builder()
        .groupPermissionId(String)
        .build()
```

### `DeleteGroupPermissionArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `groupPermissionId` | `String` | **yes** | A string value representing the group permission id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## getEntityGroupPermissions

**GET** `/api/entityGroup/{entityGroupId}/groupPermissions`

Get group permissions by Entity Group Id (getEntityGroupPermissions)

Returns a list of group permission objects that is assigned for the specified Entity Group Id. Group permission entity represents list of allowed operations for certain User Group to perform against certain Entity Group. Basically, this entity wires three other entities:    * Role that defines set of allowed operations;  * User Group that defines set of users who may perform the operations;   * Entity Group that defines set of entities which will be accessible to users;  There are two types of group permissions depending on the Role type:    * **Generic permission** — uses a GENERIC role. The 'entityGroupId' field must be null (or omitted). Grants the role's operations to all entities within the owner's scope (all tenant entities for tenant admins, only customer-owned entities for customer users).  * **Group permission** — uses a GROUP role. The 'entityGroupId' field must reference a valid entity group. Grants the role's operations only to entities in the specified group.  Assigning a GENERIC role with a non-null 'entityGroupId' will cause an error. The 'entityGroupType' field is auto-populated from the referenced entity group and should not be set manually. Duplicate permissions (same userGroupId + roleId + entityGroupId combination) are rejected.   Group Permission Info object extends the Group Permissions with the full information about Role and User and/or Entity Groups.    Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
List<GroupPermissionInfo> getEntityGroupPermissions(GetEntityGroupPermissionsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetEntityGroupPermissionsArgs.builder()
        .entityGroupId(String)
        .build()
```

### `GetEntityGroupPermissionsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityGroupId` | `String` | **yes** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`List<GroupPermissionInfo>`


## getGroupPermissionById

**GET** `/api/groupPermission/{groupPermissionId}`

Get Group Permission (getGroupPermissionById)

Fetch the Group Permission object based on the provided Group Permission Id. Group permission entity represents list of allowed operations for certain User Group to perform against certain Entity Group. Basically, this entity wires three other entities:    * Role that defines set of allowed operations;  * User Group that defines set of users who may perform the operations;   * Entity Group that defines set of entities which will be accessible to users;  There are two types of group permissions depending on the Role type:    * **Generic permission** — uses a GENERIC role. The 'entityGroupId' field must be null (or omitted). Grants the role's operations to all entities within the owner's scope (all tenant entities for tenant admins, only customer-owned entities for customer users).  * **Group permission** — uses a GROUP role. The 'entityGroupId' field must reference a valid entity group. Grants the role's operations only to entities in the specified group.  Assigning a GENERIC role with a non-null 'entityGroupId' will cause an error. The 'entityGroupType' field is auto-populated from the referenced entity group and should not be set manually. Duplicate permissions (same userGroupId + roleId + entityGroupId combination) are rejected.   Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
GroupPermission getGroupPermissionById(GetGroupPermissionByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetGroupPermissionByIdArgs.builder()
        .groupPermissionId(String)
        .build()
```

### `GetGroupPermissionByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `groupPermissionId` | `String` | **yes** | A string value representing the group permission id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`GroupPermission`


## getGroupPermissionInfoById

**GET** `/api/groupPermission/info/{groupPermissionId}`

Get Group Permission Info (getGroupPermissionInfoById)

Fetch the Group Permission Info object based on the provided Group Permission Id and the flag that controls what additional information to load: User or Entity Group. Group permission entity represents list of allowed operations for certain User Group to perform against certain Entity Group. Basically, this entity wires three other entities:    * Role that defines set of allowed operations;  * User Group that defines set of users who may perform the operations;   * Entity Group that defines set of entities which will be accessible to users;  There are two types of group permissions depending on the Role type:    * **Generic permission** — uses a GENERIC role. The 'entityGroupId' field must be null (or omitted). Grants the role's operations to all entities within the owner's scope (all tenant entities for tenant admins, only customer-owned entities for customer users).  * **Group permission** — uses a GROUP role. The 'entityGroupId' field must reference a valid entity group. Grants the role's operations only to entities in the specified group.  Assigning a GENERIC role with a non-null 'entityGroupId' will cause an error. The 'entityGroupType' field is auto-populated from the referenced entity group and should not be set manually. Duplicate permissions (same userGroupId + roleId + entityGroupId combination) are rejected.   Group Permission Info object extends the Group Permissions with the full information about Role and User and/or Entity Groups.  Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
GroupPermissionInfo getGroupPermissionInfoById(GetGroupPermissionInfoByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetGroupPermissionInfoByIdArgs.builder()
        .groupPermissionId(String)
        .isUserGroup(Boolean)
        .build()
```

### `GetGroupPermissionInfoByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `groupPermissionId` | `String` | **yes** | A string value representing the group permission id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `isUserGroup` | `Boolean` | **yes** | Load additional information about User('true') or Entity Group('false). | |

### Return type

`GroupPermissionInfo`


## getUserGroupPermissions

**GET** `/api/userGroup/{userGroupId}/groupPermissions`

Get group permissions by User Group Id (getUserGroupPermissions)

Returns a list of group permission objects that belongs to specified User Group Id. Group permission entity represents list of allowed operations for certain User Group to perform against certain Entity Group. Basically, this entity wires three other entities:    * Role that defines set of allowed operations;  * User Group that defines set of users who may perform the operations;   * Entity Group that defines set of entities which will be accessible to users;  There are two types of group permissions depending on the Role type:    * **Generic permission** — uses a GENERIC role. The 'entityGroupId' field must be null (or omitted). Grants the role's operations to all entities within the owner's scope (all tenant entities for tenant admins, only customer-owned entities for customer users).  * **Group permission** — uses a GROUP role. The 'entityGroupId' field must reference a valid entity group. Grants the role's operations only to entities in the specified group.  Assigning a GENERIC role with a non-null 'entityGroupId' will cause an error. The 'entityGroupType' field is auto-populated from the referenced entity group and should not be set manually. Duplicate permissions (same userGroupId + roleId + entityGroupId combination) are rejected.   Group Permission Info object extends the Group Permissions with the full information about Role and User and/or Entity Groups.    Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
List<GroupPermissionInfo> getUserGroupPermissions(GetUserGroupPermissionsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetUserGroupPermissionsArgs.builder()
        .userGroupId(String)
        .build()
```

### `GetUserGroupPermissionsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `userGroupId` | `String` | **yes** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`List<GroupPermissionInfo>`


## loadUserGroupPermissionInfos

**POST** `/api/userGroup/groupPermissions/info`

Load User Group Permissions (loadUserGroupPermissionInfos)

Enrich a list of group permission objects with the information about Role, User and Entity Groups. Group permission entity represents list of allowed operations for certain User Group to perform against certain Entity Group. Basically, this entity wires three other entities:    * Role that defines set of allowed operations;  * User Group that defines set of users who may perform the operations;   * Entity Group that defines set of entities which will be accessible to users;  There are two types of group permissions depending on the Role type:    * **Generic permission** — uses a GENERIC role. The 'entityGroupId' field must be null (or omitted). Grants the role's operations to all entities within the owner's scope (all tenant entities for tenant admins, only customer-owned entities for customer users).  * **Group permission** — uses a GROUP role. The 'entityGroupId' field must reference a valid entity group. Grants the role's operations only to entities in the specified group.  Assigning a GENERIC role with a non-null 'entityGroupId' will cause an error. The 'entityGroupType' field is auto-populated from the referenced entity group and should not be set manually. Duplicate permissions (same userGroupId + roleId + entityGroupId combination) are rejected.   Group Permission Info object extends the Group Permissions with the full information about Role and User and/or Entity Groups.    Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
List<GroupPermissionInfo> loadUserGroupPermissionInfos(LoadUserGroupPermissionInfosArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
LoadUserGroupPermissionInfosArgs.builder()
        .groupPermission(List<GroupPermission>)
        .build()
```

### `LoadUserGroupPermissionInfosArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `groupPermission` | `List<GroupPermission>` | **yes** |  | |

### Return type

`List<GroupPermissionInfo>`


## saveGroupPermission

**POST** `/api/groupPermission`

Create Or Update Group Permission (saveGroupPermission)

Creates or Updates the Group Permission. When creating group permission, platform generates Group Permission Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Group Permission id will be present in the response. Specify existing Group Permission id to update the permission. Referencing non-existing Group Permission Id will cause 'Not Found' error.  Group permission entity represents list of allowed operations for certain User Group to perform against certain Entity Group. Basically, this entity wires three other entities:    * Role that defines set of allowed operations;  * User Group that defines set of users who may perform the operations;   * Entity Group that defines set of entities which will be accessible to users;  There are two types of group permissions depending on the Role type:    * **Generic permission** — uses a GENERIC role. The 'entityGroupId' field must be null (or omitted). Grants the role's operations to all entities within the owner's scope (all tenant entities for tenant admins, only customer-owned entities for customer users).  * **Group permission** — uses a GROUP role. The 'entityGroupId' field must reference a valid entity group. Grants the role's operations only to entities in the specified group.  Assigning a GENERIC role with a non-null 'entityGroupId' will cause an error. The 'entityGroupType' field is auto-populated from the referenced entity group and should not be set manually. Duplicate permissions (same userGroupId + roleId + entityGroupId combination) are rejected.   Security check is performed to verify that the user has 'WRITE' permission for the entity (entities).

```java
GroupPermission saveGroupPermission(SaveGroupPermissionArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveGroupPermissionArgs.builder()
        .groupPermission(GroupPermission)
        .build()
```

### `SaveGroupPermissionArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `groupPermission` | `GroupPermission` | **yes** |  | |

### Return type

`GroupPermission`


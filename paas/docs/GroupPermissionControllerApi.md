# GroupPermissionControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteGroupPermission**](#deleteGroupPermission) | **DELETE** /api/groupPermission/{groupPermissionId} | Delete group permission (deleteGroupPermission) |
| [**getEntityGroupPermissions**](#getEntityGroupPermissions) | **GET** /api/entityGroup/{entityGroupId}/groupPermissions | Get group permissions by Entity Group Id (getEntityGroupPermissions) |
| [**getGroupPermissionById**](#getGroupPermissionById) | **GET** /api/groupPermission/{groupPermissionId} | Get Group Permission (getGroupPermissionById) |
| [**getGroupPermissionInfoById**](#getGroupPermissionInfoById) | **GET** /api/groupPermission/info/{groupPermissionId} | Get Group Permission Info (getGroupPermissionInfoById) |
| [**getUserGroupPermissions**](#getUserGroupPermissions) | **GET** /api/userGroup/{userGroupId}/groupPermissions | Get group permissions by User Group Id (getUserGroupPermissions) |
| [**loadUserGroupPermissionInfos**](#loadUserGroupPermissionInfos) | **POST** /api/userGroup/groupPermissions/info | Load User Group Permissions (loadUserGroupPermissionInfos) |
| [**saveGroupPermission**](#saveGroupPermission) | **POST** /api/groupPermission | Create Or Update Group Permission (saveGroupPermission) |



## deleteGroupPermission

> deleteGroupPermission(groupPermissionId)

Delete group permission (deleteGroupPermission)

Deletes the group permission. Referencing non-existing group permission Id will cause an error.   Security check is performed to verify that the user has 'DELETE' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupPermissionId** | **String** | A string value representing the group permission id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## getEntityGroupPermissions

> List<GroupPermissionInfo> getEntityGroupPermissions(entityGroupId)

Get group permissions by Entity Group Id (getEntityGroupPermissions)

Returns a list of group permission objects that is assigned for the specified Entity Group Id. Group permission entity represents list of allowed operations for certain User Group to perform against certain Entity Group. Basically, this entity wires three other entities:    * Role that defines set of allowed operations;  * User Group that defines set of users who may perform the operations;   * Entity Group that defines set of entities which will be accessible to users;   Group Permission Info object extends the Group Permissions with the full information about Role and User and/or Entity Groups.    Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupId** | **String** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**List<GroupPermissionInfo>**


## getGroupPermissionById

> GroupPermission getGroupPermissionById(groupPermissionId)

Get Group Permission (getGroupPermissionById)

Fetch the Group Permission object based on the provided Group Permission Id. Group permission entity represents list of allowed operations for certain User Group to perform against certain Entity Group. Basically, this entity wires three other entities:    * Role that defines set of allowed operations;  * User Group that defines set of users who may perform the operations;   * Entity Group that defines set of entities which will be accessible to users;   Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupPermissionId** | **String** | A string value representing the group permission id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**GroupPermission**


## getGroupPermissionInfoById

> GroupPermissionInfo getGroupPermissionInfoById(groupPermissionId, isUserGroup)

Get Group Permission Info (getGroupPermissionInfoById)

Fetch the Group Permission Info object based on the provided Group Permission Id and the flag that controls what additional information to load: User or Entity Group. Group permission entity represents list of allowed operations for certain User Group to perform against certain Entity Group. Basically, this entity wires three other entities:    * Role that defines set of allowed operations;  * User Group that defines set of users who may perform the operations;   * Entity Group that defines set of entities which will be accessible to users;   Group Permission Info object extends the Group Permissions with the full information about Role and User and/or Entity Groups.  Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupPermissionId** | **String** | A string value representing the group permission id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **isUserGroup** | **Boolean** | Load additional information about User('true') or Entity Group('false). | |

### Return type

**GroupPermissionInfo**


## getUserGroupPermissions

> List<GroupPermissionInfo> getUserGroupPermissions(userGroupId)

Get group permissions by User Group Id (getUserGroupPermissions)

Returns a list of group permission objects that belongs to specified User Group Id. Group permission entity represents list of allowed operations for certain User Group to perform against certain Entity Group. Basically, this entity wires three other entities:    * Role that defines set of allowed operations;  * User Group that defines set of users who may perform the operations;   * Entity Group that defines set of entities which will be accessible to users;   Group Permission Info object extends the Group Permissions with the full information about Role and User and/or Entity Groups.    Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userGroupId** | **String** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**List<GroupPermissionInfo>**


## loadUserGroupPermissionInfos

> List<GroupPermissionInfo> loadUserGroupPermissionInfos(groupPermission)

Load User Group Permissions (loadUserGroupPermissionInfos)

Enrich a list of group permission objects with the information about Role, User and Entity Groups. Group permission entity represents list of allowed operations for certain User Group to perform against certain Entity Group. Basically, this entity wires three other entities:    * Role that defines set of allowed operations;  * User Group that defines set of users who may perform the operations;   * Entity Group that defines set of entities which will be accessible to users;   Group Permission Info object extends the Group Permissions with the full information about Role and User and/or Entity Groups.    Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupPermission** | **List<GroupPermission>** |  | |

### Return type

**List<GroupPermissionInfo>**


## saveGroupPermission

> GroupPermission saveGroupPermission(groupPermission)

Create Or Update Group Permission (saveGroupPermission)

Creates or Updates the Group Permission. When creating group permission, platform generates Group Permission Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Group Permission id will be present in the response. Specify existing Group Permission id to update the permission. Referencing non-existing Group Permission Id will cause 'Not Found' error.  Group permission entity represents list of allowed operations for certain User Group to perform against certain Entity Group. Basically, this entity wires three other entities:    * Role that defines set of allowed operations;  * User Group that defines set of users who may perform the operations;   * Entity Group that defines set of entities which will be accessible to users;   Security check is performed to verify that the user has 'WRITE' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupPermission** | **GroupPermission** |  | |

### Return type

**GroupPermission**


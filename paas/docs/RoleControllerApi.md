# RoleControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteRole**](#deleteRole) | **DELETE** /api/role/{roleId} | Delete role (deleteRole) |
| [**getRoleById**](#getRoleById) | **GET** /api/role/{roleId} | Get Role by Id (getRoleById) |
| [**getRoles**](#getRoles) | **GET** /api/roles | Get Roles (getRoles) |
| [**getRolesByIdsV2**](#getRolesByIdsV2) | **GET** /api/roles/list | Get Roles By Ids (getRolesByIdsV2) |
| [**saveRole**](#saveRole) | **POST** /api/role | Create Or Update Role (saveRole) |



## deleteRole

> deleteRole(roleId)

Delete role (deleteRole)

Deletes the role. Referencing non-existing role Id will cause an error.   Security check is performed to verify that the user has 'DELETE' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **roleId** | **String** | A string value representing the role id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## getRoleById

> Role getRoleById(roleId)

Get Role by Id (getRoleById)

Fetch the Role object based on the provided Role Id. Role Contains a set of permissions. Role has two types. Generic Role may be assigned to the user group and will provide permissions for all entities of a certain type. Group Role may be assigned to both user and entity group and will provides permissions only for the entities that belong to specified entity group. The assignment of the Role to the User Group is done using [Group Permission Controller](/swagger-ui.html#/group-permission-controller). Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **roleId** | **String** | A string value representing the role id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**Role**


## getRoles

> PageDataRole getRoles(pageSize, page, type, textSearch, sortProperty, sortOrder)

Get Roles (getRoles)

Returns a page of roles that are available for the current user. Role Contains a set of permissions. Role has two types. Generic Role may be assigned to the user group and will provide permissions for all entities of a certain type. Group Role may be assigned to both user and entity group and will provides permissions only for the entities that belong to specified entity group. The assignment of the Role to the User Group is done using [Group Permission Controller](/swagger-ui.html#/group-permission-controller).You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **String** | Maximum amount of entities in a one page | |
| **page** | **String** | Sequence number of page starting from 0 | |
| **type** | **String** | Type of the role | [optional] [enum: GENERIC, GROUP] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the role name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type, description] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataRole**


## getRolesByIdsV2

> List<Role> getRolesByIdsV2(roleIds)

Get Roles By Ids (getRolesByIdsV2)

Returns the list of rows based on their ids.    Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **roleIds** | **List<String>** | A list of role ids, separated by comma ',' | |

### Return type

**List<Role>**


## saveRole

> Role saveRole(role)

Create Or Update Role (saveRole)

Creates or Updates the Role. When creating Role, platform generates Role Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Role id will be present in the response. Specify existing Role id to update the permission. Referencing non-existing Group Permission Id will cause 'Not Found' error.  Role Contains a set of permissions. Role has two types. Generic Role may be assigned to the user group and will provide permissions for all entities of a certain type. Group Role may be assigned to both user and entity group and will provides permissions only for the entities that belong to specified entity group. The assignment of the Role to the User Group is done using [Group Permission Controller](/swagger-ui.html#/group-permission-controller).  Example of Generic Role with read-only permissions for any resource and all permissions for the 'DEVICE' and 'PROFILE' resources is listed below:   ```json {   \"name\": \"Read-Only User\",   \"type\": \"GENERIC\",   \"permissions\": {     \"ALL\": [       \"READ\",       \"RPC_CALL\",       \"READ_CREDENTIALS\",       \"READ_ATTRIBUTES\",       \"READ_TELEMETRY\"     ],     \"DEVICE\": [       \"ALL\"     ]     \"PROFILE\": [       \"ALL\"     ]   },   \"additionalInfo\": {     \"description\": \"Read-only permissions for everything, Write permissions for devices and own profile.\"   } } ```  Example of Group Role with read-only permissions. Note that the group role has no association with the resources. The type of the resource is taken from the entity group that this role is assigned to:   ```json {   \"name\": \"Entity Group Read-only User\",   \"type\": \"GROUP\",   \"permissions\": [     \"READ\",     \"RPC_CALL\",     \"READ_CREDENTIALS\",     \"READ_ATTRIBUTES\",     \"READ_TELEMETRY\"   ],   \"additionalInfo\": {     \"description\": \"Read-only permissions.\"   } } ```   Security check is performed to verify that the user has 'WRITE' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **role** | **Role** |  | |

### Return type

**Role**


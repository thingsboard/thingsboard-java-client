# CustomMenuControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCustomMenu**](#createCustomMenu) | **POST** /api/customMenu | Create Custom Menu (createCustomMenu) |
| [**deleteCustomMenu**](#deleteCustomMenu) | **DELETE** /api/customMenu/{customMenuId} | Delete custom menu (deleteCustomMenu) |
| [**getCustomMenu**](#getCustomMenu) | **GET** /api/customMenu | Get end-user Custom Menu configuration (getCustomMenu) |
| [**getCustomMenuAssigneeList**](#getCustomMenuAssigneeList) | **GET** /api/customMenu/{customMenuId}/assigneeList | Get Custom Menu assignee list (getCustomMenuAssigneeList) |
| [**getCustomMenuConfig**](#getCustomMenuConfig) | **GET** /api/customMenu/{customMenuId}/config | Get Custom Menu configuration by id (getCustomMenuConfig) |
| [**getCustomMenuInfoById**](#getCustomMenuInfoById) | **GET** /api/customMenu/{customMenuId}/info | Get Custom Menu Info (getCustomMenuInfoById) |
| [**getCustomMenuInfos**](#getCustomMenuInfos) | **GET** /api/customMenu/infos | Get all custom menus configured at user level (getCustomMenuInfos) |
| [**updateCustomMenuAssigneeList**](#updateCustomMenuAssigneeList) | **PUT** /api/customMenu/{id}/assign/{assigneeType} | Update custom menu assignee list (updateCustomMenuAssigneeList) |
| [**updateCustomMenuConfig**](#updateCustomMenuConfig) | **PUT** /api/customMenu/{customMenuId}/config | Update Custom Menu configuration based on the provided Custom Menu Id (updateCustomMenuConfig) |
| [**updateCustomMenuName**](#updateCustomMenuName) | **PUT** /api/customMenu/{customMenuId}/name | Update Custom Menu name based on the provided Custom Menu Id (updateCustomMenuName) |



## createCustomMenu

> CustomMenu createCustomMenu(customMenuInfo, assignToList, force)

Create Custom Menu (createCustomMenu)

The api is designed to create Custom Menu without configuration. Is not applicable for update.  Security check is performed to verify that the user has 'WRITE' permission for the custom menu with specified id.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customMenuInfo** | **CustomMenuInfo** |  | |
| **assignToList** | **List<String>** | A list of entity ids, separated by comma ',' | [optional] |
| **force** | **Boolean** | Use force if you want to create default menu that conflicts with the existing one (old one will be update NO_ASSIGN assignee type) | [optional] |

### Return type

**CustomMenu**


## deleteCustomMenu

> CustomMenuDeleteResult deleteCustomMenu(customMenuId, force)

Delete custom menu (deleteCustomMenu)

Deletes the custom menu based on the provided Custom Menu Id. Referencing non-existing custom menu Id will cause an error. If the custom menu is assigned to the list of users or customers bad request is returned.To delete a custom menu that has assignee list set 'force' request param to true 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customMenuId** | **UUID** | A string value representing the custom menu id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **force** | **Boolean** | Force set to true will unassign menu before deletion | [optional] |

### Return type

**CustomMenuDeleteResult**


## getCustomMenu

> getCustomMenu(ifNoneMatch)

Get end-user Custom Menu configuration (getCustomMenu)

Fetch the Custom Menu configuration object for the authorized user. The custom menu is configured in the white labeling parameters and has one of three user scopes:SYSTEM, TENANT, CUSTOMER and four assignee type: NO_ASSIGN, ALL, CUSTOMERS, USERS.There are three default (assignee type: ALL) menus configured on the system level for each scope and if no other menu is configured for user, system configuration of the corresponding scope will be applied.If a custom menu with assignee type ALL is configured on the tenant level, it overrides the menu configuration of the corresponding scope on the system level. If a custom menu with assignee type USER_GROUPS is configured on the tenant level, it overrides default tenant menu.If a custom menu with assignee type CUSTOMERS is configured on tenant level for specific customer, it will be applied to all customer users.If a custom menu with assignee type ALL is configured on the customer level, it overrides the menu assigned on tenant level.If a custom menu with assignee type USER_GROUPS is configured on the customer level, it overrides default customer menu.If a custom menu is assigned to specific user, it overrides all other configuration.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ifNoneMatch** | **String** |  | [optional] |

### Return type

null (empty response body)


## getCustomMenuAssigneeList

> List<EntityInfo> getCustomMenuAssigneeList(customMenuId)

Get Custom Menu assignee list (getCustomMenuAssigneeList)

Fetch the list of Entity Info objects that represents users or customers, or empty list if custom menu is not assigned or has NO_ASSIGN/ALL assignee type.  Security check is performed to verify that the user has 'READ' permission for the custom menu with specified id.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customMenuId** | **UUID** | A string value representing the custom menu id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**List<EntityInfo>**


## getCustomMenuConfig

> CustomMenuConfig getCustomMenuConfig(customMenuId)

Get Custom Menu configuration by id (getCustomMenuConfig)

Fetch the Custom Menu configuration based on the provided Custom Menu Id.   Security check is performed to verify that the user has 'READ' permission for the custom menu with specified id.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customMenuId** | **UUID** | A string value representing the custom menu id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**CustomMenuConfig**


## getCustomMenuInfoById

> CustomMenuInfo getCustomMenuInfoById(customMenuId)

Get Custom Menu Info (getCustomMenuInfoById)

Fetch the Custom Menu Info object based on the provided Custom Menu Id.   Security check is performed to verify that the user has 'READ' permission for the custom menu with specified id.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customMenuId** | **UUID** | A string value representing the custom menu id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**CustomMenuInfo**


## getCustomMenuInfos

> PageDataCustomMenuInfo getCustomMenuInfos(pageSize, page, scope, assigneeType, textSearch, sortProperty, sortOrder)

Get all custom menus configured at user level (getCustomMenuInfos)

Returns a page of custom menu info objects owned by the tenant or the customer of a current user, scope and assigneeType request parameters can be used to filter the result.  Security check is performed to verify that the user has 'READ' permission for the white labeling resource.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **scope** | **CMScope** | Custom menu scope. | [optional] [enum: SYSTEM, TENANT, CUSTOMER] |
| **assigneeType** | **CMAssigneeType** | Custom menu assignee type. | [optional] [enum: NO_ASSIGN, ALL, CUSTOMERS, USERS, USER_GROUPS] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the custom menu name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, title] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataCustomMenuInfo**


## updateCustomMenuAssigneeList

> updateCustomMenuAssigneeList(id, assigneeType, force, requestBody)

Update custom menu assignee list (updateCustomMenuAssigneeList)

The api designed to update the list of assignees or assignee type based on the provided Custom Menu Id. To change assignee type, put new assignee type in path parameter.  Security check is performed to verify that the user has 'WRITE' permission for the custom menu with specified id.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |
| **assigneeType** | **CMAssigneeType** |  | [enum: NO_ASSIGN, ALL, CUSTOMERS, USERS, USER_GROUPS] |
| **force** | **Boolean** | Use force if you want to override default menu | [optional] |
| **requestBody** | **List<String>** |  | [optional] |

### Return type

null (empty response body)


## updateCustomMenuConfig

> CustomMenu updateCustomMenuConfig(customMenuId, customMenuConfig)

Update Custom Menu configuration based on the provided Custom Menu Id (updateCustomMenuConfig)

  Security check is performed to verify that the user has 'WRITE' permission for the custom menu with specified id.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customMenuId** | **UUID** | A string value representing the custom menu id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **customMenuConfig** | **CustomMenuConfig** |  | |

### Return type

**CustomMenu**


## updateCustomMenuName

> updateCustomMenuName(customMenuId, body)

Update Custom Menu name based on the provided Custom Menu Id (updateCustomMenuName)

  Security check is performed to verify that the user has 'WRITE' permission for the custom menu with specified id.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customMenuId** | **UUID** | A string value representing the custom menu id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **body** | **String** |  | |

### Return type

null (empty response body)


# RoleControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteRole**](RoleControllerApi.md#deleteRole) | **DELETE** /api/role/{roleId} | Delete role (deleteRole) |
| [**getRoleById**](RoleControllerApi.md#getRoleById) | **GET** /api/role/{roleId} | Get Role by Id (getRoleById) |
| [**getRoles**](RoleControllerApi.md#getRoles) | **GET** /api/roles | Get Roles (getRoles) |
| [**getRolesByIdsV2**](RoleControllerApi.md#getRolesByIdsV2) | **GET** /api/roles/list | Get Roles By Ids (getRolesByIdsV2) |
| [**saveRole**](RoleControllerApi.md#saveRole) | **POST** /api/role | Create Or Update Role (saveRole) |



## deleteRole

> deleteRole(roleId)

Delete role (deleteRole)

Deletes the role. Referencing non-existing role Id will cause an error.   Security check is performed to verify that the user has &#39;DELETE&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **roleId** | **String**| A string value representing the role id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

null (empty response body)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getRoleById

> Role getRoleById(roleId)

Get Role by Id (getRoleById)

Fetch the Role object based on the provided Role Id. Role Contains a set of permissions. Role has two types. Generic Role may be assigned to the user group and will provide permissions for all entities of a certain type. Group Role may be assigned to both user and entity group and will provides permissions only for the entities that belong to specified entity group. The assignment of the Role to the User Group is done using [Group Permission Controller](/swagger-ui.html#/group-permission-controller). Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **roleId** | **String**| A string value representing the role id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**Role**](Role.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getRoles

> PageDataRole getRoles(pageSize, page, type, textSearch, sortProperty, sortOrder)

Get Roles (getRoles)

Returns a page of roles that are available for the current user. Role Contains a set of permissions. Role has two types. Generic Role may be assigned to the user group and will provide permissions for all entities of a certain type. Group Role may be assigned to both user and entity group and will provides permissions only for the entities that belong to specified entity group. The assignment of the Role to the User Group is done using [Group Permission Controller](/swagger-ui.html#/group-permission-controller).You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **String**| Maximum amount of entities in a one page | |
| **page** | **String**| Sequence number of page starting from 0 | |
| **type** | **String**| Type of the role | [optional] [enum: GENERIC, GROUP] |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the role name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, name, type, description] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataRole**](PageDataRole.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getRolesByIdsV2

> List&lt;Role&gt; getRolesByIdsV2(roleIds)

Get Roles By Ids (getRolesByIdsV2)

Returns the list of rows based on their ids.    Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **roleIds** | [**List&lt;String&gt;**](String.md)| A list of role ids, separated by comma &#39;,&#39; | |

### Return type

[**List&lt;Role&gt;**](Role.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## saveRole

> Role saveRole(role)

Create Or Update Role (saveRole)

Creates or Updates the Role. When creating Role, platform generates Role Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Role id will be present in the response. Specify existing Role id to update the permission. Referencing non-existing Group Permission Id will cause &#39;Not Found&#39; error.  Role Contains a set of permissions. Role has two types. Generic Role may be assigned to the user group and will provide permissions for all entities of a certain type. Group Role may be assigned to both user and entity group and will provides permissions only for the entities that belong to specified entity group. The assignment of the Role to the User Group is done using [Group Permission Controller](/swagger-ui.html#/group-permission-controller).  Example of Generic Role with read-only permissions for any resource and all permissions for the &#39;DEVICE&#39; and &#39;PROFILE&#39; resources is listed below:   &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;Read-Only User\&quot;,   \&quot;type\&quot;: \&quot;GENERIC\&quot;,   \&quot;permissions\&quot;: {     \&quot;ALL\&quot;: [       \&quot;READ\&quot;,       \&quot;RPC_CALL\&quot;,       \&quot;READ_CREDENTIALS\&quot;,       \&quot;READ_ATTRIBUTES\&quot;,       \&quot;READ_TELEMETRY\&quot;     ],     \&quot;DEVICE\&quot;: [       \&quot;ALL\&quot;     ]     \&quot;PROFILE\&quot;: [       \&quot;ALL\&quot;     ]   },   \&quot;additionalInfo\&quot;: {     \&quot;description\&quot;: \&quot;Read-only permissions for everything, Write permissions for devices and own profile.\&quot;   } } &#x60;&#x60;&#x60;  Example of Group Role with read-only permissions. Note that the group role has no association with the resources. The type of the resource is taken from the entity group that this role is assigned to:   &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;Entity Group Read-only User\&quot;,   \&quot;type\&quot;: \&quot;GROUP\&quot;,   \&quot;permissions\&quot;: [     \&quot;READ\&quot;,     \&quot;RPC_CALL\&quot;,     \&quot;READ_CREDENTIALS\&quot;,     \&quot;READ_ATTRIBUTES\&quot;,     \&quot;READ_TELEMETRY\&quot;   ],   \&quot;additionalInfo\&quot;: {     \&quot;description\&quot;: \&quot;Read-only permissions.\&quot;   } } &#x60;&#x60;&#x60;   Security check is performed to verify that the user has &#39;WRITE&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **role** | [**Role**](Role.md)|  | |

### Return type

[**Role**](Role.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


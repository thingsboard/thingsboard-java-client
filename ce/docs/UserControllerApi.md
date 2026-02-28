# UserControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteUser**](UserControllerApi.md#deleteUser) | **DELETE** /api/user/{userId} | Delete User (deleteUser) |
| [**deleteUserSettings**](UserControllerApi.md#deleteUserSettings) | **DELETE** /api/user/settings/{type}/{paths} | Delete user settings (deleteUserSettings) |
| [**deleteUserSettings1**](UserControllerApi.md#deleteUserSettings1) | **DELETE** /api/user/settings/{paths} | Delete user settings (deleteUserSettings) |
| [**findUsersByQuery**](UserControllerApi.md#findUsersByQuery) | **GET** /api/users/info | Find users by query (findUsersByQuery) |
| [**getActivationLink**](UserControllerApi.md#getActivationLink) | **GET** /api/user/{userId}/activationLink | Get activation link (getActivationLink) |
| [**getActivationLinkInfo**](UserControllerApi.md#getActivationLinkInfo) | **GET** /api/user/{userId}/activationLinkInfo | Get activation link info (getActivationLinkInfo) |
| [**getCustomerUsers**](UserControllerApi.md#getCustomerUsers) | **GET** /api/customer/{customerId}/users | Get Customer Users (getCustomerUsers) |
| [**getGeneralUserSettings**](UserControllerApi.md#getGeneralUserSettings) | **GET** /api/user/settings/general | Get user settings (getUserSettings) |
| [**getMobileSession**](UserControllerApi.md#getMobileSession) | **GET** /api/user/mobile/session | getMobileSession |
| [**getTenantAdmins**](UserControllerApi.md#getTenantAdmins) | **GET** /api/tenant/{tenantId}/users | Get Tenant Users (getTenantAdmins) |
| [**getUserById**](UserControllerApi.md#getUserById) | **GET** /api/user/{userId} | Get User (getUserById) |
| [**getUserDashboardsInfo**](UserControllerApi.md#getUserDashboardsInfo) | **GET** /api/user/dashboards | Get information about last visited and starred dashboards (getLastVisitedDashboards) |
| [**getUserSettings**](UserControllerApi.md#getUserSettings) | **GET** /api/user/settings/{type} | Get user settings (getUserSettings) |
| [**getUserToken**](UserControllerApi.md#getUserToken) | **GET** /api/user/{userId}/token | Get User Token (getUserToken) |
| [**getUsers**](UserControllerApi.md#getUsers) | **GET** /api/users | Get Users (getUsers) |
| [**getUsersByIdsV2**](UserControllerApi.md#getUsersByIdsV2) | **GET** /api/users/list | Get Users By Ids (getUsersByIdsV2) |
| [**getUsersForAssign**](UserControllerApi.md#getUsersForAssign) | **GET** /api/users/assign/{alarmId} | Get usersForAssign (getUsersForAssign) |
| [**isUserTokenAccessEnabled**](UserControllerApi.md#isUserTokenAccessEnabled) | **GET** /api/user/tokenAccessEnabled | Check Token Access Enabled (isUserTokenAccessEnabled) |
| [**putGeneralUserSettings**](UserControllerApi.md#putGeneralUserSettings) | **PUT** /api/user/settings/general | Update user settings (saveUserSettings) |
| [**putUserSettings**](UserControllerApi.md#putUserSettings) | **PUT** /api/user/settings/{type} | Update user settings (saveUserSettings) |
| [**removeMobileSession**](UserControllerApi.md#removeMobileSession) | **DELETE** /api/user/mobile/session | removeMobileSession |
| [**reportUserDashboardAction**](UserControllerApi.md#reportUserDashboardAction) | **GET** /api/user/dashboards/{dashboardId}/{action} | Report action of User over the dashboard (reportUserDashboardAction) |
| [**saveMobileSession**](UserControllerApi.md#saveMobileSession) | **POST** /api/user/mobile/session | saveMobileSession |
| [**saveUser**](UserControllerApi.md#saveUser) | **POST** /api/user | Save Or update User (saveUser) |
| [**saveUserSettings**](UserControllerApi.md#saveUserSettings) | **POST** /api/user/settings | Save user settings (saveUserSettings) |
| [**sendActivationEmail**](UserControllerApi.md#sendActivationEmail) | **POST** /api/user/sendActivationMail | Send or re-send the activation email |
| [**setUserCredentialsEnabled**](UserControllerApi.md#setUserCredentialsEnabled) | **POST** /api/user/{userId}/userCredentialsEnabled | Enable/Disable User credentials (setUserCredentialsEnabled) |



## deleteUser

> deleteUser(userId)

Delete User (deleteUser)

Deletes the User, it&#39;s credentials and all the relations (from and to the User). Referencing non-existing User Id will cause an error.   Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**| A string value representing the user id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

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


## deleteUserSettings

> deleteUserSettings(paths, type)

Delete user settings (deleteUserSettings)

Delete user settings by specifying list of json element xpaths.   Example: to delete B and C element in { \&quot;A\&quot;: {\&quot;B\&quot;: 5}, \&quot;C\&quot;: 15} send A.B,C in jsonPaths request parameter

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **paths** | **String**| paths | |
| **type** | **String**| Settings type, case insensitive, one of: \&quot;general\&quot;, \&quot;quick_links\&quot;, \&quot;doc_links\&quot; or \&quot;dashboards\&quot;. | |

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


## deleteUserSettings1

> deleteUserSettings1(paths)

Delete user settings (deleteUserSettings)

Delete user settings by specifying list of json element xpaths.   Example: to delete B and C element in { \&quot;A\&quot;: {\&quot;B\&quot;: 5}, \&quot;C\&quot;: 15} send A.B,C in jsonPaths request parameter

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **paths** | **String**| paths | |

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


## findUsersByQuery

> PageDataUserEmailInfo findUsersByQuery(pageSize, page, textSearch, sortProperty, sortOrder)

Find users by query (findUsersByQuery)

Returns page of user data objects. Search is been executed by email, firstName and lastName fields. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the user email. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, firstName, lastName, email] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataUserEmailInfo**](PageDataUserEmailInfo.md)

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


## getActivationLink

> String getActivationLink(userId)

Get activation link (getActivationLink)

Get the activation link for the user. The base url for activation link is configurable in the general settings of system administrator.   Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**| A string value representing the user id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

**String**

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getActivationLinkInfo

> UserActivationLink getActivationLinkInfo(userId)

Get activation link info (getActivationLinkInfo)

Get the activation link info for the user. The base url for activation link is configurable in the general settings of system administrator.   Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**| A string value representing the user id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**UserActivationLink**](UserActivationLink.md)

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


## getCustomerUsers

> PageDataUser getCustomerUsers(customerId, pageSize, page, textSearch, sortProperty, sortOrder)

Get Customer Users (getCustomerUsers)

Returns a page of users owned by customer. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String**| A string value representing the customer id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the user email. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, firstName, lastName, email] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataUser**](PageDataUser.md)

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


## getGeneralUserSettings

> com.fasterxml.jackson.databind.JsonNode getGeneralUserSettings()

Get user settings (getUserSettings)

Fetch the User settings based on authorized user. 

### Parameters

This endpoint does not need any parameter.

### Return type

[**com.fasterxml.jackson.databind.JsonNode**](com.fasterxml.jackson.databind.JsonNode.md)

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


## getMobileSession

> MobileSessionInfo getMobileSession(xMobileToken)

getMobileSession

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xMobileToken** | **String**|  | |

### Return type

[**MobileSessionInfo**](MobileSessionInfo.md)

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


## getTenantAdmins

> PageDataUser getTenantAdmins(tenantId, pageSize, page, textSearch, sortProperty, sortOrder)

Get Tenant Users (getTenantAdmins)

Returns a page of users owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **String**| A string value representing the tenant id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the user email. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, firstName, lastName, email] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataUser**](PageDataUser.md)

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


## getUserById

> User getUserById(userId)

Get User (getUserById)

Fetch the User object based on the provided User Id. If the user has the authority of &#39;SYS_ADMIN&#39;, the server does not perform additional checks. If the user has the authority of &#39;TENANT_ADMIN&#39;, the server checks that the requested user is owned by the same tenant. If the user has the authority of &#39;CUSTOMER_USER&#39;, the server checks that the requested user is owned by the same customer.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**| A string value representing the user id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**User**](User.md)

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


## getUserDashboardsInfo

> UserDashboardsInfo getUserDashboardsInfo()

Get information about last visited and starred dashboards (getLastVisitedDashboards)

Fetch the list of last visited and starred dashboards. Both lists are limited to 10 items.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

This endpoint does not need any parameter.

### Return type

[**UserDashboardsInfo**](UserDashboardsInfo.md)

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


## getUserSettings

> com.fasterxml.jackson.databind.JsonNode getUserSettings(type)

Get user settings (getUserSettings)

Fetch the User settings based on authorized user. 

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String**| Settings type, case insensitive, one of: \&quot;general\&quot;, \&quot;quick_links\&quot;, \&quot;doc_links\&quot; or \&quot;dashboards\&quot;. | |

### Return type

[**com.fasterxml.jackson.databind.JsonNode**](com.fasterxml.jackson.databind.JsonNode.md)

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


## getUserToken

> JwtPair getUserToken(userId)

Get User Token (getUserToken)

Returns the token of the User based on the provided User Id. If the user who performs the request has the authority of &#39;SYS_ADMIN&#39;, it is possible to get the token of any tenant administrator. If the user who performs the request has the authority of &#39;TENANT_ADMIN&#39;, it is possible to get the token of any customer user that belongs to the same tenant. 

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**| A string value representing the user id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**JwtPair**](JwtPair.md)

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


## getUsers

> PageDataUser getUsers(pageSize, page, textSearch, sortProperty, sortOrder)

Get Users (getUsers)

Returns a page of users owned by tenant or customer. The scope depends on authority of the user that performs the request.You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the user email. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, firstName, lastName, email] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataUser**](PageDataUser.md)

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


## getUsersByIdsV2

> List&lt;User&gt; getUsersByIdsV2(userIds)

Get Users By Ids (getUsersByIdsV2)

Requested users must be owned by tenant or assigned to customer which user is performing the request. 

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userIds** | [**List&lt;String&gt;**](String.md)| A list of user ids, separated by comma &#39;,&#39; | |

### Return type

[**List&lt;User&gt;**](User.md)

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


## getUsersForAssign

> PageDataUserEmailInfo getUsersForAssign(alarmId, pageSize, page, textSearch, sortProperty, sortOrder)

Get usersForAssign (getUsersForAssign)

Returns page of user data objects that can be assigned to provided alarmId. Search is been executed by email, firstName and lastName fields. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alarmId** | **String**| A string value representing the alarm id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the user email. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, firstName, lastName, email] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataUserEmailInfo**](PageDataUserEmailInfo.md)

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


## isUserTokenAccessEnabled

> Boolean isUserTokenAccessEnabled()

Check Token Access Enabled (isUserTokenAccessEnabled)

Checks that the system is configured to allow administrators to impersonate themself as other users. If the user who performs the request has the authority of &#39;SYS_ADMIN&#39;, it is possible to login as any tenant administrator. If the user who performs the request has the authority of &#39;TENANT_ADMIN&#39;, it is possible to login as any customer user. 

### Parameters

This endpoint does not need any parameter.

### Return type

**Boolean**

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


## putGeneralUserSettings

> putGeneralUserSettings(body)

Update user settings (saveUserSettings)

Update user settings for authorized user. Only specified json elements will be updated.Example: you have such settings: {A:5, B:{C:10, D:20}}. Updating it with {B:{C:10, D:30}} will result in{A:5, B:{C:10, D:30}}. The same could be achieved by putting {B.D:30}

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object**|  | |

### Return type

null (empty response body)

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


## putUserSettings

> putUserSettings(type, body)

Update user settings (saveUserSettings)

Update user settings for authorized user. Only specified json elements will be updated.Example: you have such settings: {A:5, B:{C:10, D:20}}. Updating it with {B:{C:10, D:30}} will result in{A:5, B:{C:10, D:30}}. The same could be achieved by putting {B.D:30}

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String**| Settings type, case insensitive, one of: \&quot;general\&quot;, \&quot;quick_links\&quot;, \&quot;doc_links\&quot; or \&quot;dashboards\&quot;. | |
| **body** | **Object**|  | |

### Return type

null (empty response body)

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


## removeMobileSession

> removeMobileSession(xMobileToken)

removeMobileSession

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xMobileToken** | **String**|  | |

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


## reportUserDashboardAction

> UserDashboardsInfo reportUserDashboardAction(dashboardId, action)

Report action of User over the dashboard (reportUserDashboardAction)

Report action of User over the dashboard.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dashboardId** | **String**| A string value representing the dashboard id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **action** | **String**| Dashboard action, one of: \&quot;visit\&quot;, \&quot;star\&quot; or \&quot;unstar\&quot;. | |

### Return type

[**UserDashboardsInfo**](UserDashboardsInfo.md)

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


## saveMobileSession

> saveMobileSession(xMobileToken, mobileSessionInfo)

saveMobileSession

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xMobileToken** | **String**|  | |
| **mobileSessionInfo** | [**MobileSessionInfo**](MobileSessionInfo.md)|  | |

### Return type

null (empty response body)

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


## saveUser

> User saveUser(user, sendActivationMail)

Save Or update User (saveUser)

Create or update the User. When creating user, platform generates User Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created User Id will be present in the response. Specify existing User Id to update the device. Referencing non-existing User Id will cause &#39;Not Found&#39; error.  Device email is unique for entire platform setup.Remove &#39;id&#39;, &#39;tenantId&#39; and optionally &#39;customerId&#39; from the request body example (below) to create new User entity.  Available for users with &#39;SYS_ADMIN&#39;, &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **user** | [**User**](User.md)|  | |
| **sendActivationMail** | **String**| Send activation email (or use activation link) | [optional] |

### Return type

[**User**](User.md)

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


## saveUserSettings

> com.fasterxml.jackson.databind.JsonNode saveUserSettings(body)

Save user settings (saveUserSettings)

Save user settings represented in json format for authorized user. 

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object**|  | |

### Return type

[**com.fasterxml.jackson.databind.JsonNode**](com.fasterxml.jackson.databind.JsonNode.md)

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


## sendActivationEmail

> sendActivationEmail(email)

Send or re-send the activation email

Force send the activation email to the user. Useful to resend the email if user has accidentally deleted it.   Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **email** | **String**| Email of the user | |

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


## setUserCredentialsEnabled

> setUserCredentialsEnabled(userId, userCredentialsEnabled)

Enable/Disable User credentials (setUserCredentialsEnabled)

Enables or Disables user credentials. Useful when you would like to block user account without deleting it. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**| A string value representing the user id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **userCredentialsEnabled** | **String**| Enable (\&quot;true\&quot;) or disable (\&quot;false\&quot;) the credentials. | [optional] |

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


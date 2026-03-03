# UserControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteGeneralUserSettings**](#deleteGeneralUserSettings) | **DELETE** /api/user/settings/{paths} | Delete user settings (deleteGeneralUserSettings) |
| [**deleteUser**](#deleteUser) | **DELETE** /api/user/{userId} | Delete User (deleteUser) |
| [**deleteUserSettingsByType**](#deleteUserSettingsByType) | **DELETE** /api/user/settings/{type}/{paths} | Delete user settings by type (deleteUserSettingsByType) |
| [**findUsersByQuery**](#findUsersByQuery) | **GET** /api/users/info | Find users by query (findUsersByQuery) |
| [**getActivationLink**](#getActivationLink) | **GET** /api/user/{userId}/activationLink | Get activation link (getActivationLink) |
| [**getActivationLinkInfo**](#getActivationLinkInfo) | **GET** /api/user/{userId}/activationLinkInfo | Get activation link info (getActivationLinkInfo) |
| [**getAllCustomerUsers**](#getAllCustomerUsers) | **GET** /api/customer/users | Get Customer Users (getCustomerUsers) |
| [**getAllUserInfos**](#getAllUserInfos) | **GET** /api/userInfos/all | Get All User Infos for current user (getAllUserInfos) |
| [**getCustomerUserInfos**](#getCustomerUserInfos) | **GET** /api/customer/{customerId}/userInfos | Get Customer user Infos (getCustomerUserInfos) |
| [**getCustomerUsers**](#getCustomerUsers) | **GET** /api/customer/{customerId}/users | Get Customer Users (getCustomerUsers) |
| [**getGeneralUserSettings**](#getGeneralUserSettings) | **GET** /api/user/settings/general | Get user settings (getGeneralUserSettings) |
| [**getLastVisitedDashboards**](#getLastVisitedDashboards) | **GET** /api/user/lastVisitedDashboards | Get information about last visited and starred dashboards (getLastVisitedDashboards) |
| [**getMobileSession**](#getMobileSession) | **GET** /api/user/mobile/session | getMobileSession |
| [**getTenantAdmins**](#getTenantAdmins) | **GET** /api/tenant/{tenantId}/users | Get Tenant Users (getTenantAdmins) |
| [**getUserById**](#getUserById) | **GET** /api/user/{userId} | Get User (getUserById) |
| [**getUserInfoById**](#getUserInfoById) | **GET** /api/user/info/{userId} | Get User info (getUserInfoById) |
| [**getUserSettings**](#getUserSettings) | **GET** /api/user/settings/{type} | Get user settings (getUserSettings) |
| [**getUserToken**](#getUserToken) | **GET** /api/user/{userId}/token | Get User Token (getUserToken) |
| [**getUserUsers**](#getUserUsers) | **GET** /api/user/users | Get Users (getUsers) |
| [**getUsersByEntityGroupId**](#getUsersByEntityGroupId) | **GET** /api/entityGroup/{entityGroupId}/users | Get users by Entity Group Id (getUsersByEntityGroupId) |
| [**getUsersByIds**](#getUsersByIds) | **GET** /api/users/list | Get Users By Ids (getUsersByIds) |
| [**getUsersForAssign**](#getUsersForAssign) | **GET** /api/users/assign/{alarmId} | Get usersForAssign (getUsersForAssign) |
| [**isUserTokenAccessEnabled**](#isUserTokenAccessEnabled) | **GET** /api/user/tokenAccessEnabled | Check Token Access Enabled (isUserTokenAccessEnabled) |
| [**putGeneralUserSettings**](#putGeneralUserSettings) | **PUT** /api/user/settings/general | Update user settings (putGeneralUserSettings) |
| [**putUserSettings**](#putUserSettings) | **PUT** /api/user/settings/{type} | Update user settings (putUserSettings) |
| [**removeMobileSession**](#removeMobileSession) | **DELETE** /api/user/mobile/session | removeMobileSession |
| [**reportUserDashboardAction**](#reportUserDashboardAction) | **GET** /api/user/dashboards/{dashboardId}/{action} | Report action of User over the dashboard (reportUserDashboardAction) |
| [**saveMobileSession**](#saveMobileSession) | **POST** /api/user/mobile/session | saveMobileSession |
| [**saveUser**](#saveUser) | **POST** /api/user | Save Or update User (saveUser) |
| [**saveUserSettings**](#saveUserSettings) | **POST** /api/user/settings | Save user settings (saveUserSettings) |
| [**sendActivationEmail**](#sendActivationEmail) | **POST** /api/user/sendActivationMail | Send or re-send the activation email |
| [**setUserCredentialsEnabled**](#setUserCredentialsEnabled) | **POST** /api/user/{userId}/userCredentialsEnabled | Enable/Disable User credentials (setUserCredentialsEnabled) |



## deleteGeneralUserSettings

> deleteGeneralUserSettings(paths)

Delete user settings (deleteGeneralUserSettings)

Delete user settings by specifying list of json element xpaths.   Example: to delete B and C element in { \"A\": {\"B\": 5}, \"C\": 15} send A.B,C in jsonPaths request parameter


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **paths** | **String** | paths | |

### Return type

null (empty response body)


## deleteUser

> deleteUser(userId)

Delete User (deleteUser)

Deletes the User, it's credentials and all the relations (from and to the User). Referencing non-existing User Id will cause an error.    Security check is performed to verify that the user has 'DELETE' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String** | A string value representing the user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## deleteUserSettingsByType

> deleteUserSettingsByType(paths, type)

Delete user settings by type (deleteUserSettingsByType)

Delete user settings by specifying list of json element xpaths.   Example: to delete B and C element in { \"A\": {\"B\": 5}, \"C\": 15} send A.B,C in jsonPaths request parameter


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **paths** | **String** | paths | |
| **type** | **String** | Settings type, case insensitive, one of: \"general\", \"quick_links\", \"doc_links\" or \"dashboards\". | |

### Return type

null (empty response body)


## findUsersByQuery

> PageDataUserEmailInfo findUsersByQuery(pageSize, page, textSearch, sortProperty, sortOrder)

Find users by query (findUsersByQuery)

Returns page of user data objects. Search is been executed by email, firstName and lastName fields. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the user email. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, firstName, lastName, email] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataUserEmailInfo**


## getActivationLink

> String getActivationLink(userId)

Get activation link (getActivationLink)

Get the activation link for the user. The base url for activation link is configurable in the general settings of system administrator.    Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String** | A string value representing the user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**String**


## getActivationLinkInfo

> UserActivationLink getActivationLinkInfo(userId)

Get activation link info (getActivationLinkInfo)

Get the activation link info for the user. The base url for activation link is configurable in the general settings of system administrator.    Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String** | A string value representing the user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**UserActivationLink**


## getAllCustomerUsers

> PageDataUser getAllCustomerUsers(pageSize, page, textSearch, sortProperty, sortOrder)

Get Customer Users (getCustomerUsers)

Returns a page of users for the current tenant with authority 'CUSTOMER_USER'. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the user email. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, firstName, lastName, email] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataUser**


## getAllUserInfos

> PageDataUserInfo getAllUserInfos(pageSize, page, includeCustomers, textSearch, sortProperty, sortOrder)

Get All User Infos for current user (getAllUserInfos)

Returns a page of user info objects owned by the tenant or the customer of a current user. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **includeCustomers** | **Boolean** | Include customer or sub-customer entities | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the user email. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, firstName, lastName, email] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataUserInfo**


## getCustomerUserInfos

> PageDataUserInfo getCustomerUserInfos(customerId, pageSize, page, includeCustomers, textSearch, sortProperty, sortOrder)

Get Customer user Infos (getCustomerUserInfos)

Returns a page of user info objects owned by the specified customer. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **includeCustomers** | **Boolean** | Include customer or sub-customer entities | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the user email. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, firstName, lastName, email] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataUserInfo**


## getCustomerUsers

> PageDataUser getCustomerUsers(customerId, pageSize, page, textSearch, sortProperty, sortOrder)

Get Customer Users (getCustomerUsers)

Returns a page of users owned by customer. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the user email. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, firstName, lastName, email] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataUser**


## getGeneralUserSettings

> com.fasterxml.jackson.databind.JsonNode getGeneralUserSettings()

Get user settings (getGeneralUserSettings)

Fetch the User settings based on authorized user. 

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## getLastVisitedDashboards

> UserDashboardsInfo getLastVisitedDashboards()

Get information about last visited and starred dashboards (getLastVisitedDashboards)

Fetch the list of last visited and starred dashboards. Both lists are limited to 10 items.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

### Return type

**UserDashboardsInfo**


## getMobileSession

> MobileSessionInfo getMobileSession(xMobileToken)

getMobileSession


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xMobileToken** | **String** |  | |

### Return type

**MobileSessionInfo**


## getTenantAdmins

> PageDataUser getTenantAdmins(tenantId, pageSize, page, textSearch, sortProperty, sortOrder)

Get Tenant Users (getTenantAdmins)

Returns a page of users owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'SYS_ADMIN' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **String** | A string value representing the tenant id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the user email. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, firstName, lastName, email] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataUser**


## getUserById

> User getUserById(userId)

Get User (getUserById)

Fetch the User object based on the provided User Id. If the user has the authority of 'SYS_ADMIN', the server does not perform additional checks. If the user has the authority of 'TENANT_ADMIN', the server checks that the requested user is owned by the same tenant. If the user has the authority of 'CUSTOMER_USER', the server checks that the requested user is owned by the same customer.   Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String** | A string value representing the user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**User**


## getUserInfoById

> UserInfo getUserInfoById(userId)

Get User info (getUserInfoById)

Fetch the User info object based on the provided User Id. If the user has the authority of 'SYS_ADMIN', the server does not perform additional checks. If the user has the authority of 'TENANT_ADMIN', the server checks that the requested user is owned by the same tenant. If the user has the authority of 'CUSTOMER_USER', the server checks that the requested user is owned by the same customer.   Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String** | A string value representing the user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**UserInfo**


## getUserSettings

> com.fasterxml.jackson.databind.JsonNode getUserSettings(type)

Get user settings (getUserSettings)

Fetch the User settings based on authorized user. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String** | Settings type, case insensitive, one of: \"general\", \"quick_links\", \"doc_links\" or \"dashboards\". | |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## getUserToken

> JwtPair getUserToken(userId)

Get User Token (getUserToken)

Returns the token of the User based on the provided User Id. If the user who performs the request has the authority of 'SYS_ADMIN', it is possible to get the token of any tenant administrator. If the user who performs the request has the authority of 'TENANT_ADMIN', it is possible to get the token of any customer user that belongs to the same tenant. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String** | A string value representing the user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**JwtPair**


## getUserUsers

> PageDataUser getUserUsers(pageSize, page, textSearch, sortProperty, sortOrder)

Get Users (getUsers)

Returns a page of user objects available for the current user. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the user email. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, firstName, lastName, email] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataUser**


## getUsersByEntityGroupId

> PageDataUser getUsersByEntityGroupId(entityGroupId, pageSize, page, textSearch, sortProperty, sortOrder)

Get users by Entity Group Id (getUsersByEntityGroupId)

Returns a page of user objects that belongs to specified Entity Group Id. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.    Security check is performed to verify that the user has 'READ' permission for specified group.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupId** | **String** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the user email. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, firstName, lastName, email] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataUser**


## getUsersByIds

> List<User> getUsersByIds(userIds)

Get Users By Ids (getUsersByIds)

Requested users must be owned by tenant or assigned to customer which user is performing the request.    Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userIds** | **List<String>** | A list of user ids, separated by comma ',' | |

### Return type

**List<User>**


## getUsersForAssign

> PageDataUserEmailInfo getUsersForAssign(alarmId, pageSize, page, textSearch, sortProperty, sortOrder)

Get usersForAssign (getUsersForAssign)

Returns page of user data objects that can be assigned to provided alarmId. Search is been executed by email, firstName and lastName fields. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alarmId** | **String** | A string value representing the alarm id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the user email. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, firstName, lastName, email] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataUserEmailInfo**


## isUserTokenAccessEnabled

> Boolean isUserTokenAccessEnabled()

Check Token Access Enabled (isUserTokenAccessEnabled)

Checks that the system is configured to allow administrators to impersonate themself as other users. If the user who performs the request has the authority of 'SYS_ADMIN', it is possible to login as any tenant administrator. If the user who performs the request has the authority of 'TENANT_ADMIN', it is possible to login as any customer user.   Security check is performed to verify that the user has 'READ' permission for the entity (entities).

### Return type

**Boolean**


## putGeneralUserSettings

> putGeneralUserSettings(body)

Update user settings (putGeneralUserSettings)

Update user settings for authorized user. Only specified json elements will be updated.Example: you have such settings: {A:5, B:{C:10, D:20}}. Updating it with {B:{C:10, D:30}} will result in{A:5, B:{C:10, D:30}}. The same could be achieved by putting {B.D:30}


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object** |  | |

### Return type

null (empty response body)


## putUserSettings

> putUserSettings(type, body)

Update user settings (putUserSettings)

Update user settings for authorized user. Only specified json elements will be updated.Example: you have such settings: {A:5, B:{C:10, D:20}}. Updating it with {B:{C:10, D:30}} will result in{A:5, B:{C:10, D:30}}. The same could be achieved by putting {B.D:30}


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String** | Settings type, case insensitive, one of: \"general\", \"quick_links\", \"doc_links\" or \"dashboards\". | |
| **body** | **Object** |  | |

### Return type

null (empty response body)


## removeMobileSession

> removeMobileSession(xMobileToken)

removeMobileSession


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xMobileToken** | **String** |  | |

### Return type

null (empty response body)


## reportUserDashboardAction

> UserDashboardsInfo reportUserDashboardAction(dashboardId, action)

Report action of User over the dashboard (reportUserDashboardAction)

Report action of User over the dashboard.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dashboardId** | **String** | A string value representing the dashboard id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **action** | **String** | Dashboard action, one of: \"visit\", \"star\" or \"unstar\". | |

### Return type

**UserDashboardsInfo**


## saveMobileSession

> saveMobileSession(xMobileToken, mobileSessionInfo)

saveMobileSession


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xMobileToken** | **String** |  | |
| **mobileSessionInfo** | **MobileSessionInfo** |  | |

### Return type

null (empty response body)


## saveUser

> User saveUser(user, sendActivationMail, entityGroupId, entityGroupIds)

Save Or update User (saveUser)

Create or update the User. When creating user, platform generates User Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created User Id will be present in the response. Specify existing User Id to update the device. Referencing non-existing User Id will cause 'Not Found' error.  Device email is unique for entire platform setup.  Remove 'id', 'tenantId' and optionally 'customerId' from the request body example (below) to create new User entity. Security check is performed to verify that the user has 'WRITE' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **user** | **User** |  | |
| **sendActivationMail** | **String** | Send activation email (or use activation link) | [optional] |
| **entityGroupId** | **String** |  | [optional] |
| **entityGroupIds** | **List<String>** | A list of entity group ids, separated by comma ',' | [optional] |

### Return type

**User**


## saveUserSettings

> com.fasterxml.jackson.databind.JsonNode saveUserSettings(body)

Save user settings (saveUserSettings)

Save user settings represented in json format for authorized user. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object** |  | |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## sendActivationEmail

> sendActivationEmail(email)

Send or re-send the activation email

Force send the activation email to the user. Useful to resend the email if user has accidentally deleted it.   Security check is performed to verify that the user has 'DELETE' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **email** | **String** | Email of the user | |

### Return type

null (empty response body)


## setUserCredentialsEnabled

> setUserCredentialsEnabled(userId, userCredentialsEnabled)

Enable/Disable User credentials (setUserCredentialsEnabled)

Enables or Disables user credentials. Useful when you would like to block user account without deleting it. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'WRITE' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String** | A string value representing the user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **userCredentialsEnabled** | **String** | Enable (\"true\") or disable (\"false\") the credentials. | [optional] |

### Return type

null (empty response body)


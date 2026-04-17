# UserControllerApi

`ThingsboardClient` methods:

```
void deleteGeneralUserSettings(@Nonnull String paths) // Delete user settings (deleteGeneralUserSettings)
void deleteUser(@Nonnull String userId) // Delete User (deleteUser)
void deleteUserSettingsByType(@Nonnull String paths, @Nonnull String type) // Delete user settings by type (deleteUserSettingsByType)
PageDataUserEmailInfo findUsersByQuery(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Find users by query (findUsersByQuery)
String getActivationLink(@Nonnull String userId) // Get activation link (getActivationLink)
UserActivationLink getActivationLinkInfo(@Nonnull String userId) // Get activation link info (getActivationLinkInfo)
PageDataUser getCustomerUsers(@Nonnull String customerId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get Customer Users (getCustomerUsers)
com.fasterxml.jackson.databind.JsonNode getGeneralUserSettings() // Get user settings (getGeneralUserSettings)
MobileSessionInfo getMobileSession(@Nonnull String xMobileToken) // getMobileSession
PageDataUser getTenantAdmins(@Nonnull String tenantId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get Tenant Users (getTenantAdmins)
User getUserById(@Nonnull String userId) // Get User (getUserById)
UserDashboardsInfo getUserDashboardsInfo() // Get information about last visited and starred dashboards (getUserDashboardsInfo)
com.fasterxml.jackson.databind.JsonNode getUserSettings(@Nonnull String type) // Get user settings (getUserSettings)
JwtPair getUserToken(@Nonnull String userId) // Get User Token (getUserToken)
PageDataUser getUsers(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get Users (getUsers)
List<User> getUsersByIds(@Nonnull List<String> userIds) // Get Users By Ids (getUsersByIds)
PageDataUserEmailInfo getUsersForAssign(@Nonnull String alarmId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get usersForAssign (getUsersForAssign)
Boolean isUserTokenAccessEnabled() // Check Token Access Enabled (isUserTokenAccessEnabled)
void putGeneralUserSettings(@Nonnull Object body) // Update user settings (putGeneralUserSettings)
void putUserSettings(@Nonnull String type, @Nonnull Object body) // Update user settings (putUserSettings)
void removeMobileSession(@Nonnull String xMobileToken) // removeMobileSession
UserDashboardsInfo reportUserDashboardAction(@Nonnull String dashboardId, @Nonnull String action) // Report action of User over the dashboard (reportUserDashboardAction)
void saveMobileSession(@Nonnull String xMobileToken, @Nonnull MobileSessionInfo mobileSessionInfo) // saveMobileSession
User saveUser(@Nonnull User user, @Nullable String sendActivationMail) // Save Or update User (saveUser)
com.fasterxml.jackson.databind.JsonNode saveUserSettings(@Nonnull Object body) // Save user settings (saveUserSettings)
void sendActivationEmail(@Nonnull String email) // Send or re-send the activation email
void setUserCredentialsEnabled(@Nonnull String userId, @Nullable String userCredentialsEnabled) // Enable/Disable User credentials (setUserCredentialsEnabled)
```


## deleteGeneralUserSettings

```
void deleteGeneralUserSettings(@Nonnull String paths)
```

**DELETE** `/api/user/settings/{paths}`

Delete user settings (deleteGeneralUserSettings)

Delete user settings by specifying list of json element xpaths.   Example: to delete B and C element in { \"A\": {\"B\": 5}, \"C\": 15} send A.B,C in jsonPaths request parameter


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **paths** | **String** | paths | |

### Return type

null (empty response body)


## deleteUser

```
void deleteUser(@Nonnull String userId)
```

**DELETE** `/api/user/{userId}`

Delete User (deleteUser)

Deletes the User, it's credentials and all the relations (from and to the User). Referencing non-existing User Id will cause an error.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String** | A string value representing the user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## deleteUserSettingsByType

```
void deleteUserSettingsByType(@Nonnull String paths, @Nonnull String type)
```

**DELETE** `/api/user/settings/{type}/{paths}`

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

```
PageDataUserEmailInfo findUsersByQuery(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/users/info`

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

```
String getActivationLink(@Nonnull String userId)
```

**GET** `/api/user/{userId}/activationLink`

Get activation link (getActivationLink)

Get the activation link for the user. The base url for activation link is configurable in the general settings of system administrator.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String** | A string value representing the user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**String**


## getActivationLinkInfo

```
UserActivationLink getActivationLinkInfo(@Nonnull String userId)
```

**GET** `/api/user/{userId}/activationLinkInfo`

Get activation link info (getActivationLinkInfo)

Get the activation link info for the user. The base url for activation link is configurable in the general settings of system administrator.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String** | A string value representing the user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**UserActivationLink**


## getCustomerUsers

```
PageDataUser getCustomerUsers(@Nonnull String customerId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/customer/{customerId}/users`

Get Customer Users (getCustomerUsers)

Returns a page of users owned by customer. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.


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

```
com.fasterxml.jackson.databind.JsonNode getGeneralUserSettings()
```

**GET** `/api/user/settings/general`

Get user settings (getGeneralUserSettings)

Fetch the User settings based on authorized user. 

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## getMobileSession

```
MobileSessionInfo getMobileSession(@Nonnull String xMobileToken)
```

**GET** `/api/user/mobile/session`

getMobileSession


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xMobileToken** | **String** |  | |

### Return type

**MobileSessionInfo**


## getTenantAdmins

```
PageDataUser getTenantAdmins(@Nonnull String tenantId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/tenant/{tenantId}/users`

Get Tenant Users (getTenantAdmins)

Returns a page of users owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'SYS_ADMIN' authority.


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

```
User getUserById(@Nonnull String userId)
```

**GET** `/api/user/{userId}`

Get User (getUserById)

Fetch the User object based on the provided User Id. If the user has the authority of 'SYS_ADMIN', the server does not perform additional checks. If the user has the authority of 'TENANT_ADMIN', the server checks that the requested user is owned by the same tenant. If the user has the authority of 'CUSTOMER_USER', the server checks that the requested user is owned by the same customer.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String** | A string value representing the user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**User**


## getUserDashboardsInfo

```
UserDashboardsInfo getUserDashboardsInfo()
```

**GET** `/api/user/dashboards`

Get information about last visited and starred dashboards (getUserDashboardsInfo)

Fetch the list of last visited and starred dashboards. Both lists are limited to 10 items.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

### Return type

**UserDashboardsInfo**


## getUserSettings

```
com.fasterxml.jackson.databind.JsonNode getUserSettings(@Nonnull String type)
```

**GET** `/api/user/settings/{type}`

Get user settings (getUserSettings)

Fetch the User settings based on authorized user. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String** | Settings type, case insensitive, one of: \"general\", \"quick_links\", \"doc_links\" or \"dashboards\". | |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## getUserToken

```
JwtPair getUserToken(@Nonnull String userId)
```

**GET** `/api/user/{userId}/token`

Get User Token (getUserToken)

Returns the token of the User based on the provided User Id. If the user who performs the request has the authority of 'SYS_ADMIN', it is possible to get the token of any tenant administrator. If the user who performs the request has the authority of 'TENANT_ADMIN', it is possible to get the token of any customer user that belongs to the same tenant. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String** | A string value representing the user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**JwtPair**


## getUsers

```
PageDataUser getUsers(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/users`

Get Users (getUsers)

Returns a page of users owned by tenant or customer. The scope depends on authority of the user that performs the request.You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


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


## getUsersByIds

```
List<User> getUsersByIds(@Nonnull List<String> userIds)
```

**GET** `/api/users/list`

Get Users By Ids (getUsersByIds)

Requested users must be owned by tenant or assigned to customer which user is performing the request. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userIds** | **List<String>** | A list of user ids, separated by comma ',' | |

### Return type

**List<User>**


## getUsersForAssign

```
PageDataUserEmailInfo getUsersForAssign(@Nonnull String alarmId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/users/assign/{alarmId}`

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

```
Boolean isUserTokenAccessEnabled()
```

**GET** `/api/user/tokenAccessEnabled`

Check Token Access Enabled (isUserTokenAccessEnabled)

Checks that the system is configured to allow administrators to impersonate themself as other users. If the user who performs the request has the authority of 'SYS_ADMIN', it is possible to login as any tenant administrator. If the user who performs the request has the authority of 'TENANT_ADMIN', it is possible to login as any customer user. 

### Return type

**Boolean**


## putGeneralUserSettings

```
void putGeneralUserSettings(@Nonnull Object body)
```

**PUT** `/api/user/settings/general`

Update user settings (putGeneralUserSettings)

Update user settings for authorized user. Only specified json elements will be updated.Example: you have such settings: {A:5, B:{C:10, D:20}}. Updating it with {B:{C:10, D:30}} will result in{A:5, B:{C:10, D:30}}. The same could be achieved by putting {B.D:30}


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object** |  | |

### Return type

null (empty response body)


## putUserSettings

```
void putUserSettings(@Nonnull String type, @Nonnull Object body)
```

**PUT** `/api/user/settings/{type}`

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

```
void removeMobileSession(@Nonnull String xMobileToken)
```

**DELETE** `/api/user/mobile/session`

removeMobileSession


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xMobileToken** | **String** |  | |

### Return type

null (empty response body)


## reportUserDashboardAction

```
UserDashboardsInfo reportUserDashboardAction(@Nonnull String dashboardId, @Nonnull String action)
```

**GET** `/api/user/dashboards/{dashboardId}/{action}`

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

```
void saveMobileSession(@Nonnull String xMobileToken, @Nonnull MobileSessionInfo mobileSessionInfo)
```

**POST** `/api/user/mobile/session`

saveMobileSession


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xMobileToken** | **String** |  | |
| **mobileSessionInfo** | **MobileSessionInfo** |  | |

### Return type

null (empty response body)


## saveUser

```
User saveUser(@Nonnull User user, @Nullable String sendActivationMail)
```

**POST** `/api/user`

Save Or update User (saveUser)

Create or update the User. When creating user, platform generates User Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created User Id will be present in the response. Specify existing User Id to update the device. Referencing non-existing User Id will cause 'Not Found' error.  Device email is unique for entire platform setup.Remove 'id', 'tenantId' and optionally 'customerId' from the request body example (below) to create new User entity.  Available for users with 'SYS_ADMIN', 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **user** | **User** |  | |
| **sendActivationMail** | **String** | Send activation email (or use activation link) | [optional] |

### Return type

**User**


## saveUserSettings

```
com.fasterxml.jackson.databind.JsonNode saveUserSettings(@Nonnull Object body)
```

**POST** `/api/user/settings`

Save user settings (saveUserSettings)

Save user settings represented in json format for authorized user. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object** |  | |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## sendActivationEmail

```
void sendActivationEmail(@Nonnull String email)
```

**POST** `/api/user/sendActivationMail`

Send or re-send the activation email

Force send the activation email to the user. Useful to resend the email if user has accidentally deleted it.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **email** | **String** | Email of the user | |

### Return type

null (empty response body)


## setUserCredentialsEnabled

```
void setUserCredentialsEnabled(@Nonnull String userId, @Nullable String userCredentialsEnabled)
```

**POST** `/api/user/{userId}/userCredentialsEnabled`

Enable/Disable User credentials (setUserCredentialsEnabled)

Enables or Disables user credentials. Useful when you would like to block user account without deleting it. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String** | A string value representing the user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **userCredentialsEnabled** | **String** | Enable (\"true\") or disable (\"false\") the credentials. | [optional] |

### Return type

null (empty response body)


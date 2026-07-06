# UserControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void deleteGeneralUserSettings(DeleteGeneralUserSettingsArgs args) // Delete user settings (deleteGeneralUserSettings)
void deleteUser(DeleteUserArgs args) // Delete User (deleteUser)
void deleteUserSettingsByType(DeleteUserSettingsByTypeArgs args) // Delete user settings by type (deleteUserSettingsByType)
PageDataUserEmailInfo findUsersByQuery(FindUsersByQueryArgs args) // Find users by query (findUsersByQuery)
String getActivationLink(GetActivationLinkArgs args) // Get activation link (getActivationLink)
UserActivationLink getActivationLinkInfo(GetActivationLinkInfoArgs args) // Get activation link info (getActivationLinkInfo)
PageDataUser getAllCustomerUsers(GetAllCustomerUsersArgs args) // Get Customer Users (getCustomerUsers)
PageDataUserInfo getAllUserInfos(GetAllUserInfosArgs args) // Get All User Infos for current user (getAllUserInfos)
PageDataUserInfo getCustomerUserInfos(GetCustomerUserInfosArgs args) // Get Customer user Infos (getCustomerUserInfos)
PageDataUser getCustomerUsers(GetCustomerUsersArgs args) // Get Customer Users (getCustomerUsers)
com.fasterxml.jackson.databind.JsonNode getGeneralUserSettings() // Get user settings (getGeneralUserSettings)
UserDashboardsInfo getLastVisitedDashboards() // Get information about last visited and starred dashboards (getLastVisitedDashboards)
MobileSessionInfo getMobileSession(GetMobileSessionArgs args) // getMobileSession
PageDataUser getTenantAdmins(GetTenantAdminsArgs args) // Get Tenant Users (getTenantAdmins)
User getUserById(GetUserByIdArgs args) // Get User (getUserById)
UserInfo getUserInfoById(GetUserInfoByIdArgs args) // Get User info (getUserInfoById)
com.fasterxml.jackson.databind.JsonNode getUserSettings(GetUserSettingsArgs args) // Get user settings (getUserSettings)
JwtPair getUserToken(GetUserTokenArgs args) // Get User Token (getUserToken)
PageDataUser getUserUsers(GetUserUsersArgs args) // Get Users (getUsers)
PageDataUser getUsersByEntityGroupId(GetUsersByEntityGroupIdArgs args) // Get users by Entity Group Id (getUsersByEntityGroupId)
List<User> getUsersByIds(GetUsersByIdsArgs args) // Get Users By Ids (getUsersByIds)
PageDataUserEmailInfo getUsersForAssign(GetUsersForAssignArgs args) // Get usersForAssign (getUsersForAssign)
Boolean isUserTokenAccessEnabled() // Check Token Access Enabled (isUserTokenAccessEnabled)
void putGeneralUserSettings(PutGeneralUserSettingsArgs args) // Update user settings (putGeneralUserSettings)
void putUserSettings(PutUserSettingsArgs args) // Update user settings (putUserSettings)
void removeMobileSession(RemoveMobileSessionArgs args) // removeMobileSession
UserDashboardsInfo reportUserDashboardAction(ReportUserDashboardActionArgs args) // Report action of User over the dashboard (reportUserDashboardAction)
void saveMobileSession(SaveMobileSessionArgs args) // saveMobileSession
User saveUser(SaveUserArgs args) // Save Or update User (saveUser)
com.fasterxml.jackson.databind.JsonNode saveUserSettings(SaveUserSettingsArgs args) // Save user settings (saveUserSettings)
void sendActivationEmail(SendActivationEmailArgs args) // Send or re-send the activation email
void setUserCredentialsEnabled(SetUserCredentialsEnabledArgs args) // Enable/Disable User credentials (setUserCredentialsEnabled)
```


## deleteGeneralUserSettings

**DELETE** `/api/user/settings/{paths}`

Delete user settings (deleteGeneralUserSettings)

Delete user settings by specifying list of json element xpaths.   Example: to delete B and C element in { \"A\": {\"B\": 5}, \"C\": 15} send A.B,C in jsonPaths request parameter

```java
void deleteGeneralUserSettings(DeleteGeneralUserSettingsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteGeneralUserSettingsArgs.builder()
        .paths(String)
        .build()
```

### `DeleteGeneralUserSettingsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `paths` | `String` | **yes** | paths | |

### Return type

null (empty response body)


## deleteUser

**DELETE** `/api/user/{userId}`

Delete User (deleteUser)

Deletes the User, it's credentials and all the relations (from and to the User). Referencing non-existing User Id will cause an error.    Security check is performed to verify that the user has 'DELETE' permission for the entity (entities).

```java
void deleteUser(DeleteUserArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteUserArgs.builder()
        .userId(String)
        .build()
```

### `DeleteUserArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `userId` | `String` | **yes** | A string value representing the user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## deleteUserSettingsByType

**DELETE** `/api/user/settings/{type}/{paths}`

Delete user settings by type (deleteUserSettingsByType)

Delete user settings by specifying list of json element xpaths.   Example: to delete B and C element in { \"A\": {\"B\": 5}, \"C\": 15} send A.B,C in jsonPaths request parameter

```java
void deleteUserSettingsByType(DeleteUserSettingsByTypeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteUserSettingsByTypeArgs.builder()
        .paths(String)
        .type(String)
        .build()
```

### `DeleteUserSettingsByTypeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `paths` | `String` | **yes** | paths | |
| `type` | `String` | **yes** | Settings type, case insensitive, one of: \"general\", \"quick_links\", \"doc_links\" or \"dashboards\". | |

### Return type

null (empty response body)


## findUsersByQuery

**GET** `/api/users/info`

Find users by query (findUsersByQuery)

Returns page of user data objects. Search is been executed by email, firstName and lastName fields. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
PageDataUserEmailInfo findUsersByQuery(FindUsersByQueryArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
FindUsersByQueryArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `FindUsersByQueryArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the user email. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `firstName`, `lastName`, `email` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataUserEmailInfo`


## getActivationLink

**GET** `/api/user/{userId}/activationLink`

Get activation link (getActivationLink)

Get the activation link for the user. The base url for activation link is configurable in the general settings of system administrator.    Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
String getActivationLink(GetActivationLinkArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetActivationLinkArgs.builder()
        .userId(String)
        .build()
```

### `GetActivationLinkArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `userId` | `String` | **yes** | A string value representing the user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`String`


## getActivationLinkInfo

**GET** `/api/user/{userId}/activationLinkInfo`

Get activation link info (getActivationLinkInfo)

Get the activation link info for the user. The base url for activation link is configurable in the general settings of system administrator.    Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
UserActivationLink getActivationLinkInfo(GetActivationLinkInfoArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetActivationLinkInfoArgs.builder()
        .userId(String)
        .build()
```

### `GetActivationLinkInfoArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `userId` | `String` | **yes** | A string value representing the user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`UserActivationLink`


## getAllCustomerUsers

**GET** `/api/customer/users`

Get Customer Users (getCustomerUsers)

Returns a page of users for the current tenant with authority 'CUSTOMER_USER'. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
PageDataUser getAllCustomerUsers(GetAllCustomerUsersArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAllCustomerUsersArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetAllCustomerUsersArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the user email. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `firstName`, `lastName`, `email` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataUser`


## getAllUserInfos

**GET** `/api/userInfos/all`

Get All User Infos for current user (getAllUserInfos)

Returns a page of user info objects owned by the tenant or the customer of a current user. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
PageDataUserInfo getAllUserInfos(GetAllUserInfosArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAllUserInfosArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetAllUserInfosArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `includeCustomers` | `Boolean` | no | Include customer or sub-customer entities | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the user email. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `firstName`, `lastName`, `email` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataUserInfo`


## getCustomerUserInfos

**GET** `/api/customer/{customerId}/userInfos`

Get Customer user Infos (getCustomerUserInfos)

Returns a page of user info objects owned by the specified customer. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
PageDataUserInfo getCustomerUserInfos(GetCustomerUserInfosArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetCustomerUserInfosArgs.builder()
        .customerId(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetCustomerUserInfosArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customerId` | `String` | **yes** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `includeCustomers` | `Boolean` | no | Include customer or sub-customer entities | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the user email. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `firstName`, `lastName`, `email` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataUserInfo`


## getCustomerUsers

**GET** `/api/customer/{customerId}/users`

Get Customer Users (getCustomerUsers)

Returns a page of users owned by customer. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
PageDataUser getCustomerUsers(GetCustomerUsersArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetCustomerUsersArgs.builder()
        .customerId(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetCustomerUsersArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customerId` | `String` | **yes** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the user email. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `firstName`, `lastName`, `email` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataUser`


## getGeneralUserSettings

**GET** `/api/user/settings/general`

Get user settings (getGeneralUserSettings)

Fetch the User settings based on authorized user. 

```java
com.fasterxml.jackson.databind.JsonNode getGeneralUserSettings()
```

### Return type

`com.fasterxml.jackson.databind.JsonNode`


## getLastVisitedDashboards

**GET** `/api/user/lastVisitedDashboards`

Get information about last visited and starred dashboards (getLastVisitedDashboards)

Fetch the list of last visited and starred dashboards. Both lists are limited to 10 items.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
UserDashboardsInfo getLastVisitedDashboards()
```

### Return type

`UserDashboardsInfo`


## getMobileSession

**GET** `/api/user/mobile/session`

getMobileSession

```java
MobileSessionInfo getMobileSession(GetMobileSessionArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetMobileSessionArgs.builder()
        .xMobileToken(String)
        .build()
```

### `GetMobileSessionArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `xMobileToken` | `String` | **yes** |  | |

### Return type

`MobileSessionInfo`


## getTenantAdmins

**GET** `/api/tenant/{tenantId}/users`

Get Tenant Users (getTenantAdmins)

Returns a page of users owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'SYS_ADMIN' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
PageDataUser getTenantAdmins(GetTenantAdminsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetTenantAdminsArgs.builder()
        .tenantId(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetTenantAdminsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `tenantId` | `String` | **yes** | A string value representing the tenant id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the user email. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `firstName`, `lastName`, `email` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataUser`


## getUserById

**GET** `/api/user/{userId}`

Get User (getUserById)

Fetch the User object based on the provided User Id. If the user has the authority of 'SYS_ADMIN', the server does not perform additional checks. If the user has the authority of 'TENANT_ADMIN', the server checks that the requested user is owned by the same tenant. If the user has the authority of 'CUSTOMER_USER', the server checks that the requested user is owned by the same customer.   Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
User getUserById(GetUserByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetUserByIdArgs.builder()
        .userId(String)
        .build()
```

### `GetUserByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `userId` | `String` | **yes** | A string value representing the user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`User`


## getUserInfoById

**GET** `/api/user/info/{userId}`

Get User info (getUserInfoById)

Fetch the User info object based on the provided User Id. If the user has the authority of 'SYS_ADMIN', the server does not perform additional checks. If the user has the authority of 'TENANT_ADMIN', the server checks that the requested user is owned by the same tenant. If the user has the authority of 'CUSTOMER_USER', the server checks that the requested user is owned by the same customer.   Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
UserInfo getUserInfoById(GetUserInfoByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetUserInfoByIdArgs.builder()
        .userId(String)
        .build()
```

### `GetUserInfoByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `userId` | `String` | **yes** | A string value representing the user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`UserInfo`


## getUserSettings

**GET** `/api/user/settings/{type}`

Get user settings (getUserSettings)

Fetch the User settings based on authorized user. 

```java
com.fasterxml.jackson.databind.JsonNode getUserSettings(GetUserSettingsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetUserSettingsArgs.builder()
        .type(String)
        .build()
```

### `GetUserSettingsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `type` | `String` | **yes** | Settings type, case insensitive, one of: \"general\", \"quick_links\", \"doc_links\" or \"dashboards\". | |

### Return type

`com.fasterxml.jackson.databind.JsonNode`


## getUserToken

**GET** `/api/user/{userId}/token`

Get User Token (getUserToken)

Returns the token of the User based on the provided User Id. If the user who performs the request has the authority of 'SYS_ADMIN', it is possible to get the token of any tenant administrator. If the user who performs the request has the authority of 'TENANT_ADMIN', it is possible to get the token of any customer user that belongs to the same tenant. 

```java
JwtPair getUserToken(GetUserTokenArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetUserTokenArgs.builder()
        .userId(String)
        .build()
```

### `GetUserTokenArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `userId` | `String` | **yes** | A string value representing the user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`JwtPair`


## getUserUsers

**GET** `/api/user/users`

Get Users (getUsers)

Returns a page of user objects available for the current user. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
PageDataUser getUserUsers(GetUserUsersArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetUserUsersArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetUserUsersArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the user email. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `firstName`, `lastName`, `email` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataUser`


## getUsersByEntityGroupId

**GET** `/api/entityGroup/{entityGroupId}/users`

Get users by Entity Group Id (getUsersByEntityGroupId)

Returns a page of user objects that belongs to specified Entity Group Id. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.    Security check is performed to verify that the user has 'READ' permission for specified group.

```java
PageDataUser getUsersByEntityGroupId(GetUsersByEntityGroupIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetUsersByEntityGroupIdArgs.builder()
        .entityGroupId(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetUsersByEntityGroupIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityGroupId` | `String` | **yes** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the user email. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `firstName`, `lastName`, `email` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataUser`


## getUsersByIds

**GET** `/api/users/list`

Get Users By Ids (getUsersByIds)

Requested users must be owned by tenant or assigned to customer which user is performing the request.    Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
List<User> getUsersByIds(GetUsersByIdsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetUsersByIdsArgs.builder()
        .userIds(List<String>)
        .build()
```

### `GetUsersByIdsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `userIds` | `List<String>` | **yes** | A list of user ids, separated by comma ',' | |

### Return type

`List<User>`


## getUsersForAssign

**GET** `/api/users/assign/{alarmId}`

Get usersForAssign (getUsersForAssign)

Returns page of user data objects that can be assigned to provided alarmId. Search is been executed by email, firstName and lastName fields. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
PageDataUserEmailInfo getUsersForAssign(GetUsersForAssignArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetUsersForAssignArgs.builder()
        .alarmId(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetUsersForAssignArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `alarmId` | `String` | **yes** | A string value representing the alarm id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the user email. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `firstName`, `lastName`, `email` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataUserEmailInfo`


## isUserTokenAccessEnabled

**GET** `/api/user/tokenAccessEnabled`

Check Token Access Enabled (isUserTokenAccessEnabled)

Checks that the system is configured to allow administrators to impersonate themself as other users. If the user who performs the request has the authority of 'SYS_ADMIN', it is possible to login as any tenant administrator. If the user who performs the request has the authority of 'TENANT_ADMIN', it is possible to login as any customer user.   Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
Boolean isUserTokenAccessEnabled()
```

### Return type

`Boolean`


## putGeneralUserSettings

**PUT** `/api/user/settings/general`

Update user settings (putGeneralUserSettings)

Update user settings for authorized user. Only specified json elements will be updated.Example: you have such settings: {A:5, B:{C:10, D:20}}. Updating it with {B:{C:10, D:30}} will result in{A:5, B:{C:10, D:30}}. The same could be achieved by putting {B.D:30}

```java
void putGeneralUserSettings(PutGeneralUserSettingsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
PutGeneralUserSettingsArgs.builder()
        .body(Object)
        .build()
```

### `PutGeneralUserSettingsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `body` | `Object` | **yes** |  | |

### Return type

null (empty response body)


## putUserSettings

**PUT** `/api/user/settings/{type}`

Update user settings (putUserSettings)

Update user settings for authorized user. Only specified json elements will be updated.Example: you have such settings: {A:5, B:{C:10, D:20}}. Updating it with {B:{C:10, D:30}} will result in{A:5, B:{C:10, D:30}}. The same could be achieved by putting {B.D:30}

```java
void putUserSettings(PutUserSettingsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
PutUserSettingsArgs.builder()
        .type(String)
        .body(Object)
        .build()
```

### `PutUserSettingsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `type` | `String` | **yes** | Settings type, case insensitive, one of: \"general\", \"quick_links\", \"doc_links\" or \"dashboards\". | |
| `body` | `Object` | **yes** |  | |

### Return type

null (empty response body)


## removeMobileSession

**DELETE** `/api/user/mobile/session`

removeMobileSession

```java
void removeMobileSession(RemoveMobileSessionArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
RemoveMobileSessionArgs.builder()
        .xMobileToken(String)
        .build()
```

### `RemoveMobileSessionArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `xMobileToken` | `String` | **yes** |  | |

### Return type

null (empty response body)


## reportUserDashboardAction

**GET** `/api/user/dashboards/{dashboardId}/{action}`

Report action of User over the dashboard (reportUserDashboardAction)

Report action of User over the dashboard.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
UserDashboardsInfo reportUserDashboardAction(ReportUserDashboardActionArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ReportUserDashboardActionArgs.builder()
        .dashboardId(String)
        .action(String)
        .build()
```

### `ReportUserDashboardActionArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `dashboardId` | `String` | **yes** | A string value representing the dashboard id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `action` | `String` | **yes** | Dashboard action, one of: \"visit\", \"star\" or \"unstar\". | |

### Return type

`UserDashboardsInfo`


## saveMobileSession

**POST** `/api/user/mobile/session`

saveMobileSession

```java
void saveMobileSession(SaveMobileSessionArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveMobileSessionArgs.builder()
        .xMobileToken(String)
        .mobileSessionInfo(MobileSessionInfo)
        .build()
```

### `SaveMobileSessionArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `xMobileToken` | `String` | **yes** |  | |
| `mobileSessionInfo` | `MobileSessionInfo` | **yes** |  | |

### Return type

null (empty response body)


## saveUser

**POST** `/api/user`

Save Or update User (saveUser)

Create or update the User. When creating user, platform generates User Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created User Id will be present in the response. Specify existing User Id to update the device. Referencing non-existing User Id will cause 'Not Found' error.  Device email is unique for entire platform setup.  Remove 'id', 'tenantId' and optionally 'customerId' from the request body example (below) to create new User entity. Security check is performed to verify that the user has 'WRITE' permission for the entity (entities).

```java
User saveUser(SaveUserArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveUserArgs.builder()
        .user(User)
        .build()
```

### `SaveUserArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `user` | `User` | **yes** |  | |
| `sendActivationMail` | `String` | no | Send activation email (or use activation link) | |
| `entityGroupId` | `String` | no |  | |
| `entityGroupIds` | `List<String>` | no | A list of entity group ids, separated by comma ',' | |

### Return type

`User`


## saveUserSettings

**POST** `/api/user/settings`

Save user settings (saveUserSettings)

Save user settings represented in json format for authorized user. 

```java
com.fasterxml.jackson.databind.JsonNode saveUserSettings(SaveUserSettingsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveUserSettingsArgs.builder()
        .body(Object)
        .build()
```

### `SaveUserSettingsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `body` | `Object` | **yes** |  | |

### Return type

`com.fasterxml.jackson.databind.JsonNode`


## sendActivationEmail

**POST** `/api/user/sendActivationMail`

Send or re-send the activation email

Force send the activation email to the user. Useful to resend the email if user has accidentally deleted it.   Security check is performed to verify that the user has 'DELETE' permission for the entity (entities).

```java
void sendActivationEmail(SendActivationEmailArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SendActivationEmailArgs.builder()
        .email(String)
        .build()
```

### `SendActivationEmailArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `email` | `String` | **yes** | Email of the user | |

### Return type

null (empty response body)


## setUserCredentialsEnabled

**POST** `/api/user/{userId}/userCredentialsEnabled`

Enable/Disable User credentials (setUserCredentialsEnabled)

Enables or Disables user credentials. Useful when you would like to block user account without deleting it. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'WRITE' permission for the entity (entities).

```java
void setUserCredentialsEnabled(SetUserCredentialsEnabledArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SetUserCredentialsEnabledArgs.builder()
        .userId(String)
        .build()
```

### `SetUserCredentialsEnabledArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `userId` | `String` | **yes** | A string value representing the user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `userCredentialsEnabled` | `String` | no | Enable (\"true\") or disable (\"false\") the credentials. | |

### Return type

null (empty response body)


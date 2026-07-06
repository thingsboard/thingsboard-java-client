# SelfRegistrationControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void deleteWebSelfRegistrationParams() // deleteWebSelfRegistrationParams
String getPrivacyPolicy(GetPrivacyPolicyArgs args) // Get Privacy Policy for Self Registration form (getPrivacyPolicy)
SignUpSelfRegistrationParams getSignUpSelfRegistrationParams(GetSignUpSelfRegistrationParamsArgs args) // Get Self Registration form parameters without authentication (getSignUpSelfRegistrationParams)
String getTermsOfUse(GetTermsOfUseArgs args) // Get Terms of Use for Self Registration form (getTermsOfUse)
SelfRegistrationParams getWebSelfRegistrationParams() // Get Self Registration parameters (getSelfRegistrationParams)
WebSelfRegistrationParams saveWebSelfRegistrationParams(SaveWebSelfRegistrationParamsArgs args) // Create Or Update Self Registration parameters (saveSelfRegistrationParams)
```


## deleteWebSelfRegistrationParams

**DELETE** `/api/selfRegistration/selfRegistrationParams`

deleteWebSelfRegistrationParams

```java
void deleteWebSelfRegistrationParams()
```

### Return type

null (empty response body)


## getPrivacyPolicy

**GET** `/api/noauth/selfRegistration/privacyPolicy`

Get Privacy Policy for Self Registration form (getPrivacyPolicy)

Fetch the Privacy Policy based on the domain name from the request. Available for non-authorized users. 

```java
String getPrivacyPolicy(GetPrivacyPolicyArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetPrivacyPolicyArgs.builder()
        .build()
```

### `GetPrivacyPolicyArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pkgName` | `String` | no |  | |
| `platform` | `PlatformType` | no |  | enum: `WEB`, `ANDROID`, `IOS` |

### Return type

`String`


## getSignUpSelfRegistrationParams

**GET** `/api/noauth/selfRegistration/signUpSelfRegistrationParams`

Get Self Registration form parameters without authentication (getSignUpSelfRegistrationParams)

Fetch the Self Registration parameters based on the domain name from the request. Available for non-authorized users. Contains the information to customize the sign-up form.

```java
SignUpSelfRegistrationParams getSignUpSelfRegistrationParams(GetSignUpSelfRegistrationParamsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetSignUpSelfRegistrationParamsArgs.builder()
        .build()
```

### `GetSignUpSelfRegistrationParamsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pkgName` | `String` | no |  | |
| `platformType` | `String` | no | Platform type | enum: `ANDROID`, `IOS` |

### Return type

`SignUpSelfRegistrationParams`


## getTermsOfUse

**GET** `/api/noauth/selfRegistration/termsOfUse`

Get Terms of Use for Self Registration form (getTermsOfUse)

Fetch the Terms of Use based on the domain name from the request. Available for non-authorized users. 

```java
String getTermsOfUse(GetTermsOfUseArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetTermsOfUseArgs.builder()
        .build()
```

### `GetTermsOfUseArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pkgName` | `String` | no |  | |
| `platform` | `PlatformType` | no |  | enum: `WEB`, `ANDROID`, `IOS` |

### Return type

`String`


## getWebSelfRegistrationParams

**GET** `/api/selfRegistration/selfRegistrationParams`

Get Self Registration parameters (getSelfRegistrationParams)

Fetch the Self Registration parameters object for the tenant of the current user.   Available for users with 'TENANT_ADMIN' authority.  Security check is performed to verify that the user has 'READ' permission for the white labeling resource.

```java
SelfRegistrationParams getWebSelfRegistrationParams()
```

### Return type

`SelfRegistrationParams`


## saveWebSelfRegistrationParams

**POST** `/api/selfRegistration/selfRegistrationParams`

Create Or Update Self Registration parameters (saveSelfRegistrationParams)

Creates or Updates the Self Registration parameters. When creating, platform generates Admin Settings Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Admin Settings Id will be present in the response. Specify existing Admin Settings Id to update the Self Registration parameters. Referencing non-existing Admin Settings Id will cause 'Not Found' error.  Self Registration allows users to signup for using the platform and automatically create a Customer account for them. You may configure default dashboard and user roles that will be assigned for this Customer. This allows you to build out-of-the-box solutions for customers. Ability to white-label the login and main pages helps to brand the platform.  Available for users with 'TENANT_ADMIN' authority.  Security check is performed to verify that the user has 'WRITE' permission for the white labeling resource.

```java
WebSelfRegistrationParams saveWebSelfRegistrationParams(SaveWebSelfRegistrationParamsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveWebSelfRegistrationParamsArgs.builder()
        .webSelfRegistrationParams(WebSelfRegistrationParams)
        .build()
```

### `SaveWebSelfRegistrationParamsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `webSelfRegistrationParams` | `WebSelfRegistrationParams` | **yes** |  | |

### Return type

`WebSelfRegistrationParams`


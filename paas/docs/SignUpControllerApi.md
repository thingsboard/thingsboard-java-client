# SignUpControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
JwtPair acceptPrivacyPolicy() // Accept privacy policy (acceptPrivacyPolicy)
JwtPair acceptPrivacyPolicyAndTermsOfUse() // acceptPrivacyPolicyAndTermsOfUse
JwtPair acceptTermsOfUse() // Accept Terms of Use (acceptTermsOfUse)
String activateCloudEmail(ActivateCloudEmailArgs args) // activateCloudEmail
JwtPair activateCloudUserByEmailCode(ActivateCloudUserByEmailCodeArgs args) // activateCloudUserByEmailCode
String activateEmail(ActivateEmailArgs args) // Activate User using code from Email (activateEmail)
JwtPair activateUserByEmailCode(ActivateUserByEmailCodeArgs args) // Activate and login using code from Email (activateUserByEmailCode)
String cloudMobileLogin(CloudMobileLoginArgs args) // Cloud mobile Login redirect (cloudMobileLogin)
void deleteTenantAccount(DeleteTenantAccountArgs args) // deleteTenantAccount
CaptchaClientParams getRecaptchaParams() // getRecaptchaParams
Boolean isDisplayWelcome() // isDisplayWelcome
String mobileLogin(MobileLoginArgs args) // Mobile Login redirect (mobileLogin)
Boolean privacyPolicyAccepted() // Check privacy policy (privacyPolicyAccepted)
void resendCloudEmailActivation(ResendCloudEmailActivationArgs args) // resendCloudEmailActivation
void resendEmailActivation(ResendEmailActivationArgs args) // Resend Activation Email (resendEmailActivation)
void setNotDisplayWelcome() // setNotDisplayWelcome
SignUpResult signUp(SignUpArgs args) // User Sign Up (signUp)
Boolean termsOfUseAccepted() // Check Terms Of User (termsOfUseAccepted)
```


## acceptPrivacyPolicy

**POST** `/api/signup/acceptPrivacyPolicy`

Accept privacy policy (acceptPrivacyPolicy)

Accept privacy policy by the current user.

```java
JwtPair acceptPrivacyPolicy()
```

### Return type

`JwtPair`


## acceptPrivacyPolicyAndTermsOfUse

**POST** `/api/signup/acceptPrivacyPolicyAndTermsOfUse`

acceptPrivacyPolicyAndTermsOfUse

```java
JwtPair acceptPrivacyPolicyAndTermsOfUse()
```

### Return type

`JwtPair`


## acceptTermsOfUse

**POST** `/api/signup/acceptTermsOfUse`

Accept Terms of Use (acceptTermsOfUse)

Accept Terms of Use by the current user.

```java
JwtPair acceptTermsOfUse()
```

### Return type

`JwtPair`


## activateCloudEmail

**GET** `/api/noauth/cloud/activateEmail`

activateCloudEmail

```java
String activateCloudEmail(ActivateCloudEmailArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ActivateCloudEmailArgs.builder()
        .emailCode(String)
        .build()
```

### `ActivateCloudEmailArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `emailCode` | `String` | **yes** |  | |
| `pkgName` | `String` | no | Optional package name of the mobile application. | |
| `platform` | `String` | no | Platform type | enum: `ANDROID`, `IOS` |

### Return type

`String`


## activateCloudUserByEmailCode

**POST** `/api/noauth/cloud/activateByEmailCode`

activateCloudUserByEmailCode

```java
JwtPair activateCloudUserByEmailCode(ActivateCloudUserByEmailCodeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ActivateCloudUserByEmailCodeArgs.builder()
        .emailCode(String)
        .build()
```

### `ActivateCloudUserByEmailCodeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `emailCode` | `String` | **yes** |  | |
| `pkgName` | `String` | no | Optional package name of the mobile application. | |
| `platform` | `String` | no | Platform type | enum: `ANDROID`, `IOS` |

### Return type

`JwtPair`


## activateEmail

**GET** `/api/noauth/activateEmail`

Activate User using code from Email (activateEmail)

Activate the user using code(link) from the activation email. Validates the code an redirects according to the signup flow. Checks that user was not activated yet.

```java
String activateEmail(ActivateEmailArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ActivateEmailArgs.builder()
        .emailCode(String)
        .build()
```

### `ActivateEmailArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `emailCode` | `String` | **yes** | Activation token. | |
| `pkgName` | `String` | no | Optional package name of the mobile application. | |
| `platform` | `String` | no | Platform type | enum: `ANDROID`, `IOS` |

### Return type

`String`


## activateUserByEmailCode

**POST** `/api/noauth/activateByEmailCode`

Activate and login using code from Email (activateUserByEmailCode)

Activate the user using code(link) from the activation email and return the JWT Token. Sends the notification and email about user activation. Checks that user was not activated yet.

```java
JwtPair activateUserByEmailCode(ActivateUserByEmailCodeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ActivateUserByEmailCodeArgs.builder()
        .emailCode(String)
        .build()
```

### `ActivateUserByEmailCodeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `emailCode` | `String` | **yes** | Activation token. | |
| `pkgName` | `String` | no | Optional package name of the mobile application. | |
| `platform` | `String` | no | Platform type | enum: `ANDROID`, `IOS` |

### Return type

`JwtPair`


## cloudMobileLogin

**GET** `/api/noauth/cloud/login`

Cloud mobile Login redirect (cloudMobileLogin)

This method generates redirect to the special link that is handled by mobile application. Useful for email verification flow on cloud mobile app.

```java
String cloudMobileLogin(CloudMobileLoginArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
CloudMobileLoginArgs.builder()
        .pkgName(String)
        .build()
```

### `CloudMobileLoginArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pkgName` | `String` | **yes** | Mobile app package name. Used to identify the application and build the redirect link. | |
| `platform` | `String` | no | Platform type | enum: `ANDROID`, `IOS` |

### Return type

`String`


## deleteTenantAccount

**POST** `/api/signup/tenantAccount`

deleteTenantAccount

```java
void deleteTenantAccount(DeleteTenantAccountArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteTenantAccountArgs.builder()
        .build()
```

### `DeleteTenantAccountArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `deleteTenantRequest` | `DeleteTenantRequest` | no |  | |

### Return type

null (empty response body)


## getRecaptchaParams

**GET** `/api/noauth/signup/recaptchaParams`

getRecaptchaParams

```java
CaptchaClientParams getRecaptchaParams()
```

### Return type

`CaptchaClientParams`


## isDisplayWelcome

**GET** `/api/signup/displayWelcome`

isDisplayWelcome

```java
Boolean isDisplayWelcome()
```

### Return type

`Boolean`


## mobileLogin

**GET** `/api/noauth/login`

Mobile Login redirect (mobileLogin)

This method generates redirect to the special link that is handled by mobile application. Useful for email verification flow on mobile app.

```java
String mobileLogin(MobileLoginArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
MobileLoginArgs.builder()
        .pkgName(String)
        .platform(String)
        .build()
```

### `MobileLoginArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pkgName` | `String` | **yes** | Mobile app package name. Used to identify the application and build the redirect link. | |
| `platform` | `String` | **yes** | Platform type | enum: `ANDROID`, `IOS` |

### Return type

`String`


## privacyPolicyAccepted

**GET** `/api/signup/privacyPolicyAccepted`

Check privacy policy (privacyPolicyAccepted)

Checks that current user accepted the privacy policy.

```java
Boolean privacyPolicyAccepted()
```

### Return type

`Boolean`


## resendCloudEmailActivation

**POST** `/api/noauth/cloud/resendEmailActivation`

resendCloudEmailActivation

```java
void resendCloudEmailActivation(ResendCloudEmailActivationArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ResendCloudEmailActivationArgs.builder()
        .email(String)
        .build()
```

### `ResendCloudEmailActivationArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `email` | `String` | **yes** |  | |
| `pkgName` | `String` | no |  | |
| `platform` | `String` | no | Platform type | enum: `ANDROID`, `IOS` |

### Return type

null (empty response body)


## resendEmailActivation

**POST** `/api/noauth/resendEmailActivation`

Resend Activation Email (resendEmailActivation)

Request to resend the activation email for the user. Checks that user was not activated yet.

```java
void resendEmailActivation(ResendEmailActivationArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ResendEmailActivationArgs.builder()
        .email(String)
        .build()
```

### `ResendEmailActivationArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `email` | `String` | **yes** | Email of the user. | |
| `pkgName` | `String` | no | Optional package name of the mobile application. | |
| `platform` | `String` | no | Platform type | enum: `ANDROID`, `IOS` |

### Return type

null (empty response body)


## setNotDisplayWelcome

**POST** `/api/signup/notDisplayWelcome`

setNotDisplayWelcome

```java
void setNotDisplayWelcome()
```

### Return type

null (empty response body)


## signUp

**POST** `/api/noauth/signup`

User Sign Up (signUp)

Process user sign up request. Creates the Customer and corresponding User based on self Registration parameters for the domain. See [Self Registration Controller](/swagger-ui.html#/self-registration-controller) for more details.  The result is either 'SUCCESS' or 'INACTIVE_USER_EXISTS'. If Success, the user will receive an email with instruction to activate the account. The content of the email is customizable via the mail templates.

```java
SignUpResult signUp(SignUpArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SignUpArgs.builder()
        .signUpRequest(SignUpRequest)
        .build()
```

### `SignUpArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `signUpRequest` | `SignUpRequest` | **yes** |  | |

### Return type

`SignUpResult`


## termsOfUseAccepted

**GET** `/api/signup/termsOfUseAccepted`

Check Terms Of User (termsOfUseAccepted)

Checks that current user accepted the privacy policy.

```java
Boolean termsOfUseAccepted()
```

### Return type

`Boolean`


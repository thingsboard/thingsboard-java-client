# SignUpControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
com.fasterxml.jackson.databind.JsonNode acceptPrivacyPolicy() // Accept privacy policy (acceptPrivacyPolicy)
com.fasterxml.jackson.databind.JsonNode acceptTermsOfUse() // Accept Terms of Use (acceptTermsOfUse)
String activateEmail(ActivateEmailArgs args) // Activate User using code from Email (activateEmail)
JwtPair activateUserByEmailCode(ActivateUserByEmailCodeArgs args) // Activate and login using code from Email (activateUserByEmailCode)
String mobileLogin(MobileLoginArgs args) // Mobile Login redirect (mobileLogin)
Boolean privacyPolicyAccepted() // Check privacy policy (privacyPolicyAccepted)
void resendEmailActivation(ResendEmailActivationArgs args) // Resend Activation Email (resendEmailActivation)
SignUpResult signUp(SignUpArgs args) // User Sign Up (signUp)
Boolean termsOfUseAccepted() // Check Terms Of User (termsOfUseAccepted)
```


## acceptPrivacyPolicy

**POST** `/api/signup/acceptPrivacyPolicy`

Accept privacy policy (acceptPrivacyPolicy)

Accept privacy policy by the current user.

```java
com.fasterxml.jackson.databind.JsonNode acceptPrivacyPolicy()
```

### Return type

`com.fasterxml.jackson.databind.JsonNode`


## acceptTermsOfUse

**POST** `/api/signup/acceptTermsOfUse`

Accept Terms of Use (acceptTermsOfUse)

Accept Terms of Use by the current user.

```java
com.fasterxml.jackson.databind.JsonNode acceptTermsOfUse()
```

### Return type

`com.fasterxml.jackson.databind.JsonNode`


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


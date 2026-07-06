# AuthControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
JwtPair activateUser(ActivateUserArgs args) // Activate User
JwtPair changePassword(ChangePasswordArgs args) // Change password for current User (changePassword)
Object checkActivateToken(CheckActivateTokenArgs args) // Check Activate User Token (checkActivateToken)
Object checkResetToken(CheckResetTokenArgs args) // Check password reset token (checkResetToken)
User getUser() // Get current User (getUser)
UserPasswordPolicy getUserPasswordPolicy() // Get the current User password policy (getUserPasswordPolicy)
void logout() // Logout (logout)
void requestResetPasswordByEmail(RequestResetPasswordByEmailArgs args) // Request reset password email (requestResetPasswordByEmail)
void resetPassword(ResetPasswordArgs args) // Reset password (resetPassword)
```


## activateUser

**POST** `/api/noauth/activate`

Activate User

Checks the activation token and updates corresponding user password in the database. Now the user may start using his password to login. The response already contains the [JWT](https://jwt.io) activation and refresh tokens, to simplify the user activation flow and avoid asking user to input password again after activation. If token is valid, returns the object that contains [JWT](https://jwt.io/) access and refresh tokens. If token is not valid, returns '400 Bad Request'.

```java
JwtPair activateUser(ActivateUserArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ActivateUserArgs.builder()
        .activateUserRequest(ActivateUserRequest)
        .build()
```

### `ActivateUserArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `activateUserRequest` | `ActivateUserRequest` | **yes** |  | |
| `sendActivationMail` | `Boolean` | no |  | default: `true` |

### Return type

`JwtPair`


## changePassword

**POST** `/api/auth/changePassword`

Change password for current User (changePassword)

Change the password for the User which credentials are used to perform this REST API call. Be aware that previously generated [JWT](https://jwt.io/) tokens will be still valid until they expire.

```java
JwtPair changePassword(ChangePasswordArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ChangePasswordArgs.builder()
        .changePasswordRequest(ChangePasswordRequest)
        .build()
```

### `ChangePasswordArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `changePasswordRequest` | `ChangePasswordRequest` | **yes** |  | |

### Return type

`JwtPair`


## checkActivateToken

**GET** `/api/noauth/activate`

Check Activate User Token (checkActivateToken)

Checks the activation token and forwards user to 'Create Password' page. If token is valid, returns '303 See Other' (redirect) response code with the correct address of 'Create Password' page and same 'activateToken' specified in the URL parameters. If token is not valid, returns '409 Conflict'. If token is expired, redirects to error page.

```java
Object checkActivateToken(CheckActivateTokenArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
CheckActivateTokenArgs.builder()
        .activateToken(String)
        .build()
```

### `CheckActivateTokenArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `activateToken` | `String` | **yes** | The activate token string. | |

### Return type

`Object`


## checkResetToken

**GET** `/api/noauth/resetPassword`

Check password reset token (checkResetToken)

Checks the password reset token and forwards user to 'Reset Password' page. If token is valid, returns '303 See Other' (redirect) response code with the correct address of 'Reset Password' page and same 'resetToken' specified in the URL parameters. If token is not valid, returns '409 Conflict'. If token is expired, redirects to error page.

```java
Object checkResetToken(CheckResetTokenArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
CheckResetTokenArgs.builder()
        .resetToken(String)
        .build()
```

### `CheckResetTokenArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `resetToken` | `String` | **yes** | The reset token string. | |

### Return type

`Object`


## getUser

**GET** `/api/auth/user`

Get current User (getUser)

Get the information about the User which credentials are used to perform this REST API call.

```java
User getUser()
```

### Return type

`User`


## getUserPasswordPolicy

**GET** `/api/noauth/userPasswordPolicy`

Get the current User password policy (getUserPasswordPolicy)

API call to get the password policy for the password validation form(s).

```java
UserPasswordPolicy getUserPasswordPolicy()
```

### Return type

`UserPasswordPolicy`


## logout

**POST** `/api/auth/logout`

Logout (logout)

Special API call to record the 'logout' of the user to the Audit Logs. Since platform uses [JWT](https://jwt.io/), the actual logout is the procedure of clearing the [JWT](https://jwt.io/) token on the client side. 

```java
void logout()
```

### Return type

null (empty response body)


## requestResetPasswordByEmail

**POST** `/api/noauth/resetPasswordByEmail`

Request reset password email (requestResetPasswordByEmail)

Request to send the reset password email if the user with specified email address is present in the database. Always return '200 OK' status for security purposes.

```java
void requestResetPasswordByEmail(RequestResetPasswordByEmailArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
RequestResetPasswordByEmailArgs.builder()
        .resetPasswordEmailRequest(ResetPasswordEmailRequest)
        .build()
```

### `RequestResetPasswordByEmailArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `resetPasswordEmailRequest` | `ResetPasswordEmailRequest` | **yes** |  | |

### Return type

null (empty response body)


## resetPassword

**POST** `/api/noauth/resetPassword`

Reset password (resetPassword)

Checks the password reset token and updates the password. If token is not valid, returns '400 Bad Request'.

```java
void resetPassword(ResetPasswordArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ResetPasswordArgs.builder()
        .resetPasswordRequest(ResetPasswordRequest)
        .build()
```

### `ResetPasswordArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `resetPasswordRequest` | `ResetPasswordRequest` | **yes** |  | |

### Return type

null (empty response body)


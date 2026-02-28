# AuthControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateUser**](#activateUser) | **POST** /api/noauth/activate | Activate User |
| [**changePassword**](#changePassword) | **POST** /api/auth/changePassword | Change password for current User (changePassword) |
| [**checkActivateToken**](#checkActivateToken) | **GET** /api/noauth/activate | Check Activate User Token (checkActivateToken) |
| [**checkResetToken**](#checkResetToken) | **GET** /api/noauth/resetPassword | Check password reset token (checkResetToken) |
| [**getUser**](#getUser) | **GET** /api/auth/user | Get current User (getUser) |
| [**getUserPasswordPolicy**](#getUserPasswordPolicy) | **GET** /api/noauth/userPasswordPolicy | Get the current User password policy (getUserPasswordPolicy) |
| [**logout**](#logout) | **POST** /api/auth/logout | Logout (logout) |
| [**requestResetPasswordByEmail**](#requestResetPasswordByEmail) | **POST** /api/noauth/resetPasswordByEmail | Request reset password email (requestResetPasswordByEmail) |
| [**resetPassword**](#resetPassword) | **POST** /api/noauth/resetPassword | Reset password (resetPassword) |



## activateUser

> JwtPair activateUser(activateUserRequest, sendActivationMail)

Activate User

Checks the activation token and updates corresponding user password in the database. Now the user may start using his password to login. The response already contains the [JWT](https://jwt.io) activation and refresh tokens, to simplify the user activation flow and avoid asking user to input password again after activation. If token is valid, returns the object that contains [JWT](https://jwt.io/) access and refresh tokens. If token is not valid, returns '400 Bad Request'.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **activateUserRequest** | **ActivateUserRequest** |  | |
| **sendActivationMail** | **Boolean** |  | [optional] [default to true] |

### Return type

**JwtPair**


## changePassword

> JwtPair changePassword(changePasswordRequest)

Change password for current User (changePassword)

Change the password for the User which credentials are used to perform this REST API call. Be aware that previously generated [JWT](https://jwt.io/) tokens will be still valid until they expire.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **changePasswordRequest** | **ChangePasswordRequest** |  | |

### Return type

**JwtPair**


## checkActivateToken

> Object checkActivateToken(activateToken)

Check Activate User Token (checkActivateToken)

Checks the activation token and forwards user to 'Create Password' page. If token is valid, returns '303 See Other' (redirect) response code with the correct address of 'Create Password' page and same 'activateToken' specified in the URL parameters. If token is not valid, returns '409 Conflict'. If token is expired, redirects to error page.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **activateToken** | **String** | The activate token string. | |

### Return type

**Object**


## checkResetToken

> Object checkResetToken(resetToken)

Check password reset token (checkResetToken)

Checks the password reset token and forwards user to 'Reset Password' page. If token is valid, returns '303 See Other' (redirect) response code with the correct address of 'Reset Password' page and same 'resetToken' specified in the URL parameters. If token is not valid, returns '409 Conflict'. If token is expired, redirects to error page.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **resetToken** | **String** | The reset token string. | |

### Return type

**Object**


## getUser

> User getUser()

Get current User (getUser)

Get the information about the User which credentials are used to perform this REST API call.

### Return type

**User**


## getUserPasswordPolicy

> UserPasswordPolicy getUserPasswordPolicy()

Get the current User password policy (getUserPasswordPolicy)

API call to get the password policy for the password validation form(s).

### Return type

**UserPasswordPolicy**


## logout

> logout()

Logout (logout)

Special API call to record the 'logout' of the user to the Audit Logs. Since platform uses [JWT](https://jwt.io/), the actual logout is the procedure of clearing the [JWT](https://jwt.io/) token on the client side. 

### Return type

null (empty response body)


## requestResetPasswordByEmail

> requestResetPasswordByEmail(resetPasswordEmailRequest)

Request reset password email (requestResetPasswordByEmail)

Request to send the reset password email if the user with specified email address is present in the database. Always return '200 OK' status for security purposes.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **resetPasswordEmailRequest** | **ResetPasswordEmailRequest** |  | |

### Return type

null (empty response body)


## resetPassword

> resetPassword(resetPasswordRequest)

Reset password (resetPassword)

Checks the password reset token and updates the password. If token is not valid, returns '400 Bad Request'.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **resetPasswordRequest** | **ResetPasswordRequest** |  | |

### Return type

null (empty response body)


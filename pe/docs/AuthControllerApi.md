# AuthControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateUser**](AuthControllerApi.md#activateUser) | **POST** /api/noauth/activate | Activate User |
| [**changePassword**](AuthControllerApi.md#changePassword) | **POST** /api/auth/changePassword | Change password for current User (changePassword) |
| [**checkActivateToken**](AuthControllerApi.md#checkActivateToken) | **GET** /api/noauth/activate | Check Activate User Token (checkActivateToken) |
| [**checkResetToken**](AuthControllerApi.md#checkResetToken) | **GET** /api/noauth/resetPassword | Check password reset token (checkResetToken) |
| [**getUser**](AuthControllerApi.md#getUser) | **GET** /api/auth/user | Get current User (getUser) |
| [**getUserPasswordPolicy**](AuthControllerApi.md#getUserPasswordPolicy) | **GET** /api/noauth/userPasswordPolicy | Get the current User password policy (getUserPasswordPolicy) |
| [**logout**](AuthControllerApi.md#logout) | **POST** /api/auth/logout | Logout (logout) |
| [**requestResetPasswordByEmail**](AuthControllerApi.md#requestResetPasswordByEmail) | **POST** /api/noauth/resetPasswordByEmail | Request reset password email (requestResetPasswordByEmail) |
| [**resetPassword**](AuthControllerApi.md#resetPassword) | **POST** /api/noauth/resetPassword | Reset password (resetPassword) |



## activateUser

> JwtPair activateUser(activateUserRequest, sendActivationMail)

Activate User

Checks the activation token and updates corresponding user password in the database. Now the user may start using his password to login. The response already contains the [JWT](https://jwt.io) activation and refresh tokens, to simplify the user activation flow and avoid asking user to input password again after activation. If token is valid, returns the object that contains [JWT](https://jwt.io/) access and refresh tokens. If token is not valid, returns &#39;400 Bad Request&#39;.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **activateUserRequest** | [**ActivateUserRequest**](ActivateUserRequest.md)|  | |
| **sendActivationMail** | **Boolean**|  | [optional] [default to true] |

### Return type

[**JwtPair**](JwtPair.md)

### Authorization

No authorization required

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


## changePassword

> JwtPair changePassword(changePasswordRequest)

Change password for current User (changePassword)

Change the password for the User which credentials are used to perform this REST API call. Be aware that previously generated [JWT](https://jwt.io/) tokens will be still valid until they expire.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **changePasswordRequest** | [**ChangePasswordRequest**](ChangePasswordRequest.md)|  | |

### Return type

[**JwtPair**](JwtPair.md)

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


## checkActivateToken

> Object checkActivateToken(activateToken)

Check Activate User Token (checkActivateToken)

Checks the activation token and forwards user to &#39;Create Password&#39; page. If token is valid, returns &#39;303 See Other&#39; (redirect) response code with the correct address of &#39;Create Password&#39; page and same &#39;activateToken&#39; specified in the URL parameters. If token is not valid, returns &#39;409 Conflict&#39;. If token is expired, redirects to error page.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **activateToken** | **String**| The activate token string. | |

### Return type

**Object**

### Authorization

No authorization required

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


## checkResetToken

> Object checkResetToken(resetToken)

Check password reset token (checkResetToken)

Checks the password reset token and forwards user to &#39;Reset Password&#39; page. If token is valid, returns &#39;303 See Other&#39; (redirect) response code with the correct address of &#39;Reset Password&#39; page and same &#39;resetToken&#39; specified in the URL parameters. If token is not valid, returns &#39;409 Conflict&#39;. If token is expired, redirects to error page.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **resetToken** | **String**| The reset token string. | |

### Return type

**Object**

### Authorization

No authorization required

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


## getUser

> User getUser()

Get current User (getUser)

Get the information about the User which credentials are used to perform this REST API call.

### Parameters

This endpoint does not need any parameter.

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


## getUserPasswordPolicy

> UserPasswordPolicy getUserPasswordPolicy()

Get the current User password policy (getUserPasswordPolicy)

API call to get the password policy for the password validation form(s).

### Parameters

This endpoint does not need any parameter.

### Return type

[**UserPasswordPolicy**](UserPasswordPolicy.md)

### Authorization

No authorization required

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


## logout

> logout()

Logout (logout)

Special API call to record the &#39;logout&#39; of the user to the Audit Logs. Since platform uses [JWT](https://jwt.io/), the actual logout is the procedure of clearing the [JWT](https://jwt.io/) token on the client side. 

### Parameters

This endpoint does not need any parameter.

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


## requestResetPasswordByEmail

> requestResetPasswordByEmail(resetPasswordEmailRequest)

Request reset password email (requestResetPasswordByEmail)

Request to send the reset password email if the user with specified email address is present in the database. Always return &#39;200 OK&#39; status for security purposes.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **resetPasswordEmailRequest** | [**ResetPasswordEmailRequest**](ResetPasswordEmailRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

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


## resetPassword

> resetPassword(resetPasswordRequest)

Reset password (resetPassword)

Checks the password reset token and updates the password. If token is not valid, returns &#39;400 Bad Request&#39;.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **resetPasswordRequest** | [**ResetPasswordRequest**](ResetPasswordRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

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


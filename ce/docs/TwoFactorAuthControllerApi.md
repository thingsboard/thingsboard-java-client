# TwoFactorAuthControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authenticateByTwoFaConfigurationToken**](TwoFactorAuthControllerApi.md#authenticateByTwoFaConfigurationToken) | **POST** /api/auth/2fa/login | Get regular token pair after successfully configuring 2FA |
| [**checkTwoFaVerificationCode**](TwoFactorAuthControllerApi.md#checkTwoFaVerificationCode) | **POST** /api/auth/2fa/verification/check | Check 2FA verification code (checkTwoFaVerificationCode) |
| [**getAvailableTwoFaProviders**](TwoFactorAuthControllerApi.md#getAvailableTwoFaProviders) | **GET** /api/auth/2fa/providers | Get available 2FA providers (getAvailableTwoFaProviders) |
| [**requestTwoFaVerificationCode**](TwoFactorAuthControllerApi.md#requestTwoFaVerificationCode) | **POST** /api/auth/2fa/verification/send | Request 2FA verification code (requestTwoFaVerificationCode) |



## authenticateByTwoFaConfigurationToken

> JwtPair authenticateByTwoFaConfigurationToken()

Get regular token pair after successfully configuring 2FA

Checks 2FA is configured, returning token pair on success.

### Parameters

This endpoint does not need any parameter.

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


## checkTwoFaVerificationCode

> JwtPair checkTwoFaVerificationCode(providerType, verificationCode)

Check 2FA verification code (checkTwoFaVerificationCode)

Checks 2FA verification code, and if it is correct the method returns a regular access and refresh token pair.  The API method is rate limited (using rate limit config from TwoFactorAuthSettings), and also will block a user after X unsuccessful verification attempts if such behavior is configured (in TwoFactorAuthSettings).  Will return a Bad Request error if provider is not configured for usage, and Too Many Requests error if rate limits are exceeded.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **providerType** | [**TwoFaProviderType**](.md)|  | [enum: TOTP, SMS, EMAIL, BACKUP_CODE] |
| **verificationCode** | **String**|  | |

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


## getAvailableTwoFaProviders

> List&lt;TwoFaProviderInfo&gt; getAvailableTwoFaProviders()

Get available 2FA providers (getAvailableTwoFaProviders)

Get the list of 2FA provider infos available for user to use. Example: &#x60;&#x60;&#x60; [   {     \&quot;type\&quot;: \&quot;EMAIL\&quot;,     \&quot;default\&quot;: true,     \&quot;contact\&quot;: \&quot;ab*****ko@gmail.com\&quot;   },   {     \&quot;type\&quot;: \&quot;TOTP\&quot;,     \&quot;default\&quot;: false,     \&quot;contact\&quot;: null   },   {     \&quot;type\&quot;: \&quot;SMS\&quot;,     \&quot;default\&quot;: false,     \&quot;contact\&quot;: \&quot;+38********12\&quot;   } ] &#x60;&#x60;&#x60;

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;TwoFaProviderInfo&gt;**](TwoFaProviderInfo.md)

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


## requestTwoFaVerificationCode

> requestTwoFaVerificationCode(providerType)

Request 2FA verification code (requestTwoFaVerificationCode)

Request 2FA verification code.  To make a request to this endpoint, you need an access token with the scope of PRE_VERIFICATION_TOKEN, which is issued on username/password auth if 2FA is enabled.  The API method is rate limited (using rate limit config from TwoFactorAuthSettings). Will return a Bad Request error if provider is not configured for usage, and Too Many Requests error if rate limits are exceeded.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **providerType** | [**TwoFaProviderType**](.md)|  | [enum: TOTP, SMS, EMAIL, BACKUP_CODE] |

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


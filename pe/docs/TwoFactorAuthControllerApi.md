# TwoFactorAuthControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authenticateByTwoFaConfigurationToken**](#authenticateByTwoFaConfigurationToken) | **POST** /api/auth/2fa/login | Get regular token pair after successfully configuring 2FA |
| [**checkTwoFaVerificationCode**](#checkTwoFaVerificationCode) | **POST** /api/auth/2fa/verification/check | Check 2FA verification code (checkTwoFaVerificationCode) |
| [**getAvailableTwoFaProviders**](#getAvailableTwoFaProviders) | **GET** /api/auth/2fa/providers | Get available 2FA providers (getAvailableTwoFaProviders) |
| [**requestTwoFaVerificationCode**](#requestTwoFaVerificationCode) | **POST** /api/auth/2fa/verification/send | Request 2FA verification code (requestTwoFaVerificationCode) |



## authenticateByTwoFaConfigurationToken

> JwtPair authenticateByTwoFaConfigurationToken()

Get regular token pair after successfully configuring 2FA

Checks 2FA is configured, returning token pair on success.

### Return type

**JwtPair**


## checkTwoFaVerificationCode

> JwtPair checkTwoFaVerificationCode(providerType, verificationCode)

Check 2FA verification code (checkTwoFaVerificationCode)

Checks 2FA verification code, and if it is correct the method returns a regular access and refresh token pair.  The API method is rate limited (using rate limit config from TwoFactorAuthSettings), and also will block a user after X unsuccessful verification attempts if such behavior is configured (in TwoFactorAuthSettings).  Will return a Bad Request error if provider is not configured for usage, and Too Many Requests error if rate limits are exceeded.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **providerType** | **TwoFaProviderType** |  | [enum: TOTP, SMS, EMAIL, BACKUP_CODE] |
| **verificationCode** | **String** |  | |

### Return type

**JwtPair**


## getAvailableTwoFaProviders

> List<TwoFaProviderInfo> getAvailableTwoFaProviders()

Get available 2FA providers (getAvailableTwoFaProviders)

Get the list of 2FA provider infos available for user to use. Example: ``` [   {     \"type\": \"EMAIL\",     \"default\": true,     \"contact\": \"ab*****ko@gmail.com\"   },   {     \"type\": \"TOTP\",     \"default\": false,     \"contact\": null   },   {     \"type\": \"SMS\",     \"default\": false,     \"contact\": \"+38********12\"   } ] ```

### Return type

**List<TwoFaProviderInfo>**


## requestTwoFaVerificationCode

> requestTwoFaVerificationCode(providerType)

Request 2FA verification code (requestTwoFaVerificationCode)

Request 2FA verification code.  To make a request to this endpoint, you need an access token with the scope of PRE_VERIFICATION_TOKEN, which is issued on username/password auth if 2FA is enabled.  The API method is rate limited (using rate limit config from TwoFactorAuthSettings). Will return a Bad Request error if provider is not configured for usage, and Too Many Requests error if rate limits are exceeded.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **providerType** | **TwoFaProviderType** |  | [enum: TOTP, SMS, EMAIL, BACKUP_CODE] |

### Return type

null (empty response body)


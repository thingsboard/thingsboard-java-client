# TwoFactorAuthConfigControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteTwoFaAccountConfig**](#deleteTwoFaAccountConfig) | **DELETE** /api/2fa/account/config | Delete 2FA account config (deleteTwoFaAccountConfig) |
| [**generateTwoFaAccountConfig**](#generateTwoFaAccountConfig) | **POST** /api/2fa/account/config/generate | Generate 2FA account config (generateTwoFaAccountConfig) |
| [**getAccountTwoFaSettings**](#getAccountTwoFaSettings) | **GET** /api/2fa/account/settings | Get account 2FA settings (getAccountTwoFaSettings) |
| [**getAvailableTwoFaProviders1**](#getAvailableTwoFaProviders1) | **GET** /api/2fa/providers | Get available 2FA providers (getAvailableTwoFaProviders) |
| [**getPlatformTwoFaSettings**](#getPlatformTwoFaSettings) | **GET** /api/2fa/settings | Get platform 2FA settings (getPlatformTwoFaSettings) |
| [**savePlatformTwoFaSettings**](#savePlatformTwoFaSettings) | **POST** /api/2fa/settings | Save platform 2FA settings (savePlatformTwoFaSettings) |
| [**submitTwoFaAccountConfig**](#submitTwoFaAccountConfig) | **POST** /api/2fa/account/config/submit | Submit 2FA account config (submitTwoFaAccountConfig) |
| [**updateTwoFaAccountConfig**](#updateTwoFaAccountConfig) | **PUT** /api/2fa/account/config | Update 2FA account config (updateTwoFaAccountConfig) |
| [**verifyAndSaveTwoFaAccountConfig**](#verifyAndSaveTwoFaAccountConfig) | **POST** /api/2fa/account/config | Verify and save 2FA account config (verifyAndSaveTwoFaAccountConfig) |



## deleteTwoFaAccountConfig

> AccountTwoFaSettings deleteTwoFaAccountConfig(providerType)

Delete 2FA account config (deleteTwoFaAccountConfig)

Delete 2FA config for a given 2FA provider type.  Returns whole account&#39;s 2FA settings object.   Available for any authorized user. 

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **providerType** | **TwoFaProviderType** |  | [enum: TOTP, SMS, EMAIL, BACKUP_CODE] |


## generateTwoFaAccountConfig

> TwoFaAccountConfig generateTwoFaAccountConfig(providerType)

Generate 2FA account config (generateTwoFaAccountConfig)

Generate new 2FA account config template for specified provider type.   For TOTP, this will return a corresponding account config template with a generated OTP auth URL (with new random secret key for each API call) that can be then converted to a QR code to scan with an authenticator app. Example: &#x60;&#x60;&#x60; {   \&quot;providerType\&quot;: \&quot;TOTP\&quot;,   \&quot;useByDefault\&quot;: false,   \&quot;authUrl\&quot;: \&quot;otpauth://totp/TB%202FA:tenant@thingsboard.org?issuer&#x3D;TB+2FA&amp;secret&#x3D;PNJDNWJVAK4ZTUYT7RFGPQLXA7XGU7PX\&quot; } &#x60;&#x60;&#x60;  For EMAIL, the generated config will contain email from user&#39;s account: &#x60;&#x60;&#x60; {   \&quot;providerType\&quot;: \&quot;EMAIL\&quot;,   \&quot;useByDefault\&quot;: false,   \&quot;email\&quot;: \&quot;tenant@thingsboard.org\&quot; } &#x60;&#x60;&#x60;  For SMS 2FA this method will just return a config with empty/default values as there is nothing to generate/preset: &#x60;&#x60;&#x60; {   \&quot;providerType\&quot;: \&quot;SMS\&quot;,   \&quot;useByDefault\&quot;: false,   \&quot;phoneNumber\&quot;: null } &#x60;&#x60;&#x60;  Will throw an error (Bad Request) if the provider is not configured for usage.   Available for any authorized user. 

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **providerType** | **String** | 2FA provider type to generate new account config for | |


## getAccountTwoFaSettings

> AccountTwoFaSettings getAccountTwoFaSettings()

Get account 2FA settings (getAccountTwoFaSettings)

Get user&#39;s account 2FA configuration. Configuration contains configs for different 2FA providers.  Example: &#x60;&#x60;&#x60; {   \&quot;configs\&quot;: {     \&quot;EMAIL\&quot;: {       \&quot;providerType\&quot;: \&quot;EMAIL\&quot;,       \&quot;useByDefault\&quot;: true,       \&quot;email\&quot;: \&quot;tenant@thingsboard.org\&quot;     },     \&quot;TOTP\&quot;: {       \&quot;providerType\&quot;: \&quot;TOTP\&quot;,       \&quot;useByDefault\&quot;: false,       \&quot;authUrl\&quot;: \&quot;otpauth://totp/TB%202FA:tenant@thingsboard.org?issuer&#x3D;TB+2FA&amp;secret&#x3D;P6Z2TLYTASOGP6LCJZAD24ETT5DACNNX\&quot;     },     \&quot;SMS\&quot;: {       \&quot;providerType\&quot;: \&quot;SMS\&quot;,       \&quot;useByDefault\&quot;: false,       \&quot;phoneNumber\&quot;: \&quot;+380501253652\&quot;     }   } } &#x60;&#x60;&#x60;  Available for any authorized user. 

## getAvailableTwoFaProviders1

> List&lt;TwoFaProviderType&gt; getAvailableTwoFaProviders1()

Get available 2FA providers (getAvailableTwoFaProviders)

Get the list of provider types available for user to use (the ones configured by tenant or sysadmin). Example of response: &#x60;&#x60;&#x60; [   \&quot;TOTP\&quot;,   \&quot;EMAIL\&quot;,   \&quot;SMS\&quot; ] &#x60;&#x60;&#x60;  Available for any authorized user. 

## getPlatformTwoFaSettings

> PlatformTwoFaSettings getPlatformTwoFaSettings()

Get platform 2FA settings (getPlatformTwoFaSettings)

Get platform settings for 2FA. The settings are described for savePlatformTwoFaSettings API method. If 2FA is not configured, then an empty response will be returned.  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

## savePlatformTwoFaSettings

> PlatformTwoFaSettings savePlatformTwoFaSettings(platformTwoFaSettings)

Save platform 2FA settings (savePlatformTwoFaSettings)

Save 2FA settings for platform. The settings have following properties: - &#x60;providers&#x60; - the list of 2FA providers&#39; configs. Users will only be allowed to use 2FA providers from this list.   - &#x60;minVerificationCodeSendPeriod&#x60; - minimal period in seconds to wait after verification code send request to send next request.  - &#x60;verificationCodeCheckRateLimit&#x60; - rate limit configuration for verification code checking. The format is standard: &#39;amountOfRequests:periodInSeconds&#39;. The value of &#39;1:60&#39; would limit verification code checking requests to one per minute. - &#x60;maxVerificationFailuresBeforeUserLockout&#x60; - maximum number of verification failures before a user gets disabled. - &#x60;totalAllowedTimeForVerification&#x60; - total amount of time in seconds allotted for verification. Basically, this property sets a lifetime for pre-verification token. If not set, default value of 30 minutes is used.   TOTP 2FA provider config has following settings: - &#x60;issuerName&#x60; - issuer name that will be displayed in an authenticator app near a username. Must not be blank.  For SMS 2FA provider: - &#x60;smsVerificationMessageTemplate&#x60; - verification message template.  Available template variables are ${code} and ${userEmail}. It must not be blank and must contain verification code variable. - &#x60;verificationCodeLifetime&#x60; - verification code lifetime in seconds. Required to be positive.  For EMAIL provider type: - &#x60;verificationCodeLifetime&#x60; - the same as for SMS.  Example of the settings: &#x60;&#x60;&#x60; {   \&quot;providers\&quot;: [     {       \&quot;providerType\&quot;: \&quot;TOTP\&quot;,       \&quot;issuerName\&quot;: \&quot;TB\&quot;     },     {       \&quot;providerType\&quot;: \&quot;EMAIL\&quot;,       \&quot;verificationCodeLifetime\&quot;: 60     },     {       \&quot;providerType\&quot;: \&quot;SMS\&quot;,       \&quot;verificationCodeLifetime\&quot;: 60,       \&quot;smsVerificationMessageTemplate\&quot;: \&quot;Here is your verification code: ${code}\&quot;     }   ],   \&quot;minVerificationCodeSendPeriod\&quot;: 60,   \&quot;verificationCodeCheckRateLimit\&quot;: \&quot;3:900\&quot;,   \&quot;maxVerificationFailuresBeforeUserLockout\&quot;: 10,   \&quot;totalAllowedTimeForVerification\&quot;: 600 } &#x60;&#x60;&#x60;  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **platformTwoFaSettings** | **PlatformTwoFaSettings** |  | |


## submitTwoFaAccountConfig

> submitTwoFaAccountConfig(twoFaAccountConfig)

Submit 2FA account config (submitTwoFaAccountConfig)

Submit 2FA account config to prepare for a future verification. Basically, this method will send a verification code for a given account config, if this has sense for a chosen 2FA provider. This code is needed to then verify and save the account config.  Example of EMAIL 2FA account config: &#x60;&#x60;&#x60; {   \&quot;providerType\&quot;: \&quot;EMAIL\&quot;,   \&quot;useByDefault\&quot;: true,   \&quot;email\&quot;: \&quot;separate-email-for-2fa@thingsboard.org\&quot; } &#x60;&#x60;&#x60;  Example of SMS 2FA account config: &#x60;&#x60;&#x60; {   \&quot;providerType\&quot;: \&quot;SMS\&quot;,   \&quot;useByDefault\&quot;: false,   \&quot;phoneNumber\&quot;: \&quot;+38012312321\&quot; } &#x60;&#x60;&#x60;  For TOTP this method does nothing.  Will throw an error (Bad Request) if submitted account config is not valid, or if the provider is not configured for usage.   Available for any authorized user. 

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **twoFaAccountConfig** | **TwoFaAccountConfig** |  | |


## updateTwoFaAccountConfig

> AccountTwoFaSettings updateTwoFaAccountConfig(providerType, twoFaAccountConfigUpdateRequest)

Update 2FA account config (updateTwoFaAccountConfig)

Update config for a given provider type.  Update request example: &#x60;&#x60;&#x60; {   \&quot;useByDefault\&quot;: true } &#x60;&#x60;&#x60; Returns whole account&#39;s 2FA settings object.   Available for any authorized user. 

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **providerType** | **TwoFaProviderType** |  | [enum: TOTP, SMS, EMAIL, BACKUP_CODE] |
| **twoFaAccountConfigUpdateRequest** | **TwoFaAccountConfigUpdateRequest** |  | |


## verifyAndSaveTwoFaAccountConfig

> AccountTwoFaSettings verifyAndSaveTwoFaAccountConfig(twoFaAccountConfig, verificationCode)

Verify and save 2FA account config (verifyAndSaveTwoFaAccountConfig)

Checks the verification code for submitted config, and if it is correct, saves the provided account config.   Returns whole account&#39;s 2FA settings object. Will throw an error (Bad Request) if the provider is not configured for usage.   Available for any authorized user. 

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **twoFaAccountConfig** | **TwoFaAccountConfig** |  | |
| **verificationCode** | **String** |  | [optional] |


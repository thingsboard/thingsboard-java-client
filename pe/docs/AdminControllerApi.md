# AdminControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**autoCommitSettingsExists**](#autoCommitSettingsExists) | **GET** /api/admin/autoCommitSettings/exists | Check auto commit settings exists (autoCommitSettingsExists) |
| [**checkRepositoryAccess**](#checkRepositoryAccess) | **POST** /api/admin/repositorySettings/checkAccess | Check repository access (checkRepositoryAccess) |
| [**checkUpdates**](#checkUpdates) | **GET** /api/admin/updates | Check for new Platform Releases (checkUpdates) |
| [**deleteAutoCommitSettings**](#deleteAutoCommitSettings) | **DELETE** /api/admin/autoCommitSettings | Delete auto commit settings (deleteAutoCommitSettings) |
| [**deleteRepositorySettings**](#deleteRepositorySettings) | **DELETE** /api/admin/repositorySettings | Delete repository settings (deleteRepositorySettings) |
| [**getAdminSettings**](#getAdminSettings) | **GET** /api/admin/settings/{key} | Get the Administration Settings object using key (getAdminSettings) |
| [**getAutoCommitSettings**](#getAutoCommitSettings) | **GET** /api/admin/autoCommitSettings | Get auto commit settings (getAutoCommitSettings) |
| [**getFeaturesInfo**](#getFeaturesInfo) | **GET** /api/admin/featuresInfo | Get features info (getFeaturesInfo) |
| [**getJwtSettings**](#getJwtSettings) | **GET** /api/admin/jwtSettings | Get the JWT Settings object (getJwtSettings) |
| [**getLicenseUsageInfo**](#getLicenseUsageInfo) | **GET** /api/admin/licenseUsageInfo | Get license usage info (getLicenseUsageInfo) |
| [**getMailOAuth2AuthorizationUrl**](#getMailOAuth2AuthorizationUrl) | **GET** /api/admin/mail/oauth2/authorize | Redirect user to mail provider login page.  |
| [**getMailOAuth2RedirectUri**](#getMailOAuth2RedirectUri) | **GET** /api/admin/mail/oauth2/loginProcessingUrl | Get OAuth2 log in processing URL (getMailOAuth2RedirectUri) |
| [**getRepositorySettings**](#getRepositorySettings) | **GET** /api/admin/repositorySettings | Get repository settings (getRepositorySettings) |
| [**getRepositorySettingsInfo**](#getRepositorySettingsInfo) | **GET** /api/admin/repositorySettings/info | getRepositorySettingsInfo |
| [**getSecuritySettings**](#getSecuritySettings) | **GET** /api/admin/securitySettings | Get the Security Settings object (getSecuritySettings) |
| [**getSystemInfo**](#getSystemInfo) | **GET** /api/admin/systemInfo | Get system info (getSystemInfo) |
| [**handleMailOAuth2Callback**](#handleMailOAuth2Callback) | **GET** /api/admin/mail/oauth2/code | handleMailOAuth2Callback |
| [**repositorySettingsExists**](#repositorySettingsExists) | **GET** /api/admin/repositorySettings/exists | Check repository settings exists (repositorySettingsExists) |
| [**saveAdminSettings**](#saveAdminSettings) | **POST** /api/admin/settings | Creates or Updates the Administration Settings (saveAdminSettings) |
| [**saveAutoCommitSettings**](#saveAutoCommitSettings) | **POST** /api/admin/autoCommitSettings | Creates or Updates the auto commit settings (saveAutoCommitSettings) |
| [**saveJwtSettings**](#saveJwtSettings) | **POST** /api/admin/jwtSettings | Update JWT Settings (saveJwtSettings) |
| [**saveRepositorySettings**](#saveRepositorySettings) | **POST** /api/admin/repositorySettings | Creates or Updates the repository settings (saveRepositorySettings) |
| [**saveSecuritySettings**](#saveSecuritySettings) | **POST** /api/admin/securitySettings | Update Security Settings (saveSecuritySettings) |
| [**sendTestMail**](#sendTestMail) | **POST** /api/admin/settings/testMail | Send test email (sendTestMail) |
| [**sendTestSms**](#sendTestSms) | **POST** /api/admin/settings/testSms | Send test sms (sendTestSms) |



## autoCommitSettingsExists

> Boolean autoCommitSettingsExists()

Check auto commit settings exists (autoCommitSettingsExists)

Check whether the auto commit settings exists.   Available for users with 'TENANT_ADMIN' authority.

### Return type

**Boolean**


## checkRepositoryAccess

> checkRepositoryAccess(repositorySettings)

Check repository access (checkRepositoryAccess)

Attempts to check repository access.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **repositorySettings** | **RepositorySettings** |  | |

### Return type

null (empty response body)


## checkUpdates

> UpdateMessage checkUpdates()

Check for new Platform Releases (checkUpdates)

Check notifications about new platform releases.   Available for users with 'SYS_ADMIN' authority.

### Return type

**UpdateMessage**


## deleteAutoCommitSettings

> deleteAutoCommitSettings()

Delete auto commit settings (deleteAutoCommitSettings)

Deletes the auto commit settings.  Available for users with 'TENANT_ADMIN' authority.

### Return type

null (empty response body)


## deleteRepositorySettings

> deleteRepositorySettings()

Delete repository settings (deleteRepositorySettings)

Deletes the repository settings.  Available for users with 'TENANT_ADMIN' authority.

### Return type

null (empty response body)


## getAdminSettings

> AdminSettings getAdminSettings(key, systemByDefault)

Get the Administration Settings object using key (getAdminSettings)

Get the Administration Settings object using specified string key. Referencing non-existing key will cause an error.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.  Security check is performed to verify that the user has 'READ' permission for the 'ADMIN_SETTINGS' (for 'SYS_ADMIN' authority) or 'WHITE_LABELING' (for 'TENANT_ADMIN' authority) resource.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **key** | **String** | A string value of the key (e.g. 'general' or 'mail'). | |
| **systemByDefault** | **Boolean** | Use system settings if settings are not defined on tenant level. | [optional] [default to false] |

### Return type

**AdminSettings**


## getAutoCommitSettings

> Map<String, AutoVersionCreateConfig> getAutoCommitSettings()

Get auto commit settings (getAutoCommitSettings)

Get the auto commit settings object.   Available for users with 'TENANT_ADMIN' authority.

### Return type

**Map<String, AutoVersionCreateConfig>**


## getFeaturesInfo

> FeaturesInfo getFeaturesInfo()

Get features info (getFeaturesInfo)

Get information about enabled/disabled features.   Available for users with 'SYS_ADMIN' authority.

### Return type

**FeaturesInfo**


## getJwtSettings

> JwtSettings getJwtSettings()

Get the JWT Settings object (getJwtSettings)

Get the JWT Settings object that contains JWT token policy, etc.   Available for users with 'SYS_ADMIN' authority.

### Return type

**JwtSettings**


## getLicenseUsageInfo

> LicenseUsageInfo getLicenseUsageInfo()

Get license usage info (getLicenseUsageInfo)

Get license usage info.   Available for users with 'SYS_ADMIN' authority.

### Return type

**LicenseUsageInfo**


## getMailOAuth2AuthorizationUrl

> String getMailOAuth2AuthorizationUrl()

Redirect user to mail provider login page. 

After user logged in and provided accessprovider sends authorization code to specified redirect uri.)

### Return type

**String**


## getMailOAuth2RedirectUri

> String getMailOAuth2RedirectUri()

Get OAuth2 log in processing URL (getMailOAuth2RedirectUri)

Returns the URL enclosed in double quotes. After successful authentication with OAuth2 provider and user consent for requested scope, it makes a redirect to this path so that the platform can do further log in processing and generating access tokens.   Available for users with 'SYS_ADMIN' authority.

### Return type

**String**


## getRepositorySettings

> RepositorySettings getRepositorySettings()

Get repository settings (getRepositorySettings)

Get the repository settings object.   Available for users with 'TENANT_ADMIN' authority.

### Return type

**RepositorySettings**


## getRepositorySettingsInfo

> RepositorySettingsInfo getRepositorySettingsInfo()

getRepositorySettingsInfo

### Return type

**RepositorySettingsInfo**


## getSecuritySettings

> SecuritySettings getSecuritySettings()

Get the Security Settings object (getSecuritySettings)

Get the Security Settings object that contains password policy, etc.  Available for users with 'SYS_ADMIN' authority.  Security check is performed to verify that the user has 'READ' permission for the 'ADMIN_SETTINGS' (for 'SYS_ADMIN' authority) or 'WHITE_LABELING' (for 'TENANT_ADMIN' authority) resource.

### Return type

**SecuritySettings**


## getSystemInfo

> SystemInfo getSystemInfo()

Get system info (getSystemInfo)

Get main information about system.   Available for users with 'SYS_ADMIN' authority.

### Return type

**SystemInfo**


## handleMailOAuth2Callback

> handleMailOAuth2Callback(code, state)

handleMailOAuth2Callback


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **code** | **String** |  | |
| **state** | **String** |  | |

### Return type

null (empty response body)


## repositorySettingsExists

> Boolean repositorySettingsExists()

Check repository settings exists (repositorySettingsExists)

Check whether the repository settings exists.   Available for users with 'TENANT_ADMIN' authority.

### Return type

**Boolean**


## saveAdminSettings

> AdminSettings saveAdminSettings(adminSettings)

Creates or Updates the Administration Settings (saveAdminSettings)

Creates or Updates the Administration Settings. Platform generates random Administration Settings Id during settings creation. The Administration Settings Id will be present in the response. Specify the Administration Settings Id when you would like to update the Administration Settings. Referencing non-existing Administration Settings Id will cause an error.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.  Security check is performed to verify that the user has 'WRITE' permission for the 'ADMIN_SETTINGS' (for 'SYS_ADMIN' authority) or 'WHITE_LABELING' (for 'TENANT_ADMIN' authority) resource.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adminSettings** | **AdminSettings** | A JSON value representing the Administration Settings. | |

### Return type

**AdminSettings**


## saveAutoCommitSettings

> Map<String, AutoVersionCreateConfig> saveAutoCommitSettings(requestBody)

Creates or Updates the auto commit settings (saveAutoCommitSettings)

Creates or Updates the auto commit settings object.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestBody** | **Map<String, AutoVersionCreateConfig>** |  | |

### Return type

**Map<String, AutoVersionCreateConfig>**


## saveJwtSettings

> JwtPair saveJwtSettings(jwtSettings)

Update JWT Settings (saveJwtSettings)

Updates the JWT Settings object that contains JWT token policy, etc. The tokenSigningKey field is a Base64 encoded string.  Available for users with 'SYS_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jwtSettings** | **JwtSettings** |  | |

### Return type

**JwtPair**


## saveRepositorySettings

> RepositorySettings saveRepositorySettings(repositorySettings)

Creates or Updates the repository settings (saveRepositorySettings)

Creates or Updates the repository settings object.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **repositorySettings** | **RepositorySettings** |  | |

### Return type

**RepositorySettings**


## saveSecuritySettings

> SecuritySettings saveSecuritySettings(securitySettings)

Update Security Settings (saveSecuritySettings)

Updates the Security Settings object that contains password policy, etc.  Available for users with 'SYS_ADMIN' authority.  Security check is performed to verify that the user has 'WRITE' permission for the 'ADMIN_SETTINGS' (for 'SYS_ADMIN' authority) or 'WHITE_LABELING' (for 'TENANT_ADMIN' authority) resource.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **securitySettings** | **SecuritySettings** |  | |

### Return type

**SecuritySettings**


## sendTestMail

> sendTestMail(adminSettings)

Send test email (sendTestMail)

Attempts to send test email using Mail Settings provided as a parameter. Email is sent to the address specified in the profile of user who is performing the requestYou may change the 'To' email in the user profile of the System/Tenant Administrator.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.  Security check is performed to verify that the user has 'READ' permission for the 'ADMIN_SETTINGS' (for 'SYS_ADMIN' authority) or 'WHITE_LABELING' (for 'TENANT_ADMIN' authority) resource.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adminSettings** | **AdminSettings** |  | |

### Return type

null (empty response body)


## sendTestSms

> sendTestSms(testSmsRequest)

Send test sms (sendTestSms)

Attempts to send test sms to the System Administrator User using SMS Settings and phone number provided as a parameters of the request.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.  Security check is performed to verify that the user has 'READ' permission for the 'ADMIN_SETTINGS' (for 'SYS_ADMIN' authority) or 'WHITE_LABELING' (for 'TENANT_ADMIN' authority) resource.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **testSmsRequest** | **TestSmsRequest** |  | |

### Return type

null (empty response body)


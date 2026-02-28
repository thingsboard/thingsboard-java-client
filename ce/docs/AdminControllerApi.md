# AdminControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**autoCommitSettingsExists**](#autoCommitSettingsExists) | **GET** /api/admin/autoCommitSettings/exists | Check auto commit settings exists (autoCommitSettingsExists) |
| [**checkRepositoryAccess**](#checkRepositoryAccess) | **POST** /api/admin/repositorySettings/checkAccess | Check repository access (checkRepositoryAccess) |
| [**checkUpdates**](#checkUpdates) | **GET** /api/admin/updates | Check for new Platform Releases (checkUpdates) |
| [**codeProcessingUrl**](#codeProcessingUrl) | **GET** /api/admin/mail/oauth2/code | codeProcessingUrl |
| [**deleteAutoCommitSettings**](#deleteAutoCommitSettings) | **DELETE** /api/admin/autoCommitSettings | Delete auto commit settings (deleteAutoCommitSettings) |
| [**deleteRepositorySettings**](#deleteRepositorySettings) | **DELETE** /api/admin/repositorySettings | Delete repository settings (deleteRepositorySettings) |
| [**getAdminSettings**](#getAdminSettings) | **GET** /api/admin/settings/{key} | Get the Administration Settings object using key (getAdminSettings) |
| [**getAuthorizationUrl**](#getAuthorizationUrl) | **GET** /api/admin/mail/oauth2/authorize | Redirect user to mail provider login page.  |
| [**getAutoCommitSettings**](#getAutoCommitSettings) | **GET** /api/admin/autoCommitSettings | Get auto commit settings (getAutoCommitSettings) |
| [**getFeaturesInfo**](#getFeaturesInfo) | **GET** /api/admin/featuresInfo | Get features info (getFeaturesInfo) |
| [**getJwtSettings**](#getJwtSettings) | **GET** /api/admin/jwtSettings | Get the JWT Settings object (getJwtSettings) |
| [**getMailProcessingUrl**](#getMailProcessingUrl) | **GET** /api/admin/mail/oauth2/loginProcessingUrl | Get OAuth2 log in processing URL (getMailProcessingUrl) |
| [**getRepositorySettings**](#getRepositorySettings) | **GET** /api/admin/repositorySettings | Get repository settings (getRepositorySettings) |
| [**getRepositorySettingsInfo**](#getRepositorySettingsInfo) | **GET** /api/admin/repositorySettings/info | getRepositorySettingsInfo |
| [**getSecuritySettings**](#getSecuritySettings) | **GET** /api/admin/securitySettings | Get the Security Settings object (getSecuritySettings) |
| [**getSystemInfo**](#getSystemInfo) | **GET** /api/admin/systemInfo | Get system info (getSystemInfo) |
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

Check whether the auto commit settings exists.   Available for users with &#39;TENANT_ADMIN&#39; authority.

## checkRepositoryAccess

> checkRepositoryAccess(repositorySettings)

Check repository access (checkRepositoryAccess)

Attempts to check repository access.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **repositorySettings** | **RepositorySettings** |  | |


## checkUpdates

> UpdateMessage checkUpdates()

Check for new Platform Releases (checkUpdates)

Check notifications about new platform releases.   Available for users with &#39;SYS_ADMIN&#39; authority.

## codeProcessingUrl

> codeProcessingUrl(code, state)

codeProcessingUrl

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **code** | **String** |  | |
| **state** | **String** |  | |


## deleteAutoCommitSettings

> deleteAutoCommitSettings()

Delete auto commit settings (deleteAutoCommitSettings)

Deletes the auto commit settings.  Available for users with &#39;TENANT_ADMIN&#39; authority.

## deleteRepositorySettings

> deleteRepositorySettings()

Delete repository settings (deleteRepositorySettings)

Deletes the repository settings.  Available for users with &#39;TENANT_ADMIN&#39; authority.

## getAdminSettings

> AdminSettings getAdminSettings(key)

Get the Administration Settings object using key (getAdminSettings)

Get the Administration Settings object using specified string key. Referencing non-existing key will cause an error.  Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **key** | **String** | A string value of the key (e.g. &#39;general&#39; or &#39;mail&#39;). | |


## getAuthorizationUrl

> String getAuthorizationUrl()

Redirect user to mail provider login page. 

After user logged in and provided accessprovider sends authorization code to specified redirect uri.)

## getAutoCommitSettings

> Map&lt;String, AutoVersionCreateConfig&gt; getAutoCommitSettings()

Get auto commit settings (getAutoCommitSettings)

Get the auto commit settings object.   Available for users with &#39;TENANT_ADMIN&#39; authority.

## getFeaturesInfo

> FeaturesInfo getFeaturesInfo()

Get features info (getFeaturesInfo)

Get information about enabled/disabled features.   Available for users with &#39;SYS_ADMIN&#39; authority.

## getJwtSettings

> JwtSettings getJwtSettings()

Get the JWT Settings object (getJwtSettings)

Get the JWT Settings object that contains JWT token policy, etc.   Available for users with &#39;SYS_ADMIN&#39; authority.

## getMailProcessingUrl

> String getMailProcessingUrl()

Get OAuth2 log in processing URL (getMailProcessingUrl)

Returns the URL enclosed in double quotes. After successful authentication with OAuth2 provider and user consent for requested scope, it makes a redirect to this path so that the platform can do further log in processing and generating access tokens.   Available for users with &#39;SYS_ADMIN&#39; authority.

## getRepositorySettings

> RepositorySettings getRepositorySettings()

Get repository settings (getRepositorySettings)

Get the repository settings object.   Available for users with &#39;TENANT_ADMIN&#39; authority.

## getRepositorySettingsInfo

> RepositorySettingsInfo getRepositorySettingsInfo()

getRepositorySettingsInfo

## getSecuritySettings

> SecuritySettings getSecuritySettings()

Get the Security Settings object (getSecuritySettings)

Get the Security Settings object that contains password policy, etc.  Available for users with &#39;SYS_ADMIN&#39; authority.

## getSystemInfo

> SystemInfo getSystemInfo()

Get system info (getSystemInfo)

Get main information about system.   Available for users with &#39;SYS_ADMIN&#39; authority.

## repositorySettingsExists

> Boolean repositorySettingsExists()

Check repository settings exists (repositorySettingsExists)

Check whether the repository settings exists.   Available for users with &#39;TENANT_ADMIN&#39; authority.

## saveAdminSettings

> AdminSettings saveAdminSettings(adminSettings)

Creates or Updates the Administration Settings (saveAdminSettings)

Creates or Updates the Administration Settings. Platform generates random Administration Settings Id during settings creation. The Administration Settings Id will be present in the response. Specify the Administration Settings Id when you would like to update the Administration Settings. Referencing non-existing Administration Settings Id will cause an error.  Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adminSettings** | **AdminSettings** |  | |


## saveAutoCommitSettings

> Map&lt;String, AutoVersionCreateConfig&gt; saveAutoCommitSettings(requestBody)

Creates or Updates the auto commit settings (saveAutoCommitSettings)

Creates or Updates the auto commit settings object.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestBody** | **Map&lt;String, AutoVersionCreateConfig&gt;** |  | |


## saveJwtSettings

> JwtPair saveJwtSettings(jwtSettings)

Update JWT Settings (saveJwtSettings)

Updates the JWT Settings object that contains JWT token policy, etc. The tokenSigningKey field is a Base64 encoded string.  Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jwtSettings** | **JwtSettings** |  | |


## saveRepositorySettings

> RepositorySettings saveRepositorySettings(repositorySettings)

Creates or Updates the repository settings (saveRepositorySettings)

Creates or Updates the repository settings object.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **repositorySettings** | **RepositorySettings** |  | |


## saveSecuritySettings

> SecuritySettings saveSecuritySettings(securitySettings)

Update Security Settings (saveSecuritySettings)

Updates the Security Settings object that contains password policy, etc.  Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **securitySettings** | **SecuritySettings** |  | |


## sendTestMail

> sendTestMail(adminSettings)

Send test email (sendTestMail)

Attempts to send test email to the System Administrator User using Mail Settings provided as a parameter. You may change the &#39;To&#39; email in the user profile of the System Administrator.   Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adminSettings** | **AdminSettings** |  | |


## sendTestSms

> sendTestSms(testSmsRequest)

Send test sms (sendTestSms)

Attempts to send test sms to the System Administrator User using SMS Settings and phone number provided as a parameters of the request.   Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **testSmsRequest** | **TestSmsRequest** |  | |


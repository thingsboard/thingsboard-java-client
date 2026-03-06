# AdminControllerApi

`ThingsboardClient` methods:

```
Boolean autoCommitSettingsExists() // Check auto commit settings exists (autoCommitSettingsExists)
void checkRepositoryAccess(@Nonnull RepositorySettings repositorySettings) // Check repository access (checkRepositoryAccess)
UpdateMessage checkUpdates() // Check for new Platform Releases (checkUpdates)
void deleteAutoCommitSettings() // Delete auto commit settings (deleteAutoCommitSettings)
void deleteRepositorySettings() // Delete repository settings (deleteRepositorySettings)
AdminSettings getAdminSettings(@Nonnull String key) // Get the Administration Settings object using key (getAdminSettings)
Map<String, AutoVersionCreateConfig> getAutoCommitSettings() // Get auto commit settings (getAutoCommitSettings)
FeaturesInfo getFeaturesInfo() // Get features info (getFeaturesInfo)
JwtSettings getJwtSettings() // Get the JWT Settings object (getJwtSettings)
String getMailOAuth2AuthorizationUrl() // Redirect user to mail provider login page. 
String getMailProcessingUrl() // Get OAuth2 log in processing URL (getMailProcessingUrl)
RepositorySettings getRepositorySettings() // Get repository settings (getRepositorySettings)
RepositorySettingsInfo getRepositorySettingsInfo() // getRepositorySettingsInfo
SecuritySettings getSecuritySettings() // Get the Security Settings object (getSecuritySettings)
SystemInfo getSystemInfo() // Get system info (getSystemInfo)
void handleMailOAuth2Callback(@Nonnull String code, @Nonnull String state) // handleMailOAuth2Callback
Boolean repositorySettingsExists() // Check repository settings exists (repositorySettingsExists)
AdminSettings saveAdminSettings(@Nonnull AdminSettings adminSettings) // Creates or Updates the Administration Settings (saveAdminSettings)
Map<String, AutoVersionCreateConfig> saveAutoCommitSettings(@Nonnull Map<String, AutoVersionCreateConfig> requestBody) // Creates or Updates the auto commit settings (saveAutoCommitSettings)
JwtPair saveJwtSettings(@Nonnull JwtSettings jwtSettings) // Update JWT Settings (saveJwtSettings)
RepositorySettings saveRepositorySettings(@Nonnull RepositorySettings repositorySettings) // Creates or Updates the repository settings (saveRepositorySettings)
SecuritySettings saveSecuritySettings(@Nonnull SecuritySettings securitySettings) // Update Security Settings (saveSecuritySettings)
void sendTestMail(@Nonnull AdminSettings adminSettings) // Send test email (sendTestMail)
void sendTestSms(@Nonnull TestSmsRequest testSmsRequest) // Send test sms (sendTestSms)
```


## autoCommitSettingsExists

```
Boolean autoCommitSettingsExists()
```

**GET** `/api/admin/autoCommitSettings/exists`

Check auto commit settings exists (autoCommitSettingsExists)

Check whether the auto commit settings exists.   Available for users with 'TENANT_ADMIN' authority.

### Return type

**Boolean**


## checkRepositoryAccess

```
void checkRepositoryAccess(@Nonnull RepositorySettings repositorySettings)
```

**POST** `/api/admin/repositorySettings/checkAccess`

Check repository access (checkRepositoryAccess)

Attempts to check repository access.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **repositorySettings** | **RepositorySettings** |  | |

### Return type

null (empty response body)


## checkUpdates

```
UpdateMessage checkUpdates()
```

**GET** `/api/admin/updates`

Check for new Platform Releases (checkUpdates)

Check notifications about new platform releases.   Available for users with 'SYS_ADMIN' authority.

### Return type

**UpdateMessage**


## deleteAutoCommitSettings

```
void deleteAutoCommitSettings()
```

**DELETE** `/api/admin/autoCommitSettings`

Delete auto commit settings (deleteAutoCommitSettings)

Deletes the auto commit settings.  Available for users with 'TENANT_ADMIN' authority.

### Return type

null (empty response body)


## deleteRepositorySettings

```
void deleteRepositorySettings()
```

**DELETE** `/api/admin/repositorySettings`

Delete repository settings (deleteRepositorySettings)

Deletes the repository settings.  Available for users with 'TENANT_ADMIN' authority.

### Return type

null (empty response body)


## getAdminSettings

```
AdminSettings getAdminSettings(@Nonnull String key)
```

**GET** `/api/admin/settings/{key}`

Get the Administration Settings object using key (getAdminSettings)

Get the Administration Settings object using specified string key. Referencing non-existing key will cause an error.  Available for users with 'SYS_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **key** | **String** | A string value of the key (e.g. 'general' or 'mail'). | |

### Return type

**AdminSettings**


## getAutoCommitSettings

```
Map<String, AutoVersionCreateConfig> getAutoCommitSettings()
```

**GET** `/api/admin/autoCommitSettings`

Get auto commit settings (getAutoCommitSettings)

Get the auto commit settings object.   Available for users with 'TENANT_ADMIN' authority.

### Return type

**Map<String, AutoVersionCreateConfig>**


## getFeaturesInfo

```
FeaturesInfo getFeaturesInfo()
```

**GET** `/api/admin/featuresInfo`

Get features info (getFeaturesInfo)

Get information about enabled/disabled features.   Available for users with 'SYS_ADMIN' authority.

### Return type

**FeaturesInfo**


## getJwtSettings

```
JwtSettings getJwtSettings()
```

**GET** `/api/admin/jwtSettings`

Get the JWT Settings object (getJwtSettings)

Get the JWT Settings object that contains JWT token policy, etc.   Available for users with 'SYS_ADMIN' authority.

### Return type

**JwtSettings**


## getMailOAuth2AuthorizationUrl

```
String getMailOAuth2AuthorizationUrl()
```

**GET** `/api/admin/mail/oauth2/authorize`

Redirect user to mail provider login page. 

After user logged in and provided accessprovider sends authorization code to specified redirect uri.)

### Return type

**String**


## getMailProcessingUrl

```
String getMailProcessingUrl()
```

**GET** `/api/admin/mail/oauth2/loginProcessingUrl`

Get OAuth2 log in processing URL (getMailProcessingUrl)

Returns the URL enclosed in double quotes. After successful authentication with OAuth2 provider and user consent for requested scope, it makes a redirect to this path so that the platform can do further log in processing and generating access tokens.   Available for users with 'SYS_ADMIN' authority.

### Return type

**String**


## getRepositorySettings

```
RepositorySettings getRepositorySettings()
```

**GET** `/api/admin/repositorySettings`

Get repository settings (getRepositorySettings)

Get the repository settings object.   Available for users with 'TENANT_ADMIN' authority.

### Return type

**RepositorySettings**


## getRepositorySettingsInfo

```
RepositorySettingsInfo getRepositorySettingsInfo()
```

**GET** `/api/admin/repositorySettings/info`

getRepositorySettingsInfo

### Return type

**RepositorySettingsInfo**


## getSecuritySettings

```
SecuritySettings getSecuritySettings()
```

**GET** `/api/admin/securitySettings`

Get the Security Settings object (getSecuritySettings)

Get the Security Settings object that contains password policy, etc.  Available for users with 'SYS_ADMIN' authority.

### Return type

**SecuritySettings**


## getSystemInfo

```
SystemInfo getSystemInfo()
```

**GET** `/api/admin/systemInfo`

Get system info (getSystemInfo)

Get main information about system.   Available for users with 'SYS_ADMIN' authority.

### Return type

**SystemInfo**


## handleMailOAuth2Callback

```
void handleMailOAuth2Callback(@Nonnull String code, @Nonnull String state)
```

**GET** `/api/admin/mail/oauth2/code`

handleMailOAuth2Callback


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **code** | **String** |  | |
| **state** | **String** |  | |

### Return type

null (empty response body)


## repositorySettingsExists

```
Boolean repositorySettingsExists()
```

**GET** `/api/admin/repositorySettings/exists`

Check repository settings exists (repositorySettingsExists)

Check whether the repository settings exists.   Available for users with 'TENANT_ADMIN' authority.

### Return type

**Boolean**


## saveAdminSettings

```
AdminSettings saveAdminSettings(@Nonnull AdminSettings adminSettings)
```

**POST** `/api/admin/settings`

Creates or Updates the Administration Settings (saveAdminSettings)

Creates or Updates the Administration Settings. Platform generates random Administration Settings Id during settings creation. The Administration Settings Id will be present in the response. Specify the Administration Settings Id when you would like to update the Administration Settings. Referencing non-existing Administration Settings Id will cause an error.  Available for users with 'SYS_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adminSettings** | **AdminSettings** |  | |

### Return type

**AdminSettings**


## saveAutoCommitSettings

```
Map<String, AutoVersionCreateConfig> saveAutoCommitSettings(@Nonnull Map<String, AutoVersionCreateConfig> requestBody)
```

**POST** `/api/admin/autoCommitSettings`

Creates or Updates the auto commit settings (saveAutoCommitSettings)

Creates or Updates the auto commit settings object.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestBody** | **Map<String, AutoVersionCreateConfig>** |  | |

### Return type

**Map<String, AutoVersionCreateConfig>**


## saveJwtSettings

```
JwtPair saveJwtSettings(@Nonnull JwtSettings jwtSettings)
```

**POST** `/api/admin/jwtSettings`

Update JWT Settings (saveJwtSettings)

Updates the JWT Settings object that contains JWT token policy, etc. The tokenSigningKey field is a Base64 encoded string.  Available for users with 'SYS_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jwtSettings** | **JwtSettings** |  | |

### Return type

**JwtPair**


## saveRepositorySettings

```
RepositorySettings saveRepositorySettings(@Nonnull RepositorySettings repositorySettings)
```

**POST** `/api/admin/repositorySettings`

Creates or Updates the repository settings (saveRepositorySettings)

Creates or Updates the repository settings object.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **repositorySettings** | **RepositorySettings** |  | |

### Return type

**RepositorySettings**


## saveSecuritySettings

```
SecuritySettings saveSecuritySettings(@Nonnull SecuritySettings securitySettings)
```

**POST** `/api/admin/securitySettings`

Update Security Settings (saveSecuritySettings)

Updates the Security Settings object that contains password policy, etc.  Available for users with 'SYS_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **securitySettings** | **SecuritySettings** |  | |

### Return type

**SecuritySettings**


## sendTestMail

```
void sendTestMail(@Nonnull AdminSettings adminSettings)
```

**POST** `/api/admin/settings/testMail`

Send test email (sendTestMail)

Attempts to send test email to the System Administrator User using Mail Settings provided as a parameter. You may change the 'To' email in the user profile of the System Administrator.   Available for users with 'SYS_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adminSettings** | **AdminSettings** |  | |

### Return type

null (empty response body)


## sendTestSms

```
void sendTestSms(@Nonnull TestSmsRequest testSmsRequest)
```

**POST** `/api/admin/settings/testSms`

Send test sms (sendTestSms)

Attempts to send test sms to the System Administrator User using SMS Settings and phone number provided as a parameters of the request.   Available for users with 'SYS_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **testSmsRequest** | **TestSmsRequest** |  | |

### Return type

null (empty response body)


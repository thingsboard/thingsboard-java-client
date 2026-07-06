# AdminControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
Boolean autoCommitSettingsExists() // Check auto commit settings exists (autoCommitSettingsExists)
void checkRepositoryAccess(CheckRepositoryAccessArgs args) // Check repository access (checkRepositoryAccess)
UpdateMessage checkUpdates() // Check for new Platform Releases (checkUpdates)
void deleteAutoCommitSettings() // Delete auto commit settings (deleteAutoCommitSettings)
void deleteRepositorySettings() // Delete repository settings (deleteRepositorySettings)
AdminSettings getAdminSettings(GetAdminSettingsArgs args) // Get the Administration Settings object using key (getAdminSettings)
Map<String, AutoVersionCreateConfig> getAutoCommitSettings() // Get auto commit settings (getAutoCommitSettings)
FeaturesInfo getFeaturesInfo() // Get features info (getFeaturesInfo)
JwtSettings getJwtSettings() // Get the JWT Settings object (getJwtSettings)
LicenseUsageInfo getLicenseUsageInfo() // Get license usage info (getLicenseUsageInfo)
String getMailOAuth2AuthorizationUrl() // Redirect user to mail provider login page. 
String getMailProcessingUrl() // Get OAuth2 log in processing URL (getMailProcessingUrl)
RepositorySettings getRepositorySettings() // Get repository settings (getRepositorySettings)
RepositorySettingsInfo getRepositorySettingsInfo() // getRepositorySettingsInfo
SecuritySettings getSecuritySettings() // Get the Security Settings object (getSecuritySettings)
SystemInfo getSystemInfo() // Get system info (getSystemInfo)
void handleMailOAuth2Callback(HandleMailOAuth2CallbackArgs args) // handleMailOAuth2Callback
Boolean repositorySettingsExists() // Check repository settings exists (repositorySettingsExists)
AdminSettings saveAdminSettings(SaveAdminSettingsArgs args) // Creates or Updates the Administration Settings (saveAdminSettings)
Map<String, AutoVersionCreateConfig> saveAutoCommitSettings(SaveAutoCommitSettingsArgs args) // Creates or Updates the auto commit settings (saveAutoCommitSettings)
JwtPair saveJwtSettings(SaveJwtSettingsArgs args) // Update JWT Settings (saveJwtSettings)
RepositorySettings saveRepositorySettings(SaveRepositorySettingsArgs args) // Creates or Updates the repository settings (saveRepositorySettings)
SecuritySettings saveSecuritySettings(SaveSecuritySettingsArgs args) // Update Security Settings (saveSecuritySettings)
void sendTestMail(SendTestMailArgs args) // Send test email (sendTestMail)
void sendTestSms(SendTestSmsArgs args) // Send test sms (sendTestSms)
```


## autoCommitSettingsExists

**GET** `/api/admin/autoCommitSettings/exists`

Check auto commit settings exists (autoCommitSettingsExists)

Check whether the auto commit settings exists.   Available for users with 'TENANT_ADMIN' authority.

```java
Boolean autoCommitSettingsExists()
```

### Return type

`Boolean`


## checkRepositoryAccess

**POST** `/api/admin/repositorySettings/checkAccess`

Check repository access (checkRepositoryAccess)

Attempts to check repository access.   Available for users with 'TENANT_ADMIN' authority.

```java
void checkRepositoryAccess(CheckRepositoryAccessArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
CheckRepositoryAccessArgs.builder()
        .repositorySettings(RepositorySettings)
        .build()
```

### `CheckRepositoryAccessArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `repositorySettings` | `RepositorySettings` | **yes** |  | |

### Return type

null (empty response body)


## checkUpdates

**GET** `/api/admin/updates`

Check for new Platform Releases (checkUpdates)

Check notifications about new platform releases.   Available for users with 'SYS_ADMIN' authority.

```java
UpdateMessage checkUpdates()
```

### Return type

`UpdateMessage`


## deleteAutoCommitSettings

**DELETE** `/api/admin/autoCommitSettings`

Delete auto commit settings (deleteAutoCommitSettings)

Deletes the auto commit settings.  Available for users with 'TENANT_ADMIN' authority.

```java
void deleteAutoCommitSettings()
```

### Return type

null (empty response body)


## deleteRepositorySettings

**DELETE** `/api/admin/repositorySettings`

Delete repository settings (deleteRepositorySettings)

Deletes the repository settings.  Available for users with 'TENANT_ADMIN' authority.

```java
void deleteRepositorySettings()
```

### Return type

null (empty response body)


## getAdminSettings

**GET** `/api/admin/settings/{key}`

Get the Administration Settings object using key (getAdminSettings)

Get the Administration Settings object using specified string key. Referencing non-existing key will cause an error.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.  Security check is performed to verify that the user has 'READ' permission for the 'ADMIN_SETTINGS' (for 'SYS_ADMIN' authority) or 'WHITE_LABELING' (for 'TENANT_ADMIN' authority) resource.

```java
AdminSettings getAdminSettings(GetAdminSettingsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAdminSettingsArgs.builder()
        .key(String)
        .build()
```

### `GetAdminSettingsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `key` | `String` | **yes** | A string value of the key (e.g. 'general' or 'mail'). | |
| `systemByDefault` | `Boolean` | no | Use system settings if settings are not defined on tenant level. | default: `false` |

### Return type

`AdminSettings`


## getAutoCommitSettings

**GET** `/api/admin/autoCommitSettings`

Get auto commit settings (getAutoCommitSettings)

Get the auto commit settings object.   Available for users with 'TENANT_ADMIN' authority.

```java
Map<String, AutoVersionCreateConfig> getAutoCommitSettings()
```

### Return type

`Map<String, AutoVersionCreateConfig>`


## getFeaturesInfo

**GET** `/api/admin/featuresInfo`

Get features info (getFeaturesInfo)

Get information about enabled/disabled features.   Available for users with 'SYS_ADMIN' authority.

```java
FeaturesInfo getFeaturesInfo()
```

### Return type

`FeaturesInfo`


## getJwtSettings

**GET** `/api/admin/jwtSettings`

Get the JWT Settings object (getJwtSettings)

Get the JWT Settings object that contains JWT token policy, etc.   Available for users with 'SYS_ADMIN' authority.

```java
JwtSettings getJwtSettings()
```

### Return type

`JwtSettings`


## getLicenseUsageInfo

**GET** `/api/admin/licenseUsageInfo`

Get license usage info (getLicenseUsageInfo)

Get license usage info.   Available for users with 'SYS_ADMIN' authority.

```java
LicenseUsageInfo getLicenseUsageInfo()
```

### Return type

`LicenseUsageInfo`


## getMailOAuth2AuthorizationUrl

**GET** `/api/admin/mail/oauth2/authorize`

Redirect user to mail provider login page. 

After user logged in and provided accessprovider sends authorization code to specified redirect uri.)

```java
String getMailOAuth2AuthorizationUrl()
```

### Return type

`String`


## getMailProcessingUrl

**GET** `/api/admin/mail/oauth2/loginProcessingUrl`

Get OAuth2 log in processing URL (getMailProcessingUrl)

Returns the URL enclosed in double quotes. After successful authentication with OAuth2 provider and user consent for requested scope, it makes a redirect to this path so that the platform can do further log in processing and generating access tokens.   Available for users with 'SYS_ADMIN' authority.

```java
String getMailProcessingUrl()
```

### Return type

`String`


## getRepositorySettings

**GET** `/api/admin/repositorySettings`

Get repository settings (getRepositorySettings)

Get the repository settings object.   Available for users with 'TENANT_ADMIN' authority.

```java
RepositorySettings getRepositorySettings()
```

### Return type

`RepositorySettings`


## getRepositorySettingsInfo

**GET** `/api/admin/repositorySettings/info`

getRepositorySettingsInfo

```java
RepositorySettingsInfo getRepositorySettingsInfo()
```

### Return type

`RepositorySettingsInfo`


## getSecuritySettings

**GET** `/api/admin/securitySettings`

Get the Security Settings object (getSecuritySettings)

Get the Security Settings object that contains password policy, etc.  Available for users with 'SYS_ADMIN' authority.  Security check is performed to verify that the user has 'READ' permission for the 'ADMIN_SETTINGS' (for 'SYS_ADMIN' authority) or 'WHITE_LABELING' (for 'TENANT_ADMIN' authority) resource.

```java
SecuritySettings getSecuritySettings()
```

### Return type

`SecuritySettings`


## getSystemInfo

**GET** `/api/admin/systemInfo`

Get system info (getSystemInfo)

Get main information about system.   Available for users with 'SYS_ADMIN' authority.

```java
SystemInfo getSystemInfo()
```

### Return type

`SystemInfo`


## handleMailOAuth2Callback

**GET** `/api/admin/mail/oauth2/code`

handleMailOAuth2Callback

```java
void handleMailOAuth2Callback(HandleMailOAuth2CallbackArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
HandleMailOAuth2CallbackArgs.builder()
        .code(String)
        .state(String)
        .build()
```

### `HandleMailOAuth2CallbackArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `code` | `String` | **yes** |  | |
| `state` | `String` | **yes** |  | |

### Return type

null (empty response body)


## repositorySettingsExists

**GET** `/api/admin/repositorySettings/exists`

Check repository settings exists (repositorySettingsExists)

Check whether the repository settings exists.   Available for users with 'TENANT_ADMIN' authority.

```java
Boolean repositorySettingsExists()
```

### Return type

`Boolean`


## saveAdminSettings

**POST** `/api/admin/settings`

Creates or Updates the Administration Settings (saveAdminSettings)

Creates or Updates the Administration Settings. Platform generates random Administration Settings Id during settings creation. The Administration Settings Id will be present in the response. Specify the Administration Settings Id when you would like to update the Administration Settings. Referencing non-existing Administration Settings Id will cause an error.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.  Security check is performed to verify that the user has 'WRITE' permission for the 'ADMIN_SETTINGS' (for 'SYS_ADMIN' authority) or 'WHITE_LABELING' (for 'TENANT_ADMIN' authority) resource.

```java
AdminSettings saveAdminSettings(SaveAdminSettingsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveAdminSettingsArgs.builder()
        .adminSettings(AdminSettings)
        .build()
```

### `SaveAdminSettingsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `adminSettings` | `AdminSettings` | **yes** | A JSON value representing the Administration Settings. | |

### Return type

`AdminSettings`


## saveAutoCommitSettings

**POST** `/api/admin/autoCommitSettings`

Creates or Updates the auto commit settings (saveAutoCommitSettings)

Creates or Updates the auto commit settings object.   Available for users with 'TENANT_ADMIN' authority.

```java
Map<String, AutoVersionCreateConfig> saveAutoCommitSettings(SaveAutoCommitSettingsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveAutoCommitSettingsArgs.builder()
        .requestBody(Map<String, AutoVersionCreateConfig>)
        .build()
```

### `SaveAutoCommitSettingsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `requestBody` | `Map<String, AutoVersionCreateConfig>` | **yes** |  | |

### Return type

`Map<String, AutoVersionCreateConfig>`


## saveJwtSettings

**POST** `/api/admin/jwtSettings`

Update JWT Settings (saveJwtSettings)

Updates the JWT Settings object that contains JWT token policy, etc. The tokenSigningKey field is a Base64 encoded string.  Available for users with 'SYS_ADMIN' authority.

```java
JwtPair saveJwtSettings(SaveJwtSettingsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveJwtSettingsArgs.builder()
        .jwtSettings(JwtSettings)
        .build()
```

### `SaveJwtSettingsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `jwtSettings` | `JwtSettings` | **yes** |  | |

### Return type

`JwtPair`


## saveRepositorySettings

**POST** `/api/admin/repositorySettings`

Creates or Updates the repository settings (saveRepositorySettings)

Creates or Updates the repository settings object.   Available for users with 'TENANT_ADMIN' authority.

```java
RepositorySettings saveRepositorySettings(SaveRepositorySettingsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveRepositorySettingsArgs.builder()
        .repositorySettings(RepositorySettings)
        .build()
```

### `SaveRepositorySettingsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `repositorySettings` | `RepositorySettings` | **yes** |  | |

### Return type

`RepositorySettings`


## saveSecuritySettings

**POST** `/api/admin/securitySettings`

Update Security Settings (saveSecuritySettings)

Updates the Security Settings object that contains password policy, etc.  Available for users with 'SYS_ADMIN' authority.  Security check is performed to verify that the user has 'WRITE' permission for the 'ADMIN_SETTINGS' (for 'SYS_ADMIN' authority) or 'WHITE_LABELING' (for 'TENANT_ADMIN' authority) resource.

```java
SecuritySettings saveSecuritySettings(SaveSecuritySettingsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveSecuritySettingsArgs.builder()
        .securitySettings(SecuritySettings)
        .build()
```

### `SaveSecuritySettingsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `securitySettings` | `SecuritySettings` | **yes** |  | |

### Return type

`SecuritySettings`


## sendTestMail

**POST** `/api/admin/settings/testMail`

Send test email (sendTestMail)

Attempts to send test email using Mail Settings provided as a parameter. Email is sent to the address specified in the profile of user who is performing the requestYou may change the 'To' email in the user profile of the System/Tenant Administrator.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.  Security check is performed to verify that the user has 'READ' permission for the 'ADMIN_SETTINGS' (for 'SYS_ADMIN' authority) or 'WHITE_LABELING' (for 'TENANT_ADMIN' authority) resource.

```java
void sendTestMail(SendTestMailArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SendTestMailArgs.builder()
        .adminSettings(AdminSettings)
        .build()
```

### `SendTestMailArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `adminSettings` | `AdminSettings` | **yes** |  | |

### Return type

null (empty response body)


## sendTestSms

**POST** `/api/admin/settings/testSms`

Send test sms (sendTestSms)

Attempts to send test sms to the System Administrator User using SMS Settings and phone number provided as a parameters of the request.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.  Security check is performed to verify that the user has 'READ' permission for the 'ADMIN_SETTINGS' (for 'SYS_ADMIN' authority) or 'WHITE_LABELING' (for 'TENANT_ADMIN' authority) resource.

```java
void sendTestSms(SendTestSmsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SendTestSmsArgs.builder()
        .testSmsRequest(TestSmsRequest)
        .build()
```

### `SendTestSmsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `testSmsRequest` | `TestSmsRequest` | **yes** |  | |

### Return type

null (empty response body)


# QrCodeSettingsControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
Object getApplicationRedirect(GetApplicationRedirectArgs args) // getApplicationRedirect
QrCodeSettings getMergedMobileAppSettings() // Get QR code configuration for home page (getMergedMobileAppSettings)
String getMobileAppDeepLink() // Get the deep link to the associated mobile application (getMobileAppDeepLink)
QrCodeSettings getQrCodeSettings() // Get Mobile application settings (getQrCodeSettings)
JwtPair getUserTokenByMobileSecret(GetUserTokenByMobileSecretArgs args) // Get User Token (getUserTokenByMobileSecret)
QrCodeSettings saveQrCodeSettings(SaveQrCodeSettingsArgs args) // Create Or Update the Mobile application settings (saveQrCodeSettings)
```


## getApplicationRedirect

**GET** `/api/noauth/qr`

getApplicationRedirect

```java
Object getApplicationRedirect(GetApplicationRedirectArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetApplicationRedirectArgs.builder()
        .userAgent(String)
        .build()
```

### `GetApplicationRedirectArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `userAgent` | `String` | **yes** |  | |

### Return type

`Object`


## getMergedMobileAppSettings

**GET** `/api/mobile/qr/merged`

Get QR code configuration for home page (getMergedMobileAppSettings)

The response payload contains ui configuration of qr code  Available for any authorized user. 

```java
QrCodeSettings getMergedMobileAppSettings()
```

### Return type

`QrCodeSettings`


## getMobileAppDeepLink

**GET** `/api/mobile/qr/deepLink`

Get the deep link to the associated mobile application (getMobileAppDeepLink)

Fetch the url that takes user to linked mobile application   Available for any authorized user. 

```java
String getMobileAppDeepLink()
```

### Return type

`String`


## getQrCodeSettings

**GET** `/api/mobile/qr/settings`

Get Mobile application settings (getQrCodeSettings)

The response payload contains configuration for android/iOS applications and platform qr code widget settings.  Available for any authorized user. 

```java
QrCodeSettings getQrCodeSettings()
```

### Return type

`QrCodeSettings`


## getUserTokenByMobileSecret

**GET** `/api/noauth/qr/{secret}`

Get User Token (getUserTokenByMobileSecret)

Returns the token of the User based on the provided secret key.

```java
JwtPair getUserTokenByMobileSecret(GetUserTokenByMobileSecretArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetUserTokenByMobileSecretArgs.builder()
        .secret(String)
        .build()
```

### `GetUserTokenByMobileSecretArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `secret` | `String` | **yes** | A string value representing short-lived secret key | |

### Return type

`JwtPair`


## saveQrCodeSettings

**POST** `/api/mobile/qr/settings`

Create Or Update the Mobile application settings (saveQrCodeSettings)

The request payload contains configuration for android/iOS applications and platform qr code widget settings.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
QrCodeSettings saveQrCodeSettings(SaveQrCodeSettingsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveQrCodeSettingsArgs.builder()
        .qrCodeSettings(QrCodeSettings)
        .build()
```

### `SaveQrCodeSettingsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `qrCodeSettings` | `QrCodeSettings` | **yes** |  | |

### Return type

`QrCodeSettings`


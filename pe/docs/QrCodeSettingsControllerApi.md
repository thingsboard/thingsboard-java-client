# QrCodeSettingsControllerApi

`ThingsboardClient` methods:

```
Object getApplicationRedirect(@Nonnull String userAgent) // getApplicationRedirect
QrCodeSettings getMergedMobileAppSettings() // Get QR code configuration for home page (getMergedMobileAppSettings)
String getMobileAppDeepLink() // Get the deep link to the associated mobile application (getMobileAppDeepLink)
QrCodeSettings getQrCodeSettings() // Get Mobile application settings (getQrCodeSettings)
JwtPair getUserTokenByMobileSecret(@Nonnull String secret) // Get User Token (getUserTokenByMobileSecret)
QrCodeSettings saveQrCodeSettings(@Nonnull QrCodeSettings qrCodeSettings) // Create Or Update the Mobile application settings (saveQrCodeSettings)
```


## getApplicationRedirect

```
Object getApplicationRedirect(@Nonnull String userAgent)
```

**GET** `/api/noauth/qr`

getApplicationRedirect


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userAgent** | **String** |  | |

### Return type

**Object**


## getMergedMobileAppSettings

```
QrCodeSettings getMergedMobileAppSettings()
```

**GET** `/api/mobile/qr/merged`

Get QR code configuration for home page (getMergedMobileAppSettings)

The response payload contains ui configuration of qr code  Available for any authorized user. 

### Return type

**QrCodeSettings**


## getMobileAppDeepLink

```
String getMobileAppDeepLink()
```

**GET** `/api/mobile/qr/deepLink`

Get the deep link to the associated mobile application (getMobileAppDeepLink)

Fetch the url that takes user to linked mobile application   Available for any authorized user. 

### Return type

**String**


## getQrCodeSettings

```
QrCodeSettings getQrCodeSettings()
```

**GET** `/api/mobile/qr/settings`

Get Mobile application settings (getQrCodeSettings)

The response payload contains configuration for android/iOS applications and platform qr code widget settings.  Available for any authorized user. 

### Return type

**QrCodeSettings**


## getUserTokenByMobileSecret

```
JwtPair getUserTokenByMobileSecret(@Nonnull String secret)
```

**GET** `/api/noauth/qr/{secret}`

Get User Token (getUserTokenByMobileSecret)

Returns the token of the User based on the provided secret key.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **secret** | **String** | A string value representing short-lived secret key | |

### Return type

**JwtPair**


## saveQrCodeSettings

```
QrCodeSettings saveQrCodeSettings(@Nonnull QrCodeSettings qrCodeSettings)
```

**POST** `/api/mobile/qr/settings`

Create Or Update the Mobile application settings (saveQrCodeSettings)

The request payload contains configuration for android/iOS applications and platform qr code widget settings.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **qrCodeSettings** | **QrCodeSettings** |  | |

### Return type

**QrCodeSettings**




# QrCodeSettings

A JSON value representing the mobile apps configuration

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**QrCodeSettingsId**](QrCodeSettingsId.md) |  |  [optional] |
|**createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch |  [optional] [readonly] |
|**tenantId** | [**TenantId**](TenantId.md) | JSON object with Tenant Id. |  [optional] [readonly] |
|**useSystemSettings** | **Boolean** | Use settings from system level |  [optional] |
|**useDefaultApp** | **Boolean** | Type of application: true means use default Thingsboard app |  [optional] |
|**mobileAppBundleId** | [**MobileAppBundleId**](MobileAppBundleId.md) | Mobile app bundle. |  [optional] |
|**qrCodeConfig** | [**QRCodeConfig**](QRCodeConfig.md) | QR code config configuration. |  |
|**androidEnabled** | **Boolean** | Indicates if google play link is available |  [optional] |
|**iosEnabled** | **Boolean** | Indicates if apple store link is available |  [optional] |
|**googlePlayLink** | **String** |  |  [optional] [readonly] |
|**appStoreLink** | **String** |  |  [optional] [readonly] |




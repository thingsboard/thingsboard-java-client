

# MobileApp

A JSON value representing the Mobile Application.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**MobileAppId**](MobileAppId.md) |  |  [optional] |
|**createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch |  [optional] [readonly] |
|**tenantId** | [**TenantId**](TenantId.md) | JSON object with Tenant Id |  [optional] |
|**pkgName** | **String** | Application package name. Cannot be empty |  |
|**title** | **String** | Application title |  [optional] |
|**appSecret** | **String** | Application secret. The length must be at least 16 characters |  |
|**platformType** | **PlatformType** | Application platform type: ANDROID or IOS |  |
|**status** | **MobileAppStatus** | Application status: PUBLISHED, DEPRECATED, SUSPENDED, DRAFT |  |
|**versionInfo** | [**MobileAppVersionInfo**](MobileAppVersionInfo.md) | Application version info |  [optional] |
|**storeInfo** | [**StoreInfo**](StoreInfo.md) | Application store information |  [optional] |
|**name** | **String** | Mobile app package name |  [optional] [readonly] |




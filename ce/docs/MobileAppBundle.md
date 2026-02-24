

# MobileAppBundle

A JSON value representing the Mobile Application Bundle.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**MobileAppBundleId**](MobileAppBundleId.md) |  |  [optional] |
|**createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch |  [optional] [readonly] |
|**tenantId** | [**TenantId**](TenantId.md) | JSON object with Tenant Id |  [optional] |
|**title** | **String** | Application bundle title. Cannot be empty |  |
|**description** | **String** | Application bundle description. |  [optional] |
|**androidAppId** | [**MobileAppId**](MobileAppId.md) | Android application id |  [optional] |
|**iosAppId** | [**MobileAppId**](MobileAppId.md) | IOS application id |  [optional] |
|**layoutConfig** | [**MobileLayoutConfig**](MobileLayoutConfig.md) | Application layout configuration |  [optional] |
|**oauth2Enabled** | **Boolean** | Whether OAuth2 settings are enabled or not |  [optional] |
|**name** | **String** | Mobile app bundle title |  [optional] [readonly] |





# MobileApp

`org.thingsboard.client.model.MobileApp`

A JSON value representing the Mobile Application.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **MobileAppId** |  | [optional] |
| **createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| **tenantId** | **TenantId** | JSON object with Tenant Id | [optional] |
| **pkgName** | **String** | Application package name. Cannot be empty | |
| **title** | **String** | Application title | [optional] |
| **appSecret** | **String** | Application secret. The length must be at least 16 characters | |
| **platformType** | **PlatformType** | Application platform type: ANDROID or IOS | |
| **status** | **MobileAppStatus** | Application status: PUBLISHED, DEPRECATED, SUSPENDED, DRAFT | |
| **versionInfo** | **MobileAppVersionInfo** | Application version info | [optional] |
| **storeInfo** | **StoreInfo** | Application store information | [optional] |
| **name** | **String** | Mobile app package name | [optional] [readonly] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


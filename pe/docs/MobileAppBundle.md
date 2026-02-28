
# MobileAppBundle

`org.thingsboard.client.model.MobileAppBundle`

A JSON value representing the Mobile Application Bundle.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **MobileAppBundleId** |  | [optional] |
| **createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| **tenantId** | **TenantId** | JSON object with Tenant Id | [optional] |
| **title** | **String** | Application bundle title. Cannot be empty | |
| **description** | **String** | Application bundle description. | [optional] |
| **androidAppId** | **MobileAppId** | Android application id | [optional] |
| **iosAppId** | **MobileAppId** | IOS application id | [optional] |
| **layoutConfig** | **MobileLayoutConfig** | Application layout configuration | [optional] |
| **selfRegistrationParams** | **MobileSelfRegistrationParams** | Application self registration configuration | [optional] |
| **oauth2Enabled** | **Boolean** | Whether OAuth2 settings are enabled or not | [optional] |
| **name** | **String** | Mobile app bundle title | [optional] [readonly] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions



# QrCodeSettings

`org.thingsboard.client.model.QrCodeSettings`

A JSON value representing the mobile apps configuration

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **QrCodeSettingsId** |  | [optional] |
| **createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| **tenantId** | **TenantId** | JSON object with Tenant Id. | [optional] [readonly] |
| **useSystemSettings** | **Boolean** | Use settings from system level | [optional] |
| **useDefaultApp** | **Boolean** | Type of application: true means use default Thingsboard app | [optional] |
| **mobileAppBundleId** | **MobileAppBundleId** | Mobile app bundle. | [optional] |
| **qrCodeConfig** | **QRCodeConfig** | QR code config configuration. | |
| **androidEnabled** | **Boolean** | Indicates if google play link is available | [optional] |
| **iosEnabled** | **Boolean** | Indicates if apple store link is available | [optional] |
| **googlePlayLink** | **String** |  | [optional] [readonly] |
| **appStoreLink** | **String** |  | [optional] [readonly] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


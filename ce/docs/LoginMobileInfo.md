
# LoginMobileInfo

`org.thingsboard.client.model.LoginMobileInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **oAuth2ClientLoginInfos** | **List\<OAuth2ClientLoginInfo\>** |  | [optional] |
| **storeInfo** | **StoreInfo** |  | [optional] |
| **versionInfo** | **MobileAppVersionInfo** |  | [optional] |



## Referenced Types

#### OAuth2ClientLoginInfo
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| name | String | OAuth2 client name | [optional] |
| icon | String | Name of the icon, displayed on OAuth2 log in button | [optional] |
| url | String | URI for OAuth2 log in. On HTTP GET request to this URI, it redirects to the OAuth2 provider page | [optional] |

#### StoreInfo
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| appId | String |  | [optional] |
| sha256CertFingerprints | String |  | [optional] |
| storeLink | String |  | [optional] |

#### MobileAppVersionInfo
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| minVersion | String | Minimum supported version | [optional] |
| minVersionReleaseNotes | String | Release notes of minimum supported version | [optional] |
| latestVersion | String | Latest supported version | [optional] |
| latestVersionReleaseNotes | String | Release notes of latest supported version | [optional] |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


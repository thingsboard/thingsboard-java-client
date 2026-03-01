
# EnterpriseCaptchaParams

`org.thingsboard.client.model.EnterpriseCaptchaParams`

**Extends:** **CaptchaParams**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **projectId** | **String** | Your Google Cloud project ID | [optional] |
| **serviceAccountCredentials** | **String** | Service account credentials | [optional] |
| **serviceAccountCredentialsFileName** | **String** | Service account credentials file name | [optional] |
| **androidKey** | **String** | The reCAPTCHA key associated with android app. | [optional] |
| **iosKey** | **String** | The reCAPTCHA key associated with iOS app. | [optional] |
| **logActionName** | **String** | Optional action name used for logging | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


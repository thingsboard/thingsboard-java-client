
# V3CaptchaParams

`org.thingsboard.client.model.V3CaptchaParams`

**Extends:** **CaptchaParams**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **siteKey** | **String** | Captcha site key for 'I'm not a robot' validation | [optional] |
| **logActionName** | **String** | Optional action name used for logging (for captcha version 'v3' and 'enterprise') | [optional] |
| **secretKey** | **String** | Secret key to validate the Captcha. Should match the Captcha Site Key. | [optional] |



## Referenced Types

#### CaptchaParams
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| version | String |  |  |

#### EnterpriseCaptchaParams  *(extends CaptchaParams, version=`enterprise`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| projectId | String | Your Google Cloud project ID | [optional] |
| serviceAccountCredentials | String | Service account credentials | [optional] |
| serviceAccountCredentialsFileName | String | Service account credentials file name | [optional] |
| androidKey | String | The reCAPTCHA key associated with android app. | [optional] |
| iosKey | String | The reCAPTCHA key associated with iOS app. | [optional] |
| logActionName | String | Optional action name used for logging | [optional] |

#### V2CaptchaParams  *(extends CaptchaParams, version=`v2`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| siteKey | String | Captcha site key for 'I'm not a robot' validation | [optional] |
| logActionName | String | Optional action name used for logging (for captcha version 'v3' and 'enterprise') | [optional] |
| secretKey | String | Secret key to validate the Captcha. Should match the Captcha Site Key. | [optional] |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions



# SignUpSelfRegistrationParams

`org.thingsboard.client.model.SignUpSelfRegistrationParams`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **title** | **String** |  | [optional] |
| **captcha** | **CaptchaParams** |  | [optional] |
| **fields** | **List\<SignUpField\>** |  | [optional] |
| **showPrivacyPolicy** | **Boolean** |  | [optional] |
| **showTermsOfUse** | **Boolean** |  | [optional] |



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

#### V3CaptchaParams  *(extends CaptchaParams, version=`v3`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| siteKey | String | Captcha site key for 'I'm not a robot' validation | [optional] |
| logActionName | String | Optional action name used for logging (for captcha version 'v3' and 'enterprise') | [optional] |
| secretKey | String | Secret key to validate the Captcha. Should match the Captcha Site Key. | [optional] |

#### SignUpField
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | SignUpFieldId | Signup field id |  |
| label | String | Signup field label |  |
| required | Boolean | Indicates if field is required | [optional] |

#### SignUpFieldId (enum)
`EMAIL` | `PASSWORD` | `REPEAT_PASSWORD` | `FIRST_NAME` | `LAST_NAME` | `PHONE` | `COUNTRY` | `CITY` | `STATE` | `ZIP` | … (12 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions



# SecuritySettings

`org.thingsboard.client.model.SecuritySettings`

A JSON value representing the Security Settings.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **passwordPolicy** | **UserPasswordPolicy** | The user password policy object. | [optional] |
| **maxFailedLoginAttempts** | **Integer** | Maximum number of failed login attempts allowed before user account is locked. | [optional] |
| **userLockoutNotificationEmail** | **String** | Email to use for notifications about locked users. | [optional] |
| **mobileSecretKeyLength** | **Integer** | Mobile secret key length | [optional] |
| **userActivationTokenTtl** | **Integer** | TTL in hours for user activation link | |
| **passwordResetTokenTtl** | **Integer** | TTL in hours for password reset link | |



## Referenced Types

#### UserPasswordPolicy
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| minimumLength | Integer | Minimum number of symbols in the password. | [optional] |
| maximumLength | Integer | Maximum number of symbols in the password. | [optional] |
| minimumUppercaseLetters | Integer | Minimum number of uppercase letters in the password. | [optional] |
| minimumLowercaseLetters | Integer | Minimum number of lowercase letters in the password. | [optional] |
| minimumDigits | Integer | Minimum number of digits in the password. | [optional] |
| minimumSpecialCharacters | Integer | Minimum number of special in the password. | [optional] |
| allowWhitespaces | Boolean | Allow whitespaces | [optional] |
| forceUserToResetPasswordIfNotValid | Boolean | Force user to update password if existing one does not pass validation | [optional] |
| passwordExpirationPeriodDays | Integer | Password expiration period (days). Force expiration of the password. | [optional] |
| passwordReuseFrequencyDays | Integer | Password reuse frequency (days). Disallow to use the same password for the defined number of days | [optional] |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


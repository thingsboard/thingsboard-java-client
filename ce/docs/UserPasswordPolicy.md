
# UserPasswordPolicy

`org.thingsboard.client.model.UserPasswordPolicy`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **minimumLength** | **Integer** | Minimum number of symbols in the password. | [optional] |
| **maximumLength** | **Integer** | Maximum number of symbols in the password. | [optional] |
| **minimumUppercaseLetters** | **Integer** | Minimum number of uppercase letters in the password. | [optional] |
| **minimumLowercaseLetters** | **Integer** | Minimum number of lowercase letters in the password. | [optional] |
| **minimumDigits** | **Integer** | Minimum number of digits in the password. | [optional] |
| **minimumSpecialCharacters** | **Integer** | Minimum number of special in the password. | [optional] |
| **allowWhitespaces** | **Boolean** | Allow whitespaces | [optional] |
| **forceUserToResetPasswordIfNotValid** | **Boolean** | Force user to update password if existing one does not pass validation | [optional] |
| **passwordExpirationPeriodDays** | **Integer** | Password expiration period (days). Force expiration of the password. | [optional] |
| **passwordReuseFrequencyDays** | **Integer** | Password reuse frequency (days). Disallow to use the same password for the defined number of days | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


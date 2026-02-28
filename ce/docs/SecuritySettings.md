
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



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


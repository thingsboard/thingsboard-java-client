

# SecuritySettings

A JSON value representing the Security Settings.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**passwordPolicy** | [**UserPasswordPolicy**](UserPasswordPolicy.md) | The user password policy object. |  [optional] |
|**maxFailedLoginAttempts** | **Integer** | Maximum number of failed login attempts allowed before user account is locked. |  [optional] |
|**userLockoutNotificationEmail** | **String** | Email to use for notifications about locked users. |  [optional] |
|**mobileSecretKeyLength** | **Integer** | Mobile secret key length |  [optional] |
|**userActivationTokenTtl** | **Integer** | TTL in hours for user activation link |  |
|**passwordResetTokenTtl** | **Integer** | TTL in hours for password reset link |  |




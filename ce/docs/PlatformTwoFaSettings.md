
# PlatformTwoFaSettings

`org.thingsboard.client.model.PlatformTwoFaSettings`

Settings value

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **useSystemTwoFactorAuthSettings** | **Boolean** |  | [optional] |
| **providers** | **List\<TwoFaProviderConfig\>** |  | |
| **minVerificationCodeSendPeriod** | **Integer** |  | |
| **verificationCodeCheckRateLimit** | **String** |  | [optional] |
| **maxVerificationFailuresBeforeUserLockout** | **Integer** |  | [optional] |
| **totalAllowedTimeForVerification** | **Integer** |  | |
| **enforceTwoFa** | **Boolean** |  | [optional] |
| **enforcedUsersFilter** | **Object** |  | [optional] |



## Referenced Types

#### TwoFaProviderConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| providerType | String |  |  |

#### BackupCodeTwoFaProviderConfig  *(extends TwoFaProviderConfig, providerType=`BACKUP_CODE`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| codesQuantity | Integer |  | [optional] |

#### EmailTwoFaProviderConfig  *(extends TwoFaProviderConfig, providerType=`EMAIL`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| verificationCodeLifetime | Integer |  | [optional] |

#### SmsTwoFaProviderConfig  *(extends TwoFaProviderConfig, providerType=`SMS`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| verificationCodeLifetime | Integer |  | [optional] |
| smsVerificationMessageTemplate | String |  |  |

#### TotpTwoFaProviderConfig  *(extends TwoFaProviderConfig, providerType=`TOTP`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| issuerName | String |  |  |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


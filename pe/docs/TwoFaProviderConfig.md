
# TwoFaProviderConfig

`org.thingsboard.client.model.TwoFaProviderConfig`

Two-factor authentication provider configuration

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **providerType** | **String** |  | |



## Subtypes

#### BackupCodeTwoFaProviderConfig  *(providerType=`BACKUP_CODE`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| codesQuantity | Integer |  | [optional] |

#### EmailTwoFaProviderConfig  *(providerType=`EMAIL`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| verificationCodeLifetime | Integer |  | [optional] |

#### SmsTwoFaProviderConfig  *(providerType=`SMS`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| verificationCodeLifetime | Integer |  | [optional] |
| smsVerificationMessageTemplate | String |  |  |

#### TotpTwoFaProviderConfig  *(providerType=`TOTP`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| issuerName | String |  |  |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


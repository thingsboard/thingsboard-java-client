
# TwoFaAccountConfig

`org.thingsboard.client.model.TwoFaAccountConfig`

Base configuration for two-factor authentication accounts

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **useByDefault** | **Boolean** |  | [optional] |
| **providerType** | **String** |  | |



## Subtypes

#### BackupCodeTwoFaAccountConfig  *(providerType=`BACKUP_CODE`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| codes | Set<String> |  |  |
| codesLeft | Integer |  | [optional] |

#### EmailTwoFaAccountConfig  *(providerType=`EMAIL`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| email | String |  |  |

#### SmsTwoFaAccountConfig  *(providerType=`SMS`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| phoneNumber | String |  |  |

#### TotpTwoFaAccountConfig  *(providerType=`TOTP`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| authUrl | String |  |  |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions



# BackupCodeTwoFaAccountConfig

`org.thingsboard.client.model.BackupCodeTwoFaAccountConfig`

**Extends:** **TwoFaAccountConfig**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **codes** | **Set\<String\>** |  | |
| **codesLeft** | **Integer** |  | [optional] |



## Referenced Types

#### TwoFaAccountConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| useByDefault | Boolean |  | [optional] |
| providerType | String |  |  |

#### EmailTwoFaAccountConfig  *(extends TwoFaAccountConfig, providerType=`EMAIL`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| email | String |  |  |

#### SmsTwoFaAccountConfig  *(extends TwoFaAccountConfig, providerType=`SMS`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| phoneNumber | String |  |  |

#### TotpTwoFaAccountConfig  *(extends TwoFaAccountConfig, providerType=`TOTP`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| authUrl | String |  |  |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


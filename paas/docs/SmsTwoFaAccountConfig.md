
# SmsTwoFaAccountConfig

`org.thingsboard.client.model.SmsTwoFaAccountConfig`

**Extends:** **TwoFaAccountConfig**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **phoneNumber** | **String** |  | |



## Referenced Types

#### TwoFaAccountConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| useByDefault | Boolean |  | [optional] |
| providerType | String |  |  |

#### BackupCodeTwoFaAccountConfig  *(extends TwoFaAccountConfig, providerType=`BACKUP_CODE`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| codes | Set<String> |  |  |
| codesLeft | Integer |  | [optional] |

#### EmailTwoFaAccountConfig  *(extends TwoFaAccountConfig, providerType=`EMAIL`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| email | String |  |  |

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


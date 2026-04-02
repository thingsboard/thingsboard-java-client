
# TwoFaProviderInfo

`org.thingsboard.client.model.TwoFaProviderInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **type** | **TwoFaProviderType** |  | [optional] |
| **_default** | **Boolean** |  | [optional] |
| **contact** | **String** |  | [optional] |
| **minVerificationCodeSendPeriod** | **Integer** |  | [optional] |



## Referenced Types

#### TwoFaProviderType (enum)
`TOTP` | `SMS` | `EMAIL` | `BACKUP_CODE`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


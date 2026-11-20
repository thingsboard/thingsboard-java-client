
# LoginResponse

`org.thingsboard.client.model.LoginResponse`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **token** | **String** | JWT token | |
| **refreshToken** | **String** | Refresh token. Absent when the token is a two-factor authentication token (see scope) | [optional] |
| **scope** | **Authority** | Set only when two-factor authentication is required: PRE_VERIFICATION_TOKEN when the user must verify a code, MFA_CONFIGURATION_TOKEN when the user must configure two-factor authentication first. The token then grants access only to the two-factor authentication API | [optional] |



## Referenced Types

#### Authority (enum)
`SYS_ADMIN` | `TENANT_ADMIN` | `CUSTOMER_USER` | `BILLING_ADMIN` | `BILLING_SERVICE` | `REFRESH_TOKEN` | `PRE_VERIFICATION_TOKEN` | `MFA_CONFIGURATION_TOKEN`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


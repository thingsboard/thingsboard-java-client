
# SnmpDeviceTransportConfiguration

`org.thingsboard.client.model.SnmpDeviceTransportConfiguration`

**Extends:** **DeviceTransportConfiguration**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **host** | **String** |  | [optional] |
| **port** | **Integer** |  | [optional] |
| **protocolVersion** | **SnmpProtocolVersion** |  | [optional] |
| **community** | **String** |  | [optional] |
| **username** | **String** |  | [optional] |
| **securityName** | **String** |  | [optional] |
| **contextName** | **String** |  | [optional] |
| **authenticationProtocol** | **AuthenticationProtocol** |  | [optional] |
| **authenticationPassphrase** | **String** |  | [optional] |
| **privacyProtocol** | **PrivacyProtocol** |  | [optional] |
| **privacyPassphrase** | **String** |  | [optional] |
| **engineId** | **String** |  | [optional] |



## Referenced Types

#### DeviceTransportConfiguration
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### SnmpProtocolVersion (enum)
`V1` | `V2_C` | `V3`

#### AuthenticationProtocol (enum)
`SHA_1` | `SHA_224` | `SHA_256` | `SHA_384` | `SHA_512` | `MD5`

#### PrivacyProtocol (enum)
`DES` | `AES_128` | `AES_192` | `AES_256`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


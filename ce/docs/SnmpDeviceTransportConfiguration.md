
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



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


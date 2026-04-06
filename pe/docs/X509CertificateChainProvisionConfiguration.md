
# X509CertificateChainProvisionConfiguration

`org.thingsboard.client.model.X509CertificateChainProvisionConfiguration`

**Extends:** **DeviceProfileProvisionConfiguration**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **certificateRegExPattern** | **String** |  | [optional] |
| **allowCreateNewDevicesByX509Certificate** | **Boolean** |  | [optional] |



## Referenced Types

#### DeviceProfileProvisionConfiguration
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| provisionDeviceSecret | String | Provision device secret | [optional] |
| type | String |  |  |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions



# DeviceProfileProvisionConfiguration

`org.thingsboard.client.model.DeviceProfileProvisionConfiguration`

Device profile provision configuration

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **provisionDeviceSecret** | **String** | Provision device secret | [optional] |
| **type** | **String** |  | |



## Subtypes

#### AllowCreateNewDevicesDeviceProfileProvisionConfiguration  *(type=`ALLOW_CREATE_NEW_DEVICES`)*
*(no additional properties)*

#### CheckPreProvisionedDevicesDeviceProfileProvisionConfiguration  *(type=`CHECK_PRE_PROVISIONED_DEVICES`)*
*(no additional properties)*

#### DisabledDeviceProfileProvisionConfiguration  *(type=`DISABLED`)*
*(no additional properties)*

#### X509CertificateChainProvisionConfiguration  *(type=`X509_CERTIFICATE_CHAIN`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| certificateRegExPattern | String |  | [optional] |
| allowCreateNewDevicesByX509Certificate | Boolean |  | [optional] |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


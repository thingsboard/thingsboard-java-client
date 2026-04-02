
# AllowCreateNewDevicesDeviceProfileProvisionConfiguration

`org.thingsboard.client.model.AllowCreateNewDevicesDeviceProfileProvisionConfiguration`

**Extends:** **DeviceProfileProvisionConfiguration**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|



## Referenced Types

#### DeviceProfileProvisionConfiguration
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| provisionDeviceSecret | String | Provision device secret | [optional] |
| type | String |  |  |

#### CheckPreProvisionedDevicesDeviceProfileProvisionConfiguration  *(extends DeviceProfileProvisionConfiguration, type=`CHECK_PRE_PROVISIONED_DEVICES`)*
*See DeviceProfileProvisionConfiguration for properties.*

#### DisabledDeviceProfileProvisionConfiguration  *(extends DeviceProfileProvisionConfiguration, type=`DISABLED`)*
*See DeviceProfileProvisionConfiguration for properties.*

#### X509CertificateChainProvisionConfiguration  *(extends DeviceProfileProvisionConfiguration, type=`X509_CERTIFICATE_CHAIN`)*
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


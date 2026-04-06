
# DeviceData

`org.thingsboard.client.model.DeviceData`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **_configuration** | **DeviceConfiguration** | Device configuration for device profile type. DEFAULT is only supported value for now | [optional] |
| **transportConfiguration** | **DeviceTransportConfiguration** | Device transport configuration used to connect the device | [optional] |



## Referenced Types

#### DeviceConfiguration
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | DeviceProfileType | Device profile type |  |

#### DefaultDeviceConfiguration  *(extends DeviceConfiguration, type=`DEFAULT`)*
*See DeviceConfiguration for properties.*

#### DeviceTransportConfiguration
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### CoapDeviceTransportConfiguration  *(extends DeviceTransportConfiguration, type=`COAP`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| powerMode | PowerMode |  | [optional] |
| psmActivityTimer | Long |  | [optional] |
| edrxCycle | Long |  | [optional] |
| pagingTransmissionWindow | Long |  | [optional] |

#### DefaultDeviceTransportConfiguration  *(extends DeviceTransportConfiguration, type=`DEFAULT`)*
*See DeviceTransportConfiguration for properties.*

#### Lwm2mDeviceTransportConfiguration  *(extends DeviceTransportConfiguration, type=`LWM2M`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| powerMode | PowerMode |  | [optional] |
| psmActivityTimer | Long |  | [optional] |
| edrxCycle | Long |  | [optional] |
| pagingTransmissionWindow | Long |  | [optional] |

#### MqttDeviceTransportConfiguration  *(extends DeviceTransportConfiguration, type=`MQTT`)*
*See DeviceTransportConfiguration for properties.*

#### SnmpDeviceTransportConfiguration  *(extends DeviceTransportConfiguration, type=`SNMP`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| host | String |  | [optional] |
| port | Integer |  | [optional] |
| protocolVersion | SnmpProtocolVersion |  | [optional] |
| community | String |  | [optional] |
| username | String |  | [optional] |
| securityName | String |  | [optional] |
| contextName | String |  | [optional] |
| authenticationProtocol | AuthenticationProtocol |  | [optional] |
| authenticationPassphrase | String |  | [optional] |
| privacyProtocol | PrivacyProtocol |  | [optional] |
| privacyPassphrase | String |  | [optional] |
| engineId | String |  | [optional] |

#### DeviceProfileType (enum)
`DEFAULT`

#### PowerMode (enum)
`PSM` | `DRX` | `E_DRX`

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


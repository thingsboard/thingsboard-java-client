
# SnmpDeviceProfileTransportConfiguration

`org.thingsboard.client.model.SnmpDeviceProfileTransportConfiguration`

**Extends:** **DeviceProfileTransportConfiguration**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **timeoutMs** | **Integer** |  | [optional] |
| **retries** | **Integer** |  | [optional] |
| **communicationConfigs** | **List\<SnmpCommunicationConfig\>** |  | [optional] |



## Referenced Types

#### DeviceProfileTransportConfiguration
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### SnmpCommunicationConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| spec | SnmpCommunicationSpec | Specification of the SNMP communication |  |

#### ClientAttributesQueryingSnmpCommunicationConfig  *(extends SnmpCommunicationConfig, spec=`CLIENT_ATTRIBUTES_QUERYING`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| mappings | List<SnmpMapping> |  | [optional] |
| queryingFrequencyMs | Long |  | [optional] |

#### SharedAttributesSettingSnmpCommunicationConfig  *(extends SnmpCommunicationConfig, spec=`SHARED_ATTRIBUTES_SETTING`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| mappings | List<SnmpMapping> |  | [optional] |

#### TelemetryQueryingSnmpCommunicationConfig  *(extends SnmpCommunicationConfig, spec=`TELEMETRY_QUERYING`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| mappings | List<SnmpMapping> |  | [optional] |
| queryingFrequencyMs | Long |  | [optional] |

#### ToDeviceRpcRequestSnmpCommunicationConfig  *(extends SnmpCommunicationConfig, spec=`TO_DEVICE_RPC_REQUEST`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| mappings | List<SnmpMapping> |  | [optional] |

#### ToServerRpcRequestSnmpCommunicationConfig  *(extends SnmpCommunicationConfig, spec=`TO_SERVER_RPC_REQUEST`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| mappings | List<SnmpMapping> |  | [optional] |

#### SnmpCommunicationSpec (enum)
`TELEMETRY_QUERYING` | `CLIENT_ATTRIBUTES_QUERYING` | `SHARED_ATTRIBUTES_SETTING` | `TO_DEVICE_RPC_REQUEST` | `TO_SERVER_RPC_REQUEST`

#### SnmpMapping
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| oid | String |  | [optional] |
| key | String |  | [optional] |
| dataType | DataType |  | [optional] |

#### DataType (enum)
`BOOLEAN` | `LONG` | `DOUBLE` | `STRING` | `JSON`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


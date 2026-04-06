
# ToDeviceRpcRequestSnmpCommunicationConfig

`org.thingsboard.client.model.ToDeviceRpcRequestSnmpCommunicationConfig`

**Extends:** **SnmpCommunicationConfig**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **mappings** | **List\<SnmpMapping\>** |  | [optional] |



## Referenced Types

#### SnmpCommunicationConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| spec | SnmpCommunicationSpec | Specification of the SNMP communication |  |

#### SnmpMapping
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| oid | String |  | [optional] |
| key | String |  | [optional] |
| dataType | DataType |  | [optional] |

#### SnmpCommunicationSpec (enum)
`TELEMETRY_QUERYING` | `CLIENT_ATTRIBUTES_QUERYING` | `SHARED_ATTRIBUTES_SETTING` | `TO_DEVICE_RPC_REQUEST` | `TO_SERVER_RPC_REQUEST`

#### DataType (enum)
`BOOLEAN` | `LONG` | `DOUBLE` | `STRING` | `JSON`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


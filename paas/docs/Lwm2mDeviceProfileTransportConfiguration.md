
# Lwm2mDeviceProfileTransportConfiguration

`org.thingsboard.client.model.Lwm2mDeviceProfileTransportConfiguration`

**Extends:** **DeviceProfileTransportConfiguration**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **observeAttr** | **TelemetryMappingConfiguration** | Configuration for mapping LwM2M resources to telemetry and attributes | [optional] |
| **bootstrapServerUpdateEnable** | **Boolean** | Flag indicating whether LwM2M bootstrap server update is enabled | [optional] |
| **bootstrap** | **List\<LwM2MBootstrapServerCredential\>** |  | [optional] |
| **clientLwM2mSettings** | **OtherConfiguration** | Other LwM2M client settings | [optional] |



## Referenced Types

#### DeviceProfileTransportConfiguration
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### TelemetryMappingConfiguration
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| keyName | Map<String, String> | Map of LwM2M resource paths to telemetry key names | [optional] |
| observe | Set<String> | Set of resources to observe | [optional] |
| attribute | Set<String> | Set of attribute keys | [optional] |
| telemetry | Set<String> | Set of telemetry keys | [optional] |
| attributeLwm2m | Map<String, ObjectAttributes> | Map of resource paths to specific LwM2M object attributes | [optional] |
| initAttrTelAsObsStrategy | Boolean |  | [optional] |
| observeStrategy | TelemetryObserveStrategy | Observation strategy for telemetry | [optional] |

#### LwM2MBootstrapServerCredential
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| securityMode | String |  |  |

#### NoSecLwM2MBootstrapServerCredential  *(extends LwM2MBootstrapServerCredential, securityMode=`NO_SEC`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| shortServerId | Integer | Server short Id. Used as link to associate server Object Instance. This identifier uniquely identifies each LwM2M Server configured for the LwM2M Client. This Resource MUST be set when the Bootstrap-Server Resource has a value of 'false'. The values ID:0 and ID:65535 values MUST NOT be used for identifying the LwM2M Server. | [optional] [readonly] |
| bootstrapServerIs | Boolean | Is Bootstrap Server or Lwm2m Server. The LwM2M Client MAY be configured to use one or more LwM2M Server Account(s). The LwM2M Client MUST have at most one LwM2M Bootstrap-Server Account. (*) The LwM2M client MUST have at least one LwM2M server account after completing the boot sequence specified. | [optional] [readonly] |
| host | String | Host for 'No Security' mode | [optional] [readonly] |
| port | Integer | Port for  Lwm2m Server: 'No Security' mode: Lwm2m Server or Bootstrap Server | [optional] [readonly] |
| clientHoldOffTime | Integer | Client Hold Off Time. The number of seconds to wait before initiating a Client Initiated Bootstrap once the LwM2M Client has determined it should initiate this bootstrap mode. (This information is relevant for use with a Bootstrap-Server only.) | [optional] [readonly] |
| serverPublicKey | String | Server Public Key for 'Security' mode (DTLS): RPK or X509. Format: base64 encoded | [optional] [readonly] |
| serverCertificate | String | Server Public Key for 'Security' mode (DTLS): X509. Format: base64 encoded | [optional] [readonly] |
| bootstrapServerAccountTimeout | Integer | Bootstrap Server Account Timeout (If the value is set to 0, or if this resource is not instantiated, the Bootstrap-Server Account lifetime is infinite.) | [optional] [readonly] |
| lifetime | Integer | Specify the lifetime of the registration in seconds. | [optional] [readonly] |
| defaultMinPeriod | Integer | The default value the LwM2M Client should use for the Minimum Period of an Observation in the absence of this parameter being included in an Observation. If this Resource doesn’t exist, the default value is 0. | [optional] [readonly] |
| notifIfDisabled | Boolean | If true, the LwM2M Client stores “Notify” operations to the LwM2M Server while the LwM2M Server account is disabled or the LwM2M Client is offline. After the LwM2M Server account is enabled or the LwM2M Client is online, the LwM2M Client reports the stored “Notify” operations to the Server. If false, the LwM2M Client discards all the “Notify” operations or temporarily disables the Observe function while the LwM2M Server is disabled or the LwM2M Client is offline. The default value is true. | [optional] [readonly] |
| binding | String | This Resource defines the transport binding configured for the LwM2M Client. If the LwM2M Client supports the binding specified in this Resource, the LwM2M Client MUST use that transport for the Current Binding Mode. | [optional] [readonly] |

#### PSKLwM2MBootstrapServerCredential  *(extends LwM2MBootstrapServerCredential, securityMode=`PSK`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| shortServerId | Integer | Server short Id. Used as link to associate server Object Instance. This identifier uniquely identifies each LwM2M Server configured for the LwM2M Client. This Resource MUST be set when the Bootstrap-Server Resource has a value of 'false'. The values ID:0 and ID:65535 values MUST NOT be used for identifying the LwM2M Server. | [optional] [readonly] |
| bootstrapServerIs | Boolean | Is Bootstrap Server or Lwm2m Server. The LwM2M Client MAY be configured to use one or more LwM2M Server Account(s). The LwM2M Client MUST have at most one LwM2M Bootstrap-Server Account. (*) The LwM2M client MUST have at least one LwM2M server account after completing the boot sequence specified. | [optional] [readonly] |
| host | String | Host for 'No Security' mode | [optional] [readonly] |
| port | Integer | Port for  Lwm2m Server: 'No Security' mode: Lwm2m Server or Bootstrap Server | [optional] [readonly] |
| clientHoldOffTime | Integer | Client Hold Off Time. The number of seconds to wait before initiating a Client Initiated Bootstrap once the LwM2M Client has determined it should initiate this bootstrap mode. (This information is relevant for use with a Bootstrap-Server only.) | [optional] [readonly] |
| serverPublicKey | String | Server Public Key for 'Security' mode (DTLS): RPK or X509. Format: base64 encoded | [optional] [readonly] |
| serverCertificate | String | Server Public Key for 'Security' mode (DTLS): X509. Format: base64 encoded | [optional] [readonly] |
| bootstrapServerAccountTimeout | Integer | Bootstrap Server Account Timeout (If the value is set to 0, or if this resource is not instantiated, the Bootstrap-Server Account lifetime is infinite.) | [optional] [readonly] |
| lifetime | Integer | Specify the lifetime of the registration in seconds. | [optional] [readonly] |
| defaultMinPeriod | Integer | The default value the LwM2M Client should use for the Minimum Period of an Observation in the absence of this parameter being included in an Observation. If this Resource doesn’t exist, the default value is 0. | [optional] [readonly] |
| notifIfDisabled | Boolean | If true, the LwM2M Client stores “Notify” operations to the LwM2M Server while the LwM2M Server account is disabled or the LwM2M Client is offline. After the LwM2M Server account is enabled or the LwM2M Client is online, the LwM2M Client reports the stored “Notify” operations to the Server. If false, the LwM2M Client discards all the “Notify” operations or temporarily disables the Observe function while the LwM2M Server is disabled or the LwM2M Client is offline. The default value is true. | [optional] [readonly] |
| binding | String | This Resource defines the transport binding configured for the LwM2M Client. If the LwM2M Client supports the binding specified in this Resource, the LwM2M Client MUST use that transport for the Current Binding Mode. | [optional] [readonly] |

#### RPKLwM2MBootstrapServerCredential  *(extends LwM2MBootstrapServerCredential, securityMode=`RPK`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| shortServerId | Integer | Server short Id. Used as link to associate server Object Instance. This identifier uniquely identifies each LwM2M Server configured for the LwM2M Client. This Resource MUST be set when the Bootstrap-Server Resource has a value of 'false'. The values ID:0 and ID:65535 values MUST NOT be used for identifying the LwM2M Server. | [optional] [readonly] |
| bootstrapServerIs | Boolean | Is Bootstrap Server or Lwm2m Server. The LwM2M Client MAY be configured to use one or more LwM2M Server Account(s). The LwM2M Client MUST have at most one LwM2M Bootstrap-Server Account. (*) The LwM2M client MUST have at least one LwM2M server account after completing the boot sequence specified. | [optional] [readonly] |
| host | String | Host for 'No Security' mode | [optional] [readonly] |
| port | Integer | Port for  Lwm2m Server: 'No Security' mode: Lwm2m Server or Bootstrap Server | [optional] [readonly] |
| clientHoldOffTime | Integer | Client Hold Off Time. The number of seconds to wait before initiating a Client Initiated Bootstrap once the LwM2M Client has determined it should initiate this bootstrap mode. (This information is relevant for use with a Bootstrap-Server only.) | [optional] [readonly] |
| serverPublicKey | String | Server Public Key for 'Security' mode (DTLS): RPK or X509. Format: base64 encoded | [optional] [readonly] |
| serverCertificate | String | Server Public Key for 'Security' mode (DTLS): X509. Format: base64 encoded | [optional] [readonly] |
| bootstrapServerAccountTimeout | Integer | Bootstrap Server Account Timeout (If the value is set to 0, or if this resource is not instantiated, the Bootstrap-Server Account lifetime is infinite.) | [optional] [readonly] |
| lifetime | Integer | Specify the lifetime of the registration in seconds. | [optional] [readonly] |
| defaultMinPeriod | Integer | The default value the LwM2M Client should use for the Minimum Period of an Observation in the absence of this parameter being included in an Observation. If this Resource doesn’t exist, the default value is 0. | [optional] [readonly] |
| notifIfDisabled | Boolean | If true, the LwM2M Client stores “Notify” operations to the LwM2M Server while the LwM2M Server account is disabled or the LwM2M Client is offline. After the LwM2M Server account is enabled or the LwM2M Client is online, the LwM2M Client reports the stored “Notify” operations to the Server. If false, the LwM2M Client discards all the “Notify” operations or temporarily disables the Observe function while the LwM2M Server is disabled or the LwM2M Client is offline. The default value is true. | [optional] [readonly] |
| binding | String | This Resource defines the transport binding configured for the LwM2M Client. If the LwM2M Client supports the binding specified in this Resource, the LwM2M Client MUST use that transport for the Current Binding Mode. | [optional] [readonly] |

#### X509LwM2MBootstrapServerCredential  *(extends LwM2MBootstrapServerCredential, securityMode=`X509`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| shortServerId | Integer | Server short Id. Used as link to associate server Object Instance. This identifier uniquely identifies each LwM2M Server configured for the LwM2M Client. This Resource MUST be set when the Bootstrap-Server Resource has a value of 'false'. The values ID:0 and ID:65535 values MUST NOT be used for identifying the LwM2M Server. | [optional] [readonly] |
| bootstrapServerIs | Boolean | Is Bootstrap Server or Lwm2m Server. The LwM2M Client MAY be configured to use one or more LwM2M Server Account(s). The LwM2M Client MUST have at most one LwM2M Bootstrap-Server Account. (*) The LwM2M client MUST have at least one LwM2M server account after completing the boot sequence specified. | [optional] [readonly] |
| host | String | Host for 'No Security' mode | [optional] [readonly] |
| port | Integer | Port for  Lwm2m Server: 'No Security' mode: Lwm2m Server or Bootstrap Server | [optional] [readonly] |
| clientHoldOffTime | Integer | Client Hold Off Time. The number of seconds to wait before initiating a Client Initiated Bootstrap once the LwM2M Client has determined it should initiate this bootstrap mode. (This information is relevant for use with a Bootstrap-Server only.) | [optional] [readonly] |
| serverPublicKey | String | Server Public Key for 'Security' mode (DTLS): RPK or X509. Format: base64 encoded | [optional] [readonly] |
| serverCertificate | String | Server Public Key for 'Security' mode (DTLS): X509. Format: base64 encoded | [optional] [readonly] |
| bootstrapServerAccountTimeout | Integer | Bootstrap Server Account Timeout (If the value is set to 0, or if this resource is not instantiated, the Bootstrap-Server Account lifetime is infinite.) | [optional] [readonly] |
| lifetime | Integer | Specify the lifetime of the registration in seconds. | [optional] [readonly] |
| defaultMinPeriod | Integer | The default value the LwM2M Client should use for the Minimum Period of an Observation in the absence of this parameter being included in an Observation. If this Resource doesn’t exist, the default value is 0. | [optional] [readonly] |
| notifIfDisabled | Boolean | If true, the LwM2M Client stores “Notify” operations to the LwM2M Server while the LwM2M Server account is disabled or the LwM2M Client is offline. After the LwM2M Server account is enabled or the LwM2M Client is online, the LwM2M Client reports the stored “Notify” operations to the Server. If false, the LwM2M Client discards all the “Notify” operations or temporarily disables the Observe function while the LwM2M Server is disabled or the LwM2M Client is offline. The default value is true. | [optional] [readonly] |
| binding | String | This Resource defines the transport binding configured for the LwM2M Client. If the LwM2M Client supports the binding specified in this Resource, the LwM2M Client MUST use that transport for the Current Binding Mode. | [optional] [readonly] |

#### OtherConfiguration
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| powerMode | PowerMode |  | [optional] |
| psmActivityTimer | Long |  | [optional] |
| edrxCycle | Long |  | [optional] |
| pagingTransmissionWindow | Long |  | [optional] |
| useObject19ForOtaInfo | Boolean |  | [optional] |
| fwUpdateStrategy | Integer |  | [optional] |
| swUpdateStrategy | Integer |  | [optional] |
| clientOnlyObserveAfterConnect | Integer |  | [optional] |
| fwUpdateResource | String |  | [optional] |
| swUpdateResource | String |  | [optional] |
| defaultObjectIDVer | String |  | [optional] |

#### ObjectAttributes
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| dim | Long |  | [optional] |
| ssid | Long |  | [optional] |
| uri | String |  | [optional] |
| ver | Object |  | [optional] |
| lwm2m | LwM2mVersion |  | [optional] |
| pmin | Long |  | [optional] |
| pmax | Long |  | [optional] |
| gt | Double |  | [optional] |
| lt | Double |  | [optional] |
| st | Double |  | [optional] |
| epmin | Long |  | [optional] |
| epmax | Long |  | [optional] |

#### TelemetryObserveStrategy (enum)
`SINGLE` | `COMPOSITE_ALL` | `COMPOSITE_BY_OBJECT`

#### PowerMode (enum)
`PSM` | `DRX` | `E_DRX`

#### LwM2mVersion
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| supported | Boolean |  | [optional] |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions



# SaveDeviceWithCredentialsRequest

`org.thingsboard.client.model.SaveDeviceWithCredentialsRequest`

The JSON object with device and credentials. See method description above for example.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **device** | **Device** | The JSON with device entity. | |
| **credentials** | **DeviceCredentials** | The JSON with credentials entity. | |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### Device
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | DeviceId | JSON object with the Device Id. Specify this field to update the Device. Referencing non-existing Device Id will cause error. Omit this field to create new Device. | [optional] |
| createdTime | Long | Timestamp of the device creation, in milliseconds | [optional] [readonly] |
| additionalInfo | com.fasterxml.jackson.databind.JsonNode | Additional parameters of the device. May include: 'gateway' (boolean, whether the device is a gateway), 'description' (string), 'lastConnectedGateway' (string, UUID of the last gateway that connected this device). | [optional] |
| tenantId | TenantId | JSON object with Tenant Id. Use 'assignDeviceToTenant' to change the Tenant Id. | [optional] [readonly] |
| customerId | CustomerId | JSON object with Customer Id. Use 'assignDeviceToCustomer' to change the Customer Id. | [optional] [readonly] |
| name | String | Unique Device Name in scope of Tenant | [optional] |
| type | String | Device Profile Name | [optional] |
| label | String | Label that may be used in widgets | [optional] |
| deviceProfileId | DeviceProfileId | JSON object with Device Profile Id. |  |
| deviceData | DeviceData | JSON object with content specific to type of transport in the device profile. | [optional] |
| firmwareId | OtaPackageId | JSON object with Ota Package Id. | [optional] |
| softwareId | OtaPackageId | JSON object with Ota Package Id. | [optional] |
| version | Long |  | [optional] |
| ownerId | EntityId | JSON object with Customer or Tenant Id | [optional] [readonly] |

#### DeviceCredentials
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | DeviceCredentialsId | The Id is automatically generated during device creation. Use 'getDeviceCredentialsByDeviceId' to obtain the id based on device id. Use 'updateDeviceCredentials' to update device credentials. | [readonly] |
| createdTime | Long | Timestamp of the device credentials creation, in milliseconds | [optional] |
| deviceId | DeviceId | JSON object with the device Id. |  |
| credentialsType | DeviceCredentialsType | Type of the credentials | [optional] |
| credentialsId | String | Unique Credentials Id per platform instance. Used to lookup credentials from the database. By default, new access token for your device. Depends on the type of the credentials. |  |
| credentialsValue | String | Value of the credentials. Null in case of ACCESS_TOKEN credentials type. Base64 value in case of X509_CERTIFICATE. Complex object in case of MQTT_BASIC and LWM2M_CREDENTIALS | [optional] |
| version | Long |  | [optional] |

#### DeviceData
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| _configuration | DeviceConfiguration | Device configuration for device profile type. DEFAULT is only supported value for now | [optional] |
| transportConfiguration | DeviceTransportConfiguration | Device transport configuration used to connect the device | [optional] |

#### DeviceCredentialsId
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | UUID | string |  |

#### DeviceCredentialsType (enum)
`ACCESS_TOKEN` | `X509_CERTIFICATE` | `MQTT_BASIC` | `LWM2_M_CREDENTIALS`

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

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (46 values total)

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


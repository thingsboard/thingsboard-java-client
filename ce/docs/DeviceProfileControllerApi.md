# DeviceProfileControllerApi

`ThingsboardClient` methods:

```
void deleteDeviceProfile(@Nonnull String deviceProfileId) // Delete device profile (deleteDeviceProfile)
List<String> getAttributesKeys(@Nullable String deviceProfileId) // Get attribute keys (getAttributesKeys)
DeviceProfileInfo getDefaultDeviceProfileInfo() // Get Default Device Profile (getDefaultDeviceProfileInfo)
DeviceProfile getDeviceProfileById(@Nonnull String deviceProfileId, @Nullable Boolean inlineImages) // Get Device Profile (getDeviceProfileById)
DeviceProfileInfo getDeviceProfileInfoById(@Nonnull String deviceProfileId) // Get Device Profile Info (getDeviceProfileInfoById)
PageDataDeviceProfileInfo getDeviceProfileInfos(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder, @Nullable String transportType) // Get Device Profiles for transport type (getDeviceProfileInfos)
List<DeviceProfileInfo> getDeviceProfileInfosByIds(@Nonnull List<String> deviceProfileIds) // Get Device Profile Infos By Ids (getDeviceProfileInfosByIds)
List<EntityInfo> getDeviceProfileNames(@Nullable Boolean activeOnly) // Get Device Profile names (getDeviceProfileNames)
List<String> getDeviceProfileTimeseriesKeys(@Nullable String deviceProfileId) // Get time series keys (getDeviceProfileTimeseriesKeys)
PageDataDeviceProfile getDeviceProfiles(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get Device Profiles (getDeviceProfiles)
DeviceProfile saveDeviceProfile(@Nonnull DeviceProfile deviceProfile) // Create Or Update Device Profile (saveDeviceProfile)
DeviceProfile setDefaultDeviceProfile(@Nonnull String deviceProfileId) // Make Device Profile Default (setDefaultDeviceProfile)
```


## deleteDeviceProfile

```
void deleteDeviceProfile(@Nonnull String deviceProfileId)
```

**DELETE** `/api/deviceProfile/{deviceProfileId}`

Delete device profile (deleteDeviceProfile)

Deletes the device profile. Referencing non-existing device profile Id will cause an error. Can't delete the device profile if it is referenced by existing devices.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceProfileId** | **String** | A string value representing the device profile id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## getAttributesKeys

```
List<String> getAttributesKeys(@Nullable String deviceProfileId)
```

**GET** `/api/deviceProfile/devices/keys/attributes`

Get attribute keys (getAttributesKeys)

Get a set of unique attribute keys used by devices that belong to specified profile. If profile is not set returns a list of unique keys among all profiles. The call is used for auto-complete in the UI forms. The implementation limits the number of devices that participate in search to 100 as a trade of between accurate results and time-consuming queries.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceProfileId** | **String** | A string value representing the device profile id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | [optional] |

### Return type

**List<String>**


## getDefaultDeviceProfileInfo

```
DeviceProfileInfo getDefaultDeviceProfileInfo()
```

**GET** `/api/deviceProfileInfo/default`

Get Default Device Profile (getDefaultDeviceProfileInfo)

Fetch the Default Device Profile Info object. Device Profile Info is a lightweight object that includes main information about Device Profile excluding the heavyweight configuration object.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

### Return type

**DeviceProfileInfo**


## getDeviceProfileById

```
DeviceProfile getDeviceProfileById(@Nonnull String deviceProfileId, @Nullable Boolean inlineImages)
```

**GET** `/api/deviceProfile/{deviceProfileId}`

Get Device Profile (getDeviceProfileById)

Fetch the Device Profile object based on the provided Device Profile Id. The server checks that the device profile is owned by the same tenant.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceProfileId** | **String** | A string value representing the device profile id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **inlineImages** | **Boolean** | Inline images as a data URL (Base64) | [optional] |

### Return type

**DeviceProfile**


## getDeviceProfileInfoById

```
DeviceProfileInfo getDeviceProfileInfoById(@Nonnull String deviceProfileId)
```

**GET** `/api/deviceProfileInfo/{deviceProfileId}`

Get Device Profile Info (getDeviceProfileInfoById)

Fetch the Device Profile Info object based on the provided Device Profile Id. Device Profile Info is a lightweight object that includes main information about Device Profile excluding the heavyweight configuration object.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceProfileId** | **String** | A string value representing the device profile id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**DeviceProfileInfo**


## getDeviceProfileInfos

```
PageDataDeviceProfileInfo getDeviceProfileInfos(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder, @Nullable String transportType)
```

**GET** `/api/deviceProfileInfos`

Get Device Profiles for transport type (getDeviceProfileInfos)

Returns a page of devices profile info objects owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. Device Profile Info is a lightweight object that includes main information about Device Profile excluding the heavyweight configuration object.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the device profile name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type, transportType, description, isDefault] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **transportType** | **String** | Type of the transport | [optional] [enum: DEFAULT, MQTT, COAP, LWM2M, SNMP] |

### Return type

**PageDataDeviceProfileInfo**


## getDeviceProfileInfosByIds

```
List<DeviceProfileInfo> getDeviceProfileInfosByIds(@Nonnull List<String> deviceProfileIds)
```

**GET** `/api/deviceProfileInfos/list`

Get Device Profile Infos By Ids (getDeviceProfileInfosByIds)

Requested device profiles must be owned by tenant which is performing the request.   


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceProfileIds** | **List<String>** | A list of device profile ids, separated by comma ',' | |

### Return type

**List<DeviceProfileInfo>**


## getDeviceProfileNames

```
List<EntityInfo> getDeviceProfileNames(@Nullable Boolean activeOnly)
```

**GET** `/api/deviceProfile/names`

Get Device Profile names (getDeviceProfileNames)

Returns a set of unique device profile names owned by the tenant.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **activeOnly** | **Boolean** | Flag indicating whether to retrieve exclusively the names of device profiles that are referenced by tenant's devices. | [optional] [default to false] |

### Return type

**List<EntityInfo>**


## getDeviceProfileTimeseriesKeys

```
List<String> getDeviceProfileTimeseriesKeys(@Nullable String deviceProfileId)
```

**GET** `/api/deviceProfile/devices/keys/timeseries`

Get time series keys (getDeviceProfileTimeseriesKeys)

Get a set of unique time series keys used by devices that belong to specified profile. If profile is not set returns a list of unique keys among all profiles. The call is used for auto-complete in the UI forms. The implementation limits the number of devices that participate in search to 100 as a trade of between accurate results and time-consuming queries.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceProfileId** | **String** | A string value representing the device profile id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | [optional] |

### Return type

**List<String>**


## getDeviceProfiles

```
PageDataDeviceProfile getDeviceProfiles(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/deviceProfiles`

Get Device Profiles (getDeviceProfiles)

Returns a page of devices profile objects owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the device profile name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type, transportType, description, isDefault] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataDeviceProfile**


## saveDeviceProfile

```
DeviceProfile saveDeviceProfile(@Nonnull DeviceProfile deviceProfile)
```

**POST** `/api/deviceProfile`

Create Or Update Device Profile (saveDeviceProfile)

Create or update the Device Profile. When creating device profile, platform generates device profile id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created device profile id will be present in the response. Specify existing device profile id to update the device profile. Referencing non-existing device profile Id will cause 'Not Found' error.   Device profile name is unique in the scope of tenant. Only one 'default' device profile may exist in scope of tenant.  # Device profile data definition  Device profile data object contains device provision strategy and transport type configuration for device connectivity. Let's review some examples. First one is the default device profile data configuration and second one - the custom one.   ```json {    \"configuration\":{       \"type\":\"DEFAULT\"    },    \"provisionConfiguration\":{       \"type\":\"DISABLED\",       \"provisionDeviceSecret\":null    },    \"transportConfiguration\":{       \"type\":\"DEFAULT\"    } } ```  ```json {    \"configuration\":{       \"type\":\"DEFAULT\"    },    \"provisionConfiguration\":{       \"type\":\"ALLOW_CREATE_NEW_DEVICES\",       \"provisionDeviceSecret\":\"vaxb9hzqdbz3oqukvomg\"    },    \"transportConfiguration\":{       \"type\":\"MQTT\",       \"deviceTelemetryTopic\":\"v1/devices/me/telemetry\",       \"deviceAttributesTopic\":\"v1/devices/me/attributes\",       \"transportPayloadTypeConfiguration\":{          \"transportPayloadType\":\"PROTOBUF\",          \"deviceTelemetryProtoSchema\":\"syntax =\\\"proto3\\\";\\npackage telemetry;\\n\\nmessage SensorDataReading {\\n\\n  optional double temperature = 1;\\n  optional double humidity = 2;\\n  InnerObject innerObject = 3;\\n\\n  message InnerObject {\\n    optional string key1 = 1;\\n    optional bool key2 = 2;\\n    optional double key3 = 3;\\n    optional int32 key4 = 4;\\n    optional string key5 = 5;\\n  }\\n}\",          \"deviceAttributesProtoSchema\":\"syntax =\\\"proto3\\\";\\npackage attributes;\\n\\nmessage SensorConfiguration {\\n  optional string firmwareVersion = 1;\\n  optional string serialNumber = 2;\\n}\",          \"deviceRpcRequestProtoSchema\":\"syntax =\\\"proto3\\\";\\npackage rpc;\\n\\nmessage RpcRequestMsg {\\n  optional string method = 1;\\n  optional int32 requestId = 2;\\n  optional string params = 3;\\n}\",          \"deviceRpcResponseProtoSchema\":\"syntax =\\\"proto3\\\";\\npackage rpc;\\n\\nmessage RpcResponseMsg {\\n  optional string payload = 1;\\n}\"       }    } } ```  Let's review some specific objects examples related to the device profile configuration:# Provision Configuration  There are 3 types of device provision configuration for the device profile:   * 'DISABLED';  * 'ALLOW_CREATE_NEW_DEVICES';  * 'CHECK_PRE_PROVISIONED_DEVICES'.  Please refer to the [docs](https://thingsboard.io/docs/user-guide/device-provisioning/) for more details.  # Transport Configuration  5 transport configuration types are available:  * 'DEFAULT';  * 'MQTT';  * 'LWM2M';  * 'COAP';  * 'SNMP'.  Default type supports basic MQTT, HTTP, CoAP and LwM2M transports. Please refer to the [docs](https://thingsboard.io/docs/user-guide/device-profiles/#transport-configuration) for more details about other types.  See another example of COAP transport configuration below:  ```json {    \"type\":\"COAP\",    \"clientSettings\":{       \"edrxCycle\":null,       \"powerMode\":\"DRX\",       \"psmActivityTimer\":null,       \"pagingTransmissionWindow\":null    },    \"coapDeviceTypeConfiguration\":{       \"coapDeviceType\":\"DEFAULT\",       \"transportPayloadTypeConfiguration\":{          \"transportPayloadType\":\"JSON\"       }    } } ```Remove 'id', 'tenantId' from the request body example (below) to create new Device Profile entity.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceProfile** | **DeviceProfile** |  | |

### Return type

**DeviceProfile**


## setDefaultDeviceProfile

```
DeviceProfile setDefaultDeviceProfile(@Nonnull String deviceProfileId)
```

**POST** `/api/deviceProfile/{deviceProfileId}/default`

Make Device Profile Default (setDefaultDeviceProfile)

Marks device profile as default within a tenant scope.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceProfileId** | **String** | A string value representing the device profile id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**DeviceProfile**


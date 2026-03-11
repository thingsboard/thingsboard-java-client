# DeviceApiControllerApi

`ThingsboardClient` methods:

```
String getDeviceAttributes(@Nonnull String deviceToken, @Nonnull String clientKeys, @Nonnull String sharedKeys) // Get attributes (getDeviceAttributes)
String getFirmware(@Nonnull String deviceToken, @Nonnull String title, @Nonnull String version, @Nullable Integer size, @Nullable Integer chunk) // Get Device Firmware (getFirmware)
String getSoftware(@Nonnull String deviceToken, @Nonnull String title, @Nonnull String version, @Nullable Integer size, @Nullable Integer chunk) // Get Device Software (getSoftware)
String postDeviceAttributes(@Nonnull String deviceToken, @Nonnull String body) // Post attributes (postDeviceAttributes)
String postRpcRequest(@Nonnull String deviceToken, @Nonnull String body) // Send the RPC command (postRpcRequest)
String postTelemetry(@Nonnull String deviceToken, @Nonnull String body) // Post time series data (postTelemetry)
String provisionDevice(@Nonnull String body) // Provision new device (provisionDevice)
String replyToCommand(@Nonnull String deviceToken, @Nonnull String requestId, @Nonnull String body) // Reply to RPC commands (replyToCommand)
String saveClaimingInfo(@Nonnull String deviceToken, @Nullable String body) // Save claiming information (saveClaimingInfo)
String subscribeToAttributes(@Nonnull String deviceToken, @Nullable Long timeout) // Subscribe to attribute updates (subscribeToAttributes) (Deprecated)
String subscribeToCommands(@Nonnull String deviceToken, @Nullable Long timeout) // Subscribe to RPC commands (subscribeToCommands) (Deprecated)
```


## getDeviceAttributes

```
String getDeviceAttributes(@Nonnull String deviceToken, @Nonnull String clientKeys, @Nonnull String sharedKeys)
```

**GET** `/api/v1/{deviceToken}/attributes`

Get attributes (getDeviceAttributes)

Returns all attributes that belong to device. Use optional 'clientKeys' and/or 'sharedKeys' parameter to return specific attributes.   Example of the result:   ```json {  \"stringKey\":\"value1\",   \"booleanKey\":true,   \"doubleKey\":42.0,   \"longKey\":73,   \"jsonKey\": {     \"someNumber\": 42,     \"someArray\": [1,2,3],     \"someNestedObject\": {\"key\": \"value\"}  } } ```  The API call is designed to be used by device firmware and requires device access token ('deviceToken'). It is not recommended to use this API call by third-party scripts, rule-engine or platform widgets (use 'Telemetry Controller' instead). 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceToken** | **String** | Your device access token. | |
| **clientKeys** | **String** | Comma separated key names for attribute with client scope | |
| **sharedKeys** | **String** | Comma separated key names for attribute with shared scope | |

### Return type

**String**


## getFirmware

```
String getFirmware(@Nonnull String deviceToken, @Nonnull String title, @Nonnull String version, @Nullable Integer size, @Nullable Integer chunk)
```

**GET** `/api/v1/{deviceToken}/firmware`

Get Device Firmware (getFirmware)

Downloads the current firmware package.When the platform initiates firmware update, it informs the device by updating the 'fw_title', 'fw_version', 'fw_checksum' and 'fw_checksum_algorithm' shared attributes.The 'fw_title' and 'fw_version' parameters must be supplied in this request to double-check that the firmware that device is downloading matches the firmware it expects to download. This is important, since the administrator may change the firmware assignment while device is downloading the firmware.   Optional 'chunk' and 'size' parameters may be used to download the firmware in chunks. For example, device may request first 16 KB of firmware using 'chunk'=0 and 'size'=16384. Next 16KB using 'chunk'=1 and 'size'=16384. The last chunk should have less bytes then requested using 'size' parameter.   The API call is designed to be used by device firmware and requires device access token ('deviceToken'). It is not recommended to use this API call by third-party scripts, rule-engine or platform widgets (use 'Telemetry Controller' instead). 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceToken** | **String** | Your device access token. | |
| **title** | **String** | Title of the firmware, corresponds to the value of 'fw_title' attribute. | |
| **version** | **String** | Version of the firmware, corresponds to the value of 'fw_version' attribute. | |
| **size** | **Integer** | Size of the chunk. Optional. Omit to download the entire file without chunks. | [optional] [default to 0] |
| **chunk** | **Integer** | Index of the chunk. Optional. Omit to download the entire file without chunks. | [optional] [default to 0] |

### Return type

**String**


## getSoftware

```
String getSoftware(@Nonnull String deviceToken, @Nonnull String title, @Nonnull String version, @Nullable Integer size, @Nullable Integer chunk)
```

**GET** `/api/v1/{deviceToken}/software`

Get Device Software (getSoftware)

Downloads the current software package.When the platform initiates software update, it informs the device by updating the 'sw_title', 'sw_version', 'sw_checksum' and 'sw_checksum_algorithm' shared attributes.The 'sw_title' and 'sw_version' parameters must be supplied in this request to double-check that the software that device is downloading matches the software it expects to download. This is important, since the administrator may change the software assignment while device is downloading the software.   Optional 'chunk' and 'size' parameters may be used to download the software in chunks. For example, device may request first 16 KB of software using 'chunk'=0 and 'size'=16384. Next 16KB using 'chunk'=1 and 'size'=16384. The last chunk should have less bytes then requested using 'size' parameter.   The API call is designed to be used by device firmware and requires device access token ('deviceToken'). It is not recommended to use this API call by third-party scripts, rule-engine or platform widgets (use 'Telemetry Controller' instead). 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceToken** | **String** | Your device access token. | |
| **title** | **String** | Title of the software, corresponds to the value of 'sw_title' attribute. | |
| **version** | **String** | Version of the software, corresponds to the value of 'sw_version' attribute. | |
| **size** | **Integer** | Size of the chunk. Optional. Omit to download the entire file without using  chunks. | [optional] [default to 0] |
| **chunk** | **Integer** | Index of the chunk. Optional. Omit to download the entire file without using chunks. | [optional] [default to 0] |

### Return type

**String**


## postDeviceAttributes

```
String postDeviceAttributes(@Nonnull String deviceToken, @Nonnull String body)
```

**POST** `/api/v1/{deviceToken}/attributes`

Post attributes (postDeviceAttributes)

Post client attribute updates on behalf of device.   Example of the request:   ```json {  \"stringKey\":\"value1\",   \"booleanKey\":true,   \"doubleKey\":42.0,   \"longKey\":73,   \"jsonKey\": {     \"someNumber\": 42,     \"someArray\": [1,2,3],     \"someNestedObject\": {\"key\": \"value\"}  } } ```  The API call is designed to be used by device firmware and requires device access token ('deviceToken'). It is not recommended to use this API call by third-party scripts, rule-engine or platform widgets (use 'Telemetry Controller' instead). 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceToken** | **String** | Your device access token. | |
| **body** | **String** | JSON with attribute key-value pairs. See API call description for example. | |

### Return type

**String**


## postRpcRequest

```
String postRpcRequest(@Nonnull String deviceToken, @Nonnull String body)
```

**POST** `/api/v1/{deviceToken}/rpc`

Send the RPC command (postRpcRequest)

Send the RPC request to server. The request payload is a JSON document that contains 'method' and 'params'. For example:  ```json {\"method\": \"sumOnServer\", \"params\":{\"a\":2, \"b\":2}} ```  The response contains arbitrary JSON with the RPC reply. For example:   ```json {\"result\": 4} ```  The API call is designed to be used by device firmware and requires device access token ('deviceToken'). It is not recommended to use this API call by third-party scripts, rule-engine or platform widgets (use 'Telemetry Controller' instead). 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceToken** | **String** | Your device access token. | |
| **body** | **String** | The RPC request JSON | |

### Return type

**String**


## postTelemetry

```
String postTelemetry(@Nonnull String deviceToken, @Nonnull String body)
```

**POST** `/api/v1/{deviceToken}/telemetry`

Post time series data (postTelemetry)

Post time series data on behalf of device.   Example of the request: The request payload is a JSON document with three possible formats:  Simple format without timestamp. In such a case, current server time will be used:     ```json {  \"stringKey\":\"value1\",   \"booleanKey\":true,   \"doubleKey\":42.0,   \"longKey\":73,   \"jsonKey\": {     \"someNumber\": 42,     \"someArray\": [1,2,3],     \"someNestedObject\": {\"key\": \"value\"}  } } ```     Single JSON object with timestamp:     ```json {\"ts\":1634712287000,\"values\":{\"temperature\":26, \"humidity\":87}} ```     JSON array with timestamps:     ```json [ {\"ts\":1634712287000,\"values\":{\"temperature\":26, \"humidity\":87}},  {\"ts\":1634712588000,\"values\":{\"temperature\":25, \"humidity\":88}} ] ```  The API call is designed to be used by device firmware and requires device access token ('deviceToken'). It is not recommended to use this API call by third-party scripts, rule-engine or platform widgets (use 'Telemetry Controller' instead). 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceToken** | **String** | Your device access token. | |
| **body** | **String** |  | |

### Return type

**String**


## provisionDevice

```
String provisionDevice(@Nonnull String body)
```

**POST** `/api/v1/provision`

Provision new device (provisionDevice)

Exchange the provision request to the device credentials. See more info about provisioning in the corresponding 'Device provisioning' platform documentation.Requires valid JSON request with the following format:   ```json {   \"deviceName\": \"NEW_DEVICE_NAME\",   \"provisionDeviceKey\": \"u7piawkboq8v32dmcmpp\",   \"provisionDeviceSecret\": \"jpmwdn8ptlswmf4m29bw\" } ```  Where 'deviceName' is the name of enw or existing device which depends on the provisioning strategy. The 'provisionDeviceKey' and 'provisionDeviceSecret' matches info configured in one of the existing device profiles. The result of the successful call is the JSON object that contains new credentials:  ```json {   \"credentialsType\":\"ACCESS_TOKEN\",   \"credentialsValue\":\"DEVICE_ACCESS_TOKEN\",   \"status\":\"SUCCESS\" } ```  


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **String** | JSON with provision request. See API call description for example. | |

### Return type

**String**


## replyToCommand

```
String replyToCommand(@Nonnull String deviceToken, @Nonnull String requestId, @Nonnull String body)
```

**POST** `/api/v1/{deviceToken}/rpc/{requestId}`

Reply to RPC commands (replyToCommand)

Replies to server originated RPC command identified by 'requestId' parameter. The response is arbitrary JSON.  The API call is designed to be used by device firmware and requires device access token ('deviceToken'). It is not recommended to use this API call by third-party scripts, rule-engine or platform widgets (use 'Telemetry Controller' instead). 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceToken** | **String** | Your device access token. | |
| **requestId** | **String** | RPC request id from the incoming RPC request | |
| **body** | **String** | Reply to the RPC request, JSON. For example: {\"status\":\"success\"} | |

### Return type

**String**


## saveClaimingInfo

```
String saveClaimingInfo(@Nonnull String deviceToken, @Nullable String body)
```

**POST** `/api/v1/{deviceToken}/claim`

Save claiming information (saveClaimingInfo)

Saves the information required for user to claim the device. See more info about claiming in the corresponding 'Claiming devices' platform documentation.  Example of the request payload:   ```json {\"secretKey\":\"value\", \"durationMs\":60000} ```  Note: both 'secretKey' and 'durationMs' is optional parameters. In case the secretKey is not specified, the empty string as a default value is used. In case the durationMs is not specified, the system parameter device.claim.duration is used.  The API call is designed to be used by device firmware and requires device access token ('deviceToken'). It is not recommended to use this API call by third-party scripts, rule-engine or platform widgets (use 'Telemetry Controller' instead). 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceToken** | **String** | Your device access token. | |
| **body** | **String** |  | [optional] |

### Return type

**String**


## subscribeToAttributes

```
String subscribeToAttributes(@Nonnull String deviceToken, @Nullable Long timeout)
```

**GET** `/api/v1/{deviceToken}/attributes/updates`

Subscribe to attribute updates (subscribeToAttributes) (Deprecated)

Subscribes to client and shared scope attribute updates using http long polling. Deprecated, since long polling is resource and network consuming. Consider using MQTT or CoAP protocol for light-weight real-time updates.   The API call is designed to be used by device firmware and requires device access token ('deviceToken'). It is not recommended to use this API call by third-party scripts, rule-engine or platform widgets (use 'Telemetry Controller' instead). 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceToken** | **String** | Your device access token. | |
| **timeout** | **Long** | Optional timeout of the long poll. Typically less then 60 seconds, since limited on the server side. | [optional] [default to 0] |

### Return type

**String**


## subscribeToCommands

```
String subscribeToCommands(@Nonnull String deviceToken, @Nullable Long timeout)
```

**GET** `/api/v1/{deviceToken}/rpc`

Subscribe to RPC commands (subscribeToCommands) (Deprecated)

Subscribes to RPC commands using http long polling. Deprecated, since long polling is resource and network consuming. Consider using MQTT or CoAP protocol for light-weight real-time updates.   The API call is designed to be used by device firmware and requires device access token ('deviceToken'). It is not recommended to use this API call by third-party scripts, rule-engine or platform widgets (use 'Telemetry Controller' instead). 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceToken** | **String** | Your device access token. | |
| **timeout** | **Long** | Optional timeout of the long poll. Typically less then 60 seconds, since limited on the server side. | [optional] [default to 0] |

### Return type

**String**


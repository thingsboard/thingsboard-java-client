# DeviceApiControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**claimDevice**](#claimDevice) | **POST** /api/v1/{deviceToken}/claim | Save claiming information (claimDevice) |
| [**getDeviceAttributes**](#getDeviceAttributes) | **GET** /api/v1/{deviceToken}/attributes | Get attributes (getDeviceAttributes) |
| [**getFirmware**](#getFirmware) | **GET** /api/v1/{deviceToken}/firmware | Get Device Firmware (getFirmware) |
| [**getSoftware**](#getSoftware) | **GET** /api/v1/{deviceToken}/software | Get Device Software (getSoftware) |
| [**postDeviceAttributes**](#postDeviceAttributes) | **POST** /api/v1/{deviceToken}/attributes | Post attributes (postDeviceAttributes) |
| [**postRpcRequest**](#postRpcRequest) | **POST** /api/v1/{deviceToken}/rpc | Send the RPC command (postRpcRequest) |
| [**postTelemetry**](#postTelemetry) | **POST** /api/v1/{deviceToken}/telemetry | Post time series data (postTelemetry) |
| [**provisionDevice**](#provisionDevice) | **POST** /api/v1/provision | Provision new device (provisionDevice) |
| [**replyToCommand**](#replyToCommand) | **POST** /api/v1/{deviceToken}/rpc/{requestId} | Reply to RPC commands (replyToCommand) |
| [**subscribeToAttributes**](#subscribeToAttributes) | **GET** /api/v1/{deviceToken}/attributes/updates | Subscribe to attribute updates (subscribeToAttributes) (Deprecated) |
| [**subscribeToCommands**](#subscribeToCommands) | **GET** /api/v1/{deviceToken}/rpc | Subscribe to RPC commands (subscribeToCommands) (Deprecated) |



## claimDevice

> String claimDevice(deviceToken, body)

Save claiming information (claimDevice)

Saves the information required for user to claim the device. See more info about claiming in the corresponding &#39;Claiming devices&#39; platform documentation.  Example of the request payload:   &#x60;&#x60;&#x60;json {\&quot;secretKey\&quot;:\&quot;value\&quot;, \&quot;durationMs\&quot;:60000} &#x60;&#x60;&#x60;  Note: both &#39;secretKey&#39; and &#39;durationMs&#39; is optional parameters. In case the secretKey is not specified, the empty string as a default value is used. In case the durationMs is not specified, the system parameter device.claim.duration is used.  The API call is designed to be used by device firmware and requires device access token (&#39;deviceToken&#39;). It is not recommended to use this API call by third-party scripts, rule-engine or platform widgets (use &#39;Telemetry Controller&#39; instead). 

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceToken** | **String** | Your device access token. | |
| **body** | **String** |  | [optional] |


## getDeviceAttributes

> String getDeviceAttributes(deviceToken, clientKeys, sharedKeys)

Get attributes (getDeviceAttributes)

Returns all attributes that belong to device. Use optional &#39;clientKeys&#39; and/or &#39;sharedKeys&#39; parameter to return specific attributes.   Example of the result:   &#x60;&#x60;&#x60;json {  \&quot;stringKey\&quot;:\&quot;value1\&quot;,   \&quot;booleanKey\&quot;:true,   \&quot;doubleKey\&quot;:42.0,   \&quot;longKey\&quot;:73,   \&quot;jsonKey\&quot;: {     \&quot;someNumber\&quot;: 42,     \&quot;someArray\&quot;: [1,2,3],     \&quot;someNestedObject\&quot;: {\&quot;key\&quot;: \&quot;value\&quot;}  } } &#x60;&#x60;&#x60;  The API call is designed to be used by device firmware and requires device access token (&#39;deviceToken&#39;). It is not recommended to use this API call by third-party scripts, rule-engine or platform widgets (use &#39;Telemetry Controller&#39; instead). 

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceToken** | **String** | Your device access token. | |
| **clientKeys** | **String** | Comma separated key names for attribute with client scope | |
| **sharedKeys** | **String** | Comma separated key names for attribute with shared scope | |


## getFirmware

> String getFirmware(deviceToken, title, version, size, chunk)

Get Device Firmware (getFirmware)

Downloads the current firmware package.When the platform initiates firmware update, it informs the device by updating the &#39;fw_title&#39;, &#39;fw_version&#39;, &#39;fw_checksum&#39; and &#39;fw_checksum_algorithm&#39; shared attributes.The &#39;fw_title&#39; and &#39;fw_version&#39; parameters must be supplied in this request to double-check that the firmware that device is downloading matches the firmware it expects to download. This is important, since the administrator may change the firmware assignment while device is downloading the firmware.   Optional &#39;chunk&#39; and &#39;size&#39; parameters may be used to download the firmware in chunks. For example, device may request first 16 KB of firmware using &#39;chunk&#39;&#x3D;0 and &#39;size&#39;&#x3D;16384. Next 16KB using &#39;chunk&#39;&#x3D;1 and &#39;size&#39;&#x3D;16384. The last chunk should have less bytes then requested using &#39;size&#39; parameter.   The API call is designed to be used by device firmware and requires device access token (&#39;deviceToken&#39;). It is not recommended to use this API call by third-party scripts, rule-engine or platform widgets (use &#39;Telemetry Controller&#39; instead). 

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceToken** | **String** | Your device access token. | |
| **title** | **String** | Title of the firmware, corresponds to the value of &#39;fw_title&#39; attribute. | |
| **version** | **String** | Version of the firmware, corresponds to the value of &#39;fw_version&#39; attribute. | |
| **size** | **Integer** | Size of the chunk. Optional. Omit to download the entire file without chunks. | [optional] [default to 0] |
| **chunk** | **Integer** | Index of the chunk. Optional. Omit to download the entire file without chunks. | [optional] [default to 0] |


## getSoftware

> String getSoftware(deviceToken, title, version, size, chunk)

Get Device Software (getSoftware)

Downloads the current software package.When the platform initiates software update, it informs the device by updating the &#39;sw_title&#39;, &#39;sw_version&#39;, &#39;sw_checksum&#39; and &#39;sw_checksum_algorithm&#39; shared attributes.The &#39;sw_title&#39; and &#39;sw_version&#39; parameters must be supplied in this request to double-check that the software that device is downloading matches the software it expects to download. This is important, since the administrator may change the software assignment while device is downloading the software.   Optional &#39;chunk&#39; and &#39;size&#39; parameters may be used to download the software in chunks. For example, device may request first 16 KB of software using &#39;chunk&#39;&#x3D;0 and &#39;size&#39;&#x3D;16384. Next 16KB using &#39;chunk&#39;&#x3D;1 and &#39;size&#39;&#x3D;16384. The last chunk should have less bytes then requested using &#39;size&#39; parameter.   The API call is designed to be used by device firmware and requires device access token (&#39;deviceToken&#39;). It is not recommended to use this API call by third-party scripts, rule-engine or platform widgets (use &#39;Telemetry Controller&#39; instead). 

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceToken** | **String** | Your device access token. | |
| **title** | **String** | Title of the software, corresponds to the value of &#39;sw_title&#39; attribute. | |
| **version** | **String** | Version of the software, corresponds to the value of &#39;sw_version&#39; attribute. | |
| **size** | **Integer** | Size of the chunk. Optional. Omit to download the entire file without using  chunks. | [optional] [default to 0] |
| **chunk** | **Integer** | Index of the chunk. Optional. Omit to download the entire file without using chunks. | [optional] [default to 0] |


## postDeviceAttributes

> String postDeviceAttributes(deviceToken, body)

Post attributes (postDeviceAttributes)

Post client attribute updates on behalf of device.   Example of the request:   &#x60;&#x60;&#x60;json {  \&quot;stringKey\&quot;:\&quot;value1\&quot;,   \&quot;booleanKey\&quot;:true,   \&quot;doubleKey\&quot;:42.0,   \&quot;longKey\&quot;:73,   \&quot;jsonKey\&quot;: {     \&quot;someNumber\&quot;: 42,     \&quot;someArray\&quot;: [1,2,3],     \&quot;someNestedObject\&quot;: {\&quot;key\&quot;: \&quot;value\&quot;}  } } &#x60;&#x60;&#x60;  The API call is designed to be used by device firmware and requires device access token (&#39;deviceToken&#39;). It is not recommended to use this API call by third-party scripts, rule-engine or platform widgets (use &#39;Telemetry Controller&#39; instead). 

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceToken** | **String** | Your device access token. | |
| **body** | **String** | JSON with attribute key-value pairs. See API call description for example. | |


## postRpcRequest

> String postRpcRequest(deviceToken, body)

Send the RPC command (postRpcRequest)

Send the RPC request to server. The request payload is a JSON document that contains &#39;method&#39; and &#39;params&#39;. For example:  &#x60;&#x60;&#x60;json {\&quot;method\&quot;: \&quot;sumOnServer\&quot;, \&quot;params\&quot;:{\&quot;a\&quot;:2, \&quot;b\&quot;:2}} &#x60;&#x60;&#x60;  The response contains arbitrary JSON with the RPC reply. For example:   &#x60;&#x60;&#x60;json {\&quot;result\&quot;: 4} &#x60;&#x60;&#x60;  The API call is designed to be used by device firmware and requires device access token (&#39;deviceToken&#39;). It is not recommended to use this API call by third-party scripts, rule-engine or platform widgets (use &#39;Telemetry Controller&#39; instead). 

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceToken** | **String** | Your device access token. | |
| **body** | **String** | The RPC request JSON | |


## postTelemetry

> String postTelemetry(deviceToken, body)

Post time series data (postTelemetry)

Post time series data on behalf of device.   Example of the request: The request payload is a JSON document with three possible formats:  Simple format without timestamp. In such a case, current server time will be used:     &#x60;&#x60;&#x60;json {  \&quot;stringKey\&quot;:\&quot;value1\&quot;,   \&quot;booleanKey\&quot;:true,   \&quot;doubleKey\&quot;:42.0,   \&quot;longKey\&quot;:73,   \&quot;jsonKey\&quot;: {     \&quot;someNumber\&quot;: 42,     \&quot;someArray\&quot;: [1,2,3],     \&quot;someNestedObject\&quot;: {\&quot;key\&quot;: \&quot;value\&quot;}  } } &#x60;&#x60;&#x60;     Single JSON object with timestamp:     &#x60;&#x60;&#x60;json {\&quot;ts\&quot;:1634712287000,\&quot;values\&quot;:{\&quot;temperature\&quot;:26, \&quot;humidity\&quot;:87}} &#x60;&#x60;&#x60;     JSON array with timestamps:     &#x60;&#x60;&#x60;json [ {\&quot;ts\&quot;:1634712287000,\&quot;values\&quot;:{\&quot;temperature\&quot;:26, \&quot;humidity\&quot;:87}},  {\&quot;ts\&quot;:1634712588000,\&quot;values\&quot;:{\&quot;temperature\&quot;:25, \&quot;humidity\&quot;:88}} ] &#x60;&#x60;&#x60;  The API call is designed to be used by device firmware and requires device access token (&#39;deviceToken&#39;). It is not recommended to use this API call by third-party scripts, rule-engine or platform widgets (use &#39;Telemetry Controller&#39; instead). 

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceToken** | **String** | Your device access token. | |
| **body** | **String** |  | |


## provisionDevice

> String provisionDevice(body)

Provision new device (provisionDevice)

Exchange the provision request to the device credentials. See more info about provisioning in the corresponding &#39;Device provisioning&#39; platform documentation.Requires valid JSON request with the following format:   &#x60;&#x60;&#x60;json {   \&quot;deviceName\&quot;: \&quot;NEW_DEVICE_NAME\&quot;,   \&quot;provisionDeviceKey\&quot;: \&quot;u7piawkboq8v32dmcmpp\&quot;,   \&quot;provisionDeviceSecret\&quot;: \&quot;jpmwdn8ptlswmf4m29bw\&quot; } &#x60;&#x60;&#x60;  Where &#39;deviceName&#39; is the name of enw or existing device which depends on the provisioning strategy. The &#39;provisionDeviceKey&#39; and &#39;provisionDeviceSecret&#39; matches info configured in one of the existing device profiles. The result of the successful call is the JSON object that contains new credentials:  &#x60;&#x60;&#x60;json {   \&quot;credentialsType\&quot;:\&quot;ACCESS_TOKEN\&quot;,   \&quot;credentialsValue\&quot;:\&quot;DEVICE_ACCESS_TOKEN\&quot;,   \&quot;status\&quot;:\&quot;SUCCESS\&quot; } &#x60;&#x60;&#x60;  

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **String** | JSON with provision request. See API call description for example. | |


## replyToCommand

> String replyToCommand(deviceToken, requestId, body)

Reply to RPC commands (replyToCommand)

Replies to server originated RPC command identified by &#39;requestId&#39; parameter. The response is arbitrary JSON.  The API call is designed to be used by device firmware and requires device access token (&#39;deviceToken&#39;). It is not recommended to use this API call by third-party scripts, rule-engine or platform widgets (use &#39;Telemetry Controller&#39; instead). 

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceToken** | **String** | Your device access token. | |
| **requestId** | **String** | RPC request id from the incoming RPC request | |
| **body** | **String** | Reply to the RPC request, JSON. For example: {\&quot;status\&quot;:\&quot;success\&quot;} | |


## subscribeToAttributes

> String subscribeToAttributes(deviceToken, timeout)

Subscribe to attribute updates (subscribeToAttributes) (Deprecated)

Subscribes to client and shared scope attribute updates using http long polling. Deprecated, since long polling is resource and network consuming. Consider using MQTT or CoAP protocol for light-weight real-time updates.   The API call is designed to be used by device firmware and requires device access token (&#39;deviceToken&#39;). It is not recommended to use this API call by third-party scripts, rule-engine or platform widgets (use &#39;Telemetry Controller&#39; instead). 

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceToken** | **String** | Your device access token. | |
| **timeout** | **Long** | Optional timeout of the long poll. Typically less then 60 seconds, since limited on the server side. | [optional] [default to 0] |


## subscribeToCommands

> String subscribeToCommands(deviceToken, timeout)

Subscribe to RPC commands (subscribeToCommands) (Deprecated)

Subscribes to RPC commands using http long polling. Deprecated, since long polling is resource and network consuming. Consider using MQTT or CoAP protocol for light-weight real-time updates.   The API call is designed to be used by device firmware and requires device access token (&#39;deviceToken&#39;). It is not recommended to use this API call by third-party scripts, rule-engine or platform widgets (use &#39;Telemetry Controller&#39; instead). 

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceToken** | **String** | Your device access token. | |
| **timeout** | **Long** | Optional timeout of the long poll. Typically less then 60 seconds, since limited on the server side. | [optional] [default to 0] |


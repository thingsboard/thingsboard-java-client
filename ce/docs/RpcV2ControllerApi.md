# RpcV2ControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteRpc**](#deleteRpc) | **DELETE** /api/rpc/persistent/{rpcId} | Delete persistent RPC |
| [**getPersistedRpc**](#getPersistedRpc) | **GET** /api/rpc/persistent/{rpcId} | Get persistent RPC request |
| [**getPersistedRpcByDevice**](#getPersistedRpcByDevice) | **GET** /api/rpc/persistent/device/{deviceId} | Get persistent RPC requests |
| [**handleOneWayDeviceRPCRequest**](#handleOneWayDeviceRPCRequest) | **POST** /api/rpc/oneway/{deviceId} | Send one-way RPC request |
| [**handleTwoWayDeviceRPCRequest**](#handleTwoWayDeviceRPCRequest) | **POST** /api/rpc/twoway/{deviceId} | Send two-way RPC request |



## deleteRpc

> deleteRpc(rpcId)

Delete persistent RPC

Deletes the persistent RPC request.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **rpcId** | **String** | A string value representing the rpc id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## getPersistedRpc

> Rpc getPersistedRpc(rpcId)

Get persistent RPC request

Get information about the status of the RPC call.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **rpcId** | **String** | A string value representing the rpc id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## getPersistedRpcByDevice

> String getPersistedRpcByDevice(deviceId, pageSize, page, rpcStatus, textSearch, sortProperty, sortOrder)

Get persistent RPC requests

Allows to query RPC calls for specific device using pagination.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String** | A string value representing the device id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **rpcStatus** | **String** | Status of the RPC | [optional] [enum: QUEUED, SENT, DELIVERED, SUCCESSFUL, TIMEOUT, EXPIRED, FAILED] |
| **textSearch** | **String** | Not implemented. Leave empty. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, expirationTime, request, response] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |


## handleOneWayDeviceRPCRequest

> String handleOneWayDeviceRPCRequest(deviceId, body)

Send one-way RPC request

Sends the one-way remote-procedure call (RPC) request to device. Sends the one-way remote-procedure call (RPC) request to device. The RPC call is A JSON that contains the method name (&#39;method&#39;), parameters (&#39;params&#39;) and multiple optional fields. See example below. We will review the properties of the RPC call one-by-one below.   &#x60;&#x60;&#x60;json {   \&quot;method\&quot;: \&quot;setGpio\&quot;,   \&quot;params\&quot;: {     \&quot;pin\&quot;: 7,     \&quot;value\&quot;: 1   },   \&quot;persistent\&quot;: false,   \&quot;timeout\&quot;: 5000 } &#x60;&#x60;&#x60;  ### Server-side RPC structure  The body of server-side RPC request consists of multiple fields:  * **method** - mandatory, name of the method to distinct the RPC calls.   For example, \&quot;getCurrentTime\&quot; or \&quot;getWeatherForecast\&quot;. The value of the parameter is a string. * **params** - mandatory, parameters used for processing of the request. The value is a JSON. Leave empty JSON \&quot;{}\&quot; if no parameters needed. * **timeout** - optional, value of the processing timeout in milliseconds. The default value is 10000 (10 seconds). The minimum value is 5000 (5 seconds). * **expirationTime** - optional, value of the epoch time (in milliseconds, UTC timezone). Overrides **timeout** if present. * **persistent** - optional, indicates persistent RPC. The default value is \&quot;false\&quot;. * **retries** - optional, defines how many times persistent RPC will be re-sent in case of failures on the network and/or device side. * **additionalInfo** - optional, defines metadata for the persistent RPC that will be added to the persistent RPC events.  ### RPC Result In case of persistent RPC, the result of this call is &#39;rpcId&#39; UUID. In case of lightweight RPC, the result of this call is either 200 OK if the message was sent to device, or 504 Gateway Timeout if device is offline.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String** | A string value representing the device id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **body** | **String** |  | |


## handleTwoWayDeviceRPCRequest

> String handleTwoWayDeviceRPCRequest(deviceId, body)

Send two-way RPC request

Sends the two-way remote-procedure call (RPC) request to device. Sends the one-way remote-procedure call (RPC) request to device. The RPC call is A JSON that contains the method name (&#39;method&#39;), parameters (&#39;params&#39;) and multiple optional fields. See example below. We will review the properties of the RPC call one-by-one below.   &#x60;&#x60;&#x60;json {   \&quot;method\&quot;: \&quot;setGpio\&quot;,   \&quot;params\&quot;: {     \&quot;pin\&quot;: 7,     \&quot;value\&quot;: 1   },   \&quot;persistent\&quot;: false,   \&quot;timeout\&quot;: 5000 } &#x60;&#x60;&#x60;  ### Server-side RPC structure  The body of server-side RPC request consists of multiple fields:  * **method** - mandatory, name of the method to distinct the RPC calls.   For example, \&quot;getCurrentTime\&quot; or \&quot;getWeatherForecast\&quot;. The value of the parameter is a string. * **params** - mandatory, parameters used for processing of the request. The value is a JSON. Leave empty JSON \&quot;{}\&quot; if no parameters needed. * **timeout** - optional, value of the processing timeout in milliseconds. The default value is 10000 (10 seconds). The minimum value is 5000 (5 seconds). * **expirationTime** - optional, value of the epoch time (in milliseconds, UTC timezone). Overrides **timeout** if present. * **persistent** - optional, indicates persistent RPC. The default value is \&quot;false\&quot;. * **retries** - optional, defines how many times persistent RPC will be re-sent in case of failures on the network and/or device side. * **additionalInfo** - optional, defines metadata for the persistent RPC that will be added to the persistent RPC events.  ### RPC Result In case of persistent RPC, the result of this call is &#39;rpcId&#39; UUID. In case of lightweight RPC, the result of this call is the response from device, or 504 Gateway Timeout if device is offline.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String** | A string value representing the device id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **body** | **String** |  | |


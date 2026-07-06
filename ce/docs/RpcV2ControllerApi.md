# RpcV2ControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void deleteRpc(DeleteRpcArgs args) // Delete persistent RPC
Rpc getPersistedRpc(GetPersistedRpcArgs args) // Get persistent RPC request
String getPersistedRpcByDevice(GetPersistedRpcByDeviceArgs args) // Get persistent RPC requests
String handleOneWayDeviceRPCRequestV2(HandleOneWayDeviceRPCRequestV2Args args) // Send one-way RPC request (handleOneWayDeviceRPCRequestV2)
String handleTwoWayDeviceRPCRequestV2(HandleTwoWayDeviceRPCRequestV2Args args) // Send two-way RPC request (handleTwoWayDeviceRPCRequestV2)
```


## deleteRpc

**DELETE** `/api/rpc/persistent/{rpcId}`

Delete persistent RPC

Deletes the persistent RPC request.  Available for users with 'TENANT_ADMIN' authority.

```java
void deleteRpc(DeleteRpcArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteRpcArgs.builder()
        .rpcId(String)
        .build()
```

### `DeleteRpcArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `rpcId` | `String` | **yes** | A string value representing the rpc id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## getPersistedRpc

**GET** `/api/rpc/persistent/{rpcId}`

Get persistent RPC request

Get information about the status of the RPC call.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
Rpc getPersistedRpc(GetPersistedRpcArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetPersistedRpcArgs.builder()
        .rpcId(String)
        .build()
```

### `GetPersistedRpcArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `rpcId` | `String` | **yes** | A string value representing the rpc id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Rpc`


## getPersistedRpcByDevice

**GET** `/api/rpc/persistent/device/{deviceId}`

Get persistent RPC requests

Allows to query RPC calls for specific device using pagination.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
String getPersistedRpcByDevice(GetPersistedRpcByDeviceArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetPersistedRpcByDeviceArgs.builder()
        .deviceId(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetPersistedRpcByDeviceArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `deviceId` | `String` | **yes** | A string value representing the device id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `rpcStatus` | `String` | no | Status of the RPC | enum: `QUEUED`, `SENT`, `DELIVERED`, `SUCCESSFUL`, `TIMEOUT`, `EXPIRED`, `FAILED` |
| `textSearch` | `String` | no | Not implemented. Leave empty. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `expirationTime`, `request`, `response` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`String`


## handleOneWayDeviceRPCRequestV2

**POST** `/api/rpc/oneway/{deviceId}`

Send one-way RPC request (handleOneWayDeviceRPCRequestV2)

Sends the one-way remote-procedure call (RPC) request to device. Sends the one-way remote-procedure call (RPC) request to device. The RPC call is A JSON that contains the method name ('method'), parameters ('params') and multiple optional fields. See example below. We will review the properties of the RPC call one-by-one below.   ```json {   \"method\": \"setGpio\",   \"params\": {     \"pin\": 7,     \"value\": 1   },   \"persistent\": false,   \"timeout\": 5000 } ```  ### Server-side RPC structure  The body of server-side RPC request consists of multiple fields:  * **method** - mandatory, name of the method to distinct the RPC calls.   For example, \"getCurrentTime\" or \"getWeatherForecast\". The value of the parameter is a string. * **params** - mandatory, parameters used for processing of the request. The value is a JSON. Leave empty JSON \"{}\" if no parameters needed. * **timeout** - optional, value of the processing timeout in milliseconds. The default value is 10000 (10 seconds). The minimum value is 5000 (5 seconds). * **expirationTime** - optional, value of the epoch time (in milliseconds, UTC timezone). Overrides **timeout** if present. * **persistent** - optional, indicates persistent RPC. The default value is \"false\". * **retries** - optional, defines how many times persistent RPC will be re-sent in case of failures on the network and/or device side. * **additionalInfo** - optional, defines metadata for the persistent RPC that will be added to the persistent RPC events.  ### RPC Result In case of persistent RPC, the result of this call is 'rpcId' UUID. In case of lightweight RPC, the result of this call is either 200 OK if the message was sent to device, or 504 Gateway Timeout if device is offline.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
String handleOneWayDeviceRPCRequestV2(HandleOneWayDeviceRPCRequestV2Args args)
// build the request (required fields shown; add optional fields from the table below as needed):
HandleOneWayDeviceRPCRequestV2Args.builder()
        .deviceId(String)
        .body(String)
        .build()
```

### `HandleOneWayDeviceRPCRequestV2Args` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `deviceId` | `String` | **yes** | A string value representing the device id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `body` | `String` | **yes** | A JSON object representing the RPC request. | |

### Return type

`String`


## handleTwoWayDeviceRPCRequestV2

**POST** `/api/rpc/twoway/{deviceId}`

Send two-way RPC request (handleTwoWayDeviceRPCRequestV2)

Sends the two-way remote-procedure call (RPC) request to device. Sends the one-way remote-procedure call (RPC) request to device. The RPC call is A JSON that contains the method name ('method'), parameters ('params') and multiple optional fields. See example below. We will review the properties of the RPC call one-by-one below.   ```json {   \"method\": \"setGpio\",   \"params\": {     \"pin\": 7,     \"value\": 1   },   \"persistent\": false,   \"timeout\": 5000 } ```  ### Server-side RPC structure  The body of server-side RPC request consists of multiple fields:  * **method** - mandatory, name of the method to distinct the RPC calls.   For example, \"getCurrentTime\" or \"getWeatherForecast\". The value of the parameter is a string. * **params** - mandatory, parameters used for processing of the request. The value is a JSON. Leave empty JSON \"{}\" if no parameters needed. * **timeout** - optional, value of the processing timeout in milliseconds. The default value is 10000 (10 seconds). The minimum value is 5000 (5 seconds). * **expirationTime** - optional, value of the epoch time (in milliseconds, UTC timezone). Overrides **timeout** if present. * **persistent** - optional, indicates persistent RPC. The default value is \"false\". * **retries** - optional, defines how many times persistent RPC will be re-sent in case of failures on the network and/or device side. * **additionalInfo** - optional, defines metadata for the persistent RPC that will be added to the persistent RPC events.  ### RPC Result In case of persistent RPC, the result of this call is 'rpcId' UUID. In case of lightweight RPC, the result of this call is the response from device, or 504 Gateway Timeout if device is offline.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
String handleTwoWayDeviceRPCRequestV2(HandleTwoWayDeviceRPCRequestV2Args args)
// build the request (required fields shown; add optional fields from the table below as needed):
HandleTwoWayDeviceRPCRequestV2Args.builder()
        .deviceId(String)
        .body(String)
        .build()
```

### `HandleTwoWayDeviceRPCRequestV2Args` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `deviceId` | `String` | **yes** | A string value representing the device id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `body` | `String` | **yes** | A JSON object representing the RPC request. | |

### Return type

`String`


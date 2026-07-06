# RpcV1ControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
String handleOneWayDeviceRPCRequestV1(HandleOneWayDeviceRPCRequestV1Args args) // Send one-way RPC request (handleOneWayDeviceRPCRequestV1)
String handleTwoWayDeviceRPCRequestV1(HandleTwoWayDeviceRPCRequestV1Args args) // Send two-way RPC request (handleTwoWayDeviceRPCRequestV1)
```


## handleOneWayDeviceRPCRequestV1

**POST** `/api/plugins/rpc/oneway/{deviceId}`

Send one-way RPC request (handleOneWayDeviceRPCRequestV1)

Deprecated. See 'Rpc V 2 Controller' instead.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
String handleOneWayDeviceRPCRequestV1(HandleOneWayDeviceRPCRequestV1Args args)
// build the request (required fields shown; add optional fields from the table below as needed):
HandleOneWayDeviceRPCRequestV1Args.builder()
        .deviceId(String)
        .body(String)
        .build()
```

### `HandleOneWayDeviceRPCRequestV1Args` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `deviceId` | `String` | **yes** | A string value representing the device id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `body` | `String` | **yes** | A JSON object representing the RPC request. | |

### Return type

`String`


## handleTwoWayDeviceRPCRequestV1

**POST** `/api/plugins/rpc/twoway/{deviceId}`

Send two-way RPC request (handleTwoWayDeviceRPCRequestV1)

Deprecated. See 'Rpc V 2 Controller' instead.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
String handleTwoWayDeviceRPCRequestV1(HandleTwoWayDeviceRPCRequestV1Args args)
// build the request (required fields shown; add optional fields from the table below as needed):
HandleTwoWayDeviceRPCRequestV1Args.builder()
        .deviceId(String)
        .body(String)
        .build()
```

### `HandleTwoWayDeviceRPCRequestV1Args` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `deviceId` | `String` | **yes** | A string value representing the device id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `body` | `String` | **yes** | A JSON object representing the RPC request. | |

### Return type

`String`


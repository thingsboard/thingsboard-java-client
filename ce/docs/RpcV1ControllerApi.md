# RpcV1ControllerApi

`ThingsboardClient` methods:

```
String handleOneWayDeviceRPCRequestV1(@Nonnull String deviceId, @Nonnull String body) // Send one-way RPC request (handleOneWayDeviceRPCRequestV1)
String handleTwoWayDeviceRPCRequestV1(@Nonnull String deviceId, @Nonnull String body) // Send two-way RPC request (handleTwoWayDeviceRPCRequestV1)
```


## handleOneWayDeviceRPCRequestV1

```
String handleOneWayDeviceRPCRequestV1(@Nonnull String deviceId, @Nonnull String body)
```

**POST** `/api/plugins/rpc/oneway/{deviceId}`

Send one-way RPC request (handleOneWayDeviceRPCRequestV1)

Deprecated. See 'Rpc V 2 Controller' instead.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String** | A string value representing the device id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **body** | **String** |  | |

### Return type

**String**


## handleTwoWayDeviceRPCRequestV1

```
String handleTwoWayDeviceRPCRequestV1(@Nonnull String deviceId, @Nonnull String body)
```

**POST** `/api/plugins/rpc/twoway/{deviceId}`

Send two-way RPC request (handleTwoWayDeviceRPCRequestV1)

Deprecated. See 'Rpc V 2 Controller' instead.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String** | A string value representing the device id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **body** | **String** |  | |

### Return type

**String**


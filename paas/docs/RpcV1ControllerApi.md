# RpcV1ControllerApi

`ThingsboardClient` methods:

> Every method that takes input also has a request-object overload — `<method>(<Method>Args args)`,
> built via `<Method>Args.builder()...build()`. The `*Args` classes are nested in `ThingsboardApi`,
> e.g. `import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Prefer that overload in
> new code: adding an optional parameter to an endpoint changes the flat signatures documented
> below, but only adds a builder field to `*Args`.

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
| **body** | **String** | A JSON object representing the RPC request. | |

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
| **body** | **String** | A JSON object representing the RPC request. | |

### Return type

**String**


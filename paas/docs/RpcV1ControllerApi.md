# RpcV1ControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**handleOneWayDeviceRPCRequest1**](#handleOneWayDeviceRPCRequest1) | **POST** /api/plugins/rpc/oneway/{deviceId} | Send one-way RPC request (handleOneWayDeviceRPCRequest) |
| [**handleTwoWayDeviceRPCRequest1**](#handleTwoWayDeviceRPCRequest1) | **POST** /api/plugins/rpc/twoway/{deviceId} | Send two-way RPC request (handleTwoWayDeviceRPCRequest) |



## handleOneWayDeviceRPCRequest1

> String handleOneWayDeviceRPCRequest1(deviceId, body)

Send one-way RPC request (handleOneWayDeviceRPCRequest)

Deprecated. See 'Rpc V 2 Controller' instead.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String** | A string value representing the device id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **body** | **String** |  | |

### Return type

**String**


## handleTwoWayDeviceRPCRequest1

> String handleTwoWayDeviceRPCRequest1(deviceId, body)

Send two-way RPC request (handleTwoWayDeviceRPCRequest)

Deprecated. See 'Rpc V 2 Controller' instead.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String** | A string value representing the device id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **body** | **String** |  | |

### Return type

**String**


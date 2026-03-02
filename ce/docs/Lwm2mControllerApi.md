# Lwm2mControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLwm2mBootstrapSecurityInfo**](#getLwm2mBootstrapSecurityInfo) | **GET** /api/lwm2m/deviceProfile/bootstrap/{isBootstrapServer} | Get Lwm2m Bootstrap SecurityInfo (getLwm2mBootstrapSecurityInfo) |
| [**saveLwm2mDeviceWithCredentials**](#saveLwm2mDeviceWithCredentials) | **POST** /api/lwm2m/device-credentials | Save LwM2M device with credentials (saveLwm2mDeviceWithCredentials) (Deprecated) |



## getLwm2mBootstrapSecurityInfo

> LwM2MServerSecurityConfigDefault getLwm2mBootstrapSecurityInfo(isBootstrapServer)

Get Lwm2m Bootstrap SecurityInfo (getLwm2mBootstrapSecurityInfo)

Get the Lwm2m Bootstrap SecurityInfo object (of the current server) based on the provided isBootstrapServer parameter. If isBootstrapServer == true, get the parameters of the current Bootstrap Server. If isBootstrapServer == false, get the parameters of the current Lwm2m Server. Used for client settings when starting the client in Bootstrap mode.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isBootstrapServer** | **Boolean** | A Boolean value representing the Server SecurityInfo for future Bootstrap client mode settings. Values: 'true' for Bootstrap Server; 'false' for Lwm2m Server.  | |

### Return type

**LwM2MServerSecurityConfigDefault**


## saveLwm2mDeviceWithCredentials

> Device saveLwm2mDeviceWithCredentials(requestBody)

Save LwM2M device with credentials (saveLwm2mDeviceWithCredentials) (Deprecated)


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestBody** | **Map<String, Object>** |  | |

### Return type

**Device**


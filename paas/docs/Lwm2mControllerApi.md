# Lwm2mControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLwm2mBootstrapSecurityInfo**](#getLwm2mBootstrapSecurityInfo) | **GET** /api/lwm2m/deviceProfile/bootstrap/{isBootstrapServer} | Get Lwm2m Bootstrap SecurityInfo (getLwm2mBootstrapSecurityInfo) |
| [**saveDeviceWithCredentials**](#saveDeviceWithCredentials) | **POST** /api/lwm2m/device-credentials | Save device with credentials (Deprecated) |



## getLwm2mBootstrapSecurityInfo

> LwM2MServerSecurityConfigDefault getLwm2mBootstrapSecurityInfo(isBootstrapServer)

Get Lwm2m Bootstrap SecurityInfo (getLwm2mBootstrapSecurityInfo)

Get the Lwm2m Bootstrap SecurityInfo object (of the current server) based on the provided isBootstrapServer parameter. If isBootstrapServer &#x3D;&#x3D; true, get the parameters of the current Bootstrap Server. If isBootstrapServer &#x3D;&#x3D; false, get the parameters of the current Lwm2m Server. Used for client settings when starting the client in Bootstrap mode.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isBootstrapServer** | **Boolean** | A Boolean value representing the Server SecurityInfo for future Bootstrap client mode settings. Values: &#39;true&#39; for Bootstrap Server; &#39;false&#39; for Lwm2m Server.  | |


## saveDeviceWithCredentials

> Device saveDeviceWithCredentials(requestBody, entityGroupId)

Save device with credentials (Deprecated)

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestBody** | **Map&lt;String, Object&gt;** |  | |
| **entityGroupId** | **String** |  | [optional] |


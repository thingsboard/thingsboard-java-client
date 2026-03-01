# DeviceGroupOtaPackageControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteDeviceGroupOtaPackage**](#deleteDeviceGroupOtaPackage) | **DELETE** /api/deviceGroupOtaPackage/{id} | deleteDeviceGroupOtaPackage |
| [**getFirmwareById**](#getFirmwareById) | **GET** /api/deviceGroupOtaPackage/{groupId}/{firmwareType} | getFirmwareById |
| [**saveDeviceGroupOtaPackage**](#saveDeviceGroupOtaPackage) | **POST** /api/deviceGroupOtaPackage | saveDeviceGroupOtaPackage |



## deleteDeviceGroupOtaPackage

> deleteDeviceGroupOtaPackage(id)

deleteDeviceGroupOtaPackage


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String** |  | |

### Return type

null (empty response body)


## getFirmwareById

> DeviceGroupOtaPackage getFirmwareById(groupId, firmwareType)

getFirmwareById


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String** |  | |
| **firmwareType** | **String** |  | |

### Return type

**DeviceGroupOtaPackage**


## saveDeviceGroupOtaPackage

> DeviceGroupOtaPackage saveDeviceGroupOtaPackage(deviceGroupOtaPackage)

saveDeviceGroupOtaPackage


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceGroupOtaPackage** | **DeviceGroupOtaPackage** |  | |

### Return type

**DeviceGroupOtaPackage**


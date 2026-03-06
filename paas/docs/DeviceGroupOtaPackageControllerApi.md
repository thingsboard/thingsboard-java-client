# DeviceGroupOtaPackageControllerApi

`ThingsboardClient` methods:

```
void deleteDeviceGroupOtaPackage(@Nonnull String id) // deleteDeviceGroupOtaPackage
DeviceGroupOtaPackage getFirmwareById(@Nonnull String groupId, @Nonnull String firmwareType) // getFirmwareById
DeviceGroupOtaPackage saveDeviceGroupOtaPackage(@Nonnull DeviceGroupOtaPackage deviceGroupOtaPackage) // saveDeviceGroupOtaPackage
```


## deleteDeviceGroupOtaPackage

```
void deleteDeviceGroupOtaPackage(@Nonnull String id)
```

**DELETE** `/api/deviceGroupOtaPackage/{id}`

deleteDeviceGroupOtaPackage


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String** |  | |

### Return type

null (empty response body)


## getFirmwareById

```
DeviceGroupOtaPackage getFirmwareById(@Nonnull String groupId, @Nonnull String firmwareType)
```

**GET** `/api/deviceGroupOtaPackage/{groupId}/{firmwareType}`

getFirmwareById


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String** |  | |
| **firmwareType** | **String** |  | |

### Return type

**DeviceGroupOtaPackage**


## saveDeviceGroupOtaPackage

```
DeviceGroupOtaPackage saveDeviceGroupOtaPackage(@Nonnull DeviceGroupOtaPackage deviceGroupOtaPackage)
```

**POST** `/api/deviceGroupOtaPackage`

saveDeviceGroupOtaPackage


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceGroupOtaPackage** | **DeviceGroupOtaPackage** |  | |

### Return type

**DeviceGroupOtaPackage**


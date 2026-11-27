# DeviceGroupOtaPackageControllerApi

`ThingsboardClient` methods:

> Every method that takes input also has a request-object overload — `<method>(<Method>Args args)`,
> built via `<Method>Args.builder()...build()`. The `*Args` classes are nested in `ThingsboardApi`,
> e.g. `import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Prefer that overload in
> new code: adding an optional parameter to an endpoint changes the flat signatures documented
> below, but only adds a builder field to `*Args`.

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


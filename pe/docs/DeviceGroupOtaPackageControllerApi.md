# DeviceGroupOtaPackageControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void deleteDeviceGroupOtaPackage(DeleteDeviceGroupOtaPackageArgs args) // deleteDeviceGroupOtaPackage
DeviceGroupOtaPackage getFirmwareById(GetFirmwareByIdArgs args) // getFirmwareById
DeviceGroupOtaPackage saveDeviceGroupOtaPackage(SaveDeviceGroupOtaPackageArgs args) // saveDeviceGroupOtaPackage
```


## deleteDeviceGroupOtaPackage

**DELETE** `/api/deviceGroupOtaPackage/{id}`

deleteDeviceGroupOtaPackage

```java
void deleteDeviceGroupOtaPackage(DeleteDeviceGroupOtaPackageArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteDeviceGroupOtaPackageArgs.builder()
        .id(String)
        .build()
```

### `DeleteDeviceGroupOtaPackageArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `String` | **yes** |  | |

### Return type

null (empty response body)


## getFirmwareById

**GET** `/api/deviceGroupOtaPackage/{groupId}/{firmwareType}`

getFirmwareById

```java
DeviceGroupOtaPackage getFirmwareById(GetFirmwareByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetFirmwareByIdArgs.builder()
        .groupId(String)
        .firmwareType(String)
        .build()
```

### `GetFirmwareByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `groupId` | `String` | **yes** |  | |
| `firmwareType` | `String` | **yes** |  | |

### Return type

`DeviceGroupOtaPackage`


## saveDeviceGroupOtaPackage

**POST** `/api/deviceGroupOtaPackage`

saveDeviceGroupOtaPackage

```java
DeviceGroupOtaPackage saveDeviceGroupOtaPackage(SaveDeviceGroupOtaPackageArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveDeviceGroupOtaPackageArgs.builder()
        .deviceGroupOtaPackage(DeviceGroupOtaPackage)
        .build()
```

### `SaveDeviceGroupOtaPackageArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `deviceGroupOtaPackage` | `DeviceGroupOtaPackage` | **yes** |  | |

### Return type

`DeviceGroupOtaPackage`


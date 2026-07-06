# DeviceControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
Device assignDeviceToCustomer(AssignDeviceToCustomerArgs args) // Assign device to customer (assignDeviceToCustomer)
Device assignDeviceToEdge(AssignDeviceToEdgeArgs args) // Assign device to edge (assignDeviceToEdge)
Device assignDeviceToPublicCustomer(AssignDeviceToPublicCustomerArgs args) // Make device publicly available (assignDeviceToPublicCustomer)
Device assignDeviceToTenant(AssignDeviceToTenantArgs args) // Assign device to tenant (assignDeviceToTenant)
String claimDevice(ClaimDeviceArgs args) // Claim device (claimDevice)
Long countByDeviceProfileAndEmptyOtaPackage(CountByDeviceProfileAndEmptyOtaPackageArgs args) // Count devices by device profile  (countByDeviceProfileAndEmptyOtaPackage)
void deleteDevice(DeleteDeviceArgs args) // Delete device (deleteDevice)
List<Device> findDevicesByQuery(FindDevicesByQueryArgs args) // Find related devices (findDevicesByQuery)
PageDataDeviceInfo getCustomerDeviceInfos(GetCustomerDeviceInfosArgs args) // Get Customer Device Infos (getCustomerDeviceInfos)
PageDataDevice getCustomerDevices(GetCustomerDevicesArgs args) // Get Customer Devices (getCustomerDevices)
Device getDeviceById(GetDeviceByIdArgs args) // Get Device (getDeviceById)
DeviceCredentials getDeviceCredentialsByDeviceId(GetDeviceCredentialsByDeviceIdArgs args) // Get Device Credentials (getDeviceCredentialsByDeviceId)
DeviceInfo getDeviceInfoById(GetDeviceInfoByIdArgs args) // Get Device Info (getDeviceInfoById)
List<EntitySubtype> getDeviceTypes() // Get Device Types (getDeviceTypes)
List<Device> getDevicesByIds(GetDevicesByIdsArgs args) // Get Devices By Ids (getDevicesByIds)
PageDataDeviceInfo getEdgeDevices(GetEdgeDevicesArgs args) // Get devices assigned to edge (getEdgeDevices)
Device getTenantDeviceByName(GetTenantDeviceByNameArgs args) // Get Tenant Device (getTenantDeviceByName)
PageDataDeviceInfo getTenantDeviceInfos(GetTenantDeviceInfosArgs args) // Get Tenant Device Infos (getTenantDeviceInfos)
PageDataDevice getTenantDevices(GetTenantDevicesArgs args) // Get Tenant Devices (getTenantDevices)
BulkImportResultDevice processDevicesBulkImport(ProcessDevicesBulkImportArgs args) // Import the bulk of devices (processDevicesBulkImport)
String reClaimDevice(ReClaimDeviceArgs args) // Reclaim device (reClaimDevice)
Device saveDevice(SaveDeviceArgs args) // Create Or Update Device (saveDevice)
Device saveDeviceWithCredentials(SaveDeviceWithCredentialsArgs args) // Create Device (saveDevice) with credentials 
Device unassignDeviceFromCustomer(UnassignDeviceFromCustomerArgs args) // Unassign device from customer (unassignDeviceFromCustomer)
Device unassignDeviceFromEdge(UnassignDeviceFromEdgeArgs args) // Unassign device from edge (unassignDeviceFromEdge)
DeviceCredentials updateDeviceCredentials(UpdateDeviceCredentialsArgs args) // Update device credentials (updateDeviceCredentials)
```


## assignDeviceToCustomer

**POST** `/api/customer/{customerId}/device/{deviceId}`

Assign device to customer (assignDeviceToCustomer)

Creates assignment of the device to customer. Customer will be able to query device afterwards.  Available for users with 'TENANT_ADMIN' authority.

```java
Device assignDeviceToCustomer(AssignDeviceToCustomerArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
AssignDeviceToCustomerArgs.builder()
        .customerId(String)
        .deviceId(String)
        .build()
```

### `AssignDeviceToCustomerArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customerId` | `String` | **yes** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `deviceId` | `String` | **yes** | A string value representing the device id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Device`


## assignDeviceToEdge

**POST** `/api/edge/{edgeId}/device/{deviceId}`

Assign device to edge (assignDeviceToEdge)

Creates assignment of an existing device to an instance of The Edge. Assignment works in async way - first, notification event pushed to edge service queue on platform. Second, remote edge service will receive a copy of assignment device (Edge will receive this instantly, if it's currently connected, or once it's going to be connected to platform). Third, once device will be delivered to edge service, it's going to be available for usage on remote edge instance.  Available for users with 'TENANT_ADMIN' authority.

```java
Device assignDeviceToEdge(AssignDeviceToEdgeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
AssignDeviceToEdgeArgs.builder()
        .edgeId(String)
        .deviceId(String)
        .build()
```

### `AssignDeviceToEdgeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `deviceId` | `String` | **yes** | A string value representing the device id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Device`


## assignDeviceToPublicCustomer

**POST** `/api/customer/public/device/{deviceId}`

Make device publicly available (assignDeviceToPublicCustomer)

Device will be available for non-authorized (not logged-in) users. This is useful to create dashboards that you plan to share/embed on a publicly available website. However, users that are logged-in and belong to different tenant will not be able to access the device.  Available for users with 'TENANT_ADMIN' authority.

```java
Device assignDeviceToPublicCustomer(AssignDeviceToPublicCustomerArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
AssignDeviceToPublicCustomerArgs.builder()
        .deviceId(String)
        .build()
```

### `AssignDeviceToPublicCustomerArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `deviceId` | `String` | **yes** | A string value representing the device id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Device`


## assignDeviceToTenant

**POST** `/api/tenant/{tenantId}/device/{deviceId}`

Assign device to tenant (assignDeviceToTenant)

Creates assignment of the device to tenant. Thereafter tenant will be able to reassign the device to a customer.  Available for users with 'TENANT_ADMIN' authority.

```java
Device assignDeviceToTenant(AssignDeviceToTenantArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
AssignDeviceToTenantArgs.builder()
        .tenantId(String)
        .deviceId(String)
        .build()
```

### `AssignDeviceToTenantArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `tenantId` | `String` | **yes** | A string value representing the tenant id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `deviceId` | `String` | **yes** | A string value representing the device id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Device`


## claimDevice

**POST** `/api/customer/device/{deviceName}/claim`

Claim device (claimDevice)

Claiming makes it possible to assign a device to the specific customer using device/server side claiming data (in the form of secret key).To make this happen you have to provide unique device name and optional claiming data (it is needed only for device-side claiming).Once device is claimed, the customer becomes its owner and customer users may access device data as well as control the device.  In order to enable claiming devices feature a system parameter security.claim.allowClaimingByDefault should be set to true, otherwise a server-side claimingAllowed attribute with the value true is obligatory for provisioned devices.  See official documentation for more details regarding claiming.  Available for users with 'CUSTOMER_USER' authority.

```java
String claimDevice(ClaimDeviceArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ClaimDeviceArgs.builder()
        .deviceName(String)
        .build()
```

### `ClaimDeviceArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `deviceName` | `String` | **yes** | Unique name of the device which is going to be claimed | |
| `claimRequest` | `ClaimRequest` | no |  | |

### Return type

`String`


## countByDeviceProfileAndEmptyOtaPackage

**GET** `/api/devices/count/{otaPackageType}/{deviceProfileId}`

Count devices by device profile  (countByDeviceProfileAndEmptyOtaPackage)

The platform gives an ability to load OTA (over-the-air) packages to devices. It can be done in two different ways: device scope or device profile scope.In the response you will find the number of devices with specified device profile, but without previously defined device scope OTA package. It can be useful when you want to define number of devices that will be affected with future OTA package  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
Long countByDeviceProfileAndEmptyOtaPackage(CountByDeviceProfileAndEmptyOtaPackageArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
CountByDeviceProfileAndEmptyOtaPackageArgs.builder()
        .otaPackageType(String)
        .deviceProfileId(String)
        .build()
```

### `CountByDeviceProfileAndEmptyOtaPackageArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `otaPackageType` | `String` | **yes** | OTA package type | enum: `FIRMWARE`, `SOFTWARE` |
| `deviceProfileId` | `String` | **yes** | Device Profile Id. I.g. '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Long`


## deleteDevice

**DELETE** `/api/device/{deviceId}`

Delete device (deleteDevice)

Deletes the device, it's credentials and all the relations (from and to the device). Referencing non-existing device Id will cause an error.  Available for users with 'TENANT_ADMIN' authority.

```java
void deleteDevice(DeleteDeviceArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteDeviceArgs.builder()
        .deviceId(String)
        .build()
```

### `DeleteDeviceArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `deviceId` | `String` | **yes** | A string value representing the device id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## findDevicesByQuery

**POST** `/api/devices`

Find related devices (findDevicesByQuery)

Returns all devices that are related to the specific entity. The entity id, relation type, device types, depth of the search, and other query parameters defined using complex 'DeviceSearchQuery' object. See 'Model' tab of the Parameters for more info.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
List<Device> findDevicesByQuery(FindDevicesByQueryArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
FindDevicesByQueryArgs.builder()
        .deviceSearchQuery(DeviceSearchQuery)
        .build()
```

### `FindDevicesByQueryArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `deviceSearchQuery` | `DeviceSearchQuery` | **yes** |  | |

### Return type

`List<Device>`


## getCustomerDeviceInfos

**GET** `/api/customer/{customerId}/deviceInfos`

Get Customer Device Infos (getCustomerDeviceInfos)

Returns a page of devices info objects assigned to customer. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. Device Info is an extension of the default Device object that contains information about the assigned customer name and device profile name.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
PageDataDeviceInfo getCustomerDeviceInfos(GetCustomerDeviceInfosArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetCustomerDeviceInfosArgs.builder()
        .customerId(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetCustomerDeviceInfosArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customerId` | `String` | **yes** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `type` | `String` | no | Device type as the name of the device profile | |
| `deviceProfileId` | `String` | no | A string value representing the device profile id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `active` | `Boolean` | no | A boolean value representing the device active flag. | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the device name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `deviceProfileName`, `label`, `customerTitle` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataDeviceInfo`


## getCustomerDevices

**GET** `/api/customer/{customerId}/devices`

Get Customer Devices (getCustomerDevices)

Returns a page of devices objects assigned to customer. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
PageDataDevice getCustomerDevices(GetCustomerDevicesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetCustomerDevicesArgs.builder()
        .customerId(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetCustomerDevicesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customerId` | `String` | **yes** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `type` | `String` | no | Device type as the name of the device profile | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the device name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `deviceProfileName`, `label`, `customerTitle` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataDevice`


## getDeviceById

**GET** `/api/device/{deviceId}`

Get Device (getDeviceById)

Fetch the Device object based on the provided Device Id. If the user has the authority of 'TENANT_ADMIN', the server checks that the device is owned by the same tenant. If the user has the authority of 'CUSTOMER_USER', the server checks that the device is assigned to the same customer.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
Device getDeviceById(GetDeviceByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetDeviceByIdArgs.builder()
        .deviceId(String)
        .build()
```

### `GetDeviceByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `deviceId` | `String` | **yes** | A string value representing the device id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Device`


## getDeviceCredentialsByDeviceId

**GET** `/api/device/{deviceId}/credentials`

Get Device Credentials (getDeviceCredentialsByDeviceId)

If during device creation there wasn't specified any credentials, platform generates random 'ACCESS_TOKEN' credentials.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
DeviceCredentials getDeviceCredentialsByDeviceId(GetDeviceCredentialsByDeviceIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetDeviceCredentialsByDeviceIdArgs.builder()
        .deviceId(String)
        .build()
```

### `GetDeviceCredentialsByDeviceIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `deviceId` | `String` | **yes** | A string value representing the device id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`DeviceCredentials`


## getDeviceInfoById

**GET** `/api/device/info/{deviceId}`

Get Device Info (getDeviceInfoById)

Fetch the Device Info object based on the provided Device Id. If the user has the authority of 'Tenant Administrator', the server checks that the device is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the device is assigned to the same customer. Device Info is an extension of the default Device object that contains information about the assigned customer name and device profile name.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
DeviceInfo getDeviceInfoById(GetDeviceInfoByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetDeviceInfoByIdArgs.builder()
        .deviceId(String)
        .build()
```

### `GetDeviceInfoByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `deviceId` | `String` | **yes** | A string value representing the device id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`DeviceInfo`


## getDeviceTypes

**GET** `/api/device/types`

Get Device Types (getDeviceTypes)

Deprecated. See 'getDeviceProfileNames' API from Device Profile Controller instead.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
List<EntitySubtype> getDeviceTypes()
```

### Return type

`List<EntitySubtype>`


## getDevicesByIds

**GET** `/api/devices`

Get Devices By Ids (getDevicesByIds)

Requested devices must be owned by tenant or assigned to customer which user is performing the request.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
List<Device> getDevicesByIds(GetDevicesByIdsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetDevicesByIdsArgs.builder()
        .deviceIds(List<String>)
        .build()
```

### `GetDevicesByIdsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `deviceIds` | `List<String>` | **yes** | A list of devices ids, separated by comma ',' | |

### Return type

`List<Device>`


## getEdgeDevices

**GET** `/api/edge/{edgeId}/devices`

Get devices assigned to edge (getEdgeDevices)

Returns a page of devices assigned to edge. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
PageDataDeviceInfo getEdgeDevices(GetEdgeDevicesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetEdgeDevicesArgs.builder()
        .edgeId(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetEdgeDevicesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `type` | `String` | no | Device type as the name of the device profile | |
| `deviceProfileId` | `String` | no | A string value representing the device profile id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `active` | `Boolean` | no | A boolean value representing the device active flag. | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the device name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `deviceProfileName`, `label`, `customerTitle` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |
| `startTime` | `Long` | no | Timestamp. Devices with creation time before it won't be queried | |
| `endTime` | `Long` | no | Timestamp. Devices with creation time after it won't be queried | |

### Return type

`PageDataDeviceInfo`


## getTenantDeviceByName

**GET** `/api/tenant/device`

Get Tenant Device (getTenantDeviceByName)

Requested device must be owned by tenant that the user belongs to. Device name is an unique property of device. So it can be used to identify the device.  Available for users with 'TENANT_ADMIN' authority.

```java
Device getTenantDeviceByName(GetTenantDeviceByNameArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetTenantDeviceByNameArgs.builder()
        .deviceName(String)
        .build()
```

### `GetTenantDeviceByNameArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `deviceName` | `String` | **yes** | A string value representing the Device name. | |

### Return type

`Device`


## getTenantDeviceInfos

**GET** `/api/tenant/deviceInfos`

Get Tenant Device Infos (getTenantDeviceInfos)

Returns a page of devices info objects owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. Device Info is an extension of the default Device object that contains information about the assigned customer name and device profile name.   Available for users with 'TENANT_ADMIN' authority.

```java
PageDataDeviceInfo getTenantDeviceInfos(GetTenantDeviceInfosArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetTenantDeviceInfosArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetTenantDeviceInfosArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `type` | `String` | no | Device type as the name of the device profile | |
| `deviceProfileId` | `String` | no | A string value representing the device profile id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `active` | `Boolean` | no | A boolean value representing the device active flag. | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the device name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `deviceProfileName`, `label`, `customerTitle` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataDeviceInfo`


## getTenantDevices

**GET** `/api/tenant/devices`

Get Tenant Devices (getTenantDevices)

Returns a page of devices owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.

```java
PageDataDevice getTenantDevices(GetTenantDevicesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetTenantDevicesArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetTenantDevicesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `type` | `String` | no | Device type as the name of the device profile | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the device name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `deviceProfileName`, `label`, `customerTitle` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataDevice`


## processDevicesBulkImport

**POST** `/api/device/bulk_import`

Import the bulk of devices (processDevicesBulkImport)

There's an ability to import the bulk of devices using the only .csv file.  Available for users with 'TENANT_ADMIN' authority.

```java
BulkImportResultDevice processDevicesBulkImport(ProcessDevicesBulkImportArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ProcessDevicesBulkImportArgs.builder()
        .bulkImportRequest(BulkImportRequest)
        .build()
```

### `ProcessDevicesBulkImportArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `bulkImportRequest` | `BulkImportRequest` | **yes** |  | |

### Return type

`BulkImportResultDevice`


## reClaimDevice

**DELETE** `/api/customer/device/{deviceName}/claim`

Reclaim device (reClaimDevice)

Reclaiming means the device will be unassigned from the customer and the device will be available for claiming again.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
String reClaimDevice(ReClaimDeviceArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ReClaimDeviceArgs.builder()
        .deviceName(String)
        .build()
```

### `ReClaimDeviceArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `deviceName` | `String` | **yes** | Unique name of the device which is going to be reclaimed | |

### Return type

`String`


## saveDevice

**POST** `/api/device`

Create Or Update Device (saveDevice)

Create or update the Device. When creating device, platform generates Device Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). Device credentials are also generated if not provided in the 'accessToken' request parameter. The newly created device id will be present in the response. Specify existing Device id to update the device. Referencing non-existing device Id will cause 'Not Found' error.  Device name is unique in the scope of tenant. Use unique identifiers like MAC or IMEI for the device names and non-unique 'label' field for user-friendly visualization purposes.Remove 'id', 'tenantId' and optionally 'customerId' from the request body example (below) to create new Device entity.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
Device saveDevice(SaveDeviceArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveDeviceArgs.builder()
        .device(Device)
        .build()
```

### `SaveDeviceArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `device` | `Device` | **yes** | A JSON value representing the device. | |
| `accessToken` | `String` | no | Optional value of the device credentials to be used during device creation. If omitted, access token will be auto-generated. | |
| `nameConflictPolicy` | `NameConflictPolicy` | no | Optional value of name conflict policy. Possible values: FAIL or UNIQUIFY.  If omitted, FAIL policy is applied. FAIL policy implies exception will be thrown if an entity with the same name already exists.  UNIQUIFY policy appends a suffix to the entity name, if a name conflict occurs. | default: `FAIL` enum: `FAIL`, `UNIQUIFY` |
| `uniquifySeparator` | `String` | no | Optional value of name suffix separator used by UNIQUIFY policy. By default, underscore separator is used. For example, strategy is UNIQUIFY, separator is '-'; if a name conflict occurs for entity name 'test-name', created entity will have name like 'test-name-7fsh4f'. | default: `_` |
| `uniquifyStrategy` | `UniquifyStrategy` | no | Optional value of uniquify strategy used by UNIQUIFY policy. Possible values: RANDOM or INCREMENTAL. By default, RANDOM strategy is used, which means random alphanumeric string will be added as a suffix to entity name. INCREMENTAL implies the first possible number starting from 1 will be added as a name suffix. For example, strategy is UNIQUIFY, uniquify strategy is INCREMENTAL; if a name conflict occurs for entity name 'test-name', created entity will have name like 'test-name-1. | default: `RANDOM` enum: `RANDOM`, `INCREMENTAL` |

### Return type

`Device`


## saveDeviceWithCredentials

**POST** `/api/device-with-credentials`

Create Device (saveDevice) with credentials 

Create or update the Device. When creating device, platform generates Device Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). Requires to provide the Device Credentials object as well as an existing device profile ID or use \"default\". You may find the example of device with different type of credentials below:   - Credentials type: **\"Access token\"** with **device profile ID** below:   ```json {   \"device\": {     \"name\":\"Name_DeviceWithCredantial_AccessToken\",     \"label\":\"Label_DeviceWithCredantial_AccessToken\",     \"deviceProfileId\":{       \"id\":\"9d9588c0-06c9-11ee-b618-19be30fdeb60\",       \"entityType\":\"DEVICE_PROFILE\"      }    },   \"credentials\": {     \"credentialsType\": \"ACCESS_TOKEN\",     \"credentialsId\": \"6hmxew8pmmzng4e3une2\"    } } ```  - Credentials type: **\"Access token\"** with  **device profile default** below:   ```json {   \"device\": {     \"name\":\"Name_DeviceWithCredantial_AccessToken_Default\",     \"label\":\"Label_DeviceWithCredantial_AccessToken_Default\",     \"type\": \"default\"    },   \"credentials\": {     \"credentialsType\": \"ACCESS_TOKEN\",     \"credentialsId\": \"6hmxew8pmmzng4e3une3\"    } } ```  - Credentials type: **\"X509\"** with **device profile ID** below:   Note: **credentialsId** -  format **Sha3Hash**, **certificateValue** - format **PEM** (with \"--BEGIN CERTIFICATE----\" and  -\"----END CERTIFICATE-\").  ```json {   \"device\": {     \"name\":\"Name_DeviceWithCredantial_X509_Certificate\",     \"label\":\"Label_DeviceWithCredantial_X509_Certificate\",     \"deviceProfileId\":{       \"id\":\"9d9588c0-06c9-11ee-b618-19be30fdeb60\",       \"entityType\":\"DEVICE_PROFILE\"      }    },   \"credentials\": {     \"credentialsType\": \"X509_CERTIFICATE\",     \"credentialsId\": \"84f5911765abba1f96bf4165604e9e90338fc6214081a8e623b6ff9669aedb27\",     \"credentialsValue\": \"-----BEGIN CERTIFICATE----- MIICMTCCAdegAwIBAgIUI9dBuwN6pTtK6uZ03rkiCwV4wEYwCgYIKoZIzj0EAwIwbjELMAkGA1UEBhMCVVMxETAPBgNVBAgMCE5ldyBZb3JrMRowGAYDVQQKDBFUaGluZ3NCb2FyZCwgSW5jLjEwMC4GA1UEAwwnZGV2aWNlQ2VydGlmaWNhdGVAWDUwOVByb3Zpc2lvblN0cmF0ZWd5MB4XDTIzMDMyOTE0NTYxN1oXDTI0MDMyODE0NTYxN1owbjELMAkGA1UEBhMCVVMxETAPBgNVBAgMCE5ldyBZb3JrMRowGAYDVQQKDBFUaGluZ3NCb2FyZCwgSW5jLjEwMC4GA1UEAwwnZGV2aWNlQ2VydGlmaWNhdGVAWDUwOVByb3Zpc2lvblN0cmF0ZWd5MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE9Zo791qKQiGNBm11r4ZGxh+w+ossZL3xc46ufq5QckQHP7zkD2XDAcmP5GvdkM1sBFN9AWaCkQfNnWmfERsOOKNTMFEwHQYDVR0OBBYEFFFc5uyCyglQoZiKhzXzMcQ3BKORMB8GA1UdIwQYMBaAFFFc5uyCyglQoZiKhzXzMcQ3BKORMA8GA1UdEwEB/wQFMAMBAf8wCgYIKoZIzj0EAwIDSAAwRQIhANbA9CuhoOifZMMmqkpuld+65CR+ItKdXeRAhLMZuccuAiB0FSQB34zMutXrZj1g8Gl5OkE7YryFHbei1z0SveHR8g== -----END CERTIFICATE-----\"    } } ```  - Credentials type: **\"MQTT_BASIC\"** with **device profile ID** below:   ```json {   \"device\": {     \"name\":\"Name_DeviceWithCredantial_MQTT_Basic\",     \"label\":\"Label_DeviceWithCredantial_MQTT_Basic\",     \"deviceProfileId\":{       \"id\":\"9d9588c0-06c9-11ee-b618-19be30fdeb60\",       \"entityType\":\"DEVICE_PROFILE\"      }    },   \"credentials\": {     \"credentialsType\": \"MQTT_BASIC\",     \"credentialsValue\": \"{\\\"clientId\\\":\\\"5euh5nzm34bjjh1efmlt\\\",\\\"userName\\\":\\\"onasd1lgwasmjl7v2v7h\\\",\\\"password\\\":\\\"b9xtm4ny8kt9zewaga5o\\\"}\"    } } ```  - You may find the example of **LwM2M** device and **RPK** credentials below:   Note: LwM2M device - only existing device profile ID (Transport configuration -> Transport type: \"LWM2M\".  ```json {   \"device\": {     \"name\":\"Name_LwRpk00000000\",     \"label\":\"Label_LwRpk00000000\",     \"deviceProfileId\":{       \"id\":\"a660bd50-10ef-11ee-8737-b5634e73c779\",       \"entityType\":\"DEVICE_PROFILE\"      }    },   \"credentials\": {     \"credentialsType\": \"LWM2M_CREDENTIALS\",     \"credentialsId\": \"LwRpk00000000\",     \"credentialsValue\":        \"{\\\"client\\\":{ \\\"endpoint\\\":\\\"LwRpk00000000\\\", \\\"securityConfigClientMode\\\":\\\"RPK\\\", \\\"key\\\":\\\"MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEUEBxNl/RcYJNm8mk91CyVXoIJiROYDlXcSSqK6e5bDHwOW4ZiN2lNnXalyF0Jxw8MbAytnDMERXyAja5VEMeVQ==\\\"   }, \\\"bootstrap\\\":{ \\\"bootstrapServer\\\":{ \\\"securityMode\\\":\\\"RPK\\\", \\\"clientPublicKeyOrId\\\":\\\"MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEUEBxNl/RcYJNm8mk91CyVXoIJiROYDlXcSSqK6e5bDHwOW4ZiN2lNnXalyF0Jxw8MbAytnDMERXyAja5VEMeVQ==\\\", \\\"clientSecretKey\\\":\\\"MIGHAgEAMBMGByqGSM49AgEGCCqGSM49AwEHBG0wawIBAQQgd9GAx7yZW37autew5KZykn4IgRpge/tZSjnudnZJnMahRANCAARQQHE2X9Fxgk2byaT3ULJVeggmJE5gOVdxJKorp7lsMfA5bhmI3aU2ddqXIXQnHDwxsDK2cMwRFfICNrlUQx5V\\\"}, \\\"lwm2mServer\\\":{ \\\"securityMode\\\":\\\"RPK\\\", \\\"clientPublicKeyOrId\\\":\\\"MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEUEBxNl/RcYJNm8mk91CyVXoIJiROYDlXcSSqK6e5bDHwOW4ZiN2lNnXalyF0Jxw8MbAytnDMERXyAja5VEMeVQ==\\\", \\\"clientSecretKey\\\":\\\"MIGHAgEAMBMGByqGSM49AgEGCCqGSM49AwEHBG0wawIBAQQgd9GAx7yZW37autew5KZykn4IgRpge/tZSjnudnZJnMahRANCAARQQHE2X9Fxgk2byaT3ULJVeggmJE5gOVdxJKorp7lsMfA5bhmI3aU2ddqXIXQnHDwxsDK2cMwRFfICNrlUQx5V\\\"}} }\"    } } ```  Remove 'id', 'tenantId' and optionally 'customerId' from the request body example (below) to create new Device entity.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
Device saveDeviceWithCredentials(SaveDeviceWithCredentialsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveDeviceWithCredentialsArgs.builder()
        .saveDeviceWithCredentialsRequest(SaveDeviceWithCredentialsRequest)
        .build()
```

### `SaveDeviceWithCredentialsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `saveDeviceWithCredentialsRequest` | `SaveDeviceWithCredentialsRequest` | **yes** |  | |
| `nameConflictPolicy` | `NameConflictPolicy` | no | Optional value of name conflict policy. Possible values: FAIL or UNIQUIFY.  If omitted, FAIL policy is applied. FAIL policy implies exception will be thrown if an entity with the same name already exists.  UNIQUIFY policy appends a suffix to the entity name, if a name conflict occurs. | default: `FAIL` enum: `FAIL`, `UNIQUIFY` |
| `uniquifySeparator` | `String` | no | Optional value of name suffix separator used by UNIQUIFY policy. By default, underscore separator is used. For example, strategy is UNIQUIFY, separator is '-'; if a name conflict occurs for entity name 'test-name', created entity will have name like 'test-name-7fsh4f'. | default: `_` |
| `uniquifyStrategy` | `UniquifyStrategy` | no | Optional value of uniquify strategy used by UNIQUIFY policy. Possible values: RANDOM or INCREMENTAL. By default, RANDOM strategy is used, which means random alphanumeric string will be added as a suffix to entity name. INCREMENTAL implies the first possible number starting from 1 will be added as a name suffix. For example, strategy is UNIQUIFY, uniquify strategy is INCREMENTAL; if a name conflict occurs for entity name 'test-name', created entity will have name like 'test-name-1. | default: `RANDOM` enum: `RANDOM`, `INCREMENTAL` |

### Return type

`Device`


## unassignDeviceFromCustomer

**DELETE** `/api/customer/device/{deviceId}`

Unassign device from customer (unassignDeviceFromCustomer)

Clears assignment of the device to customer. Customer will not be able to query device afterwards.  Available for users with 'TENANT_ADMIN' authority.

```java
Device unassignDeviceFromCustomer(UnassignDeviceFromCustomerArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UnassignDeviceFromCustomerArgs.builder()
        .deviceId(String)
        .build()
```

### `UnassignDeviceFromCustomerArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `deviceId` | `String` | **yes** | A string value representing the device id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Device`


## unassignDeviceFromEdge

**DELETE** `/api/edge/{edgeId}/device/{deviceId}`

Unassign device from edge (unassignDeviceFromEdge)

Clears assignment of the device to the edge. Unassignment works in async way - first, 'unassign' notification event pushed to edge queue on platform. Second, remote edge service will receive an 'unassign' command to remove device (Edge will receive this instantly, if it's currently connected, or once it's going to be connected to platform). Third, once 'unassign' command will be delivered to edge service, it's going to remove device locally.  Available for users with 'TENANT_ADMIN' authority.

```java
Device unassignDeviceFromEdge(UnassignDeviceFromEdgeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UnassignDeviceFromEdgeArgs.builder()
        .edgeId(String)
        .deviceId(String)
        .build()
```

### `UnassignDeviceFromEdgeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `deviceId` | `String` | **yes** | A string value representing the device id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Device`


## updateDeviceCredentials

**POST** `/api/device/credentials`

Update device credentials (updateDeviceCredentials)

During device creation, platform generates random 'ACCESS_TOKEN' credentials. \" + Use this method to update the device credentials. First use 'getDeviceCredentialsByDeviceId' to get the credentials id and value. Then use current method to update the credentials type and value. It is not possible to create multiple device credentials for the same device. The structure of device credentials id and value is simple for the 'ACCESS_TOKEN' but is much more complex for the 'MQTT_BASIC' or 'LWM2M_CREDENTIALS'. You may find the example of device with different type of credentials below:   - Credentials type: **\"Access token\"** with **device ID** and with **device ID** below:   ```json {   \"id\": {     \"id\":\"c886a090-168d-11ee-87c9-6f157dbc816a\"    },   \"deviceId\": {     \"id\":\"c5fb3ac0-168d-11ee-87c9-6f157dbc816a\",     \"entityType\":\"DEVICE\"    },   \"credentialsType\": \"ACCESS_TOKEN\",   \"credentialsId\": \"6hmxew8pmmzng4e3une4\" } ```  - Credentials type: **\"X509\"** with **device profile ID** below:   Note: **credentialsId** -  format **Sha3Hash**, **certificateValue** - format **PEM** (with \"--BEGIN CERTIFICATE----\" and  -\"----END CERTIFICATE-\").  ```json {   \"id\": {     \"id\":\"309bd9c0-14f4-11ee-9fc9-d9b7463abb63\"    },   \"deviceId\": {     \"id\":\"3092b200-14f4-11ee-9fc9-d9b7463abb63\",     \"entityType\":\"DEVICE\"    },   \"credentialsType\": \"X509_CERTIFICATE\",   \"credentialsId\": \"6b8adb49015500e51a527acd332b51684ab9b49b4ade03a9582a44c455e2e9b6\",   \"credentialsValue\": \"-----BEGIN CERTIFICATE----- MIICMTCCAdegAwIBAgIUUEKxS9hTz4l+oLUMF0LV6TC/gCIwCgYIKoZIzj0EAwIwbjELMAkGA1UEBhMCVVMxETAPBgNVBAgMCE5ldyBZb3JrMRowGAYDVQQKDBFUaGluZ3NCb2FyZCwgSW5jLjEwMC4GA1UEAwwnZGV2aWNlUHJvZmlsZUNlcnRAWDUwOVByb3Zpc2lvblN0cmF0ZWd5MB4XDTIzMDMyOTE0NTczNloXDTI0MDMyODE0NTczNlowbjELMAkGA1UEBhMCVVMxETAPBgNVBAgMCE5ldyBZb3JrMRowGAYDVQQKDBFUaGluZ3NCb2FyZCwgSW5jLjEwMC4GA1UEAwwnZGV2aWNlUHJvZmlsZUNlcnRAWDUwOVByb3Zpc2lvblN0cmF0ZWd5MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAECMlWO72krDoUL9FQjUmSCetkhaEGJUfQkdSfkLSNa0GyAEIMbfmzI4zITeapunu4rGet3EMyLydQzuQanBicp6NTMFEwHQYDVR0OBBYEFHpZ78tPnztNii4Da/yCw6mhEIL3MB8GA1UdIwQYMBaAFHpZ78tPnztNii4Da/yCw6mhEIL3MA8GA1UdEwEB/wQFMAMBAf8wCgYIKoZIzj0EAwIDSAAwRQIgJ7qyMFqNcwSYkH6o+UlQXzLWfwZbNjVk+aR7foAZNGsCIQDsd7v3WQIGHiArfZeDs1DLEDuV/2h6L+ZNoGNhEKL+1A== -----END CERTIFICATE-----\" } ```  - Credentials type: **\"MQTT_BASIC\"** with **device profile ID** below:   ```json {   \"id\": {     \"id\":\"d877ffb0-14f5-11ee-9fc9-d9b7463abb63\"    },   \"deviceId\": {     \"id\":\"d875dcd0-14f5-11ee-9fc9-d9b7463abb63\",     \"entityType\":\"DEVICE\"    },   \"credentialsType\": \"MQTT_BASIC\",   \"credentialsValue\": \"{\\\"clientId\\\":\\\"juy03yv4owqxcmqhqtvk\\\",\\\"userName\\\":\\\"ov19fxca0cyjn7lm7w7u\\\",\\\"password\\\":\\\"twy94he114dfi9usyk1o\\\"}\" } ```  - You may find the example of **LwM2M** device and **RPK** credentials below:   Note: LwM2M device - only existing device profile ID (Transport configuration -> Transport type: \"LWM2M\".  ```json {   \"id\": {     \"id\":\"e238d4d0-1689-11ee-98c6-1713c1be5a8e\"    },   \"deviceId\": {     \"id\":\"e232e160-1689-11ee-98c6-1713c1be5a8e\",     \"entityType\":\"DEVICE\"    },   \"credentialsType\": \"LWM2M_CREDENTIALS\",   \"credentialsId\": \"LwRpk00000000\",   \"credentialsValue\":        \"{\\\"client\\\":{ \\\"endpoint\\\":\\\"LwRpk00000000\\\", \\\"securityConfigClientMode\\\":\\\"RPK\\\", \\\"key\\\":\\\"MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEdvBZZ2vQRK9wgDhctj6B1c7bxR3Z0wYg1+YdoYFnVUKWb+rIfTTyYK9tmQJx5Vlb5fxdLnVv1RJOPiwsLIQbAA==\\\"   }, \\\"bootstrap\\\":{ \\\"bootstrapServer\\\":{ \\\"securityMode\\\":\\\"RPK\\\", \\\"clientPublicKeyOrId\\\":\\\"MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEUEBxNl/RcYJNm8mk91CyVXoIJiROYDlXcSSqK6e5bDHwOW4ZiN2lNnXalyF0Jxw8MbAytnDMERXyAja5VEMeVQ==\\\", \\\"clientSecretKey\\\":\\\"MIGHAgEAMBMGByqGSM49AgEGCCqGSM49AwEHBG0wawIBAQQgd9GAx7yZW37autew5KZykn4IgRpge/tZSjnudnZJnMahRANCAARQQHE2X9Fxgk2byaT3ULJVeggmJE5gOVdxJKorp7lsMfA5bhmI3aU2ddqXIXQnHDwxsDK2cMwRFfICNrlUQx5V\\\"}, \\\"lwm2mServer\\\":{ \\\"securityMode\\\":\\\"RPK\\\", \\\"clientPublicKeyOrId\\\":\\\"MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEUEBxNl/RcYJNm8mk91CyVXoIJiROYDlXcSSqK6e5bDHwOW4ZiN2lNnXalyF0Jxw8MbAytnDMERXyAja5VEMeVQ==\\\", \\\"clientSecretKey\\\":\\\"MIGHAgEAMBMGByqGSM49AgEGCCqGSM49AwEHBG0wawIBAQQgd9GAx7yZW37autew5KZykn4IgRpge/tZSjnudnZJnMahRANCAARQQHE2X9Fxgk2byaT3ULJVeggmJE5gOVdxJKorp7lsMfA5bhmI3aU2ddqXIXQnHDwxsDK2cMwRFfICNrlUQx5V\\\"}} }\" } ```  Update to real value:  - 'id' (this is id of Device Credentials ->  \"Get Device Credentials (getDeviceCredentialsByDeviceId)\",  - 'deviceId.id' (this is id of Device). Remove 'tenantId' and optionally 'customerId' from the request body example (below) to create new Device entity.  Available for users with 'TENANT_ADMIN' authority.

```java
DeviceCredentials updateDeviceCredentials(UpdateDeviceCredentialsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UpdateDeviceCredentialsArgs.builder()
        .deviceCredentials(DeviceCredentials)
        .build()
```

### `UpdateDeviceCredentialsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `deviceCredentials` | `DeviceCredentials` | **yes** |  | |

### Return type

`DeviceCredentials`


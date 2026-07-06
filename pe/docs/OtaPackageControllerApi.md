# OtaPackageControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void deleteOtaPackage(DeleteOtaPackageArgs args) // Delete OTA Package (deleteOtaPackage)
File downloadOtaPackage(DownloadOtaPackageArgs args) // Download OTA Package (downloadOtaPackage)
PageDataOtaPackageInfo getGroupOtaPackages(GetGroupOtaPackagesArgs args) // Get group OTA Package Infos (getGroupOtaPackages)
OtaPackage getOtaPackageById(GetOtaPackageByIdArgs args) // Get OTA Package (getOtaPackageById)
OtaPackageInfo getOtaPackageInfoById(GetOtaPackageInfoByIdArgs args) // Get OTA Package Info (getOtaPackageInfoById)
PageDataOtaPackageInfo getOtaPackages(GetOtaPackagesArgs args) // Get OTA Package Infos (getOtaPackages)
PageDataOtaPackageInfo getOtaPackagesByDeviceProfileAndType(GetOtaPackagesByDeviceProfileAndTypeArgs args) // Get OTA Package Infos by Device Profile and Type (getOtaPackagesByDeviceProfileAndType)
OtaPackageInfo saveOtaPackageData(SaveOtaPackageDataArgs args) // Save OTA Package data (saveOtaPackageData)
OtaPackageInfo saveOtaPackageInfo(SaveOtaPackageInfoArgs args) // Create Or Update OTA Package Info (saveOtaPackageInfo)
```


## deleteOtaPackage

**DELETE** `/api/otaPackage/{otaPackageId}`

Delete OTA Package (deleteOtaPackage)

Deletes the OTA Package. Referencing non-existing OTA Package Id will cause an error. Can't delete the OTA Package if it is referenced by existing devices or device profile.  Available for users with 'TENANT_ADMIN' authority.

```java
void deleteOtaPackage(DeleteOtaPackageArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteOtaPackageArgs.builder()
        .otaPackageId(String)
        .build()
```

### `DeleteOtaPackageArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `otaPackageId` | `String` | **yes** | A string value representing the ota package id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## downloadOtaPackage

**GET** `/api/otaPackage/{otaPackageId}/download`

Download OTA Package (downloadOtaPackage)

Download OTA Package based on the provided OTA Package Id.  Available for users with 'TENANT_ADMIN' authority.

```java
File downloadOtaPackage(DownloadOtaPackageArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DownloadOtaPackageArgs.builder()
        .otaPackageId(String)
        .build()
```

### `DownloadOtaPackageArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `otaPackageId` | `String` | **yes** | A string value representing the ota package id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`File`


## getGroupOtaPackages

**GET** `/api/otaPackages/group/{groupId}/{type}`

Get group OTA Package Infos (getGroupOtaPackages)

Returns a page of OTA Package Info objects owned by tenant, and by entity group. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. OTA Package Info is a lightweight object that includes main information about the OTA Package excluding the heavyweight data.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
PageDataOtaPackageInfo getGroupOtaPackages(GetGroupOtaPackagesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetGroupOtaPackagesArgs.builder()
        .groupId(String)
        .type(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetGroupOtaPackagesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `groupId` | `String` | **yes** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `type` | `String` | **yes** | OTA Package type. | enum: `FIRMWARE`, `SOFTWARE` |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the ota package title. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `type`, `title`, `version`, `tag`, `url`, `fileName`, `dataSize`, `checksum` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataOtaPackageInfo`


## getOtaPackageById

**GET** `/api/otaPackage/{otaPackageId}`

Get OTA Package (getOtaPackageById)

Fetch the OTA Package object based on the provided OTA Package Id. The server checks that the OTA Package is owned by the same tenant. OTA Package is a heavyweight object that includes main information about the OTA Package and also data.   Available for users with 'TENANT_ADMIN' authority.

```java
OtaPackage getOtaPackageById(GetOtaPackageByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetOtaPackageByIdArgs.builder()
        .otaPackageId(String)
        .build()
```

### `GetOtaPackageByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `otaPackageId` | `String` | **yes** | A string value representing the ota package id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`OtaPackage`


## getOtaPackageInfoById

**GET** `/api/otaPackage/info/{otaPackageId}`

Get OTA Package Info (getOtaPackageInfoById)

Fetch the OTA Package Info object based on the provided OTA Package Id. OTA Package Info is a lightweight object that includes main information about the OTA Package excluding the heavyweight data.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
OtaPackageInfo getOtaPackageInfoById(GetOtaPackageInfoByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetOtaPackageInfoByIdArgs.builder()
        .otaPackageId(String)
        .build()
```

### `GetOtaPackageInfoByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `otaPackageId` | `String` | **yes** | A string value representing the ota package id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`OtaPackageInfo`


## getOtaPackages

**GET** `/api/otaPackages`

Get OTA Package Infos (getOtaPackages)

Returns a page of OTA Package Info objects owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. OTA Package Info is a lightweight object that includes main information about the OTA Package excluding the heavyweight data.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
PageDataOtaPackageInfo getOtaPackages(GetOtaPackagesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetOtaPackagesArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetOtaPackagesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the ota package title. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `type`, `title`, `version`, `tag`, `url`, `fileName`, `dataSize`, `checksum` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataOtaPackageInfo`


## getOtaPackagesByDeviceProfileAndType

**GET** `/api/otaPackages/{deviceProfileId}/{type}`

Get OTA Package Infos by Device Profile and Type (getOtaPackagesByDeviceProfileAndType)

Returns a page of OTA Package Info objects owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. OTA Package Info is a lightweight object that includes main information about the OTA Package excluding the heavyweight data.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
PageDataOtaPackageInfo getOtaPackagesByDeviceProfileAndType(GetOtaPackagesByDeviceProfileAndTypeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetOtaPackagesByDeviceProfileAndTypeArgs.builder()
        .deviceProfileId(String)
        .type(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetOtaPackagesByDeviceProfileAndTypeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `deviceProfileId` | `String` | **yes** | A string value representing the device profile id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `type` | `String` | **yes** | OTA Package type. | enum: `FIRMWARE`, `SOFTWARE` |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the ota package title. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `type`, `title`, `version`, `tag`, `url`, `fileName`, `dataSize`, `checksum` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataOtaPackageInfo`


## saveOtaPackageData

**POST** `/api/otaPackage/{otaPackageId}`

Save OTA Package data (saveOtaPackageData)

Update the OTA Package. Adds the date to the existing OTA Package Info  Available for users with 'TENANT_ADMIN' authority.

```java
OtaPackageInfo saveOtaPackageData(SaveOtaPackageDataArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveOtaPackageDataArgs.builder()
        .otaPackageId(String)
        .checksumAlgorithm(String)
        ._file(File)
        .build()
```

### `SaveOtaPackageDataArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `otaPackageId` | `String` | **yes** | A string value representing the ota package id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `checksumAlgorithm` | `String` | **yes** | OTA Package checksum algorithm. | enum: `MD5`, `SHA256`, `SHA384`, `SHA512`, `CRC32`, `MURMUR3_32`, `MURMUR3_128` |
| `_file` | `File` | **yes** | OTA Package data. | |
| `checksum` | `String` | no | OTA Package checksum. For example, '0xd87f7e0c' | |

### Return type

`OtaPackageInfo`


## saveOtaPackageInfo

**POST** `/api/otaPackage`

Create Or Update OTA Package Info (saveOtaPackageInfo)

Create or update the OTA Package Info. When creating OTA Package Info, platform generates OTA Package id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created OTA Package id will be present in the response. Specify existing OTA Package id to update the OTA Package Info. Referencing non-existing OTA Package Id will cause 'Not Found' error.   OTA Package combination of the title with the version is unique in the scope of tenant.   Available for users with 'TENANT_ADMIN' authority.

```java
OtaPackageInfo saveOtaPackageInfo(SaveOtaPackageInfoArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveOtaPackageInfoArgs.builder()
        .saveOtaPackageInfoRequest(SaveOtaPackageInfoRequest)
        .build()
```

### `SaveOtaPackageInfoArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `saveOtaPackageInfoRequest` | `SaveOtaPackageInfoRequest` | **yes** |  | |

### Return type

`OtaPackageInfo`


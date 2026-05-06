# OtaPackageControllerApi

`ThingsboardClient` methods:

```
void deleteOtaPackage(@Nonnull String otaPackageId) // Delete OTA Package (deleteOtaPackage)
File downloadOtaPackage(@Nonnull String otaPackageId) // Download OTA Package (downloadOtaPackage)
PageDataOtaPackageInfo getGroupOtaPackages(@Nonnull String groupId, @Nonnull String type, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get group OTA Package Infos (getGroupOtaPackages)
OtaPackage getOtaPackageById(@Nonnull String otaPackageId) // Get OTA Package (getOtaPackageById)
OtaPackageInfo getOtaPackageInfoById(@Nonnull String otaPackageId) // Get OTA Package Info (getOtaPackageInfoById)
PageDataOtaPackageInfo getOtaPackages(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get OTA Package Infos (getOtaPackages)
PageDataOtaPackageInfo getOtaPackagesByDeviceProfileAndType(@Nonnull String deviceProfileId, @Nonnull String type, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get OTA Package Infos by Device Profile and Type (getOtaPackagesByDeviceProfileAndType)
OtaPackageInfo saveOtaPackageData(@Nonnull String otaPackageId, @Nonnull String checksumAlgorithm, @Nonnull File _file, @Nullable String checksum) // Save OTA Package data (saveOtaPackageData)
OtaPackageInfo saveOtaPackageInfo(@Nonnull SaveOtaPackageInfoRequest saveOtaPackageInfoRequest) // Create Or Update OTA Package Info (saveOtaPackageInfo)
```


## deleteOtaPackage

```
void deleteOtaPackage(@Nonnull String otaPackageId)
```

**DELETE** `/api/otaPackage/{otaPackageId}`

Delete OTA Package (deleteOtaPackage)

Deletes the OTA Package. Referencing non-existing OTA Package Id will cause an error. Can't delete the OTA Package if it is referenced by existing devices or device profile.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **otaPackageId** | **String** | A string value representing the ota package id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## downloadOtaPackage

```
File downloadOtaPackage(@Nonnull String otaPackageId)
```

**GET** `/api/otaPackage/{otaPackageId}/download`

Download OTA Package (downloadOtaPackage)

Download OTA Package based on the provided OTA Package Id.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **otaPackageId** | **String** | A string value representing the ota package id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**File**


## getGroupOtaPackages

```
PageDataOtaPackageInfo getGroupOtaPackages(@Nonnull String groupId, @Nonnull String type, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/otaPackages/group/{groupId}/{type}`

Get group OTA Package Infos (getGroupOtaPackages)

Returns a page of OTA Package Info objects owned by tenant, and by entity group. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. OTA Package Info is a lightweight object that includes main information about the OTA Package excluding the heavyweight data.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **type** | **String** | OTA Package type. | [enum: FIRMWARE, SOFTWARE] |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the ota package title. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, type, title, version, tag, url, fileName, dataSize, checksum] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataOtaPackageInfo**


## getOtaPackageById

```
OtaPackage getOtaPackageById(@Nonnull String otaPackageId)
```

**GET** `/api/otaPackage/{otaPackageId}`

Get OTA Package (getOtaPackageById)

Fetch the OTA Package object based on the provided OTA Package Id. The server checks that the OTA Package is owned by the same tenant. OTA Package is a heavyweight object that includes main information about the OTA Package and also data.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **otaPackageId** | **String** | A string value representing the ota package id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**OtaPackage**


## getOtaPackageInfoById

```
OtaPackageInfo getOtaPackageInfoById(@Nonnull String otaPackageId)
```

**GET** `/api/otaPackage/info/{otaPackageId}`

Get OTA Package Info (getOtaPackageInfoById)

Fetch the OTA Package Info object based on the provided OTA Package Id. OTA Package Info is a lightweight object that includes main information about the OTA Package excluding the heavyweight data.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **otaPackageId** | **String** | A string value representing the ota package id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**OtaPackageInfo**


## getOtaPackages

```
PageDataOtaPackageInfo getOtaPackages(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/otaPackages`

Get OTA Package Infos (getOtaPackages)

Returns a page of OTA Package Info objects owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. OTA Package Info is a lightweight object that includes main information about the OTA Package excluding the heavyweight data.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the ota package title. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, type, title, version, tag, url, fileName, dataSize, checksum] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataOtaPackageInfo**


## getOtaPackagesByDeviceProfileAndType

```
PageDataOtaPackageInfo getOtaPackagesByDeviceProfileAndType(@Nonnull String deviceProfileId, @Nonnull String type, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/otaPackages/{deviceProfileId}/{type}`

Get OTA Package Infos by Device Profile and Type (getOtaPackagesByDeviceProfileAndType)

Returns a page of OTA Package Info objects owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. OTA Package Info is a lightweight object that includes main information about the OTA Package excluding the heavyweight data.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceProfileId** | **String** | A string value representing the device profile id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **type** | **String** | OTA Package type. | [enum: FIRMWARE, SOFTWARE] |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the ota package title. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, type, title, version, tag, url, fileName, dataSize, checksum] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataOtaPackageInfo**


## saveOtaPackageData

```
OtaPackageInfo saveOtaPackageData(@Nonnull String otaPackageId, @Nonnull String checksumAlgorithm, @Nonnull File _file, @Nullable String checksum)
```

**POST** `/api/otaPackage/{otaPackageId}`

Save OTA Package data (saveOtaPackageData)

Update the OTA Package. Adds the date to the existing OTA Package Info  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **otaPackageId** | **String** | A string value representing the ota package id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **checksumAlgorithm** | **String** | OTA Package checksum algorithm. | [enum: MD5, SHA256, SHA384, SHA512, CRC32, MURMUR3_32, MURMUR3_128] |
| **_file** | **File** | OTA Package data. | |
| **checksum** | **String** | OTA Package checksum. For example, '0xd87f7e0c' | [optional] |

### Return type

**OtaPackageInfo**


## saveOtaPackageInfo

```
OtaPackageInfo saveOtaPackageInfo(@Nonnull SaveOtaPackageInfoRequest saveOtaPackageInfoRequest)
```

**POST** `/api/otaPackage`

Create Or Update OTA Package Info (saveOtaPackageInfo)

Create or update the OTA Package Info. When creating OTA Package Info, platform generates OTA Package id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created OTA Package id will be present in the response. Specify existing OTA Package id to update the OTA Package Info. Referencing non-existing OTA Package Id will cause 'Not Found' error.   OTA Package combination of the title with the version is unique in the scope of tenant.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **saveOtaPackageInfoRequest** | **SaveOtaPackageInfoRequest** |  | |

### Return type

**OtaPackageInfo**


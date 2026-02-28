# OtaPackageControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteOtaPackage**](#deleteOtaPackage) | **DELETE** /api/otaPackage/{otaPackageId} | Delete OTA Package (deleteOtaPackage) |
| [**downloadOtaPackage**](#downloadOtaPackage) | **GET** /api/otaPackage/{otaPackageId}/download | Download OTA Package (downloadOtaPackage) |
| [**getOtaPackageById**](#getOtaPackageById) | **GET** /api/otaPackage/{otaPackageId} | Get OTA Package (getOtaPackageById) |
| [**getOtaPackageInfoById**](#getOtaPackageInfoById) | **GET** /api/otaPackage/info/{otaPackageId} | Get OTA Package Info (getOtaPackageInfoById) |
| [**getOtaPackages**](#getOtaPackages) | **GET** /api/otaPackages | Get OTA Package Infos (getOtaPackages) |
| [**getOtaPackages1**](#getOtaPackages1) | **GET** /api/otaPackages/{deviceProfileId}/{type} | Get OTA Package Infos (getOtaPackages) |
| [**saveOtaPackageData**](#saveOtaPackageData) | **POST** /api/otaPackage/{otaPackageId} | Save OTA Package data (saveOtaPackageData) |
| [**saveOtaPackageInfo**](#saveOtaPackageInfo) | **POST** /api/otaPackage | Create Or Update OTA Package Info (saveOtaPackageInfo) |



## deleteOtaPackage

> deleteOtaPackage(otaPackageId)

Delete OTA Package (deleteOtaPackage)

Deletes the OTA Package. Referencing non-existing OTA Package Id will cause an error. Can&#39;t delete the OTA Package if it is referenced by existing devices or device profile.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **otaPackageId** | **String** | A string value representing the ota package id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## downloadOtaPackage

> File downloadOtaPackage(otaPackageId)

Download OTA Package (downloadOtaPackage)

Download OTA Package based on the provided OTA Package Id.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **otaPackageId** | **String** | A string value representing the ota package id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## getOtaPackageById

> OtaPackage getOtaPackageById(otaPackageId)

Get OTA Package (getOtaPackageById)

Fetch the OTA Package object based on the provided OTA Package Id. The server checks that the OTA Package is owned by the same tenant. OTA Package is a heavyweight object that includes main information about the OTA Package and also data.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **otaPackageId** | **String** | A string value representing the ota package id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## getOtaPackageInfoById

> OtaPackageInfo getOtaPackageInfoById(otaPackageId)

Get OTA Package Info (getOtaPackageInfoById)

Fetch the OTA Package Info object based on the provided OTA Package Id. OTA Package Info is a lightweight object that includes main information about the OTA Package excluding the heavyweight data.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **otaPackageId** | **String** | A string value representing the ota package id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## getOtaPackages

> PageDataOtaPackageInfo getOtaPackages(pageSize, page, textSearch, sortProperty, sortOrder)

Get OTA Package Infos (getOtaPackages)

Returns a page of OTA Package Info objects owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. OTA Package Info is a lightweight object that includes main information about the OTA Package excluding the heavyweight data.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive &#39;substring&#39; filter based on the ota package title. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, type, title, version, tag, url, fileName, dataSize, checksum] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |


## getOtaPackages1

> PageDataOtaPackageInfo getOtaPackages1(deviceProfileId, type, pageSize, page, textSearch, sortProperty, sortOrder)

Get OTA Package Infos (getOtaPackages)

Returns a page of OTA Package Info objects owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. OTA Package Info is a lightweight object that includes main information about the OTA Package excluding the heavyweight data.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceProfileId** | **String** | A string value representing the device profile id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **type** | **String** | OTA Package type. | [enum: FIRMWARE, SOFTWARE] |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive &#39;substring&#39; filter based on the ota package title. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, type, title, version, tag, url, fileName, dataSize, checksum] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |


## saveOtaPackageData

> OtaPackageInfo saveOtaPackageData(otaPackageId, checksumAlgorithm, _file, checksum)

Save OTA Package data (saveOtaPackageData)

Update the OTA Package. Adds the date to the existing OTA Package Info  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **otaPackageId** | **String** | A string value representing the ota package id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **checksumAlgorithm** | **String** | OTA Package checksum algorithm. | [enum: MD5, SHA256, SHA384, SHA512, CRC32, MURMUR3_32, MURMUR3_128] |
| **_file** | **File** | OTA Package data. | |
| **checksum** | **String** | OTA Package checksum. For example, &#39;0xd87f7e0c&#39; | [optional] |


## saveOtaPackageInfo

> OtaPackageInfo saveOtaPackageInfo(saveOtaPackageInfoRequest)

Create Or Update OTA Package Info (saveOtaPackageInfo)

Create or update the OTA Package Info. When creating OTA Package Info, platform generates OTA Package id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created OTA Package id will be present in the response. Specify existing OTA Package id to update the OTA Package Info. Referencing non-existing OTA Package Id will cause &#39;Not Found&#39; error.   OTA Package combination of the title with the version is unique in the scope of tenant.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **saveOtaPackageInfoRequest** | **SaveOtaPackageInfoRequest** |  | |


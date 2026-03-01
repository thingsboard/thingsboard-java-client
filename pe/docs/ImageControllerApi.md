# ImageControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteImage**](#deleteImage) | **DELETE** /api/images/{type}/{key} | deleteImage |
| [**downloadImage**](#downloadImage) | **GET** /api/images/{type}/{key} | downloadImage |
| [**downloadImagePreview**](#downloadImagePreview) | **GET** /api/images/{type}/{key}/preview | downloadImagePreview |
| [**downloadLoginFavicon**](#downloadLoginFavicon) | **GET** /api/noauth/whiteLabel/loginFavicon/{type}/{key} | downloadLoginFavicon |
| [**downloadLoginLogo**](#downloadLoginLogo) | **GET** /api/noauth/whiteLabel/loginLogo/{type}/{key} | downloadLoginLogo |
| [**downloadPublicImage**](#downloadPublicImage) | **GET** /api/images/public/{publicResourceKey} | downloadPublicImage |
| [**exportImage**](#exportImage) | **GET** /api/images/{type}/{key}/export | exportImage |
| [**getImageInfo**](#getImageInfo) | **GET** /api/images/{type}/{key}/info | getImageInfo |
| [**getImages**](#getImages) | **GET** /api/images | getImages |
| [**importImage**](#importImage) | **PUT** /api/image/import | importImage |
| [**updateImage**](#updateImage) | **PUT** /api/images/{type}/{key} | updateImage |
| [**updateImageInfo**](#updateImageInfo) | **PUT** /api/images/{type}/{key}/info | updateImageInfo |
| [**updateImagePublicStatus**](#updateImagePublicStatus) | **PUT** /api/images/{type}/{key}/public/{isPublic} | updateImagePublicStatus |
| [**uploadImage**](#uploadImage) | **POST** /api/image | uploadImage |



## deleteImage

> TbImageDeleteResult deleteImage(type, key, force)

deleteImage


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String** | Type of the image: tenant or system | [enum: tenant, system] |
| **key** | **String** | Image resource key, for example thermostats_dashboard_background.jpeg | |
| **force** | **Boolean** |  | [optional] |

### Return type

**TbImageDeleteResult**


## downloadImage

> File downloadImage(type, key, ifNoneMatch, acceptEncoding)

downloadImage


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String** | Type of the image: tenant or system | [enum: tenant, system] |
| **key** | **String** | Image resource key, for example thermostats_dashboard_background.jpeg | |
| **ifNoneMatch** | **String** |  | [optional] |
| **acceptEncoding** | **String** |  | [optional] |

### Return type

**File**


## downloadImagePreview

> File downloadImagePreview(type, key, ifNoneMatch, acceptEncoding)

downloadImagePreview


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String** | Type of the image: tenant or system | [enum: tenant, system] |
| **key** | **String** | Image resource key, for example thermostats_dashboard_background.jpeg | |
| **ifNoneMatch** | **String** |  | [optional] |
| **acceptEncoding** | **String** |  | [optional] |

### Return type

**File**


## downloadLoginFavicon

> File downloadLoginFavicon(type, key, ifNoneMatch, acceptEncoding)

downloadLoginFavicon


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String** | Type of the image: tenant or system | [enum: tenant, system] |
| **key** | **String** | Image resource key, for example thermostats_dashboard_background.jpeg | |
| **ifNoneMatch** | **String** |  | [optional] |
| **acceptEncoding** | **String** |  | [optional] |

### Return type

**File**


## downloadLoginLogo

> File downloadLoginLogo(type, key, ifNoneMatch, acceptEncoding)

downloadLoginLogo


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String** | Type of the image: tenant or system | [enum: tenant, system] |
| **key** | **String** | Image resource key, for example thermostats_dashboard_background.jpeg | |
| **ifNoneMatch** | **String** |  | [optional] |
| **acceptEncoding** | **String** |  | [optional] |

### Return type

**File**


## downloadPublicImage

> File downloadPublicImage(publicResourceKey, ifNoneMatch, acceptEncoding)

downloadPublicImage


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **publicResourceKey** | **String** |  | |
| **ifNoneMatch** | **String** |  | [optional] |
| **acceptEncoding** | **String** |  | [optional] |

### Return type

**File**


## exportImage

> ResourceExportData exportImage(type, key)

exportImage


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String** | Type of the image: tenant or system | [enum: tenant, system] |
| **key** | **String** | Image resource key, for example thermostats_dashboard_background.jpeg | |

### Return type

**ResourceExportData**


## getImageInfo

> TbResourceInfo getImageInfo(type, key)

getImageInfo


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String** | Type of the image: tenant or system | [enum: tenant, system] |
| **key** | **String** | Image resource key, for example thermostats_dashboard_background.jpeg | |

### Return type

**TbResourceInfo**


## getImages

> PageDataTbResourceInfo getImages(pageSize, page, imageSubType, includeSystemImages, textSearch, sortProperty, sortOrder)

getImages


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **imageSubType** | **String** | A string value representing resource sub-type. | [optional] [enum: IMAGE, SCADA_SYMBOL] |
| **includeSystemImages** | **Boolean** | Use 'true' to include system images. Disabled by default. Ignored for requests by users with system administrator authority. | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the resource title. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, title, resourceType, tenantId] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataTbResourceInfo**


## importImage

> TbResourceInfo importImage(resourceExportData)

importImage


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **resourceExportData** | **ResourceExportData** |  | |

### Return type

**TbResourceInfo**


## updateImage

> TbResourceInfo updateImage(type, key, _file)

updateImage


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String** | Type of the image: tenant or system | [enum: tenant, system] |
| **key** | **String** | Image resource key, for example thermostats_dashboard_background.jpeg | |
| **_file** | **File** |  | |

### Return type

**TbResourceInfo**


## updateImageInfo

> TbResourceInfo updateImageInfo(type, key, tbResourceInfo)

updateImageInfo


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String** | Type of the image: tenant or system | [enum: tenant, system] |
| **key** | **String** | Image resource key, for example thermostats_dashboard_background.jpeg | |
| **tbResourceInfo** | **TbResourceInfo** |  | |

### Return type

**TbResourceInfo**


## updateImagePublicStatus

> TbResourceInfo updateImagePublicStatus(type, key, isPublic)

updateImagePublicStatus


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String** | Type of the image: tenant or system | [enum: tenant, system] |
| **key** | **String** | Image resource key, for example thermostats_dashboard_background.jpeg | |
| **isPublic** | **Boolean** |  | |

### Return type

**TbResourceInfo**


## uploadImage

> TbResourceInfo uploadImage(_file, title, imageSubType)

uploadImage


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_file** | **File** |  | |
| **title** | **String** |  | [optional] |
| **imageSubType** | **String** |  | [optional] |

### Return type

**TbResourceInfo**


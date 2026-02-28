# ImageControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteImage**](#deleteImage) | **DELETE** /api/images/{type}/{key} | deleteImage |
| [**downloadImage**](#downloadImage) | **GET** /api/images/{type}/{key} | downloadImage |
| [**downloadImagePreview**](#downloadImagePreview) | **GET** /api/images/{type}/{key}/preview | downloadImagePreview |
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


## downloadPublicImage

> File downloadPublicImage(publicResourceKey, ifNoneMatch, acceptEncoding)

downloadPublicImage

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **publicResourceKey** | **String** |  | |
| **ifNoneMatch** | **String** |  | [optional] |
| **acceptEncoding** | **String** |  | [optional] |


## exportImage

> ResourceExportData exportImage(type, key)

exportImage

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String** | Type of the image: tenant or system | [enum: tenant, system] |
| **key** | **String** | Image resource key, for example thermostats_dashboard_background.jpeg | |


## getImageInfo

> TbResourceInfo getImageInfo(type, key)

getImageInfo

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String** | Type of the image: tenant or system | [enum: tenant, system] |
| **key** | **String** | Image resource key, for example thermostats_dashboard_background.jpeg | |


## getImages

> PageDataTbResourceInfo getImages(pageSize, page, imageSubType, includeSystemImages, textSearch, sortProperty, sortOrder)

getImages

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **imageSubType** | **String** | A string value representing resource sub-type. | [optional] [enum: IMAGE, SCADA_SYMBOL] |
| **includeSystemImages** | **Boolean** | Use &#39;true&#39; to include system images. Disabled by default. Ignored for requests by users with system administrator authority. | [optional] |
| **textSearch** | **String** | The case insensitive &#39;substring&#39; filter based on the resource title. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, title, resourceType, tenantId] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |


## importImage

> TbResourceInfo importImage(resourceExportData)

importImage

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **resourceExportData** | **ResourceExportData** |  | |


## updateImage

> TbResourceInfo updateImage(type, key, _file)

updateImage

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String** | Type of the image: tenant or system | [enum: tenant, system] |
| **key** | **String** | Image resource key, for example thermostats_dashboard_background.jpeg | |
| **_file** | **File** |  | |


## updateImageInfo

> TbResourceInfo updateImageInfo(type, key, tbResourceInfo)

updateImageInfo

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String** | Type of the image: tenant or system | [enum: tenant, system] |
| **key** | **String** | Image resource key, for example thermostats_dashboard_background.jpeg | |
| **tbResourceInfo** | **TbResourceInfo** |  | |


## updateImagePublicStatus

> TbResourceInfo updateImagePublicStatus(type, key, isPublic)

updateImagePublicStatus

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String** | Type of the image: tenant or system | [enum: tenant, system] |
| **key** | **String** | Image resource key, for example thermostats_dashboard_background.jpeg | |
| **isPublic** | **Boolean** |  | |


## uploadImage

> TbResourceInfo uploadImage(_file, title, imageSubType)

uploadImage

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_file** | **File** |  | |
| **title** | **String** |  | [optional] |
| **imageSubType** | **String** |  | [optional] |


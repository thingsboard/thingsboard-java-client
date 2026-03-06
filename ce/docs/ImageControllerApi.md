# ImageControllerApi

`ThingsboardClient` methods:

```
TbImageDeleteResult deleteImage(@Nonnull String type, @Nonnull String key, @Nullable Boolean force) // deleteImage
File downloadImage(@Nonnull String type, @Nonnull String key, @Nullable String ifNoneMatch, @Nullable String acceptEncoding) // downloadImage
File downloadImagePreview(@Nonnull String type, @Nonnull String key, @Nullable String ifNoneMatch, @Nullable String acceptEncoding) // downloadImagePreview
File downloadPublicImage(@Nonnull String publicResourceKey, @Nullable String ifNoneMatch, @Nullable String acceptEncoding) // downloadPublicImage
ResourceExportData exportImage(@Nonnull String type, @Nonnull String key) // exportImage
TbResourceInfo getImageInfo(@Nonnull String type, @Nonnull String key) // getImageInfo
PageDataTbResourceInfo getImages(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String imageSubType, @Nullable Boolean includeSystemImages, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // getImages
TbResourceInfo importImage(@Nonnull ResourceExportData resourceExportData) // importImage
TbResourceInfo updateImage(@Nonnull String type, @Nonnull String key, @Nonnull File _file) // updateImage
TbResourceInfo updateImageInfo(@Nonnull String type, @Nonnull String key, @Nonnull TbResourceInfo tbResourceInfo) // updateImageInfo
TbResourceInfo updateImagePublicStatus(@Nonnull String type, @Nonnull String key, @Nonnull Boolean isPublic) // updateImagePublicStatus
TbResourceInfo uploadImage(@Nonnull File _file, @Nullable String title, @Nullable String imageSubType) // uploadImage
```


## deleteImage

```
TbImageDeleteResult deleteImage(@Nonnull String type, @Nonnull String key, @Nullable Boolean force)
```

**DELETE** `/api/images/{type}/{key}`

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

```
File downloadImage(@Nonnull String type, @Nonnull String key, @Nullable String ifNoneMatch, @Nullable String acceptEncoding)
```

**GET** `/api/images/{type}/{key}`

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

```
File downloadImagePreview(@Nonnull String type, @Nonnull String key, @Nullable String ifNoneMatch, @Nullable String acceptEncoding)
```

**GET** `/api/images/{type}/{key}/preview`

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


## downloadPublicImage

```
File downloadPublicImage(@Nonnull String publicResourceKey, @Nullable String ifNoneMatch, @Nullable String acceptEncoding)
```

**GET** `/api/images/public/{publicResourceKey}`

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

```
ResourceExportData exportImage(@Nonnull String type, @Nonnull String key)
```

**GET** `/api/images/{type}/{key}/export`

exportImage


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String** | Type of the image: tenant or system | [enum: tenant, system] |
| **key** | **String** | Image resource key, for example thermostats_dashboard_background.jpeg | |

### Return type

**ResourceExportData**


## getImageInfo

```
TbResourceInfo getImageInfo(@Nonnull String type, @Nonnull String key)
```

**GET** `/api/images/{type}/{key}/info`

getImageInfo


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String** | Type of the image: tenant or system | [enum: tenant, system] |
| **key** | **String** | Image resource key, for example thermostats_dashboard_background.jpeg | |

### Return type

**TbResourceInfo**


## getImages

```
PageDataTbResourceInfo getImages(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String imageSubType, @Nullable Boolean includeSystemImages, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/images`

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

```
TbResourceInfo importImage(@Nonnull ResourceExportData resourceExportData)
```

**PUT** `/api/image/import`

importImage


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **resourceExportData** | **ResourceExportData** |  | |

### Return type

**TbResourceInfo**


## updateImage

```
TbResourceInfo updateImage(@Nonnull String type, @Nonnull String key, @Nonnull File _file)
```

**PUT** `/api/images/{type}/{key}`

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

```
TbResourceInfo updateImageInfo(@Nonnull String type, @Nonnull String key, @Nonnull TbResourceInfo tbResourceInfo)
```

**PUT** `/api/images/{type}/{key}/info`

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

```
TbResourceInfo updateImagePublicStatus(@Nonnull String type, @Nonnull String key, @Nonnull Boolean isPublic)
```

**PUT** `/api/images/{type}/{key}/public/{isPublic}`

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

```
TbResourceInfo uploadImage(@Nonnull File _file, @Nullable String title, @Nullable String imageSubType)
```

**POST** `/api/image`

uploadImage


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_file** | **File** |  | |
| **title** | **String** |  | [optional] |
| **imageSubType** | **String** |  | [optional] |

### Return type

**TbResourceInfo**


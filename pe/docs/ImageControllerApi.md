# ImageControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
TbImageDeleteResult deleteImage(DeleteImageArgs args) // deleteImage
File downloadImage(DownloadImageArgs args) // downloadImage
File downloadImagePreview(DownloadImagePreviewArgs args) // downloadImagePreview
File downloadLoginFavicon(DownloadLoginFaviconArgs args) // downloadLoginFavicon
File downloadLoginLogo(DownloadLoginLogoArgs args) // downloadLoginLogo
File downloadPublicImage(DownloadPublicImageArgs args) // downloadPublicImage
ResourceExportData exportImage(ExportImageArgs args) // exportImage
TbResourceInfo getImageInfo(GetImageInfoArgs args) // getImageInfo
PageDataTbResourceInfo getImages(GetImagesArgs args) // getImages
TbResourceInfo importImage(ImportImageArgs args) // importImage
TbResourceInfo updateImage(UpdateImageArgs args) // updateImage
TbResourceInfo updateImageInfo(UpdateImageInfoArgs args) // updateImageInfo
TbResourceInfo updateImagePublicStatus(UpdateImagePublicStatusArgs args) // updateImagePublicStatus
TbResourceInfo uploadImage(UploadImageArgs args) // uploadImage
```


## deleteImage

**DELETE** `/api/images/{type}/{key}`

deleteImage

```java
TbImageDeleteResult deleteImage(DeleteImageArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteImageArgs.builder()
        .type(String)
        .key(String)
        .build()
```

### `DeleteImageArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `type` | `String` | **yes** | Type of the image: tenant or system | enum: `tenant`, `system` |
| `key` | `String` | **yes** | Image resource key, for example thermostats_dashboard_background.jpeg | |
| `force` | `Boolean` | no |  | |

### Return type

`TbImageDeleteResult`


## downloadImage

**GET** `/api/images/{type}/{key}`

downloadImage

```java
File downloadImage(DownloadImageArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DownloadImageArgs.builder()
        .type(String)
        .key(String)
        .build()
```

### `DownloadImageArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `type` | `String` | **yes** | Type of the image: tenant or system | enum: `tenant`, `system` |
| `key` | `String` | **yes** | Image resource key, for example thermostats_dashboard_background.jpeg | |
| `ifNoneMatch` | `String` | no |  | |
| `acceptEncoding` | `String` | no |  | |

### Return type

`File`


## downloadImagePreview

**GET** `/api/images/{type}/{key}/preview`

downloadImagePreview

```java
File downloadImagePreview(DownloadImagePreviewArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DownloadImagePreviewArgs.builder()
        .type(String)
        .key(String)
        .build()
```

### `DownloadImagePreviewArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `type` | `String` | **yes** | Type of the image: tenant or system | enum: `tenant`, `system` |
| `key` | `String` | **yes** | Image resource key, for example thermostats_dashboard_background.jpeg | |
| `ifNoneMatch` | `String` | no |  | |
| `acceptEncoding` | `String` | no |  | |

### Return type

`File`


## downloadLoginFavicon

**GET** `/api/noauth/whiteLabel/loginFavicon/{type}/{key}`

downloadLoginFavicon

```java
File downloadLoginFavicon(DownloadLoginFaviconArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DownloadLoginFaviconArgs.builder()
        .type(String)
        .key(String)
        .build()
```

### `DownloadLoginFaviconArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `type` | `String` | **yes** | Type of the image: tenant or system | enum: `tenant`, `system` |
| `key` | `String` | **yes** | Image resource key, for example thermostats_dashboard_background.jpeg | |
| `ifNoneMatch` | `String` | no |  | |
| `acceptEncoding` | `String` | no |  | |

### Return type

`File`


## downloadLoginLogo

**GET** `/api/noauth/whiteLabel/loginLogo/{type}/{key}`

downloadLoginLogo

```java
File downloadLoginLogo(DownloadLoginLogoArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DownloadLoginLogoArgs.builder()
        .type(String)
        .key(String)
        .build()
```

### `DownloadLoginLogoArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `type` | `String` | **yes** | Type of the image: tenant or system | enum: `tenant`, `system` |
| `key` | `String` | **yes** | Image resource key, for example thermostats_dashboard_background.jpeg | |
| `ifNoneMatch` | `String` | no |  | |
| `acceptEncoding` | `String` | no |  | |

### Return type

`File`


## downloadPublicImage

**GET** `/api/images/public/{publicResourceKey}`

downloadPublicImage

```java
File downloadPublicImage(DownloadPublicImageArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DownloadPublicImageArgs.builder()
        .publicResourceKey(String)
        .build()
```

### `DownloadPublicImageArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `publicResourceKey` | `String` | **yes** |  | |
| `ifNoneMatch` | `String` | no |  | |
| `acceptEncoding` | `String` | no |  | |

### Return type

`File`


## exportImage

**GET** `/api/images/{type}/{key}/export`

exportImage

```java
ResourceExportData exportImage(ExportImageArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ExportImageArgs.builder()
        .type(String)
        .key(String)
        .build()
```

### `ExportImageArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `type` | `String` | **yes** | Type of the image: tenant or system | enum: `tenant`, `system` |
| `key` | `String` | **yes** | Image resource key, for example thermostats_dashboard_background.jpeg | |

### Return type

`ResourceExportData`


## getImageInfo

**GET** `/api/images/{type}/{key}/info`

getImageInfo

```java
TbResourceInfo getImageInfo(GetImageInfoArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetImageInfoArgs.builder()
        .type(String)
        .key(String)
        .build()
```

### `GetImageInfoArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `type` | `String` | **yes** | Type of the image: tenant or system | enum: `tenant`, `system` |
| `key` | `String` | **yes** | Image resource key, for example thermostats_dashboard_background.jpeg | |

### Return type

`TbResourceInfo`


## getImages

**GET** `/api/images`

getImages

```java
PageDataTbResourceInfo getImages(GetImagesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetImagesArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetImagesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `imageSubType` | `String` | no | A string value representing resource sub-type. | enum: `IMAGE`, `SCADA_SYMBOL` |
| `includeSystemImages` | `Boolean` | no | Use 'true' to include system images. Disabled by default. Ignored for requests by users with system administrator authority. | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the resource title. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `title`, `resourceType`, `tenantId` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataTbResourceInfo`


## importImage

**PUT** `/api/image/import`

importImage

```java
TbResourceInfo importImage(ImportImageArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ImportImageArgs.builder()
        .resourceExportData(ResourceExportData)
        .build()
```

### `ImportImageArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `resourceExportData` | `ResourceExportData` | **yes** |  | |

### Return type

`TbResourceInfo`


## updateImage

**PUT** `/api/images/{type}/{key}`

updateImage

```java
TbResourceInfo updateImage(UpdateImageArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UpdateImageArgs.builder()
        .type(String)
        .key(String)
        ._file(File)
        .build()
```

### `UpdateImageArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `type` | `String` | **yes** | Type of the image: tenant or system | enum: `tenant`, `system` |
| `key` | `String` | **yes** | Image resource key, for example thermostats_dashboard_background.jpeg | |
| `_file` | `File` | **yes** |  | |

### Return type

`TbResourceInfo`


## updateImageInfo

**PUT** `/api/images/{type}/{key}/info`

updateImageInfo

```java
TbResourceInfo updateImageInfo(UpdateImageInfoArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UpdateImageInfoArgs.builder()
        .type(String)
        .key(String)
        .tbResourceInfo(TbResourceInfo)
        .build()
```

### `UpdateImageInfoArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `type` | `String` | **yes** | Type of the image: tenant or system | enum: `tenant`, `system` |
| `key` | `String` | **yes** | Image resource key, for example thermostats_dashboard_background.jpeg | |
| `tbResourceInfo` | `TbResourceInfo` | **yes** |  | |

### Return type

`TbResourceInfo`


## updateImagePublicStatus

**PUT** `/api/images/{type}/{key}/public/{isPublic}`

updateImagePublicStatus

```java
TbResourceInfo updateImagePublicStatus(UpdateImagePublicStatusArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UpdateImagePublicStatusArgs.builder()
        .type(String)
        .key(String)
        .isPublic(Boolean)
        .build()
```

### `UpdateImagePublicStatusArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `type` | `String` | **yes** | Type of the image: tenant or system | enum: `tenant`, `system` |
| `key` | `String` | **yes** | Image resource key, for example thermostats_dashboard_background.jpeg | |
| `isPublic` | `Boolean` | **yes** |  | |

### Return type

`TbResourceInfo`


## uploadImage

**POST** `/api/image`

uploadImage

```java
TbResourceInfo uploadImage(UploadImageArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UploadImageArgs.builder()
        ._file(File)
        .build()
```

### `UploadImageArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `_file` | `File` | **yes** |  | |
| `title` | `String` | no |  | |
| `imageSubType` | `String` | no |  | |

### Return type

`TbResourceInfo`


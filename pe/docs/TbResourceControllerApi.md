# TbResourceControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
TbResourceDeleteResult deleteResource(DeleteResourceArgs args) // Delete Resource (deleteResource)
File downloadJksResourceIfChanged(DownloadJksResourceIfChangedArgs args) // Download JKS Resource (downloadJksResourceIfChanged)
File downloadJsResourceIfChanged(DownloadJsResourceIfChangedArgs args) // Download JS Resource (downloadJsResourceIfChanged)
File downloadLwm2mResourceIfChanged(DownloadLwm2mResourceIfChangedArgs args) // Download LWM2M Resource (downloadLwm2mResourceIfChanged)
File downloadPkcs12ResourceIfChanged(DownloadPkcs12ResourceIfChangedArgs args) // Download PKCS_12 Resource (downloadPkcs12ResourceIfChanged)
File downloadResource(DownloadResourceArgs args) // Download Resource (downloadResource)
File downloadResourceIfChanged(DownloadResourceIfChangedArgs args) // Download resource (downloadResourceIfChanged)
List<LwM2mObject> getLwm2mListObjects(GetLwm2mListObjectsArgs args) // Get LwM2M Objects (getLwm2mListObjects)
List<LwM2mObject> getLwm2mListObjectsPage(GetLwm2mListObjectsPageArgs args) // Get LwM2M Objects (getLwm2mListObjectsPage)
TbResource getResourceById(GetResourceByIdArgs args) // Get Resource (getResourceById)
TbResourceInfo getResourceInfo(GetResourceInfoArgs args) // Get resource info (getResourceInfo)
TbResourceInfo getResourceInfoById(GetResourceInfoByIdArgs args) // Get Resource Info (getResourceInfoById)
PageDataTbResourceInfo getResources(GetResourcesArgs args) // Get Resource Infos (getResources)
List<TbResourceInfo> getSystemOrTenantResourcesByIds(GetSystemOrTenantResourcesByIdsArgs args) // Get Resource Infos by ids (getSystemOrTenantResourcesByIds)
PageDataTbResourceInfo getTenantResources(GetTenantResourcesArgs args) // Get All Resource Infos (getTenantResources)
TbResourceInfo saveResource(SaveResourceArgs args) // Create Or Update Resource (saveResource)
TbResourceInfo updateResourceData(UpdateResourceDataArgs args) // updateResourceData
TbResourceInfo updateResourceInfo(UpdateResourceInfoArgs args) // updateResourceInfo
TbResourceInfo uploadResource(UploadResourceArgs args) // Upload Resource via Multipart File (uploadResource)
```


## deleteResource

**DELETE** `/api/resource/{resourceId}`

Delete Resource (deleteResource)

Deletes the Resource. Referencing non-existing Resource Id will cause an error.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
TbResourceDeleteResult deleteResource(DeleteResourceArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteResourceArgs.builder()
        .resourceId(String)
        .build()
```

### `DeleteResourceArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `resourceId` | `String` | **yes** | A string value representing the resource id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `force` | `Boolean` | no |  | |

### Return type

`TbResourceDeleteResult`


## downloadJksResourceIfChanged

**GET** `/api/resource/jks/{resourceId}/download`

Download JKS Resource (downloadJksResourceIfChanged)

Download Resource based on the provided Resource Id or return 304 status code if resource was not changed.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
File downloadJksResourceIfChanged(DownloadJksResourceIfChangedArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DownloadJksResourceIfChangedArgs.builder()
        .resourceId(String)
        .build()
```

### `DownloadJksResourceIfChangedArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `resourceId` | `String` | **yes** | A string value representing the resource id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `ifNoneMatch` | `String` | no |  | |

### Return type

`File`


## downloadJsResourceIfChanged

**GET** `/api/resource/js/{resourceId}/download`

Download JS Resource (downloadJsResourceIfChanged)

Download Resource based on the provided Resource Id or return 304 status code if resource was not changed.  Available for any authorized user. 

```java
File downloadJsResourceIfChanged(DownloadJsResourceIfChangedArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DownloadJsResourceIfChangedArgs.builder()
        .resourceId(String)
        .build()
```

### `DownloadJsResourceIfChangedArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `resourceId` | `String` | **yes** | A string value representing the resource id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `ifNoneMatch` | `String` | no |  | |

### Return type

`File`


## downloadLwm2mResourceIfChanged

**GET** `/api/resource/lwm2m/{resourceId}/download`

Download LWM2M Resource (downloadLwm2mResourceIfChanged)

Download Resource based on the provided Resource Id or return 304 status code if resource was not changed.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
File downloadLwm2mResourceIfChanged(DownloadLwm2mResourceIfChangedArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DownloadLwm2mResourceIfChangedArgs.builder()
        .resourceId(String)
        .build()
```

### `DownloadLwm2mResourceIfChangedArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `resourceId` | `String` | **yes** | A string value representing the resource id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `ifNoneMatch` | `String` | no |  | |

### Return type

`File`


## downloadPkcs12ResourceIfChanged

**GET** `/api/resource/pkcs12/{resourceId}/download`

Download PKCS_12 Resource (downloadPkcs12ResourceIfChanged)

Download Resource based on the provided Resource Id or return 304 status code if resource was not changed.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
File downloadPkcs12ResourceIfChanged(DownloadPkcs12ResourceIfChangedArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DownloadPkcs12ResourceIfChangedArgs.builder()
        .resourceId(String)
        .build()
```

### `DownloadPkcs12ResourceIfChangedArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `resourceId` | `String` | **yes** | A string value representing the resource id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `ifNoneMatch` | `String` | no |  | |

### Return type

`File`


## downloadResource

**GET** `/api/resource/{resourceId}/download`

Download Resource (downloadResource)

Download Resource based on the provided Resource Id.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
File downloadResource(DownloadResourceArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DownloadResourceArgs.builder()
        .resourceId(String)
        .build()
```

### `DownloadResourceArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `resourceId` | `String` | **yes** | A string value representing the resource id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`File`


## downloadResourceIfChanged

**GET** `/api/resource/{resourceType}/{scope}/{key}`

Download resource (downloadResourceIfChanged)

Download resource with a given type and key for the given scope  Available for any authorized user. 

```java
File downloadResourceIfChanged(DownloadResourceIfChangedArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DownloadResourceIfChangedArgs.builder()
        .resourceType(String)
        .scope(String)
        .key(String)
        .build()
```

### `DownloadResourceIfChangedArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `resourceType` | `String` | **yes** | Type of the resource | enum: `lwm2m_model`, `jks`, `pkcs_12`, `js_module`, `dashboard` |
| `scope` | `String` | **yes** | Scope of the resource | enum: `system`, `tenant` |
| `key` | `String` | **yes** | Key of the resource, e.g. 'extension.js' | |
| `ifNoneMatch` | `String` | no |  | |

### Return type

`File`


## getLwm2mListObjects

**GET** `/api/resource/lwm2m`

Get LwM2M Objects (getLwm2mListObjects)

Returns a page of LwM2M objects parsed from Resources with type 'LWM2M_MODEL' owned by tenant or sysadmin. You can specify parameters to filter the results. LwM2M Object is a object that includes information about the LwM2M model which can be used in transport configuration for the LwM2M device profile.   Available for users with 'TENANT_ADMIN' authority.

```java
List<LwM2mObject> getLwm2mListObjects(GetLwm2mListObjectsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetLwm2mListObjectsArgs.builder()
        .sortOrder(String)
        .sortProperty(String)
        .objectIds(List<String>)
        .build()
```

### `GetLwm2mListObjectsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `sortOrder` | `String` | **yes** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |
| `sortProperty` | `String` | **yes** | Property of entity to sort by | enum: `id`, `name` |
| `objectIds` | `List<String>` | **yes** | LwM2M Object ids. | |

### Return type

`List<LwM2mObject>`


## getLwm2mListObjectsPage

**GET** `/api/resource/lwm2m/page`

Get LwM2M Objects (getLwm2mListObjectsPage)

Returns a page of LwM2M objects parsed from Resources with type 'LWM2M_MODEL' owned by tenant or sysadmin. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. LwM2M Object is a object that includes information about the LwM2M model which can be used in transport configuration for the LwM2M device profile.   Available for users with 'TENANT_ADMIN' authority.

```java
List<LwM2mObject> getLwm2mListObjectsPage(GetLwm2mListObjectsPageArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetLwm2mListObjectsPageArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetLwm2mListObjectsPageArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the resource title. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `id`, `name` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`List<LwM2mObject>`


## getResourceById

**GET** `/api/resource/{resourceId}`

Get Resource (getResourceById)

Fetch the Resource object based on the provided Resource Id. Resource is a heavyweight object that includes main information about the Resource and also data.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
TbResource getResourceById(GetResourceByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetResourceByIdArgs.builder()
        .resourceId(String)
        .build()
```

### `GetResourceByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `resourceId` | `String` | **yes** | A string value representing the resource id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`TbResource`


## getResourceInfo

**GET** `/api/resource/{resourceType}/{scope}/{key}/info`

Get resource info (getResourceInfo)

Get info for the resource with the given type, scope and key. Resource Info is a lightweight object that includes main information about the Resource excluding the heavyweight data.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
TbResourceInfo getResourceInfo(GetResourceInfoArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetResourceInfoArgs.builder()
        .resourceType(String)
        .scope(String)
        .key(String)
        .build()
```

### `GetResourceInfoArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `resourceType` | `String` | **yes** | Type of the resource | enum: `lwm2m_model`, `jks`, `pkcs_12`, `js_module`, `dashboard` |
| `scope` | `String` | **yes** | Scope of the resource | enum: `system`, `tenant` |
| `key` | `String` | **yes** | Key of the resource, e.g. 'extension.js' | |

### Return type

`TbResourceInfo`


## getResourceInfoById

**GET** `/api/resource/info/{resourceId}`

Get Resource Info (getResourceInfoById)

Fetch the Resource Info object based on the provided Resource Id. Resource Info is a lightweight object that includes main information about the Resource excluding the heavyweight data.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
TbResourceInfo getResourceInfoById(GetResourceInfoByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetResourceInfoByIdArgs.builder()
        .resourceId(String)
        .build()
```

### `GetResourceInfoByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `resourceId` | `String` | **yes** | A string value representing the resource id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`TbResourceInfo`


## getResources

**GET** `/api/resource`

Get Resource Infos (getResources)

Returns a page of Resource Info objects owned by tenant or sysadmin. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. Resource Info is a lightweight object that includes main information about the Resource excluding the heavyweight data.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
PageDataTbResourceInfo getResources(GetResourcesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetResourcesArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetResourcesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `resourceType` | `String` | no | A string value representing the resource type. | enum: `LWM2M_MODEL`, `JKS`, `PKCS_12`, `JS_MODULE` |
| `resourceSubType` | `String` | no | A string value representing the resource sub-type. | enum: `EXTENSION`, `MODULE` |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the resource title. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `title`, `resourceType`, `tenantId` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataTbResourceInfo`


## getSystemOrTenantResourcesByIds

**GET** `/api/resource/list`

Get Resource Infos by ids (getSystemOrTenantResourcesByIds)

```java
List<TbResourceInfo> getSystemOrTenantResourcesByIds(GetSystemOrTenantResourcesByIdsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetSystemOrTenantResourcesByIdsArgs.builder()
        .resourceIds(List<String>)
        .build()
```

### `GetSystemOrTenantResourcesByIdsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `resourceIds` | `List<String>` | **yes** | A list of resource ids, separated by comma ',' | |

### Return type

`List<TbResourceInfo>`


## getTenantResources

**GET** `/api/resource/tenant`

Get All Resource Infos (getTenantResources)

Returns a page of Resource Info objects owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. Resource Info is a lightweight object that includes main information about the Resource excluding the heavyweight data.   Available for users with 'TENANT_ADMIN' authority.

```java
PageDataTbResourceInfo getTenantResources(GetTenantResourcesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetTenantResourcesArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetTenantResourcesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the resource title. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `title`, `resourceType`, `tenantId` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataTbResourceInfo`


## saveResource

**POST** `/api/resource`

Create Or Update Resource (saveResource)

Create or update the Resource. When creating the Resource, platform generates Resource id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Resource id will be present in the response. Specify existing Resource id to update the Resource. Referencing non-existing Resource Id will cause 'Not Found' error.   Resource combination of the title with the key is unique in the scope of tenant. Remove 'id', 'tenantId' from the request body example (below) to create new Resource entity.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
TbResourceInfo saveResource(SaveResourceArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveResourceArgs.builder()
        .tbResource(TbResource)
        .build()
```

### `SaveResourceArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `tbResource` | `TbResource` | **yes** |  | |

### Return type

`TbResourceInfo`


## updateResourceData

**PUT** `/api/resource/{id}/data`

updateResourceData

```java
TbResourceInfo updateResourceData(UpdateResourceDataArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UpdateResourceDataArgs.builder()
        .id(UUID)
        ._file(File)
        .build()
```

### `UpdateResourceDataArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `UUID` | **yes** | Unique identifier of the Resource to update | |
| `_file` | `File` | **yes** | Resource file. | |

### Return type

`TbResourceInfo`


## updateResourceInfo

**PUT** `/api/resource/{id}/info`

updateResourceInfo

```java
TbResourceInfo updateResourceInfo(UpdateResourceInfoArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UpdateResourceInfoArgs.builder()
        .id(UUID)
        .tbResourceInfo(TbResourceInfo)
        .build()
```

### `UpdateResourceInfoArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `UUID` | **yes** | Unique identifier of the Resource to update | |
| `tbResourceInfo` | `TbResourceInfo` | **yes** |  | |

### Return type

`TbResourceInfo`


## uploadResource

**POST** `/api/resource/upload`

Upload Resource via Multipart File (uploadResource)

Create the Resource using multipart file upload.   Resource combination of the title with the key is unique in the scope of tenant.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
TbResourceInfo uploadResource(UploadResourceArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UploadResourceArgs.builder()
        .resourceType(String)
        ._file(File)
        .build()
```

### `UploadResourceArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `resourceType` | `String` | **yes** | Resource type. | |
| `_file` | `File` | **yes** | Resource file. | |
| `title` | `String` | no | Resource title. | |
| `descriptor` | `String` | no | Resource descriptor (JSON). | |
| `resourceSubType` | `String` | no | Resource sub type. | |

### Return type

`TbResourceInfo`


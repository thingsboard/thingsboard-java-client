# TbResourceControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteResource**](#deleteResource) | **DELETE** /api/resource/{resourceId} | Delete Resource (deleteResource) |
| [**downloadJksResourceIfChanged**](#downloadJksResourceIfChanged) | **GET** /api/resource/jks/{resourceId}/download | Download JKS Resource (downloadJksResourceIfChanged) |
| [**downloadJsResourceIfChanged**](#downloadJsResourceIfChanged) | **GET** /api/resource/js/{resourceId}/download | Download JS Resource (downloadJsResourceIfChanged) |
| [**downloadLwm2mResourceIfChanged**](#downloadLwm2mResourceIfChanged) | **GET** /api/resource/lwm2m/{resourceId}/download | Download LWM2M Resource (downloadLwm2mResourceIfChanged) |
| [**downloadPkcs12ResourceIfChanged**](#downloadPkcs12ResourceIfChanged) | **GET** /api/resource/pkcs12/{resourceId}/download | Download PKCS_12 Resource (downloadPkcs12ResourceIfChanged) |
| [**downloadResource**](#downloadResource) | **GET** /api/resource/{resourceId}/download | Download Resource (downloadResource) |
| [**downloadResourceIfChanged**](#downloadResourceIfChanged) | **GET** /api/resource/{resourceType}/{scope}/{key} | Download resource (downloadResourceIfChanged) |
| [**getLwm2mListObjects**](#getLwm2mListObjects) | **GET** /api/resource/lwm2m | Get LwM2M Objects (getLwm2mListObjects) |
| [**getLwm2mListObjectsPage**](#getLwm2mListObjectsPage) | **GET** /api/resource/lwm2m/page | Get LwM2M Objects (getLwm2mListObjectsPage) |
| [**getResourceById**](#getResourceById) | **GET** /api/resource/{resourceId} | Get Resource (getResourceById) |
| [**getResourceInfo**](#getResourceInfo) | **GET** /api/resource/{resourceType}/{scope}/{key}/info | Get resource info (getResourceInfo) |
| [**getResourceInfoById**](#getResourceInfoById) | **GET** /api/resource/info/{resourceId} | Get Resource Info (getResourceInfoById) |
| [**getResources**](#getResources) | **GET** /api/resource | Get Resource Infos (getResources) |
| [**getSystemOrTenantResourcesByIds**](#getSystemOrTenantResourcesByIds) | **GET** /api/resource/list | Get Resource Infos by ids (getSystemOrTenantResourcesByIds) |
| [**getTenantResources**](#getTenantResources) | **GET** /api/resource/tenant | Get All Resource Infos (getTenantResources) |
| [**saveResource**](#saveResource) | **POST** /api/resource | Create Or Update Resource (saveResource) |
| [**updateResourceData**](#updateResourceData) | **PUT** /api/resource/{id}/data | updateResourceData |
| [**updateResourceInfo**](#updateResourceInfo) | **PUT** /api/resource/{id}/info | updateResourceInfo |
| [**uploadResource**](#uploadResource) | **POST** /api/resource/upload | Upload Resource via Multipart File (uploadResource) |



## deleteResource

> TbResourceDeleteResult deleteResource(resourceId, force)

Delete Resource (deleteResource)

Deletes the Resource. Referencing non-existing Resource Id will cause an error.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **resourceId** | **String** | A string value representing the resource id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **force** | **Boolean** |  | [optional] |

### Return type

**TbResourceDeleteResult**


## downloadJksResourceIfChanged

> File downloadJksResourceIfChanged(resourceId, ifNoneMatch)

Download JKS Resource (downloadJksResourceIfChanged)

Download Resource based on the provided Resource Id or return 304 status code if resource was not changed.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **resourceId** | **String** | A string value representing the resource id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **ifNoneMatch** | **String** |  | [optional] |

### Return type

**File**


## downloadJsResourceIfChanged

> File downloadJsResourceIfChanged(resourceId, ifNoneMatch)

Download JS Resource (downloadJsResourceIfChanged)

Download Resource based on the provided Resource Id or return 304 status code if resource was not changed.  Available for any authorized user. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **resourceId** | **String** | A string value representing the resource id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **ifNoneMatch** | **String** |  | [optional] |

### Return type

**File**


## downloadLwm2mResourceIfChanged

> File downloadLwm2mResourceIfChanged(resourceId, ifNoneMatch)

Download LWM2M Resource (downloadLwm2mResourceIfChanged)

Download Resource based on the provided Resource Id or return 304 status code if resource was not changed.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **resourceId** | **String** | A string value representing the resource id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **ifNoneMatch** | **String** |  | [optional] |

### Return type

**File**


## downloadPkcs12ResourceIfChanged

> File downloadPkcs12ResourceIfChanged(resourceId, ifNoneMatch)

Download PKCS_12 Resource (downloadPkcs12ResourceIfChanged)

Download Resource based on the provided Resource Id or return 304 status code if resource was not changed.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **resourceId** | **String** | A string value representing the resource id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **ifNoneMatch** | **String** |  | [optional] |

### Return type

**File**


## downloadResource

> File downloadResource(resourceId)

Download Resource (downloadResource)

Download Resource based on the provided Resource Id.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **resourceId** | **String** | A string value representing the resource id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**File**


## downloadResourceIfChanged

> File downloadResourceIfChanged(resourceType, scope, key, ifNoneMatch)

Download resource (downloadResourceIfChanged)

Download resource with a given type and key for the given scope  Available for any authorized user. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **resourceType** | **String** | Type of the resource | [enum: lwm2m_model, jks, pkcs_12, js_module, dashboard] |
| **scope** | **String** | Scope of the resource | [enum: system, tenant] |
| **key** | **String** | Key of the resource, e.g. 'extension.js' | |
| **ifNoneMatch** | **String** |  | [optional] |

### Return type

**File**


## getLwm2mListObjects

> List<LwM2mObject> getLwm2mListObjects(sortOrder, sortProperty, objectIds)

Get LwM2M Objects (getLwm2mListObjects)

Returns a page of LwM2M objects parsed from Resources with type 'LWM2M_MODEL' owned by tenant or sysadmin. You can specify parameters to filter the results. LwM2M Object is a object that includes information about the LwM2M model which can be used in transport configuration for the LwM2M device profile.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [enum: ASC, DESC] |
| **sortProperty** | **String** | Property of entity to sort by | [enum: id, name] |
| **objectIds** | **List<String>** | LwM2M Object ids. | |

### Return type

**List<LwM2mObject>**


## getLwm2mListObjectsPage

> List<LwM2mObject> getLwm2mListObjectsPage(pageSize, page, textSearch, sortProperty, sortOrder)

Get LwM2M Objects (getLwm2mListObjectsPage)

Returns a page of LwM2M objects parsed from Resources with type 'LWM2M_MODEL' owned by tenant or sysadmin. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. LwM2M Object is a object that includes information about the LwM2M model which can be used in transport configuration for the LwM2M device profile.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the resource title. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: id, name] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**List<LwM2mObject>**


## getResourceById

> TbResource getResourceById(resourceId)

Get Resource (getResourceById)

Fetch the Resource object based on the provided Resource Id. Resource is a heavyweight object that includes main information about the Resource and also data.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **resourceId** | **String** | A string value representing the resource id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**TbResource**


## getResourceInfo

> TbResourceInfo getResourceInfo(resourceType, scope, key)

Get resource info (getResourceInfo)

Get info for the resource with the given type, scope and key. Resource Info is a lightweight object that includes main information about the Resource excluding the heavyweight data.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **resourceType** | **String** | Type of the resource | [enum: lwm2m_model, jks, pkcs_12, js_module, dashboard] |
| **scope** | **String** | Scope of the resource | [enum: system, tenant] |
| **key** | **String** | Key of the resource, e.g. 'extension.js' | |

### Return type

**TbResourceInfo**


## getResourceInfoById

> TbResourceInfo getResourceInfoById(resourceId)

Get Resource Info (getResourceInfoById)

Fetch the Resource Info object based on the provided Resource Id. Resource Info is a lightweight object that includes main information about the Resource excluding the heavyweight data.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **resourceId** | **String** | A string value representing the resource id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**TbResourceInfo**


## getResources

> PageDataTbResourceInfo getResources(pageSize, page, resourceType, resourceSubType, textSearch, sortProperty, sortOrder)

Get Resource Infos (getResources)

Returns a page of Resource Info objects owned by tenant or sysadmin. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. Resource Info is a lightweight object that includes main information about the Resource excluding the heavyweight data.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **resourceType** | **String** | A string value representing the resource type. | [optional] [enum: LWM2M_MODEL, JKS, PKCS_12, JS_MODULE] |
| **resourceSubType** | **String** | A string value representing the resource sub-type. | [optional] [enum: EXTENSION, MODULE] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the resource title. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, title, resourceType, tenantId] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataTbResourceInfo**


## getSystemOrTenantResourcesByIds

> List<TbResourceInfo> getSystemOrTenantResourcesByIds(resourceIds)

Get Resource Infos by ids (getSystemOrTenantResourcesByIds)


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **resourceIds** | **List<String>** | A list of resource ids, separated by comma ',' | |

### Return type

**List<TbResourceInfo>**


## getTenantResources

> PageDataTbResourceInfo getTenantResources(pageSize, page, textSearch, sortProperty, sortOrder)

Get All Resource Infos (getTenantResources)

Returns a page of Resource Info objects owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. Resource Info is a lightweight object that includes main information about the Resource excluding the heavyweight data.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the resource title. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, title, resourceType, tenantId] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataTbResourceInfo**


## saveResource

> TbResourceInfo saveResource(tbResource)

Create Or Update Resource (saveResource)

Create or update the Resource. When creating the Resource, platform generates Resource id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Resource id will be present in the response. Specify existing Resource id to update the Resource. Referencing non-existing Resource Id will cause 'Not Found' error.   Resource combination of the title with the key is unique in the scope of tenant. Remove 'id', 'tenantId' from the request body example (below) to create new Resource entity.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tbResource** | **TbResource** |  | |

### Return type

**TbResourceInfo**


## updateResourceData

> TbResourceInfo updateResourceData(id, _file)

updateResourceData


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** | Unique identifier of the Resource to update | |
| **_file** | **File** | Resource file. | |

### Return type

**TbResourceInfo**


## updateResourceInfo

> TbResourceInfo updateResourceInfo(id, tbResourceInfo)

updateResourceInfo


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** | Unique identifier of the Resource to update | |
| **tbResourceInfo** | **TbResourceInfo** |  | |

### Return type

**TbResourceInfo**


## uploadResource

> TbResourceInfo uploadResource(resourceType, _file, title, descriptor, resourceSubType)

Upload Resource via Multipart File (uploadResource)

Create the Resource using multipart file upload.   Resource combination of the title with the key is unique in the scope of tenant.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **resourceType** | **String** | Resource type. | |
| **_file** | **File** | Resource file. | |
| **title** | **String** | Resource title. | [optional] |
| **descriptor** | **String** | Resource descriptor (JSON). | [optional] |
| **resourceSubType** | **String** | Resource sub type. | [optional] |

### Return type

**TbResourceInfo**


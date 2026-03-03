# AssetControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignAssetToCustomer**](#assignAssetToCustomer) | **POST** /api/customer/{customerId}/asset/{assetId} | Assign asset to customer (assignAssetToCustomer) |
| [**assignAssetToEdge**](#assignAssetToEdge) | **POST** /api/edge/{edgeId}/asset/{assetId} | Assign asset to edge (assignAssetToEdge) |
| [**assignAssetToPublicCustomer**](#assignAssetToPublicCustomer) | **POST** /api/customer/public/asset/{assetId} | Make asset publicly available (assignAssetToPublicCustomer) |
| [**deleteAsset**](#deleteAsset) | **DELETE** /api/asset/{assetId} | Delete asset (deleteAsset) |
| [**findAssetsByQuery**](#findAssetsByQuery) | **POST** /api/assets | Find related assets (findAssetsByQuery) |
| [**getAssetById**](#getAssetById) | **GET** /api/asset/{assetId} | Get Asset (getAssetById) |
| [**getAssetInfoById**](#getAssetInfoById) | **GET** /api/asset/info/{assetId} | Get Asset Info (getAssetInfoById) |
| [**getAssetTypes**](#getAssetTypes) | **GET** /api/asset/types | Get Asset Types (getAssetTypes) |
| [**getAssetsByIds**](#getAssetsByIds) | **GET** /api/assets | Get Assets By Ids (getAssetsByIds) |
| [**getCustomerAssetInfos**](#getCustomerAssetInfos) | **GET** /api/customer/{customerId}/assetInfos | Get Customer Asset Infos (getCustomerAssetInfos) |
| [**getCustomerAssets**](#getCustomerAssets) | **GET** /api/customer/{customerId}/assets | Get Customer Assets (getCustomerAssets) |
| [**getEdgeAssets**](#getEdgeAssets) | **GET** /api/edge/{edgeId}/assets | Get assets assigned to edge (getEdgeAssets) |
| [**getTenantAssetByName**](#getTenantAssetByName) | **GET** /api/tenant/asset | Get Tenant Asset (getTenantAssetByName) |
| [**getTenantAssetInfos**](#getTenantAssetInfos) | **GET** /api/tenant/assetInfos | Get Tenant Asset Infos (getTenantAssetInfos) |
| [**getTenantAssets**](#getTenantAssets) | **GET** /api/tenant/assets | Get Tenant Assets (getTenantAssets) |
| [**processAssetsBulkImport**](#processAssetsBulkImport) | **POST** /api/asset/bulk_import | Import the bulk of assets (processAssetsBulkImport) |
| [**saveAsset**](#saveAsset) | **POST** /api/asset | Create Or Update Asset (saveAsset) |
| [**unassignAssetFromCustomer**](#unassignAssetFromCustomer) | **DELETE** /api/customer/asset/{assetId} | Unassign asset from customer (unassignAssetFromCustomer) |
| [**unassignAssetFromEdge**](#unassignAssetFromEdge) | **DELETE** /api/edge/{edgeId}/asset/{assetId} | Unassign asset from edge (unassignAssetFromEdge) |



## assignAssetToCustomer

> Asset assignAssetToCustomer(customerId, assetId)

Assign asset to customer (assignAssetToCustomer)

Creates assignment of the asset to customer. Customer will be able to query asset afterwards.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **assetId** | **String** | A string value representing the asset id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**Asset**


## assignAssetToEdge

> Asset assignAssetToEdge(edgeId, assetId)

Assign asset to edge (assignAssetToEdge)

Creates assignment of an existing asset to an instance of The Edge. Assignment works in async way - first, notification event pushed to edge service queue on platform. Second, remote edge service will receive a copy of assignment asset (Edge will receive this instantly, if it's currently connected, or once it's going to be connected to platform). Third, once asset will be delivered to edge service, it's going to be available for usage on remote edge instance.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **assetId** | **String** | A string value representing the asset id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**Asset**


## assignAssetToPublicCustomer

> Asset assignAssetToPublicCustomer(assetId)

Make asset publicly available (assignAssetToPublicCustomer)

Asset will be available for non-authorized (not logged-in) users. This is useful to create dashboards that you plan to share/embed on a publicly available website. However, users that are logged-in and belong to different tenant will not be able to access the asset.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetId** | **String** | A string value representing the asset id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**Asset**


## deleteAsset

> deleteAsset(assetId)

Delete asset (deleteAsset)

Deletes the asset and all the relations (from and to the asset). Referencing non-existing asset Id will cause an error.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetId** | **String** | A string value representing the asset id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## findAssetsByQuery

> List<Asset> findAssetsByQuery(assetSearchQuery)

Find related assets (findAssetsByQuery)

Returns all assets that are related to the specific entity. The entity id, relation type, asset types, depth of the search, and other query parameters defined using complex 'AssetSearchQuery' object. See 'Model' tab of the Parameters for more info.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetSearchQuery** | **AssetSearchQuery** |  | |

### Return type

**List<Asset>**


## getAssetById

> Asset getAssetById(assetId)

Get Asset (getAssetById)

Fetch the Asset object based on the provided Asset Id. If the user has the authority of 'Tenant Administrator', the server checks that the asset is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the asset is assigned to the same customer.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetId** | **String** | A string value representing the asset id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**Asset**


## getAssetInfoById

> AssetInfo getAssetInfoById(assetId)

Get Asset Info (getAssetInfoById)

Fetch the Asset Info object based on the provided Asset Id. If the user has the authority of 'Tenant Administrator', the server checks that the asset is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the asset is assigned to the same customer. Asset Info is an extension of the default Asset object that contains information about the assigned customer name.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetId** | **String** | A string value representing the asset id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**AssetInfo**


## getAssetTypes

> List<EntitySubtype> getAssetTypes()

Get Asset Types (getAssetTypes)

Deprecated. See 'getAssetProfileNames' API from Asset Profile Controller instead.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

### Return type

**List<EntitySubtype>**


## getAssetsByIds

> List<Asset> getAssetsByIds(assetIds)

Get Assets By Ids (getAssetsByIds)

Requested assets must be owned by tenant or assigned to customer which user is performing the request. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetIds** | **List<String>** | A list of assets ids, separated by comma ',' | |

### Return type

**List<Asset>**


## getCustomerAssetInfos

> PageDataAssetInfo getCustomerAssetInfos(customerId, pageSize, page, type, assetProfileId, textSearch, sortProperty, sortOrder)

Get Customer Asset Infos (getCustomerAssetInfos)

Returns a page of assets info objects assigned to customer. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. Asset Info is an extension of the default Asset object that contains information about the assigned customer name. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **type** | **String** | Asset type | [optional] |
| **assetProfileId** | **String** | A string value representing the asset profile id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the asset name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type, label, customerTitle] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataAssetInfo**


## getCustomerAssets

> PageDataAsset getCustomerAssets(customerId, pageSize, page, type, textSearch, sortProperty, sortOrder)

Get Customer Assets (getCustomerAssets)

Returns a page of assets objects assigned to customer. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **type** | **String** | Asset type | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the asset name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type, label, customerTitle] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataAsset**


## getEdgeAssets

> PageDataAsset getEdgeAssets(edgeId, pageSize, page, type, textSearch, sortProperty, sortOrder, startTime, endTime)

Get assets assigned to edge (getEdgeAssets)

Returns a page of assets assigned to edge. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **type** | **String** | Asset type | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the asset name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type, label, customerTitle] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **startTime** | **Long** | Timestamp. Assets with creation time before it won't be queried | [optional] |
| **endTime** | **Long** | Timestamp. Assets with creation time after it won't be queried | [optional] |

### Return type

**PageDataAsset**


## getTenantAssetByName

> Asset getTenantAssetByName(assetName)

Get Tenant Asset (getTenantAssetByName)

Requested asset must be owned by tenant that the user belongs to. Asset name is an unique property of asset. So it can be used to identify the asset.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetName** | **String** | A string value representing the Asset name. | |

### Return type

**Asset**


## getTenantAssetInfos

> PageDataAssetInfo getTenantAssetInfos(pageSize, page, type, assetProfileId, textSearch, sortProperty, sortOrder)

Get Tenant Asset Infos (getTenantAssetInfos)

Returns a page of assets info objects owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. Asset Info is an extension of the default Asset object that contains information about the assigned customer name.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **type** | **String** | Asset type | [optional] |
| **assetProfileId** | **String** | A string value representing the asset profile id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the asset name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type, label, customerTitle] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataAssetInfo**


## getTenantAssets

> PageDataAsset getTenantAssets(pageSize, page, type, textSearch, sortProperty, sortOrder)

Get Tenant Assets (getTenantAssets)

Returns a page of assets owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **type** | **String** | Asset type | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the asset name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type, label, customerTitle] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataAsset**


## processAssetsBulkImport

> BulkImportResultAsset processAssetsBulkImport(bulkImportRequest)

Import the bulk of assets (processAssetsBulkImport)

There's an ability to import the bulk of assets using the only .csv file.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bulkImportRequest** | **BulkImportRequest** |  | |

### Return type

**BulkImportResultAsset**


## saveAsset

> Asset saveAsset(asset, nameConflictPolicy, uniquifySeparator, uniquifyStrategy)

Create Or Update Asset (saveAsset)

Creates or Updates the Asset. When creating asset, platform generates Asset Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Asset id will be present in the response. Specify existing Asset id to update the asset. Referencing non-existing Asset Id will cause 'Not Found' error. Remove 'id', 'tenantId' and optionally 'customerId' from the request body example (below) to create new Asset entity.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **asset** | **Asset** | A JSON value representing the asset. | |
| **nameConflictPolicy** | **NameConflictPolicy** | Optional value of name conflict policy. Possible values: FAIL or UNIQUIFY.  If omitted, FAIL policy is applied. FAIL policy implies exception will be thrown if an entity with the same name already exists.  UNIQUIFY policy appends a suffix to the entity name, if a name conflict occurs. | [optional] [default to FAIL] [enum: FAIL, UNIQUIFY] |
| **uniquifySeparator** | **String** | Optional value of name suffix separator used by UNIQUIFY policy. By default, underscore separator is used. For example, strategy is UNIQUIFY, separator is '-'; if a name conflict occurs for entity name 'test-name', created entity will have name like 'test-name-7fsh4f'. | [optional] [default to _] |
| **uniquifyStrategy** | **UniquifyStrategy** | Optional value of uniquify strategy used by UNIQUIFY policy. Possible values: RANDOM or INCREMENTAL. By default, RANDOM strategy is used, which means random alphanumeric string will be added as a suffix to entity name. INCREMENTAL implies the first possible number starting from 1 will be added as a name suffix. For example, strategy is UNIQUIFY, uniquify strategy is INCREMENTAL; if a name conflict occurs for entity name 'test-name', created entity will have name like 'test-name-1. | [optional] [default to RANDOM] [enum: RANDOM, INCREMENTAL] |

### Return type

**Asset**


## unassignAssetFromCustomer

> Asset unassignAssetFromCustomer(assetId)

Unassign asset from customer (unassignAssetFromCustomer)

Clears assignment of the asset to customer. Customer will not be able to query asset afterwards.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetId** | **String** | A string value representing the asset id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**Asset**


## unassignAssetFromEdge

> Asset unassignAssetFromEdge(edgeId, assetId)

Unassign asset from edge (unassignAssetFromEdge)

Clears assignment of the asset to the edge. Unassignment works in async way - first, 'unassign' notification event pushed to edge queue on platform. Second, remote edge service will receive an 'unassign' command to remove asset (Edge will receive this instantly, if it's currently connected, or once it's going to be connected to platform). Third, once 'unassign' command will be delivered to edge service, it's going to remove asset locally.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **assetId** | **String** | A string value representing the asset id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**Asset**


# AssetControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignAssetToCustomer**](#assignAssetToCustomer) | **POST** /api/customer/{customerId}/asset/{assetId} | Assign asset to customer (assignAssetToCustomer) |
| [**assignAssetToEdge**](#assignAssetToEdge) | **POST** /api/edge/{edgeId}/asset/{assetId} | Assign asset to edge (assignAssetToEdge) |
| [**assignAssetToPublicCustomer**](#assignAssetToPublicCustomer) | **POST** /api/customer/public/asset/{assetId} | Make asset publicly available (assignAssetToPublicCustomer) |
| [**deleteAsset**](#deleteAsset) | **DELETE** /api/asset/{assetId} | Delete asset (deleteAsset) |
| [**findByQuery4**](#findByQuery4) | **POST** /api/assets | Find related assets (findByQuery) |
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

Creates assignment of the asset to customer. Customer will be able to query asset afterwards.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **assetId** | **String** | A string value representing the asset id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## assignAssetToEdge

> Asset assignAssetToEdge(edgeId, assetId)

Assign asset to edge (assignAssetToEdge)

Creates assignment of an existing asset to an instance of The Edge. Assignment works in async way - first, notification event pushed to edge service queue on platform. Second, remote edge service will receive a copy of assignment asset (Edge will receive this instantly, if it&#39;s currently connected, or once it&#39;s going to be connected to platform). Third, once asset will be delivered to edge service, it&#39;s going to be available for usage on remote edge instance.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **assetId** | **String** | A string value representing the asset id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## assignAssetToPublicCustomer

> Asset assignAssetToPublicCustomer(assetId)

Make asset publicly available (assignAssetToPublicCustomer)

Asset will be available for non-authorized (not logged-in) users. This is useful to create dashboards that you plan to share/embed on a publicly available website. However, users that are logged-in and belong to different tenant will not be able to access the asset.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetId** | **String** | A string value representing the asset id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## deleteAsset

> deleteAsset(assetId)

Delete asset (deleteAsset)

Deletes the asset and all the relations (from and to the asset). Referencing non-existing asset Id will cause an error.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetId** | **String** | A string value representing the asset id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## findByQuery4

> List&lt;Asset&gt; findByQuery4(assetSearchQuery)

Find related assets (findByQuery)

Returns all assets that are related to the specific entity. The entity id, relation type, asset types, depth of the search, and other query parameters defined using complex &#39;AssetSearchQuery&#39; object. See &#39;Model&#39; tab of the Parameters for more info.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetSearchQuery** | **AssetSearchQuery** |  | |


## getAssetById

> Asset getAssetById(assetId)

Get Asset (getAssetById)

Fetch the Asset object based on the provided Asset Id. If the user has the authority of &#39;Tenant Administrator&#39;, the server checks that the asset is owned by the same tenant. If the user has the authority of &#39;Customer User&#39;, the server checks that the asset is assigned to the same customer.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetId** | **String** | A string value representing the asset id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## getAssetInfoById

> AssetInfo getAssetInfoById(assetId)

Get Asset Info (getAssetInfoById)

Fetch the Asset Info object based on the provided Asset Id. If the user has the authority of &#39;Tenant Administrator&#39;, the server checks that the asset is owned by the same tenant. If the user has the authority of &#39;Customer User&#39;, the server checks that the asset is assigned to the same customer. Asset Info is an extension of the default Asset object that contains information about the assigned customer name.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetId** | **String** | A string value representing the asset id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## getAssetTypes

> List&lt;EntitySubtype&gt; getAssetTypes()

Get Asset Types (getAssetTypes)

Deprecated. See &#39;getAssetProfileNames&#39; API from Asset Profile Controller instead.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

## getAssetsByIds

> List&lt;Asset&gt; getAssetsByIds(assetIds)

Get Assets By Ids (getAssetsByIds)

Requested assets must be owned by tenant or assigned to customer which user is performing the request. 

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetIds** | **List&lt;String&gt;** | A list of assets ids, separated by comma &#39;,&#39; | |


## getCustomerAssetInfos

> PageDataAssetInfo getCustomerAssetInfos(customerId, pageSize, page, type, assetProfileId, textSearch, sortProperty, sortOrder)

Get Customer Asset Infos (getCustomerAssetInfos)

Returns a page of assets info objects assigned to customer. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. Asset Info is an extension of the default Asset object that contains information about the assigned customer name. 

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **type** | **String** | Asset type | [optional] |
| **assetProfileId** | **String** | A string value representing the asset profile id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | [optional] |
| **textSearch** | **String** | The case insensitive &#39;substring&#39; filter based on the asset name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type, label, customerTitle] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |


## getCustomerAssets

> PageDataAsset getCustomerAssets(customerId, pageSize, page, type, textSearch, sortProperty, sortOrder)

Get Customer Assets (getCustomerAssets)

Returns a page of assets objects assigned to customer. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. 

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **type** | **String** | Asset type | [optional] |
| **textSearch** | **String** | The case insensitive &#39;substring&#39; filter based on the asset name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type, label, customerTitle] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |


## getEdgeAssets

> PageDataAsset getEdgeAssets(edgeId, pageSize, page, type, textSearch, sortProperty, sortOrder, startTime, endTime)

Get assets assigned to edge (getEdgeAssets)

Returns a page of assets assigned to edge. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. 

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **type** | **String** | Asset type | [optional] |
| **textSearch** | **String** | The case insensitive &#39;substring&#39; filter based on the asset name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type, label, customerTitle] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **startTime** | **Long** | Timestamp. Assets with creation time before it won&#39;t be queried | [optional] |
| **endTime** | **Long** | Timestamp. Assets with creation time after it won&#39;t be queried | [optional] |


## getTenantAssetByName

> Asset getTenantAssetByName(assetName)

Get Tenant Asset (getTenantAssetByName)

Requested asset must be owned by tenant that the user belongs to. Asset name is an unique property of asset. So it can be used to identify the asset.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetName** | **String** | A string value representing the Asset name. | |


## getTenantAssetInfos

> PageDataAssetInfo getTenantAssetInfos(pageSize, page, type, assetProfileId, textSearch, sortProperty, sortOrder)

Get Tenant Asset Infos (getTenantAssetInfos)

Returns a page of assets info objects owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. Asset Info is an extension of the default Asset object that contains information about the assigned customer name.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **type** | **String** | Asset type | [optional] |
| **assetProfileId** | **String** | A string value representing the asset profile id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | [optional] |
| **textSearch** | **String** | The case insensitive &#39;substring&#39; filter based on the asset name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type, label, customerTitle] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |


## getTenantAssets

> PageDataAsset getTenantAssets(pageSize, page, type, textSearch, sortProperty, sortOrder)

Get Tenant Assets (getTenantAssets)

Returns a page of assets owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **type** | **String** | Asset type | [optional] |
| **textSearch** | **String** | The case insensitive &#39;substring&#39; filter based on the asset name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type, label, customerTitle] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |


## processAssetsBulkImport

> BulkImportResultAsset processAssetsBulkImport(bulkImportRequest)

Import the bulk of assets (processAssetsBulkImport)

There&#39;s an ability to import the bulk of assets using the only .csv file.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bulkImportRequest** | **BulkImportRequest** |  | |


## saveAsset

> Asset saveAsset(asset, nameConflictPolicy, uniquifySeparator, uniquifyStrategy)

Create Or Update Asset (saveAsset)

Creates or Updates the Asset. When creating asset, platform generates Asset Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Asset id will be present in the response. Specify existing Asset id to update the asset. Referencing non-existing Asset Id will cause &#39;Not Found&#39; error. Remove &#39;id&#39;, &#39;tenantId&#39; and optionally &#39;customerId&#39; from the request body example (below) to create new Asset entity.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **asset** | **Asset** | A JSON value representing the asset. | |
| **nameConflictPolicy** | **NameConflictPolicy** | Optional value of name conflict policy. Possible values: FAIL or UNIQUIFY.  If omitted, FAIL policy is applied. FAIL policy implies exception will be thrown if an entity with the same name already exists.  UNIQUIFY policy appends a suffix to the entity name, if a name conflict occurs. | [optional] [default to FAIL] [enum: FAIL, UNIQUIFY] |
| **uniquifySeparator** | **String** | Optional value of name suffix separator used by UNIQUIFY policy. By default, underscore separator is used. For example, strategy is UNIQUIFY, separator is &#39;-&#39;; if a name conflict occurs for entity name &#39;test-name&#39;, created entity will have name like &#39;test-name-7fsh4f&#39;. | [optional] [default to _] |
| **uniquifyStrategy** | **UniquifyStrategy** | Optional value of uniquify strategy used by UNIQUIFY policy. Possible values: RANDOM or INCREMENTAL. By default, RANDOM strategy is used, which means random alphanumeric string will be added as a suffix to entity name. INCREMENTAL implies the first possible number starting from 1 will be added as a name suffix. For example, strategy is UNIQUIFY, uniquify strategy is INCREMENTAL; if a name conflict occurs for entity name &#39;test-name&#39;, created entity will have name like &#39;test-name-1. | [optional] [default to RANDOM] [enum: RANDOM, INCREMENTAL] |


## unassignAssetFromCustomer

> Asset unassignAssetFromCustomer(assetId)

Unassign asset from customer (unassignAssetFromCustomer)

Clears assignment of the asset to customer. Customer will not be able to query asset afterwards.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetId** | **String** | A string value representing the asset id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## unassignAssetFromEdge

> Asset unassignAssetFromEdge(edgeId, assetId)

Unassign asset from edge (unassignAssetFromEdge)

Clears assignment of the asset to the edge. Unassignment works in async way - first, &#39;unassign&#39; notification event pushed to edge queue on platform. Second, remote edge service will receive an &#39;unassign&#39; command to remove asset (Edge will receive this instantly, if it&#39;s currently connected, or once it&#39;s going to be connected to platform). Third, once &#39;unassign&#39; command will be delivered to edge service, it&#39;s going to remove asset locally.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **assetId** | **String** | A string value representing the asset id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


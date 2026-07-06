# AssetControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
Asset assignAssetToCustomer(AssignAssetToCustomerArgs args) // Assign asset to customer (assignAssetToCustomer)
Asset assignAssetToEdge(AssignAssetToEdgeArgs args) // Assign asset to edge (assignAssetToEdge)
Asset assignAssetToPublicCustomer(AssignAssetToPublicCustomerArgs args) // Make asset publicly available (assignAssetToPublicCustomer)
void deleteAsset(DeleteAssetArgs args) // Delete asset (deleteAsset)
List<Asset> findAssetsByQuery(FindAssetsByQueryArgs args) // Find related assets (findAssetsByQuery)
Asset getAssetById(GetAssetByIdArgs args) // Get Asset (getAssetById)
AssetInfo getAssetInfoById(GetAssetInfoByIdArgs args) // Get Asset Info (getAssetInfoById)
List<EntitySubtype> getAssetTypes() // Get Asset Types (getAssetTypes)
List<Asset> getAssetsByIds(GetAssetsByIdsArgs args) // Get Assets By Ids (getAssetsByIds)
PageDataAssetInfo getCustomerAssetInfos(GetCustomerAssetInfosArgs args) // Get Customer Asset Infos (getCustomerAssetInfos)
PageDataAsset getCustomerAssets(GetCustomerAssetsArgs args) // Get Customer Assets (getCustomerAssets)
PageDataAsset getEdgeAssets(GetEdgeAssetsArgs args) // Get assets assigned to edge (getEdgeAssets)
Asset getTenantAssetByName(GetTenantAssetByNameArgs args) // Get Tenant Asset (getTenantAssetByName)
PageDataAssetInfo getTenantAssetInfos(GetTenantAssetInfosArgs args) // Get Tenant Asset Infos (getTenantAssetInfos)
PageDataAsset getTenantAssets(GetTenantAssetsArgs args) // Get Tenant Assets (getTenantAssets)
BulkImportResultAsset processAssetBulkImport(ProcessAssetBulkImportArgs args) // Import the bulk of assets (processAssetBulkImport)
Asset saveAsset(SaveAssetArgs args) // Create Or Update Asset (saveAsset)
Asset unassignAssetFromCustomer(UnassignAssetFromCustomerArgs args) // Unassign asset from customer (unassignAssetFromCustomer)
Asset unassignAssetFromEdge(UnassignAssetFromEdgeArgs args) // Unassign asset from edge (unassignAssetFromEdge)
```


## assignAssetToCustomer

**POST** `/api/customer/{customerId}/asset/{assetId}`

Assign asset to customer (assignAssetToCustomer)

Creates assignment of the asset to customer. Customer will be able to query asset afterwards.  Available for users with 'TENANT_ADMIN' authority.

```java
Asset assignAssetToCustomer(AssignAssetToCustomerArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
AssignAssetToCustomerArgs.builder()
        .customerId(String)
        .assetId(String)
        .build()
```

### `AssignAssetToCustomerArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customerId` | `String` | **yes** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `assetId` | `String` | **yes** | A string value representing the asset id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Asset`


## assignAssetToEdge

**POST** `/api/edge/{edgeId}/asset/{assetId}`

Assign asset to edge (assignAssetToEdge)

Creates assignment of an existing asset to an instance of The Edge. Assignment works in async way - first, notification event pushed to edge service queue on platform. Second, remote edge service will receive a copy of assignment asset (Edge will receive this instantly, if it's currently connected, or once it's going to be connected to platform). Third, once asset will be delivered to edge service, it's going to be available for usage on remote edge instance.

```java
Asset assignAssetToEdge(AssignAssetToEdgeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
AssignAssetToEdgeArgs.builder()
        .edgeId(String)
        .assetId(String)
        .build()
```

### `AssignAssetToEdgeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `assetId` | `String` | **yes** | A string value representing the asset id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Asset`


## assignAssetToPublicCustomer

**POST** `/api/customer/public/asset/{assetId}`

Make asset publicly available (assignAssetToPublicCustomer)

Asset will be available for non-authorized (not logged-in) users. This is useful to create dashboards that you plan to share/embed on a publicly available website. However, users that are logged-in and belong to different tenant will not be able to access the asset.  Available for users with 'TENANT_ADMIN' authority.

```java
Asset assignAssetToPublicCustomer(AssignAssetToPublicCustomerArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
AssignAssetToPublicCustomerArgs.builder()
        .assetId(String)
        .build()
```

### `AssignAssetToPublicCustomerArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `assetId` | `String` | **yes** | A string value representing the asset id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Asset`


## deleteAsset

**DELETE** `/api/asset/{assetId}`

Delete asset (deleteAsset)

Deletes the asset and all the relations (from and to the asset). Referencing non-existing asset Id will cause an error.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
void deleteAsset(DeleteAssetArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteAssetArgs.builder()
        .assetId(String)
        .build()
```

### `DeleteAssetArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `assetId` | `String` | **yes** | A string value representing the asset id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## findAssetsByQuery

**POST** `/api/assets`

Find related assets (findAssetsByQuery)

Returns all assets that are related to the specific entity. The entity id, relation type, asset types, depth of the search, and other query parameters defined using complex 'AssetSearchQuery' object. See 'Model' tab of the Parameters for more info.

```java
List<Asset> findAssetsByQuery(FindAssetsByQueryArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
FindAssetsByQueryArgs.builder()
        .assetSearchQuery(AssetSearchQuery)
        .build()
```

### `FindAssetsByQueryArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `assetSearchQuery` | `AssetSearchQuery` | **yes** |  | |

### Return type

`List<Asset>`


## getAssetById

**GET** `/api/asset/{assetId}`

Get Asset (getAssetById)

Fetch the Asset object based on the provided Asset Id. If the user has the authority of 'Tenant Administrator', the server checks that the asset is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the asset is assigned to the same customer.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
Asset getAssetById(GetAssetByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAssetByIdArgs.builder()
        .assetId(String)
        .build()
```

### `GetAssetByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `assetId` | `String` | **yes** | A string value representing the asset id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Asset`


## getAssetInfoById

**GET** `/api/asset/info/{assetId}`

Get Asset Info (getAssetInfoById)

Fetch the Asset Info object based on the provided Asset Id. If the user has the authority of 'Tenant Administrator', the server checks that the asset is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the asset is assigned to the same customer. Asset Info is an extension of the default Asset object that contains information about the assigned customer name.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
AssetInfo getAssetInfoById(GetAssetInfoByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAssetInfoByIdArgs.builder()
        .assetId(String)
        .build()
```

### `GetAssetInfoByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `assetId` | `String` | **yes** | A string value representing the asset id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`AssetInfo`


## getAssetTypes

**GET** `/api/asset/types`

Get Asset Types (getAssetTypes)

Deprecated. See 'getAssetProfileNames' API from Asset Profile Controller instead.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
List<EntitySubtype> getAssetTypes()
```

### Return type

`List<EntitySubtype>`


## getAssetsByIds

**GET** `/api/assets`

Get Assets By Ids (getAssetsByIds)

Requested assets must be owned by tenant or assigned to customer which user is performing the request. 

```java
List<Asset> getAssetsByIds(GetAssetsByIdsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAssetsByIdsArgs.builder()
        .assetIds(List<String>)
        .build()
```

### `GetAssetsByIdsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `assetIds` | `List<String>` | **yes** | A list of assets ids, separated by comma ',' | |

### Return type

`List<Asset>`


## getCustomerAssetInfos

**GET** `/api/customer/{customerId}/assetInfos`

Get Customer Asset Infos (getCustomerAssetInfos)

Returns a page of assets info objects assigned to customer. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. Asset Info is an extension of the default Asset object that contains information about the assigned customer name. 

```java
PageDataAssetInfo getCustomerAssetInfos(GetCustomerAssetInfosArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetCustomerAssetInfosArgs.builder()
        .customerId(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetCustomerAssetInfosArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customerId` | `String` | **yes** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `type` | `String` | no | Asset type | |
| `assetProfileId` | `String` | no | A string value representing the asset profile id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the asset name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `type`, `label`, `customerTitle` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataAssetInfo`


## getCustomerAssets

**GET** `/api/customer/{customerId}/assets`

Get Customer Assets (getCustomerAssets)

Returns a page of assets objects assigned to customer. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. 

```java
PageDataAsset getCustomerAssets(GetCustomerAssetsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetCustomerAssetsArgs.builder()
        .customerId(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetCustomerAssetsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customerId` | `String` | **yes** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `type` | `String` | no | Asset type | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the asset name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `type`, `label`, `customerTitle` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataAsset`


## getEdgeAssets

**GET** `/api/edge/{edgeId}/assets`

Get assets assigned to edge (getEdgeAssets)

Returns a page of assets assigned to edge. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. 

```java
PageDataAsset getEdgeAssets(GetEdgeAssetsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetEdgeAssetsArgs.builder()
        .edgeId(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetEdgeAssetsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `type` | `String` | no | Asset type | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the asset name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `type`, `label`, `customerTitle` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |
| `startTime` | `Long` | no | Timestamp. Assets with creation time before it won't be queried | |
| `endTime` | `Long` | no | Timestamp. Assets with creation time after it won't be queried | |

### Return type

`PageDataAsset`


## getTenantAssetByName

**GET** `/api/tenant/asset`

Get Tenant Asset (getTenantAssetByName)

Requested asset must be owned by tenant that the user belongs to. Asset name is an unique property of asset. So it can be used to identify the asset.  Available for users with 'TENANT_ADMIN' authority.

```java
Asset getTenantAssetByName(GetTenantAssetByNameArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetTenantAssetByNameArgs.builder()
        .assetName(String)
        .build()
```

### `GetTenantAssetByNameArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `assetName` | `String` | **yes** | A string value representing the Asset name. | |

### Return type

`Asset`


## getTenantAssetInfos

**GET** `/api/tenant/assetInfos`

Get Tenant Asset Infos (getTenantAssetInfos)

Returns a page of assets info objects owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. Asset Info is an extension of the default Asset object that contains information about the assigned customer name.   Available for users with 'TENANT_ADMIN' authority.

```java
PageDataAssetInfo getTenantAssetInfos(GetTenantAssetInfosArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetTenantAssetInfosArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetTenantAssetInfosArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `type` | `String` | no | Asset type | |
| `assetProfileId` | `String` | no | A string value representing the asset profile id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the asset name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `type`, `label`, `customerTitle` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataAssetInfo`


## getTenantAssets

**GET** `/api/tenant/assets`

Get Tenant Assets (getTenantAssets)

Returns a page of assets owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.

```java
PageDataAsset getTenantAssets(GetTenantAssetsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetTenantAssetsArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetTenantAssetsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `type` | `String` | no | Asset type | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the asset name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `type`, `label`, `customerTitle` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataAsset`


## processAssetBulkImport

**POST** `/api/asset/bulk_import`

Import the bulk of assets (processAssetBulkImport)

There's an ability to import the bulk of assets using the only .csv file.

```java
BulkImportResultAsset processAssetBulkImport(ProcessAssetBulkImportArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ProcessAssetBulkImportArgs.builder()
        .bulkImportRequest(BulkImportRequest)
        .build()
```

### `ProcessAssetBulkImportArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `bulkImportRequest` | `BulkImportRequest` | **yes** |  | |

### Return type

`BulkImportResultAsset`


## saveAsset

**POST** `/api/asset`

Create Or Update Asset (saveAsset)

Creates or Updates the Asset. When creating asset, platform generates Asset Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Asset id will be present in the response. Specify existing Asset id to update the asset. Referencing non-existing Asset Id will cause 'Not Found' error. Remove 'id', 'tenantId' and optionally 'customerId' from the request body example (below) to create new Asset entity.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
Asset saveAsset(SaveAssetArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveAssetArgs.builder()
        .asset(Asset)
        .build()
```

### `SaveAssetArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `asset` | `Asset` | **yes** | A JSON value representing the asset. | |
| `nameConflictPolicy` | `NameConflictPolicy` | no | Optional value of name conflict policy. Possible values: FAIL or UNIQUIFY.  If omitted, FAIL policy is applied. FAIL policy implies exception will be thrown if an entity with the same name already exists.  UNIQUIFY policy appends a suffix to the entity name, if a name conflict occurs. | default: `FAIL` enum: `FAIL`, `UNIQUIFY` |
| `uniquifySeparator` | `String` | no | Optional value of name suffix separator used by UNIQUIFY policy. By default, underscore separator is used. For example, strategy is UNIQUIFY, separator is '-'; if a name conflict occurs for entity name 'test-name', created entity will have name like 'test-name-7fsh4f'. | default: `_` |
| `uniquifyStrategy` | `UniquifyStrategy` | no | Optional value of uniquify strategy used by UNIQUIFY policy. Possible values: RANDOM or INCREMENTAL. By default, RANDOM strategy is used, which means random alphanumeric string will be added as a suffix to entity name. INCREMENTAL implies the first possible number starting from 1 will be added as a name suffix. For example, strategy is UNIQUIFY, uniquify strategy is INCREMENTAL; if a name conflict occurs for entity name 'test-name', created entity will have name like 'test-name-1. | default: `RANDOM` enum: `RANDOM`, `INCREMENTAL` |

### Return type

`Asset`


## unassignAssetFromCustomer

**DELETE** `/api/customer/asset/{assetId}`

Unassign asset from customer (unassignAssetFromCustomer)

Clears assignment of the asset to customer. Customer will not be able to query asset afterwards.  Available for users with 'TENANT_ADMIN' authority.

```java
Asset unassignAssetFromCustomer(UnassignAssetFromCustomerArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UnassignAssetFromCustomerArgs.builder()
        .assetId(String)
        .build()
```

### `UnassignAssetFromCustomerArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `assetId` | `String` | **yes** | A string value representing the asset id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Asset`


## unassignAssetFromEdge

**DELETE** `/api/edge/{edgeId}/asset/{assetId}`

Unassign asset from edge (unassignAssetFromEdge)

Clears assignment of the asset to the edge. Unassignment works in async way - first, 'unassign' notification event pushed to edge queue on platform. Second, remote edge service will receive an 'unassign' command to remove asset (Edge will receive this instantly, if it's currently connected, or once it's going to be connected to platform). Third, once 'unassign' command will be delivered to edge service, it's going to remove asset locally.

```java
Asset unassignAssetFromEdge(UnassignAssetFromEdgeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UnassignAssetFromEdgeArgs.builder()
        .edgeId(String)
        .assetId(String)
        .build()
```

### `UnassignAssetFromEdgeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `assetId` | `String` | **yes** | A string value representing the asset id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Asset`


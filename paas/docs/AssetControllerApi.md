# AssetControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void deleteAsset(DeleteAssetArgs args) // Delete asset (deleteAsset)
List<Asset> findAssetsByQuery(FindAssetsByQueryArgs args) // Find related assets (findAssetsByQuery)
PageDataAssetInfo getAllAssetInfos(GetAllAssetInfosArgs args) // Get All Asset Infos for current user (getAllAssetInfos)
Asset getAssetById(GetAssetByIdArgs args) // Get Asset (getAssetById)
AssetInfo getAssetInfoById(GetAssetInfoByIdArgs args) // Get Asset Info (getAssetInfoById)
List<EntitySubtype> getAssetTypes() // Get Asset Types (getAssetTypes)
PageDataAsset getAssetsByEntityGroupId(GetAssetsByEntityGroupIdArgs args) // Get assets by Entity Group Id (getAssetsByEntityGroupId)
List<Asset> getAssetsByIds(GetAssetsByIdsArgs args) // Get Assets By Ids (getAssetsByIds)
PageDataAssetInfo getCustomerAssetInfos(GetCustomerAssetInfosArgs args) // Get Customer Asset Infos (getCustomerAssetInfos)
PageDataAsset getCustomerAssets(GetCustomerAssetsArgs args) // Get Customer Assets (getCustomerAssets)
Asset getTenantAssetByName(GetTenantAssetByNameArgs args) // Get Tenant Asset (getTenantAssetByName)
PageDataAsset getTenantAssets(GetTenantAssetsArgs args) // Get Tenant Assets (getTenantAssets)
PageDataAsset getUserAssets(GetUserAssetsArgs args) // Get Assets (getUserAssets)
BulkImportResultAsset processAssetBulkImport(ProcessAssetBulkImportArgs args) // Import the bulk of assets (processAssetsBulkImport)
Asset saveAsset(SaveAssetArgs args) // Create Or Update Asset (saveAsset)
```


## deleteAsset

**DELETE** `/api/asset/{assetId}`

Delete asset (deleteAsset)

Deletes the asset and all the relations (from and to the asset). Referencing non-existing asset Id will cause an error.   Security check is performed to verify that the user has 'DELETE' permission for the entity (entities).

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

Returns all assets that are related to the specific entity. The entity id, relation type, asset types, depth of the search, and other query parameters defined using complex 'AssetSearchQuery' object. See 'Model' tab of the Parameters for more info.    Security check is performed to verify that the user has 'READ' permission for the entity (entities).

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


## getAllAssetInfos

**GET** `/api/assetInfos/all`

Get All Asset Infos for current user (getAllAssetInfos)

Returns a page of asset info objects owned by the tenant or the customer of a current user. Asset Info is an extension of the default Asset object that contains information about the owner name.  You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
PageDataAssetInfo getAllAssetInfos(GetAllAssetInfosArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAllAssetInfosArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetAllAssetInfosArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `includeCustomers` | `Boolean` | no | Include customer or sub-customer entities | |
| `assetProfileId` | `String` | no | A string value representing the asset profile id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the asset name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `type`, `label`, `customerTitle` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataAssetInfo`


## getAssetById

**GET** `/api/asset/{assetId}`

Get Asset (getAssetById)

Fetch the Asset object based on the provided Asset Id. If the user has the authority of 'Tenant Administrator', the server checks that the asset is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the asset is assigned to the same customer.   Security check is performed to verify that the user has 'READ' permission for the entity (entities).

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

Fetch the Asset Info object based on the provided Asset Id. If the user has the authority of 'Tenant Administrator', the server checks that the asset is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the asset is assigned to the same customer.Asset Info is an extension of the default Asset object that contains information about the owner name.    Security check is performed to verify that the user has 'READ' permission for the entity (entities).

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


## getAssetsByEntityGroupId

**GET** `/api/entityGroup/{entityGroupId}/assets`

Get assets by Entity Group Id (getAssetsByEntityGroupId)

Returns a page of asset objects that belongs to specified Entity Group Id. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.    Security check is performed to verify that the user has 'READ' permission for specified group.

```java
PageDataAsset getAssetsByEntityGroupId(GetAssetsByEntityGroupIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAssetsByEntityGroupIdArgs.builder()
        .entityGroupId(String)
        .pageSize(String)
        .page(String)
        .build()
```

### `GetAssetsByEntityGroupIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityGroupId` | `String` | **yes** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `String` | **yes** | Maximum amount of entities in a one page | |
| `page` | `String` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the asset name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `type`, `label`, `customerTitle` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataAsset`


## getAssetsByIds

**GET** `/api/assets`

Get Assets By Ids (getAssetsByIds)

Requested assets must be owned by tenant or assigned to customer which user is performing the request.    Security check is performed to verify that the user has 'READ' permission for the entity (entities).

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
| `assetIds` | `List<String>` | **yes** | A list of asset ids, separated by comma ',' | |

### Return type

`List<Asset>`


## getCustomerAssetInfos

**GET** `/api/customer/{customerId}/assetInfos`

Get Customer Asset Infos (getCustomerAssetInfos)

Returns a page of asset info objects owned by the specified customer. Asset Info is an extension of the default Asset object that contains information about the owner name.  You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).

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
| `includeCustomers` | `Boolean` | no | Include customer or sub-customer entities | |
| `assetProfileId` | `String` | no | A string value representing the asset profile id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the asset name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `type`, `label`, `customerTitle` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataAssetInfo`


## getCustomerAssets

**GET** `/api/customer/{customerId}/assets`

Get Customer Assets (getCustomerAssets)

Returns a page of assets objects owned by customer. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.    Security check is performed to verify that the user has 'READ' permission for the entity (entities).

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


## getTenantAssetByName

**GET** `/api/tenant/asset`

Get Tenant Asset (getTenantAssetByName)

Requested asset must be owned by tenant that the user belongs to. Asset name is an unique property of asset. So it can be used to identify the asset.   Security check is performed to verify that the user has 'READ' permission for the entity (entities).

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


## getTenantAssets

**GET** `/api/tenant/assets`

Get Tenant Assets (getTenantAssets)

Returns a page of assets owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.    Security check is performed to verify that the user has 'READ' permission for the entity (entities).

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


## getUserAssets

**GET** `/api/user/assets`

Get Assets (getUserAssets)

Returns a page of assets objects available for the current user. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. Asset Info is an extension of the default Asset object that contains information about the owner name.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
PageDataAsset getUserAssets(GetUserAssetsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetUserAssetsArgs.builder()
        .pageSize(String)
        .page(String)
        .build()
```

### `GetUserAssetsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `String` | **yes** | Maximum amount of entities in a one page | |
| `page` | `String` | **yes** | Sequence number of page starting from 0 | |
| `type` | `String` | no | Asset type | |
| `assetProfileId` | `String` | no | A string value representing the asset profile id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the asset name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `type`, `label`, `customerTitle` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataAsset`


## processAssetBulkImport

**POST** `/api/asset/bulk_import`

Import the bulk of assets (processAssetsBulkImport)

There's an ability to import the bulk of assets using the only .csv file.   Security check is performed to verify that the user has 'WRITE' permission for the entity (entities).

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

Creates or Updates the Asset. When creating asset, platform generates Asset Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Asset id will be present in the response. Specify existing Asset id to update the asset. Referencing non-existing Asset Id will cause 'Not Found' error. Remove 'id', 'tenantId' and optionally 'customerId' from the request body example (below) to create new Asset entity.    Security check is performed to verify that the user has 'WRITE' permission for the entity (entities).

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
| `entityGroupId` | `String` | no | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9'. If specified, the entity will be added to the corresponding entity group. | |
| `entityGroupIds` | `List<String>` | no | A list of string values, separated by comma ',' representing the Entity Group Ids. For example, '784f394c-42b6-435a-983c-b7beff2784f9','a84f394c-42b6-435a-083c-b7beff2784f9'. If specified, the entity will be added to the corresponding entity groups. | |
| `nameConflictPolicy` | `NameConflictPolicy` | no | Optional value of name conflict policy. Possible values: FAIL or UNIQUIFY.  If omitted, FAIL policy is applied. FAIL policy implies exception will be thrown if an entity with the same name already exists.  UNIQUIFY policy appends a suffix to the entity name, if a name conflict occurs. | default: `FAIL` enum: `FAIL`, `UNIQUIFY` |
| `uniquifySeparator` | `String` | no | Optional value of name suffix separator used by UNIQUIFY policy. By default, underscore separator is used. For example, strategy is UNIQUIFY, separator is '-'; if a name conflict occurs for entity name 'test-name', created entity will have name like 'test-name-7fsh4f'. | default: `_` |
| `uniquifyStrategy` | `UniquifyStrategy` | no | Optional value of uniquify strategy used by UNIQUIFY policy. Possible values: RANDOM or INCREMENTAL. By default, RANDOM strategy is used, which means random alphanumeric string will be added as a suffix to entity name. INCREMENTAL implies the first possible number starting from 1 will be added as a name suffix. For example, strategy is UNIQUIFY, uniquify strategy is INCREMENTAL; if a name conflict occurs for entity name 'test-name', created entity will have name like 'test-name-1. | default: `RANDOM` enum: `RANDOM`, `INCREMENTAL` |

### Return type

`Asset`


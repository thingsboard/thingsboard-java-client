# AssetProfileControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void deleteAssetProfile(DeleteAssetProfileArgs args) // Delete asset profile (deleteAssetProfile)
AssetProfile getAssetProfileById(GetAssetProfileByIdArgs args) // Get Asset Profile (getAssetProfileById)
AssetProfileInfo getAssetProfileInfoById(GetAssetProfileInfoByIdArgs args) // Get Asset Profile Info (getAssetProfileInfoById)
PageDataAssetProfileInfo getAssetProfileInfos(GetAssetProfileInfosArgs args) // Get Asset Profile infos (getAssetProfileInfos)
List<EntityInfo> getAssetProfileNames(GetAssetProfileNamesArgs args) // Get Asset Profile names (getAssetProfileNames)
PageDataAssetProfile getAssetProfiles(GetAssetProfilesArgs args) // Get Asset Profiles (getAssetProfiles)
List<AssetProfileInfo> getAssetProfilesByIds(GetAssetProfilesByIdsArgs args) // Get Asset Profiles By Ids (getAssetProfilesByIds)
AssetProfileInfo getDefaultAssetProfileInfo() // Get Default Asset Profile (getDefaultAssetProfileInfo)
AssetProfile saveAssetProfile(SaveAssetProfileArgs args) // Create Or Update Asset Profile (saveAssetProfile)
AssetProfile setDefaultAssetProfile(SetDefaultAssetProfileArgs args) // Make Asset Profile Default (setDefaultAssetProfile)
```


## deleteAssetProfile

**DELETE** `/api/assetProfile/{assetProfileId}`

Delete asset profile (deleteAssetProfile)

Deletes the asset profile. Referencing non-existing asset profile Id will cause an error. Can't delete the asset profile if it is referenced by existing assets.  Available for users with 'TENANT_ADMIN' authority.

```java
void deleteAssetProfile(DeleteAssetProfileArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteAssetProfileArgs.builder()
        .assetProfileId(String)
        .build()
```

### `DeleteAssetProfileArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `assetProfileId` | `String` | **yes** | A string value representing the asset profile id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## getAssetProfileById

**GET** `/api/assetProfile/{assetProfileId}`

Get Asset Profile (getAssetProfileById)

Fetch the Asset Profile object based on the provided Asset Profile Id. The server checks that the asset profile is owned by the same tenant.   Available for users with 'TENANT_ADMIN' authority.

```java
AssetProfile getAssetProfileById(GetAssetProfileByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAssetProfileByIdArgs.builder()
        .assetProfileId(String)
        .build()
```

### `GetAssetProfileByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `assetProfileId` | `String` | **yes** | A string value representing the asset profile id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `inlineImages` | `Boolean` | no | Inline images as a data URL (Base64) | |

### Return type

`AssetProfile`


## getAssetProfileInfoById

**GET** `/api/assetProfileInfo/{assetProfileId}`

Get Asset Profile Info (getAssetProfileInfoById)

Fetch the Asset Profile Info object based on the provided Asset Profile Id. Asset Profile Info is a lightweight object that includes main information about Asset Profile.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
AssetProfileInfo getAssetProfileInfoById(GetAssetProfileInfoByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAssetProfileInfoByIdArgs.builder()
        .assetProfileId(String)
        .build()
```

### `GetAssetProfileInfoByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `assetProfileId` | `String` | **yes** | A string value representing the asset profile id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`AssetProfileInfo`


## getAssetProfileInfos

**GET** `/api/assetProfileInfos`

Get Asset Profile infos (getAssetProfileInfos)

Returns a page of asset profile info objects owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. Asset Profile Info is a lightweight object that includes main information about Asset Profile.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
PageDataAssetProfileInfo getAssetProfileInfos(GetAssetProfileInfosArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAssetProfileInfosArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetAssetProfileInfosArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the asset profile name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `description`, `isDefault` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataAssetProfileInfo`


## getAssetProfileNames

**GET** `/api/assetProfile/names`

Get Asset Profile names (getAssetProfileNames)

Returns a set of unique asset profile names owned by the tenant.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
List<EntityInfo> getAssetProfileNames(GetAssetProfileNamesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAssetProfileNamesArgs.builder()
        .build()
```

### `GetAssetProfileNamesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `activeOnly` | `Boolean` | no | Flag indicating whether to retrieve exclusively the names of asset profiles that are referenced by tenant's assets. | default: `false` |

### Return type

`List<EntityInfo>`


## getAssetProfiles

**GET** `/api/assetProfiles`

Get Asset Profiles (getAssetProfiles)

Returns a page of asset profile objects owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.

```java
PageDataAssetProfile getAssetProfiles(GetAssetProfilesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAssetProfilesArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetAssetProfilesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the asset profile name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `description`, `isDefault` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataAssetProfile`


## getAssetProfilesByIds

**GET** `/api/assetProfileInfos/list`

Get Asset Profiles By Ids (getAssetProfilesByIds)

Requested asset profiles must be owned by tenant which is performing the request.    Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
List<AssetProfileInfo> getAssetProfilesByIds(GetAssetProfilesByIdsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAssetProfilesByIdsArgs.builder()
        .assetProfileIds(List<String>)
        .build()
```

### `GetAssetProfilesByIdsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `assetProfileIds` | `List<String>` | **yes** | A list of asset profile ids, separated by comma ',' | |

### Return type

`List<AssetProfileInfo>`


## getDefaultAssetProfileInfo

**GET** `/api/assetProfileInfo/default`

Get Default Asset Profile (getDefaultAssetProfileInfo)

Fetch the Default Asset Profile Info object. Asset Profile Info is a lightweight object that includes main information about Asset Profile.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
AssetProfileInfo getDefaultAssetProfileInfo()
```

### Return type

`AssetProfileInfo`


## saveAssetProfile

**POST** `/api/assetProfile`

Create Or Update Asset Profile (saveAssetProfile)

Create or update the Asset Profile. When creating asset profile, platform generates asset profile id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created asset profile id will be present in the response. Specify existing asset profile id to update the asset profile. Referencing non-existing asset profile Id will cause 'Not Found' error.   Asset profile name is unique in the scope of tenant. Only one 'default' asset profile may exist in scope of tenant. Remove 'id', 'tenantId' from the request body example (below) to create new Asset Profile entity.   Available for users with 'TENANT_ADMIN' authority.

```java
AssetProfile saveAssetProfile(SaveAssetProfileArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveAssetProfileArgs.builder()
        .assetProfile(AssetProfile)
        .build()
```

### `SaveAssetProfileArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `assetProfile` | `AssetProfile` | **yes** |  | |

### Return type

`AssetProfile`


## setDefaultAssetProfile

**POST** `/api/assetProfile/{assetProfileId}/default`

Make Asset Profile Default (setDefaultAssetProfile)

Marks asset profile as default within a tenant scope.  Available for users with 'TENANT_ADMIN' authority.

```java
AssetProfile setDefaultAssetProfile(SetDefaultAssetProfileArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SetDefaultAssetProfileArgs.builder()
        .assetProfileId(String)
        .build()
```

### `SetDefaultAssetProfileArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `assetProfileId` | `String` | **yes** | A string value representing the asset profile id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`AssetProfile`


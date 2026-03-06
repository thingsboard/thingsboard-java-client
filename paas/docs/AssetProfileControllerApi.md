# AssetProfileControllerApi

`ThingsboardClient` methods:

```
void deleteAssetProfile(@Nonnull String assetProfileId) // Delete asset profile (deleteAssetProfile)
AssetProfile getAssetProfileById(@Nonnull String assetProfileId, @Nullable Boolean inlineImages) // Get Asset Profile (getAssetProfileById)
AssetProfileInfo getAssetProfileInfoById(@Nonnull String assetProfileId) // Get Asset Profile Info (getAssetProfileInfoById)
PageDataAssetProfileInfo getAssetProfileInfos(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get Asset Profile infos (getAssetProfileInfos)
List<EntityInfo> getAssetProfileNames(@Nullable Boolean activeOnly) // Get Asset Profile names (getAssetProfileNames)
PageDataAssetProfile getAssetProfiles(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get Asset Profiles (getAssetProfiles)
List<AssetProfileInfo> getAssetProfilesByIds(@Nonnull List<String> assetProfileIds) // Get Asset Profiles By Ids (getAssetProfilesByIds)
AssetProfileInfo getDefaultAssetProfileInfo() // Get Default Asset Profile (getDefaultAssetProfileInfo)
AssetProfile saveAssetProfile(@Nonnull AssetProfile assetProfile) // Create Or Update Asset Profile (saveAssetProfile)
AssetProfile setDefaultAssetProfile(@Nonnull String assetProfileId) // Make Asset Profile Default (setDefaultAssetProfile)
```


## deleteAssetProfile

```
void deleteAssetProfile(@Nonnull String assetProfileId)
```

**DELETE** `/api/assetProfile/{assetProfileId}`

Delete asset profile (deleteAssetProfile)

Deletes the asset profile. Referencing non-existing asset profile Id will cause an error. Can't delete the asset profile if it is referenced by existing assets.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetProfileId** | **String** | A string value representing the asset profile id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## getAssetProfileById

```
AssetProfile getAssetProfileById(@Nonnull String assetProfileId, @Nullable Boolean inlineImages)
```

**GET** `/api/assetProfile/{assetProfileId}`

Get Asset Profile (getAssetProfileById)

Fetch the Asset Profile object based on the provided Asset Profile Id. The server checks that the asset profile is owned by the same tenant.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetProfileId** | **String** | A string value representing the asset profile id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **inlineImages** | **Boolean** | Inline images as a data URL (Base64) | [optional] |

### Return type

**AssetProfile**


## getAssetProfileInfoById

```
AssetProfileInfo getAssetProfileInfoById(@Nonnull String assetProfileId)
```

**GET** `/api/assetProfileInfo/{assetProfileId}`

Get Asset Profile Info (getAssetProfileInfoById)

Fetch the Asset Profile Info object based on the provided Asset Profile Id. Asset Profile Info is a lightweight object that includes main information about Asset Profile.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetProfileId** | **String** | A string value representing the asset profile id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**AssetProfileInfo**


## getAssetProfileInfos

```
PageDataAssetProfileInfo getAssetProfileInfos(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/assetProfileInfos`

Get Asset Profile infos (getAssetProfileInfos)

Returns a page of asset profile info objects owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. Asset Profile Info is a lightweight object that includes main information about Asset Profile.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the asset profile name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, description, isDefault] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataAssetProfileInfo**


## getAssetProfileNames

```
List<EntityInfo> getAssetProfileNames(@Nullable Boolean activeOnly)
```

**GET** `/api/assetProfile/names`

Get Asset Profile names (getAssetProfileNames)

Returns a set of unique asset profile names owned by the tenant.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **activeOnly** | **Boolean** | Flag indicating whether to retrieve exclusively the names of asset profiles that are referenced by tenant's assets. | [optional] [default to false] |

### Return type

**List<EntityInfo>**


## getAssetProfiles

```
PageDataAssetProfile getAssetProfiles(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/assetProfiles`

Get Asset Profiles (getAssetProfiles)

Returns a page of asset profile objects owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the asset profile name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, description, isDefault] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataAssetProfile**


## getAssetProfilesByIds

```
List<AssetProfileInfo> getAssetProfilesByIds(@Nonnull List<String> assetProfileIds)
```

**GET** `/api/assetProfileInfos/list`

Get Asset Profiles By Ids (getAssetProfilesByIds)

Requested asset profiles must be owned by tenant which is performing the request.    Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetProfileIds** | **List<String>** | A list of asset profile ids, separated by comma ',' | |

### Return type

**List<AssetProfileInfo>**


## getDefaultAssetProfileInfo

```
AssetProfileInfo getDefaultAssetProfileInfo()
```

**GET** `/api/assetProfileInfo/default`

Get Default Asset Profile (getDefaultAssetProfileInfo)

Fetch the Default Asset Profile Info object. Asset Profile Info is a lightweight object that includes main information about Asset Profile.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

### Return type

**AssetProfileInfo**


## saveAssetProfile

```
AssetProfile saveAssetProfile(@Nonnull AssetProfile assetProfile)
```

**POST** `/api/assetProfile`

Create Or Update Asset Profile (saveAssetProfile)

Create or update the Asset Profile. When creating asset profile, platform generates asset profile id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created asset profile id will be present in the response. Specify existing asset profile id to update the asset profile. Referencing non-existing asset profile Id will cause 'Not Found' error.   Asset profile name is unique in the scope of tenant. Only one 'default' asset profile may exist in scope of tenant. Remove 'id', 'tenantId' from the request body example (below) to create new Asset Profile entity.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetProfile** | **AssetProfile** |  | |

### Return type

**AssetProfile**


## setDefaultAssetProfile

```
AssetProfile setDefaultAssetProfile(@Nonnull String assetProfileId)
```

**POST** `/api/assetProfile/{assetProfileId}/default`

Make Asset Profile Default (setDefaultAssetProfile)

Marks asset profile as default within a tenant scope.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetProfileId** | **String** | A string value representing the asset profile id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**AssetProfile**


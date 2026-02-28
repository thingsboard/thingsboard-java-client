# AssetProfileControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteAssetProfile**](#deleteAssetProfile) | **DELETE** /api/assetProfile/{assetProfileId} | Delete asset profile (deleteAssetProfile) |
| [**getAssetProfileById**](#getAssetProfileById) | **GET** /api/assetProfile/{assetProfileId} | Get Asset Profile (getAssetProfileById) |
| [**getAssetProfileInfoById**](#getAssetProfileInfoById) | **GET** /api/assetProfileInfo/{assetProfileId} | Get Asset Profile Info (getAssetProfileInfoById) |
| [**getAssetProfileInfos**](#getAssetProfileInfos) | **GET** /api/assetProfileInfos | Get Asset Profile infos (getAssetProfileInfos) |
| [**getAssetProfileNames**](#getAssetProfileNames) | **GET** /api/assetProfile/names | Get Asset Profile names (getAssetProfileNames) |
| [**getAssetProfiles**](#getAssetProfiles) | **GET** /api/assetProfiles | Get Asset Profiles (getAssetProfiles) |
| [**getAssetProfilesByIdsV2**](#getAssetProfilesByIdsV2) | **GET** /api/assetProfileInfos/list | Get Asset Profiles By Ids (getAssetProfilesByIdsV2) |
| [**getDefaultAssetProfileInfo**](#getDefaultAssetProfileInfo) | **GET** /api/assetProfileInfo/default | Get Default Asset Profile (getDefaultAssetProfileInfo) |
| [**saveAssetProfile**](#saveAssetProfile) | **POST** /api/assetProfile | Create Or Update Asset Profile (saveAssetProfile) |
| [**setDefaultAssetProfile**](#setDefaultAssetProfile) | **POST** /api/assetProfile/{assetProfileId}/default | Make Asset Profile Default (setDefaultAssetProfile) |



## deleteAssetProfile

> deleteAssetProfile(assetProfileId)

Delete asset profile (deleteAssetProfile)

Deletes the asset profile. Referencing non-existing asset profile Id will cause an error. Can&#39;t delete the asset profile if it is referenced by existing assets.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetProfileId** | **String** | A string value representing the asset profile id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## getAssetProfileById

> AssetProfile getAssetProfileById(assetProfileId, inlineImages)

Get Asset Profile (getAssetProfileById)

Fetch the Asset Profile object based on the provided Asset Profile Id. The server checks that the asset profile is owned by the same tenant.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetProfileId** | **String** | A string value representing the asset profile id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **inlineImages** | **Boolean** | Inline images as a data URL (Base64) | [optional] |


## getAssetProfileInfoById

> AssetProfileInfo getAssetProfileInfoById(assetProfileId)

Get Asset Profile Info (getAssetProfileInfoById)

Fetch the Asset Profile Info object based on the provided Asset Profile Id. Asset Profile Info is a lightweight object that includes main information about Asset Profile.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetProfileId** | **String** | A string value representing the asset profile id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## getAssetProfileInfos

> PageDataAssetProfileInfo getAssetProfileInfos(pageSize, page, textSearch, sortProperty, sortOrder)

Get Asset Profile infos (getAssetProfileInfos)

Returns a page of asset profile info objects owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. Asset Profile Info is a lightweight object that includes main information about Asset Profile.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive &#39;substring&#39; filter based on the asset profile name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, description, isDefault] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |


## getAssetProfileNames

> List&lt;EntityInfo&gt; getAssetProfileNames(activeOnly)

Get Asset Profile names (getAssetProfileNames)

Returns a set of unique asset profile names owned by the tenant.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **activeOnly** | **Boolean** | Flag indicating whether to retrieve exclusively the names of asset profiles that are referenced by tenant&#39;s assets. | [optional] [default to false] |


## getAssetProfiles

> PageDataAssetProfile getAssetProfiles(pageSize, page, textSearch, sortProperty, sortOrder)

Get Asset Profiles (getAssetProfiles)

Returns a page of asset profile objects owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive &#39;substring&#39; filter based on the asset profile name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, description, isDefault] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |


## getAssetProfilesByIdsV2

> List&lt;AssetProfileInfo&gt; getAssetProfilesByIdsV2(assetProfileIds)

Get Asset Profiles By Ids (getAssetProfilesByIdsV2)

Requested asset profiles must be owned by tenant which is performing the request.   

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetProfileIds** | **List&lt;String&gt;** | A list of asset profile ids, separated by comma &#39;,&#39; | |


## getDefaultAssetProfileInfo

> AssetProfileInfo getDefaultAssetProfileInfo()

Get Default Asset Profile (getDefaultAssetProfileInfo)

Fetch the Default Asset Profile Info object. Asset Profile Info is a lightweight object that includes main information about Asset Profile.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

## saveAssetProfile

> AssetProfile saveAssetProfile(assetProfile)

Create Or Update Asset Profile (saveAssetProfile)

Create or update the Asset Profile. When creating asset profile, platform generates asset profile id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created asset profile id will be present in the response. Specify existing asset profile id to update the asset profile. Referencing non-existing asset profile Id will cause &#39;Not Found&#39; error.   Asset profile name is unique in the scope of tenant. Only one &#39;default&#39; asset profile may exist in scope of tenant. Remove &#39;id&#39;, &#39;tenantId&#39; from the request body example (below) to create new Asset Profile entity.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetProfile** | **AssetProfile** |  | |


## setDefaultAssetProfile

> AssetProfile setDefaultAssetProfile(assetProfileId)

Make Asset Profile Default (setDefaultAssetProfile)

Marks asset profile as default within a tenant scope.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetProfileId** | **String** | A string value representing the asset profile id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


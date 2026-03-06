# MobileAppControllerApi

`ThingsboardClient` methods:

```
void deleteMobileApp(@Nonnull UUID id) // Delete Mobile App by ID (deleteMobileApp)
LoginMobileInfo getLoginMobileInfo(@Nonnull String pkgName, @Nonnull String platform) // Get mobile app login info (getLoginMobileInfo)
MobileApp getMobileAppById(@Nonnull UUID id) // Get mobile info by id (getMobileAppById)
PageDataMobileApp getTenantMobileApps(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable PlatformType platformType, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get mobile app infos (getTenantMobileApps)
UserMobileInfo getUserMobileInfo(@Nonnull String pkgName, @Nonnull String platform) // Get user mobile app basic info (getUserMobileInfo)
MobileApp saveMobileApp(@Nonnull MobileApp mobileApp) // Save Or update Mobile app (saveMobileApp)
```


## deleteMobileApp

```
void deleteMobileApp(@Nonnull UUID id)
```

**DELETE** `/api/mobile/app/{id}`

Delete Mobile App by ID (deleteMobileApp)

Deletes Mobile App by ID. Referencing non-existing mobile app Id will cause an error.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |

### Return type

null (empty response body)


## getLoginMobileInfo

```
LoginMobileInfo getLoginMobileInfo(@Nonnull String pkgName, @Nonnull String platform)
```

**GET** `/api/noauth/mobile`

Get mobile app login info (getLoginMobileInfo)


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pkgName** | **String** | Mobile application package name | |
| **platform** | **String** | Platform type | [enum: ANDROID, IOS] |

### Return type

**LoginMobileInfo**


## getMobileAppById

```
MobileApp getMobileAppById(@Nonnull UUID id)
```

**GET** `/api/mobile/app/{id}`

Get mobile info by id (getMobileAppById)

  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |

### Return type

**MobileApp**


## getTenantMobileApps

```
PageDataMobileApp getTenantMobileApps(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable PlatformType platformType, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/mobile/app`

Get mobile app infos (getTenantMobileApps)

  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **platformType** | **PlatformType** | Platform type: ANDROID or IOS | [optional] [enum: WEB, ANDROID, IOS] |
| **textSearch** | **String** | Case-insensitive 'substring' filter based on app's name | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] |

### Return type

**PageDataMobileApp**


## getUserMobileInfo

```
UserMobileInfo getUserMobileInfo(@Nonnull String pkgName, @Nonnull String platform)
```

**GET** `/api/mobile`

Get user mobile app basic info (getUserMobileInfo)

  Available for any authorized user. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pkgName** | **String** | Mobile application package name | |
| **platform** | **String** | Platform type | [enum: ANDROID, IOS] |

### Return type

**UserMobileInfo**


## saveMobileApp

```
MobileApp saveMobileApp(@Nonnull MobileApp mobileApp)
```

**POST** `/api/mobile/app`

Save Or update Mobile app (saveMobileApp)

Create or update the Mobile app. When creating mobile app, platform generates Mobile App Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Mobile App Id will be present in the response. Specify existing Mobile App Id to update the mobile app. Referencing non-existing Mobile App Id will cause 'Not Found' error.  The pair of mobile app package name and platform type is unique for entire platform setup.    Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **mobileApp** | **MobileApp** |  | |

### Return type

**MobileApp**


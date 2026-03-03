# MobileAppBundleControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteMobileAppBundle**](#deleteMobileAppBundle) | **DELETE** /api/mobile/bundle/{id} | Delete Mobile App Bundle by ID (deleteMobileAppBundle) |
| [**getMobileAppBundleInfoById**](#getMobileAppBundleInfoById) | **GET** /api/mobile/bundle/info/{id} | Get mobile app bundle info by id (getMobileAppBundleInfoById) |
| [**getTenantMobileAppBundleInfos**](#getTenantMobileAppBundleInfos) | **GET** /api/mobile/bundle/infos | Get mobile app bundle infos (getTenantMobileAppBundleInfos) |
| [**saveMobileAppBundle**](#saveMobileAppBundle) | **POST** /api/mobile/bundle | Save Or update Mobile app bundle (saveMobileAppBundle) |
| [**updateMobileAppBundleOauth2Clients**](#updateMobileAppBundleOauth2Clients) | **PUT** /api/mobile/bundle/{id}/oauth2Clients | Update oauth2 clients (updateMobileAppBundleOauth2Clients) |



## deleteMobileAppBundle

> deleteMobileAppBundle(id)

Delete Mobile App Bundle by ID (deleteMobileAppBundle)

Deletes Mobile App Bundle by ID. Referencing non-existing mobile app bundle Id will cause an error.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |

### Return type

null (empty response body)


## getMobileAppBundleInfoById

> MobileAppBundleInfo getMobileAppBundleInfoById(id)

Get mobile app bundle info by id (getMobileAppBundleInfoById)

  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |

### Return type

**MobileAppBundleInfo**


## getTenantMobileAppBundleInfos

> PageDataMobileAppBundleInfo getTenantMobileAppBundleInfos(pageSize, page, textSearch, sortProperty, sortOrder)

Get mobile app bundle infos (getTenantMobileAppBundleInfos)

  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | Case-insensitive 'substring' filter based on app's name | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] |

### Return type

**PageDataMobileAppBundleInfo**


## saveMobileAppBundle

> MobileAppBundle saveMobileAppBundle(mobileAppBundle, oauth2ClientIds)

Save Or update Mobile app bundle (saveMobileAppBundle)

Create or update the Mobile app bundle that represents tha pair of ANDROID and IOS app and mobile settings like oauth2 clients, self-registration and layout configuration.When creating mobile app bundle, platform generates Mobile App Bundle Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Mobile App Bundle Id will be present in the response. Referencing non-existing Mobile App Bundle Id will cause 'Not Found' error.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **mobileAppBundle** | **MobileAppBundle** |  | |
| **oauth2ClientIds** | **List<String>** | A list of oauth2 client ids, separated by comma ',' | [optional] |

### Return type

**MobileAppBundle**


## updateMobileAppBundleOauth2Clients

> updateMobileAppBundleOauth2Clients(id, UUID)

Update oauth2 clients (updateMobileAppBundleOauth2Clients)

Update oauth2 clients of the specified mobile app bundle.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |
| **UUID** | **List<UUID>** |  | |

### Return type

null (empty response body)


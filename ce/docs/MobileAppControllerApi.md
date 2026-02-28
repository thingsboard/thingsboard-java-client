# MobileAppControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteMobileApp**](MobileAppControllerApi.md#deleteMobileApp) | **DELETE** /api/mobile/app/{id} | Delete Mobile App by ID (deleteMobileApp) |
| [**getLoginMobileInfo**](MobileAppControllerApi.md#getLoginMobileInfo) | **GET** /api/noauth/mobile | Get mobile app login info (getLoginMobileInfo) |
| [**getMobileAppById**](MobileAppControllerApi.md#getMobileAppById) | **GET** /api/mobile/app/{id} | Get mobile info by id (getMobileAppInfoById) |
| [**getTenantMobileApps**](MobileAppControllerApi.md#getTenantMobileApps) | **GET** /api/mobile/app | Get mobile app infos (getTenantMobileAppInfos) |
| [**getUserMobileInfo**](MobileAppControllerApi.md#getUserMobileInfo) | **GET** /api/mobile | Get user mobile app basic info (getUserMobileInfo) |
| [**saveMobileApp**](MobileAppControllerApi.md#saveMobileApp) | **POST** /api/mobile/app | Save Or update Mobile app (saveMobileApp) |



## deleteMobileApp

> deleteMobileApp(id)

Delete Mobile App by ID (deleteMobileApp)

Deletes Mobile App by ID. Referencing non-existing mobile app Id will cause an error.  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

null (empty response body)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getLoginMobileInfo

> LoginMobileInfo getLoginMobileInfo(pkgName, platform)

Get mobile app login info (getLoginMobileInfo)

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pkgName** | **String**| Mobile application package name | |
| **platform** | **String**| Platform type | [enum: ANDROID, IOS] |

### Return type

[**LoginMobileInfo**](LoginMobileInfo.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getMobileAppById

> MobileApp getMobileAppById(id)

Get mobile info by id (getMobileAppInfoById)

  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**MobileApp**](MobileApp.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getTenantMobileApps

> PageDataMobileApp getTenantMobileApps(pageSize, page, platformType, textSearch, sortProperty, sortOrder)

Get mobile app infos (getTenantMobileAppInfos)

  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **platformType** | [**PlatformType**](.md)| Platform type: ANDROID or IOS | [optional] [enum: WEB, ANDROID, IOS] |
| **textSearch** | **String**| Case-insensitive &#39;substring&#39; filter based on app&#39;s name | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] |

### Return type

[**PageDataMobileApp**](PageDataMobileApp.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getUserMobileInfo

> UserMobileInfo getUserMobileInfo(pkgName, platform)

Get user mobile app basic info (getUserMobileInfo)

  Available for any authorized user. 

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pkgName** | **String**| Mobile application package name | |
| **platform** | **String**| Platform type | [enum: ANDROID, IOS] |

### Return type

[**UserMobileInfo**](UserMobileInfo.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## saveMobileApp

> MobileApp saveMobileApp(mobileApp)

Save Or update Mobile app (saveMobileApp)

Create or update the Mobile app. When creating mobile app, platform generates Mobile App Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Mobile App Id will be present in the response. Specify existing Mobile App Id to update the mobile app. Referencing non-existing Mobile App Id will cause &#39;Not Found&#39; error.  The pair of mobile app package name and platform type is unique for entire platform setup.    Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **mobileApp** | [**MobileApp**](MobileApp.md)|  | |

### Return type

[**MobileApp**](MobileApp.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


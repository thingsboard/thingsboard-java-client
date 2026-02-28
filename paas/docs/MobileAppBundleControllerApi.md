# MobileAppBundleControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteMobileAppBundle**](MobileAppBundleControllerApi.md#deleteMobileAppBundle) | **DELETE** /api/mobile/bundle/{id} | Delete Mobile App Bundle by ID (deleteMobileAppBundle) |
| [**getMobileAppBundleInfoById**](MobileAppBundleControllerApi.md#getMobileAppBundleInfoById) | **GET** /api/mobile/bundle/info/{id} | Get mobile app bundle info by id (getMobileAppBundleInfoById) |
| [**getTenantMobileAppBundleInfos**](MobileAppBundleControllerApi.md#getTenantMobileAppBundleInfos) | **GET** /api/mobile/bundle/infos | Get mobile app bundle infos (getTenantMobileAppBundleInfos) |
| [**saveMobileAppBundle**](MobileAppBundleControllerApi.md#saveMobileAppBundle) | **POST** /api/mobile/bundle | Save Or update Mobile app bundle (saveMobileAppBundle) |
| [**updateOauth2Clients**](MobileAppBundleControllerApi.md#updateOauth2Clients) | **PUT** /api/mobile/bundle/{id}/oauth2Clients | Update oauth2 clients (updateOauth2Clients) |



## deleteMobileAppBundle

> deleteMobileAppBundle(id)

Delete Mobile App Bundle by ID (deleteMobileAppBundle)

Deletes Mobile App Bundle by ID. Referencing non-existing mobile app bundle Id will cause an error.  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

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


## getMobileAppBundleInfoById

> MobileAppBundleInfo getMobileAppBundleInfoById(id)

Get mobile app bundle info by id (getMobileAppBundleInfoById)

  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**MobileAppBundleInfo**](MobileAppBundleInfo.md)

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


## getTenantMobileAppBundleInfos

> PageDataMobileAppBundleInfo getTenantMobileAppBundleInfos(pageSize, page, textSearch, sortProperty, sortOrder)

Get mobile app bundle infos (getTenantMobileAppBundleInfos)

  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| Case-insensitive &#39;substring&#39; filter based on app&#39;s name | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] |

### Return type

[**PageDataMobileAppBundleInfo**](PageDataMobileAppBundleInfo.md)

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


## saveMobileAppBundle

> MobileAppBundle saveMobileAppBundle(mobileAppBundle, oauth2ClientIds)

Save Or update Mobile app bundle (saveMobileAppBundle)

Create or update the Mobile app bundle that represents tha pair of ANDROID and IOS app and mobile settings like oauth2 clients, self-registration and layout configuration.When creating mobile app bundle, platform generates Mobile App Bundle Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Mobile App Bundle Id will be present in the response. Referencing non-existing Mobile App Bundle Id will cause &#39;Not Found&#39; error.  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **mobileAppBundle** | [**MobileAppBundle**](MobileAppBundle.md)|  | |
| **oauth2ClientIds** | [**List&lt;String&gt;**](String.md)| A list of oauth2 client ids, separated by comma &#39;,&#39; | [optional] |

### Return type

[**MobileAppBundle**](MobileAppBundle.md)

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


## updateOauth2Clients

> updateOauth2Clients(id, UUID)

Update oauth2 clients (updateOauth2Clients)

Update oauth2 clients of the specified mobile app bundle.  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **UUID** | [**List&lt;UUID&gt;**](UUID.md)|  | |

### Return type

null (empty response body)

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


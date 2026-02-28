# ImageControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteImage**](ImageControllerApi.md#deleteImage) | **DELETE** /api/images/{type}/{key} | deleteImage |
| [**downloadImage**](ImageControllerApi.md#downloadImage) | **GET** /api/images/{type}/{key} | downloadImage |
| [**downloadImagePreview**](ImageControllerApi.md#downloadImagePreview) | **GET** /api/images/{type}/{key}/preview | downloadImagePreview |
| [**downloadLoginFavicon**](ImageControllerApi.md#downloadLoginFavicon) | **GET** /api/noauth/whiteLabel/loginFavicon/{type}/{key} | downloadLoginFavicon |
| [**downloadLoginLogo**](ImageControllerApi.md#downloadLoginLogo) | **GET** /api/noauth/whiteLabel/loginLogo/{type}/{key} | downloadLoginLogo |
| [**downloadPublicImage**](ImageControllerApi.md#downloadPublicImage) | **GET** /api/images/public/{publicResourceKey} | downloadPublicImage |
| [**exportImage**](ImageControllerApi.md#exportImage) | **GET** /api/images/{type}/{key}/export | exportImage |
| [**getImageInfo**](ImageControllerApi.md#getImageInfo) | **GET** /api/images/{type}/{key}/info | getImageInfo |
| [**getImages**](ImageControllerApi.md#getImages) | **GET** /api/images | getImages |
| [**importImage**](ImageControllerApi.md#importImage) | **PUT** /api/image/import | importImage |
| [**updateImage**](ImageControllerApi.md#updateImage) | **PUT** /api/images/{type}/{key} | updateImage |
| [**updateImageInfo**](ImageControllerApi.md#updateImageInfo) | **PUT** /api/images/{type}/{key}/info | updateImageInfo |
| [**updateImagePublicStatus**](ImageControllerApi.md#updateImagePublicStatus) | **PUT** /api/images/{type}/{key}/public/{isPublic} | updateImagePublicStatus |
| [**uploadImage**](ImageControllerApi.md#uploadImage) | **POST** /api/image | uploadImage |



## deleteImage

> TbImageDeleteResult deleteImage(type, key, force)

deleteImage

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String**| Type of the image: tenant or system | [enum: tenant, system] |
| **key** | **String**| Image resource key, for example thermostats_dashboard_background.jpeg | |
| **force** | **Boolean**|  | [optional] |

### Return type

[**TbImageDeleteResult**](TbImageDeleteResult.md)

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


## downloadImage

> File downloadImage(type, key, ifNoneMatch, acceptEncoding)

downloadImage

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String**| Type of the image: tenant or system | [enum: tenant, system] |
| **key** | **String**| Image resource key, for example thermostats_dashboard_background.jpeg | |
| **ifNoneMatch** | **String**|  | [optional] |
| **acceptEncoding** | **String**|  | [optional] |

### Return type

[**File**](File.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: image/*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## downloadImagePreview

> File downloadImagePreview(type, key, ifNoneMatch, acceptEncoding)

downloadImagePreview

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String**| Type of the image: tenant or system | [enum: tenant, system] |
| **key** | **String**| Image resource key, for example thermostats_dashboard_background.jpeg | |
| **ifNoneMatch** | **String**|  | [optional] |
| **acceptEncoding** | **String**|  | [optional] |

### Return type

[**File**](File.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: image/png, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## downloadLoginFavicon

> File downloadLoginFavicon(type, key, ifNoneMatch, acceptEncoding)

downloadLoginFavicon

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String**| Type of the image: tenant or system | [enum: tenant, system] |
| **key** | **String**| Image resource key, for example thermostats_dashboard_background.jpeg | |
| **ifNoneMatch** | **String**|  | [optional] |
| **acceptEncoding** | **String**|  | [optional] |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: image/*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## downloadLoginLogo

> File downloadLoginLogo(type, key, ifNoneMatch, acceptEncoding)

downloadLoginLogo

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String**| Type of the image: tenant or system | [enum: tenant, system] |
| **key** | **String**| Image resource key, for example thermostats_dashboard_background.jpeg | |
| **ifNoneMatch** | **String**|  | [optional] |
| **acceptEncoding** | **String**|  | [optional] |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: image/*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## downloadPublicImage

> File downloadPublicImage(publicResourceKey, ifNoneMatch, acceptEncoding)

downloadPublicImage

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **publicResourceKey** | **String**|  | |
| **ifNoneMatch** | **String**|  | [optional] |
| **acceptEncoding** | **String**|  | [optional] |

### Return type

[**File**](File.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: image/*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## exportImage

> ResourceExportData exportImage(type, key)

exportImage

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String**| Type of the image: tenant or system | [enum: tenant, system] |
| **key** | **String**| Image resource key, for example thermostats_dashboard_background.jpeg | |

### Return type

[**ResourceExportData**](ResourceExportData.md)

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


## getImageInfo

> TbResourceInfo getImageInfo(type, key)

getImageInfo

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String**| Type of the image: tenant or system | [enum: tenant, system] |
| **key** | **String**| Image resource key, for example thermostats_dashboard_background.jpeg | |

### Return type

[**TbResourceInfo**](TbResourceInfo.md)

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


## getImages

> PageDataTbResourceInfo getImages(pageSize, page, imageSubType, includeSystemImages, textSearch, sortProperty, sortOrder)

getImages

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **imageSubType** | **String**| A string value representing resource sub-type. | [optional] [enum: IMAGE, SCADA_SYMBOL] |
| **includeSystemImages** | **Boolean**| Use &#39;true&#39; to include system images. Disabled by default. Ignored for requests by users with system administrator authority. | [optional] |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the resource title. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, title, resourceType, tenantId] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataTbResourceInfo**](PageDataTbResourceInfo.md)

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


## importImage

> TbResourceInfo importImage(resourceExportData)

importImage

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **resourceExportData** | [**ResourceExportData**](ResourceExportData.md)|  | |

### Return type

[**TbResourceInfo**](TbResourceInfo.md)

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


## updateImage

> TbResourceInfo updateImage(type, key, _file)

updateImage

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String**| Type of the image: tenant or system | [enum: tenant, system] |
| **key** | **String**| Image resource key, for example thermostats_dashboard_background.jpeg | |
| **_file** | **File**|  | |

### Return type

[**TbResourceInfo**](TbResourceInfo.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: multipart/form-data
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


## updateImageInfo

> TbResourceInfo updateImageInfo(type, key, tbResourceInfo)

updateImageInfo

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String**| Type of the image: tenant or system | [enum: tenant, system] |
| **key** | **String**| Image resource key, for example thermostats_dashboard_background.jpeg | |
| **tbResourceInfo** | [**TbResourceInfo**](TbResourceInfo.md)|  | |

### Return type

[**TbResourceInfo**](TbResourceInfo.md)

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


## updateImagePublicStatus

> TbResourceInfo updateImagePublicStatus(type, key, isPublic)

updateImagePublicStatus

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String**| Type of the image: tenant or system | [enum: tenant, system] |
| **key** | **String**| Image resource key, for example thermostats_dashboard_background.jpeg | |
| **isPublic** | **Boolean**|  | |

### Return type

[**TbResourceInfo**](TbResourceInfo.md)

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


## uploadImage

> TbResourceInfo uploadImage(_file, title, imageSubType)

uploadImage

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_file** | **File**|  | |
| **title** | **String**|  | [optional] |
| **imageSubType** | **String**|  | [optional] |

### Return type

[**TbResourceInfo**](TbResourceInfo.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: multipart/form-data
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


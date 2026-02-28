# CustomTranslationControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteCustomTranslation**](CustomTranslationControllerApi.md#deleteCustomTranslation) | **DELETE** /api/translation/custom/{localeCode} | Delete Custom Translation for specified locale (deleteCustomTranslation) |
| [**deleteCustomTranslationKey**](CustomTranslationControllerApi.md#deleteCustomTranslationKey) | **DELETE** /api/translation/custom/{localeCode}/{keyPath} | Delete specified key of Custom Translation (deleteCustomTranslationKey)  |
| [**getCustomTranslation**](CustomTranslationControllerApi.md#getCustomTranslation) | **GET** /api/translation/custom/{localeCode} | Get Custom Translation configuration (getCustomTranslation) |
| [**getMergedCustomTranslation**](CustomTranslationControllerApi.md#getMergedCustomTranslation) | **GET** /api/translation/custom/merged/{localeCode} | Get end-user Custom Translation configuration (getMergedCustomTranslation) |
| [**patchCustomTranslation**](CustomTranslationControllerApi.md#patchCustomTranslation) | **PATCH** /api/translation/custom/{localeCode} | Update Custom Translation for specified translation keys only (patchCustomTranslation) |
| [**saveCustomTranslation**](CustomTranslationControllerApi.md#saveCustomTranslation) | **POST** /api/translation/custom/{localeCode} | Create Or Update Custom Translation (saveCustomTranslation) |
| [**uploadCustomTranslation**](CustomTranslationControllerApi.md#uploadCustomTranslation) | **POST** /api/translation/custom/{localeCode}/upload | Upload Custom Translation (uploadCustomTranslation) |



## deleteCustomTranslation

> deleteCustomTranslation(localeCode)

Delete Custom Translation for specified locale (deleteCustomTranslation)

Delete entire custom translation settings for end-user  Security check is performed to verify that the user has &#39;WRITE&#39; permission for the white labeling resource.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **localeCode** | **String**| Locale code (e.g. &#39;en_US&#39;). | |

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


## deleteCustomTranslationKey

> deleteCustomTranslationKey(localeCode, keyPath)

Delete specified key of Custom Translation (deleteCustomTranslationKey) 

The API call is designed to delete specified key of the custom translation and return as a result parent translation.(e.g. if tenant translation for key is &#39;value1&#39; and customer translation is &#39;value2&#39; then by deletinf key onn customer level you will get &#39;value1&#39; in response)   Security check is performed to verify that the user has &#39;WRITE&#39; permission for the white labeling resource.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **localeCode** | **String**| Locale code (e.g. &#39;en_US&#39;). | |
| **keyPath** | **String**| A string value representing key of the custom translation (e.g. &#39;notification.active&#39;). | |

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


## getCustomTranslation

> com.fasterxml.jackson.databind.JsonNode getCustomTranslation(localeCode)

Get Custom Translation configuration (getCustomTranslation)

Fetch the Custom Translation for specified locale that corresponds to the authority of the user. The API call is designed to load the custom translation items for edition. So, the result is NOT merged with the parent level configuration. Let&#39;s assume there is a custom translation configured on a system level. And there is no custom translation items configured on a tenant level. In such a case, the API call will return empty object for the tenant administrator.    Response example:   &#x60;&#x60;&#x60;json {\&quot;home\&quot;:\&quot;MyHome\&quot;} &#x60;&#x60;&#x60;  Security check is performed to verify that the user has &#39;READ&#39; permission for the white labeling resource.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **localeCode** | **String**| Locale code (e.g. &#39;en_US&#39;). | |

### Return type

[**com.fasterxml.jackson.databind.JsonNode**](com.fasterxml.jackson.databind.JsonNode.md)

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


## getMergedCustomTranslation

> com.fasterxml.jackson.databind.JsonNode getMergedCustomTranslation(localeCode)

Get end-user Custom Translation configuration (getMergedCustomTranslation)

Fetch end-user Custom Translation for specified locale. The custom translation is configured in the white labeling parameters. If custom translation translation is defined on the tenant level, it overrides the custom translation of the system level. Similar, if the custom translation is defined on the customer level, it overrides the translation configuration of the tenant level.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **localeCode** | **String**| Locale code (e.g. &#39;en_US&#39;). | |

### Return type

[**com.fasterxml.jackson.databind.JsonNode**](com.fasterxml.jackson.databind.JsonNode.md)

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


## patchCustomTranslation

> patchCustomTranslation(localeCode, body)

Update Custom Translation for specified translation keys only (patchCustomTranslation)

The API call is designed to update the custom translation for specified key only.    Request example:   &#x60;&#x60;&#x60;json {\&quot;notification.active\&quot;:\&quot;active\&quot;} &#x60;&#x60;&#x60;  Security check is performed to verify that the user has &#39;WRITE&#39; permission for the white labeling resource.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **localeCode** | **String**| Locale code (e.g. &#39;en_US&#39;). | |
| **body** | **Object**|  | |

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


## saveCustomTranslation

> saveCustomTranslation(localeCode, body)

Create Or Update Custom Translation (saveCustomTranslation)

Creates or Updates the Custom Translation for specified locale.   Request example:   &#x60;&#x60;&#x60;json {\&quot;home\&quot;:\&quot;MyHome\&quot;} &#x60;&#x60;&#x60;  Security check is performed to verify that the user has &#39;WRITE&#39; permission for the white labeling resource.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **localeCode** | **String**| Locale code (e.g. &#39;en_US&#39;). | |
| **body** | **Object**|  | |

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


## uploadCustomTranslation

> uploadCustomTranslation(localeCode, _file)

Upload Custom Translation (uploadCustomTranslation)

Upload the Custom Translation for specified locale.   Request example:   &#x60;&#x60;&#x60;json {\&quot;home\&quot;:\&quot;MyHome\&quot;} &#x60;&#x60;&#x60;  Security check is performed to verify that the user has &#39;WRITE&#39; permission for the white labeling resource.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **localeCode** | **String**| Locale code (e.g. &#39;en_US&#39;). | |
| **_file** | **File**|  | |

### Return type

null (empty response body)

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


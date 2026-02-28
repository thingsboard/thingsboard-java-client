# TranslationControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downloadFullTranslation**](TranslationControllerApi.md#downloadFullTranslation) | **GET** /api/translation/full/{localeCode}/download | Download end-user all-to-one translation (downloadFullTranslation) |
| [**getAvailableJavaLocales**](TranslationControllerApi.md#getAvailableJavaLocales) | **GET** /api/translation/availableJavaLocales | Get list of available java locales (getAvailableJavaLocales) |
| [**getAvailableLocales**](TranslationControllerApi.md#getAvailableLocales) | **GET** /api/translation/availableLocales | Get list of available locales (getAvailableLocales) |
| [**getFullTranslation**](TranslationControllerApi.md#getFullTranslation) | **GET** /api/translation/full/{localeCode} | Get end-user all-to-one translation (getFullTranslation) |
| [**getLoginPageTranslation**](TranslationControllerApi.md#getLoginPageTranslation) | **GET** /api/noauth/translation/login/{localeCode} | Get system translation for login page |
| [**getTranslationForBasicEdit**](TranslationControllerApi.md#getTranslationForBasicEdit) | **GET** /api/translation/edit/basic/{localeCode} | Get end-user multi-translation for basic edit (getTranslationForBasicEdit) |
| [**getTranslationInfos**](TranslationControllerApi.md#getTranslationInfos) | **GET** /api/translation/info | Get Translation info (getTranslationInfos) |



## downloadFullTranslation

> File downloadFullTranslation(localeCode)

Download end-user all-to-one translation (downloadFullTranslation)

Fetch the end-user translation for the specified locale. The result is a json file with merged user custom translation, system language translation and default locale translation.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **localeCode** | **String**| Locale code (e.g. &#39;en_US&#39;). | |

### Return type

[**File**](File.md)

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


## getAvailableJavaLocales

> com.fasterxml.jackson.databind.JsonNode getAvailableJavaLocales()

Get list of available java locales (getAvailableJavaLocales)

The result is map where key is locale code and value is locale language and country

### Parameters

This endpoint does not need any parameter.

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


## getAvailableLocales

> com.fasterxml.jackson.databind.JsonNode getAvailableLocales()

Get list of available locales (getAvailableLocales)

Fetch the list of customized locales from all levels  Security check is performed to verify that the user has &#39;READ&#39; permission for the white labeling resource.

### Parameters

This endpoint does not need any parameter.

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


## getFullTranslation

> getFullTranslation(localeCode, ifNoneMatch, acceptEncoding)

Get end-user all-to-one translation (getFullTranslation)

Fetch the end-user translation for specified locale. The result is the merge of user custom translation, system language translation and default locale translation.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **localeCode** | **String**| Locale code (e.g. &#39;en_US&#39;). | |
| **ifNoneMatch** | **String**|  | [optional] |
| **acceptEncoding** | **String**|  | [optional] |

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


## getLoginPageTranslation

> com.fasterxml.jackson.databind.JsonNode getLoginPageTranslation(localeCode, ifNoneMatch, acceptEncoding)

Get system translation for login page

Fetch the end-user translation for specified locale.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **localeCode** | **String**| Locale code (e.g. &#39;en_US&#39;). | |
| **ifNoneMatch** | **String**|  | [optional] |
| **acceptEncoding** | **String**|  | [optional] |

### Return type

[**com.fasterxml.jackson.databind.JsonNode**](com.fasterxml.jackson.databind.JsonNode.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Translation for login page in specified locale. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getTranslationForBasicEdit

> com.fasterxml.jackson.databind.JsonNode getTranslationForBasicEdit(localeCode)

Get end-user multi-translation for basic edit (getTranslationForBasicEdit)

Fetch the translation info map where value is info object containing key translation, origin translation, translation of parent level, translation status.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **localeCode** | **String**|  | |

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


## getTranslationInfos

> List&lt;TranslationInfo&gt; getTranslationInfos()

Get Translation info (getTranslationInfos)

Fetch the list of customized locales and corresponding details such as language display name, country display name and translation progress percentage.   Response example:   &#x60;&#x60;&#x60;json [   {     \&quot;localeCode\&quot;: \&quot;uk_UA\&quot;,     \&quot;language\&quot;: \&quot;Ukrainian (українська)\&quot;,     \&quot;country\&quot;: \&quot;Україна\&quot;,     \&quot;progress\&quot;: 32   },   {     \&quot;localeCode\&quot;: \&quot;es_ES\&quot;,     \&quot;language\&quot;: \&quot;Spanish (español)\&quot;,     \&quot;country\&quot;: \&quot;España\&quot;,     \&quot;progress\&quot;: 79   }] &#x60;&#x60;&#x60;  Security check is performed to verify that the user has &#39;READ&#39; permission for the white labeling resource.

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;TranslationInfo&gt;**](TranslationInfo.md)

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


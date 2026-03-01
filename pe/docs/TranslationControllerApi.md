# TranslationControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downloadFullTranslation**](#downloadFullTranslation) | **GET** /api/translation/full/{localeCode}/download | Download end-user all-to-one translation (downloadFullTranslation) |
| [**getAvailableJavaLocales**](#getAvailableJavaLocales) | **GET** /api/translation/availableJavaLocales | Get list of available java locales (getAvailableJavaLocales) |
| [**getAvailableLocales**](#getAvailableLocales) | **GET** /api/translation/availableLocales | Get list of available locales (getAvailableLocales) |
| [**getFullTranslation**](#getFullTranslation) | **GET** /api/translation/full/{localeCode} | Get end-user all-to-one translation (getFullTranslation) |
| [**getLoginPageTranslation**](#getLoginPageTranslation) | **GET** /api/noauth/translation/login/{localeCode} | Get system translation for login page |
| [**getTranslationForBasicEdit**](#getTranslationForBasicEdit) | **GET** /api/translation/edit/basic/{localeCode} | Get end-user multi-translation for basic edit (getTranslationForBasicEdit) |
| [**getTranslationInfos**](#getTranslationInfos) | **GET** /api/translation/info | Get Translation info (getTranslationInfos) |



## downloadFullTranslation

> File downloadFullTranslation(localeCode)

Download end-user all-to-one translation (downloadFullTranslation)

Fetch the end-user translation for the specified locale. The result is a json file with merged user custom translation, system language translation and default locale translation.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **localeCode** | **String** | Locale code (e.g. 'en_US'). | |

### Return type

**File**


## getAvailableJavaLocales

> com.fasterxml.jackson.databind.JsonNode getAvailableJavaLocales()

Get list of available java locales (getAvailableJavaLocales)

The result is map where key is locale code and value is locale language and country

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## getAvailableLocales

> com.fasterxml.jackson.databind.JsonNode getAvailableLocales()

Get list of available locales (getAvailableLocales)

Fetch the list of customized locales from all levels  Security check is performed to verify that the user has 'READ' permission for the white labeling resource.

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## getFullTranslation

> getFullTranslation(localeCode, ifNoneMatch, acceptEncoding)

Get end-user all-to-one translation (getFullTranslation)

Fetch the end-user translation for specified locale. The result is the merge of user custom translation, system language translation and default locale translation.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **localeCode** | **String** | Locale code (e.g. 'en_US'). | |
| **ifNoneMatch** | **String** |  | [optional] |
| **acceptEncoding** | **String** |  | [optional] |

### Return type

null (empty response body)


## getLoginPageTranslation

> com.fasterxml.jackson.databind.JsonNode getLoginPageTranslation(localeCode, ifNoneMatch, acceptEncoding)

Get system translation for login page

Fetch the end-user translation for specified locale.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **localeCode** | **String** | Locale code (e.g. 'en_US'). | |
| **ifNoneMatch** | **String** |  | [optional] |
| **acceptEncoding** | **String** |  | [optional] |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## getTranslationForBasicEdit

> com.fasterxml.jackson.databind.JsonNode getTranslationForBasicEdit(localeCode)

Get end-user multi-translation for basic edit (getTranslationForBasicEdit)

Fetch the translation info map where value is info object containing key translation, origin translation, translation of parent level, translation status.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **localeCode** | **String** |  | |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## getTranslationInfos

> List<TranslationInfo> getTranslationInfos()

Get Translation info (getTranslationInfos)

Fetch the list of customized locales and corresponding details such as language display name, country display name and translation progress percentage.   Response example:   ```json [   {     \"localeCode\": \"uk_UA\",     \"language\": \"Ukrainian (українська)\",     \"country\": \"Україна\",     \"progress\": 32   },   {     \"localeCode\": \"es_ES\",     \"language\": \"Spanish (español)\",     \"country\": \"España\",     \"progress\": 79   }] ```  Security check is performed to verify that the user has 'READ' permission for the white labeling resource.

### Return type

**List<TranslationInfo>**


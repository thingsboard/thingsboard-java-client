# CustomTranslationControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteCustomTranslation**](#deleteCustomTranslation) | **DELETE** /api/translation/custom/{localeCode} | Delete Custom Translation for specified locale (deleteCustomTranslation) |
| [**deleteCustomTranslationKey**](#deleteCustomTranslationKey) | **DELETE** /api/translation/custom/{localeCode}/{keyPath} | Delete specified key of Custom Translation (deleteCustomTranslationKey)  |
| [**getCustomTranslation**](#getCustomTranslation) | **GET** /api/translation/custom/{localeCode} | Get Custom Translation configuration (getCustomTranslation) |
| [**getMergedCustomTranslation**](#getMergedCustomTranslation) | **GET** /api/translation/custom/merged/{localeCode} | Get end-user Custom Translation configuration (getMergedCustomTranslation) |
| [**patchCustomTranslation**](#patchCustomTranslation) | **PATCH** /api/translation/custom/{localeCode} | Update Custom Translation for specified translation keys only (patchCustomTranslation) |
| [**saveCustomTranslation**](#saveCustomTranslation) | **POST** /api/translation/custom/{localeCode} | Create Or Update Custom Translation (saveCustomTranslation) |
| [**uploadCustomTranslation**](#uploadCustomTranslation) | **POST** /api/translation/custom/{localeCode}/upload | Upload Custom Translation (uploadCustomTranslation) |



## deleteCustomTranslation

> deleteCustomTranslation(localeCode)

Delete Custom Translation for specified locale (deleteCustomTranslation)

Delete entire custom translation settings for end-user  Security check is performed to verify that the user has &#39;WRITE&#39; permission for the white labeling resource.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **localeCode** | **String** | Locale code (e.g. &#39;en_US&#39;). | |


## deleteCustomTranslationKey

> deleteCustomTranslationKey(localeCode, keyPath)

Delete specified key of Custom Translation (deleteCustomTranslationKey) 

The API call is designed to delete specified key of the custom translation and return as a result parent translation.(e.g. if tenant translation for key is &#39;value1&#39; and customer translation is &#39;value2&#39; then by deletinf key onn customer level you will get &#39;value1&#39; in response)   Security check is performed to verify that the user has &#39;WRITE&#39; permission for the white labeling resource.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **localeCode** | **String** | Locale code (e.g. &#39;en_US&#39;). | |
| **keyPath** | **String** | A string value representing key of the custom translation (e.g. &#39;notification.active&#39;). | |


## getCustomTranslation

> com.fasterxml.jackson.databind.JsonNode getCustomTranslation(localeCode)

Get Custom Translation configuration (getCustomTranslation)

Fetch the Custom Translation for specified locale that corresponds to the authority of the user. The API call is designed to load the custom translation items for edition. So, the result is NOT merged with the parent level configuration. Let&#39;s assume there is a custom translation configured on a system level. And there is no custom translation items configured on a tenant level. In such a case, the API call will return empty object for the tenant administrator.    Response example:   &#x60;&#x60;&#x60;json {\&quot;home\&quot;:\&quot;MyHome\&quot;} &#x60;&#x60;&#x60;  Security check is performed to verify that the user has &#39;READ&#39; permission for the white labeling resource.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **localeCode** | **String** | Locale code (e.g. &#39;en_US&#39;). | |


## getMergedCustomTranslation

> com.fasterxml.jackson.databind.JsonNode getMergedCustomTranslation(localeCode)

Get end-user Custom Translation configuration (getMergedCustomTranslation)

Fetch end-user Custom Translation for specified locale. The custom translation is configured in the white labeling parameters. If custom translation translation is defined on the tenant level, it overrides the custom translation of the system level. Similar, if the custom translation is defined on the customer level, it overrides the translation configuration of the tenant level.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **localeCode** | **String** | Locale code (e.g. &#39;en_US&#39;). | |


## patchCustomTranslation

> patchCustomTranslation(localeCode, body)

Update Custom Translation for specified translation keys only (patchCustomTranslation)

The API call is designed to update the custom translation for specified key only.    Request example:   &#x60;&#x60;&#x60;json {\&quot;notification.active\&quot;:\&quot;active\&quot;} &#x60;&#x60;&#x60;  Security check is performed to verify that the user has &#39;WRITE&#39; permission for the white labeling resource.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **localeCode** | **String** | Locale code (e.g. &#39;en_US&#39;). | |
| **body** | **Object** |  | |


## saveCustomTranslation

> saveCustomTranslation(localeCode, body)

Create Or Update Custom Translation (saveCustomTranslation)

Creates or Updates the Custom Translation for specified locale.   Request example:   &#x60;&#x60;&#x60;json {\&quot;home\&quot;:\&quot;MyHome\&quot;} &#x60;&#x60;&#x60;  Security check is performed to verify that the user has &#39;WRITE&#39; permission for the white labeling resource.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **localeCode** | **String** | Locale code (e.g. &#39;en_US&#39;). | |
| **body** | **Object** |  | |


## uploadCustomTranslation

> uploadCustomTranslation(localeCode, _file)

Upload Custom Translation (uploadCustomTranslation)

Upload the Custom Translation for specified locale.   Request example:   &#x60;&#x60;&#x60;json {\&quot;home\&quot;:\&quot;MyHome\&quot;} &#x60;&#x60;&#x60;  Security check is performed to verify that the user has &#39;WRITE&#39; permission for the white labeling resource.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **localeCode** | **String** | Locale code (e.g. &#39;en_US&#39;). | |
| **_file** | **File** |  | |


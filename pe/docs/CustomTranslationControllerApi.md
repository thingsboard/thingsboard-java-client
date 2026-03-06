# CustomTranslationControllerApi

`ThingsboardClient` methods:

```
void deleteCustomTranslation(@Nonnull String localeCode) // Delete Custom Translation for specified locale (deleteCustomTranslation)
void deleteCustomTranslationKey(@Nonnull String localeCode, @Nonnull String keyPath) // Delete specified key of Custom Translation (deleteCustomTranslationKey) 
com.fasterxml.jackson.databind.JsonNode getCustomTranslation(@Nonnull String localeCode) // Get Custom Translation configuration (getCustomTranslation)
com.fasterxml.jackson.databind.JsonNode getMergedCustomTranslation(@Nonnull String localeCode) // Get end-user Custom Translation configuration (getMergedCustomTranslation)
void patchCustomTranslation(@Nonnull String localeCode, @Nonnull Object body) // Update Custom Translation for specified translation keys only (patchCustomTranslation)
void saveCustomTranslation(@Nonnull String localeCode, @Nonnull Object body) // Create Or Update Custom Translation (saveCustomTranslation)
void uploadCustomTranslation(@Nonnull String localeCode, @Nonnull File _file) // Upload Custom Translation (uploadCustomTranslation)
```


## deleteCustomTranslation

```
void deleteCustomTranslation(@Nonnull String localeCode)
```

**DELETE** `/api/translation/custom/{localeCode}`

Delete Custom Translation for specified locale (deleteCustomTranslation)

Delete entire custom translation settings for end-user  Security check is performed to verify that the user has 'WRITE' permission for the white labeling resource.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **localeCode** | **String** | Locale code (e.g. 'en_US'). | |

### Return type

null (empty response body)


## deleteCustomTranslationKey

```
void deleteCustomTranslationKey(@Nonnull String localeCode, @Nonnull String keyPath)
```

**DELETE** `/api/translation/custom/{localeCode}/{keyPath}`

Delete specified key of Custom Translation (deleteCustomTranslationKey) 

The API call is designed to delete specified key of the custom translation and return as a result parent translation.(e.g. if tenant translation for key is 'value1' and customer translation is 'value2' then by deletinf key onn customer level you will get 'value1' in response)   Security check is performed to verify that the user has 'WRITE' permission for the white labeling resource.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **localeCode** | **String** | Locale code (e.g. 'en_US'). | |
| **keyPath** | **String** | A string value representing key of the custom translation (e.g. 'notification.active'). | |

### Return type

null (empty response body)


## getCustomTranslation

```
com.fasterxml.jackson.databind.JsonNode getCustomTranslation(@Nonnull String localeCode)
```

**GET** `/api/translation/custom/{localeCode}`

Get Custom Translation configuration (getCustomTranslation)

Fetch the Custom Translation for specified locale that corresponds to the authority of the user. The API call is designed to load the custom translation items for edition. So, the result is NOT merged with the parent level configuration. Let's assume there is a custom translation configured on a system level. And there is no custom translation items configured on a tenant level. In such a case, the API call will return empty object for the tenant administrator.    Response example:   ```json {\"home\":\"MyHome\"} ```  Security check is performed to verify that the user has 'READ' permission for the white labeling resource.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **localeCode** | **String** | Locale code (e.g. 'en_US'). | |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## getMergedCustomTranslation

```
com.fasterxml.jackson.databind.JsonNode getMergedCustomTranslation(@Nonnull String localeCode)
```

**GET** `/api/translation/custom/merged/{localeCode}`

Get end-user Custom Translation configuration (getMergedCustomTranslation)

Fetch end-user Custom Translation for specified locale. The custom translation is configured in the white labeling parameters. If custom translation translation is defined on the tenant level, it overrides the custom translation of the system level. Similar, if the custom translation is defined on the customer level, it overrides the translation configuration of the tenant level.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **localeCode** | **String** | Locale code (e.g. 'en_US'). | |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## patchCustomTranslation

```
void patchCustomTranslation(@Nonnull String localeCode, @Nonnull Object body)
```

**PATCH** `/api/translation/custom/{localeCode}`

Update Custom Translation for specified translation keys only (patchCustomTranslation)

The API call is designed to update the custom translation for specified key only.    Request example:   ```json {\"notification.active\":\"active\"} ```  Security check is performed to verify that the user has 'WRITE' permission for the white labeling resource.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **localeCode** | **String** | Locale code (e.g. 'en_US'). | |
| **body** | **Object** |  | |

### Return type

null (empty response body)


## saveCustomTranslation

```
void saveCustomTranslation(@Nonnull String localeCode, @Nonnull Object body)
```

**POST** `/api/translation/custom/{localeCode}`

Create Or Update Custom Translation (saveCustomTranslation)

Creates or Updates the Custom Translation for specified locale.   Request example:   ```json {\"home\":\"MyHome\"} ```  Security check is performed to verify that the user has 'WRITE' permission for the white labeling resource.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **localeCode** | **String** | Locale code (e.g. 'en_US'). | |
| **body** | **Object** |  | |

### Return type

null (empty response body)


## uploadCustomTranslation

```
void uploadCustomTranslation(@Nonnull String localeCode, @Nonnull File _file)
```

**POST** `/api/translation/custom/{localeCode}/upload`

Upload Custom Translation (uploadCustomTranslation)

Upload the Custom Translation for specified locale.   Request example:   ```json {\"home\":\"MyHome\"} ```  Security check is performed to verify that the user has 'WRITE' permission for the white labeling resource.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **localeCode** | **String** | Locale code (e.g. 'en_US'). | |
| **_file** | **File** |  | |

### Return type

null (empty response body)


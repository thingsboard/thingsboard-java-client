# CustomTranslationControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void deleteCustomTranslation(DeleteCustomTranslationArgs args) // Delete Custom Translation for specified locale (deleteCustomTranslation)
void deleteCustomTranslationKey(DeleteCustomTranslationKeyArgs args) // Delete specified key of Custom Translation (deleteCustomTranslationKey) 
com.fasterxml.jackson.databind.JsonNode getCustomTranslation(GetCustomTranslationArgs args) // Get Custom Translation configuration (getCustomTranslation)
com.fasterxml.jackson.databind.JsonNode getMergedCustomTranslation(GetMergedCustomTranslationArgs args) // Get end-user Custom Translation configuration (getMergedCustomTranslation)
void patchCustomTranslation(PatchCustomTranslationArgs args) // Update Custom Translation for specified translation keys only (patchCustomTranslation)
void saveCustomTranslation(SaveCustomTranslationArgs args) // Create Or Update Custom Translation (saveCustomTranslation)
void uploadCustomTranslation(UploadCustomTranslationArgs args) // Upload Custom Translation (uploadCustomTranslation)
```


## deleteCustomTranslation

**DELETE** `/api/translation/custom/{localeCode}`

Delete Custom Translation for specified locale (deleteCustomTranslation)

Delete entire custom translation settings for end-user  Security check is performed to verify that the user has 'WRITE' permission for the white labeling resource.

```java
void deleteCustomTranslation(DeleteCustomTranslationArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteCustomTranslationArgs.builder()
        .localeCode(String)
        .build()
```

### `DeleteCustomTranslationArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `localeCode` | `String` | **yes** | Locale code (e.g. 'en_US'). | |

### Return type

null (empty response body)


## deleteCustomTranslationKey

**DELETE** `/api/translation/custom/{localeCode}/{keyPath}`

Delete specified key of Custom Translation (deleteCustomTranslationKey) 

The API call is designed to delete specified key of the custom translation and return as a result parent translation.(e.g. if tenant translation for key is 'value1' and customer translation is 'value2' then by deletinf key onn customer level you will get 'value1' in response)   Security check is performed to verify that the user has 'WRITE' permission for the white labeling resource.

```java
void deleteCustomTranslationKey(DeleteCustomTranslationKeyArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteCustomTranslationKeyArgs.builder()
        .localeCode(String)
        .keyPath(String)
        .build()
```

### `DeleteCustomTranslationKeyArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `localeCode` | `String` | **yes** | Locale code (e.g. 'en_US'). | |
| `keyPath` | `String` | **yes** | A string value representing key of the custom translation (e.g. 'notification.active'). | |

### Return type

null (empty response body)


## getCustomTranslation

**GET** `/api/translation/custom/{localeCode}`

Get Custom Translation configuration (getCustomTranslation)

Fetch the Custom Translation for specified locale that corresponds to the authority of the user. The API call is designed to load the custom translation items for edition. So, the result is NOT merged with the parent level configuration. Let's assume there is a custom translation configured on a system level. And there is no custom translation items configured on a tenant level. In such a case, the API call will return empty object for the tenant administrator.    Response example:   ```json {\"home\":\"MyHome\"} ```  Security check is performed to verify that the user has 'READ' permission for the white labeling resource.

```java
com.fasterxml.jackson.databind.JsonNode getCustomTranslation(GetCustomTranslationArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetCustomTranslationArgs.builder()
        .localeCode(String)
        .build()
```

### `GetCustomTranslationArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `localeCode` | `String` | **yes** | Locale code (e.g. 'en_US'). | |

### Return type

`com.fasterxml.jackson.databind.JsonNode`


## getMergedCustomTranslation

**GET** `/api/translation/custom/merged/{localeCode}`

Get end-user Custom Translation configuration (getMergedCustomTranslation)

Fetch end-user Custom Translation for specified locale. The custom translation is configured in the white labeling parameters. If custom translation translation is defined on the tenant level, it overrides the custom translation of the system level. Similar, if the custom translation is defined on the customer level, it overrides the translation configuration of the tenant level.

```java
com.fasterxml.jackson.databind.JsonNode getMergedCustomTranslation(GetMergedCustomTranslationArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetMergedCustomTranslationArgs.builder()
        .localeCode(String)
        .build()
```

### `GetMergedCustomTranslationArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `localeCode` | `String` | **yes** | Locale code (e.g. 'en_US'). | |

### Return type

`com.fasterxml.jackson.databind.JsonNode`


## patchCustomTranslation

**PATCH** `/api/translation/custom/{localeCode}`

Update Custom Translation for specified translation keys only (patchCustomTranslation)

The API call is designed to update the custom translation for specified key only.    Request example:   ```json {\"notification.active\":\"active\"} ```  Security check is performed to verify that the user has 'WRITE' permission for the white labeling resource.

```java
void patchCustomTranslation(PatchCustomTranslationArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
PatchCustomTranslationArgs.builder()
        .localeCode(String)
        .body(Object)
        .build()
```

### `PatchCustomTranslationArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `localeCode` | `String` | **yes** | Locale code (e.g. 'en_US'). | |
| `body` | `Object` | **yes** |  | |

### Return type

null (empty response body)


## saveCustomTranslation

**POST** `/api/translation/custom/{localeCode}`

Create Or Update Custom Translation (saveCustomTranslation)

Creates or Updates the Custom Translation for specified locale.   Request example:   ```json {\"home\":\"MyHome\"} ```  Security check is performed to verify that the user has 'WRITE' permission for the white labeling resource.

```java
void saveCustomTranslation(SaveCustomTranslationArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveCustomTranslationArgs.builder()
        .localeCode(String)
        .body(Object)
        .build()
```

### `SaveCustomTranslationArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `localeCode` | `String` | **yes** | Locale code (e.g. 'en_US'). | |
| `body` | `Object` | **yes** |  | |

### Return type

null (empty response body)


## uploadCustomTranslation

**POST** `/api/translation/custom/{localeCode}/upload`

Upload Custom Translation (uploadCustomTranslation)

Upload the Custom Translation for specified locale.   Request example:   ```json {\"home\":\"MyHome\"} ```  Security check is performed to verify that the user has 'WRITE' permission for the white labeling resource.

```java
void uploadCustomTranslation(UploadCustomTranslationArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UploadCustomTranslationArgs.builder()
        .localeCode(String)
        ._file(File)
        .build()
```

### `UploadCustomTranslationArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `localeCode` | `String` | **yes** | Locale code (e.g. 'en_US'). | |
| `_file` | `File` | **yes** |  | |

### Return type

null (empty response body)


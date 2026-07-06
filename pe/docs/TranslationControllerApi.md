# TranslationControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
File downloadFullTranslation(DownloadFullTranslationArgs args) // Download end-user all-to-one translation (downloadFullTranslation)
com.fasterxml.jackson.databind.JsonNode getAvailableJavaLocales() // Get list of available java locales (getAvailableJavaLocales)
com.fasterxml.jackson.databind.JsonNode getAvailableLocales() // Get list of available locales (getAvailableLocales)
com.fasterxml.jackson.databind.JsonNode getFullTranslation(GetFullTranslationArgs args) // Get end-user all-to-one translation (getFullTranslation)
com.fasterxml.jackson.databind.JsonNode getLoginPageTranslation(GetLoginPageTranslationArgs args) // Get system translation for login page
com.fasterxml.jackson.databind.JsonNode getTranslationForBasicEdit(GetTranslationForBasicEditArgs args) // Get end-user multi-translation for basic edit (getTranslationForBasicEdit)
List<TranslationInfo> getTranslationInfos() // Get Translation info (getTranslationInfos)
```


## downloadFullTranslation

**GET** `/api/translation/full/{localeCode}/download`

Download end-user all-to-one translation (downloadFullTranslation)

Fetch the end-user translation for the specified locale. The result is a json file with merged user custom translation, system language translation and default locale translation.

```java
File downloadFullTranslation(DownloadFullTranslationArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DownloadFullTranslationArgs.builder()
        .localeCode(String)
        .build()
```

### `DownloadFullTranslationArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `localeCode` | `String` | **yes** | Locale code (e.g. 'en_US'). | |

### Return type

`File`


## getAvailableJavaLocales

**GET** `/api/translation/availableJavaLocales`

Get list of available java locales (getAvailableJavaLocales)

The result is map where key is locale code and value is locale language and country

```java
com.fasterxml.jackson.databind.JsonNode getAvailableJavaLocales()
```

### Return type

`com.fasterxml.jackson.databind.JsonNode`


## getAvailableLocales

**GET** `/api/translation/availableLocales`

Get list of available locales (getAvailableLocales)

Fetch the list of customized locales from all levels  Security check is performed to verify that the user has 'READ' permission for the white labeling resource.

```java
com.fasterxml.jackson.databind.JsonNode getAvailableLocales()
```

### Return type

`com.fasterxml.jackson.databind.JsonNode`


## getFullTranslation

**GET** `/api/translation/full/{localeCode}`

Get end-user all-to-one translation (getFullTranslation)

Fetch the end-user translation for specified locale. The result is the merge of user custom translation, system language translation and default locale translation.

```java
com.fasterxml.jackson.databind.JsonNode getFullTranslation(GetFullTranslationArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetFullTranslationArgs.builder()
        .localeCode(String)
        .build()
```

### `GetFullTranslationArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `localeCode` | `String` | **yes** | Locale code (e.g. 'en_US'). | |
| `ifNoneMatch` | `String` | no |  | |
| `acceptEncoding` | `String` | no |  | |

### Return type

`com.fasterxml.jackson.databind.JsonNode`


## getLoginPageTranslation

**GET** `/api/noauth/translation/login/{localeCode}`

Get system translation for login page

Fetch the end-user translation for specified locale.

```java
com.fasterxml.jackson.databind.JsonNode getLoginPageTranslation(GetLoginPageTranslationArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetLoginPageTranslationArgs.builder()
        .localeCode(String)
        .build()
```

### `GetLoginPageTranslationArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `localeCode` | `String` | **yes** | Locale code (e.g. 'en_US'). | |
| `ifNoneMatch` | `String` | no |  | |
| `acceptEncoding` | `String` | no |  | |

### Return type

`com.fasterxml.jackson.databind.JsonNode`


## getTranslationForBasicEdit

**GET** `/api/translation/edit/basic/{localeCode}`

Get end-user multi-translation for basic edit (getTranslationForBasicEdit)

Fetch the translation info map where value is info object containing key translation, origin translation, translation of parent level, translation status.

```java
com.fasterxml.jackson.databind.JsonNode getTranslationForBasicEdit(GetTranslationForBasicEditArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetTranslationForBasicEditArgs.builder()
        .localeCode(String)
        .build()
```

### `GetTranslationForBasicEditArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `localeCode` | `String` | **yes** |  | |

### Return type

`com.fasterxml.jackson.databind.JsonNode`


## getTranslationInfos

**GET** `/api/translation/info`

Get Translation info (getTranslationInfos)

Fetch the list of customized locales and corresponding details such as language display name, country display name and translation progress percentage.   Response example:   ```json [   {     \"localeCode\": \"uk_UA\",     \"language\": \"Ukrainian (українська)\",     \"country\": \"Україна\",     \"progress\": 32   },   {     \"localeCode\": \"es_ES\",     \"language\": \"Spanish (español)\",     \"country\": \"España\",     \"progress\": 79   }] ```  Security check is performed to verify that the user has 'READ' permission for the white labeling resource.

```java
List<TranslationInfo> getTranslationInfos()
```

### Return type

`List<TranslationInfo>`


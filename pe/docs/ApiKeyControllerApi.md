# ApiKeyControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void deleteApiKey(DeleteApiKeyArgs args) // Delete API key by ID (deleteApiKey)
ApiKeyInfo enableApiKey(EnableApiKeyArgs args) // Enable or disable API key (enableApiKey)
PageDataApiKeyInfo getUserApiKeys(GetUserApiKeysArgs args) // Get User Api Keys (getUserApiKeys)
ApiKey saveApiKey(SaveApiKeyArgs args) // Save API key for user (saveApiKey)
ApiKeyInfo updateApiKeyDescription(UpdateApiKeyDescriptionArgs args) // Update API key Description
```


## deleteApiKey

**DELETE** `/api/apiKey/{id}`

Delete API key by ID (deleteApiKey)

Deletes the API key. Referencing non-existing ApiKey Id will cause an error.  Available for any authorized user. 

```java
void deleteApiKey(DeleteApiKeyArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteApiKeyArgs.builder()
        .id(UUID)
        .build()
```

### `DeleteApiKeyArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `UUID` | **yes** |  | |

### Return type

null (empty response body)


## enableApiKey

**PUT** `/api/apiKey/{id}/enabled/{enabledValue}`

Enable or disable API key (enableApiKey)

Updates api key with enabled = true/false.   Available for any authorized user. 

```java
ApiKeyInfo enableApiKey(EnableApiKeyArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
EnableApiKeyArgs.builder()
        .id(UUID)
        .enabledValue(Boolean)
        .build()
```

### `EnableApiKeyArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `UUID` | **yes** | Unique identifier of the API key to enable/disable | |
| `enabledValue` | `Boolean` | **yes** | Enabled or disabled api key | |

### Return type

`ApiKeyInfo`


## getUserApiKeys

**GET** `/api/apiKeys/{userId}`

Get User Api Keys (getUserApiKeys)

Returns a page of api keys owned by user. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for any authorized user. 

```java
PageDataApiKeyInfo getUserApiKeys(GetUserApiKeysArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetUserApiKeysArgs.builder()
        .userId(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetUserApiKeysArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `userId` | `String` | **yes** | A string value representing the user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the description. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `expirationTime`, `description`, `enabled` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataApiKeyInfo`


## saveApiKey

**POST** `/api/apiKey`

Save API key for user (saveApiKey)

Creates an API key for the given user and returns the token ONCE as 'ApiKey {value}'.  Available for any authorized user. 

```java
ApiKey saveApiKey(SaveApiKeyArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveApiKeyArgs.builder()
        .apiKeyInfo(ApiKeyInfo)
        .build()
```

### `SaveApiKeyArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `apiKeyInfo` | `ApiKeyInfo` | **yes** |  | |

### Return type

`ApiKey`


## updateApiKeyDescription

**PUT** `/api/apiKey/{id}/description`

Update API key Description

Updates the description of the existing API key by apiKeyId. Only the description can be updated. Referencing a non-existing ApiKey Id will cause a 'Not Found' error.  Available for any authorized user. 

```java
ApiKeyInfo updateApiKeyDescription(UpdateApiKeyDescriptionArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UpdateApiKeyDescriptionArgs.builder()
        .id(UUID)
        .build()
```

### `UpdateApiKeyDescriptionArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `UUID` | **yes** | A string value representing the api key id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `body` | `String` | no |  | |

### Return type

`ApiKeyInfo`


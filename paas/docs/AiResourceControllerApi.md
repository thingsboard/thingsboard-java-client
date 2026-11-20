# AiResourceControllerApi

`ThingsboardClient` methods:

> Every method that takes input also has a request-object overload — `<method>(<Method>Args args)`,
> built via `<Method>Args.builder()...build()`. The `*Args` classes are nested in `ThingsboardApi`,
> e.g. `import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Prefer that overload in
> new code: adding an optional parameter to an endpoint changes the flat signatures documented
> below, but only adds a builder field to `*Args`.

```
void deleteAiResource(@Nonnull UUID resourceId) // deleteAiResource
byte[] downloadAiResource(@Nonnull UUID resourceId) // downloadAiResource
com.fasterxml.jackson.databind.JsonNode getAiResourcesConfig() // getAiResourcesConfig
com.fasterxml.jackson.databind.JsonNode uploadAiResource(@Nonnull File _file) // uploadAiResource
```


## deleteAiResource

```
void deleteAiResource(@Nonnull UUID resourceId)
```

**DELETE** `/api/ai/resources/{resourceId}`

deleteAiResource


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **resourceId** | **UUID** |  | |

### Return type

null (empty response body)


## downloadAiResource

```
byte[] downloadAiResource(@Nonnull UUID resourceId)
```

**GET** `/api/ai/resources/{resourceId}`

downloadAiResource


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **resourceId** | **UUID** |  | |

### Return type

**byte[]**


## getAiResourcesConfig

```
com.fasterxml.jackson.databind.JsonNode getAiResourcesConfig()
```

**GET** `/api/ai/resources/config`

getAiResourcesConfig

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## uploadAiResource

```
com.fasterxml.jackson.databind.JsonNode uploadAiResource(@Nonnull File _file)
```

**POST** `/api/ai/resources`

uploadAiResource


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_file** | **File** |  | |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


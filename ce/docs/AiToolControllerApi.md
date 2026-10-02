# AiToolControllerApi

`ThingsboardClient` methods:

> Every method that takes input also has a request-object overload — `<method>(<Method>Args args)`,
> built via `<Method>Args.builder()...build()`. The `*Args` classes are nested in `ThingsboardApi`,
> e.g. `import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Prefer that overload in
> new code: adding an optional parameter to an endpoint changes the flat signatures documented
> below, but only adds a builder field to `*Args`.

```
com.fasterxml.jackson.databind.JsonNode resolveToolApproval(@Nonnull Object body) // resolveToolApproval
```


## resolveToolApproval

```
com.fasterxml.jackson.databind.JsonNode resolveToolApproval(@Nonnull Object body)
```

**POST** `/api/ai/tools/resolve-approval`

resolveToolApproval


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object** |  | |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


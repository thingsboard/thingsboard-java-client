# AiDeviceDashboardControllerApi

`ThingsboardClient` methods:

> Every method that takes input also has a request-object overload — `<method>(<Method>Args args)`,
> built via `<Method>Args.builder()...build()`. The `*Args` classes are nested in `ThingsboardApi`,
> e.g. `import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Prefer that overload in
> new code: adding an optional parameter to an endpoint changes the flat signatures documented
> below, but only adds a builder field to `*Args`.

```
com.fasterxml.jackson.databind.JsonNode generateDashboard(@Nonnull UUID deviceId, @Nonnull String xAuthorization, @Nonnull Object body) // generateDashboard
```


## generateDashboard

```
com.fasterxml.jackson.databind.JsonNode generateDashboard(@Nonnull UUID deviceId, @Nonnull String xAuthorization, @Nonnull Object body)
```

**POST** `/api/ai/devices/{deviceId}/dashboard`

generateDashboard


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **UUID** |  | |
| **xAuthorization** | **String** |  | |
| **body** | **Object** |  | |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


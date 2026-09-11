# UsageInfoControllerApi

`ThingsboardClient` methods:

> Every method that takes input also has a request-object overload — `<method>(<Method>Args args)`,
> built via `<Method>Args.builder()...build()`. The `*Args` classes are nested in `ThingsboardApi`,
> e.g. `import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Prefer that overload in
> new code: adding an optional parameter to an endpoint changes the flat signatures documented
> below, but only adds a builder field to `*Args`.

```
UsageInfo getTenantUsageInfo() // getTenantUsageInfo
```


## getTenantUsageInfo

```
UsageInfo getTenantUsageInfo()
```

**GET** `/api/usage`

getTenantUsageInfo

### Return type

**UsageInfo**


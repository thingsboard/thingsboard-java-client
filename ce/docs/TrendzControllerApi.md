# TrendzControllerApi

`ThingsboardClient` methods:

> Every method that takes input also has a request-object overload — `<method>(<Method>Args args)`,
> built via `<Method>Args.builder()...build()`. The `*Args` classes are nested in `ThingsboardApi`,
> e.g. `import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Prefer that overload in
> new code: adding an optional parameter to an endpoint changes the flat signatures documented
> below, but only adds a builder field to `*Args`.

```
TrendzSettings getTrendzSettings() // Get Trendz Settings (getTrendzSettings)
TrendzSettings saveTrendzSettings(@Nonnull TrendzSettings trendzSettings) // Save Trendz settings (saveTrendzSettings)
```


## getTrendzSettings

```
TrendzSettings getTrendzSettings()
```

**GET** `/api/trendz/settings`

Get Trendz Settings (getTrendzSettings)

Retrieves Trendz settings for this tenant.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

### Return type

**TrendzSettings**


## saveTrendzSettings

```
TrendzSettings saveTrendzSettings(@Nonnull TrendzSettings trendzSettings)
```

**POST** `/api/trendz/settings`

Save Trendz settings (saveTrendzSettings)

Saves Trendz settings for this tenant.   Here is an example of the Trendz settings: ```json {   \"enabled\": true,   \"baseUrl\": \"https://some.domain.com:18888/also_necessary_prefix\" } ```  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **trendzSettings** | **TrendzSettings** |  | |

### Return type

**TrendzSettings**


# TrendzControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
TrendzSettings getTrendzSettings() // Get Trendz Settings (getTrendzSettings)
TrendzSettings saveTrendzSettings(SaveTrendzSettingsArgs args) // Save Trendz settings (saveTrendzSettings)
```


## getTrendzSettings

**GET** `/api/trendz/settings`

Get Trendz Settings (getTrendzSettings)

Retrieves Trendz settings for this tenant.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
TrendzSettings getTrendzSettings()
```

### Return type

`TrendzSettings`


## saveTrendzSettings

**POST** `/api/trendz/settings`

Save Trendz settings (saveTrendzSettings)

Saves Trendz settings for this tenant.   Here is an example of the Trendz settings: ```json {   \"enabled\": true,   \"baseUrl\": \"https://some.domain.com:18888/also_necessary_prefix\" } ```  Available for users with 'TENANT_ADMIN' authority.

```java
TrendzSettings saveTrendzSettings(SaveTrendzSettingsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveTrendzSettingsArgs.builder()
        .trendzSettings(TrendzSettings)
        .build()
```

### `SaveTrendzSettingsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `trendzSettings` | `TrendzSettings` | **yes** |  | |

### Return type

`TrendzSettings`


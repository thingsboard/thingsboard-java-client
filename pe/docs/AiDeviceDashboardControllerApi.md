# AiDeviceDashboardControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
com.fasterxml.jackson.databind.JsonNode generateDashboard(GenerateDashboardArgs args) // generateDashboard
```


## generateDashboard

**POST** `/api/ai/devices/{deviceId}/dashboard`

generateDashboard

```java
com.fasterxml.jackson.databind.JsonNode generateDashboard(GenerateDashboardArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GenerateDashboardArgs.builder()
        .deviceId(UUID)
        .xAuthorization(String)
        .body(Object)
        .build()
```

### `GenerateDashboardArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `deviceId` | `UUID` | **yes** |  | |
| `xAuthorization` | `String` | **yes** |  | |
| `body` | `Object` | **yes** |  | |

### Return type

`com.fasterxml.jackson.databind.JsonNode`


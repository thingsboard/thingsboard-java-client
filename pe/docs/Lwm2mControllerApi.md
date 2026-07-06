# Lwm2mControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
LwM2MServerSecurityConfigDefault getLwm2mBootstrapSecurityInfo(GetLwm2mBootstrapSecurityInfoArgs args) // Get Lwm2m Bootstrap SecurityInfo (getLwm2mBootstrapSecurityInfo)
Device saveLwm2mDeviceWithCredentials(SaveLwm2mDeviceWithCredentialsArgs args) // Save LwM2M device with credentials (saveLwm2mDeviceWithCredentials)
```


## getLwm2mBootstrapSecurityInfo

**GET** `/api/lwm2m/deviceProfile/bootstrap/{isBootstrapServer}`

Get Lwm2m Bootstrap SecurityInfo (getLwm2mBootstrapSecurityInfo)

Get the Lwm2m Bootstrap SecurityInfo object (of the current server) based on the provided isBootstrapServer parameter. If isBootstrapServer == true, get the parameters of the current Bootstrap Server. If isBootstrapServer == false, get the parameters of the current Lwm2m Server. Used for client settings when starting the client in Bootstrap mode.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
LwM2MServerSecurityConfigDefault getLwm2mBootstrapSecurityInfo(GetLwm2mBootstrapSecurityInfoArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetLwm2mBootstrapSecurityInfoArgs.builder()
        .isBootstrapServer(Boolean)
        .build()
```

### `GetLwm2mBootstrapSecurityInfoArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `isBootstrapServer` | `Boolean` | **yes** | A Boolean value representing the Server SecurityInfo for future Bootstrap client mode settings. Values: 'true' for Bootstrap Server; 'false' for Lwm2m Server.  | |

### Return type

`LwM2MServerSecurityConfigDefault`


## saveLwm2mDeviceWithCredentials

**POST** `/api/lwm2m/device-credentials`

Save LwM2M device with credentials (saveLwm2mDeviceWithCredentials)

Deprecated.

```java
Device saveLwm2mDeviceWithCredentials(SaveLwm2mDeviceWithCredentialsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveLwm2mDeviceWithCredentialsArgs.builder()
        .requestBody(Map<String, Object>)
        .build()
```

### `SaveLwm2mDeviceWithCredentialsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `requestBody` | `Map<String, Object>` | **yes** |  | |
| `entityGroupId` | `String` | no |  | |

### Return type

`Device`


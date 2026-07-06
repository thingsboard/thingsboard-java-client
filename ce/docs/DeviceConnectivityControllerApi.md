# DeviceConnectivityControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
File downloadGatewayDockerCompose(DownloadGatewayDockerComposeArgs args) // Download generated docker-compose.yml file for gateway (downloadGatewayDockerCompose)
File downloadServerCertificate(DownloadServerCertificateArgs args) // Download server certificate using file path defined in device.connectivity properties (downloadServerCertificate)
com.fasterxml.jackson.databind.JsonNode getDevicePublishTelemetryCommands(GetDevicePublishTelemetryCommandsArgs args) // Get commands to publish device telemetry (getDevicePublishTelemetryCommands)
```


## downloadGatewayDockerCompose

**GET** `/api/device-connectivity/gateway-launch/{deviceId}/docker-compose/download`

Download generated docker-compose.yml file for gateway (downloadGatewayDockerCompose)

Download generated docker-compose.yml for gateway.

```java
File downloadGatewayDockerCompose(DownloadGatewayDockerComposeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DownloadGatewayDockerComposeArgs.builder()
        .deviceId(String)
        .build()
```

### `DownloadGatewayDockerComposeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `deviceId` | `String` | **yes** | A string value representing the device id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`File`


## downloadServerCertificate

**GET** `/api/device-connectivity/{protocol}/certificate/download`

Download server certificate using file path defined in device.connectivity properties (downloadServerCertificate)

Download server certificate.

```java
File downloadServerCertificate(DownloadServerCertificateArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DownloadServerCertificateArgs.builder()
        .protocol(String)
        .build()
```

### `DownloadServerCertificateArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `protocol` | `String` | **yes** | A string value representing the device connectivity protocol. Possible values: 'mqtt', 'mqtts', 'http', 'https', 'coap', 'coaps' | |

### Return type

`File`


## getDevicePublishTelemetryCommands

**GET** `/api/device-connectivity/{deviceId}`

Get commands to publish device telemetry (getDevicePublishTelemetryCommands)

Fetch the list of commands to publish device telemetry based on device profile If the user has the authority of 'Tenant Administrator', the server checks that the device is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the device is assigned to the same customer.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
com.fasterxml.jackson.databind.JsonNode getDevicePublishTelemetryCommands(GetDevicePublishTelemetryCommandsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetDevicePublishTelemetryCommandsArgs.builder()
        .deviceId(String)
        .build()
```

### `GetDevicePublishTelemetryCommandsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `deviceId` | `String` | **yes** | A string value representing the device id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`com.fasterxml.jackson.databind.JsonNode`


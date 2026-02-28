# DeviceConnectivityControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downloadGatewayDockerCompose**](#downloadGatewayDockerCompose) | **GET** /api/device-connectivity/gateway-launch/{deviceId}/docker-compose/download | Download generated docker-compose.yml file for gateway (downloadGatewayDockerCompose) |
| [**downloadServerCertificate**](#downloadServerCertificate) | **GET** /api/device-connectivity/{protocol}/certificate/download | Download server certificate using file path defined in device.connectivity properties (downloadServerCertificate) |
| [**getDevicePublishTelemetryCommands**](#getDevicePublishTelemetryCommands) | **GET** /api/device-connectivity/{deviceId} | Get commands to publish device telemetry (getDevicePublishTelemetryCommands) |



## downloadGatewayDockerCompose

> File downloadGatewayDockerCompose(deviceId)

Download generated docker-compose.yml file for gateway (downloadGatewayDockerCompose)

Download generated docker-compose.yml for gateway.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String** | A string value representing the device id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## downloadServerCertificate

> File downloadServerCertificate(protocol)

Download server certificate using file path defined in device.connectivity properties (downloadServerCertificate)

Download server certificate.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **protocol** | **String** | A string value representing the device connectivity protocol. Possible values: &#39;mqtt&#39;, &#39;mqtts&#39;, &#39;http&#39;, &#39;https&#39;, &#39;coap&#39;, &#39;coaps&#39; | |


## getDevicePublishTelemetryCommands

> com.fasterxml.jackson.databind.JsonNode getDevicePublishTelemetryCommands(deviceId)

Get commands to publish device telemetry (getDevicePublishTelemetryCommands)

Fetch the list of commands to publish device telemetry based on device profile If the user has the authority of &#39;Tenant Administrator&#39;, the server checks that the device is owned by the same tenant. If the user has the authority of &#39;Customer User&#39;, the server checks that the device is assigned to the same customer.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String** | A string value representing the device id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


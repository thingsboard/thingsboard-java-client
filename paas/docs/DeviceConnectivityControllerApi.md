# DeviceConnectivityControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downloadGatewayDockerCompose**](DeviceConnectivityControllerApi.md#downloadGatewayDockerCompose) | **GET** /api/device-connectivity/gateway-launch/{deviceId}/docker-compose/download | Download generated docker-compose.yml file for gateway (downloadGatewayDockerCompose) |
| [**downloadServerCertificate**](DeviceConnectivityControllerApi.md#downloadServerCertificate) | **GET** /api/device-connectivity/{protocol}/certificate/download | Download server certificate using file path defined in device.connectivity properties (downloadServerCertificate) |
| [**getDevicePublishTelemetryCommands**](DeviceConnectivityControllerApi.md#getDevicePublishTelemetryCommands) | **GET** /api/device-connectivity/{deviceId} | Get commands to publish device telemetry (getDevicePublishTelemetryCommands) |



## downloadGatewayDockerCompose

> File downloadGatewayDockerCompose(deviceId)

Download generated docker-compose.yml file for gateway (downloadGatewayDockerCompose)

Download generated docker-compose.yml for gateway.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String**| A string value representing the device id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**File**](File.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## downloadServerCertificate

> File downloadServerCertificate(protocol)

Download server certificate using file path defined in device.connectivity properties (downloadServerCertificate)

Download server certificate.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **protocol** | **String**| A string value representing the device connectivity protocol. Possible values: &#39;mqtt&#39;, &#39;mqtts&#39;, &#39;http&#39;, &#39;https&#39;, &#39;coap&#39;, &#39;coaps&#39; | |

### Return type

[**File**](File.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getDevicePublishTelemetryCommands

> com.fasterxml.jackson.databind.JsonNode getDevicePublishTelemetryCommands(deviceId)

Get commands to publish device telemetry (getDevicePublishTelemetryCommands)

Fetch the list of commands to publish device telemetry based on device profile If the user has the authority of &#39;Tenant Administrator&#39;, the server checks that the device is owned by the same tenant. If the user has the authority of &#39;Customer User&#39;, the server checks that the device is assigned to the same customer.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String**| A string value representing the device id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**com.fasterxml.jackson.databind.JsonNode**](com.fasterxml.jackson.databind.JsonNode.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


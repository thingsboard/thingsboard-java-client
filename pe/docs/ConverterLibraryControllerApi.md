# ConverterLibraryControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDownlinkConverter**](ConverterLibraryControllerApi.md#getDownlinkConverter) | **GET** /api/converter/library/{integrationType}/{vendorName}/{model}/downlink | Get downlink converter (getDownlinkConverter) |
| [**getDownlinkConverterMetadata**](ConverterLibraryControllerApi.md#getDownlinkConverterMetadata) | **GET** /api/converter/library/{integrationType}/{vendorName}/{model}/downlink/metadata | Get downlink converter metadata (getDownlinkConverterMetadata) |
| [**getDownlinkPayload**](ConverterLibraryControllerApi.md#getDownlinkPayload) | **GET** /api/converter/library/{integrationType}/{vendorName}/{model}/downlink/payload | Get downlink payload (getDownlinkPayload) |
| [**getUplinkConverter**](ConverterLibraryControllerApi.md#getUplinkConverter) | **GET** /api/converter/library/{integrationType}/{vendorName}/{model}/uplink | Get uplink converter (getUplinkConverter) |
| [**getUplinkConverterMetadata**](ConverterLibraryControllerApi.md#getUplinkConverterMetadata) | **GET** /api/converter/library/{integrationType}/{vendorName}/{model}/uplink/metadata | Get uplink converter metadata (getUplinkConverterMetadata) |
| [**getUplinkPayload**](ConverterLibraryControllerApi.md#getUplinkPayload) | **GET** /api/converter/library/{integrationType}/{vendorName}/{model}/uplink/payload | Get uplink payload (getUplinkPayload) |
| [**getVendorModels**](ConverterLibraryControllerApi.md#getVendorModels) | **GET** /api/converter/library/{integrationType}/{vendorName}/models | Get vendor models (getVendorModels) |
| [**getVendors**](ConverterLibraryControllerApi.md#getVendors) | **GET** /api/converter/library/{integrationType}/vendors | Get vendors (getVendors) |



## getDownlinkConverter

> String getDownlinkConverter(integrationType, vendorName, model)

Get downlink converter (getDownlinkConverter)

Returns downlink converter body for the vendor, integration type and model

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationType** | [**IntegrationType**](.md)|  | [enum: OCEANCONNECT, SIGFOX, THINGPARK, TPE, CHIRPSTACK, PARTICLE, TMOBILE_IOT_CDP, HTTP, MQTT, PUB_SUB, AWS_IOT, AWS_SQS, AWS_KINESIS, TTN, TTI, AZURE_EVENT_HUB, OPC_UA, CUSTOM, UDP, TCP, KAFKA, AZURE_IOT_HUB, APACHE_PULSAR, RABBITMQ, LORIOT, COAP, TUYA, AZURE_SERVICE_BUS, KPN] |
| **vendorName** | **String**|  | |
| **model** | **String**|  | |

### Return type

**String**

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getDownlinkConverterMetadata

> String getDownlinkConverterMetadata(integrationType, vendorName, model)

Get downlink converter metadata (getDownlinkConverterMetadata)

Returns downlink converter metadata for the vendor, integration type and model

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationType** | [**IntegrationType**](.md)|  | [enum: OCEANCONNECT, SIGFOX, THINGPARK, TPE, CHIRPSTACK, PARTICLE, TMOBILE_IOT_CDP, HTTP, MQTT, PUB_SUB, AWS_IOT, AWS_SQS, AWS_KINESIS, TTN, TTI, AZURE_EVENT_HUB, OPC_UA, CUSTOM, UDP, TCP, KAFKA, AZURE_IOT_HUB, APACHE_PULSAR, RABBITMQ, LORIOT, COAP, TUYA, AZURE_SERVICE_BUS, KPN] |
| **vendorName** | **String**|  | |
| **model** | **String**|  | |

### Return type

**String**

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getDownlinkPayload

> String getDownlinkPayload(integrationType, vendorName, model)

Get downlink payload (getDownlinkPayload)

Returns payload example for the downlink converter for the vendor, integration type and model

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationType** | [**IntegrationType**](.md)|  | [enum: OCEANCONNECT, SIGFOX, THINGPARK, TPE, CHIRPSTACK, PARTICLE, TMOBILE_IOT_CDP, HTTP, MQTT, PUB_SUB, AWS_IOT, AWS_SQS, AWS_KINESIS, TTN, TTI, AZURE_EVENT_HUB, OPC_UA, CUSTOM, UDP, TCP, KAFKA, AZURE_IOT_HUB, APACHE_PULSAR, RABBITMQ, LORIOT, COAP, TUYA, AZURE_SERVICE_BUS, KPN] |
| **vendorName** | **String**|  | |
| **model** | **String**|  | |

### Return type

**String**

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getUplinkConverter

> String getUplinkConverter(integrationType, vendorName, model)

Get uplink converter (getUplinkConverter)

Returns uplink converter body for the vendor, integration type and model

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationType** | [**IntegrationType**](.md)|  | [enum: OCEANCONNECT, SIGFOX, THINGPARK, TPE, CHIRPSTACK, PARTICLE, TMOBILE_IOT_CDP, HTTP, MQTT, PUB_SUB, AWS_IOT, AWS_SQS, AWS_KINESIS, TTN, TTI, AZURE_EVENT_HUB, OPC_UA, CUSTOM, UDP, TCP, KAFKA, AZURE_IOT_HUB, APACHE_PULSAR, RABBITMQ, LORIOT, COAP, TUYA, AZURE_SERVICE_BUS, KPN] |
| **vendorName** | **String**|  | |
| **model** | **String**|  | |

### Return type

**String**

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getUplinkConverterMetadata

> String getUplinkConverterMetadata(integrationType, vendorName, model)

Get uplink converter metadata (getUplinkConverterMetadata)

Returns uplink converter metadata for the vendor, integration type and model

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationType** | [**IntegrationType**](.md)|  | [enum: OCEANCONNECT, SIGFOX, THINGPARK, TPE, CHIRPSTACK, PARTICLE, TMOBILE_IOT_CDP, HTTP, MQTT, PUB_SUB, AWS_IOT, AWS_SQS, AWS_KINESIS, TTN, TTI, AZURE_EVENT_HUB, OPC_UA, CUSTOM, UDP, TCP, KAFKA, AZURE_IOT_HUB, APACHE_PULSAR, RABBITMQ, LORIOT, COAP, TUYA, AZURE_SERVICE_BUS, KPN] |
| **vendorName** | **String**|  | |
| **model** | **String**|  | |

### Return type

**String**

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getUplinkPayload

> String getUplinkPayload(integrationType, vendorName, model)

Get uplink payload (getUplinkPayload)

Returns payload example for the uplink converter for the vendor, integration type and model

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationType** | [**IntegrationType**](.md)|  | [enum: OCEANCONNECT, SIGFOX, THINGPARK, TPE, CHIRPSTACK, PARTICLE, TMOBILE_IOT_CDP, HTTP, MQTT, PUB_SUB, AWS_IOT, AWS_SQS, AWS_KINESIS, TTN, TTI, AZURE_EVENT_HUB, OPC_UA, CUSTOM, UDP, TCP, KAFKA, AZURE_IOT_HUB, APACHE_PULSAR, RABBITMQ, LORIOT, COAP, TUYA, AZURE_SERVICE_BUS, KPN] |
| **vendorName** | **String**|  | |
| **model** | **String**|  | |

### Return type

**String**

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getVendorModels

> List&lt;Model&gt; getVendorModels(integrationType, vendorName, converterType, page, pageSize, loadImages)

Get vendor models (getVendorModels)

Returns a list of models for the vendor, integration type and converter type

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationType** | [**IntegrationType**](.md)|  | [enum: OCEANCONNECT, SIGFOX, THINGPARK, TPE, CHIRPSTACK, PARTICLE, TMOBILE_IOT_CDP, HTTP, MQTT, PUB_SUB, AWS_IOT, AWS_SQS, AWS_KINESIS, TTN, TTI, AZURE_EVENT_HUB, OPC_UA, CUSTOM, UDP, TCP, KAFKA, AZURE_IOT_HUB, APACHE_PULSAR, RABBITMQ, LORIOT, COAP, TUYA, AZURE_SERVICE_BUS, KPN] |
| **vendorName** | **String**|  | |
| **converterType** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] [default to 0] |
| **pageSize** | **Integer**|  | [optional] [default to 2147483647] |
| **loadImages** | **Boolean**|  | [optional] [default to true] |

### Return type

[**List&lt;Model&gt;**](Model.md)

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


## getVendors

> List&lt;Vendor&gt; getVendors(integrationType, converterType, page, pageSize, loadImages)

Get vendors (getVendors)

Returns a list of vendors for the integration type

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationType** | [**IntegrationType**](.md)|  | [enum: OCEANCONNECT, SIGFOX, THINGPARK, TPE, CHIRPSTACK, PARTICLE, TMOBILE_IOT_CDP, HTTP, MQTT, PUB_SUB, AWS_IOT, AWS_SQS, AWS_KINESIS, TTN, TTI, AZURE_EVENT_HUB, OPC_UA, CUSTOM, UDP, TCP, KAFKA, AZURE_IOT_HUB, APACHE_PULSAR, RABBITMQ, LORIOT, COAP, TUYA, AZURE_SERVICE_BUS, KPN] |
| **converterType** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] [default to 0] |
| **pageSize** | **Integer**|  | [optional] [default to 2147483647] |
| **loadImages** | **Boolean**|  | [optional] [default to true] |

### Return type

[**List&lt;Vendor&gt;**](Vendor.md)

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


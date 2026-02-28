# ConverterLibraryControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDownlinkConverter**](#getDownlinkConverter) | **GET** /api/converter/library/{integrationType}/{vendorName}/{model}/downlink | Get downlink converter (getDownlinkConverter) |
| [**getDownlinkConverterMetadata**](#getDownlinkConverterMetadata) | **GET** /api/converter/library/{integrationType}/{vendorName}/{model}/downlink/metadata | Get downlink converter metadata (getDownlinkConverterMetadata) |
| [**getDownlinkPayload**](#getDownlinkPayload) | **GET** /api/converter/library/{integrationType}/{vendorName}/{model}/downlink/payload | Get downlink payload (getDownlinkPayload) |
| [**getUplinkConverter**](#getUplinkConverter) | **GET** /api/converter/library/{integrationType}/{vendorName}/{model}/uplink | Get uplink converter (getUplinkConverter) |
| [**getUplinkConverterMetadata**](#getUplinkConverterMetadata) | **GET** /api/converter/library/{integrationType}/{vendorName}/{model}/uplink/metadata | Get uplink converter metadata (getUplinkConverterMetadata) |
| [**getUplinkPayload**](#getUplinkPayload) | **GET** /api/converter/library/{integrationType}/{vendorName}/{model}/uplink/payload | Get uplink payload (getUplinkPayload) |
| [**getVendorModels**](#getVendorModels) | **GET** /api/converter/library/{integrationType}/{vendorName}/models | Get vendor models (getVendorModels) |
| [**getVendors**](#getVendors) | **GET** /api/converter/library/{integrationType}/vendors | Get vendors (getVendors) |



## getDownlinkConverter

> String getDownlinkConverter(integrationType, vendorName, model)

Get downlink converter (getDownlinkConverter)

Returns downlink converter body for the vendor, integration type and model

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationType** | **IntegrationType** |  | [enum: OCEANCONNECT, SIGFOX, THINGPARK, TPE, CHIRPSTACK, PARTICLE, TMOBILE_IOT_CDP, HTTP, MQTT, PUB_SUB, AWS_IOT, AWS_SQS, AWS_KINESIS, TTN, TTI, AZURE_EVENT_HUB, OPC_UA, CUSTOM, UDP, TCP, KAFKA, AZURE_IOT_HUB, APACHE_PULSAR, RABBITMQ, LORIOT, COAP, TUYA, AZURE_SERVICE_BUS, KPN] |
| **vendorName** | **String** |  | |
| **model** | **String** |  | |


## getDownlinkConverterMetadata

> String getDownlinkConverterMetadata(integrationType, vendorName, model)

Get downlink converter metadata (getDownlinkConverterMetadata)

Returns downlink converter metadata for the vendor, integration type and model

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationType** | **IntegrationType** |  | [enum: OCEANCONNECT, SIGFOX, THINGPARK, TPE, CHIRPSTACK, PARTICLE, TMOBILE_IOT_CDP, HTTP, MQTT, PUB_SUB, AWS_IOT, AWS_SQS, AWS_KINESIS, TTN, TTI, AZURE_EVENT_HUB, OPC_UA, CUSTOM, UDP, TCP, KAFKA, AZURE_IOT_HUB, APACHE_PULSAR, RABBITMQ, LORIOT, COAP, TUYA, AZURE_SERVICE_BUS, KPN] |
| **vendorName** | **String** |  | |
| **model** | **String** |  | |


## getDownlinkPayload

> String getDownlinkPayload(integrationType, vendorName, model)

Get downlink payload (getDownlinkPayload)

Returns payload example for the downlink converter for the vendor, integration type and model

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationType** | **IntegrationType** |  | [enum: OCEANCONNECT, SIGFOX, THINGPARK, TPE, CHIRPSTACK, PARTICLE, TMOBILE_IOT_CDP, HTTP, MQTT, PUB_SUB, AWS_IOT, AWS_SQS, AWS_KINESIS, TTN, TTI, AZURE_EVENT_HUB, OPC_UA, CUSTOM, UDP, TCP, KAFKA, AZURE_IOT_HUB, APACHE_PULSAR, RABBITMQ, LORIOT, COAP, TUYA, AZURE_SERVICE_BUS, KPN] |
| **vendorName** | **String** |  | |
| **model** | **String** |  | |


## getUplinkConverter

> String getUplinkConverter(integrationType, vendorName, model)

Get uplink converter (getUplinkConverter)

Returns uplink converter body for the vendor, integration type and model

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationType** | **IntegrationType** |  | [enum: OCEANCONNECT, SIGFOX, THINGPARK, TPE, CHIRPSTACK, PARTICLE, TMOBILE_IOT_CDP, HTTP, MQTT, PUB_SUB, AWS_IOT, AWS_SQS, AWS_KINESIS, TTN, TTI, AZURE_EVENT_HUB, OPC_UA, CUSTOM, UDP, TCP, KAFKA, AZURE_IOT_HUB, APACHE_PULSAR, RABBITMQ, LORIOT, COAP, TUYA, AZURE_SERVICE_BUS, KPN] |
| **vendorName** | **String** |  | |
| **model** | **String** |  | |


## getUplinkConverterMetadata

> String getUplinkConverterMetadata(integrationType, vendorName, model)

Get uplink converter metadata (getUplinkConverterMetadata)

Returns uplink converter metadata for the vendor, integration type and model

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationType** | **IntegrationType** |  | [enum: OCEANCONNECT, SIGFOX, THINGPARK, TPE, CHIRPSTACK, PARTICLE, TMOBILE_IOT_CDP, HTTP, MQTT, PUB_SUB, AWS_IOT, AWS_SQS, AWS_KINESIS, TTN, TTI, AZURE_EVENT_HUB, OPC_UA, CUSTOM, UDP, TCP, KAFKA, AZURE_IOT_HUB, APACHE_PULSAR, RABBITMQ, LORIOT, COAP, TUYA, AZURE_SERVICE_BUS, KPN] |
| **vendorName** | **String** |  | |
| **model** | **String** |  | |


## getUplinkPayload

> String getUplinkPayload(integrationType, vendorName, model)

Get uplink payload (getUplinkPayload)

Returns payload example for the uplink converter for the vendor, integration type and model

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationType** | **IntegrationType** |  | [enum: OCEANCONNECT, SIGFOX, THINGPARK, TPE, CHIRPSTACK, PARTICLE, TMOBILE_IOT_CDP, HTTP, MQTT, PUB_SUB, AWS_IOT, AWS_SQS, AWS_KINESIS, TTN, TTI, AZURE_EVENT_HUB, OPC_UA, CUSTOM, UDP, TCP, KAFKA, AZURE_IOT_HUB, APACHE_PULSAR, RABBITMQ, LORIOT, COAP, TUYA, AZURE_SERVICE_BUS, KPN] |
| **vendorName** | **String** |  | |
| **model** | **String** |  | |


## getVendorModels

> List&lt;Model&gt; getVendorModels(integrationType, vendorName, converterType, page, pageSize, loadImages)

Get vendor models (getVendorModels)

Returns a list of models for the vendor, integration type and converter type

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationType** | **IntegrationType** |  | [enum: OCEANCONNECT, SIGFOX, THINGPARK, TPE, CHIRPSTACK, PARTICLE, TMOBILE_IOT_CDP, HTTP, MQTT, PUB_SUB, AWS_IOT, AWS_SQS, AWS_KINESIS, TTN, TTI, AZURE_EVENT_HUB, OPC_UA, CUSTOM, UDP, TCP, KAFKA, AZURE_IOT_HUB, APACHE_PULSAR, RABBITMQ, LORIOT, COAP, TUYA, AZURE_SERVICE_BUS, KPN] |
| **vendorName** | **String** |  | |
| **converterType** | **String** |  | [optional] |
| **page** | **Integer** |  | [optional] [default to 0] |
| **pageSize** | **Integer** |  | [optional] [default to 2147483647] |
| **loadImages** | **Boolean** |  | [optional] [default to true] |


## getVendors

> List&lt;Vendor&gt; getVendors(integrationType, converterType, page, pageSize, loadImages)

Get vendors (getVendors)

Returns a list of vendors for the integration type

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationType** | **IntegrationType** |  | [enum: OCEANCONNECT, SIGFOX, THINGPARK, TPE, CHIRPSTACK, PARTICLE, TMOBILE_IOT_CDP, HTTP, MQTT, PUB_SUB, AWS_IOT, AWS_SQS, AWS_KINESIS, TTN, TTI, AZURE_EVENT_HUB, OPC_UA, CUSTOM, UDP, TCP, KAFKA, AZURE_IOT_HUB, APACHE_PULSAR, RABBITMQ, LORIOT, COAP, TUYA, AZURE_SERVICE_BUS, KPN] |
| **converterType** | **String** |  | [optional] |
| **page** | **Integer** |  | [optional] [default to 0] |
| **pageSize** | **Integer** |  | [optional] [default to 2147483647] |
| **loadImages** | **Boolean** |  | [optional] [default to true] |


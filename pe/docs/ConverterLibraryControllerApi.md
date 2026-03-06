# ConverterLibraryControllerApi

`ThingsboardClient` methods:

```
String getDownlinkConverter(@Nonnull IntegrationType integrationType, @Nonnull String vendorName, @Nonnull String model) // Get downlink converter (getDownlinkConverter)
String getDownlinkConverterMetadata(@Nonnull IntegrationType integrationType, @Nonnull String vendorName, @Nonnull String model) // Get downlink converter metadata (getDownlinkConverterMetadata)
String getDownlinkPayload(@Nonnull IntegrationType integrationType, @Nonnull String vendorName, @Nonnull String model) // Get downlink payload (getDownlinkPayload)
String getUplinkConverter(@Nonnull IntegrationType integrationType, @Nonnull String vendorName, @Nonnull String model) // Get uplink converter (getUplinkConverter)
String getUplinkConverterMetadata(@Nonnull IntegrationType integrationType, @Nonnull String vendorName, @Nonnull String model) // Get uplink converter metadata (getUplinkConverterMetadata)
String getUplinkPayload(@Nonnull IntegrationType integrationType, @Nonnull String vendorName, @Nonnull String model) // Get uplink payload (getUplinkPayload)
List<Model> getVendorModels(@Nonnull IntegrationType integrationType, @Nonnull String vendorName, @Nullable String converterType, @Nullable Integer page, @Nullable Integer pageSize, @Nullable Boolean loadImages) // Get vendor models (getVendorModels)
List<Vendor> getVendors(@Nonnull IntegrationType integrationType, @Nullable String converterType, @Nullable Integer page, @Nullable Integer pageSize, @Nullable Boolean loadImages) // Get vendors (getVendors)
```


## getDownlinkConverter

```
String getDownlinkConverter(@Nonnull IntegrationType integrationType, @Nonnull String vendorName, @Nonnull String model)
```

**GET** `/api/converter/library/{integrationType}/{vendorName}/{model}/downlink`

Get downlink converter (getDownlinkConverter)

Returns downlink converter body for the vendor, integration type and model


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationType** | **IntegrationType** |  | [enum: OCEANCONNECT, SIGFOX, THINGPARK, TPE, CHIRPSTACK, PARTICLE, TMOBILE_IOT_CDP, HTTP, MQTT, PUB_SUB, AWS_IOT, AWS_SQS, AWS_KINESIS, TTN, TTI, AZURE_EVENT_HUB, OPC_UA, CUSTOM, UDP, TCP, KAFKA, AZURE_IOT_HUB, APACHE_PULSAR, RABBITMQ, LORIOT, COAP, TUYA, AZURE_SERVICE_BUS, KPN] |
| **vendorName** | **String** |  | |
| **model** | **String** |  | |

### Return type

**String**


## getDownlinkConverterMetadata

```
String getDownlinkConverterMetadata(@Nonnull IntegrationType integrationType, @Nonnull String vendorName, @Nonnull String model)
```

**GET** `/api/converter/library/{integrationType}/{vendorName}/{model}/downlink/metadata`

Get downlink converter metadata (getDownlinkConverterMetadata)

Returns downlink converter metadata for the vendor, integration type and model


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationType** | **IntegrationType** |  | [enum: OCEANCONNECT, SIGFOX, THINGPARK, TPE, CHIRPSTACK, PARTICLE, TMOBILE_IOT_CDP, HTTP, MQTT, PUB_SUB, AWS_IOT, AWS_SQS, AWS_KINESIS, TTN, TTI, AZURE_EVENT_HUB, OPC_UA, CUSTOM, UDP, TCP, KAFKA, AZURE_IOT_HUB, APACHE_PULSAR, RABBITMQ, LORIOT, COAP, TUYA, AZURE_SERVICE_BUS, KPN] |
| **vendorName** | **String** |  | |
| **model** | **String** |  | |

### Return type

**String**


## getDownlinkPayload

```
String getDownlinkPayload(@Nonnull IntegrationType integrationType, @Nonnull String vendorName, @Nonnull String model)
```

**GET** `/api/converter/library/{integrationType}/{vendorName}/{model}/downlink/payload`

Get downlink payload (getDownlinkPayload)

Returns payload example for the downlink converter for the vendor, integration type and model


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationType** | **IntegrationType** |  | [enum: OCEANCONNECT, SIGFOX, THINGPARK, TPE, CHIRPSTACK, PARTICLE, TMOBILE_IOT_CDP, HTTP, MQTT, PUB_SUB, AWS_IOT, AWS_SQS, AWS_KINESIS, TTN, TTI, AZURE_EVENT_HUB, OPC_UA, CUSTOM, UDP, TCP, KAFKA, AZURE_IOT_HUB, APACHE_PULSAR, RABBITMQ, LORIOT, COAP, TUYA, AZURE_SERVICE_BUS, KPN] |
| **vendorName** | **String** |  | |
| **model** | **String** |  | |

### Return type

**String**


## getUplinkConverter

```
String getUplinkConverter(@Nonnull IntegrationType integrationType, @Nonnull String vendorName, @Nonnull String model)
```

**GET** `/api/converter/library/{integrationType}/{vendorName}/{model}/uplink`

Get uplink converter (getUplinkConverter)

Returns uplink converter body for the vendor, integration type and model


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationType** | **IntegrationType** |  | [enum: OCEANCONNECT, SIGFOX, THINGPARK, TPE, CHIRPSTACK, PARTICLE, TMOBILE_IOT_CDP, HTTP, MQTT, PUB_SUB, AWS_IOT, AWS_SQS, AWS_KINESIS, TTN, TTI, AZURE_EVENT_HUB, OPC_UA, CUSTOM, UDP, TCP, KAFKA, AZURE_IOT_HUB, APACHE_PULSAR, RABBITMQ, LORIOT, COAP, TUYA, AZURE_SERVICE_BUS, KPN] |
| **vendorName** | **String** |  | |
| **model** | **String** |  | |

### Return type

**String**


## getUplinkConverterMetadata

```
String getUplinkConverterMetadata(@Nonnull IntegrationType integrationType, @Nonnull String vendorName, @Nonnull String model)
```

**GET** `/api/converter/library/{integrationType}/{vendorName}/{model}/uplink/metadata`

Get uplink converter metadata (getUplinkConverterMetadata)

Returns uplink converter metadata for the vendor, integration type and model


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationType** | **IntegrationType** |  | [enum: OCEANCONNECT, SIGFOX, THINGPARK, TPE, CHIRPSTACK, PARTICLE, TMOBILE_IOT_CDP, HTTP, MQTT, PUB_SUB, AWS_IOT, AWS_SQS, AWS_KINESIS, TTN, TTI, AZURE_EVENT_HUB, OPC_UA, CUSTOM, UDP, TCP, KAFKA, AZURE_IOT_HUB, APACHE_PULSAR, RABBITMQ, LORIOT, COAP, TUYA, AZURE_SERVICE_BUS, KPN] |
| **vendorName** | **String** |  | |
| **model** | **String** |  | |

### Return type

**String**


## getUplinkPayload

```
String getUplinkPayload(@Nonnull IntegrationType integrationType, @Nonnull String vendorName, @Nonnull String model)
```

**GET** `/api/converter/library/{integrationType}/{vendorName}/{model}/uplink/payload`

Get uplink payload (getUplinkPayload)

Returns payload example for the uplink converter for the vendor, integration type and model


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationType** | **IntegrationType** |  | [enum: OCEANCONNECT, SIGFOX, THINGPARK, TPE, CHIRPSTACK, PARTICLE, TMOBILE_IOT_CDP, HTTP, MQTT, PUB_SUB, AWS_IOT, AWS_SQS, AWS_KINESIS, TTN, TTI, AZURE_EVENT_HUB, OPC_UA, CUSTOM, UDP, TCP, KAFKA, AZURE_IOT_HUB, APACHE_PULSAR, RABBITMQ, LORIOT, COAP, TUYA, AZURE_SERVICE_BUS, KPN] |
| **vendorName** | **String** |  | |
| **model** | **String** |  | |

### Return type

**String**


## getVendorModels

```
List<Model> getVendorModels(@Nonnull IntegrationType integrationType, @Nonnull String vendorName, @Nullable String converterType, @Nullable Integer page, @Nullable Integer pageSize, @Nullable Boolean loadImages)
```

**GET** `/api/converter/library/{integrationType}/{vendorName}/models`

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

### Return type

**List<Model>**


## getVendors

```
List<Vendor> getVendors(@Nonnull IntegrationType integrationType, @Nullable String converterType, @Nullable Integer page, @Nullable Integer pageSize, @Nullable Boolean loadImages)
```

**GET** `/api/converter/library/{integrationType}/vendors`

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

### Return type

**List<Vendor>**


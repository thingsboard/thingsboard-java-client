# ConverterLibraryControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
String getDownlinkConverter(GetDownlinkConverterArgs args) // Get downlink converter (getDownlinkConverter)
String getDownlinkConverterMetadata(GetDownlinkConverterMetadataArgs args) // Get downlink converter metadata (getDownlinkConverterMetadata)
String getDownlinkPayload(GetDownlinkPayloadArgs args) // Get downlink payload (getDownlinkPayload)
String getUplinkConverter(GetUplinkConverterArgs args) // Get uplink converter (getUplinkConverter)
String getUplinkConverterMetadata(GetUplinkConverterMetadataArgs args) // Get uplink converter metadata (getUplinkConverterMetadata)
String getUplinkPayload(GetUplinkPayloadArgs args) // Get uplink payload (getUplinkPayload)
List<Model> getVendorModels(GetVendorModelsArgs args) // Get vendor models (getVendorModels)
List<Vendor> getVendors(GetVendorsArgs args) // Get vendors (getVendors)
```


## getDownlinkConverter

**GET** `/api/converter/library/{integrationType}/{vendorName}/{model}/downlink`

Get downlink converter (getDownlinkConverter)

Returns downlink converter body for the vendor, integration type and model

```java
String getDownlinkConverter(GetDownlinkConverterArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetDownlinkConverterArgs.builder()
        .integrationType(IntegrationType)
        .vendorName(String)
        .model(String)
        .build()
```

### `GetDownlinkConverterArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `integrationType` | `IntegrationType` | **yes** |  | enum: `OCEANCONNECT`, `SIGFOX`, `THINGPARK`, `TPE`, `CHIRPSTACK`, `PARTICLE`, `TMOBILE_IOT_CDP`, `HTTP`, `MQTT`, `PUB_SUB`, `AWS_IOT`, `AWS_SQS`, `AWS_KINESIS`, `TTN`, `TTI`, `AZURE_EVENT_HUB`, `OPC_UA`, `CUSTOM`, `UDP`, `TCP`, `KAFKA`, `AZURE_IOT_HUB`, `APACHE_PULSAR`, `RABBITMQ`, `LORIOT`, `COAP`, `TUYA`, `AZURE_SERVICE_BUS`, `KPN` |
| `vendorName` | `String` | **yes** |  | |
| `model` | `String` | **yes** |  | |

### Return type

`String`


## getDownlinkConverterMetadata

**GET** `/api/converter/library/{integrationType}/{vendorName}/{model}/downlink/metadata`

Get downlink converter metadata (getDownlinkConverterMetadata)

Returns downlink converter metadata for the vendor, integration type and model

```java
String getDownlinkConverterMetadata(GetDownlinkConverterMetadataArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetDownlinkConverterMetadataArgs.builder()
        .integrationType(IntegrationType)
        .vendorName(String)
        .model(String)
        .build()
```

### `GetDownlinkConverterMetadataArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `integrationType` | `IntegrationType` | **yes** |  | enum: `OCEANCONNECT`, `SIGFOX`, `THINGPARK`, `TPE`, `CHIRPSTACK`, `PARTICLE`, `TMOBILE_IOT_CDP`, `HTTP`, `MQTT`, `PUB_SUB`, `AWS_IOT`, `AWS_SQS`, `AWS_KINESIS`, `TTN`, `TTI`, `AZURE_EVENT_HUB`, `OPC_UA`, `CUSTOM`, `UDP`, `TCP`, `KAFKA`, `AZURE_IOT_HUB`, `APACHE_PULSAR`, `RABBITMQ`, `LORIOT`, `COAP`, `TUYA`, `AZURE_SERVICE_BUS`, `KPN` |
| `vendorName` | `String` | **yes** |  | |
| `model` | `String` | **yes** |  | |

### Return type

`String`


## getDownlinkPayload

**GET** `/api/converter/library/{integrationType}/{vendorName}/{model}/downlink/payload`

Get downlink payload (getDownlinkPayload)

Returns payload example for the downlink converter for the vendor, integration type and model

```java
String getDownlinkPayload(GetDownlinkPayloadArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetDownlinkPayloadArgs.builder()
        .integrationType(IntegrationType)
        .vendorName(String)
        .model(String)
        .build()
```

### `GetDownlinkPayloadArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `integrationType` | `IntegrationType` | **yes** |  | enum: `OCEANCONNECT`, `SIGFOX`, `THINGPARK`, `TPE`, `CHIRPSTACK`, `PARTICLE`, `TMOBILE_IOT_CDP`, `HTTP`, `MQTT`, `PUB_SUB`, `AWS_IOT`, `AWS_SQS`, `AWS_KINESIS`, `TTN`, `TTI`, `AZURE_EVENT_HUB`, `OPC_UA`, `CUSTOM`, `UDP`, `TCP`, `KAFKA`, `AZURE_IOT_HUB`, `APACHE_PULSAR`, `RABBITMQ`, `LORIOT`, `COAP`, `TUYA`, `AZURE_SERVICE_BUS`, `KPN` |
| `vendorName` | `String` | **yes** |  | |
| `model` | `String` | **yes** |  | |

### Return type

`String`


## getUplinkConverter

**GET** `/api/converter/library/{integrationType}/{vendorName}/{model}/uplink`

Get uplink converter (getUplinkConverter)

Returns uplink converter body for the vendor, integration type and model

```java
String getUplinkConverter(GetUplinkConverterArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetUplinkConverterArgs.builder()
        .integrationType(IntegrationType)
        .vendorName(String)
        .model(String)
        .build()
```

### `GetUplinkConverterArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `integrationType` | `IntegrationType` | **yes** |  | enum: `OCEANCONNECT`, `SIGFOX`, `THINGPARK`, `TPE`, `CHIRPSTACK`, `PARTICLE`, `TMOBILE_IOT_CDP`, `HTTP`, `MQTT`, `PUB_SUB`, `AWS_IOT`, `AWS_SQS`, `AWS_KINESIS`, `TTN`, `TTI`, `AZURE_EVENT_HUB`, `OPC_UA`, `CUSTOM`, `UDP`, `TCP`, `KAFKA`, `AZURE_IOT_HUB`, `APACHE_PULSAR`, `RABBITMQ`, `LORIOT`, `COAP`, `TUYA`, `AZURE_SERVICE_BUS`, `KPN` |
| `vendorName` | `String` | **yes** |  | |
| `model` | `String` | **yes** |  | |

### Return type

`String`


## getUplinkConverterMetadata

**GET** `/api/converter/library/{integrationType}/{vendorName}/{model}/uplink/metadata`

Get uplink converter metadata (getUplinkConverterMetadata)

Returns uplink converter metadata for the vendor, integration type and model

```java
String getUplinkConverterMetadata(GetUplinkConverterMetadataArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetUplinkConverterMetadataArgs.builder()
        .integrationType(IntegrationType)
        .vendorName(String)
        .model(String)
        .build()
```

### `GetUplinkConverterMetadataArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `integrationType` | `IntegrationType` | **yes** |  | enum: `OCEANCONNECT`, `SIGFOX`, `THINGPARK`, `TPE`, `CHIRPSTACK`, `PARTICLE`, `TMOBILE_IOT_CDP`, `HTTP`, `MQTT`, `PUB_SUB`, `AWS_IOT`, `AWS_SQS`, `AWS_KINESIS`, `TTN`, `TTI`, `AZURE_EVENT_HUB`, `OPC_UA`, `CUSTOM`, `UDP`, `TCP`, `KAFKA`, `AZURE_IOT_HUB`, `APACHE_PULSAR`, `RABBITMQ`, `LORIOT`, `COAP`, `TUYA`, `AZURE_SERVICE_BUS`, `KPN` |
| `vendorName` | `String` | **yes** |  | |
| `model` | `String` | **yes** |  | |

### Return type

`String`


## getUplinkPayload

**GET** `/api/converter/library/{integrationType}/{vendorName}/{model}/uplink/payload`

Get uplink payload (getUplinkPayload)

Returns payload example for the uplink converter for the vendor, integration type and model

```java
String getUplinkPayload(GetUplinkPayloadArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetUplinkPayloadArgs.builder()
        .integrationType(IntegrationType)
        .vendorName(String)
        .model(String)
        .build()
```

### `GetUplinkPayloadArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `integrationType` | `IntegrationType` | **yes** |  | enum: `OCEANCONNECT`, `SIGFOX`, `THINGPARK`, `TPE`, `CHIRPSTACK`, `PARTICLE`, `TMOBILE_IOT_CDP`, `HTTP`, `MQTT`, `PUB_SUB`, `AWS_IOT`, `AWS_SQS`, `AWS_KINESIS`, `TTN`, `TTI`, `AZURE_EVENT_HUB`, `OPC_UA`, `CUSTOM`, `UDP`, `TCP`, `KAFKA`, `AZURE_IOT_HUB`, `APACHE_PULSAR`, `RABBITMQ`, `LORIOT`, `COAP`, `TUYA`, `AZURE_SERVICE_BUS`, `KPN` |
| `vendorName` | `String` | **yes** |  | |
| `model` | `String` | **yes** |  | |

### Return type

`String`


## getVendorModels

**GET** `/api/converter/library/{integrationType}/{vendorName}/models`

Get vendor models (getVendorModels)

Returns a list of models for the vendor, integration type and converter type

```java
List<Model> getVendorModels(GetVendorModelsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetVendorModelsArgs.builder()
        .integrationType(IntegrationType)
        .vendorName(String)
        .build()
```

### `GetVendorModelsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `integrationType` | `IntegrationType` | **yes** |  | enum: `OCEANCONNECT`, `SIGFOX`, `THINGPARK`, `TPE`, `CHIRPSTACK`, `PARTICLE`, `TMOBILE_IOT_CDP`, `HTTP`, `MQTT`, `PUB_SUB`, `AWS_IOT`, `AWS_SQS`, `AWS_KINESIS`, `TTN`, `TTI`, `AZURE_EVENT_HUB`, `OPC_UA`, `CUSTOM`, `UDP`, `TCP`, `KAFKA`, `AZURE_IOT_HUB`, `APACHE_PULSAR`, `RABBITMQ`, `LORIOT`, `COAP`, `TUYA`, `AZURE_SERVICE_BUS`, `KPN` |
| `vendorName` | `String` | **yes** |  | |
| `converterType` | `String` | no |  | |
| `page` | `Integer` | no |  | default: `0` |
| `pageSize` | `Integer` | no |  | default: `2147483647` |
| `loadImages` | `Boolean` | no |  | default: `true` |

### Return type

`List<Model>`


## getVendors

**GET** `/api/converter/library/{integrationType}/vendors`

Get vendors (getVendors)

Returns a list of vendors for the integration type

```java
List<Vendor> getVendors(GetVendorsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetVendorsArgs.builder()
        .integrationType(IntegrationType)
        .build()
```

### `GetVendorsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `integrationType` | `IntegrationType` | **yes** |  | enum: `OCEANCONNECT`, `SIGFOX`, `THINGPARK`, `TPE`, `CHIRPSTACK`, `PARTICLE`, `TMOBILE_IOT_CDP`, `HTTP`, `MQTT`, `PUB_SUB`, `AWS_IOT`, `AWS_SQS`, `AWS_KINESIS`, `TTN`, `TTI`, `AZURE_EVENT_HUB`, `OPC_UA`, `CUSTOM`, `UDP`, `TCP`, `KAFKA`, `AZURE_IOT_HUB`, `APACHE_PULSAR`, `RABBITMQ`, `LORIOT`, `COAP`, `TUYA`, `AZURE_SERVICE_BUS`, `KPN` |
| `converterType` | `String` | no |  | |
| `page` | `Integer` | no |  | default: `0` |
| `pageSize` | `Integer` | no |  | default: `2147483647` |
| `loadImages` | `Boolean` | no |  | default: `true` |

### Return type

`List<Vendor>`


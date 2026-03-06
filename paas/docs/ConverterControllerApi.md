# ConverterControllerApi

`ThingsboardClient` methods:

```
void deleteConverter(@Nonnull String converterId) // Delete converter (deleteConverter)
Converter getConverterById(@Nonnull String converterId) // Get Converter (getConverterById)
PageDataConverter getConverters(@Nonnull String pageSize, @Nonnull String page, @Nullable Boolean isEdgeTemplate, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder, @Nullable IntegrationType integrationType) // Get Converters (getConverters)
List<Converter> getConvertersByIds(@Nonnull List<String> converterIds) // Get Converters By Ids (getConvertersByIds)
com.fasterxml.jackson.databind.JsonNode getLatestConverterDebugInput(@Nonnull String converterId, @Nullable String converterType, @Nullable String integrationType, @Nullable String integrationName, @Nullable Integer converterVersion) // Get latest debug input event (getLatestConverterDebugInput)
Converter saveConverter(@Nonnull Converter converter) // Create Or Update Converter (saveConverter)
com.fasterxml.jackson.databind.JsonNode testDownLinkConverter(@Nonnull Object body, @Nullable ScriptLanguage scriptLang) // Test converter function (testDownLinkConverter)
com.fasterxml.jackson.databind.JsonNode testUpLinkConverter(@Nonnull Object body, @Nullable ScriptLanguage scriptLang) // Test converter function (testUpLinkConverter)
com.fasterxml.jackson.databind.JsonNode unwrapRawPayload(@Nonnull IntegrationType integrationType, @Nonnull Object body) // Transform input raw payload to the dedicated converter data (unwrapRawPayload)
```


## deleteConverter

```
void deleteConverter(@Nonnull String converterId)
```

**DELETE** `/api/converter/{converterId}`

Delete converter (deleteConverter)

Deletes the converter and all the relations (from and to the converter). Referencing non-existing converter Id will cause an error. If the converter is associated with the integration, it will not be allowed for deletion.   Security check is performed to verify that the user has 'DELETE' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **converterId** | **String** | A string value representing the converter id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## getConverterById

```
Converter getConverterById(@Nonnull String converterId)
```

**GET** `/api/converter/{converterId}`

Get Converter (getConverterById)

Fetch the Converter object based on the provided Converter Id. The server checks that the converter is owned by the same tenant.    Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **converterId** | **String** | A string value representing the converter id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**Converter**


## getConverters

```
PageDataConverter getConverters(@Nonnull String pageSize, @Nonnull String page, @Nullable Boolean isEdgeTemplate, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder, @Nullable IntegrationType integrationType)
```

**GET** `/api/converters`

Get Converters (getConverters)

Returns a page of converters owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.    Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **String** | Maximum amount of entities in a one page | |
| **page** | **String** | Sequence number of page starting from 0 | |
| **isEdgeTemplate** | **Boolean** | Fetch edge template converters | [optional] [default to false] |
| **textSearch** | **String** | The case insensitive 'startsWith' filter based on the converter name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type, debugMode] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **integrationType** | **IntegrationType** | A string value representing the integration type. One of the following: APACHE_PULSAR, AWS_IOT, AWS_KINESIS, AWS_SQS, AZURE_EVENT_HUB, AZURE_IOT_HUB, AZURE_SERVICE_BUS, CHIRPSTACK, COAP, CUSTOM, HTTP, IBM_WATSON_IOT, KAFKA, LORIOT, MQTT, OCEANCONNECT, OPC_UA, PUB_SUB, RABBITMQ,  SIGFOX,  TCP,  THINGPARK,  TMOBILE_IOT_CDP,  TPE,  TTI,  TTN,  TUYA,  UDP | [optional] [enum: OCEANCONNECT, SIGFOX, THINGPARK, TPE, CHIRPSTACK, PARTICLE, TMOBILE_IOT_CDP, HTTP, MQTT, PUB_SUB, AWS_IOT, AWS_SQS, AWS_KINESIS, TTN, TTI, AZURE_EVENT_HUB, OPC_UA, CUSTOM, UDP, TCP, KAFKA, AZURE_IOT_HUB, APACHE_PULSAR, RABBITMQ, LORIOT, COAP, TUYA, AZURE_SERVICE_BUS, KPN] |

### Return type

**PageDataConverter**


## getConvertersByIds

```
List<Converter> getConvertersByIds(@Nonnull List<String> converterIds)
```

**GET** `/api/converters/list`

Get Converters By Ids (getConvertersByIds)

Requested converters must be owned by tenant which is performing the request.    Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **converterIds** | **List<String>** | A list of converter ids, separated by comma ',' | |

### Return type

**List<Converter>**


## getLatestConverterDebugInput

```
com.fasterxml.jackson.databind.JsonNode getLatestConverterDebugInput(@Nonnull String converterId, @Nullable String converterType, @Nullable String integrationType, @Nullable String integrationName, @Nullable Integer converterVersion)
```

**GET** `/api/converter/{converterId}/debugIn`

Get latest debug input event (getLatestConverterDebugInput)

Returns a JSON object of the latest debug event representing the input message the converter processed.   ## Uplink Converter Debug Input Event Example  ```json {    \"inContentType\":\"JSON\",    \"inContent\":\"{\\\"temp\\\":40}\",    \"inMetadata\":\"{\\\"Header:sec-ch-ua\\\":\\\"\\\\\\\"Chromium\\\\\\\";v=\\\\\\\"94\\\\\\\", \\\\\\\"Google Chrome\\\\\\\";v=\\\\\\\"94\\\\\\\", \\\\\\\";Not A Brand\\\\\\\";v=\\\\\\\"99\\\\\\\"\\\",\\\"Header:user-agent\\\":\\\"Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.71 Safari/537.36\\\",\\\"integrationName\\\":\\\"Integration\\\",\\\"Header:cookie\\\":\\\"GUID=zYSs8hymSwZKv8kHALKY; redirect_to=%2F; JSESSIONID=B0A7C8E481409CE7924E738DB04F62F9\\\",\\\"Header:sec-ch-ua-platform\\\":\\\"\\\\\\\"Linux\\\\\\\"\\\",\\\"Header:accept\\\":\\\"*_/_*\\\",\\\"Header:origin\\\":\\\"http://localhost:8080\\\",\\\"Header:sec-fetch-site\\\":\\\"same-origin\\\",\\\"Header:connection\\\":\\\"keep-alive\\\",\\\"Header:accept-encoding\\\":\\\"gzip, deflate, br\\\",\\\"Header:content-type\\\":\\\"application/json\\\",\\\"Header:content-length\\\":\\\"16\\\",\\\"Header:sec-fetch-mode\\\":\\\"cors\\\",\\\"Header:sec-ch-ua-mobile\\\":\\\"?0\\\",\\\"Header:sec-fetch-dest\\\":\\\"empty\\\",\\\"Header:host\\\":\\\"localhost:8080\\\",\\\"Header:referer\\\":\\\"http://localhost:8080/swagger-ui.html\\\",\\\"Header:accept-language\\\":\\\"en-US,en;q=0.9,ru-RU;q=0.8,ru;q=0.7,uk;q=0.6,und;q=0.5\\\"}\" } ```   * 'inContentType' - content type of the message received by the integration;   * 'inContent' - message data received;   * 'inMetadata' - integration metadata (e.g. headers).  ## Downlink Converter Debug Input Event Example  ```json {    \"inContentType\":\"JSON\",    \"inContent\":\"{\\\"temp\\\":42,\\\"humidity\\\":77}\",    \"inMsgType\":\"POST_TELEMETRY_REQUEST\",    \"inMetadata\":\"{\\\"data\\\":\\\"40\\\"}\",    \"inIntegrationMetadata\":\"{\\\"integrationName\\\":\\\"Integration\\\"}\" } ```   * 'inContentType' - content type of the message received by the integration;   * 'inContent' - content of the message pushed from the rule engine;   * 'inMsgType' - type of the message pushed from the rule engine;   * 'inMetadata' - content of the message metadata pushed from the rule engine;   * 'inIntegrationMetadata' - integration metadata.     Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **converterId** | **String** | A string value representing the converter id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **converterType** | **String** | A string value representing the converter type. One of the following: UPLINK, DOWNLINK | [optional] |
| **integrationType** | **String** | A string value representing the integration type. One of the following: APACHE_PULSAR, AWS_IOT, AWS_KINESIS, AWS_SQS, AZURE_EVENT_HUB, AZURE_IOT_HUB, AZURE_SERVICE_BUS, CHIRPSTACK, COAP, CUSTOM, HTTP, IBM_WATSON_IOT, KAFKA, LORIOT, MQTT, OCEANCONNECT, OPC_UA, PUB_SUB, RABBITMQ,  SIGFOX,  TCP,  THINGPARK,  TMOBILE_IOT_CDP,  TPE,  TTI,  TTN,  TUYA,  UDP | [optional] |
| **integrationName** | **String** | A string value representing the integration name. For example, 'My New Integration' | [optional] |
| **converterVersion** | **Integer** | Converter version. | [optional] |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## saveConverter

```
Converter saveConverter(@Nonnull Converter converter)
```

**POST** `/api/converter`

Create Or Update Converter (saveConverter)

Create or update the Converter. When creating converter, platform generates Converter Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created converter id will be present in the response. Specify existing Converter id to update the converter. Referencing non-existing converter Id will cause 'Not Found' error. Converter name is unique in the scope of tenant.   # Converter Configuration  Converter configuration (**'configuration'** field) is the JSON object that should contain one of two possible fields: **'decoder'** or **'encoder'**. The former is used when the converter has UPLINK type, the latter is used - when DOWNLINK type. It can contain both 'decoder' and 'encoder' fields, when the correct one is specified for the appropriate converter type, another one can be set to 'null'. See the examples of each one below.   ## Uplink Converter Configuration  ***Default converter may be different, depending on integration type***.  ```json {    \"decoder\":\"// Decode an uplink message from a buffer\\n// payload - array of bytes\\n// metadata - key/value object\\n\\n/_** Decoder **_/\\n\\n// decode payload to string\\nvar payloadStr = decodeToString(payload);\\n\\n// decode payload to JSON\\n// var data = decodeToJson(payload);\\n\\nvar deviceName = 'Device A';\\nvar deviceType = 'thermostat';\\nvar customerName = 'customer';\\nvar groupName = 'thermostat devices';\\nvar manufacturer = 'Example corporation';\\n// use assetName and assetType instead of deviceName and deviceType\\n// to automatically create assets instead of devices.\\n// var assetName = 'Asset A';\\n// var assetType = 'building';\\n\\n// Result object with device/asset attributes/telemetry data\\nvar result = {\\n// Use deviceName and deviceType or assetName and assetType, but not both.\\n   deviceName: deviceName,\\n   deviceType: deviceType,\\n// assetName: assetName,\\n// assetType: assetType,\\n   customerName: customerName,\\n   groupName: groupName,\\n   contentAwareAttributeKeys: ['manufacturer'],\\n   attributes: {\\n       model: 'Model A',\\n       serialNumber: 'SN111',\\n       integrationName: metadata['integrationName'],\\n       manufacturer: manufacturer\\n   },\\n   telemetry: {\\n       temperature: 42,\\n       humidity: 80,\\n       rawData: payloadStr\\n   }\\n};\\n\\n/_** Helper functions **_/\\n\\nfunction decodeToString(payload) {\\n   return String.fromCharCode.apply(String, payload);\\n}\\n\\nfunction decodeToJson(payload) {\\n   // covert payload to string.\\n   var str = decodeToString(payload);\\n\\n   // parse string to JSON\\n   var data = JSON.parse(str);\\n   return data;\\n}\\n\\nreturn result;\",    \"encoder\":null } ```  Decoder field in the more readable form:  ```text // Decode an uplink message from a buffer // payload - array of bytes // metadata - key/value object  /_** Decoder **_/  // decode payload to string var payloadStr = decodeToString(payload);  // decode payload to JSON // var data = decodeToJson(payload);  var deviceName = 'Device A'; var deviceType = 'thermostat'; var customerName = 'customer'; var groupName = 'thermostat devices'; var manufacturer = 'Example corporation'; // use assetName and assetType instead of deviceName and deviceType // to automatically create assets instead of devices. // var assetName = 'Asset A'; // var assetType = 'building';  // Result object with device/asset attributes/telemetry data var result = { // Use deviceName and deviceType or assetName and assetType, but not both.    deviceName: deviceName,    deviceType: deviceType, // assetName: assetName, // assetType: assetType,    customerName: customerName,    groupName: groupName,    attributes: {        model: 'Model A',        serialNumber: 'SN111',        integrationName: metadata['integrationName']        manufacturer: manufacturer,    },    telemetry: {        temperature: 42,        humidity: 80,        rawData: payloadStr    } };  /_** Helper functions **_/  function decodeToString(payload) {    return String.fromCharCode.apply(String, payload); }  function decodeToJson(payload) {    // covert payload to string.    var str = decodeToString(payload);     // parse string to JSON    var data = JSON.parse(str);    return data; }  return result; ```  ## Downlink Converter Configuration  ```json {    \"decoder\":null,    \"encoder\":\"// Encode downlink data from incoming Rule Engine message\\n\\n// msg - JSON message payload downlink message json\\n// msgType - type of message, for ex. 'ATTRIBUTES_UPDATED', 'POST_TELEMETRY_REQUEST', etc.\\n// metadata - list of key-value pairs with additional data about the message\\n// integrationMetadata - list of key-value pairs with additional data defined in Integration executing this converter\\n\\n/_** Encoder **_/\\n\\nvar data = {};\\n\\n// Process data from incoming message and metadata\\n\\ndata.tempFreq = msg.temperatureUploadFrequency;\\ndata.humFreq = msg.humidityUploadFrequency;\\n\\ndata.devSerialNumber = metadata['ss_serialNumber'];\\n\\n// Result object with encoded downlink payload\\nvar result = {\\n\\n    // downlink data content type: JSON, TEXT or BINARY (base64 format)\\n    contentType: \\\"JSON\\\",\\n\\n    // downlink data\\n    data: JSON.stringify(data),\\n\\n    // Optional metadata object presented in key/value format\\n    metadata: {\\n            topic: metadata['deviceType']+'/'+metadata['deviceName']+'/upload'\\n    }\\n\\n};\\n\\nreturn result;\" } ```  Encoder field in the more readable form:  ```text // Encode downlink data from incoming Rule Engine message  // msg - JSON message payload downlink message json // msgType - type of message, for ex. 'ATTRIBUTES_UPDATED', 'POST_TELEMETRY_REQUEST', etc. // metadata - list of key-value pairs with additional data about the message // integrationMetadata - list of key-value pairs with additional data defined in Integration executing this converter  /_** Encoder **_/  var data = {};  // Process data from incoming message and metadata  data.tempFreq = msg.temperatureUploadFrequency; data.humFreq = msg.humidityUploadFrequency;  data.devSerialNumber = metadata['ss_serialNumber'];  // Result object with encoded downlink payload var result = {      // downlink data content type: JSON, TEXT or BINARY (base64 format)     contentType: \"JSON\",      // downlink data     data: JSON.stringify(data),      // Optional metadata object presented in key/value format     metadata: {             topic: metadata['deviceType']+'/'+metadata['deviceName']+'/upload'     }  };  return result; ```  Remove 'id', 'tenantId' from the request body example (below) to create new converter entity.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **converter** | **Converter** | A JSON value representing the converter. | |

### Return type

**Converter**


## testDownLinkConverter

```
com.fasterxml.jackson.databind.JsonNode testDownLinkConverter(@Nonnull Object body, @Nullable ScriptLanguage scriptLang)
```

**POST** `/api/converter/testDownLink`

Test converter function (testDownLinkConverter)

Returns a JSON object representing the result of the processed incoming message.   ## Request Body Example  ```json {    \"metadata\":{       \"data\":\"40\"    },    \"msg\":\"{\\n    \\\"temp\\\": 42,\\n    \\\"humidity\\\": 77\\n}\",    \"msgType\":\"POST_TELEMETRY_REQUEST\",    \"integrationMetadata\":{       \"integrationName\":\"Integration\"    },    \"encoder\":\"// Encode downlink data from incoming Rule Engine message\\n\\n// msg - JSON message payload downlink message json\\n// msgType - type of message, for ex. 'ATTRIBUTES_UPDATED', 'POST_TELEMETRY_REQUEST', etc.\\n// metadata - list of key-value pairs with additional data about the message\\n// integrationMetadata - list of key-value pairs with additional data defined in Integration executing this converter\\n\\n/_** Encoder **_/\\n\\nvar data = {};\\n\\n// Process data from incoming message and metadata\\n\\ndata.tempValue = msg.temp;\\ndata.humValue = msg.humidity;\\n\\ndata.devSerialNumber = metadata['ss_serialNumber'];\\n\\n// Result object with encoded downlink payload\\nvar result = {\\n\\n    // downlink data content type: JSON, TEXT or BINARY (base64 format)\\n    contentType: \\\"JSON\\\",\\n\\n    // downlink data\\n    data: JSON.stringify(data),\\n\\n    // Optional metadata object presented in key/value format\\n    metadata: {\\n            topic: metadata['deviceType']+'/'+metadata['deviceName']+'/upload'\\n    }\\n\\n};\\n\\nreturn result;\" } ```   * 'metadata' - message metadata pushed from the rule engine;   * 'msg' - message data pushed from the rule engine;   * 'msgType' - type of the message pushed from the rule engine;   * 'integrationMetadata' - integration metadata object;   * 'encoder' - string representation of the encoder configuration.  ## Response Body Example  ```json {    \"contentType\":\"JSON\",    \"data\":\"{\\\"tempValue\\\":42,\\\"humValue\\\":77}\",    \"metadata\":{       \"topic\":\"sensor/Temp Sensor/upload\"    } } ```   * 'contentType' - downlink data content type;   * 'data' - downlink data;   * 'metadata' - optional metadata object.  


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object** | A JSON value representing the input to the converter function. | |
| **scriptLang** | **ScriptLanguage** | Script language: JS or TBEL | [optional] [enum: JS, TBEL] |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## testUpLinkConverter

```
com.fasterxml.jackson.databind.JsonNode testUpLinkConverter(@Nonnull Object body, @Nullable ScriptLanguage scriptLang)
```

**POST** `/api/converter/testUpLink`

Test converter function (testUpLinkConverter)

Returns a JSON object representing the result of the processed incoming message.   ## Request Body Example  ```json {    \"metadata\":{    },    \"payload\":\"ewogICAgImRhdGEiOiAiZGF0YSIKfQ==\",    \"decoder\":\"// Decode an uplink message from a buffer\\n// payload - array of bytes\\n// metadata - key/value object\\n\\n/_** Decoder **_/\\n\\n// decode payload to string\\nvar payloadStr = decodeToString(payload);\\n\\n// decode payload to JSON\\n// var data = decodeToJson(payload);\\n\\nvar deviceName = 'Device A';\\nvar deviceType = 'thermostat';\\nvar customerName = 'customer';\\nvar groupName = 'thermostat devices';\\nvar manufacturer = 'Example corporation';\\n// use assetName and assetType instead of deviceName and deviceType\\n// to automatically create assets instead of devices.\\n// var assetName = 'Asset A';\\n// var assetType = 'building';\\n\\n// Result object with device/asset attributes/telemetry data\\nvar result = {\\n// Use deviceName and deviceType or assetName and assetType, but not both.\\n   deviceName: deviceName,\\n   deviceType: deviceType,\\n// assetName: assetName,\\n// assetType: assetType,\\n   customerName: customerName,\\n   groupName: groupName,\\n   attributes: {\\n       model: 'Model A',\\n       serialNumber: 'SN111',\\n       integrationName: metadata['integrationName']\\n       manufacturer: manufacturer\\n   },\\n   telemetry: {\\n       temperature: 42,\\n       humidity: 80,\\n       rawData: payloadStr\\n   }\\n};\\n\\n/_** Helper functions **_/\\n\\nfunction decodeToString(payload) {\\n   return String.fromCharCode.apply(String, payload);\\n}\\n\\nfunction decodeToJson(payload) {\\n   // covert payload to string.\\n   var str = decodeToString(payload);\\n\\n   // parse string to JSON\\n   var data = JSON.parse(str);\\n   return data;\\n}\\n\\nreturn result;\" } ```   * 'metadata' - integration metadata;   * 'payload' - base64 string representation of the data;   * 'decoder' - string representation of the decoder configuration;   * 'converter' - JSON object representing converter.  ## Response Body Example  ```json {    \"output\":\"{\\\"deviceName\\\":\\\"Device A\\\",\\\"deviceType\\\":\\\"thermostat\\\",\\\"customerName\\\":\\\"customer\\\",\\\"groupName\\\":\\\"thermostat devices\\\",\\\"attributes\\\":{\\\"model\\\":\\\"Model A\\\",\\\"serialNumber\\\":\\\"SN111\\\"},\\\"telemetry\\\":{\\\"temperature\\\":42,\\\"humidity\\\":80,\\\"rawData\\\":\\\"{\\\\n    \\\\\\\"data\\\\\\\": \\\\\\\"data\\\\\\\"\\\\n}\\\"}}\",    \"error\":\"\" } ```   * 'output' - string representation of the output message;   * 'error' - string representation of the error message.  


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object** | A JSON value representing the input to the converter function. | |
| **scriptLang** | **ScriptLanguage** | Script language: JS or TBEL | [optional] [enum: JS, TBEL] |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## unwrapRawPayload

```
com.fasterxml.jackson.databind.JsonNode unwrapRawPayload(@Nonnull IntegrationType integrationType, @Nonnull Object body)
```

**POST** `/api/converter/unwrap/{integrationType}`

Transform input raw payload to the dedicated converter data (unwrapRawPayload)

Returns a JSON object representing the result of the unwrapped incoming raw message.   ## Request Body Example  ```json {    \"metadata\":{    },    \"payload\":\"ewogICAgImRhdGEiOiAiZGF0YSIKfQ==\", } ``` * 'metadata' - integration metadata;   * 'payload' - JSON object representing the input raw message.  ## Response Body Example   * 'metadata' - integration metadata enriched with the data from the input message;   * 'payload' - base64 string representation of the payload from the unwrapped input message;   * 'contentType' - string representation payload contentType.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationType** | **IntegrationType** | A string value representing the integration type. One of the following: APACHE_PULSAR, AWS_IOT, AWS_KINESIS, AWS_SQS, AZURE_EVENT_HUB, AZURE_IOT_HUB, AZURE_SERVICE_BUS, CHIRPSTACK, COAP, CUSTOM, HTTP, IBM_WATSON_IOT, KAFKA, LORIOT, MQTT, OCEANCONNECT, OPC_UA, PUB_SUB, RABBITMQ,  SIGFOX,  TCP,  THINGPARK,  TMOBILE_IOT_CDP,  TPE,  TTI,  TTN,  TUYA,  UDP | [enum: OCEANCONNECT, SIGFOX, THINGPARK, TPE, CHIRPSTACK, PARTICLE, TMOBILE_IOT_CDP, HTTP, MQTT, PUB_SUB, AWS_IOT, AWS_SQS, AWS_KINESIS, TTN, TTI, AZURE_EVENT_HUB, OPC_UA, CUSTOM, UDP, TCP, KAFKA, AZURE_IOT_HUB, APACHE_PULSAR, RABBITMQ, LORIOT, COAP, TUYA, AZURE_SERVICE_BUS, KPN] |
| **body** | **Object** | A JSON value representing the input message. | |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


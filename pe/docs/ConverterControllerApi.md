# ConverterControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteConverter**](#deleteConverter) | **DELETE** /api/converter/{converterId} | Delete converter (deleteConverter) |
| [**getConverterById**](#getConverterById) | **GET** /api/converter/{converterId} | Get Converter (getConverterById) |
| [**getConverters**](#getConverters) | **GET** /api/converters | Get Converters (getConverters) |
| [**getConvertersByIdsV2**](#getConvertersByIdsV2) | **GET** /api/converters/list | Get Converters By Ids (getConvertersByIdsV2) |
| [**getLatestConverterDebugInput**](#getLatestConverterDebugInput) | **GET** /api/converter/{converterId}/debugIn | Get latest debug input event (getLatestConverterDebugInput) |
| [**saveConverter**](#saveConverter) | **POST** /api/converter | Create Or Update Converter (saveConverter) |
| [**testDownLinkConverter**](#testDownLinkConverter) | **POST** /api/converter/testDownLink | Test converter function (testDownLinkConverter) |
| [**testUpLinkConverter**](#testUpLinkConverter) | **POST** /api/converter/testUpLink | Test converter function (testUpLinkConverter) |
| [**unwrapRawPayload**](#unwrapRawPayload) | **POST** /api/converter/unwrap/{integrationType} | Transform input raw payload to the dedicated converter data (unwrapRawPayload) |



## deleteConverter

> deleteConverter(converterId)

Delete converter (deleteConverter)

Deletes the converter and all the relations (from and to the converter). Referencing non-existing converter Id will cause an error. If the converter is associated with the integration, it will not be allowed for deletion.   Security check is performed to verify that the user has &#39;DELETE&#39; permission for the entity (entities).

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **converterId** | **String** | A string value representing the converter id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## getConverterById

> Converter getConverterById(converterId)

Get Converter (getConverterById)

Fetch the Converter object based on the provided Converter Id. The server checks that the converter is owned by the same tenant.    Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **converterId** | **String** | A string value representing the converter id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## getConverters

> PageDataConverter getConverters(pageSize, page, isEdgeTemplate, textSearch, sortProperty, sortOrder, integrationType)

Get Converters (getConverters)

Returns a page of converters owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.    Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **String** | Maximum amount of entities in a one page | |
| **page** | **String** | Sequence number of page starting from 0 | |
| **isEdgeTemplate** | **Boolean** | Fetch edge template converters | [optional] [default to false] |
| **textSearch** | **String** | The case insensitive &#39;startsWith&#39; filter based on the converter name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type, debugMode] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **integrationType** | **IntegrationType** | A string value representing the integration type. One of the following: APACHE_PULSAR, AWS_IOT, AWS_KINESIS, AWS_SQS, AZURE_EVENT_HUB, AZURE_IOT_HUB, AZURE_SERVICE_BUS, CHIRPSTACK, COAP, CUSTOM, HTTP, IBM_WATSON_IOT, KAFKA, LORIOT, MQTT, OCEANCONNECT, OPC_UA, PUB_SUB, RABBITMQ,  SIGFOX,  TCP,  THINGPARK,  TMOBILE_IOT_CDP,  TPE,  TTI,  TTN,  TUYA,  UDP | [optional] [enum: OCEANCONNECT, SIGFOX, THINGPARK, TPE, CHIRPSTACK, PARTICLE, TMOBILE_IOT_CDP, HTTP, MQTT, PUB_SUB, AWS_IOT, AWS_SQS, AWS_KINESIS, TTN, TTI, AZURE_EVENT_HUB, OPC_UA, CUSTOM, UDP, TCP, KAFKA, AZURE_IOT_HUB, APACHE_PULSAR, RABBITMQ, LORIOT, COAP, TUYA, AZURE_SERVICE_BUS, KPN] |


## getConvertersByIdsV2

> List&lt;Converter&gt; getConvertersByIdsV2(converterIds)

Get Converters By Ids (getConvertersByIdsV2)

Requested converters must be owned by tenant which is performing the request.    Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **converterIds** | **List&lt;String&gt;** | A list of converter ids, separated by comma &#39;,&#39; | |


## getLatestConverterDebugInput

> com.fasterxml.jackson.databind.JsonNode getLatestConverterDebugInput(converterId, converterType, integrationType, integrationName, converterVersion)

Get latest debug input event (getLatestConverterDebugInput)

Returns a JSON object of the latest debug event representing the input message the converter processed.   ## Uplink Converter Debug Input Event Example  &#x60;&#x60;&#x60;json {    \&quot;inContentType\&quot;:\&quot;JSON\&quot;,    \&quot;inContent\&quot;:\&quot;{\\\&quot;temp\\\&quot;:40}\&quot;,    \&quot;inMetadata\&quot;:\&quot;{\\\&quot;Header:sec-ch-ua\\\&quot;:\\\&quot;\\\\\\\&quot;Chromium\\\\\\\&quot;;v&#x3D;\\\\\\\&quot;94\\\\\\\&quot;, \\\\\\\&quot;Google Chrome\\\\\\\&quot;;v&#x3D;\\\\\\\&quot;94\\\\\\\&quot;, \\\\\\\&quot;;Not A Brand\\\\\\\&quot;;v&#x3D;\\\\\\\&quot;99\\\\\\\&quot;\\\&quot;,\\\&quot;Header:user-agent\\\&quot;:\\\&quot;Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.71 Safari/537.36\\\&quot;,\\\&quot;integrationName\\\&quot;:\\\&quot;Integration\\\&quot;,\\\&quot;Header:cookie\\\&quot;:\\\&quot;GUID&#x3D;zYSs8hymSwZKv8kHALKY; redirect_to&#x3D;%2F; JSESSIONID&#x3D;B0A7C8E481409CE7924E738DB04F62F9\\\&quot;,\\\&quot;Header:sec-ch-ua-platform\\\&quot;:\\\&quot;\\\\\\\&quot;Linux\\\\\\\&quot;\\\&quot;,\\\&quot;Header:accept\\\&quot;:\\\&quot;*_/_*\\\&quot;,\\\&quot;Header:origin\\\&quot;:\\\&quot;http://localhost:8080\\\&quot;,\\\&quot;Header:sec-fetch-site\\\&quot;:\\\&quot;same-origin\\\&quot;,\\\&quot;Header:connection\\\&quot;:\\\&quot;keep-alive\\\&quot;,\\\&quot;Header:accept-encoding\\\&quot;:\\\&quot;gzip, deflate, br\\\&quot;,\\\&quot;Header:content-type\\\&quot;:\\\&quot;application/json\\\&quot;,\\\&quot;Header:content-length\\\&quot;:\\\&quot;16\\\&quot;,\\\&quot;Header:sec-fetch-mode\\\&quot;:\\\&quot;cors\\\&quot;,\\\&quot;Header:sec-ch-ua-mobile\\\&quot;:\\\&quot;?0\\\&quot;,\\\&quot;Header:sec-fetch-dest\\\&quot;:\\\&quot;empty\\\&quot;,\\\&quot;Header:host\\\&quot;:\\\&quot;localhost:8080\\\&quot;,\\\&quot;Header:referer\\\&quot;:\\\&quot;http://localhost:8080/swagger-ui.html\\\&quot;,\\\&quot;Header:accept-language\\\&quot;:\\\&quot;en-US,en;q&#x3D;0.9,ru-RU;q&#x3D;0.8,ru;q&#x3D;0.7,uk;q&#x3D;0.6,und;q&#x3D;0.5\\\&quot;}\&quot; } &#x60;&#x60;&#x60;   * &#39;inContentType&#39; - content type of the message received by the integration;   * &#39;inContent&#39; - message data received;   * &#39;inMetadata&#39; - integration metadata (e.g. headers).  ## Downlink Converter Debug Input Event Example  &#x60;&#x60;&#x60;json {    \&quot;inContentType\&quot;:\&quot;JSON\&quot;,    \&quot;inContent\&quot;:\&quot;{\\\&quot;temp\\\&quot;:42,\\\&quot;humidity\\\&quot;:77}\&quot;,    \&quot;inMsgType\&quot;:\&quot;POST_TELEMETRY_REQUEST\&quot;,    \&quot;inMetadata\&quot;:\&quot;{\\\&quot;data\\\&quot;:\\\&quot;40\\\&quot;}\&quot;,    \&quot;inIntegrationMetadata\&quot;:\&quot;{\\\&quot;integrationName\\\&quot;:\\\&quot;Integration\\\&quot;}\&quot; } &#x60;&#x60;&#x60;   * &#39;inContentType&#39; - content type of the message received by the integration;   * &#39;inContent&#39; - content of the message pushed from the rule engine;   * &#39;inMsgType&#39; - type of the message pushed from the rule engine;   * &#39;inMetadata&#39; - content of the message metadata pushed from the rule engine;   * &#39;inIntegrationMetadata&#39; - integration metadata.     Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **converterId** | **String** | A string value representing the converter id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **converterType** | **String** | A string value representing the converter type. One of the following: UPLINK, DOWNLINK | [optional] |
| **integrationType** | **String** | A string value representing the integration type. One of the following: APACHE_PULSAR, AWS_IOT, AWS_KINESIS, AWS_SQS, AZURE_EVENT_HUB, AZURE_IOT_HUB, AZURE_SERVICE_BUS, CHIRPSTACK, COAP, CUSTOM, HTTP, IBM_WATSON_IOT, KAFKA, LORIOT, MQTT, OCEANCONNECT, OPC_UA, PUB_SUB, RABBITMQ,  SIGFOX,  TCP,  THINGPARK,  TMOBILE_IOT_CDP,  TPE,  TTI,  TTN,  TUYA,  UDP | [optional] |
| **integrationName** | **String** | A string value representing the integration name. For example, &#39;My New Integration&#39; | [optional] |
| **converterVersion** | **Integer** | Converter version. | [optional] |


## saveConverter

> Converter saveConverter(converter)

Create Or Update Converter (saveConverter)

Create or update the Converter. When creating converter, platform generates Converter Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created converter id will be present in the response. Specify existing Converter id to update the converter. Referencing non-existing converter Id will cause &#39;Not Found&#39; error. Converter name is unique in the scope of tenant.   # Converter Configuration  Converter configuration (**&#39;configuration&#39;** field) is the JSON object that should contain one of two possible fields: **&#39;decoder&#39;** or **&#39;encoder&#39;**. The former is used when the converter has UPLINK type, the latter is used - when DOWNLINK type. It can contain both &#39;decoder&#39; and &#39;encoder&#39; fields, when the correct one is specified for the appropriate converter type, another one can be set to &#39;null&#39;. See the examples of each one below.   ## Uplink Converter Configuration  ***Default converter may be different, depending on integration type***.  &#x60;&#x60;&#x60;json {    \&quot;decoder\&quot;:\&quot;// Decode an uplink message from a buffer\\n// payload - array of bytes\\n// metadata - key/value object\\n\\n/_** Decoder **_/\\n\\n// decode payload to string\\nvar payloadStr &#x3D; decodeToString(payload);\\n\\n// decode payload to JSON\\n// var data &#x3D; decodeToJson(payload);\\n\\nvar deviceName &#x3D; &#39;Device A&#39;;\\nvar deviceType &#x3D; &#39;thermostat&#39;;\\nvar customerName &#x3D; &#39;customer&#39;;\\nvar groupName &#x3D; &#39;thermostat devices&#39;;\\nvar manufacturer &#x3D; &#39;Example corporation&#39;;\\n// use assetName and assetType instead of deviceName and deviceType\\n// to automatically create assets instead of devices.\\n// var assetName &#x3D; &#39;Asset A&#39;;\\n// var assetType &#x3D; &#39;building&#39;;\\n\\n// Result object with device/asset attributes/telemetry data\\nvar result &#x3D; {\\n// Use deviceName and deviceType or assetName and assetType, but not both.\\n   deviceName: deviceName,\\n   deviceType: deviceType,\\n// assetName: assetName,\\n// assetType: assetType,\\n   customerName: customerName,\\n   groupName: groupName,\\n   contentAwareAttributeKeys: [&#39;manufacturer&#39;],\\n   attributes: {\\n       model: &#39;Model A&#39;,\\n       serialNumber: &#39;SN111&#39;,\\n       integrationName: metadata[&#39;integrationName&#39;],\\n       manufacturer: manufacturer\\n   },\\n   telemetry: {\\n       temperature: 42,\\n       humidity: 80,\\n       rawData: payloadStr\\n   }\\n};\\n\\n/_** Helper functions **_/\\n\\nfunction decodeToString(payload) {\\n   return String.fromCharCode.apply(String, payload);\\n}\\n\\nfunction decodeToJson(payload) {\\n   // covert payload to string.\\n   var str &#x3D; decodeToString(payload);\\n\\n   // parse string to JSON\\n   var data &#x3D; JSON.parse(str);\\n   return data;\\n}\\n\\nreturn result;\&quot;,    \&quot;encoder\&quot;:null } &#x60;&#x60;&#x60;  Decoder field in the more readable form:  &#x60;&#x60;&#x60;text // Decode an uplink message from a buffer // payload - array of bytes // metadata - key/value object  /_** Decoder **_/  // decode payload to string var payloadStr &#x3D; decodeToString(payload);  // decode payload to JSON // var data &#x3D; decodeToJson(payload);  var deviceName &#x3D; &#39;Device A&#39;; var deviceType &#x3D; &#39;thermostat&#39;; var customerName &#x3D; &#39;customer&#39;; var groupName &#x3D; &#39;thermostat devices&#39;; var manufacturer &#x3D; &#39;Example corporation&#39;; // use assetName and assetType instead of deviceName and deviceType // to automatically create assets instead of devices. // var assetName &#x3D; &#39;Asset A&#39;; // var assetType &#x3D; &#39;building&#39;;  // Result object with device/asset attributes/telemetry data var result &#x3D; { // Use deviceName and deviceType or assetName and assetType, but not both.    deviceName: deviceName,    deviceType: deviceType, // assetName: assetName, // assetType: assetType,    customerName: customerName,    groupName: groupName,    attributes: {        model: &#39;Model A&#39;,        serialNumber: &#39;SN111&#39;,        integrationName: metadata[&#39;integrationName&#39;]        manufacturer: manufacturer,    },    telemetry: {        temperature: 42,        humidity: 80,        rawData: payloadStr    } };  /_** Helper functions **_/  function decodeToString(payload) {    return String.fromCharCode.apply(String, payload); }  function decodeToJson(payload) {    // covert payload to string.    var str &#x3D; decodeToString(payload);     // parse string to JSON    var data &#x3D; JSON.parse(str);    return data; }  return result; &#x60;&#x60;&#x60;  ## Downlink Converter Configuration  &#x60;&#x60;&#x60;json {    \&quot;decoder\&quot;:null,    \&quot;encoder\&quot;:\&quot;// Encode downlink data from incoming Rule Engine message\\n\\n// msg - JSON message payload downlink message json\\n// msgType - type of message, for ex. &#39;ATTRIBUTES_UPDATED&#39;, &#39;POST_TELEMETRY_REQUEST&#39;, etc.\\n// metadata - list of key-value pairs with additional data about the message\\n// integrationMetadata - list of key-value pairs with additional data defined in Integration executing this converter\\n\\n/_** Encoder **_/\\n\\nvar data &#x3D; {};\\n\\n// Process data from incoming message and metadata\\n\\ndata.tempFreq &#x3D; msg.temperatureUploadFrequency;\\ndata.humFreq &#x3D; msg.humidityUploadFrequency;\\n\\ndata.devSerialNumber &#x3D; metadata[&#39;ss_serialNumber&#39;];\\n\\n// Result object with encoded downlink payload\\nvar result &#x3D; {\\n\\n    // downlink data content type: JSON, TEXT or BINARY (base64 format)\\n    contentType: \\\&quot;JSON\\\&quot;,\\n\\n    // downlink data\\n    data: JSON.stringify(data),\\n\\n    // Optional metadata object presented in key/value format\\n    metadata: {\\n            topic: metadata[&#39;deviceType&#39;]+&#39;/&#39;+metadata[&#39;deviceName&#39;]+&#39;/upload&#39;\\n    }\\n\\n};\\n\\nreturn result;\&quot; } &#x60;&#x60;&#x60;  Encoder field in the more readable form:  &#x60;&#x60;&#x60;text // Encode downlink data from incoming Rule Engine message  // msg - JSON message payload downlink message json // msgType - type of message, for ex. &#39;ATTRIBUTES_UPDATED&#39;, &#39;POST_TELEMETRY_REQUEST&#39;, etc. // metadata - list of key-value pairs with additional data about the message // integrationMetadata - list of key-value pairs with additional data defined in Integration executing this converter  /_** Encoder **_/  var data &#x3D; {};  // Process data from incoming message and metadata  data.tempFreq &#x3D; msg.temperatureUploadFrequency; data.humFreq &#x3D; msg.humidityUploadFrequency;  data.devSerialNumber &#x3D; metadata[&#39;ss_serialNumber&#39;];  // Result object with encoded downlink payload var result &#x3D; {      // downlink data content type: JSON, TEXT or BINARY (base64 format)     contentType: \&quot;JSON\&quot;,      // downlink data     data: JSON.stringify(data),      // Optional metadata object presented in key/value format     metadata: {             topic: metadata[&#39;deviceType&#39;]+&#39;/&#39;+metadata[&#39;deviceName&#39;]+&#39;/upload&#39;     }  };  return result; &#x60;&#x60;&#x60;  Remove &#39;id&#39;, &#39;tenantId&#39; from the request body example (below) to create new converter entity.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **converter** | **Converter** | A JSON value representing the converter. | |


## testDownLinkConverter

> com.fasterxml.jackson.databind.JsonNode testDownLinkConverter(body, scriptLang)

Test converter function (testDownLinkConverter)

Returns a JSON object representing the result of the processed incoming message.   ## Request Body Example  &#x60;&#x60;&#x60;json {    \&quot;metadata\&quot;:{       \&quot;data\&quot;:\&quot;40\&quot;    },    \&quot;msg\&quot;:\&quot;{\\n    \\\&quot;temp\\\&quot;: 42,\\n    \\\&quot;humidity\\\&quot;: 77\\n}\&quot;,    \&quot;msgType\&quot;:\&quot;POST_TELEMETRY_REQUEST\&quot;,    \&quot;integrationMetadata\&quot;:{       \&quot;integrationName\&quot;:\&quot;Integration\&quot;    },    \&quot;encoder\&quot;:\&quot;// Encode downlink data from incoming Rule Engine message\\n\\n// msg - JSON message payload downlink message json\\n// msgType - type of message, for ex. &#39;ATTRIBUTES_UPDATED&#39;, &#39;POST_TELEMETRY_REQUEST&#39;, etc.\\n// metadata - list of key-value pairs with additional data about the message\\n// integrationMetadata - list of key-value pairs with additional data defined in Integration executing this converter\\n\\n/_** Encoder **_/\\n\\nvar data &#x3D; {};\\n\\n// Process data from incoming message and metadata\\n\\ndata.tempValue &#x3D; msg.temp;\\ndata.humValue &#x3D; msg.humidity;\\n\\ndata.devSerialNumber &#x3D; metadata[&#39;ss_serialNumber&#39;];\\n\\n// Result object with encoded downlink payload\\nvar result &#x3D; {\\n\\n    // downlink data content type: JSON, TEXT or BINARY (base64 format)\\n    contentType: \\\&quot;JSON\\\&quot;,\\n\\n    // downlink data\\n    data: JSON.stringify(data),\\n\\n    // Optional metadata object presented in key/value format\\n    metadata: {\\n            topic: metadata[&#39;deviceType&#39;]+&#39;/&#39;+metadata[&#39;deviceName&#39;]+&#39;/upload&#39;\\n    }\\n\\n};\\n\\nreturn result;\&quot; } &#x60;&#x60;&#x60;   * &#39;metadata&#39; - message metadata pushed from the rule engine;   * &#39;msg&#39; - message data pushed from the rule engine;   * &#39;msgType&#39; - type of the message pushed from the rule engine;   * &#39;integrationMetadata&#39; - integration metadata object;   * &#39;encoder&#39; - string representation of the encoder configuration.  ## Response Body Example  &#x60;&#x60;&#x60;json {    \&quot;contentType\&quot;:\&quot;JSON\&quot;,    \&quot;data\&quot;:\&quot;{\\\&quot;tempValue\\\&quot;:42,\\\&quot;humValue\\\&quot;:77}\&quot;,    \&quot;metadata\&quot;:{       \&quot;topic\&quot;:\&quot;sensor/Temp Sensor/upload\&quot;    } } &#x60;&#x60;&#x60;   * &#39;contentType&#39; - downlink data content type;   * &#39;data&#39; - downlink data;   * &#39;metadata&#39; - optional metadata object.  

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object** | A JSON value representing the input to the converter function. | |
| **scriptLang** | **ScriptLanguage** | Script language: JS or TBEL | [optional] [enum: JS, TBEL] |


## testUpLinkConverter

> com.fasterxml.jackson.databind.JsonNode testUpLinkConverter(body, scriptLang)

Test converter function (testUpLinkConverter)

Returns a JSON object representing the result of the processed incoming message.   ## Request Body Example  &#x60;&#x60;&#x60;json {    \&quot;metadata\&quot;:{    },    \&quot;payload\&quot;:\&quot;ewogICAgImRhdGEiOiAiZGF0YSIKfQ&#x3D;&#x3D;\&quot;,    \&quot;decoder\&quot;:\&quot;// Decode an uplink message from a buffer\\n// payload - array of bytes\\n// metadata - key/value object\\n\\n/_** Decoder **_/\\n\\n// decode payload to string\\nvar payloadStr &#x3D; decodeToString(payload);\\n\\n// decode payload to JSON\\n// var data &#x3D; decodeToJson(payload);\\n\\nvar deviceName &#x3D; &#39;Device A&#39;;\\nvar deviceType &#x3D; &#39;thermostat&#39;;\\nvar customerName &#x3D; &#39;customer&#39;;\\nvar groupName &#x3D; &#39;thermostat devices&#39;;\\nvar manufacturer &#x3D; &#39;Example corporation&#39;;\\n// use assetName and assetType instead of deviceName and deviceType\\n// to automatically create assets instead of devices.\\n// var assetName &#x3D; &#39;Asset A&#39;;\\n// var assetType &#x3D; &#39;building&#39;;\\n\\n// Result object with device/asset attributes/telemetry data\\nvar result &#x3D; {\\n// Use deviceName and deviceType or assetName and assetType, but not both.\\n   deviceName: deviceName,\\n   deviceType: deviceType,\\n// assetName: assetName,\\n// assetType: assetType,\\n   customerName: customerName,\\n   groupName: groupName,\\n   attributes: {\\n       model: &#39;Model A&#39;,\\n       serialNumber: &#39;SN111&#39;,\\n       integrationName: metadata[&#39;integrationName&#39;]\\n       manufacturer: manufacturer\\n   },\\n   telemetry: {\\n       temperature: 42,\\n       humidity: 80,\\n       rawData: payloadStr\\n   }\\n};\\n\\n/_** Helper functions **_/\\n\\nfunction decodeToString(payload) {\\n   return String.fromCharCode.apply(String, payload);\\n}\\n\\nfunction decodeToJson(payload) {\\n   // covert payload to string.\\n   var str &#x3D; decodeToString(payload);\\n\\n   // parse string to JSON\\n   var data &#x3D; JSON.parse(str);\\n   return data;\\n}\\n\\nreturn result;\&quot; } &#x60;&#x60;&#x60;   * &#39;metadata&#39; - integration metadata;   * &#39;payload&#39; - base64 string representation of the data;   * &#39;decoder&#39; - string representation of the decoder configuration;   * &#39;converter&#39; - JSON object representing converter.  ## Response Body Example  &#x60;&#x60;&#x60;json {    \&quot;output\&quot;:\&quot;{\\\&quot;deviceName\\\&quot;:\\\&quot;Device A\\\&quot;,\\\&quot;deviceType\\\&quot;:\\\&quot;thermostat\\\&quot;,\\\&quot;customerName\\\&quot;:\\\&quot;customer\\\&quot;,\\\&quot;groupName\\\&quot;:\\\&quot;thermostat devices\\\&quot;,\\\&quot;attributes\\\&quot;:{\\\&quot;model\\\&quot;:\\\&quot;Model A\\\&quot;,\\\&quot;serialNumber\\\&quot;:\\\&quot;SN111\\\&quot;},\\\&quot;telemetry\\\&quot;:{\\\&quot;temperature\\\&quot;:42,\\\&quot;humidity\\\&quot;:80,\\\&quot;rawData\\\&quot;:\\\&quot;{\\\\n    \\\\\\\&quot;data\\\\\\\&quot;: \\\\\\\&quot;data\\\\\\\&quot;\\\\n}\\\&quot;}}\&quot;,    \&quot;error\&quot;:\&quot;\&quot; } &#x60;&#x60;&#x60;   * &#39;output&#39; - string representation of the output message;   * &#39;error&#39; - string representation of the error message.  

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object** | A JSON value representing the input to the converter function. | |
| **scriptLang** | **ScriptLanguage** | Script language: JS or TBEL | [optional] [enum: JS, TBEL] |


## unwrapRawPayload

> com.fasterxml.jackson.databind.JsonNode unwrapRawPayload(integrationType, body)

Transform input raw payload to the dedicated converter data (unwrapRawPayload)

Returns a JSON object representing the result of the unwrapped incoming raw message.   ## Request Body Example  &#x60;&#x60;&#x60;json {    \&quot;metadata\&quot;:{    },    \&quot;payload\&quot;:\&quot;ewogICAgImRhdGEiOiAiZGF0YSIKfQ&#x3D;&#x3D;\&quot;, } &#x60;&#x60;&#x60; * &#39;metadata&#39; - integration metadata;   * &#39;payload&#39; - JSON object representing the input raw message.  ## Response Body Example   * &#39;metadata&#39; - integration metadata enriched with the data from the input message;   * &#39;payload&#39; - base64 string representation of the payload from the unwrapped input message;   * &#39;contentType&#39; - string representation payload contentType.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationType** | **IntegrationType** | A string value representing the integration type. One of the following: APACHE_PULSAR, AWS_IOT, AWS_KINESIS, AWS_SQS, AZURE_EVENT_HUB, AZURE_IOT_HUB, AZURE_SERVICE_BUS, CHIRPSTACK, COAP, CUSTOM, HTTP, IBM_WATSON_IOT, KAFKA, LORIOT, MQTT, OCEANCONNECT, OPC_UA, PUB_SUB, RABBITMQ,  SIGFOX,  TCP,  THINGPARK,  TMOBILE_IOT_CDP,  TPE,  TTI,  TTN,  TUYA,  UDP | [enum: OCEANCONNECT, SIGFOX, THINGPARK, TPE, CHIRPSTACK, PARTICLE, TMOBILE_IOT_CDP, HTTP, MQTT, PUB_SUB, AWS_IOT, AWS_SQS, AWS_KINESIS, TTN, TTI, AZURE_EVENT_HUB, OPC_UA, CUSTOM, UDP, TCP, KAFKA, AZURE_IOT_HUB, APACHE_PULSAR, RABBITMQ, LORIOT, COAP, TUYA, AZURE_SERVICE_BUS, KPN] |
| **body** | **Object** | A JSON value representing the input message. | |


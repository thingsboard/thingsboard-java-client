# TelemetryControllerApi

`ThingsboardClient` methods:

```
String deleteDeviceAttributes(@Nonnull String deviceId, @Nonnull String scope, @Nullable String keys, @Nullable List<String> key) // Delete device attributes (deleteDeviceAttributes)
String deleteEntityAttributes(@Nonnull String entityType, @Nonnull String entityId, @Nonnull String scope, @Nullable String keys, @Nullable List<String> key) // Delete entity attributes (deleteEntityAttributes)
String deleteEntityTimeseries(@Nonnull String entityType, @Nonnull String entityId, @Nullable String keys, @Nullable Boolean deleteAllDataForKeys, @Nullable Long startTs, @Nullable Long endTs, @Nullable Boolean deleteLatest, @Nullable Boolean rewriteLatestIfDeleted, @Nullable List<String> key) // Delete entity time series data (deleteEntityTimeseries)
List<String> getAttributeKeys(@Nonnull String entityType, @Nonnull String entityId) // Get all attribute keys (getAttributeKeys)
List<String> getAttributeKeysByScope(@Nonnull String entityType, @Nonnull String entityId, @Nonnull String scope) // Get all attribute keys by scope (getAttributeKeysByScope)
List<AttributeData> getAttributes(@Nonnull String entityType, @Nonnull String entityId, @Nullable String keys, @Nullable List<String> key) // Get attributes (getAttributes)
List<AttributeData> getAttributesByScope(@Nonnull String entityType, @Nonnull String entityId, @Nonnull String scope, @Nullable String keys, @Nullable List<String> key) // Get attributes by scope (getAttributesByScope)
Map<String, List<TsData>> getLatestTimeseries(@Nonnull String entityType, @Nonnull String entityId, @Nullable String keys, @Nullable Boolean useStrictDataTypes, @Nullable List<String> key) // Get latest time series value (getLatestTimeseries)
Map<String, List<TsData>> getTimeseriesHistory(@Nonnull String entityType, @Nonnull String entityId, @Nonnull Long startTs, @Nonnull Long endTs, @Nullable String keys, @Nullable String intervalType, @Nullable Long interval, @Nullable String timeZone, @Nullable String limit, @Nullable String agg, @Nullable String orderBy, @Nullable Boolean useStrictDataTypes, @Nullable List<String> key) // Get time series data (getTimeseriesHistory)
List<String> getTimeseriesKeys(@Nonnull String entityType, @Nonnull String entityId) // Get time series keys (getTimeseriesKeys)
String saveDeviceAttributes(@Nonnull String deviceId, @Nonnull String scope, @Nonnull String body) // Save device attributes (saveDeviceAttributes)
String saveEntityAttributesV1(@Nonnull String entityType, @Nonnull String entityId, @Nonnull String scope, @Nonnull String body) // Save entity attributes (saveEntityAttributesV1)
String saveEntityAttributesV2(@Nonnull String entityType, @Nonnull String entityId, @Nonnull String scope, @Nonnull String body) // Save entity attributes (saveEntityAttributesV2)
String saveEntityTelemetry(@Nonnull String entityType, @Nonnull String entityId, @Nonnull String scope, @Nonnull String body) // Save or update time series data (saveEntityTelemetry)
String saveEntityTelemetryWithTTL(@Nonnull String entityType, @Nonnull String entityId, @Nonnull String scope, @Nonnull Long ttl, @Nonnull String body) // Save or update time series data with TTL (saveEntityTelemetryWithTTL)
```


## deleteDeviceAttributes

```
String deleteDeviceAttributes(@Nonnull String deviceId, @Nonnull String scope, @Nullable String keys, @Nullable List<String> key)
```

**DELETE** `/api/plugins/telemetry/{deviceId}/{scope}`

Delete device attributes (deleteDeviceAttributes)

Delete device attributes using provided Device Id, scope and a list of keys. Referencing a non-existing Device Id will cause an error  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String** | A string value representing the device id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **scope** | **String** | A string value representing the attributes scope. For example, 'SERVER_SCOPE'. | [enum: SERVER_SCOPE, SHARED_SCOPE, CLIENT_SCOPE] |
| **keys** | **String** | A string value representing the comma-separated list of attributes keys. For example, 'active,inactivityAlarmTime'. If attribute keys contain comma, duplicate 'key' parameter for each key, for example '?key=my,key&key=my,second,key | [optional] |
| **key** | **List<String>** | Repeatable key query parameter (alternative to comma-separated 'keys') | [optional] |

### Return type

**String**


## deleteEntityAttributes

```
String deleteEntityAttributes(@Nonnull String entityType, @Nonnull String entityId, @Nonnull String scope, @Nullable String keys, @Nullable List<String> key)
```

**DELETE** `/api/plugins/telemetry/{entityType}/{entityId}/{scope}`

Delete entity attributes (deleteEntityAttributes)

Delete entity attributes using provided Entity Id, scope and a list of keys. This operation is idempotent: keys that do not exist are silently ignored and the response is still 200 OK. Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **entityId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **scope** | **String** | A string value representing the attributes scope. For example, 'SERVER_SCOPE'. | [enum: SERVER_SCOPE, SHARED_SCOPE, CLIENT_SCOPE] |
| **keys** | **String** | A string value representing the comma-separated list of attributes keys. For example, 'active,inactivityAlarmTime'. If attribute keys contain comma, duplicate 'key' parameter for each key, for example '?key=my,key&key=my,second,key | [optional] |
| **key** | **List<String>** | Repeatable key query parameter (alternative to comma-separated 'keys') | [optional] |

### Return type

**String**


## deleteEntityTimeseries

```
String deleteEntityTimeseries(@Nonnull String entityType, @Nonnull String entityId, @Nullable String keys, @Nullable Boolean deleteAllDataForKeys, @Nullable Long startTs, @Nullable Long endTs, @Nullable Boolean deleteLatest, @Nullable Boolean rewriteLatestIfDeleted, @Nullable List<String> key)
```

**DELETE** `/api/plugins/telemetry/{entityType}/{entityId}/timeseries/delete`

Delete entity time series data (deleteEntityTimeseries)

Delete time series for selected entity based on entity id, entity type and keys. Use 'deleteAllDataForKeys' to delete all time series data. Use 'startTs' and 'endTs' to specify time-range instead.  Use 'deleteLatest' to delete latest value (stored in separate table for performance) if the value's timestamp matches the time-range.  Use 'rewriteLatestIfDeleted' to rewrite latest value (stored in separate table for performance) if the value's timestamp matches the time-range and 'deleteLatest' param is true. The replacement value will be fetched from the 'time series' table, and its timestamp will be the most recent one before the defined time-range.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **entityId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **keys** | **String** | A string value representing the comma-separated list of telemetry keys. If keys are not selected, the result will return all latest time series. For example, 'temperature,humidity'. If telemetry keys contain comma, duplicate 'key' parameter for each key, for example '?key=my,key&key=my,second,key | [optional] |
| **deleteAllDataForKeys** | **Boolean** | A boolean value to specify if should be deleted all data for selected keys or only data that are in the selected time range. | [optional] [default to false] |
| **startTs** | **Long** | A long value representing the start timestamp of removal time range in milliseconds. | [optional] |
| **endTs** | **Long** | A long value representing the end timestamp of removal time range in milliseconds. | [optional] |
| **deleteLatest** | **Boolean** | If the parameter is set to true, the latest telemetry can be removed, otherwise, in case that parameter is set to false the latest value will not removed. | [optional] [default to true] |
| **rewriteLatestIfDeleted** | **Boolean** | If the parameter is set to true, the latest telemetry will be rewritten in case that current latest value was removed, otherwise, in case that parameter is set to false the new latest value will not set. | [optional] [default to false] |
| **key** | **List<String>** | Repeatable key query parameter (alternative to comma-separated 'keys') | [optional] |

### Return type

**String**


## getAttributeKeys

```
List<String> getAttributeKeys(@Nonnull String entityType, @Nonnull String entityId)
```

**GET** `/api/plugins/telemetry/{entityType}/{entityId}/keys/attributes`

Get all attribute keys (getAttributeKeys)

Returns a set of unique attribute key names for the selected entity. The response will include merged key names set for all attribute scopes:   * SERVER_SCOPE - supported for all entity types;  * CLIENT_SCOPE - supported for devices;  * SHARED_SCOPE - supported for devices.   Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **entityId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**List<String>**


## getAttributeKeysByScope

```
List<String> getAttributeKeysByScope(@Nonnull String entityType, @Nonnull String entityId, @Nonnull String scope)
```

**GET** `/api/plugins/telemetry/{entityType}/{entityId}/keys/attributes/{scope}`

Get all attribute keys by scope (getAttributeKeysByScope)

Returns a set of unique attribute key names for the selected entity and attributes scope:    * SERVER_SCOPE - supported for all entity types;  * CLIENT_SCOPE - supported for devices;  * SHARED_SCOPE - supported for devices.   Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **entityId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **scope** | **String** | A string value representing the attributes scope. For example, 'SERVER_SCOPE'. | [enum: SERVER_SCOPE, SHARED_SCOPE, CLIENT_SCOPE] |

### Return type

**List<String>**


## getAttributes

```
List<AttributeData> getAttributes(@Nonnull String entityType, @Nonnull String entityId, @Nullable String keys, @Nullable List<String> key)
```

**GET** `/api/plugins/telemetry/{entityType}/{entityId}/values/attributes`

Get attributes (getAttributes)

Returns all attributes that belong to specified entity. Use optional 'keys' parameter to return specific attributes.  Example of the result:   ```json [   {\"key\": \"stringAttributeKey\", \"value\": \"value\", \"lastUpdateTs\": 1609459200000},   {\"key\": \"booleanAttributeKey\", \"value\": false, \"lastUpdateTs\": 1609459200001},   {\"key\": \"doubleAttributeKey\", \"value\": 42.2, \"lastUpdateTs\": 1609459200002},   {\"key\": \"longKeyExample\", \"value\": 73, \"lastUpdateTs\": 1609459200003},   {\"key\": \"jsonKeyExample\",     \"value\": {       \"someNumber\": 42,       \"someArray\": [1,2,3],       \"someNestedObject\": {\"key\": \"value\"}     },     \"lastUpdateTs\": 1609459200004   } ] ```   Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **entityId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **keys** | **String** | A string value representing the comma-separated list of attributes keys. For example, 'active,inactivityAlarmTime'. If attribute keys contain comma, duplicate 'key' parameter for each key, for example '?key=my,key&key=my,second,key | [optional] |
| **key** | **List<String>** | Repeatable key query parameter (alternative to comma-separated 'keys') | [optional] |

### Return type

**List<AttributeData>**


## getAttributesByScope

```
List<AttributeData> getAttributesByScope(@Nonnull String entityType, @Nonnull String entityId, @Nonnull String scope, @Nullable String keys, @Nullable List<String> key)
```

**GET** `/api/plugins/telemetry/{entityType}/{entityId}/values/attributes/{scope}`

Get attributes by scope (getAttributesByScope)

Returns all attributes of a specified scope that belong to specified entity. List of possible attribute scopes depends on the entity type:    * SERVER_SCOPE - supported for all entity types;  * SHARED_SCOPE - supported for devices;  * CLIENT_SCOPE - supported for devices.   Use optional 'keys' parameter to return specific attributes.  Example of the result:   ```json [   {\"key\": \"stringAttributeKey\", \"value\": \"value\", \"lastUpdateTs\": 1609459200000},   {\"key\": \"booleanAttributeKey\", \"value\": false, \"lastUpdateTs\": 1609459200001},   {\"key\": \"doubleAttributeKey\", \"value\": 42.2, \"lastUpdateTs\": 1609459200002},   {\"key\": \"longKeyExample\", \"value\": 73, \"lastUpdateTs\": 1609459200003},   {\"key\": \"jsonKeyExample\",     \"value\": {       \"someNumber\": 42,       \"someArray\": [1,2,3],       \"someNestedObject\": {\"key\": \"value\"}     },     \"lastUpdateTs\": 1609459200004   } ] ```   Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **entityId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **scope** | **String** | A string value representing the attributes scope. For example, 'SERVER_SCOPE'. | [enum: SERVER_SCOPE, SHARED_SCOPE, CLIENT_SCOPE] |
| **keys** | **String** | A string value representing the comma-separated list of attributes keys. For example, 'active,inactivityAlarmTime'. If attribute keys contain comma, duplicate 'key' parameter for each key, for example '?key=my,key&key=my,second,key | [optional] |
| **key** | **List<String>** | Repeatable key query parameter (alternative to comma-separated 'keys') | [optional] |

### Return type

**List<AttributeData>**


## getLatestTimeseries

```
Map<String, List<TsData>> getLatestTimeseries(@Nonnull String entityType, @Nonnull String entityId, @Nullable String keys, @Nullable Boolean useStrictDataTypes, @Nullable List<String> key)
```

**GET** `/api/plugins/telemetry/{entityType}/{entityId}/values/timeseries`

Get latest time series value (getLatestTimeseries)

Returns all time series that belong to specified entity. Use optional 'keys' parameter to return specific time series. The result is a JSON object. The format of the values depends on the 'useStrictDataTypes' parameter. By default, all time series values are converted to strings:   ```json {   \"stringTsKey\": [{ \"value\": \"value\", \"ts\": 1609459200000}],   \"booleanTsKey\": [{ \"value\": \"false\", \"ts\": 1609459200000}],   \"doubleTsKey\": [{ \"value\": \"42.2\", \"ts\": 1609459200000}],   \"longTsKey\": [{ \"value\": \"73\", \"ts\": 1609459200000}],   \"jsonTsKey\": [{ \"value\": \"{\\\"someNumber\\\": 42,\\\"someArray\\\": [1,2,3],\\\"someNestedObject\\\": {\\\"key\\\": \\\"value\\\"}}\", \"ts\": 1609459200000}] }  ```   However, it is possible to request the values without conversion ('useStrictDataTypes'=true):   ```json {   \"stringTsKey\": [{ \"value\": \"value\", \"ts\": 1609459200000}],   \"booleanTsKey\": [{ \"value\": false, \"ts\": 1609459200000}],   \"doubleTsKey\": [{ \"value\": 42.2, \"ts\": 1609459200000}],   \"longTsKey\": [{ \"value\": 73, \"ts\": 1609459200000}],   \"jsonTsKey\": [{      \"value\": {       \"someNumber\": 42,       \"someArray\": [1,2,3],       \"someNestedObject\": {\"key\": \"value\"}     },      \"ts\": 1609459200000}] }  ```   Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **entityId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **keys** | **String** | A string value representing the comma-separated list of telemetry keys. If keys are not selected, the result will return all latest time series. For example, 'temperature,humidity'. If telemetry keys contain comma, duplicate 'key' parameter for each key, for example '?key=my,key&key=my,second,key | [optional] |
| **useStrictDataTypes** | **Boolean** | Enables/disables conversion of telemetry values to strings. Conversion is enabled by default. Set parameter to 'true' in order to disable the conversion. | [optional] [default to false] |
| **key** | **List<String>** | Repeatable key query parameter (alternative to comma-separated 'keys') | [optional] |

### Return type

**Map<String, List<TsData>>**


## getTimeseriesHistory

```
Map<String, List<TsData>> getTimeseriesHistory(@Nonnull String entityType, @Nonnull String entityId, @Nonnull Long startTs, @Nonnull Long endTs, @Nullable String keys, @Nullable String intervalType, @Nullable Long interval, @Nullable String timeZone, @Nullable String limit, @Nullable String agg, @Nullable String orderBy, @Nullable Boolean useStrictDataTypes, @Nullable List<String> key)
```

**GET** `/api/plugins/telemetry/{entityType}/{entityId}/values/timeseries/history`

Get time series data (getTimeseriesHistory)

Returns a range of time series values for specified entity. Returns not aggregated data by default. Use aggregation function ('agg') and aggregation interval ('interval') to enable aggregation of the results on the database / server side. The aggregation is generally more efficient then fetching all records.   ```json {   \"temperature\": [     {       \"value\": 36.7,       \"ts\": 1609459200000     },     {       \"value\": 36.6,       \"ts\": 1609459201000     }   ] } ```  Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **entityId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **startTs** | **Long** | A long value representing the start timestamp of the time range in milliseconds, UTC. | |
| **endTs** | **Long** | A long value representing the end timestamp of the time range in milliseconds, UTC. | |
| **keys** | **String** | A string value representing the comma-separated list of telemetry keys. | [optional] |
| **intervalType** | **String** | A string value representing the type fo the interval. | [optional] [enum: MILLISECONDS, WEEK, WEEK_ISO, MONTH, QUARTER] |
| **interval** | **Long** | A long value representing the aggregation interval range in milliseconds. | [optional] [default to 0] |
| **timeZone** | **String** | A string value representing the timezone that will be used to calculate exact timestamps for 'WEEK', 'WEEK_ISO', 'MONTH' and 'QUARTER' interval types. | [optional] |
| **limit** | **String** | An integer value that represents a max number of time series data points to fetch. This parameter is used only in the case if 'agg' parameter is set to 'NONE'. | [optional] |
| **agg** | **String** | A string value representing the aggregation function. If the interval is not specified, 'agg' parameter will use 'NONE' value. | [optional] [enum: MIN, MAX, AVG, SUM, COUNT, NONE] |
| **orderBy** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **useStrictDataTypes** | **Boolean** | Enables/disables conversion of telemetry values to strings. Conversion is enabled by default. Set parameter to 'true' in order to disable the conversion. | [optional] [default to false] |
| **key** | **List<String>** | Repeatable key query parameter (alternative to comma-separated 'keys') | [optional] |

### Return type

**Map<String, List<TsData>>**


## getTimeseriesKeys

```
List<String> getTimeseriesKeys(@Nonnull String entityType, @Nonnull String entityId)
```

**GET** `/api/plugins/telemetry/{entityType}/{entityId}/keys/timeseries`

Get time series keys (getTimeseriesKeys)

Returns a set of unique time series key names for the selected entity.   Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **entityId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**List<String>**


## saveDeviceAttributes

```
String saveDeviceAttributes(@Nonnull String deviceId, @Nonnull String scope, @Nonnull String body)
```

**POST** `/api/plugins/telemetry/{deviceId}/{scope}`

Save device attributes (saveDeviceAttributes)

Creates or updates the device attributes based on device id and specified attribute scope. The request payload is a JSON object with key-value format of attributes to create or update. For example:  ```json {  \"stringKey\":\"value1\",   \"booleanKey\":true,   \"doubleKey\":42.0,   \"longKey\":73,   \"jsonKey\": {     \"someNumber\": 42,     \"someArray\": [1,2,3],     \"someNestedObject\": {\"key\": \"value\"}  } } ```   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String** | A string value representing the device id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **scope** | **String** | A string value representing the attributes scope. For example, 'SERVER_SCOPE'. | [enum: SERVER_SCOPE, SHARED_SCOPE] |
| **body** | **String** | A string value representing the json object. For example, '{\"key\":\"value\"}'. See API call description for more details. | |

### Return type

**String**


## saveEntityAttributesV1

```
String saveEntityAttributesV1(@Nonnull String entityType, @Nonnull String entityId, @Nonnull String scope, @Nonnull String body)
```

**POST** `/api/plugins/telemetry/{entityType}/{entityId}/{scope}`

Save entity attributes (saveEntityAttributesV1)

Creates or updates the entity attributes based on Entity Id and the specified attribute scope.  List of possible attribute scopes depends on the entity type:    * SERVER_SCOPE - supported for all entity types;  * SHARED_SCOPE - supported for devices.  The request payload is a JSON object with key-value format of attributes to create or update. For example:  ```json {  \"stringKey\":\"value1\",   \"booleanKey\":true,   \"doubleKey\":42.0,   \"longKey\":73,   \"jsonKey\": {     \"someNumber\": 42,     \"someArray\": [1,2,3],     \"someNestedObject\": {\"key\": \"value\"}  } } ``` Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **entityId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **scope** | **String** | A string value representing the attributes scope. For example, 'SERVER_SCOPE'. | [enum: SERVER_SCOPE, SHARED_SCOPE] |
| **body** | **String** | A string value representing the json object. For example, '{\"key\":\"value\"}'. See API call description for more details. | |

### Return type

**String**


## saveEntityAttributesV2

```
String saveEntityAttributesV2(@Nonnull String entityType, @Nonnull String entityId, @Nonnull String scope, @Nonnull String body)
```

**POST** `/api/plugins/telemetry/{entityType}/{entityId}/attributes/{scope}`

Save entity attributes (saveEntityAttributesV2)

Creates or updates the entity attributes based on Entity Id and the specified attribute scope.  List of possible attribute scopes depends on the entity type:    * SERVER_SCOPE - supported for all entity types;  * SHARED_SCOPE - supported for devices.  The request payload is a JSON object with key-value format of attributes to create or update. For example:  ```json {  \"stringKey\":\"value1\",   \"booleanKey\":true,   \"doubleKey\":42.0,   \"longKey\":73,   \"jsonKey\": {     \"someNumber\": 42,     \"someArray\": [1,2,3],     \"someNestedObject\": {\"key\": \"value\"}  } } ``` Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **entityId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **scope** | **String** | A string value representing the attributes scope. For example, 'SERVER_SCOPE'. | [enum: SERVER_SCOPE, SHARED_SCOPE] |
| **body** | **String** | A string value representing the json object. For example, '{\"key\":\"value\"}'. See API call description for more details. | |

### Return type

**String**


## saveEntityTelemetry

```
String saveEntityTelemetry(@Nonnull String entityType, @Nonnull String entityId, @Nonnull String scope, @Nonnull String body)
```

**POST** `/api/plugins/telemetry/{entityType}/{entityId}/timeseries/{scope}`

Save or update time series data (saveEntityTelemetry)

Creates or updates the entity time series data based on the Entity Id and request payload.The request payload is a JSON document with three possible formats:  Simple format without timestamp. In such a case, current server time will be used:   ```json {\"temperature\": 26} ```   Single JSON object with timestamp:   ```json {\"ts\":1634712287000,\"values\":{\"temperature\":26, \"humidity\":87}} ```   JSON array with timestamps:   ```json [{\"ts\":1634712287000,\"values\":{\"temperature\":26, \"humidity\":87}}, {\"ts\":1634712588000,\"values\":{\"temperature\":25, \"humidity\":88}}] ```   The scope parameter is not used in the API call implementation but should be specified whatever value because it is used as a path variable. Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **entityId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **scope** | **String** | Value is deprecated, reserved for backward compatibility and not used in the API call implementation. Specify any scope for compatibility | [enum: ANY] |
| **body** | **String** | A JSON with the telemetry values. See API call description for more details. | |

### Return type

**String**


## saveEntityTelemetryWithTTL

```
String saveEntityTelemetryWithTTL(@Nonnull String entityType, @Nonnull String entityId, @Nonnull String scope, @Nonnull Long ttl, @Nonnull String body)
```

**POST** `/api/plugins/telemetry/{entityType}/{entityId}/timeseries/{scope}/{ttl}`

Save or update time series data with TTL (saveEntityTelemetryWithTTL)

Creates or updates the entity time series data based on the Entity Id and request payload.The request payload is a JSON document with three possible formats:  Simple format without timestamp. In such a case, current server time will be used:   ```json {\"temperature\": 26} ```   Single JSON object with timestamp:   ```json {\"ts\":1634712287000,\"values\":{\"temperature\":26, \"humidity\":87}} ```   JSON array with timestamps:   ```json [{\"ts\":1634712287000,\"values\":{\"temperature\":26, \"humidity\":87}}, {\"ts\":1634712588000,\"values\":{\"temperature\":25, \"humidity\":88}}] ```   The scope parameter is not used in the API call implementation but should be specified whatever value because it is used as a path variable.   The ttl parameter takes affect only in case of Cassandra DB.Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **entityId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **scope** | **String** | Value is deprecated, reserved for backward compatibility and not used in the API call implementation. Specify any scope for compatibility | [enum: ANY] |
| **ttl** | **Long** | A long value representing TTL (Time to Live) parameter. | |
| **body** | **String** | A JSON with the telemetry values. See API call description for more details. | |

### Return type

**String**


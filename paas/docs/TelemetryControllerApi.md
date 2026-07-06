# TelemetryControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
String deleteDeviceAttributes(DeleteDeviceAttributesArgs args) // Delete device attributes (deleteDeviceAttributes)
String deleteEntityAttributes(DeleteEntityAttributesArgs args) // Delete entity attributes (deleteEntityAttributes)
String deleteEntityTimeseries(DeleteEntityTimeseriesArgs args) // Delete entity time series data (deleteEntityTimeseries)
List<String> getAttributeKeys(GetAttributeKeysArgs args) // Get all attribute keys (getAttributeKeys)
List<String> getAttributeKeysByScope(GetAttributeKeysByScopeArgs args) // Get all attribute keys by scope (getAttributeKeysByScope)
List<AttributeData> getAttributes(GetAttributesArgs args) // Get attributes (getAttributes)
List<AttributeData> getAttributesByScope(GetAttributesByScopeArgs args) // Get attributes by scope (getAttributesByScope)
Map<String, List<TsData>> getLatestTimeseries(GetLatestTimeseriesArgs args) // Get latest time series value (getLatestTimeseries)
List<ReadTsKvQueryResult> getTimeseriesByReadTsKvQueries(GetTimeseriesByReadTsKvQueriesArgs args) // Get time series data by read queries (getTimeseriesByReadTsKvQueries)
Map<String, List<TsData>> getTimeseriesHistory(GetTimeseriesHistoryArgs args) // Get time series data (getTimeseriesHistory)
List<String> getTimeseriesKeys(GetTimeseriesKeysArgs args) // Get time series keys (getTimeseriesKeys)
String saveDeviceAttributes(SaveDeviceAttributesArgs args) // Save device attributes (saveDeviceAttributes)
String saveEntityAttributesV1(SaveEntityAttributesV1Args args) // Save entity attributes (saveEntityAttributesV1)
String saveEntityAttributesV2(SaveEntityAttributesV2Args args) // Save entity attributes (saveEntityAttributesV2)
String saveEntityTelemetry(SaveEntityTelemetryArgs args) // Save or update time series data (saveEntityTelemetry)
String saveEntityTelemetryWithTTL(SaveEntityTelemetryWithTTLArgs args) // Save or update time series data with TTL (saveEntityTelemetryWithTTL)
```


## deleteDeviceAttributes

**DELETE** `/api/plugins/telemetry/{deviceId}/{scope}`

Delete device attributes (deleteDeviceAttributes)

Delete device attributes using provided Device Id, scope and a list of keys. Referencing a non-existing Device Id will cause an error  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
String deleteDeviceAttributes(DeleteDeviceAttributesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteDeviceAttributesArgs.builder()
        .deviceId(String)
        .scope(String)
        .build()
```

### `DeleteDeviceAttributesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `deviceId` | `String` | **yes** | A string value representing the device id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `scope` | `String` | **yes** | A string value representing the attributes scope. For example, 'SERVER_SCOPE'. | enum: `SERVER_SCOPE`, `SHARED_SCOPE`, `CLIENT_SCOPE` |
| `keys` | `String` | no | A string value representing the comma-separated list of attributes keys. For example, 'active,inactivityAlarmTime'. If attribute keys contain comma, duplicate 'key' parameter for each key, for example '?key=my,key&key=my,second,key | |
| `key` | `List<String>` | no | Repeatable key query parameter (alternative to comma-separated 'keys') | |

### Return type

`String`


## deleteEntityAttributes

**DELETE** `/api/plugins/telemetry/{entityType}/{entityId}/{scope}`

Delete entity attributes (deleteEntityAttributes)

Delete entity attributes using provided Entity Id, scope and a list of keys. This operation is idempotent: keys that do not exist are silently ignored and the response is still 200 OK. Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
String deleteEntityAttributes(DeleteEntityAttributesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteEntityAttributesArgs.builder()
        .entityType(String)
        .entityId(String)
        .scope(String)
        .build()
```

### `DeleteEntityAttributesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `entityId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `scope` | `String` | **yes** | A string value representing the attributes scope. For example, 'SERVER_SCOPE'. | enum: `SERVER_SCOPE`, `SHARED_SCOPE`, `CLIENT_SCOPE` |
| `keys` | `String` | no | A string value representing the comma-separated list of attributes keys. For example, 'active,inactivityAlarmTime'. If attribute keys contain comma, duplicate 'key' parameter for each key, for example '?key=my,key&key=my,second,key | |
| `key` | `List<String>` | no | Repeatable key query parameter (alternative to comma-separated 'keys') | |

### Return type

`String`


## deleteEntityTimeseries

**DELETE** `/api/plugins/telemetry/{entityType}/{entityId}/timeseries/delete`

Delete entity time series data (deleteEntityTimeseries)

Delete time series for selected entity based on entity id, entity type and keys. Use 'deleteAllDataForKeys' to delete all time series data. Use 'startTs' and 'endTs' to specify time-range instead.  Use 'deleteLatest' to delete latest value (stored in separate table for performance) if the value's timestamp matches the time-range.  Use 'rewriteLatestIfDeleted' to rewrite latest value (stored in separate table for performance) if the value's timestamp matches the time-range and 'deleteLatest' param is true. The replacement value will be fetched from the 'time series' table, and its timestamp will be the most recent one before the defined time-range.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
String deleteEntityTimeseries(DeleteEntityTimeseriesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteEntityTimeseriesArgs.builder()
        .entityType(String)
        .entityId(String)
        .build()
```

### `DeleteEntityTimeseriesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `entityId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `keys` | `String` | no | A string value representing the comma-separated list of telemetry keys. If keys are not selected, the result will return all latest time series. For example, 'temperature,humidity'. If telemetry keys contain comma, duplicate 'key' parameter for each key, for example '?key=my,key&key=my,second,key | |
| `deleteAllDataForKeys` | `Boolean` | no | A boolean value to specify if should be deleted all data for selected keys or only data that are in the selected time range. | default: `false` |
| `startTs` | `Long` | no | A long value representing the start timestamp of removal time range in milliseconds. | |
| `endTs` | `Long` | no | A long value representing the end timestamp of removal time range in milliseconds. | |
| `deleteLatest` | `Boolean` | no | If the parameter is set to true, the latest telemetry can be removed, otherwise, in case that parameter is set to false the latest value will not removed. | default: `true` |
| `rewriteLatestIfDeleted` | `Boolean` | no | If the parameter is set to true, the latest telemetry will be rewritten in case that current latest value was removed, otherwise, in case that parameter is set to false the new latest value will not set. | default: `false` |
| `key` | `List<String>` | no | Repeatable key query parameter (alternative to comma-separated 'keys') | |

### Return type

`String`


## getAttributeKeys

**GET** `/api/plugins/telemetry/{entityType}/{entityId}/keys/attributes`

Get all attribute keys (getAttributeKeys)

Returns a set of unique attribute key names for the selected entity. The response will include merged key names set for all attribute scopes:   * SERVER_SCOPE - supported for all entity types;  * CLIENT_SCOPE - supported for devices;  * SHARED_SCOPE - supported for devices.   Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
List<String> getAttributeKeys(GetAttributeKeysArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAttributeKeysArgs.builder()
        .entityType(String)
        .entityId(String)
        .build()
```

### `GetAttributeKeysArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `entityId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`List<String>`


## getAttributeKeysByScope

**GET** `/api/plugins/telemetry/{entityType}/{entityId}/keys/attributes/{scope}`

Get all attribute keys by scope (getAttributeKeysByScope)

Returns a set of unique attribute key names for the selected entity and attributes scope:    * SERVER_SCOPE - supported for all entity types;  * CLIENT_SCOPE - supported for devices;  * SHARED_SCOPE - supported for devices.   Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
List<String> getAttributeKeysByScope(GetAttributeKeysByScopeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAttributeKeysByScopeArgs.builder()
        .entityType(String)
        .entityId(String)
        .scope(String)
        .build()
```

### `GetAttributeKeysByScopeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `entityId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `scope` | `String` | **yes** | A string value representing the attributes scope. For example, 'SERVER_SCOPE'. | enum: `SERVER_SCOPE`, `SHARED_SCOPE`, `CLIENT_SCOPE` |

### Return type

`List<String>`


## getAttributes

**GET** `/api/plugins/telemetry/{entityType}/{entityId}/values/attributes`

Get attributes (getAttributes)

Returns all attributes that belong to specified entity. Use optional 'keys' parameter to return specific attributes.  Example of the result:   ```json [   {\"key\": \"stringAttributeKey\", \"value\": \"value\", \"lastUpdateTs\": 1609459200000},   {\"key\": \"booleanAttributeKey\", \"value\": false, \"lastUpdateTs\": 1609459200001},   {\"key\": \"doubleAttributeKey\", \"value\": 42.2, \"lastUpdateTs\": 1609459200002},   {\"key\": \"longKeyExample\", \"value\": 73, \"lastUpdateTs\": 1609459200003},   {\"key\": \"jsonKeyExample\",     \"value\": {       \"someNumber\": 42,       \"someArray\": [1,2,3],       \"someNestedObject\": {\"key\": \"value\"}     },     \"lastUpdateTs\": 1609459200004   } ] ```   Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
List<AttributeData> getAttributes(GetAttributesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAttributesArgs.builder()
        .entityType(String)
        .entityId(String)
        .build()
```

### `GetAttributesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `entityId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `keys` | `String` | no | A string value representing the comma-separated list of attributes keys. For example, 'active,inactivityAlarmTime'. If attribute keys contain comma, duplicate 'key' parameter for each key, for example '?key=my,key&key=my,second,key | |
| `key` | `List<String>` | no | Repeatable key query parameter (alternative to comma-separated 'keys') | |

### Return type

`List<AttributeData>`


## getAttributesByScope

**GET** `/api/plugins/telemetry/{entityType}/{entityId}/values/attributes/{scope}`

Get attributes by scope (getAttributesByScope)

Returns all attributes of a specified scope that belong to specified entity. List of possible attribute scopes depends on the entity type:    * SERVER_SCOPE - supported for all entity types;  * SHARED_SCOPE - supported for devices;  * CLIENT_SCOPE - supported for devices.   Use optional 'keys' parameter to return specific attributes.  Example of the result:   ```json [   {\"key\": \"stringAttributeKey\", \"value\": \"value\", \"lastUpdateTs\": 1609459200000},   {\"key\": \"booleanAttributeKey\", \"value\": false, \"lastUpdateTs\": 1609459200001},   {\"key\": \"doubleAttributeKey\", \"value\": 42.2, \"lastUpdateTs\": 1609459200002},   {\"key\": \"longKeyExample\", \"value\": 73, \"lastUpdateTs\": 1609459200003},   {\"key\": \"jsonKeyExample\",     \"value\": {       \"someNumber\": 42,       \"someArray\": [1,2,3],       \"someNestedObject\": {\"key\": \"value\"}     },     \"lastUpdateTs\": 1609459200004   } ] ```   Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
List<AttributeData> getAttributesByScope(GetAttributesByScopeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAttributesByScopeArgs.builder()
        .entityType(String)
        .entityId(String)
        .scope(String)
        .build()
```

### `GetAttributesByScopeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `entityId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `scope` | `String` | **yes** | A string value representing the attributes scope. For example, 'SERVER_SCOPE'. | enum: `SERVER_SCOPE`, `SHARED_SCOPE`, `CLIENT_SCOPE` |
| `keys` | `String` | no | A string value representing the comma-separated list of attributes keys. For example, 'active,inactivityAlarmTime'. If attribute keys contain comma, duplicate 'key' parameter for each key, for example '?key=my,key&key=my,second,key | |
| `key` | `List<String>` | no | Repeatable key query parameter (alternative to comma-separated 'keys') | |

### Return type

`List<AttributeData>`


## getLatestTimeseries

**GET** `/api/plugins/telemetry/{entityType}/{entityId}/values/timeseries`

Get latest time series value (getLatestTimeseries)

Returns all time series that belong to specified entity. Use optional 'keys' parameter to return specific time series. The result is a JSON object. The format of the values depends on the 'useStrictDataTypes' parameter. By default, all time series values are converted to strings:   ```json {   \"stringTsKey\": [{ \"value\": \"value\", \"ts\": 1609459200000}],   \"booleanTsKey\": [{ \"value\": \"false\", \"ts\": 1609459200000}],   \"doubleTsKey\": [{ \"value\": \"42.2\", \"ts\": 1609459200000}],   \"longTsKey\": [{ \"value\": \"73\", \"ts\": 1609459200000}],   \"jsonTsKey\": [{ \"value\": \"{\\\"someNumber\\\": 42,\\\"someArray\\\": [1,2,3],\\\"someNestedObject\\\": {\\\"key\\\": \\\"value\\\"}}\", \"ts\": 1609459200000}] }  ```   However, it is possible to request the values without conversion ('useStrictDataTypes'=true):   ```json {   \"stringTsKey\": [{ \"value\": \"value\", \"ts\": 1609459200000}],   \"booleanTsKey\": [{ \"value\": false, \"ts\": 1609459200000}],   \"doubleTsKey\": [{ \"value\": 42.2, \"ts\": 1609459200000}],   \"longTsKey\": [{ \"value\": 73, \"ts\": 1609459200000}],   \"jsonTsKey\": [{      \"value\": {       \"someNumber\": 42,       \"someArray\": [1,2,3],       \"someNestedObject\": {\"key\": \"value\"}     },      \"ts\": 1609459200000}] }  ```   Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
Map<String, List<TsData>> getLatestTimeseries(GetLatestTimeseriesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetLatestTimeseriesArgs.builder()
        .entityType(String)
        .entityId(String)
        .build()
```

### `GetLatestTimeseriesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `entityId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `keys` | `String` | no | A string value representing the comma-separated list of telemetry keys. If keys are not selected, the result will return all latest time series. For example, 'temperature,humidity'. If telemetry keys contain comma, duplicate 'key' parameter for each key, for example '?key=my,key&key=my,second,key | |
| `useStrictDataTypes` | `Boolean` | no | Enables/disables conversion of telemetry values to strings. Conversion is enabled by default. Set parameter to 'true' in order to disable the conversion. | default: `false` |
| `key` | `List<String>` | no | Repeatable key query parameter (alternative to comma-separated 'keys') | |

### Return type

`Map<String, List<TsData>>`


## getTimeseriesByReadTsKvQueries

**POST** `/api/plugins/telemetry/{entityType}/{entityId}/values/timeseries`

Get time series data by read queries (getTimeseriesByReadTsKvQueries)

Returns aggregated time series values according to queries for specified entity. ```json [   {     \"queryId\": 49,     \"data\": [       {         \"ts\": 1751450399999,         \"kv\": {           \"key\": \"temperature\",           \"value\": 26,           \"doubleValue\": 26,           \"valueAsString\": \"26.0\",           \"dataType\": \"DOUBLE\",           \"longValue\": null,           \"booleanValue\": null,           \"jsonValue\": null,           \"strValue\": null         },         \"version\": null       }     ],     \"lastEntryTs\": 1750264592675   },   {     \"queryId\": 50,     \"data\": [],     \"lastEntryTs\": 1751317200000   } ] ```  Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
List<ReadTsKvQueryResult> getTimeseriesByReadTsKvQueries(GetTimeseriesByReadTsKvQueriesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetTimeseriesByReadTsKvQueriesArgs.builder()
        .entityType(String)
        .entityId(String)
        .baseReadTsKvQuery(List<BaseReadTsKvQuery>)
        .build()
```

### `GetTimeseriesByReadTsKvQueriesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `entityId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `baseReadTsKvQuery` | `List<BaseReadTsKvQuery>` | **yes** | A JSON array of time series read queries. | |

### Return type

`List<ReadTsKvQueryResult>`


## getTimeseriesHistory

**GET** `/api/plugins/telemetry/{entityType}/{entityId}/values/timeseries/history`

Get time series data (getTimeseriesHistory)

Returns a range of time series values for specified entity. Returns not aggregated data by default. Use aggregation function ('agg') and aggregation interval ('interval') to enable aggregation of the results on the database / server side. The aggregation is generally more efficient then fetching all records.   ```json {   \"temperature\": [     {       \"value\": 36.7,       \"ts\": 1609459200000     },     {       \"value\": 36.6,       \"ts\": 1609459201000     }   ] } ```  Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
Map<String, List<TsData>> getTimeseriesHistory(GetTimeseriesHistoryArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetTimeseriesHistoryArgs.builder()
        .entityType(String)
        .entityId(String)
        .startTs(Long)
        .endTs(Long)
        .build()
```

### `GetTimeseriesHistoryArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `entityId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `startTs` | `Long` | **yes** | A long value representing the start timestamp of the time range in milliseconds, UTC. | |
| `endTs` | `Long` | **yes** | A long value representing the end timestamp of the time range in milliseconds, UTC. | |
| `keys` | `String` | no | A string value representing the comma-separated list of telemetry keys. | |
| `intervalType` | `String` | no | A string value representing the type fo the interval. | enum: `MILLISECONDS`, `WEEK`, `WEEK_ISO`, `MONTH`, `QUARTER` |
| `interval` | `Long` | no | A long value representing the aggregation interval range in milliseconds. | default: `0` |
| `timeZone` | `String` | no | A string value representing the timezone that will be used to calculate exact timestamps for 'WEEK', 'WEEK_ISO', 'MONTH' and 'QUARTER' interval types. | |
| `limit` | `String` | no | An integer value that represents a max number of time series data points to fetch. This parameter is used only in the case if 'agg' parameter is set to 'NONE'. | |
| `agg` | `String` | no | A string value representing the aggregation function. If the interval is not specified, 'agg' parameter will use 'NONE' value. | enum: `MIN`, `MAX`, `AVG`, `SUM`, `COUNT`, `NONE` |
| `orderBy` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |
| `useStrictDataTypes` | `Boolean` | no | Enables/disables conversion of telemetry values to strings. Conversion is enabled by default. Set parameter to 'true' in order to disable the conversion. | default: `false` |
| `key` | `List<String>` | no | Repeatable key query parameter (alternative to comma-separated 'keys') | |

### Return type

`Map<String, List<TsData>>`


## getTimeseriesKeys

**GET** `/api/plugins/telemetry/{entityType}/{entityId}/keys/timeseries`

Get time series keys (getTimeseriesKeys)

Returns a set of unique time series key names for the selected entity.   Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
List<String> getTimeseriesKeys(GetTimeseriesKeysArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetTimeseriesKeysArgs.builder()
        .entityType(String)
        .entityId(String)
        .build()
```

### `GetTimeseriesKeysArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `entityId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`List<String>`


## saveDeviceAttributes

**POST** `/api/plugins/telemetry/{deviceId}/{scope}`

Save device attributes (saveDeviceAttributes)

Creates or updates the device attributes based on device id and specified attribute scope. The request payload is a JSON object with key-value format of attributes to create or update. For example:  ```json {  \"stringKey\":\"value1\",   \"booleanKey\":true,   \"doubleKey\":42.0,   \"longKey\":73,   \"jsonKey\": {     \"someNumber\": 42,     \"someArray\": [1,2,3],     \"someNestedObject\": {\"key\": \"value\"}  } } ```   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
String saveDeviceAttributes(SaveDeviceAttributesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveDeviceAttributesArgs.builder()
        .deviceId(String)
        .scope(String)
        .body(String)
        .build()
```

### `SaveDeviceAttributesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `deviceId` | `String` | **yes** | A string value representing the device id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `scope` | `String` | **yes** | A string value representing the attributes scope. For example, 'SERVER_SCOPE'. | enum: `SERVER_SCOPE`, `SHARED_SCOPE` |
| `body` | `String` | **yes** | A string value representing the json object. For example, '{\"key\":\"value\"}'. See API call description for more details. | |

### Return type

`String`


## saveEntityAttributesV1

**POST** `/api/plugins/telemetry/{entityType}/{entityId}/{scope}`

Save entity attributes (saveEntityAttributesV1)

Creates or updates the entity attributes based on Entity Id and the specified attribute scope.  List of possible attribute scopes depends on the entity type:    * SERVER_SCOPE - supported for all entity types;  * SHARED_SCOPE - supported for devices.  The request payload is a JSON object with key-value format of attributes to create or update. For example:  ```json {  \"stringKey\":\"value1\",   \"booleanKey\":true,   \"doubleKey\":42.0,   \"longKey\":73,   \"jsonKey\": {     \"someNumber\": 42,     \"someArray\": [1,2,3],     \"someNestedObject\": {\"key\": \"value\"}  } } ``` Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
String saveEntityAttributesV1(SaveEntityAttributesV1Args args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveEntityAttributesV1Args.builder()
        .entityType(String)
        .entityId(String)
        .scope(String)
        .body(String)
        .build()
```

### `SaveEntityAttributesV1Args` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `entityId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `scope` | `String` | **yes** | A string value representing the attributes scope. For example, 'SERVER_SCOPE'. | enum: `SERVER_SCOPE`, `SHARED_SCOPE` |
| `body` | `String` | **yes** | A string value representing the json object. For example, '{\"key\":\"value\"}'. See API call description for more details. | |

### Return type

`String`


## saveEntityAttributesV2

**POST** `/api/plugins/telemetry/{entityType}/{entityId}/attributes/{scope}`

Save entity attributes (saveEntityAttributesV2)

Creates or updates the entity attributes based on Entity Id and the specified attribute scope.  List of possible attribute scopes depends on the entity type:    * SERVER_SCOPE - supported for all entity types;  * SHARED_SCOPE - supported for devices.  The request payload is a JSON object with key-value format of attributes to create or update. For example:  ```json {  \"stringKey\":\"value1\",   \"booleanKey\":true,   \"doubleKey\":42.0,   \"longKey\":73,   \"jsonKey\": {     \"someNumber\": 42,     \"someArray\": [1,2,3],     \"someNestedObject\": {\"key\": \"value\"}  } } ``` Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
String saveEntityAttributesV2(SaveEntityAttributesV2Args args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveEntityAttributesV2Args.builder()
        .entityType(String)
        .entityId(String)
        .scope(String)
        .body(String)
        .build()
```

### `SaveEntityAttributesV2Args` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `entityId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `scope` | `String` | **yes** | A string value representing the attributes scope. For example, 'SERVER_SCOPE'. | enum: `SERVER_SCOPE`, `SHARED_SCOPE` |
| `body` | `String` | **yes** | A string value representing the json object. For example, '{\"key\":\"value\"}'. See API call description for more details. | |

### Return type

`String`


## saveEntityTelemetry

**POST** `/api/plugins/telemetry/{entityType}/{entityId}/timeseries/{scope}`

Save or update time series data (saveEntityTelemetry)

Creates or updates the entity time series data based on the Entity Id and request payload.The request payload is a JSON document with three possible formats:  Simple format without timestamp. In such a case, current server time will be used:   ```json {\"temperature\": 26} ```   Single JSON object with timestamp:   ```json {\"ts\":1634712287000,\"values\":{\"temperature\":26, \"humidity\":87}} ```   JSON array with timestamps:   ```json [{\"ts\":1634712287000,\"values\":{\"temperature\":26, \"humidity\":87}}, {\"ts\":1634712588000,\"values\":{\"temperature\":25, \"humidity\":88}}] ```   The scope parameter is not used in the API call implementation but should be specified whatever value because it is used as a path variable. Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
String saveEntityTelemetry(SaveEntityTelemetryArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveEntityTelemetryArgs.builder()
        .entityType(String)
        .entityId(String)
        .scope(String)
        .body(String)
        .build()
```

### `SaveEntityTelemetryArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `entityId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `scope` | `String` | **yes** | Value is deprecated, reserved for backward compatibility and not used in the API call implementation. Specify any scope for compatibility | enum: `ANY` |
| `body` | `String` | **yes** | A JSON with the telemetry values. See API call description for more details. | |

### Return type

`String`


## saveEntityTelemetryWithTTL

**POST** `/api/plugins/telemetry/{entityType}/{entityId}/timeseries/{scope}/{ttl}`

Save or update time series data with TTL (saveEntityTelemetryWithTTL)

Creates or updates the entity time series data based on the Entity Id and request payload.The request payload is a JSON document with three possible formats:  Simple format without timestamp. In such a case, current server time will be used:   ```json {\"temperature\": 26} ```   Single JSON object with timestamp:   ```json {\"ts\":1634712287000,\"values\":{\"temperature\":26, \"humidity\":87}} ```   JSON array with timestamps:   ```json [{\"ts\":1634712287000,\"values\":{\"temperature\":26, \"humidity\":87}}, {\"ts\":1634712588000,\"values\":{\"temperature\":25, \"humidity\":88}}] ```   The scope parameter is not used in the API call implementation but should be specified whatever value because it is used as a path variable.   The ttl parameter takes affect only in case of Cassandra DB.Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
String saveEntityTelemetryWithTTL(SaveEntityTelemetryWithTTLArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveEntityTelemetryWithTTLArgs.builder()
        .entityType(String)
        .entityId(String)
        .scope(String)
        .ttl(Long)
        .body(String)
        .build()
```

### `SaveEntityTelemetryWithTTLArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `entityId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `scope` | `String` | **yes** | Value is deprecated, reserved for backward compatibility and not used in the API call implementation. Specify any scope for compatibility | enum: `ANY` |
| `ttl` | `Long` | **yes** | A long value representing TTL (Time to Live) parameter. | |
| `body` | `String` | **yes** | A JSON with the telemetry values. See API call description for more details. | |

### Return type

`String`


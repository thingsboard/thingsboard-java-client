# TelemetryControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteDeviceAttributes**](#deleteDeviceAttributes) | **DELETE** /api/plugins/telemetry/{deviceId}/{scope} | Delete device attributes (deleteDeviceAttributes) |
| [**deleteEntityAttributes**](#deleteEntityAttributes) | **DELETE** /api/plugins/telemetry/{entityType}/{entityId}/{scope} | Delete entity attributes (deleteEntityAttributes) |
| [**deleteEntityTimeseries**](#deleteEntityTimeseries) | **DELETE** /api/plugins/telemetry/{entityType}/{entityId}/timeseries/delete | Delete entity time series data (deleteEntityTimeseries) |
| [**getAttributeKeys**](#getAttributeKeys) | **GET** /api/plugins/telemetry/{entityType}/{entityId}/keys/attributes | Get all attribute keys (getAttributeKeys) |
| [**getAttributeKeysByScope**](#getAttributeKeysByScope) | **GET** /api/plugins/telemetry/{entityType}/{entityId}/keys/attributes/{scope} | Get all attribute keys by scope (getAttributeKeysByScope) |
| [**getAttributes**](#getAttributes) | **GET** /api/plugins/telemetry/{entityType}/{entityId}/values/attributes | Get attributes (getAttributes) |
| [**getAttributesByScope**](#getAttributesByScope) | **GET** /api/plugins/telemetry/{entityType}/{entityId}/values/attributes/{scope} | Get attributes by scope (getAttributesByScope) |
| [**getLatestTimeseries**](#getLatestTimeseries) | **GET** /api/plugins/telemetry/{entityType}/{entityId}/values/timeseries | Get latest time series value (getLatestTimeseries) |
| [**getTimeseriesHistory**](#getTimeseriesHistory) | **GET** /api/plugins/telemetry/{entityType}/{entityId}/values/timeseries/history | Get time series data (getTimeseriesHistory) |
| [**getTimeseriesKeys**](#getTimeseriesKeys) | **GET** /api/plugins/telemetry/{entityType}/{entityId}/keys/timeseries | Get time series keys (getTimeseriesKeys) |
| [**saveDeviceAttributes**](#saveDeviceAttributes) | **POST** /api/plugins/telemetry/{deviceId}/{scope} | Save device attributes (saveDeviceAttributes) |
| [**saveEntityAttributesV1**](#saveEntityAttributesV1) | **POST** /api/plugins/telemetry/{entityType}/{entityId}/{scope} | Save entity attributes (saveEntityAttributesV1) |
| [**saveEntityAttributesV2**](#saveEntityAttributesV2) | **POST** /api/plugins/telemetry/{entityType}/{entityId}/attributes/{scope} | Save entity attributes (saveEntityAttributesV2) |
| [**saveEntityTelemetry**](#saveEntityTelemetry) | **POST** /api/plugins/telemetry/{entityType}/{entityId}/timeseries/{scope} | Save or update time series data (saveEntityTelemetry) |
| [**saveEntityTelemetryWithTTL**](#saveEntityTelemetryWithTTL) | **POST** /api/plugins/telemetry/{entityType}/{entityId}/timeseries/{scope}/{ttl} | Save or update time series data with TTL (saveEntityTelemetryWithTTL) |



## deleteDeviceAttributes

> String deleteDeviceAttributes(deviceId, scope, keys, key)

Delete device attributes (deleteDeviceAttributes)

Delete device attributes using provided Device Id, scope and a list of keys. Referencing a non-existing Device Id will cause an error  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String** | A string value representing the device id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **scope** | **String** | A string value representing the attributes scope. For example, &#39;SERVER_SCOPE&#39;. | [enum: SERVER_SCOPE, SHARED_SCOPE, CLIENT_SCOPE] |
| **keys** | **String** | A string value representing the comma-separated list of attributes keys. For example, &#39;active,inactivityAlarmTime&#39;. If attribute keys contain comma, duplicate &#39;key&#39; parameter for each key, for example &#39;?key&#x3D;my,key&amp;key&#x3D;my,second,key | [optional] |
| **key** | **List&lt;String&gt;** | Repeatable key query parameter (alternative to comma-separated &#39;keys&#39;) | [optional] |


## deleteEntityAttributes

> String deleteEntityAttributes(entityType, entityId, scope, keys, key)

Delete entity attributes (deleteEntityAttributes)

Delete entity attributes using provided Entity Id, scope and a list of keys. Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **entityId** | **String** | A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **scope** | **String** | A string value representing the attributes scope. For example, &#39;SERVER_SCOPE&#39;. | [enum: SERVER_SCOPE, SHARED_SCOPE, CLIENT_SCOPE] |
| **keys** | **String** | A string value representing the comma-separated list of attributes keys. For example, &#39;active,inactivityAlarmTime&#39;. If attribute keys contain comma, duplicate &#39;key&#39; parameter for each key, for example &#39;?key&#x3D;my,key&amp;key&#x3D;my,second,key | [optional] |
| **key** | **List&lt;String&gt;** | Repeatable key query parameter (alternative to comma-separated &#39;keys&#39;) | [optional] |


## deleteEntityTimeseries

> String deleteEntityTimeseries(entityType, entityId, keys, deleteAllDataForKeys, startTs, endTs, deleteLatest, rewriteLatestIfDeleted, key)

Delete entity time series data (deleteEntityTimeseries)

Delete time series for selected entity based on entity id, entity type and keys. Use &#39;deleteAllDataForKeys&#39; to delete all time series data. Use &#39;startTs&#39; and &#39;endTs&#39; to specify time-range instead.  Use &#39;deleteLatest&#39; to delete latest value (stored in separate table for performance) if the value&#39;s timestamp matches the time-range.  Use &#39;rewriteLatestIfDeleted&#39; to rewrite latest value (stored in separate table for performance) if the value&#39;s timestamp matches the time-range and &#39;deleteLatest&#39; param is true. The replacement value will be fetched from the &#39;time series&#39; table, and its timestamp will be the most recent one before the defined time-range.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **entityId** | **String** | A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **keys** | **String** | A string value representing the comma-separated list of telemetry keys. If keys are not selected, the result will return all latest time series. For example, &#39;temperature,humidity&#39;. If telemetry keys contain comma, duplicate &#39;key&#39; parameter for each key, for example &#39;?key&#x3D;my,key&amp;key&#x3D;my,second,key | [optional] |
| **deleteAllDataForKeys** | **Boolean** | A boolean value to specify if should be deleted all data for selected keys or only data that are in the selected time range. | [optional] [default to false] |
| **startTs** | **Long** | A long value representing the start timestamp of removal time range in milliseconds. | [optional] |
| **endTs** | **Long** | A long value representing the end timestamp of removal time range in milliseconds. | [optional] |
| **deleteLatest** | **Boolean** | If the parameter is set to true, the latest telemetry can be removed, otherwise, in case that parameter is set to false the latest value will not removed. | [optional] [default to true] |
| **rewriteLatestIfDeleted** | **Boolean** | If the parameter is set to true, the latest telemetry will be rewritten in case that current latest value was removed, otherwise, in case that parameter is set to false the new latest value will not set. | [optional] [default to false] |
| **key** | **List&lt;String&gt;** | Repeatable key query parameter (alternative to comma-separated &#39;keys&#39;) | [optional] |


## getAttributeKeys

> List&lt;String&gt; getAttributeKeys(entityType, entityId)

Get all attribute keys (getAttributeKeys)

Returns a set of unique attribute key names for the selected entity. The response will include merged key names set for all attribute scopes:   * SERVER_SCOPE - supported for all entity types;  * CLIENT_SCOPE - supported for devices;  * SHARED_SCOPE - supported for devices.   Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **entityId** | **String** | A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## getAttributeKeysByScope

> List&lt;String&gt; getAttributeKeysByScope(entityType, entityId, scope)

Get all attribute keys by scope (getAttributeKeysByScope)

Returns a set of unique attribute key names for the selected entity and attributes scope:    * SERVER_SCOPE - supported for all entity types;  * CLIENT_SCOPE - supported for devices;  * SHARED_SCOPE - supported for devices.   Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **entityId** | **String** | A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **scope** | **String** | A string value representing the attributes scope. For example, &#39;SERVER_SCOPE&#39;. | [enum: SERVER_SCOPE, SHARED_SCOPE, CLIENT_SCOPE] |


## getAttributes

> List&lt;AttributeData&gt; getAttributes(entityType, entityId, keys, key)

Get attributes (getAttributes)

Returns all attributes that belong to specified entity. Use optional &#39;keys&#39; parameter to return specific attributes.  Example of the result:   &#x60;&#x60;&#x60;json [   {\&quot;key\&quot;: \&quot;stringAttributeKey\&quot;, \&quot;value\&quot;: \&quot;value\&quot;, \&quot;lastUpdateTs\&quot;: 1609459200000},   {\&quot;key\&quot;: \&quot;booleanAttributeKey\&quot;, \&quot;value\&quot;: false, \&quot;lastUpdateTs\&quot;: 1609459200001},   {\&quot;key\&quot;: \&quot;doubleAttributeKey\&quot;, \&quot;value\&quot;: 42.2, \&quot;lastUpdateTs\&quot;: 1609459200002},   {\&quot;key\&quot;: \&quot;longKeyExample\&quot;, \&quot;value\&quot;: 73, \&quot;lastUpdateTs\&quot;: 1609459200003},   {\&quot;key\&quot;: \&quot;jsonKeyExample\&quot;,     \&quot;value\&quot;: {       \&quot;someNumber\&quot;: 42,       \&quot;someArray\&quot;: [1,2,3],       \&quot;someNestedObject\&quot;: {\&quot;key\&quot;: \&quot;value\&quot;}     },     \&quot;lastUpdateTs\&quot;: 1609459200004   } ] &#x60;&#x60;&#x60;   Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **entityId** | **String** | A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **keys** | **String** | A string value representing the comma-separated list of attributes keys. For example, &#39;active,inactivityAlarmTime&#39;. If attribute keys contain comma, duplicate &#39;key&#39; parameter for each key, for example &#39;?key&#x3D;my,key&amp;key&#x3D;my,second,key | [optional] |
| **key** | **List&lt;String&gt;** | Repeatable key query parameter (alternative to comma-separated &#39;keys&#39;) | [optional] |


## getAttributesByScope

> List&lt;AttributeData&gt; getAttributesByScope(entityType, entityId, scope, keys, key)

Get attributes by scope (getAttributesByScope)

Returns all attributes of a specified scope that belong to specified entity. List of possible attribute scopes depends on the entity type:    * SERVER_SCOPE - supported for all entity types;  * SHARED_SCOPE - supported for devices;  * CLIENT_SCOPE - supported for devices.   Use optional &#39;keys&#39; parameter to return specific attributes.  Example of the result:   &#x60;&#x60;&#x60;json [   {\&quot;key\&quot;: \&quot;stringAttributeKey\&quot;, \&quot;value\&quot;: \&quot;value\&quot;, \&quot;lastUpdateTs\&quot;: 1609459200000},   {\&quot;key\&quot;: \&quot;booleanAttributeKey\&quot;, \&quot;value\&quot;: false, \&quot;lastUpdateTs\&quot;: 1609459200001},   {\&quot;key\&quot;: \&quot;doubleAttributeKey\&quot;, \&quot;value\&quot;: 42.2, \&quot;lastUpdateTs\&quot;: 1609459200002},   {\&quot;key\&quot;: \&quot;longKeyExample\&quot;, \&quot;value\&quot;: 73, \&quot;lastUpdateTs\&quot;: 1609459200003},   {\&quot;key\&quot;: \&quot;jsonKeyExample\&quot;,     \&quot;value\&quot;: {       \&quot;someNumber\&quot;: 42,       \&quot;someArray\&quot;: [1,2,3],       \&quot;someNestedObject\&quot;: {\&quot;key\&quot;: \&quot;value\&quot;}     },     \&quot;lastUpdateTs\&quot;: 1609459200004   } ] &#x60;&#x60;&#x60;   Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **entityId** | **String** | A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **scope** | **String** | A string value representing the attributes scope. For example, &#39;SERVER_SCOPE&#39;. | [enum: SERVER_SCOPE, SHARED_SCOPE, CLIENT_SCOPE] |
| **keys** | **String** | A string value representing the comma-separated list of attributes keys. For example, &#39;active,inactivityAlarmTime&#39;. If attribute keys contain comma, duplicate &#39;key&#39; parameter for each key, for example &#39;?key&#x3D;my,key&amp;key&#x3D;my,second,key | [optional] |
| **key** | **List&lt;String&gt;** | Repeatable key query parameter (alternative to comma-separated &#39;keys&#39;) | [optional] |


## getLatestTimeseries

> Map&lt;String, List&lt;TsData&gt;&gt; getLatestTimeseries(entityType, entityId, keys, useStrictDataTypes, key)

Get latest time series value (getLatestTimeseries)

Returns all time series that belong to specified entity. Use optional &#39;keys&#39; parameter to return specific time series. The result is a JSON object. The format of the values depends on the &#39;useStrictDataTypes&#39; parameter. By default, all time series values are converted to strings:   &#x60;&#x60;&#x60;json {   \&quot;stringTsKey\&quot;: [{ \&quot;value\&quot;: \&quot;value\&quot;, \&quot;ts\&quot;: 1609459200000}],   \&quot;booleanTsKey\&quot;: [{ \&quot;value\&quot;: \&quot;false\&quot;, \&quot;ts\&quot;: 1609459200000}],   \&quot;doubleTsKey\&quot;: [{ \&quot;value\&quot;: \&quot;42.2\&quot;, \&quot;ts\&quot;: 1609459200000}],   \&quot;longTsKey\&quot;: [{ \&quot;value\&quot;: \&quot;73\&quot;, \&quot;ts\&quot;: 1609459200000}],   \&quot;jsonTsKey\&quot;: [{ \&quot;value\&quot;: \&quot;{\\\&quot;someNumber\\\&quot;: 42,\\\&quot;someArray\\\&quot;: [1,2,3],\\\&quot;someNestedObject\\\&quot;: {\\\&quot;key\\\&quot;: \\\&quot;value\\\&quot;}}\&quot;, \&quot;ts\&quot;: 1609459200000}] }  &#x60;&#x60;&#x60;   However, it is possible to request the values without conversion (&#39;useStrictDataTypes&#39;&#x3D;true):   &#x60;&#x60;&#x60;json {   \&quot;stringTsKey\&quot;: [{ \&quot;value\&quot;: \&quot;value\&quot;, \&quot;ts\&quot;: 1609459200000}],   \&quot;booleanTsKey\&quot;: [{ \&quot;value\&quot;: false, \&quot;ts\&quot;: 1609459200000}],   \&quot;doubleTsKey\&quot;: [{ \&quot;value\&quot;: 42.2, \&quot;ts\&quot;: 1609459200000}],   \&quot;longTsKey\&quot;: [{ \&quot;value\&quot;: 73, \&quot;ts\&quot;: 1609459200000}],   \&quot;jsonTsKey\&quot;: [{      \&quot;value\&quot;: {       \&quot;someNumber\&quot;: 42,       \&quot;someArray\&quot;: [1,2,3],       \&quot;someNestedObject\&quot;: {\&quot;key\&quot;: \&quot;value\&quot;}     },      \&quot;ts\&quot;: 1609459200000}] }  &#x60;&#x60;&#x60;   Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **entityId** | **String** | A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **keys** | **String** | A string value representing the comma-separated list of telemetry keys. If keys are not selected, the result will return all latest time series. For example, &#39;temperature,humidity&#39;. If telemetry keys contain comma, duplicate &#39;key&#39; parameter for each key, for example &#39;?key&#x3D;my,key&amp;key&#x3D;my,second,key | [optional] |
| **useStrictDataTypes** | **Boolean** | Enables/disables conversion of telemetry values to strings. Conversion is enabled by default. Set parameter to &#39;true&#39; in order to disable the conversion. | [optional] [default to false] |
| **key** | **List&lt;String&gt;** | Repeatable key query parameter (alternative to comma-separated &#39;keys&#39;) | [optional] |


## getTimeseriesHistory

> Map&lt;String, List&lt;TsData&gt;&gt; getTimeseriesHistory(entityType, entityId, startTs, endTs, keys, intervalType, interval, timeZone, limit, agg, orderBy, useStrictDataTypes, key)

Get time series data (getTimeseriesHistory)

Returns a range of time series values for specified entity. Returns not aggregated data by default. Use aggregation function (&#39;agg&#39;) and aggregation interval (&#39;interval&#39;) to enable aggregation of the results on the database / server side. The aggregation is generally more efficient then fetching all records.   &#x60;&#x60;&#x60;json {   \&quot;temperature\&quot;: [     {       \&quot;value\&quot;: 36.7,       \&quot;ts\&quot;: 1609459200000     },     {       \&quot;value\&quot;: 36.6,       \&quot;ts\&quot;: 1609459201000     }   ] } &#x60;&#x60;&#x60;  Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **entityId** | **String** | A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **startTs** | **Long** | A long value representing the start timestamp of the time range in milliseconds, UTC. | |
| **endTs** | **Long** | A long value representing the end timestamp of the time range in milliseconds, UTC. | |
| **keys** | **String** | A string value representing the comma-separated list of telemetry keys. | [optional] |
| **intervalType** | **String** | A string value representing the type fo the interval. | [optional] [enum: MILLISECONDS, WEEK, WEEK_ISO, MONTH, QUARTER] |
| **interval** | **Long** | A long value representing the aggregation interval range in milliseconds. | [optional] [default to 0] |
| **timeZone** | **String** | A string value representing the timezone that will be used to calculate exact timestamps for &#39;WEEK&#39;, &#39;WEEK_ISO&#39;, &#39;MONTH&#39; and &#39;QUARTER&#39; interval types. | [optional] |
| **limit** | **String** | An integer value that represents a max number of time series data points to fetch. This parameter is used only in the case if &#39;agg&#39; parameter is set to &#39;NONE&#39;. | [optional] |
| **agg** | **String** | A string value representing the aggregation function. If the interval is not specified, &#39;agg&#39; parameter will use &#39;NONE&#39; value. | [optional] [enum: MIN, MAX, AVG, SUM, COUNT, NONE] |
| **orderBy** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **useStrictDataTypes** | **Boolean** | Enables/disables conversion of telemetry values to strings. Conversion is enabled by default. Set parameter to &#39;true&#39; in order to disable the conversion. | [optional] [default to false] |
| **key** | **List&lt;String&gt;** | Repeatable key query parameter (alternative to comma-separated &#39;keys&#39;) | [optional] |


## getTimeseriesKeys

> List&lt;String&gt; getTimeseriesKeys(entityType, entityId)

Get time series keys (getTimeseriesKeys)

Returns a set of unique time series key names for the selected entity.   Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **entityId** | **String** | A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## saveDeviceAttributes

> String saveDeviceAttributes(deviceId, scope, body)

Save device attributes (saveDeviceAttributes)

Creates or updates the device attributes based on device id and specified attribute scope. The request payload is a JSON object with key-value format of attributes to create or update. For example:  &#x60;&#x60;&#x60;json {  \&quot;stringKey\&quot;:\&quot;value1\&quot;,   \&quot;booleanKey\&quot;:true,   \&quot;doubleKey\&quot;:42.0,   \&quot;longKey\&quot;:73,   \&quot;jsonKey\&quot;: {     \&quot;someNumber\&quot;: 42,     \&quot;someArray\&quot;: [1,2,3],     \&quot;someNestedObject\&quot;: {\&quot;key\&quot;: \&quot;value\&quot;}  } } &#x60;&#x60;&#x60;   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String** | A string value representing the device id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **scope** | **String** | A string value representing the attributes scope. For example, &#39;SERVER_SCOPE&#39;. | [enum: SERVER_SCOPE, SHARED_SCOPE] |
| **body** | **String** | A string value representing the json object. For example, &#39;{\&quot;key\&quot;:\&quot;value\&quot;}&#39;. See API call description for more details. | |


## saveEntityAttributesV1

> String saveEntityAttributesV1(entityType, entityId, scope, body)

Save entity attributes (saveEntityAttributesV1)

Creates or updates the entity attributes based on Entity Id and the specified attribute scope.  List of possible attribute scopes depends on the entity type:    * SERVER_SCOPE - supported for all entity types;  * SHARED_SCOPE - supported for devices.  The request payload is a JSON object with key-value format of attributes to create or update. For example:  &#x60;&#x60;&#x60;json {  \&quot;stringKey\&quot;:\&quot;value1\&quot;,   \&quot;booleanKey\&quot;:true,   \&quot;doubleKey\&quot;:42.0,   \&quot;longKey\&quot;:73,   \&quot;jsonKey\&quot;: {     \&quot;someNumber\&quot;: 42,     \&quot;someArray\&quot;: [1,2,3],     \&quot;someNestedObject\&quot;: {\&quot;key\&quot;: \&quot;value\&quot;}  } } &#x60;&#x60;&#x60; Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **entityId** | **String** | A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **scope** | **String** | A string value representing the attributes scope. For example, &#39;SERVER_SCOPE&#39;. | [enum: SERVER_SCOPE, SHARED_SCOPE] |
| **body** | **String** | A string value representing the json object. For example, &#39;{\&quot;key\&quot;:\&quot;value\&quot;}&#39;. See API call description for more details. | |


## saveEntityAttributesV2

> String saveEntityAttributesV2(entityType, entityId, scope, body)

Save entity attributes (saveEntityAttributesV2)

Creates or updates the entity attributes based on Entity Id and the specified attribute scope.  List of possible attribute scopes depends on the entity type:    * SERVER_SCOPE - supported for all entity types;  * SHARED_SCOPE - supported for devices.  The request payload is a JSON object with key-value format of attributes to create or update. For example:  &#x60;&#x60;&#x60;json {  \&quot;stringKey\&quot;:\&quot;value1\&quot;,   \&quot;booleanKey\&quot;:true,   \&quot;doubleKey\&quot;:42.0,   \&quot;longKey\&quot;:73,   \&quot;jsonKey\&quot;: {     \&quot;someNumber\&quot;: 42,     \&quot;someArray\&quot;: [1,2,3],     \&quot;someNestedObject\&quot;: {\&quot;key\&quot;: \&quot;value\&quot;}  } } &#x60;&#x60;&#x60; Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **entityId** | **String** | A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **scope** | **String** | A string value representing the attributes scope. For example, &#39;SERVER_SCOPE&#39;. | [enum: SERVER_SCOPE, SHARED_SCOPE] |
| **body** | **String** | A string value representing the json object. For example, &#39;{\&quot;key\&quot;:\&quot;value\&quot;}&#39;. See API call description for more details. | |


## saveEntityTelemetry

> String saveEntityTelemetry(entityType, entityId, scope, body)

Save or update time series data (saveEntityTelemetry)

Creates or updates the entity time series data based on the Entity Id and request payload.The request payload is a JSON document with three possible formats:  Simple format without timestamp. In such a case, current server time will be used:   &#x60;&#x60;&#x60;json {\&quot;temperature\&quot;: 26} &#x60;&#x60;&#x60;   Single JSON object with timestamp:   &#x60;&#x60;&#x60;json {\&quot;ts\&quot;:1634712287000,\&quot;values\&quot;:{\&quot;temperature\&quot;:26, \&quot;humidity\&quot;:87}} &#x60;&#x60;&#x60;   JSON array with timestamps:   &#x60;&#x60;&#x60;json [{\&quot;ts\&quot;:1634712287000,\&quot;values\&quot;:{\&quot;temperature\&quot;:26, \&quot;humidity\&quot;:87}}, {\&quot;ts\&quot;:1634712588000,\&quot;values\&quot;:{\&quot;temperature\&quot;:25, \&quot;humidity\&quot;:88}}] &#x60;&#x60;&#x60;   The scope parameter is not used in the API call implementation but should be specified whatever value because it is used as a path variable. Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **entityId** | **String** | A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **scope** | **String** | Value is deprecated, reserved for backward compatibility and not used in the API call implementation. Specify any scope for compatibility | [enum: ANY] |
| **body** | **String** | A JSON with the telemetry values. See API call description for more details. | |


## saveEntityTelemetryWithTTL

> String saveEntityTelemetryWithTTL(entityType, entityId, scope, ttl, body)

Save or update time series data with TTL (saveEntityTelemetryWithTTL)

Creates or updates the entity time series data based on the Entity Id and request payload.The request payload is a JSON document with three possible formats:  Simple format without timestamp. In such a case, current server time will be used:   &#x60;&#x60;&#x60;json {\&quot;temperature\&quot;: 26} &#x60;&#x60;&#x60;   Single JSON object with timestamp:   &#x60;&#x60;&#x60;json {\&quot;ts\&quot;:1634712287000,\&quot;values\&quot;:{\&quot;temperature\&quot;:26, \&quot;humidity\&quot;:87}} &#x60;&#x60;&#x60;   JSON array with timestamps:   &#x60;&#x60;&#x60;json [{\&quot;ts\&quot;:1634712287000,\&quot;values\&quot;:{\&quot;temperature\&quot;:26, \&quot;humidity\&quot;:87}}, {\&quot;ts\&quot;:1634712588000,\&quot;values\&quot;:{\&quot;temperature\&quot;:25, \&quot;humidity\&quot;:88}}] &#x60;&#x60;&#x60;   The scope parameter is not used in the API call implementation but should be specified whatever value because it is used as a path variable.   The ttl parameter takes affect only in case of Cassandra DB.Referencing a non-existing entity Id or invalid entity type will cause an error.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **entityId** | **String** | A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **scope** | **String** | Value is deprecated, reserved for backward compatibility and not used in the API call implementation. Specify any scope for compatibility | [enum: ANY] |
| **ttl** | **Long** | A long value representing TTL (Time to Live) parameter. | |
| **body** | **String** | A JSON with the telemetry values. See API call description for more details. | |


# EventControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**clearEvents**](#clearEvents) | **POST** /api/events/{entityType}/{entityId}/clear | Clear Events (clearEvents) |
| [**getEvents**](#getEvents) | **GET** /api/events/{entityType}/{entityId} | Get Events (Deprecated) |
| [**getEvents1**](#getEvents1) | **POST** /api/events/{entityType}/{entityId} | Get Events by event filter (getEvents) |
| [**getEvents2**](#getEvents2) | **GET** /api/events/{entityType}/{entityId}/{eventType} | Get Events by type (getEvents) |



## clearEvents

> clearEvents(entityType, entityId, eventFilter, startTime, endTime)

Clear Events (clearEvents)

Clears events by filter for specified entity.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **entityId** | **String** | A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **eventFilter** | **EventFilter** |  | |
| **startTime** | **Long** | Timestamp. Events with creation time before it won&#39;t be queried. | [optional] |
| **endTime** | **Long** | Timestamp. Events with creation time after it won&#39;t be queried. | [optional] |


## getEvents

> PageDataEventInfo getEvents(entityType, entityId, tenantId, pageSize, page, textSearch, sortProperty, sortOrder, startTime, endTime)

Get Events (Deprecated)

Returns a page of events for specified entity. Deprecated and will be removed in next minor release. The call was deprecated to improve the performance of the system. Current implementation will return &#39;Lifecycle&#39; events only. Use &#39;Get events by type&#39; or &#39;Get events by filter&#39; instead. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. 

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **entityId** | **String** | A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **tenantId** | **String** | A string value representing the tenant id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The value is not used in searching. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: ts, id] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **startTime** | **Long** | Timestamp. Events with creation time before it won&#39;t be queried. | [optional] |
| **endTime** | **Long** | Timestamp. Events with creation time after it won&#39;t be queried. | [optional] |


## getEvents1

> PageDataEventInfo getEvents1(entityType, entityId, tenantId, pageSize, page, eventFilter, textSearch, sortProperty, sortOrder, startTime, endTime)

Get Events by event filter (getEvents)

Returns a page of events for the chosen entity by specifying the event filter. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   # Event Filter Definition  6 different eventFilter objects could be set for different event types. The eventType field is required. Others are optional. If some of them are set, the filtering will be applied according to them. See the examples below for all the fields used for each event type filtering.   Note,   * &#39;server&#39; - string value representing the server name, identif   ier or ip address where the platform is running;  * &#39;errorStr&#39; - the case insensitive &#39;contains&#39; filter based on error message.  ## Error Event Filter  &#x60;&#x60;&#x60;json {    \&quot;eventType\&quot;:\&quot;ERROR\&quot;,    \&quot;server\&quot;:\&quot;ip-172-31-24-152\&quot;,    \&quot;method\&quot;:\&quot;onClusterEventMsg\&quot;,    \&quot;errorStr\&quot;:\&quot;Error Message\&quot; } &#x60;&#x60;&#x60;   * &#39;method&#39; - string value representing the method name when the error happened.  ## Lifecycle Event Filter  &#x60;&#x60;&#x60;json {    \&quot;eventType\&quot;:\&quot;LC_EVENT\&quot;,    \&quot;server\&quot;:\&quot;ip-172-31-24-152\&quot;,    \&quot;event\&quot;:\&quot;STARTED\&quot;,    \&quot;status\&quot;:\&quot;Success\&quot;,    \&quot;errorStr\&quot;:\&quot;Error Message\&quot; } &#x60;&#x60;&#x60;   * &#39;event&#39; - string value representing the lifecycle event type;  * &#39;status&#39; - string value representing status of the lifecycle event.  ## Statistics Event Filter  &#x60;&#x60;&#x60;json {    \&quot;eventType\&quot;:\&quot;STATS\&quot;,    \&quot;server\&quot;:\&quot;ip-172-31-24-152\&quot;,    \&quot;messagesProcessed\&quot;:10,    \&quot;errorsOccurred\&quot;:5 } &#x60;&#x60;&#x60;   * &#39;messagesProcessed&#39; - the minimum number of successfully processed messages;  * &#39;errorsOccurred&#39; - the minimum number of errors occurred during messages processing.  ## Debug Rule Node Event Filter  &#x60;&#x60;&#x60;json {    \&quot;eventType\&quot;:\&quot;DEBUG_RULE_NODE\&quot;,    \&quot;msgDirectionType\&quot;:\&quot;IN\&quot;,    \&quot;server\&quot;:\&quot;ip-172-31-24-152\&quot;,    \&quot;dataSearch\&quot;:\&quot;humidity\&quot;,    \&quot;metadataSearch\&quot;:\&quot;deviceName\&quot;,    \&quot;entityName\&quot;:\&quot;DEVICE\&quot;,    \&quot;relationType\&quot;:\&quot;Success\&quot;,    \&quot;entityId\&quot;:\&quot;de9d54a0-2b7a-11ec-a3cc-23386423d98f\&quot;,    \&quot;msgType\&quot;:\&quot;POST_TELEMETRY_REQUEST\&quot;,    \&quot;isError\&quot;:\&quot;false\&quot;,    \&quot;errorStr\&quot;:\&quot;Error Message\&quot; } &#x60;&#x60;&#x60;  ## Debug Rule Chain Event Filter  &#x60;&#x60;&#x60;json {    \&quot;eventType\&quot;:\&quot;DEBUG_RULE_CHAIN\&quot;,    \&quot;msgDirectionType\&quot;:\&quot;IN\&quot;,    \&quot;server\&quot;:\&quot;ip-172-31-24-152\&quot;,    \&quot;dataSearch\&quot;:\&quot;humidity\&quot;,    \&quot;metadataSearch\&quot;:\&quot;deviceName\&quot;,    \&quot;entityName\&quot;:\&quot;DEVICE\&quot;,    \&quot;relationType\&quot;:\&quot;Success\&quot;,    \&quot;entityId\&quot;:\&quot;de9d54a0-2b7a-11ec-a3cc-23386423d98f\&quot;,    \&quot;msgType\&quot;:\&quot;POST_TELEMETRY_REQUEST\&quot;,    \&quot;isError\&quot;:\&quot;false\&quot;,    \&quot;errorStr\&quot;:\&quot;Error Message\&quot; } &#x60;&#x60;&#x60;   * &#39;msgDirectionType&#39; - string value representing msg direction type (incoming to entity or outcoming from entity);  * &#39;dataSearch&#39; - the case insensitive &#39;contains&#39; filter based on data (key and value) for the message;  * &#39;metadataSearch&#39; - the case insensitive &#39;contains&#39; filter based on metadata (key and value) for the message;  * &#39;entityName&#39; - string value representing the entity type;  * &#39;relationType&#39; - string value representing the type of message routing;  * &#39;entityId&#39; - string value representing the entity id in the event body (originator of the message);  * &#39;msgType&#39; - string value representing the message type;  * &#39;isError&#39; - boolean value to filter the errors.  ## Debug Calculated Field Event Filter  &#x60;&#x60;&#x60;json {    \&quot;eventType\&quot;:\&quot;DEBUG_CALCULATED_FIELD\&quot;,    \&quot;server\&quot;:\&quot;ip-172-31-24-152\&quot;,    \&quot;isError\&quot;:\&quot;false\&quot;,    \&quot;errorStr\&quot;:\&quot;Error Message\&quot;    \&quot;entityId\&quot;:\&quot;cf4b8741-f618-471f-ae08-d881ca7f9fe9\&quot;,    \&quot;msgId\&quot;:\&quot;5cf7d3a0-aee7-40dd-a737-ade05528e7eb\&quot;,    \&quot;msgType\&quot;:\&quot;POST_TELEMETRY_REQUEST\&quot;,    \&quot;arguments\&quot;:\&quot;{     \&quot;x\&quot;: {       \&quot;ts\&quot;: 1739432016629,       \&quot;value\&quot;: 20     },     \&quot;y\&quot;: {       \&quot;ts\&quot;: 1739429717656,       \&quot;value\&quot;: 12     }   }\&quot;,    \&quot;result\&quot;:\&quot;{     \&quot;x + y\&quot;: 32   }\&quot;, } &#x60;&#x60;&#x60;   * &#39;entityId&#39; - string value representing the entity id in the event body;  * &#39;entityType&#39; - string value representing the entity type;  * &#39;msgId&#39; - string value representing the message id in the rule engine;  * &#39;msgType&#39; - string value representing the message type;  * &#39;arguments&#39; - string value representing the arguments that were used in the calculation performed;  * &#39;result&#39; - string value representing the result of a calculation;  * &#39;isError&#39; - boolean value to filter the errors.  

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **entityId** | **String** | A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **tenantId** | **String** | A string value representing the tenant id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **eventFilter** | **EventFilter** |  | |
| **textSearch** | **String** | The value is not used in searching. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: ts, id] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **startTime** | **Long** | Timestamp. Events with creation time before it won&#39;t be queried. | [optional] |
| **endTime** | **Long** | Timestamp. Events with creation time after it won&#39;t be queried. | [optional] |


## getEvents2

> PageDataEventInfo getEvents2(entityType, entityId, eventType, tenantId, pageSize, page, textSearch, sortProperty, sortOrder, startTime, endTime)

Get Events by type (getEvents)

Returns a page of events for specified entity by specifying event type. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. 

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **entityId** | **String** | A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **eventType** | **String** | A string value representing event type | |
| **tenantId** | **String** | A string value representing the tenant id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The value is not used in searching. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: ts, id] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **startTime** | **Long** | Timestamp. Events with creation time before it won&#39;t be queried. | [optional] |
| **endTime** | **Long** | Timestamp. Events with creation time after it won&#39;t be queried. | [optional] |


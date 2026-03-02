# EventControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**clearEvents**](#clearEvents) | **POST** /api/events/{entityType}/{entityId}/clear | Clear Events (clearEvents) |
| [**getEventsByFilter**](#getEventsByFilter) | **POST** /api/events/{entityType}/{entityId} | Get Events by event filter (getEventsByFilter) |
| [**getEventsByType**](#getEventsByType) | **GET** /api/events/{entityType}/{entityId}/{eventType} | Get Events by type (getEventsByType) |
| [**getEventsDeprecated**](#getEventsDeprecated) | **GET** /api/events/{entityType}/{entityId} | Get Events (getEventsDeprecated) (Deprecated) |



## clearEvents

> clearEvents(entityType, entityId, eventFilter, startTime, endTime)

Clear Events (clearEvents)

Clears events by filter for specified entity.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **entityId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **eventFilter** | **EventFilter** |  | |
| **startTime** | **Long** | Timestamp. Events with creation time before it won't be queried. | [optional] |
| **endTime** | **Long** | Timestamp. Events with creation time after it won't be queried. | [optional] |

### Return type

null (empty response body)


## getEventsByFilter

> PageDataEventInfo getEventsByFilter(entityType, entityId, tenantId, pageSize, page, eventFilter, textSearch, sortProperty, sortOrder, startTime, endTime)

Get Events by event filter (getEventsByFilter)

Returns a page of events for the chosen entity by specifying the event filter. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   # Event Filter Definition  6 different eventFilter objects could be set for different event types. The eventType field is required. Others are optional. If some of them are set, the filtering will be applied according to them. See the examples below for all the fields used for each event type filtering.   Note,   * 'server' - string value representing the server name, identif   ier or ip address where the platform is running;  * 'errorStr' - the case insensitive 'contains' filter based on error message.  ## Error Event Filter  ```json {    \"eventType\":\"ERROR\",    \"server\":\"ip-172-31-24-152\",    \"method\":\"onClusterEventMsg\",    \"errorStr\":\"Error Message\" } ```   * 'method' - string value representing the method name when the error happened.  ## Lifecycle Event Filter  ```json {    \"eventType\":\"LC_EVENT\",    \"server\":\"ip-172-31-24-152\",    \"event\":\"STARTED\",    \"status\":\"Success\",    \"errorStr\":\"Error Message\" } ```   * 'event' - string value representing the lifecycle event type;  * 'status' - string value representing status of the lifecycle event.  ## Statistics Event Filter  ```json {    \"eventType\":\"STATS\",    \"server\":\"ip-172-31-24-152\",    \"messagesProcessed\":10,    \"errorsOccurred\":5 } ```   * 'messagesProcessed' - the minimum number of successfully processed messages;  * 'errorsOccurred' - the minimum number of errors occurred during messages processing.  ## Debug Rule Node Event Filter  ```json {    \"eventType\":\"DEBUG_RULE_NODE\",    \"msgDirectionType\":\"IN\",    \"server\":\"ip-172-31-24-152\",    \"dataSearch\":\"humidity\",    \"metadataSearch\":\"deviceName\",    \"entityName\":\"DEVICE\",    \"relationType\":\"Success\",    \"entityId\":\"de9d54a0-2b7a-11ec-a3cc-23386423d98f\",    \"msgType\":\"POST_TELEMETRY_REQUEST\",    \"isError\":\"false\",    \"errorStr\":\"Error Message\" } ```  ## Debug Rule Chain Event Filter  ```json {    \"eventType\":\"DEBUG_RULE_CHAIN\",    \"msgDirectionType\":\"IN\",    \"server\":\"ip-172-31-24-152\",    \"dataSearch\":\"humidity\",    \"metadataSearch\":\"deviceName\",    \"entityName\":\"DEVICE\",    \"relationType\":\"Success\",    \"entityId\":\"de9d54a0-2b7a-11ec-a3cc-23386423d98f\",    \"msgType\":\"POST_TELEMETRY_REQUEST\",    \"isError\":\"false\",    \"errorStr\":\"Error Message\" } ```   * 'msgDirectionType' - string value representing msg direction type (incoming to entity or outcoming from entity);  * 'dataSearch' - the case insensitive 'contains' filter based on data (key and value) for the message;  * 'metadataSearch' - the case insensitive 'contains' filter based on metadata (key and value) for the message;  * 'entityName' - string value representing the entity type;  * 'relationType' - string value representing the type of message routing;  * 'entityId' - string value representing the entity id in the event body (originator of the message);  * 'msgType' - string value representing the message type;  * 'isError' - boolean value to filter the errors.  ## Debug Calculated Field Event Filter  ```json {    \"eventType\":\"DEBUG_CALCULATED_FIELD\",    \"server\":\"ip-172-31-24-152\",    \"isError\":\"false\",    \"errorStr\":\"Error Message\"    \"entityId\":\"cf4b8741-f618-471f-ae08-d881ca7f9fe9\",    \"msgId\":\"5cf7d3a0-aee7-40dd-a737-ade05528e7eb\",    \"msgType\":\"POST_TELEMETRY_REQUEST\",    \"arguments\":\"{     \"x\": {       \"ts\": 1739432016629,       \"value\": 20     },     \"y\": {       \"ts\": 1739429717656,       \"value\": 12     }   }\",    \"result\":\"{     \"x + y\": 32   }\", } ```   * 'entityId' - string value representing the entity id in the event body;  * 'entityType' - string value representing the entity type;  * 'msgId' - string value representing the message id in the rule engine;  * 'msgType' - string value representing the message type;  * 'arguments' - string value representing the arguments that were used in the calculation performed;  * 'result' - string value representing the result of a calculation;  * 'isError' - boolean value to filter the errors.  


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **entityId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **tenantId** | **String** | A string value representing the tenant id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **eventFilter** | **EventFilter** |  | |
| **textSearch** | **String** | The value is not used in searching. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: ts, id] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **startTime** | **Long** | Timestamp. Events with creation time before it won't be queried. | [optional] |
| **endTime** | **Long** | Timestamp. Events with creation time after it won't be queried. | [optional] |

### Return type

**PageDataEventInfo**


## getEventsByType

> PageDataEventInfo getEventsByType(entityType, entityId, eventType, tenantId, pageSize, page, textSearch, sortProperty, sortOrder, startTime, endTime)

Get Events by type (getEventsByType)

Returns a page of events for specified entity by specifying event type. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **entityId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **eventType** | **String** | A string value representing event type | |
| **tenantId** | **String** | A string value representing the tenant id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The value is not used in searching. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: ts, id] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **startTime** | **Long** | Timestamp. Events with creation time before it won't be queried. | [optional] |
| **endTime** | **Long** | Timestamp. Events with creation time after it won't be queried. | [optional] |

### Return type

**PageDataEventInfo**


## getEventsDeprecated

> PageDataEventInfo getEventsDeprecated(entityType, entityId, tenantId, pageSize, page, textSearch, sortProperty, sortOrder, startTime, endTime)

Get Events (getEventsDeprecated) (Deprecated)

Returns a page of events for specified entity. Deprecated and will be removed in next minor release. The call was deprecated to improve the performance of the system. Current implementation will return 'Lifecycle' events only. Use 'Get events by type' or 'Get events by filter' instead. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **entityId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **tenantId** | **String** | A string value representing the tenant id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The value is not used in searching. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: ts, id] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **startTime** | **Long** | Timestamp. Events with creation time before it won't be queried. | [optional] |
| **endTime** | **Long** | Timestamp. Events with creation time after it won't be queried. | [optional] |

### Return type

**PageDataEventInfo**


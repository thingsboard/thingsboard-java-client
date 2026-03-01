# AlarmControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ackAlarm**](#ackAlarm) | **POST** /api/alarm/{alarmId}/ack | Acknowledge Alarm (ackAlarm) |
| [**assignAlarm**](#assignAlarm) | **POST** /api/alarm/{alarmId}/assign/{assigneeId} | Assign/Reassign Alarm (assignAlarm) |
| [**clearAlarm**](#clearAlarm) | **POST** /api/alarm/{alarmId}/clear | Clear Alarm (clearAlarm) |
| [**deleteAlarm**](#deleteAlarm) | **DELETE** /api/alarm/{alarmId} | Delete Alarm (deleteAlarm) |
| [**getAlarmById**](#getAlarmById) | **GET** /api/alarm/{alarmId} | Get Alarm (getAlarmById) |
| [**getAlarmInfoById**](#getAlarmInfoById) | **GET** /api/alarm/info/{alarmId} | Get Alarm Info (getAlarmInfoById) |
| [**getAlarmTypes**](#getAlarmTypes) | **GET** /api/alarm/types | Get Alarm Types (getAlarmTypes) |
| [**getAlarms**](#getAlarms) | **GET** /api/alarm/{entityType}/{entityId} | Get Alarms (getAlarms) |
| [**getAlarmsV2**](#getAlarmsV2) | **GET** /api/v2/alarm/{entityType}/{entityId} | Get Alarms (getAlarmsV2) |
| [**getAllAlarms**](#getAllAlarms) | **GET** /api/alarms | Get All Alarms (getAllAlarms) |
| [**getAllAlarmsV2**](#getAllAlarmsV2) | **GET** /api/v2/alarms | Get All Alarms (getAllAlarmsV2) |
| [**getHighestAlarmSeverity**](#getHighestAlarmSeverity) | **GET** /api/alarm/highestSeverity/{entityType}/{entityId} | Get Highest Alarm Severity (getHighestAlarmSeverity) |
| [**saveAlarm**](#saveAlarm) | **POST** /api/alarm | Create or Update Alarm (saveAlarm) |
| [**unassignAlarm**](#unassignAlarm) | **DELETE** /api/alarm/{alarmId}/assign | Unassign Alarm (unassignAlarm) |



## ackAlarm

> AlarmInfo ackAlarm(alarmId)

Acknowledge Alarm (ackAlarm)

Acknowledge the Alarm. Once acknowledged, the 'ack_ts' field will be set to current timestamp and special rule chain event 'ALARM_ACK' will be generated. Referencing non-existing Alarm Id will cause an error.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alarmId** | **String** | A string value representing the alarm id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**AlarmInfo**


## assignAlarm

> Alarm assignAlarm(alarmId, assigneeId)

Assign/Reassign Alarm (assignAlarm)

Assign the Alarm. Once assigned, the 'assign_ts' field will be set to current timestamp and special rule chain event 'ALARM_ASSIGNED' (or ALARM_REASSIGNED in case of assigning already assigned alarm) will be generated. Referencing non-existing Alarm Id will cause an error.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alarmId** | **String** | A string value representing the alarm id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **assigneeId** | **String** | A string value representing the user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**Alarm**


## clearAlarm

> AlarmInfo clearAlarm(alarmId)

Clear Alarm (clearAlarm)

Clear the Alarm. Once cleared, the 'clear_ts' field will be set to current timestamp and special rule chain event 'ALARM_CLEAR' will be generated. Referencing non-existing Alarm Id will cause an error.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alarmId** | **String** | A string value representing the alarm id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**AlarmInfo**


## deleteAlarm

> Boolean deleteAlarm(alarmId)

Delete Alarm (deleteAlarm)

Deletes the Alarm. Referencing non-existing Alarm Id will cause an error.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alarmId** | **String** | A string value representing the alarm id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**Boolean**


## getAlarmById

> Alarm getAlarmById(alarmId)

Get Alarm (getAlarmById)

Fetch the Alarm object based on the provided Alarm Id. If the user has the authority of 'Tenant Administrator', the server checks that the originator of alarm is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the originator of alarm belongs to the customer. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alarmId** | **String** | A string value representing the alarm id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**Alarm**


## getAlarmInfoById

> AlarmInfo getAlarmInfoById(alarmId)

Get Alarm Info (getAlarmInfoById)

Fetch the Alarm Info object based on the provided Alarm Id. If the user has the authority of 'Tenant Administrator', the server checks that the originator of alarm is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the originator of alarm belongs to the customer. Alarm Info is an extension of the default Alarm object that also contains name of the alarm originator.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alarmId** | **String** | A string value representing the alarm id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**AlarmInfo**


## getAlarmTypes

> PageDataEntitySubtype getAlarmTypes(pageSize, page, textSearch, sortOrder)

Get Alarm Types (getAlarmTypes)

Returns a set of unique alarm types based on alarms that are either owned by the tenant or assigned to the customer which user is performing the request.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on of next alarm fields: type, severity or status | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataEntitySubtype**


## getAlarms

> PageDataAlarmInfo getAlarms(entityType, entityId, pageSize, page, searchStatus, status, assigneeId, textSearch, sortProperty, sortOrder, startTime, endTime, fetchOriginator)

Get Alarms (getAlarms)

Returns a page of alarms for the selected entity. Specifying both parameters 'searchStatus' and 'status' at the same time will cause an error. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **entityId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **searchStatus** | **String** | A string value representing one of the AlarmSearchStatus enumeration value | [optional] [enum: ANY, ACTIVE, CLEARED, ACK, UNACK] |
| **status** | **String** | A string value representing one of the AlarmStatus enumeration value | [optional] [enum: ACTIVE_UNACK, ACTIVE_ACK, CLEARED_UNACK, CLEARED_ACK] |
| **assigneeId** | **String** | A string value representing the assignee user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on of next alarm fields: type, severity or status | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, startTs, endTs, type, ackTs, clearTs, severity, status] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **startTime** | **Long** | The start timestamp in milliseconds of the search time range over the Alarm class field: 'createdTime'. | [optional] |
| **endTime** | **Long** | The end timestamp in milliseconds of the search time range over the Alarm class field: 'createdTime'. | [optional] |
| **fetchOriginator** | **Boolean** | A boolean value to specify if the alarm originator name will be filled in the AlarmInfo object  field: 'originatorName' or will returns as null. | [optional] |

### Return type

**PageDataAlarmInfo**


## getAlarmsV2

> PageDataAlarmInfo getAlarmsV2(entityType, entityId, pageSize, page, statusList, severityList, typeList, assigneeId, textSearch, sortProperty, sortOrder, startTime, endTime)

Get Alarms (getAlarmsV2)

Returns a page of alarms for the selected entity. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **entityId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **statusList** | **List<String>** | A list of string values separated by comma ',' representing one of the AlarmSearchStatus enumeration value | [optional] [enum: ANY, ACTIVE, CLEARED, ACK, UNACK] |
| **severityList** | **List<String>** | A list of string values separated by comma ',' representing one of the AlarmSeverity enumeration value | [optional] [enum: CRITICAL, MAJOR, MINOR, WARNING, INDETERMINATE] |
| **typeList** | **List<String>** | A list of string values separated by comma ',' representing alarm types | [optional] |
| **assigneeId** | **String** | A string value representing the assignee user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on of next alarm fields: type, severity or status | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, startTs, endTs, type, ackTs, clearTs, severity, status] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **startTime** | **Long** | The start timestamp in milliseconds of the search time range over the Alarm class field: 'createdTime'. | [optional] |
| **endTime** | **Long** | The end timestamp in milliseconds of the search time range over the Alarm class field: 'createdTime'. | [optional] |

### Return type

**PageDataAlarmInfo**


## getAllAlarms

> PageDataAlarmInfo getAllAlarms(pageSize, page, searchStatus, status, assigneeId, textSearch, sortProperty, sortOrder, startTime, endTime, fetchOriginator)

Get All Alarms (getAllAlarms)

Returns a page of alarms that belongs to the current user owner. If the user has the authority of 'Tenant Administrator', the server returns alarms that belongs to the tenant of current user. If the user has the authority of 'Customer User', the server returns alarms that belongs to the customer of current user. Specifying both parameters 'searchStatus' and 'status' at the same time will cause an error. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **searchStatus** | **String** | A string value representing one of the AlarmSearchStatus enumeration value | [optional] [enum: ANY, ACTIVE, CLEARED, ACK, UNACK] |
| **status** | **String** | A string value representing one of the AlarmStatus enumeration value | [optional] [enum: ACTIVE_UNACK, ACTIVE_ACK, CLEARED_UNACK, CLEARED_ACK] |
| **assigneeId** | **String** | A string value representing the assignee user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on of next alarm fields: type, severity or status | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, startTs, endTs, type, ackTs, clearTs, severity, status] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **startTime** | **Long** | The start timestamp in milliseconds of the search time range over the Alarm class field: 'createdTime'. | [optional] |
| **endTime** | **Long** | The end timestamp in milliseconds of the search time range over the Alarm class field: 'createdTime'. | [optional] |
| **fetchOriginator** | **Boolean** | A boolean value to specify if the alarm originator name will be filled in the AlarmInfo object  field: 'originatorName' or will returns as null. | [optional] |

### Return type

**PageDataAlarmInfo**


## getAllAlarmsV2

> PageDataAlarmInfo getAllAlarmsV2(pageSize, page, statusList, severityList, typeList, assigneeId, textSearch, sortProperty, sortOrder, startTime, endTime)

Get All Alarms (getAllAlarmsV2)

Returns a page of alarms that belongs to the current user owner. If the user has the authority of 'Tenant Administrator', the server returns alarms that belongs to the tenant of current user. If the user has the authority of 'Customer User', the server returns alarms that belongs to the customer of current user. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **statusList** | **List<String>** | A list of string values separated by comma ',' representing one of the AlarmSearchStatus enumeration value | [optional] [enum: ANY, ACTIVE, CLEARED, ACK, UNACK] |
| **severityList** | **List<String>** | A list of string values separated by comma ',' representing one of the AlarmSeverity enumeration value | [optional] [enum: CRITICAL, MAJOR, MINOR, WARNING, INDETERMINATE] |
| **typeList** | **List<String>** | A list of string values separated by comma ',' representing alarm types | [optional] |
| **assigneeId** | **String** | A string value representing the assignee user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on of next alarm fields: type, severity or status | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, startTs, endTs, type, ackTs, clearTs, severity, status] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **startTime** | **Long** | The start timestamp in milliseconds of the search time range over the Alarm class field: 'createdTime'. | [optional] |
| **endTime** | **Long** | The end timestamp in milliseconds of the search time range over the Alarm class field: 'createdTime'. | [optional] |

### Return type

**PageDataAlarmInfo**


## getHighestAlarmSeverity

> AlarmSeverity getHighestAlarmSeverity(entityType, entityId, searchStatus, status, assigneeId)

Get Highest Alarm Severity (getHighestAlarmSeverity)

Search the alarms by originator ('entityType' and entityId') and optional 'status' or 'searchStatus' filters and returns the highest AlarmSeverity(CRITICAL, MAJOR, MINOR, WARNING or INDETERMINATE). Specifying both parameters 'searchStatus' and 'status' at the same time will cause an error.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **entityId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **searchStatus** | **String** | A string value representing one of the AlarmSearchStatus enumeration value | [optional] [enum: ANY, ACTIVE, CLEARED, ACK, UNACK] |
| **status** | **String** | A string value representing one of the AlarmStatus enumeration value | [optional] [enum: ACTIVE_UNACK, ACTIVE_ACK, CLEARED_UNACK, CLEARED_ACK] |
| **assigneeId** | **String** | A string value representing the assignee user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | [optional] |

### Return type

**AlarmSeverity**


## saveAlarm

> Alarm saveAlarm(alarm)

Create or Update Alarm (saveAlarm)

Creates or Updates the Alarm. When creating alarm, platform generates Alarm Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Alarm id will be present in the response. Specify existing Alarm id to update the alarm. Referencing non-existing Alarm Id will cause 'Not Found' error.   Platform also deduplicate the alarms based on the entity id of originator and alarm 'type'. For example, if the user or system component create the alarm with the type 'HighTemperature' for device 'Device A' the new active alarm is created. If the user tries to create 'HighTemperature' alarm for the same device again, the previous alarm will be updated (the 'end_ts' will be set to current timestamp). If the user clears the alarm (see 'Clear Alarm(clearAlarm)'), than new alarm with the same type and same device may be created. Remove 'id', 'tenantId' and optionally 'customerId' from the request body example (below) to create new Alarm entity.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alarm** | **Alarm** | A JSON value representing the alarm. | |

### Return type

**Alarm**


## unassignAlarm

> Alarm unassignAlarm(alarmId)

Unassign Alarm (unassignAlarm)

Unassign the Alarm. Once unassigned, the 'assign_ts' field will be set to current timestamp and special rule chain event 'ALARM_UNASSIGNED' will be generated. Referencing non-existing Alarm Id will cause an error.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alarmId** | **String** | A string value representing the alarm id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**Alarm**


# AlarmControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
AlarmInfo ackAlarm(AckAlarmArgs args) // Acknowledge Alarm (ackAlarm)
Alarm assignAlarm(AssignAlarmArgs args) // Assign/Reassign Alarm (assignAlarm)
AlarmInfo clearAlarm(ClearAlarmArgs args) // Clear Alarm (clearAlarm)
Boolean deleteAlarm(DeleteAlarmArgs args) // Delete Alarm (deleteAlarm)
Alarm getAlarmById(GetAlarmByIdArgs args) // Get Alarm (getAlarmById)
AlarmInfo getAlarmInfoById(GetAlarmInfoByIdArgs args) // Get Alarm Info (getAlarmInfoById)
PageDataEntitySubtype getAlarmTypes(GetAlarmTypesArgs args) // Get Alarm Types (getAlarmTypes)
PageDataAlarmInfo getAlarmsByEntity(GetAlarmsByEntityArgs args) // Get Alarms (getAlarmsByEntity)
PageDataAlarmInfo getAlarmsV2(GetAlarmsV2Args args) // Get Alarms (getAlarmsV2)
PageDataAlarmInfo getAllAlarms(GetAllAlarmsArgs args) // Get All Alarms (getAllAlarms)
PageDataAlarmInfo getAllAlarmsV2(GetAllAlarmsV2Args args) // Get All Alarms (getAllAlarmsV2)
AlarmSeverity getHighestAlarmSeverity(GetHighestAlarmSeverityArgs args) // Get Highest Alarm Severity (getHighestAlarmSeverity)
Alarm saveAlarm(SaveAlarmArgs args) // Create or Update Alarm (saveAlarm)
Alarm unassignAlarm(UnassignAlarmArgs args) // Unassign Alarm (unassignAlarm)
```


## ackAlarm

**POST** `/api/alarm/{alarmId}/ack`

Acknowledge Alarm (ackAlarm)

Acknowledge the Alarm. Once acknowledged, the 'ack_ts' field will be set to current timestamp and special rule chain event 'ALARM_ACK' will be generated. Referencing non-existing Alarm Id will cause an error.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'WRITE' permission for the entity (entities).

```java
AlarmInfo ackAlarm(AckAlarmArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
AckAlarmArgs.builder()
        .alarmId(String)
        .build()
```

### `AckAlarmArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `alarmId` | `String` | **yes** | A string value representing the alarm id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`AlarmInfo`


## assignAlarm

**POST** `/api/alarm/{alarmId}/assign/{assigneeId}`

Assign/Reassign Alarm (assignAlarm)

Assign the Alarm. Once assigned, the 'assign_ts' field will be set to current timestamp and special rule chain event 'ALARM_ASSIGNED' (or ALARM_REASSIGNED in case of assigning already assigned alarm) will be generated. Referencing non-existing Alarm Id will cause an error.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
Alarm assignAlarm(AssignAlarmArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
AssignAlarmArgs.builder()
        .alarmId(String)
        .assigneeId(String)
        .build()
```

### `AssignAlarmArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `alarmId` | `String` | **yes** | A string value representing the alarm id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `assigneeId` | `String` | **yes** | A string value representing the user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Alarm`


## clearAlarm

**POST** `/api/alarm/{alarmId}/clear`

Clear Alarm (clearAlarm)

Clear the Alarm. Once cleared, the 'clear_ts' field will be set to current timestamp and special rule chain event 'ALARM_CLEAR' will be generated. Referencing non-existing Alarm Id will cause an error.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'WRITE' permission for the entity (entities).

```java
AlarmInfo clearAlarm(ClearAlarmArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ClearAlarmArgs.builder()
        .alarmId(String)
        .build()
```

### `ClearAlarmArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `alarmId` | `String` | **yes** | A string value representing the alarm id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`AlarmInfo`


## deleteAlarm

**DELETE** `/api/alarm/{alarmId}`

Delete Alarm (deleteAlarm)

Deletes the Alarm. Referencing non-existing Alarm Id will cause an error.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'DELETE' permission for the entity (entities).

```java
Boolean deleteAlarm(DeleteAlarmArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteAlarmArgs.builder()
        .alarmId(String)
        .build()
```

### `DeleteAlarmArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `alarmId` | `String` | **yes** | A string value representing the alarm id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Boolean`


## getAlarmById

**GET** `/api/alarm/{alarmId}`

Get Alarm (getAlarmById)

Fetch the Alarm object based on the provided Alarm Id.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
Alarm getAlarmById(GetAlarmByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAlarmByIdArgs.builder()
        .alarmId(String)
        .build()
```

### `GetAlarmByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `alarmId` | `String` | **yes** | A string value representing the alarm id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Alarm`


## getAlarmInfoById

**GET** `/api/alarm/info/{alarmId}`

Get Alarm Info (getAlarmInfoById)

Fetch the Alarm Info object based on the provided Alarm Id. Alarm Info is an extension of the default Alarm object that also contains name of the alarm originator.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
AlarmInfo getAlarmInfoById(GetAlarmInfoByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAlarmInfoByIdArgs.builder()
        .alarmId(String)
        .build()
```

### `GetAlarmInfoByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `alarmId` | `String` | **yes** | A string value representing the alarm id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`AlarmInfo`


## getAlarmTypes

**GET** `/api/alarm/types`

Get Alarm Types (getAlarmTypes)

Returns a set of unique alarm types based on alarms that are either owned by the tenant or assigned to the customer which user is performing the request.

```java
PageDataEntitySubtype getAlarmTypes(GetAlarmTypesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAlarmTypesArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetAlarmTypesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on of next alarm fields: type, severity or status | |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataEntitySubtype`


## getAlarmsByEntity

**GET** `/api/alarm/{entityType}/{entityId}`

Get Alarms (getAlarmsByEntity)

Returns a page of alarms for the selected entity. Specifying both parameters 'searchStatus' and 'status' at the same time will cause an error.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
PageDataAlarmInfo getAlarmsByEntity(GetAlarmsByEntityArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAlarmsByEntityArgs.builder()
        .entityType(String)
        .entityId(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetAlarmsByEntityArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `entityId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `searchStatus` | `String` | no | A string value representing one of the AlarmSearchStatus enumeration value | enum: `ANY`, `ACTIVE`, `CLEARED`, `ACK`, `UNACK` |
| `status` | `String` | no | A string value representing one of the AlarmStatus enumeration value | enum: `ACTIVE_UNACK`, `ACTIVE_ACK`, `CLEARED_UNACK`, `CLEARED_ACK` |
| `assigneeId` | `String` | no | A string value representing the assignee user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on of next alarm fields: type, severity or status | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `startTs`, `endTs`, `type`, `ackTs`, `clearTs`, `severity`, `status` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |
| `startTime` | `Long` | no | The start timestamp in milliseconds of the search time range over the Alarm class field: 'createdTime'. | |
| `endTime` | `Long` | no | The end timestamp in milliseconds of the search time range over the Alarm class field: 'createdTime'. | |
| `fetchOriginator` | `Boolean` | no | A boolean value to specify if the alarm originator name will be filled in the AlarmInfo object  field: 'originatorName' or will returns as null. | |

### Return type

`PageDataAlarmInfo`


## getAlarmsV2

**GET** `/api/v2/alarm/{entityType}/{entityId}`

Get Alarms (getAlarmsV2)

Returns a page of alarms for the selected entity. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
PageDataAlarmInfo getAlarmsV2(GetAlarmsV2Args args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAlarmsV2Args.builder()
        .entityType(String)
        .entityId(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetAlarmsV2Args` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `entityId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `statusList` | `List<String>` | no | A list of string values separated by comma ',' representing one of the AlarmSearchStatus enumeration value | enum: `ANY`, `ACTIVE`, `CLEARED`, `ACK`, `UNACK` |
| `severityList` | `List<String>` | no | A list of string values separated by comma ',' representing one of the AlarmSeverity enumeration value | enum: `CRITICAL`, `MAJOR`, `MINOR`, `WARNING`, `INDETERMINATE` |
| `typeList` | `List<String>` | no | A list of string values separated by comma ',' representing alarm types | |
| `assigneeId` | `String` | no | A string value representing the assignee user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on of next alarm fields: type, severity or status | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `startTs`, `endTs`, `type`, `ackTs`, `clearTs`, `severity`, `status` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |
| `startTime` | `Long` | no | The start timestamp in milliseconds of the search time range over the Alarm class field: 'createdTime'. | |
| `endTime` | `Long` | no | The end timestamp in milliseconds of the search time range over the Alarm class field: 'createdTime'. | |

### Return type

`PageDataAlarmInfo`


## getAllAlarms

**GET** `/api/alarms`

Get All Alarms (getAllAlarms)

Returns a page of alarms that belongs to the current user owner. If the user has the authority of 'Tenant Administrator', the server returns alarms that belongs to the tenant of current user. If the user has the authority of 'Customer User', the server returns alarms that belongs to the customer of current user. Specifying both parameters 'searchStatus' and 'status' at the same time will cause an error. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
PageDataAlarmInfo getAllAlarms(GetAllAlarmsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAllAlarmsArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetAllAlarmsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `searchStatus` | `String` | no | A string value representing one of the AlarmSearchStatus enumeration value | enum: `ANY`, `ACTIVE`, `CLEARED`, `ACK`, `UNACK` |
| `status` | `String` | no | A string value representing one of the AlarmStatus enumeration value | enum: `ACTIVE_UNACK`, `ACTIVE_ACK`, `CLEARED_UNACK`, `CLEARED_ACK` |
| `assigneeId` | `String` | no | A string value representing the assignee user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on of next alarm fields: type, severity or status | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `startTs`, `endTs`, `type`, `ackTs`, `clearTs`, `severity`, `status` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |
| `startTime` | `Long` | no | The start timestamp in milliseconds of the search time range over the Alarm class field: 'createdTime'. | |
| `endTime` | `Long` | no | The end timestamp in milliseconds of the search time range over the Alarm class field: 'createdTime'. | |
| `fetchOriginator` | `Boolean` | no | A boolean value to specify if the alarm originator name will be filled in the AlarmInfo object  field: 'originatorName' or will returns as null. | |

### Return type

`PageDataAlarmInfo`


## getAllAlarmsV2

**GET** `/api/v2/alarms`

Get All Alarms (getAllAlarmsV2)

Returns a page of alarms that belongs to the current user owner. If the user has the authority of 'Tenant Administrator', the server returns alarms that belongs to the tenant of current user. If the user has the authority of 'Customer User', the server returns alarms that belongs to the customer of current user. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
PageDataAlarmInfo getAllAlarmsV2(GetAllAlarmsV2Args args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAllAlarmsV2Args.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetAllAlarmsV2Args` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `statusList` | `List<String>` | no | A list of string values separated by comma ',' representing one of the AlarmSearchStatus enumeration value | enum: `ANY`, `ACTIVE`, `CLEARED`, `ACK`, `UNACK` |
| `severityList` | `List<String>` | no | A list of string values separated by comma ',' representing one of the AlarmSeverity enumeration value | enum: `CRITICAL`, `MAJOR`, `MINOR`, `WARNING`, `INDETERMINATE` |
| `typeList` | `List<String>` | no | A list of string values separated by comma ',' representing alarm types | |
| `assigneeId` | `String` | no | A string value representing the assignee user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on of next alarm fields: type, severity or status | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `startTs`, `endTs`, `type`, `ackTs`, `clearTs`, `severity`, `status` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |
| `startTime` | `Long` | no | The start timestamp in milliseconds of the search time range over the Alarm class field: 'createdTime'. | |
| `endTime` | `Long` | no | The end timestamp in milliseconds of the search time range over the Alarm class field: 'createdTime'. | |

### Return type

`PageDataAlarmInfo`


## getHighestAlarmSeverity

**GET** `/api/alarm/highestSeverity/{entityType}/{entityId}`

Get Highest Alarm Severity (getHighestAlarmSeverity)

Search the alarms by originator ('entityType' and entityId') and optional 'status' or 'searchStatus' filters and returns the highest AlarmSeverity(CRITICAL, MAJOR, MINOR, WARNING or INDETERMINATE). Specifying both parameters 'searchStatus' and 'status' at the same time will cause an error.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
AlarmSeverity getHighestAlarmSeverity(GetHighestAlarmSeverityArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetHighestAlarmSeverityArgs.builder()
        .entityType(String)
        .entityId(String)
        .build()
```

### `GetHighestAlarmSeverityArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `entityId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `searchStatus` | `String` | no | A string value representing one of the AlarmSearchStatus enumeration value | enum: `ANY`, `ACTIVE`, `CLEARED`, `ACK`, `UNACK` |
| `status` | `String` | no | A string value representing one of the AlarmStatus enumeration value | enum: `ACTIVE_UNACK`, `ACTIVE_ACK`, `CLEARED_UNACK`, `CLEARED_ACK` |
| `assigneeId` | `String` | no | A string value representing the assignee user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`AlarmSeverity`


## saveAlarm

**POST** `/api/alarm`

Create or Update Alarm (saveAlarm)

Creates or Updates the Alarm. When creating alarm, platform generates Alarm Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Alarm id will be present in the response. Specify existing Alarm id to update the alarm. Referencing non-existing Alarm Id will cause 'Not Found' error.   Platform also deduplicate the alarms based on the entity id of originator and alarm 'type'. For example, if the user or system component create the alarm with the type 'HighTemperature' for device 'Device A' the new active alarm is created. If the user tries to create 'HighTemperature' alarm for the same device again, the previous alarm will be updated (the 'end_ts' will be set to current timestamp). If the user clears the alarm (see 'Clear Alarm(clearAlarm)'), than new alarm with the same type and same device may be created. Remove 'id', 'tenantId' and optionally 'customerId' from the request body example (below) to create new Alarm entity.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'WRITE' permission for the entity (entities).

```java
Alarm saveAlarm(SaveAlarmArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveAlarmArgs.builder()
        .alarm(Alarm)
        .build()
```

### `SaveAlarmArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `alarm` | `Alarm` | **yes** | A JSON value representing the alarm. | |

### Return type

`Alarm`


## unassignAlarm

**DELETE** `/api/alarm/{alarmId}/assign`

Unassign Alarm (unassignAlarm)

Unassign the Alarm. Once unassigned, the 'assign_ts' field will be set to current timestamp and special rule chain event 'ALARM_UNASSIGNED' will be generated. Referencing non-existing Alarm Id will cause an error.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
Alarm unassignAlarm(UnassignAlarmArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UnassignAlarmArgs.builder()
        .alarmId(String)
        .build()
```

### `UnassignAlarmArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `alarmId` | `String` | **yes** | A string value representing the alarm id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Alarm`


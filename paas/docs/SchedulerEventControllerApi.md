# SchedulerEventControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
SchedulerEventInfo assignSchedulerEventToEdge(AssignSchedulerEventToEdgeArgs args) // Assign scheduler event to edge (assignSchedulerEventToEdge)
void deleteSchedulerEvent(DeleteSchedulerEventArgs args) // Delete Scheduler Event (deleteSchedulerEvent)
SchedulerEvent enableSchedulerEvent(EnableSchedulerEventArgs args) // Enable or disable Scheduler Event (enableSchedulerEvent)
List<SchedulerEventInfo> getAllEdgeSchedulerEvents(GetAllEdgeSchedulerEventsArgs args) // Get All Edge Scheduler Events (getAllEdgeSchedulerEvents)
List<SchedulerEventWithCustomerInfo> getAllSchedulerEvents(GetAllSchedulerEventsArgs args) // Get all scheduler events (getAllSchedulerEvents)
PageDataSchedulerEventInfo getEdgeSchedulerEvents(GetEdgeSchedulerEventsArgs args) // Get Edge Scheduler Events (getEdgeSchedulerEvents)
PageDataScheduledReportInfo getScheduledReportEvents(GetScheduledReportEventsArgs args) // Get Scheduled Report Events (getScheduledReportEvents)
SchedulerEvent getSchedulerEventById(GetSchedulerEventByIdArgs args) // Get Scheduler Event (getSchedulerEventById)
SchedulerEventWithCustomerInfo getSchedulerEventInfoById(GetSchedulerEventInfoByIdArgs args) // Get Scheduler Event With Customer Info (getSchedulerEventInfoById)
PageDataSchedulerEventWithCustomerInfo getSchedulerEvents(GetSchedulerEventsArgs args) // Get scheduler events (getSchedulerEvents)
List<SchedulerEventInfo> getSchedulerEventsByIds(GetSchedulerEventsByIdsArgs args) // Get Scheduler Events By Ids (getSchedulerEventsByIds)
List<SchedulerEventWithCustomerInfo> getSchedulerEventsByRange(GetSchedulerEventsByRangeArgs args) // Get scheduler events (getSchedulerEventsByRange)
SchedulerEvent saveSchedulerEvent(SaveSchedulerEventArgs args) // Save Scheduler Event (saveSchedulerEvent)
SchedulerEventInfo unassignSchedulerEventFromEdge(UnassignSchedulerEventFromEdgeArgs args) // Unassign scheduler event from edge (unassignSchedulerEventFromEdge)
```


## assignSchedulerEventToEdge

**POST** `/api/edge/{edgeId}/schedulerEvent/{schedulerEventId}`

Assign scheduler event to edge (assignSchedulerEventToEdge)

Creates assignment of an existing scheduler event to an instance of The Edge. Assignment works in async way - first, notification event pushed to edge service queue on platform. Second, remote edge service will receive a copy of assignment scheduler event (Edge will receive this instantly, if it's currently connected, or once it's going to be connected to platform). Third, once scheduler event will be delivered to edge service, it is going to be available for usage on remote edge instance.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'WRITE' permission for the entity (entities).

```java
SchedulerEventInfo assignSchedulerEventToEdge(AssignSchedulerEventToEdgeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
AssignSchedulerEventToEdgeArgs.builder()
        .edgeId(String)
        .schedulerEventId(String)
        .build()
```

### `AssignSchedulerEventToEdgeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `schedulerEventId` | `String` | **yes** | A string value representing the scheduler id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`SchedulerEventInfo`


## deleteSchedulerEvent

**DELETE** `/api/schedulerEvent/{schedulerEventId}`

Delete Scheduler Event (deleteSchedulerEvent)

Deletes the scheduler event. Referencing non-existing Scheduler Event Id will cause 'Not Found' error.   Security check is performed to verify that the user has 'DELETE' permission for the entity (entities).

```java
void deleteSchedulerEvent(DeleteSchedulerEventArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteSchedulerEventArgs.builder()
        .schedulerEventId(String)
        .build()
```

### `DeleteSchedulerEventArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `schedulerEventId` | `String` | **yes** | A string value representing the scheduler id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## enableSchedulerEvent

**PUT** `/api/schedulerEvent/{schedulerEventId}/enabled/{enabledValue}`

Enable or disable Scheduler Event (enableSchedulerEvent)

Updates scheduler event with enabled = true/false. Scheduler Event extends Scheduler Event Info object and adds 'configuration' - a JSON structure of scheduler event configuration. See the 'Model' tab of the Response Class for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
SchedulerEvent enableSchedulerEvent(EnableSchedulerEventArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
EnableSchedulerEventArgs.builder()
        .schedulerEventId(String)
        .enabledValue(Boolean)
        .build()
```

### `EnableSchedulerEventArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `schedulerEventId` | `String` | **yes** | A string value representing the scheduler id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `enabledValue` | `Boolean` | **yes** | Enabled or disabled scheduler | |

### Return type

`SchedulerEvent`


## getAllEdgeSchedulerEvents

**GET** `/api/edge/{edgeId}/allSchedulerEvents`

Get All Edge Scheduler Events (getAllEdgeSchedulerEvents)

Fetch the list of Scheduler Event Info objects based on the provided Edge entity. Scheduler Event extends Scheduler Event Info object and adds 'configuration' - a JSON structure of scheduler event configuration. See the 'Model' tab of the Response Class for more details. Scheduler Events allows you to schedule various types of events with flexible schedule configuration. Scheduler fires configured scheduler events according to their schedule. See the 'Model' tab of the Response Class for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
List<SchedulerEventInfo> getAllEdgeSchedulerEvents(GetAllEdgeSchedulerEventsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAllEdgeSchedulerEventsArgs.builder()
        .edgeId(String)
        .build()
```

### `GetAllEdgeSchedulerEventsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`List<SchedulerEventInfo>`


## getAllSchedulerEvents

**GET** `/api/schedulerEvents/all`

Get all scheduler events (getAllSchedulerEvents)

Requested scheduler events must be owned by tenant or assigned to customer which user is performing the request. Scheduler Event With Customer Info extends Scheduler Event Info object and adds 'customerTitle' - a String value representing the title of the customer which user created a Scheduler Event and 'customerIsPublic' - a boolean parameter that specifies if customer is public. See the 'Model' tab of the Response Class for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.   Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
List<SchedulerEventWithCustomerInfo> getAllSchedulerEvents(GetAllSchedulerEventsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAllSchedulerEventsArgs.builder()
        .build()
```

### `GetAllSchedulerEventsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `type` | `String` | no | A string value representing the scheduler type. For example, 'generateReport' | |

### Return type

`List<SchedulerEventWithCustomerInfo>`


## getEdgeSchedulerEvents

**GET** `/api/edge/{edgeId}/schedulerEvents`

Get Edge Scheduler Events (getEdgeSchedulerEvents)

Returns a page of  Scheduler Events Info objects based on the provided Edge entity. Scheduler Event extends Scheduler Event Info object and adds 'configuration' - a JSON structure of scheduler event configuration. See the 'Model' tab of the Response Class for more details. Scheduler Events allows you to schedule various types of events with flexible schedule configuration. Scheduler fires configured scheduler events according to their schedule. See the 'Model' tab of the Response Class for more details. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
PageDataSchedulerEventInfo getEdgeSchedulerEvents(GetEdgeSchedulerEventsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetEdgeSchedulerEventsArgs.builder()
        .edgeId(String)
        .pageSize(String)
        .page(String)
        .build()
```

### `GetEdgeSchedulerEventsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `String` | **yes** | Maximum amount of entities in a one page | |
| `page` | `String` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'startsWith' filter based on the scheduler event name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataSchedulerEventInfo`


## getScheduledReportEvents

**GET** `/api/scheduledReports`

Get Scheduled Report Events (getScheduledReportEvents)

  Available for users with 'TENANT_ADMIN' authority.   Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
PageDataScheduledReportInfo getScheduledReportEvents(GetScheduledReportEventsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetScheduledReportEventsArgs.builder()
        .pageSize(String)
        .page(String)
        .build()
```

### `GetScheduledReportEventsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `String` | **yes** | Maximum amount of entities in a one page | |
| `page` | `String` | **yes** | Sequence number of page starting from 0 | |
| `reportTemplateId` | `UUID` | no | Report template id | |
| `userId` | `UUID` | no | The user used for report generation. | |
| `includeCustomers` | `Boolean` | no | Include customer or sub-customer entities | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the scheduler event name or customer title. | |
| `sortProperty` | `String` | no | Property of entity to sort by | |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataScheduledReportInfo`


## getSchedulerEventById

**GET** `/api/schedulerEvent/{schedulerEventId}`

Get Scheduler Event (getSchedulerEventById)

Fetch the SchedulerEvent object based on the provided scheduler event Id. Scheduler Event extends Scheduler Event Info object and adds 'configuration' - a JSON structure of scheduler event configuration. See the 'Model' tab of the Response Class for more details. Referencing non-existing Scheduler Event Id will cause 'Not Found' error.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.   Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
SchedulerEvent getSchedulerEventById(GetSchedulerEventByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetSchedulerEventByIdArgs.builder()
        .schedulerEventId(String)
        .build()
```

### `GetSchedulerEventByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `schedulerEventId` | `String` | **yes** | A string value representing the scheduler id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`SchedulerEvent`


## getSchedulerEventInfoById

**GET** `/api/schedulerEvent/info/{schedulerEventId}`

Get Scheduler Event With Customer Info (getSchedulerEventInfoById)

Fetch the SchedulerEventWithCustomerInfo object based on the provided scheduler event Id. Scheduler Event With Customer Info extends Scheduler Event Info object and adds 'customerTitle' - a String value representing the title of the customer which user created a Scheduler Event and 'customerIsPublic' - a boolean parameter that specifies if customer is public. See the 'Model' tab of the Response Class for more details. Referencing non-existing Scheduler Event Id will cause 'Not Found' error.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.   Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
SchedulerEventWithCustomerInfo getSchedulerEventInfoById(GetSchedulerEventInfoByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetSchedulerEventInfoByIdArgs.builder()
        .schedulerEventId(String)
        .build()
```

### `GetSchedulerEventInfoByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `schedulerEventId` | `String` | **yes** | A string value representing the scheduler id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`SchedulerEventWithCustomerInfo`


## getSchedulerEvents

**GET** `/api/schedulerEvents`

Get scheduler events (getSchedulerEvents)

Requested scheduler events must be owned by tenant or assigned to customer which user is performing the request. Scheduler Event With Customer Info extends Scheduler Event Info object and adds 'customerTitle' - a String value representing the title of the customer which user created a Scheduler Event and 'customerIsPublic' - a boolean parameter that specifies if customer is public. See the 'Model' tab of the Response Class for more details.   You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.     Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.   Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
PageDataSchedulerEventWithCustomerInfo getSchedulerEvents(GetSchedulerEventsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetSchedulerEventsArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetSchedulerEventsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | Case-insensitive 'substring' filter based on event's name, type, or customer's name | |
| `sortProperty` | `String` | no | Property of entity to sort by | |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | |
| `type` | `String` | no | A string value representing the scheduler type. For example, 'generateReport' | |
| `edgeId` | `UUID` | no | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`PageDataSchedulerEventWithCustomerInfo`


## getSchedulerEventsByIds

**GET** `/api/schedulerEvents/list`

Get Scheduler Events By Ids (getSchedulerEventsByIds)

Requested scheduler events must be owned by tenant or assigned to customer which user is performing the request. Scheduler Events allows you to schedule various types of events with flexible schedule configuration. Scheduler fires configured scheduler events according to their schedule. See the 'Model' tab of the Response Class for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.   Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
List<SchedulerEventInfo> getSchedulerEventsByIds(GetSchedulerEventsByIdsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetSchedulerEventsByIdsArgs.builder()
        .schedulerEventIds(List<String>)
        .build()
```

### `GetSchedulerEventsByIdsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `schedulerEventIds` | `List<String>` | **yes** | A list of scheduler event ids, separated by comma ',' | |

### Return type

`List<SchedulerEventInfo>`


## getSchedulerEventsByRange

**GET** `/api/schedulerEvents/startTime/{startTime}/endTime/{endTime}`

Get scheduler events (getSchedulerEventsByRange)

Retrieves scheduler events filtering by event run time. Requested scheduler events must be owned by tenant or assigned to customer which user is performing the request. Scheduler Event With Customer Info extends Scheduler Event Info object and adds 'customerTitle' - a String value representing the title of the customer which user created a Scheduler Event and 'customerIsPublic' - a boolean parameter that specifies if customer is public. See the 'Model' tab of the Response Class for more details.   You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.     Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.   Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
List<SchedulerEventWithCustomerInfo> getSchedulerEventsByRange(GetSchedulerEventsByRangeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetSchedulerEventsByRangeArgs.builder()
        .startTime(Long)
        .endTime(Long)
        .build()
```

### `GetSchedulerEventsByRangeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `startTime` | `Long` | **yes** | Start time filter in milliseconds for scheduler event run time | |
| `endTime` | `Long` | **yes** | End time filter in milliseconds for scheduler event run time | |
| `type` | `String` | no | A string value representing the scheduler type. For example, 'generateReport' | |
| `edgeId` | `UUID` | no | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `textSearch` | `String` | no | Case-insensitive 'substring' filter based on event's name, type, or customer's name | |

### Return type

`List<SchedulerEventWithCustomerInfo>`


## saveSchedulerEvent

**POST** `/api/schedulerEvent`

Save Scheduler Event (saveSchedulerEvent)

Creates or Updates scheduler event. Scheduler Event extends Scheduler Event Info object and adds 'configuration' - a JSON structure of scheduler event configuration. See the 'Model' tab of the Response Class for more details. When creating scheduler event, platform generates scheduler event Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created scheduler event id will be present in the response. Specify existing scheduler event id to update the scheduler event. Referencing non-existing scheduler event Id will cause 'Not Found' error. Remove 'id', 'tenantId' and optionally 'customerId' from the request body example (below) to create new Scheduler Event entity.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
SchedulerEvent saveSchedulerEvent(SaveSchedulerEventArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveSchedulerEventArgs.builder()
        .schedulerEvent(SchedulerEvent)
        .build()
```

### `SaveSchedulerEventArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `schedulerEvent` | `SchedulerEvent` | **yes** |  | |

### Return type

`SchedulerEvent`


## unassignSchedulerEventFromEdge

**DELETE** `/api/edge/{edgeId}/schedulerEvent/{schedulerEventId}`

Unassign scheduler event from edge (unassignSchedulerEventFromEdge)

Clears assignment of the scheduler event to the edge. Unassignment works in async way - first, 'unassign' notification event pushed to edge queue on platform. Second, remote edge service will receive an 'unassign' command to remove entity group (Edge will receive this instantly, if it's currently connected, or once it's going to be connected to platform). Third, once 'unassign' command will be delivered to edge service, it's going to remove entity group and entities inside this group locally.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'WRITE' permission for the entity (entities).

```java
SchedulerEventInfo unassignSchedulerEventFromEdge(UnassignSchedulerEventFromEdgeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UnassignSchedulerEventFromEdgeArgs.builder()
        .edgeId(String)
        .schedulerEventId(String)
        .build()
```

### `UnassignSchedulerEventFromEdgeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `schedulerEventId` | `String` | **yes** | A string value representing the scheduler id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`SchedulerEventInfo`


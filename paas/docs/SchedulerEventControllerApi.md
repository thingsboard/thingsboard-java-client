# SchedulerEventControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignSchedulerEventToEdge**](#assignSchedulerEventToEdge) | **POST** /api/edge/{edgeId}/schedulerEvent/{schedulerEventId} | Assign scheduler event to edge (assignSchedulerEventToEdge) |
| [**deleteSchedulerEvent**](#deleteSchedulerEvent) | **DELETE** /api/schedulerEvent/{schedulerEventId} | Delete Scheduler Event (deleteSchedulerEvent) |
| [**enableSchedulerEvent**](#enableSchedulerEvent) | **PUT** /api/schedulerEvent/{schedulerEventId}/enabled/{enabledValue} | Enable or disable Scheduler Event (enableSchedulerEvent) |
| [**getAllEdgeSchedulerEvents**](#getAllEdgeSchedulerEvents) | **GET** /api/edge/{edgeId}/allSchedulerEvents | Get All Edge Scheduler Events (getAllEdgeSchedulerEvents) |
| [**getAllSchedulerEvents**](#getAllSchedulerEvents) | **GET** /api/schedulerEvents/all | Get all scheduler events (getAllSchedulerEvents) |
| [**getEdgeSchedulerEvents**](#getEdgeSchedulerEvents) | **GET** /api/edge/{edgeId}/schedulerEvents | Get Edge Scheduler Events (getEdgeSchedulerEvents) |
| [**getScheduledReportEvents**](#getScheduledReportEvents) | **GET** /api/scheduledReports | Get Scheduled Report Events (getScheduledReportEvents) |
| [**getSchedulerEventById**](#getSchedulerEventById) | **GET** /api/schedulerEvent/{schedulerEventId} | Get Scheduler Event (getSchedulerEventById) |
| [**getSchedulerEventInfoById**](#getSchedulerEventInfoById) | **GET** /api/schedulerEvent/info/{schedulerEventId} | Get Scheduler Event With Customer Info (getSchedulerEventInfoById) |
| [**getSchedulerEvents**](#getSchedulerEvents) | **GET** /api/schedulerEvents | Get scheduler events (getSchedulerEvents) |
| [**getSchedulerEventsByIds**](#getSchedulerEventsByIds) | **GET** /api/schedulerEvents/list | Get Scheduler Events By Ids (getSchedulerEventsByIds) |
| [**getSchedulerEventsByRange**](#getSchedulerEventsByRange) | **GET** /api/schedulerEvents/startTime/{startTime}/endTime/{endTime} | Get scheduler events (getSchedulerEventsByRange) |
| [**saveSchedulerEvent**](#saveSchedulerEvent) | **POST** /api/schedulerEvent | Save Scheduler Event (saveSchedulerEvent) |
| [**unassignSchedulerEventFromEdge**](#unassignSchedulerEventFromEdge) | **DELETE** /api/edge/{edgeId}/schedulerEvent/{schedulerEventId} | Unassign scheduler event from edge (unassignSchedulerEventFromEdge) |



## assignSchedulerEventToEdge

> SchedulerEventInfo assignSchedulerEventToEdge(edgeId, schedulerEventId)

Assign scheduler event to edge (assignSchedulerEventToEdge)

Creates assignment of an existing scheduler event to an instance of The Edge. Assignment works in async way - first, notification event pushed to edge service queue on platform. Second, remote edge service will receive a copy of assignment scheduler event (Edge will receive this instantly, if it's currently connected, or once it's going to be connected to platform). Third, once scheduler event will be delivered to edge service, it is going to be available for usage on remote edge instance.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'WRITE' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **schedulerEventId** | **String** | A string value representing the scheduler id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**SchedulerEventInfo**


## deleteSchedulerEvent

> deleteSchedulerEvent(schedulerEventId)

Delete Scheduler Event (deleteSchedulerEvent)

Deletes the scheduler event. Referencing non-existing Scheduler Event Id will cause 'Not Found' error.   Security check is performed to verify that the user has 'DELETE' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **schedulerEventId** | **String** | A string value representing the scheduler id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## enableSchedulerEvent

> SchedulerEvent enableSchedulerEvent(schedulerEventId, enabledValue)

Enable or disable Scheduler Event (enableSchedulerEvent)

Updates scheduler event with enabled = true/false. Scheduler Event extends Scheduler Event Info object and adds 'configuration' - a JSON structure of scheduler event configuration. See the 'Model' tab of the Response Class for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **schedulerEventId** | **String** | A string value representing the scheduler id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **enabledValue** | **Boolean** | Enabled or disabled scheduler | |

### Return type

**SchedulerEvent**


## getAllEdgeSchedulerEvents

> List<SchedulerEventInfo> getAllEdgeSchedulerEvents(edgeId)

Get All Edge Scheduler Events (getAllEdgeSchedulerEvents)

Fetch the list of Scheduler Event Info objects based on the provided Edge entity. Scheduler Event extends Scheduler Event Info object and adds 'configuration' - a JSON structure of scheduler event configuration. See the 'Model' tab of the Response Class for more details. Scheduler Events allows you to schedule various types of events with flexible schedule configuration. Scheduler fires configured scheduler events according to their schedule. See the 'Model' tab of the Response Class for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**List<SchedulerEventInfo>**


## getAllSchedulerEvents

> List<SchedulerEventWithCustomerInfo> getAllSchedulerEvents(type)

Get all scheduler events (getAllSchedulerEvents)

Requested scheduler events must be owned by tenant or assigned to customer which user is performing the request. Scheduler Event With Customer Info extends Scheduler Event Info object and adds 'customerTitle' - a String value representing the title of the customer which user created a Scheduler Event and 'customerIsPublic' - a boolean parameter that specifies if customer is public. See the 'Model' tab of the Response Class for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.   Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String** | A string value representing the scheduler type. For example, 'generateReport' | [optional] |

### Return type

**List<SchedulerEventWithCustomerInfo>**


## getEdgeSchedulerEvents

> PageDataSchedulerEventInfo getEdgeSchedulerEvents(edgeId, pageSize, page, textSearch, sortProperty, sortOrder)

Get Edge Scheduler Events (getEdgeSchedulerEvents)

Returns a page of  Scheduler Events Info objects based on the provided Edge entity. Scheduler Event extends Scheduler Event Info object and adds 'configuration' - a JSON structure of scheduler event configuration. See the 'Model' tab of the Response Class for more details. Scheduler Events allows you to schedule various types of events with flexible schedule configuration. Scheduler fires configured scheduler events according to their schedule. See the 'Model' tab of the Response Class for more details. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **String** | Maximum amount of entities in a one page | |
| **page** | **String** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'startsWith' filter based on the scheduler event name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataSchedulerEventInfo**


## getScheduledReportEvents

> PageDataScheduledReportInfo getScheduledReportEvents(pageSize, page, reportTemplateId, userId, includeCustomers, textSearch, sortProperty, sortOrder)

Get Scheduled Report Events (getScheduledReportEvents)

  Available for users with 'TENANT_ADMIN' authority.   Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **String** | Maximum amount of entities in a one page | |
| **page** | **String** | Sequence number of page starting from 0 | |
| **reportTemplateId** | **UUID** | Report template id | [optional] |
| **userId** | **UUID** | The user used for report generation. | [optional] |
| **includeCustomers** | **Boolean** | Include customer or sub-customer entities | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the scheduler event name or customer title. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataScheduledReportInfo**


## getSchedulerEventById

> SchedulerEvent getSchedulerEventById(schedulerEventId)

Get Scheduler Event (getSchedulerEventById)

Fetch the SchedulerEvent object based on the provided scheduler event Id. Scheduler Event extends Scheduler Event Info object and adds 'configuration' - a JSON structure of scheduler event configuration. See the 'Model' tab of the Response Class for more details. Referencing non-existing Scheduler Event Id will cause 'Not Found' error.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.   Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **schedulerEventId** | **String** | A string value representing the scheduler id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**SchedulerEvent**


## getSchedulerEventInfoById

> SchedulerEventWithCustomerInfo getSchedulerEventInfoById(schedulerEventId)

Get Scheduler Event With Customer Info (getSchedulerEventInfoById)

Fetch the SchedulerEventWithCustomerInfo object based on the provided scheduler event Id. Scheduler Event With Customer Info extends Scheduler Event Info object and adds 'customerTitle' - a String value representing the title of the customer which user created a Scheduler Event and 'customerIsPublic' - a boolean parameter that specifies if customer is public. See the 'Model' tab of the Response Class for more details. Referencing non-existing Scheduler Event Id will cause 'Not Found' error.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.   Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **schedulerEventId** | **String** | A string value representing the scheduler id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**SchedulerEventWithCustomerInfo**


## getSchedulerEvents

> PageDataSchedulerEventWithCustomerInfo getSchedulerEvents(pageSize, page, textSearch, sortProperty, sortOrder, type, edgeId)

Get scheduler events (getSchedulerEvents)

Requested scheduler events must be owned by tenant or assigned to customer which user is performing the request. Scheduler Event With Customer Info extends Scheduler Event Info object and adds 'customerTitle' - a String value representing the title of the customer which user created a Scheduler Event and 'customerIsPublic' - a boolean parameter that specifies if customer is public. See the 'Model' tab of the Response Class for more details.   You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.     Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.   Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | Case-insensitive 'substring' filter based on event's name, type, or customer's name | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] |
| **type** | **String** | A string value representing the scheduler type. For example, 'generateReport' | [optional] |
| **edgeId** | **UUID** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | [optional] |

### Return type

**PageDataSchedulerEventWithCustomerInfo**


## getSchedulerEventsByIds

> List<SchedulerEventInfo> getSchedulerEventsByIds(schedulerEventIds)

Get Scheduler Events By Ids (getSchedulerEventsByIds)

Requested scheduler events must be owned by tenant or assigned to customer which user is performing the request. Scheduler Events allows you to schedule various types of events with flexible schedule configuration. Scheduler fires configured scheduler events according to their schedule. See the 'Model' tab of the Response Class for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.   Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **schedulerEventIds** | **List<String>** | A list of scheduler event ids, separated by comma ',' | |

### Return type

**List<SchedulerEventInfo>**


## getSchedulerEventsByRange

> List<SchedulerEventWithCustomerInfo> getSchedulerEventsByRange(startTime, endTime, type, edgeId, textSearch)

Get scheduler events (getSchedulerEventsByRange)

Retrieves scheduler events filtering by event run time. Requested scheduler events must be owned by tenant or assigned to customer which user is performing the request. Scheduler Event With Customer Info extends Scheduler Event Info object and adds 'customerTitle' - a String value representing the title of the customer which user created a Scheduler Event and 'customerIsPublic' - a boolean parameter that specifies if customer is public. See the 'Model' tab of the Response Class for more details.   You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.     Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.   Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startTime** | **Long** | Start time filter in milliseconds for scheduler event run time | |
| **endTime** | **Long** | End time filter in milliseconds for scheduler event run time | |
| **type** | **String** | A string value representing the scheduler type. For example, 'generateReport' | [optional] |
| **edgeId** | **UUID** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | [optional] |
| **textSearch** | **String** | Case-insensitive 'substring' filter based on event's name, type, or customer's name | [optional] |

### Return type

**List<SchedulerEventWithCustomerInfo>**


## saveSchedulerEvent

> SchedulerEvent saveSchedulerEvent(schedulerEvent)

Save Scheduler Event (saveSchedulerEvent)

Creates or Updates scheduler event. Scheduler Event extends Scheduler Event Info object and adds 'configuration' - a JSON structure of scheduler event configuration. See the 'Model' tab of the Response Class for more details. When creating scheduler event, platform generates scheduler event Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created scheduler event id will be present in the response. Specify existing scheduler event id to update the scheduler event. Referencing non-existing scheduler event Id will cause 'Not Found' error. Remove 'id', 'tenantId' and optionally 'customerId' from the request body example (below) to create new Scheduler Event entity.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **schedulerEvent** | **SchedulerEvent** |  | |

### Return type

**SchedulerEvent**


## unassignSchedulerEventFromEdge

> SchedulerEventInfo unassignSchedulerEventFromEdge(edgeId, schedulerEventId)

Unassign scheduler event from edge (unassignSchedulerEventFromEdge)

Clears assignment of the scheduler event to the edge. Unassignment works in async way - first, 'unassign' notification event pushed to edge queue on platform. Second, remote edge service will receive an 'unassign' command to remove entity group (Edge will receive this instantly, if it's currently connected, or once it's going to be connected to platform). Third, once 'unassign' command will be delivered to edge service, it's going to remove entity group and entities inside this group locally.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'WRITE' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **schedulerEventId** | **String** | A string value representing the scheduler id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**SchedulerEventInfo**


# QueueStatsControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getQueueStatsById**](#getQueueStatsById) | **GET** /api/queueStats/{queueStatsId} | Get Queue stats entity by id (getQueueStatsById) |
| [**getQueueStatsByIds**](#getQueueStatsByIds) | **GET** /api/queueStats/list | Get QueueStats By Ids (getQueueStatsByIds) |
| [**getTenantQueueStats**](#getTenantQueueStats) | **GET** /api/queueStats | Get Queue Stats entities (getTenantQueueStats) |



## getQueueStatsById

> QueueStats getQueueStatsById(queueStatsId)

Get Queue stats entity by id (getQueueStatsById)

Fetch the Queue stats object based on the provided Queue stats id.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **queueStatsId** | **String** | A string value representing the queue stats id. For example, '687f294c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**QueueStats**


## getQueueStatsByIds

> List<QueueStats> getQueueStatsByIds(queueStatsIds)

Get QueueStats By Ids (getQueueStatsByIds)

Fetch the Queue stats objects based on the provided ids. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **queueStatsIds** | **List<String>** | A list of queue stats ids, separated by comma ',' | |

### Return type

**List<QueueStats>**


## getTenantQueueStats

> PageDataQueueStats getTenantQueueStats(pageSize, page, textSearch, sortProperty, sortOrder)

Get Queue Stats entities (getTenantQueueStats)

Returns a page of queue stats objects that are designed to collect queue statistics for every service. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the queue name or service id. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataQueueStats**


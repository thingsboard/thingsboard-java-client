# QueueStatsControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
QueueStats getQueueStatsById(GetQueueStatsByIdArgs args) // Get Queue stats entity by id (getQueueStatsById)
List<QueueStats> getQueueStatsByIds(GetQueueStatsByIdsArgs args) // Get QueueStats By Ids (getQueueStatsByIds)
PageDataQueueStats getTenantQueueStats(GetTenantQueueStatsArgs args) // Get Queue Stats entities (getTenantQueueStats)
```


## getQueueStatsById

**GET** `/api/queueStats/{queueStatsId}`

Get Queue stats entity by id (getQueueStatsById)

Fetch the Queue stats object based on the provided Queue stats id.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
QueueStats getQueueStatsById(GetQueueStatsByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetQueueStatsByIdArgs.builder()
        .queueStatsId(String)
        .build()
```

### `GetQueueStatsByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `queueStatsId` | `String` | **yes** | A string value representing the queue stats id. For example, '687f294c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`QueueStats`


## getQueueStatsByIds

**GET** `/api/queueStats/list`

Get QueueStats By Ids (getQueueStatsByIds)

Fetch the Queue stats objects based on the provided ids. 

```java
List<QueueStats> getQueueStatsByIds(GetQueueStatsByIdsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetQueueStatsByIdsArgs.builder()
        .queueStatsIds(List<String>)
        .build()
```

### `GetQueueStatsByIdsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `queueStatsIds` | `List<String>` | **yes** | A list of queue stats ids, separated by comma ',' | |

### Return type

`List<QueueStats>`


## getTenantQueueStats

**GET** `/api/queueStats`

Get Queue Stats entities (getTenantQueueStats)

Returns a page of queue stats objects that are designed to collect queue statistics for every service. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
PageDataQueueStats getTenantQueueStats(GetTenantQueueStatsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetTenantQueueStatsArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetTenantQueueStatsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the queue name or service id. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataQueueStats`


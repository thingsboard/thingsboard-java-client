# EdgeEventControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
PageDataEdgeEvent getEdgeEvents(GetEdgeEventsArgs args) // Get Edge Events (getEdgeEvents)
```


## getEdgeEvents

**GET** `/api/edge/{edgeId}/events`

Get Edge Events (getEdgeEvents)

Returns a page of edge events for the requested edge. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. 

```java
PageDataEdgeEvent getEdgeEvents(GetEdgeEventsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetEdgeEventsArgs.builder()
        .edgeId(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetEdgeEventsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the edge event type name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `type`, `label`, `customerTitle` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |
| `startTime` | `Long` | no | Timestamp. Edge events with creation time before it won't be queried | |
| `endTime` | `Long` | no | Timestamp. Edge events with creation time after it won't be queried | |

### Return type

`PageDataEdgeEvent`


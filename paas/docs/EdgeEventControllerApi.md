# EdgeEventControllerApi

`ThingsboardClient` methods:

```
PageDataEdgeEvent getEdgeEvents(@Nonnull String edgeId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder, @Nullable Long startTime, @Nullable Long endTime) // Get Edge Events (getEdgeEvents)
```


## getEdgeEvents

```
PageDataEdgeEvent getEdgeEvents(@Nonnull String edgeId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder, @Nullable Long startTime, @Nullable Long endTime)
```

**GET** `/api/edge/{edgeId}/events`

Get Edge Events (getEdgeEvents)

Returns a page of edge events for the requested edge. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the edge event type name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type, label, customerTitle] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **startTime** | **Long** | Timestamp. Edge events with creation time before it won't be queried | [optional] |
| **endTime** | **Long** | Timestamp. Edge events with creation time after it won't be queried | [optional] |

### Return type

**PageDataEdgeEvent**


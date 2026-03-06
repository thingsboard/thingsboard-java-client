# JobControllerApi

`ThingsboardClient` methods:

```
void cancelJob(@Nonnull UUID id) // cancelJob
void deleteJob(@Nonnull UUID id) // deleteJob
Job getJobById(@Nonnull UUID id) // getJobById
PageDataJob getJobs(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder, @Nullable List<JobType> types, @Nullable List<JobStatus> statuses, @Nullable List<UUID> entities, @Nullable Long startTime, @Nullable Long endTime) // getJobs
void reprocessJob(@Nonnull UUID id) // reprocessJob
```


## cancelJob

```
void cancelJob(@Nonnull UUID id)
```

**POST** `/api/job/{id}/cancel`

cancelJob


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |

### Return type

null (empty response body)


## deleteJob

```
void deleteJob(@Nonnull UUID id)
```

**DELETE** `/api/job/{id}`

deleteJob


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |

### Return type

null (empty response body)


## getJobById

```
Job getJobById(@Nonnull UUID id)
```

**GET** `/api/job/{id}`

getJobById


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |

### Return type

**Job**


## getJobs

```
PageDataJob getJobs(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder, @Nullable List<JobType> types, @Nullable List<JobStatus> statuses, @Nullable List<UUID> entities, @Nullable Long startTime, @Nullable Long endTime)
```

**GET** `/api/jobs`

getJobs


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | Case-insensitive 'substring' filter based on job's description | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] |
| **types** | **List<JobType>** |  | [optional] |
| **statuses** | **List<JobStatus>** |  | [optional] |
| **entities** | **List<UUID>** |  | [optional] |
| **startTime** | **Long** |  | [optional] |
| **endTime** | **Long** |  | [optional] |

### Return type

**PageDataJob**


## reprocessJob

```
void reprocessJob(@Nonnull UUID id)
```

**POST** `/api/job/{id}/reprocess`

reprocessJob


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |

### Return type

null (empty response body)


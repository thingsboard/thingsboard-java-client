# JobControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void cancelJob(CancelJobArgs args) // cancelJob
void deleteJob(DeleteJobArgs args) // deleteJob
Job getJobById(GetJobByIdArgs args) // getJobById
PageDataJob getJobs(GetJobsArgs args) // getJobs
void reprocessJob(ReprocessJobArgs args) // reprocessJob
```


## cancelJob

**POST** `/api/job/{id}/cancel`

cancelJob

```java
void cancelJob(CancelJobArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
CancelJobArgs.builder()
        .id(UUID)
        .build()
```

### `CancelJobArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `UUID` | **yes** |  | |

### Return type

null (empty response body)


## deleteJob

**DELETE** `/api/job/{id}`

deleteJob

```java
void deleteJob(DeleteJobArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteJobArgs.builder()
        .id(UUID)
        .build()
```

### `DeleteJobArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `UUID` | **yes** |  | |

### Return type

null (empty response body)


## getJobById

**GET** `/api/job/{id}`

getJobById

```java
Job getJobById(GetJobByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetJobByIdArgs.builder()
        .id(UUID)
        .build()
```

### `GetJobByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `UUID` | **yes** |  | |

### Return type

`Job`


## getJobs

**GET** `/api/jobs`

getJobs

```java
PageDataJob getJobs(GetJobsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetJobsArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetJobsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | Case-insensitive 'substring' filter based on job's description | |
| `sortProperty` | `String` | no | Property of entity to sort by | |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | |
| `types` | `List<JobType>` | no |  | |
| `statuses` | `List<JobStatus>` | no |  | |
| `entities` | `List<UUID>` | no |  | |
| `startTime` | `Long` | no |  | |
| `endTime` | `Long` | no |  | |

### Return type

`PageDataJob`


## reprocessJob

**POST** `/api/job/{id}/reprocess`

reprocessJob

```java
void reprocessJob(ReprocessJobArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ReprocessJobArgs.builder()
        .id(UUID)
        .build()
```

### `ReprocessJobArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `UUID` | **yes** |  | |

### Return type

null (empty response body)


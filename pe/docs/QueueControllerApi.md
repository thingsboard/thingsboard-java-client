# QueueControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void deleteQueue(DeleteQueueArgs args) // Delete Queue (deleteQueue)
Queue getQueueById(GetQueueByIdArgs args) // Get Queue (getQueueById)
Queue getQueueByName(GetQueueByNameArgs args) // Get Queue (getQueueByName)
PageDataQueue getTenantQueuesByServiceType(GetTenantQueuesByServiceTypeArgs args) // Get Queues (getTenantQueuesByServiceType)
Queue saveQueue(SaveQueueArgs args) // Create Or Update Queue (saveQueue)
```


## deleteQueue

**DELETE** `/api/queues/{queueId}`

Delete Queue (deleteQueue)

Deletes the Queue.   Available for users with 'SYS_ADMIN' authority.

```java
void deleteQueue(DeleteQueueArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteQueueArgs.builder()
        .queueId(String)
        .build()
```

### `DeleteQueueArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `queueId` | `String` | **yes** | A string value representing the queue id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## getQueueById

**GET** `/api/queues/{queueId}`

Get Queue (getQueueById)

Fetch the Queue object based on the provided Queue Id.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
Queue getQueueById(GetQueueByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetQueueByIdArgs.builder()
        .queueId(String)
        .build()
```

### `GetQueueByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `queueId` | `String` | **yes** | A string value representing the queue id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Queue`


## getQueueByName

**GET** `/api/queues/name/{queueName}`

Get Queue (getQueueByName)

Fetch the Queue object based on the provided Queue name.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
Queue getQueueByName(GetQueueByNameArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetQueueByNameArgs.builder()
        .queueName(String)
        .build()
```

### `GetQueueByNameArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `queueName` | `String` | **yes** | A string value representing the queue id. For example, 'Main' | |

### Return type

`Queue`


## getTenantQueuesByServiceType

**GET** `/api/queues`

Get Queues (getTenantQueuesByServiceType)

Returns a page of queues registered in the platform. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
PageDataQueue getTenantQueuesByServiceType(GetTenantQueuesByServiceTypeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetTenantQueuesByServiceTypeArgs.builder()
        .serviceType(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetTenantQueuesByServiceTypeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `serviceType` | `String` | **yes** | Service type (implemented only for the TB-RULE-ENGINE) | enum: `TB-RULE-ENGINE`, `TB-CORE`, `TB-TRANSPORT`, `JS-EXECUTOR` |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the queue name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `topic` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataQueue`


## saveQueue

**POST** `/api/queues`

Create Or Update Queue (saveQueue)

Create or update the Queue. When creating queue, platform generates Queue Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). Specify existing Queue id to update the queue. Referencing non-existing Queue Id will cause 'Not Found' error.  Queue name is unique in the scope of sysadmin. Remove 'id', 'tenantId' from the request body example (below) to create new Queue entity.   Available for users with 'SYS_ADMIN' authority.

```java
Queue saveQueue(SaveQueueArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveQueueArgs.builder()
        .serviceType(String)
        .queue(Queue)
        .build()
```

### `SaveQueueArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `serviceType` | `String` | **yes** | Service type (implemented only for the TB-RULE-ENGINE) | enum: `TB-RULE-ENGINE`, `TB-CORE`, `TB-TRANSPORT`, `JS-EXECUTOR` |
| `queue` | `Queue` | **yes** |  | |

### Return type

`Queue`


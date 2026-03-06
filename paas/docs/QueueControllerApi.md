# QueueControllerApi

`ThingsboardClient` methods:

```
void deleteQueue(@Nonnull String queueId) // Delete Queue (deleteQueue)
Queue getQueueById(@Nonnull String queueId) // Get Queue (getQueueById)
Queue getQueueByName(@Nonnull String queueName) // Get Queue (getQueueByName)
PageDataQueue getTenantQueuesByServiceType(@Nonnull String serviceType, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get Queues (getTenantQueuesByServiceType)
Queue saveQueue(@Nonnull String serviceType, @Nonnull Queue queue) // Create Or Update Queue (saveQueue)
```


## deleteQueue

```
void deleteQueue(@Nonnull String queueId)
```

**DELETE** `/api/queues/{queueId}`

Delete Queue (deleteQueue)

Deletes the Queue.   Available for users with 'SYS_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **queueId** | **String** | A string value representing the queue id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## getQueueById

```
Queue getQueueById(@Nonnull String queueId)
```

**GET** `/api/queues/{queueId}`

Get Queue (getQueueById)

Fetch the Queue object based on the provided Queue Id.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **queueId** | **String** | A string value representing the queue id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**Queue**


## getQueueByName

```
Queue getQueueByName(@Nonnull String queueName)
```

**GET** `/api/queues/name/{queueName}`

Get Queue (getQueueByName)

Fetch the Queue object based on the provided Queue name.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **queueName** | **String** | A string value representing the queue id. For example, 'Main' | |

### Return type

**Queue**


## getTenantQueuesByServiceType

```
PageDataQueue getTenantQueuesByServiceType(@Nonnull String serviceType, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/queues`

Get Queues (getTenantQueuesByServiceType)

Returns a page of queues registered in the platform. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceType** | **String** | Service type (implemented only for the TB-RULE-ENGINE) | [enum: TB-RULE-ENGINE, TB-CORE, TB-TRANSPORT, JS-EXECUTOR] |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the queue name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, topic] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataQueue**


## saveQueue

```
Queue saveQueue(@Nonnull String serviceType, @Nonnull Queue queue)
```

**POST** `/api/queues`

Create Or Update Queue (saveQueue)

Create or update the Queue. When creating queue, platform generates Queue Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). Specify existing Queue id to update the queue. Referencing non-existing Queue Id will cause 'Not Found' error.  Queue name is unique in the scope of sysadmin. Remove 'id', 'tenantId' from the request body example (below) to create new Queue entity.   Available for users with 'SYS_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceType** | **String** | Service type (implemented only for the TB-RULE-ENGINE) | [enum: TB-RULE-ENGINE, TB-CORE, TB-TRANSPORT, JS-EXECUTOR] |
| **queue** | **Queue** |  | |

### Return type

**Queue**


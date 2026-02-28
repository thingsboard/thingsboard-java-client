# QueueControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteQueue**](#deleteQueue) | **DELETE** /api/queues/{queueId} | Delete Queue (deleteQueue) |
| [**getQueueById**](#getQueueById) | **GET** /api/queues/{queueId} | Get Queue (getQueueById) |
| [**getQueueByName**](#getQueueByName) | **GET** /api/queues/name/{queueName} | Get Queue (getQueueByName) |
| [**getTenantQueuesByServiceType**](#getTenantQueuesByServiceType) | **GET** /api/queues | Get Queues (getTenantQueuesByServiceType) |
| [**saveQueue**](#saveQueue) | **POST** /api/queues | Create Or Update Queue (saveQueue) |



## deleteQueue

> deleteQueue(queueId)

Delete Queue (deleteQueue)

Deletes the Queue.   Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **queueId** | **String** | A string value representing the queue id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## getQueueById

> Queue getQueueById(queueId)

Get Queue (getQueueById)

Fetch the Queue object based on the provided Queue Id.   Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **queueId** | **String** | A string value representing the queue id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## getQueueByName

> Queue getQueueByName(queueName)

Get Queue (getQueueByName)

Fetch the Queue object based on the provided Queue name.   Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **queueName** | **String** | A string value representing the queue id. For example, &#39;Main&#39; | |


## getTenantQueuesByServiceType

> PageDataQueue getTenantQueuesByServiceType(serviceType, pageSize, page, textSearch, sortProperty, sortOrder)

Get Queues (getTenantQueuesByServiceType)

Returns a page of queues registered in the platform. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceType** | **String** | Service type (implemented only for the TB-RULE-ENGINE) | [enum: TB-RULE-ENGINE, TB-CORE, TB-TRANSPORT, JS-EXECUTOR] |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive &#39;substring&#39; filter based on the queue name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, topic] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |


## saveQueue

> Queue saveQueue(serviceType, queue)

Create Or Update Queue (saveQueue)

Create or update the Queue. When creating queue, platform generates Queue Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). Specify existing Queue id to update the queue. Referencing non-existing Queue Id will cause &#39;Not Found&#39; error.  Queue name is unique in the scope of sysadmin. Remove &#39;id&#39;, &#39;tenantId&#39; from the request body example (below) to create new Queue entity.   Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceType** | **String** | Service type (implemented only for the TB-RULE-ENGINE) | [enum: TB-RULE-ENGINE, TB-CORE, TB-TRANSPORT, JS-EXECUTOR] |
| **queue** | **Queue** |  | |


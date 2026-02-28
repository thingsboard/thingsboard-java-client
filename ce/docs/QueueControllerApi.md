# QueueControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteQueue**](QueueControllerApi.md#deleteQueue) | **DELETE** /api/queues/{queueId} | Delete Queue (deleteQueue) |
| [**getQueueById**](QueueControllerApi.md#getQueueById) | **GET** /api/queues/{queueId} | Get Queue (getQueueById) |
| [**getQueueByName**](QueueControllerApi.md#getQueueByName) | **GET** /api/queues/name/{queueName} | Get Queue (getQueueByName) |
| [**getTenantQueuesByServiceType**](QueueControllerApi.md#getTenantQueuesByServiceType) | **GET** /api/queues | Get Queues (getTenantQueuesByServiceType) |
| [**saveQueue**](QueueControllerApi.md#saveQueue) | **POST** /api/queues | Create Or Update Queue (saveQueue) |



## deleteQueue

> deleteQueue(queueId)

Delete Queue (deleteQueue)

Deletes the Queue.   Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **queueId** | **String**| A string value representing the queue id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

null (empty response body)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getQueueById

> Queue getQueueById(queueId)

Get Queue (getQueueById)

Fetch the Queue object based on the provided Queue Id.   Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **queueId** | **String**| A string value representing the queue id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**Queue**](Queue.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getQueueByName

> Queue getQueueByName(queueName)

Get Queue (getQueueByName)

Fetch the Queue object based on the provided Queue name.   Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **queueName** | **String**| A string value representing the queue id. For example, &#39;Main&#39; | |

### Return type

[**Queue**](Queue.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getTenantQueuesByServiceType

> PageDataQueue getTenantQueuesByServiceType(serviceType, pageSize, page, textSearch, sortProperty, sortOrder)

Get Queues (getTenantQueuesByServiceType)

Returns a page of queues registered in the platform. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceType** | **String**| Service type (implemented only for the TB-RULE-ENGINE) | [enum: TB-RULE-ENGINE, TB-CORE, TB-TRANSPORT, JS-EXECUTOR] |
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the queue name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, name, topic] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataQueue**](PageDataQueue.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## saveQueue

> Queue saveQueue(serviceType, queue)

Create Or Update Queue (saveQueue)

Create or update the Queue. When creating queue, platform generates Queue Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). Specify existing Queue id to update the queue. Referencing non-existing Queue Id will cause &#39;Not Found&#39; error.  Queue name is unique in the scope of sysadmin. Remove &#39;id&#39;, &#39;tenantId&#39; from the request body example (below) to create new Queue entity.   Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceType** | **String**| Service type (implemented only for the TB-RULE-ENGINE) | [enum: TB-RULE-ENGINE, TB-CORE, TB-TRANSPORT, JS-EXECUTOR] |
| **queue** | [**Queue**](Queue.md)|  | |

### Return type

[**Queue**](Queue.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


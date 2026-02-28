# JobControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelJob**](JobControllerApi.md#cancelJob) | **POST** /api/job/{id}/cancel | Cancel job (cancelJob) |
| [**deleteJob**](JobControllerApi.md#deleteJob) | **DELETE** /api/job/{id} | deleteJob |
| [**getJobById**](JobControllerApi.md#getJobById) | **GET** /api/job/{id} | Get job by id (getJobById) |
| [**getJobs**](JobControllerApi.md#getJobs) | **GET** /api/jobs | Get jobs (getJobs) |
| [**reprocessJob**](JobControllerApi.md#reprocessJob) | **POST** /api/job/{id}/reprocess | Reprocess job (reprocessJob) |



## cancelJob

> cancelJob(id)

Cancel job (cancelJob)

Cancels the job. The status of the job must be QUEUED, PENDING or RUNNING.  For a running job, all the tasks not yet processed will be discarded.  See the example of a cancelled job result in getJobById method description.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

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


## deleteJob

> deleteJob(id)

deleteJob

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

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


## getJobById

> Job getJobById(id)

Get job by id (getJobById)

Fetches job info by id.  Example of a RUNNING CF_REPROCESSING job response: &#x60;&#x60;&#x60;json {   \&quot;id\&quot;: {     \&quot;entityType\&quot;: \&quot;JOB\&quot;,     \&quot;id\&quot;: \&quot;475e94e0-2f2d-11f0-8240-91e99922a704\&quot;   },   \&quot;createdTime\&quot;: 1747053196590,   \&quot;tenantId\&quot;: {     \&quot;entityType\&quot;: \&quot;TENANT\&quot;,     \&quot;id\&quot;: \&quot;46859a00-2f2d-11f0-8240-91e99922a704\&quot;   },   \&quot;type\&quot;: \&quot;CF_REPROCESSING\&quot;,   \&quot;key\&quot;: \&quot;474e4130-2f2d-11f0-8240-91e99922a704\&quot;,   \&quot;entityId\&quot;: {     \&quot;entityType\&quot;: \&quot;DEVICE_PROFILE\&quot;,     \&quot;id\&quot;: \&quot;9fd41f20-31a1-11f0-933e-27998d6db02e\&quot;    },   \&quot;status\&quot;: \&quot;RUNNING\&quot;,   \&quot;configuration\&quot;: {     \&quot;type\&quot;: \&quot;CF_REPROCESSING\&quot;,     \&quot;calculatedFieldId\&quot;: {       \&quot;entityType\&quot;: \&quot;CALCULATED_FIELD\&quot;,       \&quot;id\&quot;: \&quot;474e4130-2f2d-11f0-8240-91e99922a704\&quot;     },     \&quot;startTs\&quot;: 1747051995760,     \&quot;endTs\&quot;: 1747052895760,     \&quot;tasksKey\&quot;: \&quot;c3cdbd42-799e-4d3a-9aad-9310f767aa36\&quot;,     \&quot;toReprocess\&quot;: null   },   \&quot;result\&quot;: {     \&quot;jobType\&quot;: \&quot;CF_REPROCESSING\&quot;,     \&quot;successfulCount\&quot;: 1,     \&quot;failedCount\&quot;: 0,     \&quot;discardedCount\&quot;: 0,     \&quot;totalCount\&quot;: 2,     \&quot;results\&quot;: [],     \&quot;generalError\&quot;: null,     \&quot;startTs\&quot;: 1747323069445,     \&quot;finishTs\&quot;: 1747323070585,     \&quot;cancellationTs\&quot;: 0   } }  &#x60;&#x60;&#x60;  Example of a CF_REPROCESSING job with failures: &#x60;&#x60;&#x60;json {   ...,   \&quot;status\&quot;: \&quot;FAILED\&quot;,   ...,   \&quot;result\&quot;: {     \&quot;jobType\&quot;: \&quot;CF_REPROCESSING\&quot;,     \&quot;successfulCount\&quot;: 0,     \&quot;failedCount\&quot;: 2,     \&quot;discardedCount\&quot;: 0,     \&quot;totalCount\&quot;: 2,     \&quot;results\&quot;: [       {         \&quot;jobType\&quot;: \&quot;CF_REPROCESSING\&quot;,         \&quot;key\&quot;: \&quot;c3cdbd42-799e-4d3a-9aad-9310f767aa36\&quot;,         \&quot;success\&quot;: false,         \&quot;discarded\&quot;: false,         \&quot;failure\&quot;: {           \&quot;error\&quot;: \&quot;Failed to fetch temperature: Failed to fetch timeseries data\&quot;,           \&quot;entityInfo\&quot;: {             \&quot;id\&quot;: {               \&quot;entityType\&quot;: \&quot;DEVICE\&quot;,               \&quot;id\&quot;: \&quot;9fd41f20-31a1-11f0-933e-27998d6db02e\&quot;             },             \&quot;name\&quot;: \&quot;Test device 1\&quot;           }         }       },       {         \&quot;jobType\&quot;: \&quot;CF_REPROCESSING\&quot;,         \&quot;key\&quot;: \&quot;c3cdbd42-799e-4d3a-9aad-9310f767aa36\&quot;,         \&quot;success\&quot;: false,         \&quot;discarded\&quot;: false,         \&quot;failure\&quot;: {           \&quot;error\&quot;: \&quot;Failed to fetch temperature: Failed to fetch timeseries data\&quot;,           \&quot;entityInfo\&quot;: {             \&quot;id\&quot;: {               \&quot;entityType\&quot;: \&quot;DEVICE\&quot;,               \&quot;id\&quot;: \&quot;9ffc4090-31a1-11f0-933e-27998d6db02e\&quot;             },             \&quot;name\&quot;: \&quot;Test device 2\&quot;           }         }       }     ],     \&quot;generalError\&quot;: null,     \&quot;startTs\&quot;: 1747323069445,     \&quot;finishTs\&quot;: 1747323070585,     \&quot;cancellationTs\&quot;: 0   } }  &#x60;&#x60;&#x60;  Example of a FAILED job result with general error: &#x60;&#x60;&#x60;json {   ...,   \&quot;status\&quot;: \&quot;FAILED\&quot;,   ...,   \&quot;result\&quot;: {     \&quot;jobType\&quot;: \&quot;CF_REPROCESSING\&quot;,     \&quot;successfulCount\&quot;: 1,     \&quot;failedCount\&quot;: 0,     \&quot;discardedCount\&quot;: 0,     \&quot;totalCount\&quot;: null,     \&quot;results\&quot;: [],     \&quot;generalError\&quot;: \&quot;Timeout to find devices by profile\&quot;,     \&quot;cancellationTs\&quot;: 0   } }  &#x60;&#x60;&#x60;  Example of a CANCELLED job result: &#x60;&#x60;&#x60;json {   ...,   \&quot;status\&quot;: \&quot;CANCELLED\&quot;,   ...,   \&quot;result\&quot;: {     \&quot;jobType\&quot;: \&quot;CF_REPROCESSING\&quot;,     \&quot;successfulCount\&quot;: 15,     \&quot;failedCount\&quot;: 0,     \&quot;discardedCount\&quot;: 85,     \&quot;totalCount\&quot;: 100,     \&quot;results\&quot;: [],     \&quot;generalError\&quot;: null,     \&quot;cancellationTs\&quot;: 1747065908414   } }  &#x60;&#x60;&#x60;  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Job**](Job.md)

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


## getJobs

> PageDataJob getJobs(pageSize, page, textSearch, sortProperty, sortOrder, types, statuses, entities, startTime, endTime)

Get jobs (getJobs)

Returns the page of jobs.  You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| Case-insensitive &#39;substring&#39; filter based on job&#39;s description | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] |
| **types** | [**List&lt;String&gt;**](String.md)| Comma-separated list of job types to include. If empty - all job types are included. | [optional] |
| **statuses** | [**List&lt;String&gt;**](String.md)| Comma-separated list of job statuses to include. If empty - all job statuses are included. | [optional] |
| **entities** | [**List&lt;String&gt;**](String.md)| Comma-separated list of entity ids. If empty - jobs for all entities are included. | [optional] |
| **startTime** | **Long**| To only include jobs created after this timestamp. | [optional] |
| **endTime** | **Long**| To only include jobs created before this timestamp. | [optional] |

### Return type

[**PageDataJob**](PageDataJob.md)

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


## reprocessJob

> reprocessJob(id)

Reprocess job (reprocessJob)

Reprocesses the job. Failures are located at job.result.results list. Platform iterates over this list and submits new tasks for them. Doesn&#39;t create new job entity but updates the existing one. Successfully reprocessed job will look the same as completed one.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

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


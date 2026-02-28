# JobControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelJob**](#cancelJob) | **POST** /api/job/{id}/cancel | cancelJob |
| [**deleteJob**](#deleteJob) | **DELETE** /api/job/{id} | deleteJob |
| [**getJobById**](#getJobById) | **GET** /api/job/{id} | getJobById |
| [**getJobs**](#getJobs) | **GET** /api/jobs | getJobs |
| [**reprocessJob**](#reprocessJob) | **POST** /api/job/{id}/reprocess | reprocessJob |



## cancelJob

> cancelJob(id)

cancelJob

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |


## deleteJob

> deleteJob(id)

deleteJob

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |


## getJobById

> Job getJobById(id)

getJobById

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |


## getJobs

> PageDataJob getJobs(pageSize, page, textSearch, sortProperty, sortOrder, types, statuses, entities, startTime, endTime)

getJobs

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | Case-insensitive &#39;substring&#39; filter based on job&#39;s description | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] |
| **types** | **List&lt;JobType&gt;** |  | [optional] |
| **statuses** | **List&lt;JobStatus&gt;** |  | [optional] |
| **entities** | **List&lt;UUID&gt;** |  | [optional] |
| **startTime** | **Long** |  | [optional] |
| **endTime** | **Long** |  | [optional] |


## reprocessJob

> reprocessJob(id)

reprocessJob

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |


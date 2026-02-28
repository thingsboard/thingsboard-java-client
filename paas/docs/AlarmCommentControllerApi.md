# AlarmCommentControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteAlarmComment**](AlarmCommentControllerApi.md#deleteAlarmComment) | **DELETE** /api/alarm/{alarmId}/comment/{commentId} | Delete Alarm comment (deleteAlarmComment) |
| [**getAlarmComments**](AlarmCommentControllerApi.md#getAlarmComments) | **GET** /api/alarm/{alarmId}/comment | Get Alarm comments (getAlarmComments) |
| [**saveAlarmComment**](AlarmCommentControllerApi.md#saveAlarmComment) | **POST** /api/alarm/{alarmId}/comment | Create or update Alarm Comment  |



## deleteAlarmComment

> deleteAlarmComment(alarmId, commentId)

Delete Alarm comment (deleteAlarmComment)

Deletes the Alarm comment. Referencing non-existing Alarm comment Id will cause an error.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alarmId** | **String**| A string value representing the alarm id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **commentId** | **String**| A string value representing the alarm comment id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

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


## getAlarmComments

> PageDataAlarmCommentInfo getAlarmComments(alarmId, pageSize, page, sortProperty, sortOrder)

Get Alarm comments (getAlarmComments)

Returns a page of alarm comments for specified alarm. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alarmId** | **String**| A string value representing the alarm id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, id] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataAlarmCommentInfo**](PageDataAlarmCommentInfo.md)

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


## saveAlarmComment

> AlarmComment saveAlarmComment(alarmId, alarmComment)

Create or update Alarm Comment 

Creates or Updates the Alarm Comment. When creating comment, platform generates Alarm Comment Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Alarm Comment id will be present in the response. Specify existing Alarm Comment id to update the alarm. Referencing non-existing Alarm Comment Id will cause &#39;Not Found&#39; error.    To create new Alarm comment entity it is enough to specify &#39;comment&#39; json element with &#39;text&#39; node, for example: {\&quot;comment\&quot;: { \&quot;text\&quot;: \&quot;my comment\&quot;}}.    If comment type is not specified the default value &#39;OTHER&#39; will be saved. If &#39;alarmId&#39; or &#39;userId&#39; specified in body it will be ignored.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alarmId** | **String**| A string value representing the alarm id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **alarmComment** | [**AlarmComment**](AlarmComment.md)| A JSON value representing the comment. | |

### Return type

[**AlarmComment**](AlarmComment.md)

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


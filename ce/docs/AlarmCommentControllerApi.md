# AlarmCommentControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteAlarmComment**](#deleteAlarmComment) | **DELETE** /api/alarm/{alarmId}/comment/{commentId} | Delete Alarm comment (deleteAlarmComment) |
| [**getAlarmComments**](#getAlarmComments) | **GET** /api/alarm/{alarmId}/comment | Get Alarm comments (getAlarmComments) |
| [**saveAlarmComment**](#saveAlarmComment) | **POST** /api/alarm/{alarmId}/comment | Create or update Alarm Comment  |



## deleteAlarmComment

> deleteAlarmComment(alarmId, commentId)

Delete Alarm comment (deleteAlarmComment)

Deletes the Alarm comment. Referencing non-existing Alarm comment Id will cause an error.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alarmId** | **String** | A string value representing the alarm id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **commentId** | **String** | A string value representing the alarm comment id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## getAlarmComments

> PageDataAlarmCommentInfo getAlarmComments(alarmId, pageSize, page, sortProperty, sortOrder)

Get Alarm comments (getAlarmComments)

Returns a page of alarm comments for specified alarm. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alarmId** | **String** | A string value representing the alarm id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, id] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataAlarmCommentInfo**


## saveAlarmComment

> AlarmComment saveAlarmComment(alarmId, alarmComment)

Create or update Alarm Comment 

Creates or Updates the Alarm Comment. When creating comment, platform generates Alarm Comment Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Alarm Comment id will be present in the response. Specify existing Alarm Comment id to update the alarm. Referencing non-existing Alarm Comment Id will cause 'Not Found' error.    To create new Alarm comment entity it is enough to specify 'comment' json element with 'text' node, for example: {\"comment\": { \"text\": \"my comment\"}}.    If comment type is not specified the default value 'OTHER' will be saved. If 'alarmId' or 'userId' specified in body it will be ignored.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alarmId** | **String** | A string value representing the alarm id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **alarmComment** | **AlarmComment** | A JSON value representing the comment. | |

### Return type

**AlarmComment**


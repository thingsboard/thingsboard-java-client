# AlarmCommentControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void deleteAlarmComment(DeleteAlarmCommentArgs args) // Delete Alarm comment (deleteAlarmComment)
PageDataAlarmCommentInfo getAlarmComments(GetAlarmCommentsArgs args) // Get Alarm comments (getAlarmComments)
AlarmComment saveAlarmComment(SaveAlarmCommentArgs args) // Create or update Alarm Comment 
```


## deleteAlarmComment

**DELETE** `/api/alarm/{alarmId}/comment/{commentId}`

Delete Alarm comment (deleteAlarmComment)

Deletes the Alarm comment. Referencing non-existing Alarm comment Id will cause an error.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
void deleteAlarmComment(DeleteAlarmCommentArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteAlarmCommentArgs.builder()
        .alarmId(String)
        .commentId(String)
        .build()
```

### `DeleteAlarmCommentArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `alarmId` | `String` | **yes** | A string value representing the alarm id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `commentId` | `String` | **yes** | A string value representing the alarm comment id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## getAlarmComments

**GET** `/api/alarm/{alarmId}/comment`

Get Alarm comments (getAlarmComments)

Returns a page of alarm comments for specified alarm. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
PageDataAlarmCommentInfo getAlarmComments(GetAlarmCommentsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAlarmCommentsArgs.builder()
        .alarmId(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetAlarmCommentsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `alarmId` | `String` | **yes** | A string value representing the alarm id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `id` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataAlarmCommentInfo`


## saveAlarmComment

**POST** `/api/alarm/{alarmId}/comment`

Create or update Alarm Comment 

Creates or Updates the Alarm Comment. When creating comment, platform generates Alarm Comment Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Alarm Comment id will be present in the response. Specify existing Alarm Comment id to update the alarm. Referencing non-existing Alarm Comment Id will cause 'Not Found' error.    To create new Alarm comment entity it is enough to specify 'comment' json element with 'text' node, for example: {\"comment\": { \"text\": \"my comment\"}}.    If comment type is not specified the default value 'OTHER' will be saved. If 'alarmId' or 'userId' specified in body it will be ignored.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
AlarmComment saveAlarmComment(SaveAlarmCommentArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveAlarmCommentArgs.builder()
        .alarmId(String)
        .alarmComment(AlarmComment)
        .build()
```

### `SaveAlarmCommentArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `alarmId` | `String` | **yes** | A string value representing the alarm id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `alarmComment` | `AlarmComment` | **yes** | A JSON value representing the comment. | |

### Return type

`AlarmComment`


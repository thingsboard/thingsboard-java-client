# NotificationTemplateControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void deleteNotificationTemplateById(DeleteNotificationTemplateByIdArgs args) // Delete notification template by id (deleteNotificationTemplateById
NotificationTemplate getNotificationTemplateById(GetNotificationTemplateByIdArgs args) // Get notification template by id (getNotificationTemplateById)
PageDataNotificationTemplate getNotificationTemplates(GetNotificationTemplatesArgs args) // Get notification templates (getNotificationTemplates)
List<SlackConversation> listSlackConversations(ListSlackConversationsArgs args) // List Slack conversations (listSlackConversations)
NotificationTemplate saveNotificationTemplate(SaveNotificationTemplateArgs args) // Save notification template (saveNotificationTemplate)
```


## deleteNotificationTemplateById

**DELETE** `/api/notification/template/{id}`

Delete notification template by id (deleteNotificationTemplateById

Deletes notification template by its id.  This template cannot be referenced by existing scheduled notification requests or any notification rules.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
void deleteNotificationTemplateById(DeleteNotificationTemplateByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteNotificationTemplateByIdArgs.builder()
        .id(UUID)
        .build()
```

### `DeleteNotificationTemplateByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `UUID` | **yes** |  | |

### Return type

null (empty response body)


## getNotificationTemplateById

**GET** `/api/notification/template/{id}`

Get notification template by id (getNotificationTemplateById)

Fetches notification template by id.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
NotificationTemplate getNotificationTemplateById(GetNotificationTemplateByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetNotificationTemplateByIdArgs.builder()
        .id(UUID)
        .build()
```

### `GetNotificationTemplateByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `UUID` | **yes** |  | |

### Return type

`NotificationTemplate`


## getNotificationTemplates

**GET** `/api/notification/templates`

Get notification templates (getNotificationTemplates)

Returns the page of notification templates owned by sysadmin or tenant.  You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
PageDataNotificationTemplate getNotificationTemplates(GetNotificationTemplatesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetNotificationTemplatesArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetNotificationTemplatesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | Case-insensitive 'substring' filter based on template's name and notification type | |
| `sortProperty` | `String` | no | Property of entity to sort by | |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | |
| `notificationTypes` | `List<String>` | no | Comma-separated list of notification types to filter the templates | |

### Return type

`PageDataNotificationTemplate`


## listSlackConversations

**GET** `/api/notification/slack/conversations`

List Slack conversations (listSlackConversations)

List available Slack conversations by type.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
List<SlackConversation> listSlackConversations(ListSlackConversationsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ListSlackConversationsArgs.builder()
        .type(SlackConversationType)
        .build()
```

### `ListSlackConversationsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `type` | `SlackConversationType` | **yes** |  | enum: `DIRECT`, `PUBLIC_CHANNEL`, `PRIVATE_CHANNEL` |
| `token` | `String` | no | Slack bot token. If absent - system Slack settings will be used | |

### Return type

`List<SlackConversation>`


## saveNotificationTemplate

**POST** `/api/notification/template`

Save notification template (saveNotificationTemplate)

Creates or updates notification template.  Here is an example of template to send notification via Web, SMS and Slack: ```json {   \"name\": \"Greetings\",   \"notificationType\": \"GENERAL\",   \"configuration\": {     \"deliveryMethodsTemplates\": {       \"WEB\": {         \"enabled\": true,         \"subject\": \"Greetings\",         \"body\": \"Hi there, ${recipientTitle}\",         \"additionalConfig\": {           \"icon\": {             \"enabled\": true,             \"icon\": \"back_hand\",             \"color\": \"#757575\"           },           \"actionButtonConfig\": {             \"enabled\": false           }         },         \"method\": \"WEB\"       },       \"SMS\": {         \"enabled\": true,         \"body\": \"Hi there, ${recipientTitle}\",         \"method\": \"SMS\"       },       \"SLACK\": {         \"enabled\": true,         \"body\": \"Hi there, @${recipientTitle}\",         \"method\": \"SLACK\"       }     }   } } ```  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
NotificationTemplate saveNotificationTemplate(SaveNotificationTemplateArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveNotificationTemplateArgs.builder()
        .notificationTemplate(NotificationTemplate)
        .build()
```

### `SaveNotificationTemplateArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `notificationTemplate` | `NotificationTemplate` | **yes** |  | |

### Return type

`NotificationTemplate`


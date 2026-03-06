# NotificationTemplateControllerApi

`ThingsboardClient` methods:

```
void deleteNotificationTemplateById(@Nonnull UUID id) // Delete notification template by id (deleteNotificationTemplateById
NotificationTemplate getNotificationTemplateById(@Nonnull UUID id) // Get notification template by id (getNotificationTemplateById)
PageDataNotificationTemplate getNotificationTemplates(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder, @Nullable List<String> notificationTypes) // Get notification templates (getNotificationTemplates)
List<SlackConversation> listSlackConversations(@Nonnull SlackConversationType type, @Nullable String token) // List Slack conversations (listSlackConversations)
NotificationTemplate saveNotificationTemplate(@Nonnull NotificationTemplate notificationTemplate) // Save notification template (saveNotificationTemplate)
```


## deleteNotificationTemplateById

```
void deleteNotificationTemplateById(@Nonnull UUID id)
```

**DELETE** `/api/notification/template/{id}`

Delete notification template by id (deleteNotificationTemplateById

Deletes notification template by its id.  This template cannot be referenced by existing scheduled notification requests or any notification rules.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |

### Return type

null (empty response body)


## getNotificationTemplateById

```
NotificationTemplate getNotificationTemplateById(@Nonnull UUID id)
```

**GET** `/api/notification/template/{id}`

Get notification template by id (getNotificationTemplateById)

Fetches notification template by id.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |

### Return type

**NotificationTemplate**


## getNotificationTemplates

```
PageDataNotificationTemplate getNotificationTemplates(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder, @Nullable List<String> notificationTypes)
```

**GET** `/api/notification/templates`

Get notification templates (getNotificationTemplates)

Returns the page of notification templates owned by sysadmin or tenant.  You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | Case-insensitive 'substring' filter based on template's name and notification type | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] |
| **notificationTypes** | **List<String>** | Comma-separated list of notification types to filter the templates | [optional] |

### Return type

**PageDataNotificationTemplate**


## listSlackConversations

```
List<SlackConversation> listSlackConversations(@Nonnull SlackConversationType type, @Nullable String token)
```

**GET** `/api/notification/slack/conversations`

List Slack conversations (listSlackConversations)

List available Slack conversations by type.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **SlackConversationType** |  | [enum: DIRECT, PUBLIC_CHANNEL, PRIVATE_CHANNEL] |
| **token** | **String** | Slack bot token. If absent - system Slack settings will be used | [optional] |

### Return type

**List<SlackConversation>**


## saveNotificationTemplate

```
NotificationTemplate saveNotificationTemplate(@Nonnull NotificationTemplate notificationTemplate)
```

**POST** `/api/notification/template`

Save notification template (saveNotificationTemplate)

Creates or updates notification template.  Here is an example of template to send notification via Web, SMS and Slack: ```json {   \"name\": \"Greetings\",   \"notificationType\": \"GENERAL\",   \"configuration\": {     \"deliveryMethodsTemplates\": {       \"WEB\": {         \"enabled\": true,         \"subject\": \"Greetings\",         \"body\": \"Hi there, ${recipientTitle}\",         \"additionalConfig\": {           \"icon\": {             \"enabled\": true,             \"icon\": \"back_hand\",             \"color\": \"#757575\"           },           \"actionButtonConfig\": {             \"enabled\": false           }         },         \"method\": \"WEB\"       },       \"SMS\": {         \"enabled\": true,         \"body\": \"Hi there, ${recipientTitle}\",         \"method\": \"SMS\"       },       \"SLACK\": {         \"enabled\": true,         \"body\": \"Hi there, @${recipientTitle}\",         \"method\": \"SLACK\"       }     }   } } ```  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **notificationTemplate** | **NotificationTemplate** |  | |

### Return type

**NotificationTemplate**


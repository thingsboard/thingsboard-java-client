# NotificationTemplateControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteNotificationTemplateById**](#deleteNotificationTemplateById) | **DELETE** /api/notification/template/{id} | Delete notification template by id (deleteNotificationTemplateById |
| [**getNotificationTemplateById**](#getNotificationTemplateById) | **GET** /api/notification/template/{id} | Get notification template by id (getNotificationTemplateById) |
| [**getNotificationTemplates**](#getNotificationTemplates) | **GET** /api/notification/templates | Get notification templates (getNotificationTemplates) |
| [**listSlackConversations**](#listSlackConversations) | **GET** /api/notification/slack/conversations | List Slack conversations (listSlackConversations) |
| [**saveNotificationTemplate**](#saveNotificationTemplate) | **POST** /api/notification/template | Save notification template (saveNotificationTemplate) |



## deleteNotificationTemplateById

> deleteNotificationTemplateById(id)

Delete notification template by id (deleteNotificationTemplateById

Deletes notification template by its id.  This template cannot be referenced by existing scheduled notification requests or any notification rules.  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |


## getNotificationTemplateById

> NotificationTemplate getNotificationTemplateById(id)

Get notification template by id (getNotificationTemplateById)

Fetches notification template by id.  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |


## getNotificationTemplates

> PageDataNotificationTemplate getNotificationTemplates(pageSize, page, textSearch, sortProperty, sortOrder, notificationTypes)

Get notification templates (getNotificationTemplates)

Returns the page of notification templates owned by sysadmin or tenant.  You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | Case-insensitive &#39;substring&#39; filter based on template&#39;s name and notification type | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] |
| **notificationTypes** | **List&lt;String&gt;** | Comma-separated list of notification types to filter the templates | [optional] |


## listSlackConversations

> List&lt;SlackConversation&gt; listSlackConversations(type, token)

List Slack conversations (listSlackConversations)

List available Slack conversations by type.  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **SlackConversationType** |  | [enum: DIRECT, PUBLIC_CHANNEL, PRIVATE_CHANNEL] |
| **token** | **String** | Slack bot token. If absent - system Slack settings will be used | [optional] |


## saveNotificationTemplate

> NotificationTemplate saveNotificationTemplate(notificationTemplate)

Save notification template (saveNotificationTemplate)

Creates or updates notification template.  Here is an example of template to send notification via Web, SMS and Slack: &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;Greetings\&quot;,   \&quot;notificationType\&quot;: \&quot;GENERAL\&quot;,   \&quot;configuration\&quot;: {     \&quot;deliveryMethodsTemplates\&quot;: {       \&quot;WEB\&quot;: {         \&quot;enabled\&quot;: true,         \&quot;subject\&quot;: \&quot;Greetings\&quot;,         \&quot;body\&quot;: \&quot;Hi there, ${recipientTitle}\&quot;,         \&quot;additionalConfig\&quot;: {           \&quot;icon\&quot;: {             \&quot;enabled\&quot;: true,             \&quot;icon\&quot;: \&quot;back_hand\&quot;,             \&quot;color\&quot;: \&quot;#757575\&quot;           },           \&quot;actionButtonConfig\&quot;: {             \&quot;enabled\&quot;: false           }         },         \&quot;method\&quot;: \&quot;WEB\&quot;       },       \&quot;SMS\&quot;: {         \&quot;enabled\&quot;: true,         \&quot;body\&quot;: \&quot;Hi there, ${recipientTitle}\&quot;,         \&quot;method\&quot;: \&quot;SMS\&quot;       },       \&quot;SLACK\&quot;: {         \&quot;enabled\&quot;: true,         \&quot;body\&quot;: \&quot;Hi there, @${recipientTitle}\&quot;,         \&quot;method\&quot;: \&quot;SLACK\&quot;       }     }   } } &#x60;&#x60;&#x60;  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **notificationTemplate** | **NotificationTemplate** |  | |


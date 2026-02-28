# NotificationRuleControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteNotificationRule**](#deleteNotificationRule) | **DELETE** /api/notification/rule/{id} | Delete notification rule (deleteNotificationRule) |
| [**getNotificationRuleById**](#getNotificationRuleById) | **GET** /api/notification/rule/{id} | Get notification rule by id (getNotificationRuleById) |
| [**getNotificationRules**](#getNotificationRules) | **GET** /api/notification/rules | Get notification rules (getNotificationRules) |
| [**saveNotificationRule**](#saveNotificationRule) | **POST** /api/notification/rule | Save notification rule (saveNotificationRule) |



## deleteNotificationRule

> deleteNotificationRule(id)

Delete notification rule (deleteNotificationRule)

Deletes notification rule by id. Cancels all related scheduled notification requests (e.g. due to escalation table)  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |


## getNotificationRuleById

> NotificationRuleInfo getNotificationRuleById(id)

Get notification rule by id (getNotificationRuleById)

Fetches notification rule info by rule&#39;s id. In addition to regular notification rule fields, there are &#x60;templateName&#x60; and &#x60;deliveryMethods&#x60; in the response.  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |


## getNotificationRules

> PageDataNotificationRuleInfo getNotificationRules(pageSize, page, textSearch, sortProperty, sortOrder)

Get notification rules (getNotificationRules)

Returns the page of notification rules.  You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | Case-insensitive &#39;substring&#39; filter based on rule&#39;s name | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] |


## saveNotificationRule

> NotificationRule saveNotificationRule(notificationRule)

Save notification rule (saveNotificationRule)

Creates or updates notification rule.   Mandatory properties are &#x60;name&#x60;, &#x60;templateId&#x60; (of a template with &#x60;notificationType&#x60; matching to rule&#39;s &#x60;triggerType&#x60;), &#x60;triggerType&#x60;, &#x60;triggerConfig&#x60; and &#x60;recipientConfig&#x60;. Additionally, you may specify rule &#x60;description&#x60; inside of &#x60;additionalConfig&#x60;.  Trigger type of the rule cannot be changed. Available trigger types for tenant: &#x60;ENTITY_ACTION&#x60;, &#x60;ALARM&#x60;, &#x60;ALARM_COMMENT&#x60;, &#x60;ALARM_ASSIGNMENT&#x60;, &#x60;DEVICE_ACTIVITY&#x60;, &#x60;RULE_ENGINE_COMPONENT_LIFECYCLE_EVENT&#x60;. For sysadmin, there are following trigger types available: &#x60;ENTITIES_LIMIT&#x60;, &#x60;API_USAGE_LIMIT&#x60;, &#x60;NEW_PLATFORM_VERSION&#x60;.  Here is an example of notification rule to send notification when a device, asset or customer is created or deleted: &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;Entity action\&quot;,   \&quot;templateId\&quot;: {     \&quot;entityType\&quot;: \&quot;NOTIFICATION_TEMPLATE\&quot;,     \&quot;id\&quot;: \&quot;32117320-d785-11ed-a06c-21dd57dd88ca\&quot;   },   \&quot;triggerType\&quot;: \&quot;ENTITY_ACTION\&quot;,   \&quot;triggerConfig\&quot;: {     \&quot;entityTypes\&quot;: [       \&quot;CUSTOMER\&quot;,       \&quot;DEVICE\&quot;,       \&quot;ASSET\&quot;     ],     \&quot;created\&quot;: true,     \&quot;updated\&quot;: false,     \&quot;deleted\&quot;: true,     \&quot;triggerType\&quot;: \&quot;ENTITY_ACTION\&quot;   },   \&quot;recipientsConfig\&quot;: {     \&quot;targets\&quot;: [       \&quot;320f2930-d785-11ed-a06c-21dd57dd88ca\&quot;     ],     \&quot;triggerType\&quot;: \&quot;ENTITY_ACTION\&quot;   },   \&quot;additionalConfig\&quot;: {     \&quot;description\&quot;: \&quot;Send notification to tenant admins or customer users when a device, asset or customer is created\&quot;   },   \&quot;templateName\&quot;: \&quot;Entity action notification\&quot;,   \&quot;deliveryMethods\&quot;: [     \&quot;WEB\&quot;   ] } &#x60;&#x60;&#x60;  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **notificationRule** | **NotificationRule** |  | |


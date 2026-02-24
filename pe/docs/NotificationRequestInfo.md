

# NotificationRequestInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**NotificationRequestId**](NotificationRequestId.md) |  |  [optional] |
|**createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch |  [optional] [readonly] |
|**tenantId** | [**TenantId**](TenantId.md) |  |  [optional] |
|**targets** | **List&lt;UUID&gt;** |  |  |
|**templateId** | [**NotificationTemplateId**](NotificationTemplateId.md) |  |  [optional] |
|**template** | [**NotificationTemplate**](NotificationTemplate.md) |  |  [optional] |
|**info** | [**NotificationInfo**](NotificationInfo.md) |  |  [optional] |
|**additionalConfig** | [**NotificationRequestConfig**](NotificationRequestConfig.md) |  |  [optional] |
|**originatorEntityId** | [**EntityId**](EntityId.md) |  |  [optional] |
|**ruleId** | [**NotificationRuleId**](NotificationRuleId.md) |  |  [optional] |
|**status** | **NotificationRequestStatus** |  |  [optional] |
|**stats** | [**NotificationRequestStats**](NotificationRequestStats.md) |  |  [optional] |
|**templateName** | **String** |  |  [optional] |
|**deliveryMethods** | **List&lt;NotificationDeliveryMethod&gt;** |  |  [optional] |






# NotificationRuleInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**NotificationRuleId**](NotificationRuleId.md) |  |  [optional] |
|**createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch |  [optional] [readonly] |
|**tenantId** | [**TenantId**](TenantId.md) |  |  [optional] |
|**name** | **String** |  |  |
|**enabled** | **Boolean** |  |  [optional] |
|**templateId** | [**NotificationTemplateId**](NotificationTemplateId.md) |  |  |
|**triggerType** | **NotificationRuleTriggerType** |  |  |
|**triggerConfig** | [**NotificationRuleTriggerConfig**](NotificationRuleTriggerConfig.md) |  |  |
|**recipientsConfig** | [**NotificationRuleRecipientsConfig**](NotificationRuleRecipientsConfig.md) |  |  |
|**additionalConfig** | [**NotificationRuleConfig**](NotificationRuleConfig.md) |  |  [optional] |
|**templateName** | **String** |  |  [optional] |
|**deliveryMethods** | **List&lt;NotificationDeliveryMethod&gt;** |  |  [optional] |




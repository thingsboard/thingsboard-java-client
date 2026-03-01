
# NotificationRuleInfo

`org.thingsboard.client.model.NotificationRuleInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **NotificationRuleId** |  | [optional] |
| **createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| **tenantId** | **TenantId** |  | [optional] |
| **name** | **String** |  | |
| **enabled** | **Boolean** |  | [optional] |
| **templateId** | **NotificationTemplateId** |  | |
| **triggerType** | **NotificationRuleTriggerType** |  | |
| **triggerConfig** | **NotificationRuleTriggerConfig** |  | |
| **recipientsConfig** | **NotificationRuleRecipientsConfig** |  | |
| **additionalConfig** | **NotificationRuleConfig** |  | [optional] |
| **templateName** | **String** |  | [optional] |
| **deliveryMethods** | **List\<NotificationDeliveryMethod\>** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


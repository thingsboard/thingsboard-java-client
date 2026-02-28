
# ReportJobConfiguration

`org.thingsboard.client.model.ReportJobConfiguration`

**Extends:** **JobConfiguration**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **reportTemplateId** | **ReportTemplateId** |  | [optional] |
| **userId** | **UserId** |  | [optional] |
| **timezone** | **String** |  | [optional] |
| **targets** | **List\<UUID\>** |  | [optional] |
| **notificationTemplateId** | **NotificationTemplateId** |  | [optional] |
| **notificationRequests** | **List\<NotificationRequest\>** |  | [optional] |
| **originator** | **EntityId** |  | [optional] |
| **ruleNode** | **RuleNode** |  | [optional] |
| **outputTbMsgProto** | **String** |  | [optional] |
| **queueName** | **String** |  | [optional] |
| **schedulerEventInfo** | **EntityInfo** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


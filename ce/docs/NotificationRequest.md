
# NotificationRequest

`org.thingsboard.client.model.NotificationRequest`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **tenantId** | **TenantId** |  | [optional] |
| **targets** | **List\<UUID\>** |  | |
| **templateId** | **NotificationTemplateId** |  | [optional] |
| **template** | **NotificationTemplate** |  | [optional] |
| **info** | **NotificationInfo** |  | [optional] |
| **additionalConfig** | **NotificationRequestConfig** |  | [optional] |
| **originatorEntityId** | **EntityId** |  | [optional] |
| **ruleId** | **NotificationRuleId** |  | [optional] |
| **status** | **NotificationRequestStatus** |  | [optional] |
| **stats** | **NotificationRequestStats** |  | [optional] |
| **id** | **NotificationRequestId** |  | [optional] |
| **createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions



# ReportRequest

`org.thingsboard.client.model.ReportRequest`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **reportTemplateId** | **ReportTemplateId** | Json object representing the report template id. | [optional] |
| **reportTemplateConfig** | **ReportTemplateConfig** | Json object representing the report template config. | [optional] |
| **timezone** | **String** | Timezone used for report generation. | [optional] |
| **userId** | **String** | A string value representing the user id. | [optional] |
| **originator** | **EntityId** | Json object representing the originator id. | [optional] |
| **targets** | **List\<UUID\>** |  | [optional] |
| **notificationTemplateId** | **NotificationTemplateId** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


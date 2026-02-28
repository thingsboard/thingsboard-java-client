
# NotificationRequestPreview

`org.thingsboard.client.model.NotificationRequestPreview`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **processedTemplates** | **Map\<String, DeliveryMethodNotificationTemplate\>** |  | [optional] |
| **totalRecipientsCount** | **Integer** |  | [optional] |
| **recipientsCountByTarget** | **Map\<String, Integer\>** |  | [optional] |
| **recipientsPreview** | **List\<String\>** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


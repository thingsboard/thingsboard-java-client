
# NotificationRequestStats

`org.thingsboard.client.model.NotificationRequestStats`

Notification request processing statistics

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **sent** | **Map\<String, Integer\>** | Number of successfully sent notifications per delivery method | [optional] |
| **errors** | **Map\<String, Map<String, String>\>** | Errors per delivery method. Each entry maps recipient name to error message | [optional] |
| **totalErrors** | **Integer** | Total number of errors across all delivery methods | [optional] |
| **error** | **String** | General error message if the entire request failed | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


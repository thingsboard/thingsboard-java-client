
# NotificationRequestStats

`org.thingsboard.client.model.NotificationRequestStats`

Notification request processing statistics

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **sent** | **Map\<String, Integer\>** |  | [optional] |
| **errors** | **Map\<String, Map<String, String>\>** |  | [optional] |
| **totalErrors** | **Integer** |  | [optional] |
| **error** | **String** |  | [optional] |
| **totalSent** | **Integer** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions



# Notification

`org.thingsboard.client.model.Notification`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **NotificationId** |  | [optional] |
| **createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| **requestId** | **NotificationRequestId** |  | [optional] |
| **recipientId** | **UserId** |  | [optional] |
| **type** | **NotificationType** |  | [optional] |
| **deliveryMethod** | **NotificationDeliveryMethod** |  | [optional] |
| **subject** | **String** |  | [optional] |
| **text** | **String** |  | [optional] |
| **additionalConfig** | **com.fasterxml.jackson.databind.JsonNode** |  | [optional] |
| **info** | **NotificationInfo** |  | [optional] |
| **status** | **NotificationStatus** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


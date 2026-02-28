
# ThingsboardErrorResponse

`org.thingsboard.client.model.ThingsboardErrorResponse`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **message** | **String** | Error message | [optional] [readonly] |
| **errorCode** | **ThingsboardErrorCode** |  | [optional] |
| **status** | **Integer** | HTTP Response Status Code | [optional] [readonly] |
| **subscriptionErrorCode** | **SubscriptionExceptionErrorCode** |  | [optional] |
| **subscriptionEntry** | **SubscriptionEntry** |  | [optional] |
| **subscriptionValue** | **com.fasterxml.jackson.databind.JsonNode** |  | [optional] |
| **timestamp** | **Long** | Timestamp | [optional] [readonly] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


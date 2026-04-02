
# ThingsboardCredentialsExpiredResponse

`org.thingsboard.client.model.ThingsboardCredentialsExpiredResponse`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **errorCode** | **ThingsboardErrorCode** |  | [optional] |
| **message** | **String** | Error message | [optional] [readonly] |
| **resetToken** | **String** | Password reset token | [optional] [readonly] |
| **status** | **Integer** | HTTP Response Status Code | [optional] [readonly] |
| **subscriptionEntry** | **SubscriptionEntry** |  | [optional] |
| **subscriptionErrorCode** | **SubscriptionExceptionErrorCode** |  | [optional] |
| **subscriptionValue** | **com.fasterxml.jackson.databind.JsonNode** |  | [optional] |
| **timestamp** | **Long** | Timestamp | [optional] [readonly] |



## Referenced Types

#### ThingsboardErrorCode (enum)
`NUMBER_2` | `NUMBER_10` | `NUMBER_11` | `NUMBER_15` | `NUMBER_20` | `NUMBER_30` | `NUMBER_31` | `NUMBER_32` | `NUMBER_33` | `NUMBER_34` | … (16 values total)

#### SubscriptionEntry (enum)
`NUMBER_1` | `NUMBER_2` | `NUMBER_3` | `NUMBER_4` | `NUMBER_5` | `NUMBER_6` | `NUMBER_7` | `NUMBER_8` | `NUMBER_9` | `NUMBER_10` | … (13 values total)

#### SubscriptionExceptionErrorCode (enum)
`NUMBER_1` | `NUMBER_2` | `NUMBER_3` | `NUMBER_4` | `NUMBER_5` | `NUMBER_6` | `NUMBER_7`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


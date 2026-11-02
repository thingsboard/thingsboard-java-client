
# Login401Response

`org.thingsboard.client.model.Login401Response`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **errorCode** | **ThingsboardErrorCode** |  | [optional] |
| **message** | **String** | Error message | [optional] [readonly] |
| **status** | **Integer** | HTTP Response Status Code | [optional] [readonly] |
| **subscriptionEntry** | **SubscriptionEntry** |  | [optional] |
| **subscriptionErrorCode** | **SubscriptionErrorCode** |  | [optional] |
| **subscriptionValue** | **com.fasterxml.jackson.databind.JsonNode** |  | [optional] |
| **timestamp** | **Long** | Timestamp | [optional] [readonly] |
| **resetToken** | **String** | Password reset token | [optional] [readonly] |



## Referenced Types

#### ThingsboardErrorCode (enum)
`NUMBER_2` | `NUMBER_10` | `NUMBER_11` | `NUMBER_15` | `NUMBER_20` | `NUMBER_30` | `NUMBER_31` | `NUMBER_32` | `NUMBER_33` | `NUMBER_34` | … (16 values total)

#### SubscriptionEntry (enum)
`DEVICE_COUNT` | `ASSET_COUNT` | `EDGE_COUNT` | `WHITE_LABELING` | `INTEGRATIONS` | `SCHEDULER` | `REPORTING` | `AGENT_COUNT`

#### SubscriptionErrorCode (enum)
`LIMIT_REACHED` | `FEATURE_DISABLED`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


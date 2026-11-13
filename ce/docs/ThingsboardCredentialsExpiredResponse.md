
# ThingsboardCredentialsExpiredResponse

`org.thingsboard.client.model.ThingsboardCredentialsExpiredResponse`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **status** | **Integer** | HTTP Response Status Code | [optional] [readonly] |
| **message** | **String** | Error message | [optional] [readonly] |
| **errorCode** | **ThingsboardErrorCode** | Platform error code: * `2` - General error (HTTP: 500 - Internal Server Error)  * `10` - Authentication failed (HTTP: 401 - Unauthorized)  * `11` - JWT token expired (HTTP: 401 - Unauthorized)  * `15` - Credentials expired (HTTP: 401 - Unauthorized)  * `20` - Permission denied (HTTP: 403 - Forbidden)  * `30` - Invalid arguments (HTTP: 400 - Bad Request)  * `31` - Bad request params (HTTP: 400 - Bad Request)  * `32` - Item not found (HTTP: 404 - Not Found)  * `33` - Too many requests (HTTP: 429 - Too Many Requests)  * `34` - Too many updates (Too many updates over Websocket session)  * `35` - Version conflict (HTTP: 409 - Conflict)  * `40` - Subscription violation (HTTP: 403 - Forbidden)  * `41` - Entities limit exceeded (HTTP: 403 - Forbidden)  * `47` - Setup incomplete (HTTP: 423 - Locked) | [optional] [readonly] |
| **timestamp** | **Long** | Timestamp | [optional] [readonly] |
| **subscriptionErrorCode** | **SubscriptionErrorCode** |  | [optional] |
| **subscriptionEntry** | **SubscriptionEntry** |  | [optional] |
| **subscriptionValue** | **com.fasterxml.jackson.databind.JsonNode** |  | [optional] |
| **resetToken** | **String** | Password reset token | [optional] [readonly] |



## Referenced Types

#### ThingsboardErrorCode (enum)
`NUMBER_2` | `NUMBER_10` | `NUMBER_11` | `NUMBER_15` | `NUMBER_20` | `NUMBER_30` | `NUMBER_31` | `NUMBER_32` | `NUMBER_33` | `NUMBER_34` | … (16 values total)

#### SubscriptionErrorCode (enum)
`LIMIT_REACHED` | `FEATURE_DISABLED`

#### SubscriptionEntry (enum)
`DEVICE_COUNT` | `ASSET_COUNT` | `EDGE_COUNT` | `WHITE_LABELING` | `INTEGRATIONS` | `SCHEDULER` | `REPORTING` | `AGENT_COUNT`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


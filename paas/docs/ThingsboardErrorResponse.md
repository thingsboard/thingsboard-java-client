
# ThingsboardErrorResponse

`org.thingsboard.client.model.ThingsboardErrorResponse`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **status** | **Integer** | HTTP Response Status Code | [optional] [readonly] |
| **message** | **String** | Error message | [optional] [readonly] |
| **errorCode** | **ThingsboardErrorCode** | Platform error code: * `2` - General error (HTTP: 500 - Internal Server Error)  * `10` - Authentication failed (HTTP: 401 - Unauthorized)  * `11` - JWT token expired (HTTP: 401 - Unauthorized)  * `15` - Credentials expired (HTTP: 401 - Unauthorized)  * `20` - Permission denied (HTTP: 403 - Forbidden)  * `30` - Invalid arguments (HTTP: 400 - Bad Request)  * `31` - Bad request params (HTTP: 400 - Bad Request)  * `32` - Item not found (HTTP: 404 - Not Found)  * `33` - Too many requests (HTTP: 429 - Too Many Requests)  * `34` - Too many updates (Too many updates over Websocket session)  * `35` - Version conflict (HTTP: 409 - Conflict)  * `40` - Subscription violation (HTTP: 403 - Forbidden)  * `41` - Entities limit exceeded (HTTP: 403 - Forbidden) | [optional] [readonly] |
| **timestamp** | **Long** | Timestamp | [optional] [readonly] |
| **subscriptionErrorCode** | **SubscriptionExceptionErrorCode** | Subscription error code: * `1` - Entities limit reached (HTTP: 403 - Forbidden)  * `2` - Feature disabled (HTTP: 403 - Forbidden)  * `3` - Subscription is not active (HTTP: 403 - Forbidden)  * `4` - Billing error (HTTP: 400 - Bad Request)  * `5` - Permission denied (HTTP: 403 - Forbidden)  * `6` - Unable to change plan due to entities limits overflow (HTTP: 403 - Forbidden)  * `7` - Solution template level doesn't meet subscription plan (HTTP: 403 - Forbidden) | [optional] [readonly] |
| **subscriptionEntry** | **SubscriptionEntry** | Subscription entry: * `1` - Devices count  * `2` - Assets count  * `3` - Customers count  * `4` - Users count  * `5` - Dashboards count  * `6` - Rule chains count  * `7` - Integrations count  * `8` - Converters count  * `9` - Scheduler events count  * `30` - White-labeling | [optional] [readonly] |
| **subscriptionValue** | **com.fasterxml.jackson.databind.JsonNode** | Subscription value | [optional] [readonly] |



## Referenced Types

#### ThingsboardErrorCode (enum)
`NUMBER_2` | `NUMBER_10` | `NUMBER_11` | `NUMBER_15` | `NUMBER_20` | `NUMBER_30` | `NUMBER_31` | `NUMBER_32` | `NUMBER_33` | `NUMBER_34` | … (16 values total)

#### SubscriptionExceptionErrorCode (enum)
`NUMBER_1` | `NUMBER_2` | `NUMBER_3` | `NUMBER_4` | `NUMBER_5` | `NUMBER_6`

#### SubscriptionEntry (enum)
`NUMBER_1` | `NUMBER_2` | `NUMBER_3` | `NUMBER_4` | `NUMBER_5` | `NUMBER_6` | `NUMBER_7` | `NUMBER_8` | `NUMBER_9` | `NUMBER_10` | … (15 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


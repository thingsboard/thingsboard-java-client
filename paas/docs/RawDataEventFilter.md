
# RawDataEventFilter

`org.thingsboard.client.model.RawDataEventFilter`

**Extends:** **EventFilter**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **server** | **String** | String value representing the server name, identifier or ip address where the platform is running | [optional] |
| **uuid** | **String** | String value representing the uuid | [optional] |
| **messageType** | **String** | String value representing the message type | [optional] |
| **message** | **String** | String value representing the message | [optional] |



## Referenced Types

#### EventFilter
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| eventType | EventType | String value representing the event type |  |
| notEmpty | Boolean |  | [optional] |

#### EventType (enum)
`ERROR` | `LC_EVENT` | `STATS` | `RAW_DATA` | `DEBUG_RULE_NODE` | `DEBUG_RULE_CHAIN` | `DEBUG_CONVERTER` | `DEBUG_INTEGRATION` | `DEBUG_CALCULATED_FIELD`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


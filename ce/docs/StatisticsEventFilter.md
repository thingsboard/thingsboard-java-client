
# StatisticsEventFilter

`org.thingsboard.client.model.StatisticsEventFilter`

**Extends:** **EventFilter**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **server** | **String** | String value representing the server name, identifier or ip address where the platform is running | [optional] |
| **minMessagesProcessed** | **Integer** | The minimum number of successfully processed messages | [optional] |
| **maxMessagesProcessed** | **Integer** | The maximum number of successfully processed messages | [optional] |
| **minErrorsOccurred** | **Integer** | The minimum number of errors occurred during messages processing | [optional] |
| **maxErrorsOccurred** | **Integer** | The maximum number of errors occurred during messages processing | [optional] |



## Referenced Types

#### EventFilter
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| eventType | EventType | String value representing the event type |  |
| notEmpty | Boolean |  | [optional] |

#### EventType (enum)
`ERROR` | `LC_EVENT` | `STATS` | `DEBUG_RULE_NODE` | `DEBUG_RULE_CHAIN` | `DEBUG_CALCULATED_FIELD`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


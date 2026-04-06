
# RuleChainDebugEventFilter

`org.thingsboard.client.model.RuleChainDebugEventFilter`

**Extends:** **EventFilter**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **server** | **String** | String value representing the server name, identifier or ip address where the platform is running | [optional] |
| **isError** | **IsErrorEnum** | Boolean value to filter the errors | [optional] |
| **errorStr** | **String** | The case insensitive 'contains' filter based on error message | [optional] |
| **message** | **String** | String value representing the message | [optional] |


### Enum: IsErrorEnum

| Name | Value |
|---- | -----|
| FALSE | "false" |
| TRUE | "true" |



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


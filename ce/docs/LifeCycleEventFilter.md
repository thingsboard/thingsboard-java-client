
# LifeCycleEventFilter

`org.thingsboard.client.model.LifeCycleEventFilter`

**Extends:** **EventFilter**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **server** | **String** | String value representing the server name, identifier or ip address where the platform is running | [optional] |
| **event** | **String** | String value representing the lifecycle event type | [optional] |
| **status** | **StatusEnum** | String value representing status of the lifecycle event | [optional] |
| **errorStr** | **String** | The case insensitive 'contains' filter based on error message | [optional] |


### Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | "Success" |
| FAILURE | "Failure" |



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


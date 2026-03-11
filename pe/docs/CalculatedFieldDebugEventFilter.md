
# CalculatedFieldDebugEventFilter

`org.thingsboard.client.model.CalculatedFieldDebugEventFilter`

**Extends:** **EventFilter**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **server** | **String** | String value representing the server name, identifier or ip address where the platform is running | [optional] |
| **errorStr** | **String** | The case insensitive 'contains' filter based on error message | [optional] |
| **entityId** | **String** | String value representing the entity id in the event body | [optional] |
| **entityType** | **EntityTypeEnum** | String value representing the entity type | [optional] |
| **msgId** | **String** | String value representing the message id in the rule engine | [optional] |
| **msgType** | **String** | String value representing the message type | [optional] |
| **arguments** | **String** | String value representing the arguments that were used in the calculation performed | [optional] |
| **result** | **String** | String value representing the result of a calculation | [optional] |
| **error** | **Boolean** |  | [optional] |
| **isError** | **Boolean** |  | [optional] |


### Enum: EntityTypeEnum

| Name | Value |
|---- | -----|
| DEVICE | "DEVICE" |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions



# RuleNodeDebugEventFilter

`org.thingsboard.client.model.RuleNodeDebugEventFilter`

**Extends:** **EventFilter**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **server** | **String** | String value representing the server name, identifier or ip address where the platform is running | [optional] |
| **errorStr** | **String** | The case insensitive 'contains' filter based on error message | [optional] |
| **msgDirectionType** | **MsgDirectionTypeEnum** | String value representing msg direction type (incoming to entity or outcoming from entity) | [optional] |
| **entityId** | **String** | String value representing the entity id in the event body (originator of the message) | [optional] |
| **entityType** | **EntityTypeEnum** | String value representing the entity type | [optional] |
| **msgId** | **String** | String value representing the message id in the rule engine | [optional] |
| **msgType** | **String** | String value representing the message type | [optional] |
| **relationType** | **String** | String value representing the type of message routing | [optional] |
| **dataSearch** | **String** | The case insensitive 'contains' filter based on data (key and value) for the message. | [optional] |
| **metadataSearch** | **String** | The case insensitive 'contains' filter based on metadata (key and value) for the message. | [optional] |
| **isError** | **Boolean** |  | [optional] |
| **error** | **Boolean** |  | [optional] |


### Enum: MsgDirectionTypeEnum

| Name | Value |
|---- | -----|
| IN | "IN" |
| OUT | "OUT" |


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


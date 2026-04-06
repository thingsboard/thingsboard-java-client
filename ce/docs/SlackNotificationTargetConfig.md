
# SlackNotificationTargetConfig

`org.thingsboard.client.model.SlackNotificationTargetConfig`

**Extends:** **NotificationTargetConfig**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **conversationType** | **SlackConversationType** |  | [optional] |
| **conversation** | **SlackConversation** |  | |



## Referenced Types

#### NotificationTargetConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| description | String |  | [optional] |
| type | String |  |  |

#### SlackConversationType (enum)
`DIRECT` | `PUBLIC_CHANNEL` | `PRIVATE_CHANNEL`

#### SlackConversation
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | SlackConversationType |  |  |
| id | String |  |  |
| name | String |  |  |
| wholeName | String |  | [optional] |
| email | String |  | [optional] |
| title | String |  | [optional] |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


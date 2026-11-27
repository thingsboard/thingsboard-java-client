
# NotificationDeliveryMethodConfig

`org.thingsboard.client.model.NotificationDeliveryMethodConfig`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **method** | **String** |  | |



## Subtypes

#### MobileAppNotificationDeliveryMethodConfig  *(method=`MOBILE_APP`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| firebaseServiceAccountCredentialsFileName | String |  | [optional] |
| firebaseServiceAccountCredentials | String |  | [optional] |
| useSystemSettings | Boolean |  | [optional] |

#### SlackNotificationDeliveryMethodConfig  *(method=`SLACK`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| botToken | String |  |  |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


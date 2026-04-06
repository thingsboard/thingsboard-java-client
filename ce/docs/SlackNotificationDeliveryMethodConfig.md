
# SlackNotificationDeliveryMethodConfig

`org.thingsboard.client.model.SlackNotificationDeliveryMethodConfig`

**Extends:** **NotificationDeliveryMethodConfig**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **botToken** | **String** |  | |



## Referenced Types

#### NotificationDeliveryMethodConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| method | String |  |  |

#### MobileAppNotificationDeliveryMethodConfig  *(extends NotificationDeliveryMethodConfig, method=`MOBILE_APP`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| firebaseServiceAccountCredentialsFileName | String |  | [optional] |
| firebaseServiceAccountCredentials | String |  |  |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


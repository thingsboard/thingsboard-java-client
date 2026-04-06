
# NotificationSettings

`org.thingsboard.client.model.NotificationSettings`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **deliveryMethodsConfigs** | **Map\<String, NotificationDeliveryMethodConfig\>** |  | |



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

#### SlackNotificationDeliveryMethodConfig  *(extends NotificationDeliveryMethodConfig, method=`SLACK`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| botToken | String |  |  |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


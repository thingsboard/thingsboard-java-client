
# SmsDeliveryMethodNotificationTemplate

`org.thingsboard.client.model.SmsDeliveryMethodNotificationTemplate`

**Extends:** **DeliveryMethodNotificationTemplate**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|



## Referenced Types

#### DeliveryMethodNotificationTemplate
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| enabled | Boolean |  | [optional] |
| body | String |  |  |
| method | String |  |  |

#### EmailDeliveryMethodNotificationTemplate  *(extends DeliveryMethodNotificationTemplate, method=`EMAIL`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| subject | String |  |  |

#### MicrosoftTeamsDeliveryMethodNotificationTemplate  *(extends DeliveryMethodNotificationTemplate, method=`MICROSOFT_TEAMS`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| subject | String |  | [optional] |
| themeColor | String |  | [optional] |
| button | Button |  | [optional] |

#### MobileAppDeliveryMethodNotificationTemplate  *(extends DeliveryMethodNotificationTemplate, method=`MOBILE_APP`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| subject | String | Subject line for the mobile notification |  |
| additionalConfig | com.fasterxml.jackson.databind.JsonNode | Additional JSON configuration for web buttons/actions | [optional] |

#### SlackDeliveryMethodNotificationTemplate  *(extends DeliveryMethodNotificationTemplate, method=`SLACK`)*
*See DeliveryMethodNotificationTemplate for properties.*

#### WebDeliveryMethodNotificationTemplate  *(extends DeliveryMethodNotificationTemplate, method=`WEB`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| subject | String | Subject line for the web notification |  |
| additionalConfig | com.fasterxml.jackson.databind.JsonNode | Additional JSON configuration for web buttons/actions | [optional] |

#### Button
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| enabled | Boolean |  | [optional] |
| text | String |  | [optional] |
| linkType | LinkType |  | [optional] |
| link | String |  | [optional] |
| dashboardId | UUID |  | [optional] |
| dashboardState | String |  | [optional] |
| setEntityIdInState | Boolean |  | [optional] |

#### LinkType (enum)
`LINK` | `DASHBOARD`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


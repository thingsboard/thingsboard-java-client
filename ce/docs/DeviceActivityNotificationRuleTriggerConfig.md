
# DeviceActivityNotificationRuleTriggerConfig

`org.thingsboard.client.model.DeviceActivityNotificationRuleTriggerConfig`

**Extends:** **NotificationRuleTriggerConfig**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **devices** | **Set\<UUID\>** |  | [optional] |
| **deviceProfiles** | **Set\<UUID\>** |  | [optional] |
| **notifyOn** | **Set\<DeviceEvent\>** |  | |



## Referenced Types

#### NotificationRuleTriggerConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| triggerType | NotificationRuleTriggerType |  |  |

#### DeviceEvent (enum)
`ACTIVE` | `INACTIVE`

#### NotificationRuleTriggerType (enum)
`ENTITY_ACTION` | `ALARM` | `ALARM_COMMENT` | `ALARM_ASSIGNMENT` | `DEVICE_ACTIVITY` | `RULE_ENGINE_COMPONENT_LIFECYCLE_EVENT` | `INTEGRATION_LIFECYCLE_EVENT` | `EDGE_CONNECTION` | `EDGE_COMMUNICATION_FAILURE` | `NEW_PLATFORM_VERSION` | … (15 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


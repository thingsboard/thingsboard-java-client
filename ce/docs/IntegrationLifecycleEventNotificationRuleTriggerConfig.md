
# IntegrationLifecycleEventNotificationRuleTriggerConfig

`org.thingsboard.client.model.IntegrationLifecycleEventNotificationRuleTriggerConfig`

**Extends:** **NotificationRuleTriggerConfig**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **integrationTypes** | **Set\<IntegrationType\>** |  | [optional] |
| **integrations** | **Set\<UUID\>** |  | [optional] |
| **notifyOn** | **Set\<ComponentLifecycleEvent\>** |  | [optional] |
| **onlyOnError** | **Boolean** |  | [optional] |



## Referenced Types

#### NotificationRuleTriggerConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| triggerType | NotificationRuleTriggerType |  |  |

#### IntegrationType (enum)
`OCEANCONNECT` | `SIGFOX` | `THINGPARK` | `TPE` | `CHIRPSTACK` | `PARTICLE` | `TMOBILE_IOT_CDP` | `HTTP` | `MQTT` | `PUB_SUB` | … (29 values total)

#### ComponentLifecycleEvent (enum)
`CREATED` | `STARTED` | `ACTIVATED` | `SUSPENDED` | `UPDATED` | `STOPPED` | `DELETED` | `FAILED` | `DEACTIVATED` | `RELATION_UPDATED` | … (11 values total)

#### NotificationRuleTriggerType (enum)
`ENTITY_ACTION` | `ALARM` | `ALARM_COMMENT` | `ALARM_ASSIGNMENT` | `DEVICE_ACTIVITY` | `RULE_ENGINE_COMPONENT_LIFECYCLE_EVENT` | `INTEGRATION_LIFECYCLE_EVENT` | `EDGE_CONNECTION` | `EDGE_COMMUNICATION_FAILURE` | `NEW_PLATFORM_VERSION` | … (15 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions



# AlarmNotificationRuleTriggerConfig

`org.thingsboard.client.model.AlarmNotificationRuleTriggerConfig`

**Extends:** **NotificationRuleTriggerConfig**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **alarmTypes** | **Set\<String\>** |  | [optional] |
| **alarmSeverities** | **Set\<AlarmSeverity\>** |  | [optional] |
| **notifyOn** | **Set\<AlarmAction\>** |  | |
| **clearRule** | **ClearRule** |  | [optional] |



## Referenced Types

#### NotificationRuleTriggerConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| triggerType | NotificationRuleTriggerType |  |  |

#### AlarmSeverity (enum)
`CRITICAL` | `MAJOR` | `MINOR` | `WARNING` | `INDETERMINATE`

#### AlarmAction (enum)
`CREATED` | `SEVERITY_CHANGED` | `ACKNOWLEDGED` | `CLEARED`

#### ClearRule
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| alarmStatuses | Set<AlarmSearchStatus> |  | [optional] |

#### NotificationRuleTriggerType (enum)
`ENTITY_ACTION` | `ALARM` | `ALARM_COMMENT` | `ALARM_ASSIGNMENT` | `DEVICE_ACTIVITY` | `RULE_ENGINE_COMPONENT_LIFECYCLE_EVENT` | `EDGE_CONNECTION` | `EDGE_COMMUNICATION_FAILURE` | `NEW_PLATFORM_VERSION` | `ENTITIES_LIMIT` | … (14 values total)

#### AlarmSearchStatus (enum)
`ANY` | `ACTIVE` | `CLEARED` | `ACK` | `UNACK`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions



# AlarmCommentNotificationRuleTriggerConfig

`org.thingsboard.client.model.AlarmCommentNotificationRuleTriggerConfig`

**Extends:** **NotificationRuleTriggerConfig**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **alarmTypes** | **Set\<String\>** |  | [optional] |
| **alarmSeverities** | **Set\<AlarmSeverity\>** |  | [optional] |
| **alarmStatuses** | **Set\<AlarmSearchStatus\>** |  | [optional] |
| **onlyUserComments** | **Boolean** |  | [optional] |
| **notifyOnCommentUpdate** | **Boolean** |  | [optional] |



## Referenced Types

#### NotificationRuleTriggerConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| triggerType | NotificationRuleTriggerType |  |  |

#### AlarmSeverity (enum)
`CRITICAL` | `MAJOR` | `MINOR` | `WARNING` | `INDETERMINATE`

#### AlarmSearchStatus (enum)
`ANY` | `ACTIVE` | `CLEARED` | `ACK` | `UNACK`

#### NotificationRuleTriggerType (enum)
`ENTITY_ACTION` | `ALARM` | `ALARM_COMMENT` | `ALARM_ASSIGNMENT` | `DEVICE_ACTIVITY` | `RULE_ENGINE_COMPONENT_LIFECYCLE_EVENT` | `INTEGRATION_LIFECYCLE_EVENT` | `EDGE_CONNECTION` | `EDGE_COMMUNICATION_FAILURE` | `NEW_PLATFORM_VERSION` | … (15 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


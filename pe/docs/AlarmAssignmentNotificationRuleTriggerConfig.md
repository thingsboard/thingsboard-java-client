
# AlarmAssignmentNotificationRuleTriggerConfig

`org.thingsboard.client.model.AlarmAssignmentNotificationRuleTriggerConfig`

**Extends:** **NotificationRuleTriggerConfig**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **alarmTypes** | **Set\<String\>** |  | [optional] |
| **alarmSeverities** | **Set\<AlarmSeverity\>** |  | [optional] |
| **alarmStatuses** | **Set\<AlarmSearchStatus\>** |  | [optional] |
| **notifyOn** | **Set\<Action\>** |  | |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions



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



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


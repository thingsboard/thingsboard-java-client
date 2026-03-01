
# AlarmRule

`org.thingsboard.client.model.AlarmRule`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **condition** | **AlarmCondition** | JSON object representing the alarm rule condition | [optional] |
| **schedule** | **AlarmSchedule** | JSON object representing time interval during which the rule is active | [optional] |
| **alarmDetails** | **String** | String value representing the additional details for an alarm rule | [optional] |
| **dashboardId** | **DashboardId** | JSON object with the dashboard Id representing the reference to alarm details dashboard used by mobile application | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


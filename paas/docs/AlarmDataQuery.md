
# AlarmDataQuery

`org.thingsboard.client.model.AlarmDataQuery`

A JSON value representing the alarm data query. See API call notes above for more details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **entityFilter** | **EntityFilter** |  | [optional] |
| **keyFilters** | **List\<KeyFilter\>** |  | [optional] |
| **pageLink** | **AlarmDataPageLink** |  | [optional] |
| **entityFields** | **List\<EntityKey\>** |  | [optional] |
| **latestValues** | **List\<EntityKey\>** |  | [optional] |
| **alarmFields** | **List\<EntityKey\>** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


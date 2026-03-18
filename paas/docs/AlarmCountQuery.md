
# AlarmCountQuery

`org.thingsboard.client.model.AlarmCountQuery`

A JSON value representing the alarm count query.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **entityFilter** | **EntityFilter** |  | [optional] |
| **keyFilters** | **List\<KeyFilter\>** |  | [optional] |
| **startTs** | **Long** |  | [optional] |
| **endTs** | **Long** |  | [optional] |
| **timeWindow** | **Long** |  | [optional] |
| **typeList** | **List\<String\>** |  | [optional] |
| **statusList** | **List\<AlarmSearchStatus\>** |  | [optional] |
| **severityList** | **List\<AlarmSeverity\>** |  | [optional] |
| **searchPropagatedAlarms** | **Boolean** |  | [optional] |
| **assigneeId** | **UserId** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions



# AlarmConditionFilter

`org.thingsboard.client.model.AlarmConditionFilter`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **valueType** | **EntityKeyValueType** | String representation of the type of the value | [optional] |
| **key** | **AlarmConditionFilterKey** | JSON object for specifying alarm condition by specific key | [optional] |
| **predicate** | **KeyFilterPredicate** | JSON object representing filter condition | [optional] |
| **value** | **Object** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


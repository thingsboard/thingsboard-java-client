
# DataSource

`org.thingsboard.client.model.DataSource`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **type** | **DataSourceType** |  | [optional] |
| **deviceId** | **String** |  | [optional] |
| **entityAliasId** | **String** |  | [optional] |
| **filterId** | **String** |  | [optional] |
| **dataKeys** | **List\<DataKey\>** |  | [optional] |
| **latestDataKeys** | **List\<DataKey\>** |  | [optional] |
| **alarmFilterConfig** | **AlarmFilterConfig** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


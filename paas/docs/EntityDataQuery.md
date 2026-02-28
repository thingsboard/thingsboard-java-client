
# EntityDataQuery

`org.thingsboard.client.model.EntityDataQuery`

Entity data query to find entities. Page size is capped at 100.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **entityFilter** | **EntityFilter** |  | [optional] |
| **keyFilters** | **List\<KeyFilter\>** |  | [optional] |
| **pageLink** | **EntityDataPageLink** |  | [optional] |
| **entityFields** | **List\<EntityKey\>** |  | [optional] |
| **latestValues** | **List\<EntityKey\>** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


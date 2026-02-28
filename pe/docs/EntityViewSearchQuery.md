
# EntityViewSearchQuery

`org.thingsboard.client.model.EntityViewSearchQuery`

The entity view search query JSON

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **parameters** | **RelationsSearchParameters** | Main search parameters. | [optional] |
| **relationType** | **String** | Type of the relation between root entity and device (e.g. 'Contains' or 'Manages'). | [optional] |
| **entityViewTypes** | **List\<String\>** | Array of entity view types to filter the related entities (e.g. 'Temperature Sensor', 'Smoke Sensor'). | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


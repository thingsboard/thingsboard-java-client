
# EdgeSearchQuery

`org.thingsboard.client.model.EdgeSearchQuery`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **parameters** | **RelationsSearchParameters** | Main search parameters. | [optional] |
| **relationType** | **String** | Type of the relation between root entity and edge (e.g. 'Contains' or 'Manages'). | [optional] |
| **edgeTypes** | **List\<String\>** | Array of edge types to filter the related entities (e.g. 'Silos', 'Stores'). | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


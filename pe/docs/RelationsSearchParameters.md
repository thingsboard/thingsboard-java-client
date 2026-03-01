
# RelationsSearchParameters

`org.thingsboard.client.model.RelationsSearchParameters`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **rootId** | **UUID** | Root entity id to start search from. | [optional] |
| **rootType** | **EntityType** | Type of the root entity. | [optional] |
| **direction** | **EntitySearchDirection** | Type of the root entity. | [optional] |
| **relationTypeGroup** | **RelationTypeGroup** | Type of the relation. | [optional] |
| **maxLevel** | **Integer** | Maximum level of the search depth. | [optional] |
| **fetchLastLevelOnly** | **Boolean** | Fetch entities that match the last level of search. Useful to find Devices that are strictly 'maxLevel' relations away from the root entity. | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


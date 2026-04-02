
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



## Referenced Types

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (46 values total)

#### EntitySearchDirection (enum)
`FROM` | `TO`

#### RelationTypeGroup (enum)
`COMMON` | `DASHBOARD` | `FROM_ENTITY_GROUP` | `RULE_CHAIN` | `RULE_NODE` | `EDGE` | `EDGE_AUTO_ASSIGN_RULE_CHAIN`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


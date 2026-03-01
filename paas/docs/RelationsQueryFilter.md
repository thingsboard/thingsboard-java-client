
# RelationsQueryFilter

`org.thingsboard.client.model.RelationsQueryFilter`

**Extends:** **EntityFilter**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **rootEntity** | **AliasEntityId** |  | [optional] |
| **multiRootEntitiesType** | **EntityType** |  | [optional] |
| **multiRootEntityIds** | **Set\<String\>** |  | [optional] |
| **direction** | **EntitySearchDirection** |  | [optional] |
| **filters** | **List\<RelationEntityTypeFilter\>** |  | [optional] |
| **maxLevel** | **Integer** |  | [optional] |
| **fetchLastLevelOnly** | **Boolean** |  | [optional] |
| **negate** | **Boolean** |  | [optional] |
| **rootStateEntity** | **Boolean** |  | [optional] |
| **defaultStateEntity** | **AliasEntityId** |  | [optional] |
| **multiRoot** | **Boolean** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


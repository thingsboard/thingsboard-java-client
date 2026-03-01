
# EdgeSearchQueryFilter

`org.thingsboard.client.model.EdgeSearchQueryFilter`

**Extends:** **EntityFilter**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **rootEntity** | **AliasEntityId** |  | [optional] |
| **relationType** | **String** |  | [optional] |
| **direction** | **EntitySearchDirection** |  | [optional] |
| **maxLevel** | **Integer** |  | [optional] |
| **fetchLastLevelOnly** | **Boolean** |  | [optional] |
| **rootStateEntity** | **Boolean** |  | [optional] |
| **defaultStateEntity** | **AliasEntityId** |  | [optional] |
| **edgeTypes** | **List\<String\>** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


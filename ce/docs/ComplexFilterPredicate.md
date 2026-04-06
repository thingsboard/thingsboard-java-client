
# ComplexFilterPredicate

`org.thingsboard.client.model.ComplexFilterPredicate`

**Extends:** **KeyFilterPredicate**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **operation** | **ComplexOperation** |  | [optional] |
| **predicates** | **List\<KeyFilterPredicate\>** |  | [optional] |



## Referenced Types

#### KeyFilterPredicate
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### ComplexOperation (enum)
`AND` | `OR`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions



# RelationEntityTypeFilter

`org.thingsboard.client.model.RelationEntityTypeFilter`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **relationType** | **String** | Type of the relation between root entity and other entity (e.g. 'Contains' or 'Manages'). | [optional] |
| **entityTypes** | **List\<EntityType\>** | Array of entity types to filter the related entities (e.g. 'DEVICE', 'ASSET'). | [optional] |
| **negate** | **Boolean** | Negate relation type between root entity and other entity. | [optional] |



## Referenced Types

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `RULE_CHAIN` | `RULE_NODE` | `ENTITY_VIEW` | … (36 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


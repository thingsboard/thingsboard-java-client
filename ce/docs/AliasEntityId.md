
# AliasEntityId

`org.thingsboard.client.model.AliasEntityId`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **aliasEntityType** | **AliasEntityType** |  | [optional] |
| **entityType** | **EntityType** |  | |
| **id** | **UUID** | ID of the entity, time-based UUID v1 | |



## Referenced Types

#### AliasEntityType (enum)
`CURRENT_CUSTOMER` | `CURRENT_TENANT` | `CURRENT_USER` | `CURRENT_USER_OWNER`

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `RULE_CHAIN` | `RULE_NODE` | `ENTITY_VIEW` | … (36 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions



# EntityKey

`org.thingsboard.client.model.EntityKey`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **type** | **EntityKeyType** |  | [optional] |
| **key** | **String** |  | [optional] |



## Referenced Types

#### EntityKeyType (enum)
`ATTRIBUTE` | `CLIENT_ATTRIBUTE` | `SHARED_ATTRIBUTE` | `SERVER_ATTRIBUTE` | `TIME_SERIES` | `ENTITY_FIELD` | `ALARM_FIELD`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


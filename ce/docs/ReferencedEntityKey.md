
# ReferencedEntityKey

`org.thingsboard.client.model.ReferencedEntityKey`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **key** | **String** |  | [optional] |
| **type** | **ArgumentType** |  | [optional] |
| **scope** | **AttributeScope** |  | [optional] |



## Referenced Types

#### ArgumentType (enum)
`TS_LATEST` | `ATTRIBUTE` | `TS_ROLLING`

#### AttributeScope (enum)
`CLIENT_SCOPE` | `SERVER_SCOPE` | `SHARED_SCOPE`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


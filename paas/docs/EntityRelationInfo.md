
# EntityRelationInfo

`org.thingsboard.client.model.EntityRelationInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **from** | **EntityId** | JSON object with [from] Entity Id. | |
| **to** | **EntityId** | JSON object with [to] Entity Id. | |
| **type** | **String** | String value of relation type. | |
| **typeGroup** | **RelationTypeGroup** | Represents the type group of the relation. | |
| **version** | **Long** |  | [optional] |
| **additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional parameters of the relation. | [optional] |
| **fromName** | **String** | Name of the entity for [from] direction. | [optional] [readonly] |
| **toName** | **String** | Name of the entity for [to] direction. | [optional] [readonly] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


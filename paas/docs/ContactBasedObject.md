
# ContactBasedObject

`org.thingsboard.client.model.ContactBasedObject`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **Object** |  | [optional] |
| **createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| **country** | **String** |  | [optional] |
| **state** | **String** |  | [optional] |
| **city** | **String** |  | [optional] |
| **address** | **String** |  | [optional] |
| **address2** | **String** |  | [optional] |
| **zip** | **String** |  | [optional] |
| **phone** | **String** |  | [optional] |
| **email** | **String** |  | [optional] |
| **name** | **String** |  | [optional] |
| **additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


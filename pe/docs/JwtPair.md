
# JwtPair

`org.thingsboard.client.model.JwtPair`

JWT Pair

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **token** | **String** | The JWT Access Token. Used to perform API calls. | [optional] |
| **refreshToken** | **String** | The JWT Refresh Token. Used to get new JWT Access Token if old one has expired. | [optional] |
| **scope** | **Authority** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


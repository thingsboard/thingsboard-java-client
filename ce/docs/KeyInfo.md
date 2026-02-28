
# KeyInfo

`org.thingsboard.client.model.KeyInfo`

Key name with an optional sample value.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **key** | **String** | Key name. | |
| **sample** | **KeySample** | Most recent sample value for this key across the matched entities. Omitted when samples were not requested. | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


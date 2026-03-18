
# Palette

`org.thingsboard.client.model.Palette`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **type** | **String** | Name of the pre-defined palette, or 'custom' | |
| **_extends** | **String** | Pre-defined palette name that the custom palette extends | [optional] |
| **colors** | **Map\<String, String\>** | Mapping of hue identifier number to the rgb(a) color code | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


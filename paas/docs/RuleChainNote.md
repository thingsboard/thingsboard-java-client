
# RuleChainNote

`org.thingsboard.client.model.RuleChainNote`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **String** | Unique identifier of the note on the canvas | [optional] |
| **x** | **Integer** | Horizontal position of the note on the canvas, in pixels | [optional] |
| **y** | **Integer** | Vertical position of the note on the canvas, in pixels | [optional] |
| **width** | **Integer** | Width of the note, in pixels | [optional] |
| **height** | **Integer** | Height of the note, in pixels | [optional] |
| **content** | **String** | Markdown or HTML content of the note | [optional] |
| **backgroundColor** | **String** | Background color of the note in CSS hex format, e.g. '#FFF9C4' | [optional] |
| **borderColor** | **String** | Border color of the note in CSS hex format, e.g. '#E6C800' | [optional] |
| **borderWidth** | **Integer** | Border width of the note in pixels | [optional] |
| **applyDefaultMarkdownStyle** | **Boolean** | Whether to apply the default markdown stylesheet to the note content | [optional] |
| **markdownCss** | **String** | Custom CSS styles applied to the note content | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


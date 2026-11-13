
# Heading

`org.thingsboard.client.model.Heading`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **text** | **String** |  | [optional] |
| **font** | **Font** |  | [optional] |
| **color** | **String** |  | [optional] |
| **textAlignment** | **TextAlignment** |  | [optional] |
| **verticalAlignment** | **VerticalAlignment** |  | [optional] |
| **height** | **Integer** |  | [optional] |



## Referenced Types

#### Font
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| size | Float |  | [optional] |
| weight | FontWeight |  | [optional] |
| style | FontStyle |  | [optional] |
| family | String |  | [optional] |

#### TextAlignment (enum)
`CENTER` | `RIGHT` | `LEFT` | `JUSTIFY`

#### VerticalAlignment (enum)
`BOTTOM` | `TOP` | `MIDDLE`

#### FontWeight (enum)
`NORMAL` | `BOLD` | `_500`

#### FontStyle (enum)
`NORMAL` | `ITALIC`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions



# ColumnSettings

`org.thingsboard.client.model.ColumnSettings`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **columnWidth** | **String** |  | [optional] |
| **header** | **CellSettings** |  | [optional] |
| **cell** | **CellSettings** |  | [optional] |
| **type** | **DataKeySettingsType** | Data key settings type | |



## Referenced Types

#### CellSettings
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| font | Font |  | [optional] |
| color | String |  | [optional] |
| backgroundColor | String |  | [optional] |
| textAlignment | TextAlignment |  | [optional] |
| verticalAlignment | VerticalAlignment |  | [optional] |

#### DataKeySettingsType (enum)
`COLUMN` | `TIME_SERIES_CHART` | `DEFAULT`

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


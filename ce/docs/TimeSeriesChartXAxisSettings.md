
# TimeSeriesChartXAxisSettings

`org.thingsboard.client.model.TimeSeriesChartXAxisSettings`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **show** | **Boolean** |  | [optional] |
| **label** | **String** |  | [optional] |
| **labelFont** | **Font** |  | [optional] |
| **labelColor** | **String** |  | [optional] |
| **position** | **AxisPosition** |  | [optional] |
| **showTickLabels** | **Boolean** |  | [optional] |
| **tickLabelFont** | **Font** |  | [optional] |
| **tickLabelColor** | **String** |  | [optional] |
| **showTicks** | **Boolean** |  | [optional] |
| **ticksColor** | **String** |  | [optional] |
| **showLine** | **Boolean** |  | [optional] |
| **lineColor** | **String** |  | [optional] |
| **showSplitLines** | **Boolean** |  | [optional] |
| **splitLinesColor** | **String** |  | [optional] |
| **ticksFormat** | **Map\<String, String\>** |  | [optional] |



## Referenced Types

#### Font
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| size | Float |  | [optional] |
| weight | FontWeight |  | [optional] |
| style | FontStyle |  | [optional] |
| family | String |  | [optional] |

#### AxisPosition (enum)
`LEFT` | `RIGHT` | `TOP` | `BOTTOM`

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


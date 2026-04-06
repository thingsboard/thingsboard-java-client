
# ReportPieChartSettings

`org.thingsboard.client.model.ReportPieChartSettings`

**Extends:** **ReportLatestChartSettings**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **showLabel** | **Boolean** |  | [optional] |
| **labelPosition** | **PieChartLabelPosition** |  | [optional] |
| **labelFont** | **Font** |  | [optional] |
| **labelColor** | **String** |  | [optional] |
| **borderWidth** | **Float** |  | [optional] |
| **borderColor** | **String** |  | [optional] |
| **radius** | **Double** |  | [optional] |
| **clockwise** | **Boolean** |  | [optional] |



## Referenced Types

#### ReportLatestChartSettings
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| showTitle | Boolean |  | [optional] |
| title | String |  | [optional] |
| titleFont | Font |  | [optional] |
| titleColor | String |  | [optional] |
| titleAlignment | TextAlignment |  | [optional] |
| units | String |  | [optional] |
| decimals | Integer |  | [optional] |
| autoScale | Boolean |  | [optional] |
| sortSeries | Boolean |  | [optional] |
| showTotal | Boolean |  | [optional] |
| showLegend | Boolean |  | [optional] |
| legendPosition | LegendPosition |  | [optional] |
| legendLabelFont | Font |  | [optional] |
| legendLabelColor | String |  | [optional] |
| legendValueFont | Font |  | [optional] |
| legendValueColor | String |  | [optional] |
| legendShowTotal | Boolean |  | [optional] |

#### PieChartLabelPosition (enum)
`INSIDE` | `OUTSIDE`

#### Font
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| size | Float |  | [optional] |
| weight | FontWeight |  | [optional] |
| style | FontStyle |  | [optional] |
| family | String |  | [optional] |

#### TextAlignment (enum)
`CENTER` | `RIGHT` | `LEFT` | `JUSTIFY`

#### LegendPosition (enum)
`TOP` | `BOTTOM` | `LEFT` | `RIGHT`

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


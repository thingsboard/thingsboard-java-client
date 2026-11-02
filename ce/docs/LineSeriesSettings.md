
# LineSeriesSettings

`org.thingsboard.client.model.LineSeriesSettings`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **showLine** | **Boolean** |  | [optional] |
| **step** | **Boolean** |  | [optional] |
| **stepType** | **LineSeriesStepType** |  | [optional] |
| **smooth** | **Boolean** |  | [optional] |
| **lineType** | **ChartLineType** |  | [optional] |
| **lineWidth** | **Float** |  | [optional] |
| **showPoints** | **Boolean** |  | [optional] |
| **showPointLabel** | **Boolean** |  | [optional] |
| **pointLabelPosition** | **ChartLabelPosition** |  | [optional] |
| **pointLabelFont** | **Font** |  | [optional] |
| **pointLabelColor** | **String** |  | [optional] |
| **enablePointLabelBackground** | **Boolean** |  | [optional] |
| **pointLabelBackground** | **String** |  | [optional] |
| **pointShape** | **ChartShape** |  | [optional] |
| **pointSize** | **Float** |  | [optional] |
| **fillAreaSettings** | **ChartFillSettings** |  | [optional] |



## Referenced Types

#### LineSeriesStepType (enum)
`START` | `MIDDLE` | `END`

#### ChartLineType (enum)
`SOLID` | `DASHED` | `DOTTED`

#### ChartLabelPosition (enum)
`TOP` | `BOTTOM`

#### Font
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| size | Float |  | [optional] |
| weight | FontWeight |  | [optional] |
| style | FontStyle |  | [optional] |
| family | String |  | [optional] |

#### ChartShape (enum)
`EMPTY_CIRCLE` | `CIRCLE` | `RECT` | `ROUND_RECT` | `TRIANGLE` | `DIAMOND` | `PIN` | `ARROW` | `NONE`

#### ChartFillSettings
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | ChartFillType |  | [optional] |
| opacity | Float |  | [optional] |
| gradient | ChartFillSettingsGradient |  | [optional] |

#### FontWeight (enum)
`NORMAL` | `BOLD` | `_500`

#### FontStyle (enum)
`NORMAL` | `ITALIC`

#### ChartFillType (enum)
`NONE` | `OPACITY` | `GRADIENT`

#### ChartFillSettingsGradient
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| start | Float |  | [optional] |
| end | Float |  | [optional] |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


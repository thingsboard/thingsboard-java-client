
# BarSeriesSettings

`org.thingsboard.client.model.BarSeriesSettings`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **showBorder** | **Boolean** |  | [optional] |
| **borderWidth** | **Float** |  | [optional] |
| **borderRadius** | **Float** |  | [optional] |
| **barWidth** | **Double** |  | [optional] |
| **showLabel** | **Boolean** |  | [optional] |
| **labelPosition** | **ChartLabelPosition** |  | [optional] |
| **labelFont** | **Font** |  | [optional] |
| **labelColor** | **String** |  | [optional] |
| **enableLabelBackground** | **Boolean** |  | [optional] |
| **labelBackground** | **String** |  | [optional] |
| **backgroundSettings** | **ChartFillSettings** |  | [optional] |



## Referenced Types

#### ChartLabelPosition (enum)
`TOP` | `BOTTOM`

#### Font
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| size | Float |  | [optional] |
| weight | FontWeight |  | [optional] |
| style | FontStyle |  | [optional] |
| family | String |  | [optional] |

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



# TimeSeriesChartYAxisSettings

`org.thingsboard.client.model.TimeSeriesChartYAxisSettings`

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
| **id** | **String** |  | [optional] |
| **order** | **Integer** |  | [optional] |
| **units** | **String** |  | [optional] |
| **decimals** | **Integer** |  | [optional] |
| **interval** | **Double** |  | [optional] |
| **splitNumber** | **Integer** |  | [optional] |
| **min** | **SimpleValueSourceConfig** |  | [optional] |
| **max** | **SimpleValueSourceConfig** |  | [optional] |



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

#### SimpleValueSourceConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | ValueSourceType |  | [optional] |
| value | Double |  | [optional] |
| latestKeyType | String |  | [optional] |
| latestKey | String |  | [optional] |
| entityKeyType | String |  | [optional] |
| entityAlias | String |  | [optional] |
| entityKey | String |  | [optional] |

#### FontWeight (enum)
`NORMAL` | `BOLD` | `_500`

#### FontStyle (enum)
`NORMAL` | `ITALIC`

#### ValueSourceType (enum)
`CONSTANT` | `LATEST_KEY` | `ENTITY`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


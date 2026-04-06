
# AggMetric

`org.thingsboard.client.model.AggMetric`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **function** | **AggFunction** |  | [optional] |
| **filter** | **String** |  | [optional] |
| **input** | **AggInput** |  | [optional] |
| **defaultValue** | **Double** |  | [optional] |



## Referenced Types

#### AggFunction (enum)
`MIN` | `MAX` | `SUM` | `AVG` | `COUNT` | `COUNT_UNIQUE`

#### AggInput
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### AggFunctionInput  *(extends AggInput, type=`function`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| function | String |  | [optional] |

#### AggKeyInput  *(extends AggInput, type=`key`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| key | String |  | [optional] |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


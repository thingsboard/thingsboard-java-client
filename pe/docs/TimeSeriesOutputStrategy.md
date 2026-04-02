
# TimeSeriesOutputStrategy

`org.thingsboard.client.model.TimeSeriesOutputStrategy`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **type** | **String** |  | |



## Subtypes

#### TimeSeriesImmediateOutputStrategy  *(type=`IMMEDIATE`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| ttl | Long |  | [optional] |
| saveTimeSeries | Boolean |  | [optional] |
| saveLatest | Boolean |  | [optional] |
| sendWsUpdate | Boolean |  | [optional] |
| processCfs | Boolean |  | [optional] |

#### TimeSeriesRuleChainOutputStrategy  *(type=`RULE_CHAIN`)*
*(no additional properties)*

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions



# TimeSeriesImmediateOutputStrategy

`org.thingsboard.client.model.TimeSeriesImmediateOutputStrategy`

**Extends:** **TimeSeriesOutputStrategy**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **ttl** | **Long** |  | [optional] |
| **saveTimeSeries** | **Boolean** |  | [optional] |
| **saveLatest** | **Boolean** |  | [optional] |
| **sendWsUpdate** | **Boolean** |  | [optional] |
| **processCfs** | **Boolean** |  | [optional] |



## Referenced Types

#### TimeSeriesOutputStrategy
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### TimeSeriesRuleChainOutputStrategy  *(extends TimeSeriesOutputStrategy, type=`RULE_CHAIN`)*
*See TimeSeriesOutputStrategy for properties.*

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


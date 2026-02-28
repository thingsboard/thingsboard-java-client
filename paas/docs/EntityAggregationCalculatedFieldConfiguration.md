
# EntityAggregationCalculatedFieldConfiguration

`org.thingsboard.client.model.EntityAggregationCalculatedFieldConfiguration`

**Extends:** **CalculatedFieldConfiguration**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **arguments** | **Map\<String, Argument\>** |  | |
| **metrics** | **Map\<String, AggMetric\>** |  | |
| **interval** | **AggInterval** |  | |
| **watermark** | **Watermark** |  | [optional] |
| **produceIntermediateResult** | **Boolean** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


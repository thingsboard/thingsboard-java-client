
# EntityAggregationCalculatedFieldConfiguration

`org.thingsboard.client.model.EntityAggregationCalculatedFieldConfiguration`

**Extends:** **CalculatedFieldConfiguration**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **arguments** | **Map\<String, Argument\>** |  | |
| **interval** | **AggInterval** |  | |
| **metrics** | **Map\<String, AggMetric\>** |  | |
| **produceIntermediateResult** | **Boolean** |  | [optional] |
| **watermark** | **Watermark** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


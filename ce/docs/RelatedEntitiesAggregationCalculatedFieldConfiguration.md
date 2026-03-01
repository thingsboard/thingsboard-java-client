
# RelatedEntitiesAggregationCalculatedFieldConfiguration

`org.thingsboard.client.model.RelatedEntitiesAggregationCalculatedFieldConfiguration`

**Extends:** **CalculatedFieldConfiguration**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **relation** | **RelationPathLevel** |  | |
| **arguments** | **Map\<String, Argument\>** |  | |
| **deduplicationIntervalInSec** | **Long** |  | [optional] |
| **metrics** | **Map\<String, AggMetric\>** |  | |
| **useLatestTs** | **Boolean** |  | [optional] |
| **scheduledUpdateInterval** | **Integer** |  | [optional] |
| **scheduledUpdateEnabled** | **Boolean** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


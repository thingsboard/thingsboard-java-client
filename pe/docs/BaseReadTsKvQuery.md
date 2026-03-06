
# BaseReadTsKvQuery

`org.thingsboard.client.model.BaseReadTsKvQuery`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **Integer** |  | [optional] |
| **key** | **String** |  | [optional] |
| **startTs** | **Long** |  | [optional] |
| **endTs** | **Long** |  | [optional] |
| **aggParameters** | **AggregationParams** |  | [optional] |
| **limit** | **Integer** |  | [optional] |
| **order** | **String** |  | [optional] |
| **interval** | **Long** |  | [optional] |
| **aggregation** | **Aggregation** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


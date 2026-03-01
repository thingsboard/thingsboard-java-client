
# EntityData

`org.thingsboard.client.model.EntityData`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **entityId** | **EntityId** |  | [optional] |
| **latest** | **Map\<String, Map<String, TsValue>\>** |  | [optional] |
| **timeseries** | **Map\<String, List<TsValue>\>** |  | [optional] |
| **aggLatest** | **Map\<String, ComparisonTsValue\>** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


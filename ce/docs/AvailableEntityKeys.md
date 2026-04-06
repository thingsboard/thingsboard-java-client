
# AvailableEntityKeys

`org.thingsboard.client.model.AvailableEntityKeys`

Contains unique time series and attribute key names discovered from entities matching a query. Used primarily for UI hints such as autocomplete suggestions.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **entityTypes** | **Set\<EntityType\>** | Set of entity types found among the matched entities. | |
| **timeseries** | **Set\<String\>** |  | |
| **attribute** | **Set\<String\>** |  | |



## Referenced Types

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `RULE_CHAIN` | `RULE_NODE` | `ENTITY_VIEW` | … (36 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions



# SimpleValueSourceConfig

`org.thingsboard.client.model.SimpleValueSourceConfig`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **type** | **ValueSourceType** |  | [optional] |
| **value** | **Double** |  | [optional] |
| **latestKeyType** | **String** |  | [optional] |
| **latestKey** | **String** |  | [optional] |
| **entityKeyType** | **String** |  | [optional] |
| **entityAlias** | **String** |  | [optional] |
| **entityKey** | **String** |  | [optional] |



## Referenced Types

#### ValueSourceType (enum)
`CONSTANT` | `LATEST_KEY` | `ENTITY`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


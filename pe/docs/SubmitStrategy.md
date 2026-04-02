
# SubmitStrategy

`org.thingsboard.client.model.SubmitStrategy`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **type** | **SubmitStrategyType** |  | [optional] |
| **batchSize** | **Integer** |  | [optional] |



## Referenced Types

#### SubmitStrategyType (enum)
`BURST` | `BATCH` | `SEQUENTIAL_BY_ORIGINATOR` | `SEQUENTIAL_BY_TENANT` | `SEQUENTIAL`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


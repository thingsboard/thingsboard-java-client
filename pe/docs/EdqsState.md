
# EdqsState

`org.thingsboard.client.model.EdqsState`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **edqsReady** | **Boolean** |  | [optional] |
| **syncStatus** | **EdqsSyncStatus** |  | [optional] |
| **apiMode** | **EdqsApiMode** |  | [optional] |



## Referenced Types

#### EdqsSyncStatus (enum)
`REQUESTED` | `STARTED` | `FINISHED` | `FAILED`

#### EdqsApiMode (enum)
`ENABLED` | `AUTO_ENABLED` | `DISABLED` | `AUTO_DISABLED`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


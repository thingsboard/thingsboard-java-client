
# Button

`org.thingsboard.client.model.Button`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **enabled** | **Boolean** |  | [optional] |
| **text** | **String** |  | [optional] |
| **linkType** | **LinkType** |  | [optional] |
| **link** | **String** |  | [optional] |
| **dashboardId** | **UUID** |  | [optional] |
| **dashboardState** | **String** |  | [optional] |
| **setEntityIdInState** | **Boolean** |  | [optional] |



## Referenced Types

#### LinkType (enum)
`LINK` | `DASHBOARD`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


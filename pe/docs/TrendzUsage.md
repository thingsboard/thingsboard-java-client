
# TrendzUsage

`org.thingsboard.client.model.TrendzUsage`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **used** | **Boolean** |  | [optional] |
| **anomalyUsage** | **Entity** |  | [optional] |
| **predictionUsage** | **Entity** |  | [optional] |
| **calculationUsage** | **Entity** |  | [optional] |
| **viewUsage** | **SimpleEntity** |  | [optional] |
| **metricUsage** | **SimpleEntity** |  | [optional] |
| **chatUsage** | **SimpleEntity** |  | [optional] |



## Referenced Types

#### Entity
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| used | Boolean |  | [optional] |
| activeCount | Long |  | [optional] |
| totalCount | Long |  | [optional] |

#### SimpleEntity
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| used | Boolean |  | [optional] |
| totalCount | Long |  | [optional] |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


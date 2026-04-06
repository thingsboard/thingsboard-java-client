
# OllamaProviderConfig

`org.thingsboard.client.model.OllamaProviderConfig`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **baseUrl** | **String** |  | |
| **auth** | **OllamaAuth** |  | |



## Referenced Types

#### OllamaAuth
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### Basic  *(extends OllamaAuth, type=`BASIC`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| username | String |  |  |
| password | String |  |  |

#### None  *(extends OllamaAuth, type=`NONE`)*
*See OllamaAuth for properties.*

#### Token  *(extends OllamaAuth, type=`TOKEN`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| token | String |  |  |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


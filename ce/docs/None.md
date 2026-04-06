
# None

`org.thingsboard.client.model.None`

**Extends:** **OllamaAuth**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|



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


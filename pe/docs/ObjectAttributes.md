
# ObjectAttributes

`org.thingsboard.client.model.ObjectAttributes`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **dim** | **Long** |  | [optional] |
| **ssid** | **Long** |  | [optional] |
| **uri** | **String** |  | [optional] |
| **ver** | **Object** |  | [optional] |
| **lwm2m** | **LwM2mVersion** |  | [optional] |
| **pmin** | **Long** |  | [optional] |
| **pmax** | **Long** |  | [optional] |
| **gt** | **Double** |  | [optional] |
| **lt** | **Double** |  | [optional] |
| **st** | **Double** |  | [optional] |
| **epmin** | **Long** |  | [optional] |
| **epmax** | **Long** |  | [optional] |



## Referenced Types

#### LwM2mVersion
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| supported | Boolean |  | [optional] |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


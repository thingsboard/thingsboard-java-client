
# LwM2mObject

`org.thingsboard.client.model.LwM2mObject`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **Integer** | LwM2M Object id. | [optional] |
| **keyId** | **String** | LwM2M Object key id. | [optional] |
| **name** | **String** | LwM2M Object name. | [optional] |
| **multiple** | **Boolean** | LwM2M Object multiple. | [optional] |
| **mandatory** | **Boolean** | LwM2M Object mandatory. | [optional] |
| **instances** | **List\<LwM2mInstance\>** | LwM2M Object instances. | [optional] |



## Referenced Types

#### LwM2mInstance
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | Integer | LwM2M Instance id. | [optional] |
| resources | List<LwM2mResourceObserve> | LwM2M Resource observe. | [optional] |

#### LwM2mResourceObserve
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | Integer | LwM2M Resource Observe id. | [optional] |
| name | String | LwM2M Resource Observe name. | [optional] |
| observe | Boolean | LwM2M Resource Observe observe. | [optional] |
| attribute | Boolean | LwM2M Resource Observe attribute. | [optional] |
| telemetry | Boolean | LwM2M Resource Observe telemetry. | [optional] |
| keyName | String | LwM2M Resource Observe key name. | [optional] |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


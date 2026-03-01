
# DeviceSearchQuery

`org.thingsboard.client.model.DeviceSearchQuery`

The device search query JSON

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **parameters** | **RelationsSearchParameters** | Main search parameters. | [optional] |
| **relationType** | **String** | Type of the relation between root entity and device (e.g. 'Contains' or 'Manages'). | [optional] |
| **deviceTypes** | **List\<String\>** | Array of device types to filter the related entities (e.g. 'Temperature Sensor', 'Smoke Sensor'). | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


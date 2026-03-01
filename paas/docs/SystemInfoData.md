
# SystemInfoData

`org.thingsboard.client.model.SystemInfoData`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **serviceId** | **String** | Service Id. | [optional] |
| **serviceType** | **String** | Service type. | [optional] |
| **cpuUsage** | **Long** | CPU usage, in percent. | [optional] |
| **cpuCount** | **Long** | Total CPU usage. | [optional] |
| **memoryUsage** | **Long** | Memory usage, in percent. | [optional] |
| **totalMemory** | **Long** | Total memory in bytes. | [optional] |
| **discUsage** | **Long** | Disk usage, in percent. | [optional] |
| **totalDiscSpace** | **Long** | Total disc space in bytes. | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


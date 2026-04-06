
# TelemetryEntityView

`org.thingsboard.client.model.TelemetryEntityView`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **timeseries** | **List\<String\>** | List of time-series data keys to expose | |
| **attributes** | **AttributesEntityView** | JSON object with attributes to expose | |



## Referenced Types

#### AttributesEntityView
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| cs | List<String> | List of client-side attribute keys to expose |  |
| ss | List<String> | List of server-side attribute keys to expose |  |
| sh | List<String> | List of shared attribute keys to expose |  |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


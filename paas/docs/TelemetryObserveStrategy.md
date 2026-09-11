
# TelemetryObserveStrategy

`org.thingsboard.client.model.TelemetryObserveStrategy`

Observation strategy for telemetry. SINGLE (0): one resource equals one single observe request. COMPOSITE_ALL (1): all resources in one composite observe request. COMPOSITE_BY_OBJECT (2): grouped composite observe requests by object.

## Enum Values


* `SINGLE` (value: `"SINGLE"`)

* `COMPOSITE_ALL` (value: `"COMPOSITE_ALL"`)

* `COMPOSITE_BY_OBJECT` (value: `"COMPOSITE_BY_OBJECT"`)



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


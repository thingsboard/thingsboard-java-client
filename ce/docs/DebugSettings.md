
# DebugSettings

`org.thingsboard.client.model.DebugSettings`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **failuresEnabled** | **Boolean** | Debug failures.  | [optional] |
| **allEnabled** | **Boolean** | Debug All. Used as a trigger for updating debugAllUntil. | [optional] |
| **allEnabledUntil** | **Long** | Timestamp of the end time for the processing debug events. | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


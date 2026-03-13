
# ZoneGroupConfiguration

`org.thingsboard.client.model.ZoneGroupConfiguration`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **refEntityId** | **EntityId** |  | [optional] |
| **refDynamicSourceConfiguration** | **CfArgumentDynamicSourceConfiguration** |  | [optional] |
| **perimeterKeyName** | **String** |  | |
| **reportStrategy** | **GeofencingReportStrategy** |  | |
| **createRelationsWithMatchedZones** | **Boolean** |  | [optional] |
| **relationType** | **String** |  | [optional] |
| **direction** | **EntitySearchDirection** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


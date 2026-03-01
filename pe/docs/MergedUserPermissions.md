
# MergedUserPermissions

`org.thingsboard.client.model.MergedUserPermissions`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **genericPermissions** | **Map\<String, Set<Operation>\>** | Map of permissions defined using generic roles ('Customer Administrator', etc) | [optional] |
| **groupPermissions** | **Map\<String, MergedGroupPermissionInfo\>** | Map of permissions defined using group roles ('Read' or 'Write' access to specific entity group, etc) | [optional] |
| **readGroupPermissions** | **Map\<String, MergedGroupTypePermissionInfo\>** | Map of read permissions per entity type. Used on the UI to enable/disable certain components. | [optional] |
| **readEntityPermissions** | **Map\<String, MergedGroupTypePermissionInfo\>** | Map of read permissions per resource. Used on the UI to enable/disable certain components. | [optional] |
| **readAttrPermissions** | **Map\<String, MergedGroupTypePermissionInfo\>** | Map of read entity attributes permissions per resource. Used on the UI to enable/disable certain tabs. | [optional] |
| **readTsPermissions** | **Map\<String, MergedGroupTypePermissionInfo\>** | Map of read entity time-series permissions per resource. Used on the UI to enable/disable certain tabs. | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions



# HomeMenuItem

`org.thingsboard.client.model.HomeMenuItem`

**Extends:** **MenuItem**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **String** | Unique identifier for predefined menu items | [optional] [readonly] |
| **name** | **String** | Name of the menu item | [optional] |
| **icon** | **String** | URL of the menu item icon. Overrides 'materialIcon' | [optional] |
| **pages** | **List\<DefaultMenuItem\>** | List of child menu items | [optional] |
| **homeType** | **HomeMenuItemType** | DEFAULT or DASHBOARD. DASHBOARD means default home page presentation changed to refer to dashboard | [optional] |
| **dashboardId** | **String** | Id of the Dashboard to open, when user clicks the menu item | [optional] |
| **hideDashboardToolbar** | **Boolean** | Hide the dashboard toolbar | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


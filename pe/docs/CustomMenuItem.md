
# CustomMenuItem

`org.thingsboard.client.model.CustomMenuItem`

**Extends:** **MenuItem**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **name** | **String** | Name of the menu item | |
| **icon** | **String** | URL of the menu item icon. Overrides 'materialIcon' | [optional] |
| **menuItemType** | **CMItemType** | Type of menu item (LINK or SECTION). LINK type means item has no child items, SECTION type should have at least one child | |
| **linkType** | **CMItemLinkType** | Type of menu item (URL or DASHBOARD) | [optional] |
| **dashboardId** | **String** | Id of the Dashboard to open, when user clicks the menu item | [optional] |
| **hideDashboardToolbar** | **Boolean** | Hide the dashboard toolbar | [optional] |
| **url** | **String** | URL to open in the iframe, when user clicks the menu item | [optional] |
| **setAccessToken** | **Boolean** | Set the access token of the current user to a new dashboard | [optional] |
| **pages** | **List\<CustomMenuItem\>** | List of child menu items | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


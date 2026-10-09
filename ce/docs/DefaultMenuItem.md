
# DefaultMenuItem

`org.thingsboard.client.model.DefaultMenuItem`

**Extends:** **MenuItem**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **String** | Unique identifier for predefined menu items | [optional] [readonly] |
| **name** | **String** | Name of the menu item | [optional] |
| **icon** | **String** | URL of the menu item icon. Overrides 'materialIcon' | [optional] |
| **visible** | **Boolean** | Mark if menu item is visible for user | [optional] |
| **pages** | **List\<DefaultMenuItem\>** | List of child menu items | [optional] |



## Referenced Types

#### MenuItem
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | MenuItemType | Menu item type |  |
| visible | Boolean |  | [optional] |

#### MenuItemType (enum)
`HOME` | `DEFAULT` | `CUSTOM`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


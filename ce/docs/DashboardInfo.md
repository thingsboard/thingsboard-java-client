
# DashboardInfo

`org.thingsboard.client.model.DashboardInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **DashboardId** | JSON object with the dashboard Id. Specify existing dashboard Id to update the dashboard. Referencing non-existing dashboard id will cause error. Omit this field to create new dashboard. | [optional] |
| **createdTime** | **Long** | Timestamp of the dashboard creation, in milliseconds | [optional] [readonly] |
| **tenantId** | **TenantId** | JSON object with Tenant Id. Tenant Id of the dashboard can't be changed. | [optional] [readonly] |
| **title** | **String** | Title of the dashboard. | |
| **image** | **String** | Thumbnail picture for rendering of the dashboards in a grid view on mobile devices. | [optional] [readonly] |
| **assignedCustomers** | **Set\<ShortCustomerInfo\>** | List of assigned customers with their info. | [optional] |
| **mobileHide** | **Boolean** | Hide dashboard from mobile devices. Useful if the dashboard is not designed for small screens. | [optional] [readonly] |
| **mobileOrder** | **Integer** | Order on mobile devices. Useful to adjust sorting of the dashboards for mobile applications | [optional] [readonly] |
| **version** | **Long** |  | [optional] |
| **name** | **String** | Same as title of the dashboard. Read-only field. Update the 'title' to change the 'name' of the dashboard. | [optional] [readonly] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


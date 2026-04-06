
# HomeDashboard

`org.thingsboard.client.model.HomeDashboard`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **DashboardId** | JSON object with the dashboard Id. Specify existing dashboard Id to update the dashboard. Referencing non-existing dashboard id will cause error. Omit this field to create new dashboard. | [optional] |
| **createdTime** | **Long** | Timestamp of the dashboard creation, in milliseconds | [optional] [readonly] |
| **tenantId** | **TenantId** | JSON object with Tenant Id. Tenant Id of the dashboard can't be changed. | [optional] [readonly] |
| **title** | **String** | Title of the dashboard. | |
| **name** | **String** | Same as title of the dashboard. Read-only field. Update the 'title' to change the 'name' of the dashboard. | [optional] [readonly] |
| **image** | **String** | Thumbnail picture for rendering of the dashboards in a grid view on mobile devices. | [optional] [readonly] |
| **mobileHide** | **Boolean** | Hide dashboard from mobile devices. Useful if the dashboard is not designed for small screens. | [optional] [readonly] |
| **mobileOrder** | **Integer** | Order on mobile devices. Useful to adjust sorting of the dashboards for mobile applications | [optional] [readonly] |
| **assignedCustomers** | **Set\<ShortCustomerInfo\>** | List of assigned customers with their info. | [optional] |
| **_configuration** | **com.fasterxml.jackson.databind.JsonNode** | JSON object with main configuration of the dashboard: layouts, widgets, aliases, etc. The JSON structure of the dashboard configuration is quite complex. The easiest way to learn it is to export existing dashboard to JSON. | [optional] |
| **resources** | **List\<ResourceExportData\>** |  | [optional] |
| **version** | **Long** |  | [optional] |
| **hideDashboardToolbar** | **Boolean** | Hide dashboard toolbar flag. Useful for rendering dashboards on mobile. | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


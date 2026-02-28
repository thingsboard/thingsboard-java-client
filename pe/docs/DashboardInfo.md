
# DashboardInfo

`org.thingsboard.client.model.DashboardInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **title** | **String** | Title of the dashboard. | [optional] |
| **image** | **String** | Thumbnail picture for rendering of the dashboards in a grid view on mobile devices. | [optional] [readonly] |
| **mobileHide** | **Boolean** | Hide dashboard from mobile devices. Useful if the dashboard is not designed for small screens. | [optional] [readonly] |
| **mobileOrder** | **Integer** | Order on mobile devices. Useful to adjust sorting of the dashboards for mobile applications | [optional] [readonly] |
| **_configuration** | **com.fasterxml.jackson.databind.JsonNode** |  | [optional] |
| **name** | **String** | Same as title of the dashboard. Read-only field. Update the 'title' to change the 'name' of the dashboard. | [optional] [readonly] |
| **resources** | **List\<ResourceExportData\>** |  | [optional] |
| **id** | **DashboardId** | JSON object with the dashboard Id. Specify existing dashboard Id to update the dashboard. Referencing non-existing dashboard id will cause error. Omit this field to create new dashboard. | [optional] |
| **createdTime** | **Long** | Timestamp of the dashboard creation, in milliseconds | [optional] [readonly] |
| **tenantId** | **TenantId** | JSON object with Tenant Id. Tenant Id of the dashboard can't be changed. | [optional] [readonly] |
| **customerId** | **CustomerId** | JSON object with Customer Id.  | [optional] |
| **assignedCustomers** | **Set\<ShortCustomerInfo\>** | List of assigned customers with their info. | [optional] |
| **version** | **Long** |  | [optional] |
| **ownerName** | **String** | Owner name | [optional] [readonly] |
| **groups** | **List\<EntityInfo\>** | Groups | [optional] |
| **ownerId** | **EntityId** | JSON object with Customer or Tenant Id | [optional] [readonly] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


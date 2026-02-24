

# Dashboard


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | Title of the dashboard. |  |
|**image** | **String** | Thumbnail picture for rendering of the dashboards in a grid view on mobile devices. |  [optional] [readonly] |
|**mobileHide** | **Boolean** | Hide dashboard from mobile devices. Useful if the dashboard is not designed for small screens. |  [optional] [readonly] |
|**mobileOrder** | **Integer** | Order on mobile devices. Useful to adjust sorting of the dashboards for mobile applications |  [optional] [readonly] |
|**_configuration** | **com.fasterxml.jackson.databind.JsonNode** | JSON object with main configuration of the dashboard: layouts, widgets, aliases, etc. The JSON structure of the dashboard configuration is quite complex. The easiest way to learn it is to export existing dashboard to JSON. |  [optional] |
|**name** | **String** | Same as title of the dashboard. Read-only field. Update the &#39;title&#39; to change the &#39;name&#39; of the dashboard. |  [optional] [readonly] |
|**resources** | [**List&lt;ResourceExportData&gt;**](ResourceExportData.md) |  |  [optional] |
|**id** | [**DashboardId**](DashboardId.md) | JSON object with the dashboard Id. Specify existing dashboard Id to update the dashboard. Referencing non-existing dashboard id will cause error. Omit this field to create new dashboard. |  [optional] |
|**createdTime** | **Long** | Timestamp of the dashboard creation, in milliseconds |  [optional] [readonly] |
|**tenantId** | [**TenantId**](TenantId.md) | JSON object with Tenant Id. Tenant Id of the dashboard can&#39;t be changed. |  [optional] [readonly] |
|**assignedCustomers** | [**Set&lt;ShortCustomerInfo&gt;**](ShortCustomerInfo.md) | List of assigned customers with their info. |  [optional] |
|**version** | **Long** |  |  [optional] |




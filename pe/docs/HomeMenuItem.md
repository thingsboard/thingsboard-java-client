

# HomeMenuItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for predefined menu items |  [optional] [readonly] |
|**name** | **String** | Name of the menu item |  [optional] |
|**icon** | **String** | URL of the menu item icon. Overrides &#39;materialIcon&#39; |  [optional] |
|**visible** | **Boolean** | Mark if menu item is visible for user |  [optional] |
|**pages** | [**List&lt;DefaultMenuItem&gt;**](DefaultMenuItem.md) | List of child menu items |  [optional] |
|**homeType** | **HomeMenuItemType** | DEFAULT or DASHBOARD. DASHBOARD means default home page presentation changed to refer to dashboard |  [optional] |
|**dashboardId** | **String** | Id of the Dashboard to open, when user clicks the menu item |  [optional] |
|**hideDashboardToolbar** | **Boolean** | Hide the dashboard toolbar |  [optional] |




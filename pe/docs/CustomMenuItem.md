

# CustomMenuItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the menu item |  |
|**icon** | **String** | URL of the menu item icon. Overrides &#39;materialIcon&#39; |  [optional] |
|**menuItemType** | **CMItemType** | Type of menu item (LINK or SECTION). LINK type means item has no child items, SECTION type should have at least one child |  |
|**linkType** | **CMItemLinkType** | Type of menu item (URL or DASHBOARD) |  [optional] |
|**dashboardId** | **String** | Id of the Dashboard to open, when user clicks the menu item |  [optional] |
|**hideDashboardToolbar** | **Boolean** | Hide the dashboard toolbar |  [optional] |
|**url** | **String** | URL to open in the iframe, when user clicks the menu item |  [optional] |
|**setAccessToken** | **Boolean** | Set the access token of the current user to a new dashboard |  [optional] |
|**visible** | **Boolean** | Mark if menu item is visible for user |  [optional] |
|**pages** | [**List&lt;CustomMenuItem&gt;**](CustomMenuItem.md) | List of child menu items |  [optional] |






# WidgetTypeInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**WidgetTypeId**](WidgetTypeId.md) | JSON object with the Widget Type Id. Specify this field to update the Widget Type. Referencing non-existing Widget Type Id will cause error. Omit this field to create new Widget Type. |  [optional] |
|**createdTime** | **Long** | Timestamp of the Widget Type creation, in milliseconds |  [optional] [readonly] |
|**tenantId** | [**TenantId**](TenantId.md) | JSON object with Tenant Id. |  [optional] [readonly] |
|**fqn** | **String** | Unique FQN that is used in dashboards as a reference widget type |  [optional] [readonly] |
|**name** | **String** | Widget name used in search and UI |  [optional] [readonly] |
|**deprecated** | **Boolean** | Whether widget type is deprecated. |  [optional] |
|**scada** | **Boolean** | Whether widget type is SCADA symbol. |  [optional] |
|**version** | **Long** |  |  [optional] |
|**image** | **String** | Base64 encoded widget thumbnail |  [optional] [readonly] |
|**description** | **String** | Description of the widget type |  [optional] [readonly] |
|**tags** | **List&lt;String&gt;** | Tags of the widget type |  [optional] |
|**widgetType** | **String** | Type of the widget (timeseries, latest, control, alarm or static) |  [optional] [readonly] |
|**bundles** | [**List&lt;WidgetBundleInfo&gt;**](WidgetBundleInfo.md) | Bundles |  [optional] |




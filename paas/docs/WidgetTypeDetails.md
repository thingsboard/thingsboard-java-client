

# WidgetTypeDetails

A JSON value representing the Widget Type Details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fqn** | **String** | Unique FQN that is used in dashboards as a reference widget type |  [optional] [readonly] |
|**name** | **String** | Widget name used in search and UI |  [optional] [readonly] |
|**deprecated** | **Boolean** | Whether widget type is deprecated. |  [optional] |
|**image** | **String** | Relative or external image URL. Replaced with image data URL (Base64) in case of relative URL and &#39;inlineImages&#39; option enabled. |  [optional] |
|**description** | **String** | Description of the widget |  [optional] |
|**descriptor** | **com.fasterxml.jackson.databind.JsonNode** | Complex JSON object that describes the widget type |  [optional] [readonly] |
|**resources** | [**List&lt;ResourceExportData&gt;**](ResourceExportData.md) |  |  [optional] |
|**id** | [**WidgetTypeId**](WidgetTypeId.md) | JSON object with the Widget Type Id. Specify this field to update the Widget Type. Referencing non-existing Widget Type Id will cause error. Omit this field to create new Widget Type. |  [optional] |
|**createdTime** | **Long** | Timestamp of the Widget Type creation, in milliseconds |  [optional] [readonly] |
|**tenantId** | [**TenantId**](TenantId.md) | JSON object with Tenant Id. |  [optional] [readonly] |
|**scada** | **Boolean** | Whether widget type is SCADA symbol. |  [optional] |
|**version** | **Long** |  |  [optional] |
|**tags** | **List&lt;String&gt;** | Tags of the widget type |  [optional] |




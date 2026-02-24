

# WidgetsBundle

A JSON value representing the Widget Bundle.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**WidgetsBundleId**](WidgetsBundleId.md) | JSON object with the Widget Bundle Id. Specify this field to update the Widget Bundle. Referencing non-existing Widget Bundle Id will cause error. Omit this field to create new Widget Bundle. |  [optional] |
|**createdTime** | **Long** | Timestamp of the Widget Bundle creation, in milliseconds |  [optional] [readonly] |
|**tenantId** | [**TenantId**](TenantId.md) | JSON object with Tenant Id. |  [optional] [readonly] |
|**alias** | **String** | Unique alias that is used in widget types as a reference widget bundle |  [optional] [readonly] |
|**title** | **String** | Title used in search and UI |  [optional] [readonly] |
|**image** | **String** | Relative or external image URL. Replaced with image data URL (Base64) in case of relative URL and &#39;inlineImages&#39; option enabled. |  [optional] [readonly] |
|**scada** | **Boolean** | Whether widgets bundle contains SCADA symbol widget types. |  [optional] [readonly] |
|**description** | **String** | Description |  [optional] [readonly] |
|**order** | **Integer** | Order |  [optional] [readonly] |
|**version** | **Long** |  |  [optional] |
|**name** | **String** | Same as title of the Widget Bundle. Read-only field. Update the &#39;title&#39; to change the &#39;name&#39; of the Widget Bundle. |  [optional] [readonly] |




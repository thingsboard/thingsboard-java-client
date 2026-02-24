

# AdminSettings

A JSON value representing the Mail Settings.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**AdminSettingsId**](AdminSettingsId.md) | The Id of the Administration Settings, auto-generated, UUID |  [optional] |
|**createdTime** | **Long** | Timestamp of the settings creation, in milliseconds |  [optional] [readonly] |
|**tenantId** | [**TenantId**](TenantId.md) | JSON object with Tenant Id. |  [optional] [readonly] |
|**key** | **String** | The Administration Settings key, (e.g. &#39;general&#39; or &#39;mail&#39;) |  [optional] |
|**jsonValue** | **com.fasterxml.jackson.databind.JsonNode** | JSON representation of the Administration Settings value |  [optional] |




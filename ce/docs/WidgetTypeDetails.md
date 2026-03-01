
# WidgetTypeDetails

`org.thingsboard.client.model.WidgetTypeDetails`

A JSON value representing the Widget Type Details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **fqn** | **String** | Unique FQN that is used in dashboards as a reference widget type | [optional] [readonly] |
| **name** | **String** | Widget name used in search and UI | [optional] [readonly] |
| **deprecated** | **Boolean** | Whether widget type is deprecated. | [optional] |
| **image** | **String** | Relative or external image URL. Replaced with image data URL (Base64) in case of relative URL and 'inlineImages' option enabled. | [optional] |
| **description** | **String** | Description of the widget | [optional] |
| **descriptor** | **com.fasterxml.jackson.databind.JsonNode** | Complex JSON object that describes the widget type | [optional] [readonly] |
| **resources** | **List\<ResourceExportData\>** |  | [optional] |
| **id** | **WidgetTypeId** | JSON object with the Widget Type Id. Specify this field to update the Widget Type. Referencing non-existing Widget Type Id will cause error. Omit this field to create new Widget Type. | [optional] |
| **createdTime** | **Long** | Timestamp of the Widget Type creation, in milliseconds | [optional] [readonly] |
| **tenantId** | **TenantId** | JSON object with Tenant Id. | [optional] [readonly] |
| **scada** | **Boolean** | Whether widget type is SCADA symbol. | [optional] |
| **version** | **Long** |  | [optional] |
| **tags** | **List\<String\>** | Tags of the widget type | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


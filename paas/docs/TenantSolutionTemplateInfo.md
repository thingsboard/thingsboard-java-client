
# TenantSolutionTemplateInfo

`org.thingsboard.client.model.TenantSolutionTemplateInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **String** | ID of the solution template | [optional] |
| **title** | **String** | Template Title | [optional] |
| **level** | **SolutionTemplateLevel** | Level of the subscription that is required to unlock the template | [optional] |
| **installTimeoutMs** | **Long** | Timeout for the installation UI to wait while template is installing | [optional] |
| **tenantTelemetryKeys** | **List\<String\>** | What keys to delete during template uninstall | [optional] |
| **tenantAttributeKeys** | **List\<String\>** | What attributes to delete during template uninstall | [optional] |
| **previewImageUrl** | **String** | URL of the preview image | [optional] |
| **videoPreviewImageUrl** | **String** | Video preview image URL | [optional] |
| **previewMp4Url** | **String** | Video MP4 URL | [optional] |
| **previewWebmUrl** | **String** | Video WEBM URL | [optional] |
| **installed** | **Boolean** | Indicates that template is already installed for the current tenant | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


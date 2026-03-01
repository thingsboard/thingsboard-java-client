
# WidgetTypeInfo

`org.thingsboard.client.model.WidgetTypeInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **WidgetTypeId** | JSON object with the Widget Type Id. Specify this field to update the Widget Type. Referencing non-existing Widget Type Id will cause error. Omit this field to create new Widget Type. | [optional] |
| **createdTime** | **Long** | Timestamp of the Widget Type creation, in milliseconds | [optional] [readonly] |
| **tenantId** | **TenantId** | JSON object with Tenant Id. | [optional] [readonly] |
| **fqn** | **String** | Unique FQN that is used in dashboards as a reference widget type | [optional] [readonly] |
| **name** | **String** | Widget name used in search and UI | [optional] [readonly] |
| **deprecated** | **Boolean** | Whether widget type is deprecated. | [optional] |
| **scada** | **Boolean** | Whether widget type is SCADA symbol. | [optional] |
| **version** | **Long** |  | [optional] |
| **image** | **String** | Base64 encoded widget thumbnail | [optional] [readonly] |
| **description** | **String** | Description of the widget type | [optional] [readonly] |
| **tags** | **List\<String\>** | Tags of the widget type | [optional] |
| **widgetType** | **String** | Type of the widget (timeseries, latest, control, alarm or static) | [optional] [readonly] |
| **bundles** | **List\<WidgetBundleInfo\>** | Bundles | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


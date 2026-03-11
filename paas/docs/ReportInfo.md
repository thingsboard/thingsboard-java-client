
# ReportInfo

`org.thingsboard.client.model.ReportInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **ReportId** |  | [optional] |
| **createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| **tenantId** | **TenantId** |  | |
| **customerId** | **CustomerId** |  | [optional] |
| **templateId** | **ReportTemplateId** |  | |
| **format** | **TbReportFormat** |  | |
| **name** | **String** |  | |
| **userId** | **UserId** |  | |
| **templateInfo** | **EntityInfo** |  | [optional] |
| **customerTitle** | **String** |  | [optional] |
| **userName** | **String** |  | [optional] |
| **ownerId** | **EntityId** | JSON object with Customer or Tenant Id | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


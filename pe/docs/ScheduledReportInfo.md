
# ScheduledReportInfo

`org.thingsboard.client.model.ScheduledReportInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **SchedulerEventId** | JSON object with the scheduler event Id. Specify this field to update the scheduler event. Referencing non-existing scheduler event Id will cause error. Omit this field to create new scheduler event | [optional] |
| **createdTime** | **Long** | Timestamp of the scheduler event creation, in milliseconds | [optional] [readonly] |
| **tenantId** | **TenantId** | JSON object with Tenant Id | [optional] [readonly] |
| **customerId** | **CustomerId** | JSON object with Customer Id | [optional] [readonly] |
| **originatorId** | **EntityId** | JSON object with Originator Id | [optional] [readonly] |
| **name** | **String** | scheduler event name | [optional] |
| **type** | **String** | scheduler event type | [optional] |
| **schedule** | **com.fasterxml.jackson.databind.JsonNode** | a JSON value with schedule time configuration | [optional] |
| **enabled** | **Boolean** | Enable/disable scheduler | [optional] |
| **version** | **Long** |  | [optional] |
| **templateInfo** | **EntityInfo** | Report template info | [optional] [readonly] |
| **customerTitle** | **String** | Customer title | [optional] [readonly] |
| **userName** | **String** | Report user name | [optional] [readonly] |
| **ownerId** | **EntityId** | JSON object with Customer or Tenant Id | [optional] [readonly] |
| **additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional parameters of the scheduler event | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


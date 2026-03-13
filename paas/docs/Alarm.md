
# Alarm

`org.thingsboard.client.model.Alarm`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **tenantId** | **TenantId** | JSON object with Tenant Id | [optional] [readonly] |
| **customerId** | **CustomerId** | JSON object with Customer Id | [optional] [readonly] |
| **type** | **String** | representing type of the Alarm | |
| **originator** | **EntityId** | JSON object with alarm originator id | |
| **severity** | **AlarmSeverity** | Alarm severity | |
| **acknowledged** | **Boolean** | Acknowledged | |
| **cleared** | **Boolean** | Cleared | |
| **assigneeId** | **UserId** | Alarm assignee user id | [optional] |
| **startTs** | **Long** | Timestamp of the alarm start time, in milliseconds | [optional] |
| **endTs** | **Long** | Timestamp of the alarm end time(last time update), in milliseconds | [optional] |
| **ackTs** | **Long** | Timestamp of the alarm acknowledgement, in milliseconds | [optional] |
| **clearTs** | **Long** | Timestamp of the alarm clearing, in milliseconds | [optional] |
| **assignTs** | **Long** | Timestamp of the alarm assignment, in milliseconds | [optional] |
| **details** | **com.fasterxml.jackson.databind.JsonNode** | JSON object with alarm details | [optional] |
| **propagate** | **Boolean** | Propagation flag to specify if alarm should be propagated to parent entities of alarm originator | [optional] |
| **propagateToOwner** | **Boolean** | Propagation flag to specify if alarm should be propagated to the owner (tenant or customer) of alarm originator | [optional] |
| **propagateToOwnerHierarchy** | **Boolean** | Propagation flag to specify if alarm should be propagated to the owner (tenant or customer) and all parent owners in the customer hierarchy | [optional] |
| **propagateToTenant** | **Boolean** | Propagation flag to specify if alarm should be propagated to the tenant entity | [optional] |
| **propagateRelationTypes** | **List\<String\>** | JSON array of relation types that should be used for propagation. By default, 'propagateRelationTypes' array is empty which means that the alarm will be propagated based on any relation type to parent entities. This parameter should be used only in case when 'propagate' parameter is set to true, otherwise, 'propagateRelationTypes' array will be ignored. | [optional] |
| **id** | **AlarmId** | JSON object with the alarm Id. Specify this field to update the alarm. Referencing non-existing alarm Id will cause error. Omit this field to create new alarm. | [optional] |
| **createdTime** | **Long** | Timestamp of the alarm creation, in milliseconds | [optional] [readonly] |
| **name** | **String** | representing type of the Alarm | [readonly] |
| **status** | **AlarmStatus** | status of the Alarm | [readonly] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


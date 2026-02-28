
# DeviceProfileAlarm

`org.thingsboard.client.model.DeviceProfileAlarm`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **String** | String value representing the alarm rule id | [optional] |
| **alarmType** | **String** | String value representing type of the alarm | [optional] |
| **createRules** | **Map\<String, AlarmRule\>** | Complex JSON object representing create alarm rules. The unique create alarm rule can be created for each alarm severity type. There can be 5 create alarm rules configured per a single alarm type. See method implementation notes and AlarmRule model for more details | [optional] |
| **clearRule** | **AlarmRule** | JSON object representing clear alarm rule | [optional] |
| **propagate** | **Boolean** | Propagation flag to specify if alarm should be propagated to parent entities of alarm originator | [optional] |
| **propagateToOwner** | **Boolean** | Propagation flag to specify if alarm should be propagated to the owner (tenant or customer) of alarm originator | [optional] |
| **propagateToOwnerHierarchy** | **Boolean** | Propagation flag to specify if alarm should be propagated to the owner (tenant or customer) and all parent owners in the customer hierarchy | [optional] |
| **propagateToTenant** | **Boolean** | Propagation flag to specify if alarm should be propagated to the tenant entity | [optional] |
| **propagateRelationTypes** | **List\<String\>** | JSON array of relation types that should be used for propagation. By default, 'propagateRelationTypes' array is empty which means that the alarm will be propagated based on any relation type to parent entities. This parameter should be used only in case when 'propagate' parameter is set to true, otherwise, 'propagateRelationTypes' array will be ignored. | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


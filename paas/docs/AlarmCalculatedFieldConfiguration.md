
# AlarmCalculatedFieldConfiguration

`org.thingsboard.client.model.AlarmCalculatedFieldConfiguration`

**Extends:** **CalculatedFieldConfiguration**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **arguments** | **Map\<String, Argument\>** |  | |
| **clearRule** | **AlarmRuleDefinition** |  | [optional] |
| **createRules** | **Map\<String, AlarmRuleDefinition\>** |  | |
| **propagate** | **Boolean** |  | [optional] |
| **propagateRelationTypes** | **List\<String\>** |  | [optional] |
| **propagateToOwner** | **Boolean** |  | [optional] |
| **propagateToOwnerHierarchy** | **Boolean** |  | [optional] |
| **propagateToTenant** | **Boolean** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


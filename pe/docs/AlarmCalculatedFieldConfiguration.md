
# AlarmCalculatedFieldConfiguration

`org.thingsboard.client.model.AlarmCalculatedFieldConfiguration`

**Extends:** **CalculatedFieldConfiguration**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **arguments** | **Map\<String, Argument\>** |  | |
| **createRules** | **Map\<String, AlarmRuleDefinition\>** |  | |
| **clearRule** | **AlarmRuleDefinition** |  | [optional] |
| **propagate** | **Boolean** |  | [optional] |
| **propagateToOwner** | **Boolean** |  | [optional] |
| **propagateToOwnerHierarchy** | **Boolean** |  | [optional] |
| **propagateToTenant** | **Boolean** |  | [optional] |
| **propagateRelationTypes** | **List\<String\>** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


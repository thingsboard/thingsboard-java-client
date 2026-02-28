
# RuleNode

`org.thingsboard.client.model.RuleNode`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **RuleNodeId** | JSON object with the Rule Node Id. Specify this field to update the Rule Node. Referencing non-existing Rule Node Id will cause error. Omit this field to create new rule node. | [optional] |
| **createdTime** | **Long** | Timestamp of the rule node creation, in milliseconds | [optional] [readonly] |
| **ruleChainId** | **RuleChainId** | JSON object with the Rule Chain Id.  | [optional] [readonly] |
| **type** | **String** | Full Java Class Name of the rule node implementation.  | [optional] |
| **name** | **String** | User defined name of the rule node. Used on UI and for logging.  | [optional] |
| **debugMode** | **Boolean** |  | [optional] |
| **debugSettings** | **DebugSettings** | Debug settings object. | [optional] |
| **singletonMode** | **Boolean** | Enable/disable singleton mode.  | [optional] |
| **queueName** | **String** | Queue name.  | [optional] |
| **configurationVersion** | **Integer** | Version of rule node configuration.  | [optional] |
| **_configuration** | **com.fasterxml.jackson.databind.JsonNode** | JSON with the rule node configuration. Structure depends on the rule node implementation. | [optional] |
| **externalId** | **RuleNodeId** |  | [optional] |
| **additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional parameters of the rule node. Contains 'layoutX' and 'layoutY' properties for visualization. | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


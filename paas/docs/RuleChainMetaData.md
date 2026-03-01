
# RuleChainMetaData

`org.thingsboard.client.model.RuleChainMetaData`

A JSON value representing the rule chain metadata.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **ruleChainId** | **RuleChainId** | JSON object with Rule Chain Id. | [readonly] |
| **version** | **Long** | Version of the Rule Chain | [optional] |
| **firstNodeIndex** | **Integer** | Index of the first rule node in the 'nodes' list | |
| **nodes** | **List\<RuleNode\>** | List of rule node JSON objects | |
| **connections** | **List\<NodeConnectionInfo\>** | List of JSON objects that represent connections between rule nodes | |
| **ruleChainConnections** | **List\<RuleChainConnectionInfo\>** | List of JSON objects that represent connections between rule nodes and other rule chains. | |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


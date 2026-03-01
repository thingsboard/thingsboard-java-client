
# RuleChainConnectionInfo

`org.thingsboard.client.model.RuleChainConnectionInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **fromIndex** | **Integer** | Index of rule node in the 'nodes' array of the RuleChainMetaData. Indicates the 'from' part of the connection. | |
| **targetRuleChainId** | **RuleChainId** | JSON object with the Rule Chain Id. | |
| **additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | JSON object with the additional information about the connection. | |
| **type** | **String** | Type of the relation. Typically indicated the result of processing by the 'from' rule node. For example, 'Success' or 'Failure' | |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions


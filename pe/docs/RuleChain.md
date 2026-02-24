

# RuleChain

A JSON value representing the rule chain.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**RuleChainId**](RuleChainId.md) | JSON object with the Rule Chain Id. Specify this field to update the Rule Chain. Referencing non-existing Rule Chain Id will cause error. Omit this field to create new rule chain. |  [optional] |
|**createdTime** | **Long** | Timestamp of the rule chain creation, in milliseconds |  [optional] [readonly] |
|**tenantId** | [**TenantId**](TenantId.md) | JSON object with Tenant Id. |  [readonly] |
|**name** | **String** | Rule Chain name |  |
|**type** | **RuleChainType** | Rule Chain type. &#39;EDGE&#39; rule chains are processing messages on the edge devices only. |  [optional] |
|**firstRuleNodeId** | [**RuleNodeId**](RuleNodeId.md) | JSON object with Rule Chain Id. Pointer to the first rule node that should receive all messages pushed to this rule chain. |  [optional] |
|**root** | **Boolean** | Indicates root rule chain. The root rule chain process messages from all devices and entities by default. User may configure default rule chain per device profile. |  [optional] |
|**debugMode** | **Boolean** | Reserved for future usage. |  [optional] |
|**version** | **Long** |  |  [optional] |
|**_configuration** | **com.fasterxml.jackson.databind.JsonNode** |  |  [optional] |
|**additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** |  |  [optional] |






# RuleChainConnectionInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fromIndex** | **Integer** | Index of rule node in the &#39;nodes&#39; array of the RuleChainMetaData. Indicates the &#39;from&#39; part of the connection. |  |
|**targetRuleChainId** | [**RuleChainId**](RuleChainId.md) | JSON object with the Rule Chain Id. |  |
|**additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | JSON object with the additional information about the connection. |  |
|**type** | **String** | Type of the relation. Typically indicated the result of processing by the &#39;from&#39; rule node. For example, &#39;Success&#39; or &#39;Failure&#39; |  |




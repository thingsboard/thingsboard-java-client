

# RuleChainMetaData

A JSON value representing the rule chain metadata.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ruleChainId** | [**RuleChainId**](RuleChainId.md) | JSON object with Rule Chain Id. |  [readonly] |
|**version** | **Long** | Version of the Rule Chain |  [optional] |
|**firstNodeIndex** | **Integer** | Index of the first rule node in the &#39;nodes&#39; list |  |
|**nodes** | [**List&lt;RuleNode&gt;**](RuleNode.md) | List of rule node JSON objects |  |
|**connections** | [**List&lt;NodeConnectionInfo&gt;**](NodeConnectionInfo.md) | List of JSON objects that represent connections between rule nodes |  |
|**ruleChainConnections** | [**List&lt;RuleChainConnectionInfo&gt;**](RuleChainConnectionInfo.md) | List of JSON objects that represent connections between rule nodes and other rule chains. |  |




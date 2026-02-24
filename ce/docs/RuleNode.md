

# RuleNode


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**RuleNodeId**](RuleNodeId.md) | JSON object with the Rule Node Id. Specify this field to update the Rule Node. Referencing non-existing Rule Node Id will cause error. Omit this field to create new rule node. |  [optional] |
|**createdTime** | **Long** | Timestamp of the rule node creation, in milliseconds |  [optional] [readonly] |
|**ruleChainId** | [**RuleChainId**](RuleChainId.md) | JSON object with the Rule Chain Id.  |  [optional] [readonly] |
|**type** | **String** | Full Java Class Name of the rule node implementation.  |  [optional] |
|**name** | **String** | User defined name of the rule node. Used on UI and for logging.  |  [optional] |
|**debugMode** | **Boolean** |  |  [optional] |
|**debugSettings** | [**DebugSettings**](DebugSettings.md) | Debug settings object. |  [optional] |
|**singletonMode** | **Boolean** | Enable/disable singleton mode.  |  [optional] |
|**queueName** | **String** | Queue name.  |  [optional] |
|**configurationVersion** | **Integer** | Version of rule node configuration.  |  [optional] |
|**_configuration** | **com.fasterxml.jackson.databind.JsonNode** | JSON with the rule node configuration. Structure depends on the rule node implementation. |  [optional] |
|**externalId** | [**RuleNodeId**](RuleNodeId.md) |  |  [optional] |
|**additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional parameters of the rule node. Contains &#39;layoutX&#39; and &#39;layoutY&#39; properties for visualization. |  [optional] |




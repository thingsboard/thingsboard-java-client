

# ComponentDescriptor


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**ComponentDescriptorId**](ComponentDescriptorId.md) | JSON object with the descriptor Id. Specify existing descriptor id to update the descriptor. Referencing non-existing descriptor Id will cause error. Omit this field to create new descriptor. |  [optional] |
|**createdTime** | **Long** | Timestamp of the descriptor creation, in milliseconds |  [optional] [readonly] |
|**type** | **ComponentType** | Type of the Rule Node |  [optional] [readonly] |
|**scope** | **ComponentScope** | Scope of the Rule Node. Always set to &#39;TENANT&#39;, since no rule chains on the &#39;SYSTEM&#39; level yet. |  [optional] [readonly] |
|**clusteringMode** | **ComponentClusteringMode** | Clustering mode of the RuleNode. This mode represents the ability to start Rule Node in multiple microservices. |  [optional] [readonly] |
|**name** | **String** | Name of the Rule Node. Taken from the @RuleNode annotation. |  [optional] [readonly] |
|**clazz** | **String** | Full name of the Java class that implements the Rule Engine Node interface. |  [optional] [readonly] |
|**configurationVersion** | **Integer** | Rule node configuration version. By default, this value is 0. If the rule node is a versioned node, this value might be greater than 0. |  [optional] [readonly] |
|**actions** | **String** | Rule Node Actions. Deprecated. Always null. |  [optional] [readonly] |
|**hasQueueName** | **Boolean** | Indicates that the RuleNode supports queue name configuration. |  [optional] [readonly] |
|**configurationDescriptor** | **com.fasterxml.jackson.databind.JsonNode** |  |  [optional] |




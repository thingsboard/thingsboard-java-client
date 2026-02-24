

# AvailableEntityKeysV2

Contains unique time series and attribute key names discovered from entities matching a query, optionally including a sample value for each key.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entityTypes** | **Set&lt;EntityType&gt;** | Set of entity types found among the matched entities. |  |
|**timeseries** | [**List&lt;KeyInfo&gt;**](KeyInfo.md) |  |  [optional] |
|**attributes** | **Map&lt;String, List&lt;KeyInfo&gt;&gt;** | Map of attribute scope to the list of unique attribute keys available on the matched entities. Only scopes supported by the matched entity types are included. Omitted when attribute keys were not requested or when none of the requested scopes apply to the matched entity types. |  [optional] |




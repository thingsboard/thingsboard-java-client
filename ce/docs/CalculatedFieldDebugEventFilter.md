

# CalculatedFieldDebugEventFilter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**server** | **String** | String value representing the server name, identifier or ip address where the platform is running |  [optional] |
|**isError** | **Boolean** |  |  [optional] |
|**errorStr** | **String** | The case insensitive &#39;contains&#39; filter based on error message |  [optional] |
|**entityId** | **String** | String value representing the entity id in the event body |  [optional] |
|**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) | String value representing the entity type |  [optional] |
|**msgId** | **String** | String value representing the message id in the rule engine |  [optional] |
|**msgType** | **String** | String value representing the message type |  [optional] |
|**arguments** | **String** | String value representing the arguments that were used in the calculation performed |  [optional] |
|**result** | **String** | String value representing the result of a calculation |  [optional] |
|**error** | **Boolean** |  |  [optional] |



## Enum: EntityTypeEnum

| Name | Value |
|---- | -----|
| DEVICE | &quot;DEVICE&quot; |




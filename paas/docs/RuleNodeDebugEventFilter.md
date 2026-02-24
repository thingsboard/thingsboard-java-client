

# RuleNodeDebugEventFilter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**server** | **String** | String value representing the server name, identifier or ip address where the platform is running |  [optional] |
|**isError** | **Boolean** |  |  [optional] |
|**errorStr** | **String** | The case insensitive &#39;contains&#39; filter based on error message |  [optional] |
|**msgDirectionType** | [**MsgDirectionTypeEnum**](#MsgDirectionTypeEnum) | String value representing msg direction type (incoming to entity or outcoming from entity) |  [optional] |
|**entityId** | **String** | String value representing the entity id in the event body (originator of the message) |  [optional] |
|**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) | String value representing the entity type |  [optional] |
|**msgId** | **String** | String value representing the message id in the rule engine |  [optional] |
|**msgType** | **String** | String value representing the message type |  [optional] |
|**relationType** | **String** | String value representing the type of message routing |  [optional] |
|**dataSearch** | **String** | The case insensitive &#39;contains&#39; filter based on data (key and value) for the message. |  [optional] |
|**metadataSearch** | **String** | The case insensitive &#39;contains&#39; filter based on metadata (key and value) for the message. |  [optional] |
|**error** | **Boolean** |  |  [optional] |



## Enum: MsgDirectionTypeEnum

| Name | Value |
|---- | -----|
| IN | &quot;IN&quot; |
| OUT | &quot;OUT&quot; |



## Enum: EntityTypeEnum

| Name | Value |
|---- | -----|
| DEVICE | &quot;DEVICE&quot; |




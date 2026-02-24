

# LifeCycleEventFilter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**server** | **String** | String value representing the server name, identifier or ip address where the platform is running |  [optional] |
|**event** | **String** | String value representing the lifecycle event type |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | String value representing status of the lifecycle event |  [optional] |
|**errorStr** | **String** | The case insensitive &#39;contains&#39; filter based on error message |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;Success&quot; |
| FAILURE | &quot;Failure&quot; |




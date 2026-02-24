

# JobResult

Job execution result

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**successfulCount** | **Integer** | Count of successfully completed tasks |  [optional] |
|**failedCount** | **Integer** | Count of failed tasks |  [optional] |
|**discardedCount** | **Integer** | Count of discarded tasks |  [optional] |
|**totalCount** | **Integer** | Total number of tasks, set when all tasks are submitted |  [optional] |
|**results** | [**List&lt;TaskResult&gt;**](TaskResult.md) |  |  [optional] |
|**generalError** | **String** | General error message if the job failed |  [optional] |
|**startTs** | **Long** | Timestamp of the job start, in milliseconds |  [optional] |
|**finishTs** | **Long** | Timestamp of the job finish, in milliseconds |  [optional] |
|**cancellationTs** | **Long** | Timestamp of the job cancellation, in milliseconds |  [optional] |
|**jobType** | **String** |  |  |



